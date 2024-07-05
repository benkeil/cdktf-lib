package de.benkeil.stack

import de.benkeil.builder.provider.AwsProviderBuilder
import de.benkeil.model.DefaultEnvironment

fun <E : DefaultEnvironment> DefaultTerraformStack<E>.withAwsProvider(
    config: AwsProviderBuilder.Config = env.asAwsProviderBuilderConfig()
): AwsProviderBuilder {
  return AwsProviderBuilder(scope = this, "aws-provider", config)
}

fun <E : DefaultEnvironment> DefaultTerraformStack<E>.withDefaultAwsProvider():
    DefaultTerraformStack<E> {
  withAwsProvider().build()
  return this
}

fun DefaultEnvironment.asAwsProviderBuilderConfig() =
    AwsProviderBuilder.Config(service = service, stage = stage, awsRegion = awsRegion)
