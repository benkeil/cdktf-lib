package de.benkeil.builder.lambda

import com.hashicorp.cdktf.providers.aws.lambda_event_source_mapping.LambdaEventSourceMapping
import com.hashicorp.cdktf.providers.aws.lambda_event_source_mapping.LambdaEventSourceMappingSelfManagedEventSource
import com.hashicorp.cdktf.providers.aws.lambda_event_source_mapping.LambdaEventSourceMappingSelfManagedKafkaEventSourceConfig
import com.hashicorp.cdktf.providers.aws.lambda_event_source_mapping.LambdaEventSourceMappingSourceAccessConfiguration
import de.benkeil.builder.secretsmanager.SecretsmanagerBuilder
import de.benkeil.builder.secretsmanager.SecretsmanagerPermissions
import de.benkeil.builder.secretsmanager.fromData
import de.benkeil.builder.secretsmanager.grantScope
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.DefaultTerraformStack

context(DefaultTerraformStack<DefaultEnvironment>)
fun TriggerContext.kafka(
    id: String,
    name: String,
    secret: KafkaSecret,
    readProperties: KafkaReadProperties?,
    writeProperties: KafkaWriteProperties?,
) {
  with(builder) {
    val secretsmanager =
        SecretsmanagerBuilder(
                scope,
                id,
                SecretsmanagerBuilder.Config.fromData(
                    name = "${config.name}/$name",
                    description = "Kafka access to ${secret.server}",
                    data = secret,
                ))
            .build()

    grant(secretsmanager.grantScope, SecretsmanagerPermissions.Read)

    if (readProperties != null) {
      addPostBuildAction {
        LambdaEventSourceMapping.Builder.create(
                scope, "${computedId}_LambdaEventSourceMapping_${id}")
            .dependsOn(listOf(function))
            .functionName(function.functionName)
            .topics(readProperties.topics.toList())
            .startingPosition(readProperties.startingPosition.name)
            .selfManagedEventSource(
                LambdaEventSourceMappingSelfManagedEventSource.builder()
                    .endpoints(mapOf("KAFKA_BOOTSTRAP_SERVERS" to secret.server))
                    .build())
            .selfManagedKafkaEventSourceConfig(
                LambdaEventSourceMappingSelfManagedKafkaEventSourceConfig.builder()
                    .consumerGroupId(readProperties.consumerGroupId)
                    .build())
            .batchSize(readProperties.batchSize)
            .maximumBatchingWindowInSeconds(readProperties.maximumBatchingWindowInSeconds)
            .sourceAccessConfiguration(
                listOf(
                    LambdaEventSourceMappingSourceAccessConfiguration.builder()
                        .type("BASIC_AUTH")
                        .uri(secretsmanager.secretArnOutput)
                        .build()))
            .enabled(readProperties.enabled)
            .build()
      }
    }

    if (writeProperties != null) {
      withEnvironment("KAFKA_SECRET_ARN" to secretsmanager.secretArnOutput)
    }
  }
}

class KafkaWriteProperties

data class KafkaReadProperties(
    val topics: Collection<String>,
    val startingPosition: KafkaStartingPosition = KafkaStartingPosition.LATEST,
    val batchSize: Int = 25,
    val maximumBatchingWindowInSeconds: Int = 3,
    val enabled: Boolean = true,
    val consumerGroupId: String? = null,
)

enum class KafkaStartingPosition {
  LATEST,
  TRIM_HORIZON,
}

data class KafkaSecret(
    val username: String,
    val password: String,
    val server: String,
)
