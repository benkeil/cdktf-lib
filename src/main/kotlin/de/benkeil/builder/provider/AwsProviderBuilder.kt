package de.benkeil.builder.provider

import com.hashicorp.cdktf.providers.aws.provider.AwsProvider
import com.hashicorp.cdktf.providers.aws.provider.AwsProviderDefaultTags
import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.Stage
import software.constructs.Construct

class AwsProviderBuilder(
    scope: Construct,
    id: String,
    config: Config,
) :
    ResourceBuilder<AwsProvider, AwsProvider.Builder, Unit, AwsProviderBuilder>(
        scope, id, Unit, AwsProvider.TF_RESOURCE_TYPE, AwsProvider.Builder::create) {
  init {
    builder
        .region(config.awsRegion)
        .defaultTags(
            listOf(
                AwsProviderDefaultTags.builder()
                    .tags(
                        mapOf(
                            "service" to config.service,
                            "environment" to config.stage.toString()))
                    .build()))
  }

  data class Config(
      val service: String,
      val stage: Stage,
      val awsRegion: String,
  )
}
