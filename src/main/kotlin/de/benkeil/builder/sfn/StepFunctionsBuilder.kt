package de.benkeil.builder.sfn

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement
import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.DefaultTerraformStack
import imports.step_functions.StepFunctions
import software.constructs.Construct

context(DefaultTerraformStack<DefaultEnvironment>)
class StepFunctionsBuilder(scope: Construct, id: String, config: Config) :
    ResourceBuilder<
        StepFunctions, StepFunctions.Builder, StepFunctionsBuilder.Config, StepFunctionsBuilder>(
        scope,
        id,
        config,
        "StepFunctions",
        StepFunctions.Builder::create,
    ) {
  internal val applicationPolicyStatements: MutableCollection<DataAwsIamPolicyDocumentStatement> =
      mutableListOf()
  internal val serviceIntegrations: MutableMap<String, Map<String, Any>> = mutableMapOf()
  internal lateinit var function: StepFunctions

  init {
    builder
        .name("${env.stage}--${env.service}--${config.name}")
        .type(config.type.name)
        .rolePermissionsBoundary(
            "arn:aws:iam::${env.awsAccountId}:policy/pdh-da-permission-boundary")
        .createRole(true)
        .roleName("${env.stage}.${env.service}.${config.name}")
        .rolePath("/application/")

    if (config.type == Config.Type.STANDARD) {
      builder.loggingConfiguration(
          mapOf(
              "include_execution_data" to "true",
              "level" to config.loggingLevel.name,
          ))
    }

    addPreBuildAction {
      builder
          .attachPolicyStatements(applicationPolicyStatements.isNotEmpty())
          .policyStatements(applicationPolicyStatements)
          .serviceIntegrations(serviceIntegrations)
    }
    addPostBuildAction { function = it }
  }

  data class Config(
      val type: Type,
      val name: String,
      val loggingLevel: LoggingLevel = LoggingLevel.ALL,
  ) {
    companion object {}

    enum class Type {
      STANDARD,
      EXPRESS
    }

    enum class LoggingLevel {
      ALL,
      ERROR,
      FATAL,
      OFF,
    }
  }
}
