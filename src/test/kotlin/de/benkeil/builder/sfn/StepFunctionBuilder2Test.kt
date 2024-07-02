package de.benkeil.builder.sfn

import com.hashicorp.cdktf.Testing
import de.benkeil.builder.fixtures.createTestEnvironment
import de.benkeil.builder.lambda.LambdaBuilder
import de.benkeil.builder.lambda.kotlin
import de.benkeil.builder.sfn.language.StateMachineBuilder
import de.benkeil.builder.sfn.language.withDefinition
import de.benkeil.stack.DefaultTerraformStack
import io.kotest.core.spec.style.FunSpec

@OptIn(StateMachineBuilder::class, StateMachineBuilder::class)
class StepFunctionBuilder2Test :
    FunSpec({
      val app = Testing.app()
      val env = createTestEnvironment()

      val stack =
          DefaultTerraformStack(app, "test", env) {
            val uploadFileLambda =
                LambdaBuilder(this, "Upload", LambdaBuilder.Config.kotlin(name = "upload")).build()

            StepFunctionsBuilder(
                    this,
                    "Example",
                    StepFunctionsBuilder.Config.standard(name = "example"),
                )
                .withDefinition("makes funny stuff") {
                  val errorCase = strand {
                    task("Cancel Upload", "arn")
                    fail("Upload Failed") { static("Error", "Upload failed") }
                  }

                  start {
                    task("Invoke", "arn") {
                      catch(listOf("FileUploadError"), errorCase)
                      catch(listOf("OtherError")) { task("Cancel", "arn") }
                      catch(listOf("Error"), { resultPath("$.error") }, { task("Cancel2", "arn") })
                    }
                    map("Map") {
                      inline {
                        itemProcessor {
                          task("Process", "arn")
                          fail("Process Failed") { static("Error", "Process failed") }
                        }
                      }
                    }
                    choice("Is successful?") {
                      and(
                          {
                            stringEquals("$.status", "success")
                            stringEquals("$.foo", "bar")
                          },
                          { succeed("Ohhhhh yeah") })
                      or(
                          {
                            stringEquals("$.status", "success")
                            stringEquals("$.foo", "bar")
                          },
                          { fail("Test Failed") { static("Error", "Upload failed") } })
                      not({ stringEquals("$.status", "success") }, errorCase)
                      default { task("Default", "arn") }
                    }
                  }
                }
                .build()
          }

      val synthesized = Testing.synth(stack)

      beforeTest { println(synthesized) }

      test("withDefinition") {}
    })
