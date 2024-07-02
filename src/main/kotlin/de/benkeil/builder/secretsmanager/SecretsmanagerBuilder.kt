package de.benkeil.builder.secretsmanager

import de.benkeil.builder.ResourceBuilder
import de.benkeil.stack.DefaultTerraformStack
import imports.secretsmanager.Secretsmanager
import software.constructs.Construct

context(DefaultTerraformStack)
class SecretsmanagerBuilder(
    scope: Construct,
    id: String,
    config: Config,
) :
    ResourceBuilder<
        Secretsmanager,
        Secretsmanager.Builder,
        SecretsmanagerBuilder.Config,
        SecretsmanagerBuilder>(
        scope,
        id,
        config,
        "Secretsmanager",
        Secretsmanager.Builder::create,
    ) {
  init {
    builder
        .name("${env.service}.${config.name}")
        .description(config.description)
        .recoveryWindowInDays(7)
        .secretString(config.secretString)
  }

  data class Config(
      val name: String,
      val description: String,
      val secretString: String
  ) {
    companion object
  }
}
