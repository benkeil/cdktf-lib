package de.benkeil.builder.sfn

import com.hashicorp.cdktf.Testing
import de.benkeil.builder.fixtures.createTestEnvironment
import de.benkeil.builder.lambda.LambdaBuilder
import de.benkeil.builder.lambda.kotlin
import de.benkeil.builder.s3.S3BucketBuilder
import de.benkeil.builder.sfn.language.StateMachineBuilder
import de.benkeil.builder.sfn.language.states.States
import de.benkeil.builder.sfn.language.tasks.athena.athenaStartQueryExecutionSync
import de.benkeil.builder.sfn.language.tasks.lambda.lambdaInvokeFunction
import de.benkeil.builder.sfn.language.tasks.s3.s3ListObjectsV2
import de.benkeil.builder.sfn.language.withDefinition
import de.benkeil.stack.DefaultTerraformStack
import io.kotest.core.spec.style.FunSpec
import kotlin.time.Duration.Companion.seconds

@OptIn(StateMachineBuilder::class)
class StepFunctionBuilderTest :
    FunSpec({
      val app = Testing.app()
      val env = createTestEnvironment()

      val stack =
          DefaultTerraformStack(app, "test", env) {
            val bucket = S3BucketBuilder(this, "Bucket", S3BucketBuilder.Config("bucket")).build()

            val createQueryString =
                LambdaBuilder(
                        this,
                        "CreateQueryString",
                        LambdaBuilder.Config.kotlin(name = "create-query-string"))
                    .build()

            val createBatchLambda =
                LambdaBuilder(
                        this, "CreateBatch", LambdaBuilder.Config.kotlin(name = "create-batch"))
                    .build()

            val uploadFileLambda =
                LambdaBuilder(this, "Upload", LambdaBuilder.Config.kotlin(name = "upload")).build()

            val completeBatchLambda =
                LambdaBuilder(
                        this, "CompleteBatch", LambdaBuilder.Config.kotlin(name = "complete-batch"))
                    .build()

            StepFunctionsBuilder(
                    this, "Example", StepFunctionsBuilder.Config.standard(name = "example"))
                .withDefinition("makes funny stuff") {
                  start {
                    lambdaInvokeFunction("Create QueryString", createQueryString) {
                      parameters {
                        static("ExportName", "adobe.analytics-exporter")
                        static("QueryResultBucket", bucket.s3BucketIdOutput)
                        static("QueryString", "SELECT * FROM variations")
                      }
                      retry(
                          listOf(
                              "Lambda.ServiceException",
                              "Lambda.AWSLambdaException",
                              "Lambda.SdkClientException",
                              "Lambda.TooManyRequestsException",
                          ),
                          interval = 1.seconds,
                          maxAttempts = 3,
                          backoffRate = 2.0)
                    }
                    athenaStartQueryExecutionSync("Athena StartQueryExecution") {
                      parameters {
                        path("QueryString", "$.QueryString")
                        static("WorkGroup", "my-workgroup")
                        map("QueryExecutionContext") { static("Database", "my-database") }
                      }
                      resultPath("$.QueryExecution")
                      retry(
                          listOf(States.ALL),
                          interval = 30.seconds,
                          maxAttempts = 3,
                      )
                    }
                    s3ListObjectsV2("ListObjectsV2") {
                      parameters {
                        static("Bucket", bucket.s3BucketIdOutput)
                        path("Prefix", "$.QueryResultKey")
                        path("ContinuationToken") { jsonToString("$.Body") }
                      }
                    }
                    lambdaInvokeFunction("Create Batch", createBatchLambda) {
                      resultPath("$.CreateBatchResult")
                    }
                    map("Map") {
                      inline {
                        itemsPath("$.Contents")
                        itemProcessor { lambdaInvokeFunction("Upload File", uploadFileLambda) }
                        itemSelector {
                          itemValue("Value")
                          itemValue("BatchId", "BatchId.id")
                        }
                      }
                    }
                    lambdaInvokeFunction("Complete Batch", completeBatchLambda)
                  }
                }
                .build()
          }

      val synthesized = Testing.synth(stack)

      beforeTest { println(synthesized) }

      test("withDefinition") {}
    })
