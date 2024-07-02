package de.benkeil.builder.lambda

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy.DataAwsIamPolicy
import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement
import de.benkeil.builder.ResourceBuilder
import de.benkeil.stack.DefaultTerraformStack
import imports.lambda.Lambda
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds
import software.constructs.Construct

context(DefaultTerraformStack)
class LambdaBuilder(
    scope: Construct,
    id: String,
    config: Config,
) :
    ResourceBuilder<Lambda, Lambda.Builder, LambdaBuilder.Config, LambdaBuilder>(
        scope,
        id,
        config,
        "lambda",
        Lambda.Builder::create,
    ) {
  internal lateinit var function: Lambda
  internal val environment: MutableMap<String, String> = config.environment.toMutableMap()
  internal val lambdaFunctionName = "${env.stage}--${env.service}--${config.name}"
  internal val policies: MutableCollection<DataAwsIamPolicy> = mutableListOf()
  internal val applicationPolicyStatements: MutableCollection<DataAwsIamPolicyDocumentStatement> =
      mutableListOf()

  companion object {}

  init {
    builder
        .functionName(lambdaFunctionName)
        .createPackage(false)
        .localExistingPackage(config.sourcePath)
        .handler(config.handler)
        .memorySize(config.memorySize)
        .timeout(config.timeout.inWholeSeconds)
        .runtime(config.runtime.value)
        .rolePermissionsBoundary(
            "arn:aws:iam::${env.awsAccountId}:policy/pdh-da-permission-boundary")
        .attachTracingPolicy(true)
        .attachCloudwatchLogsPolicy(true)
        .attachNetworkPolicy(true)
        .tracingMode(config.tracingMode.name)
        .cloudwatchLogsRetentionInDays(config.cloudwatchLogsRetentionInDays)
        .roleName("${env.stage}.${env.service}.${config.name}")
        .rolePath("/application/")
        .createRole(true)
        .architectures(listOf("arm64"))
        .tags(mapOf("function" to lambdaFunctionName))

    withEnvironment(
        mapOf(
            "ENVIRONMENT" to env.stage.toString(),
            "LAMBDA_NAME" to config.name,
            "APPLICATION_NAME" to env.service,
            "APPLICATION_LOG_LEVEL" to config.logLevel.name,
        ))

    addPreBuildAction {
      builder
          .environmentVariables(environment)
          .attachPolicies(policies.isNotEmpty())
          .policies(policies.map { it.arn })
          .attachPolicyStatements(applicationPolicyStatements.isNotEmpty())
          .policyStatements(applicationPolicyStatements)
    }

    addPostBuildAction { function = it }
  }

  data class Config(
      val name: String,
      val handler: String,
      val memorySize: Int = 512,
      val timeout: Duration = 10.seconds,
      val runtime: Runtime,
      val sourcePath: String,
      val environment: Map<String, String> = mutableMapOf(),
      val tracingMode: TracingMode = TracingMode.PassThrough,
      val logLevel: LogLevel = LogLevel.ERROR,
      val cloudwatchLogsRetentionInDays: Int = 14,
  ) {
    companion object
  }

  enum class LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR
  }

  enum class TracingMode {
    PassThrough,
    Active,
  }

  enum class Runtime(val value: String) {
    DOTNET8("dotnet8"),
    DOTNET6("dotnet6"),
    DOTNETCORE1_0("dotnetcore1.0"),
    DOTNETCORE2_0("dotnetcore2.0"),
    DOTNETCORE2_1("dotnetcore2.1"),
    DOTNETCORE3_1("dotnetcore3.1"),
    GO1_X("go1.x"),
    JAVA21("java21"),
    JAVA17("java17"),
    JAVA11("java11"),
    JAVA8("java8"),
    NODEJS20_X("nodejs20.x"),
    NODEJS18_X("nodejs18.x"),
    NODEJS16_X("nodejs16.x"),
    NODEJS4_3("nodejs4.3"),
    NODEJS4_3_EDGE("nodejs4.3-edge"),
    NODEJS6_10("nodejs6.10"),
    NODEJS8_10("nodejs8.10"),
    PROVIDED_AL2("provided.al2"),
    PROVIDED_AL2023("provided.al2023"),
    PYTHON3_12("python3.12"),
    PYTHON3_11("python3.11"),
    PYTHON3_10("python3.10"),
    PYTHON3_9("python3.9"),
    PYTHON3_8("python3.8"),
    RUBY2_5("ruby2.5"),
    RUBY2_7("ruby2.7"),
  }
}
