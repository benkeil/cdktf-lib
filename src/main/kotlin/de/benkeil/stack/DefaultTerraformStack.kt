package de.benkeil.stack

import com.hashicorp.cdktf.TerraformProvider
import com.hashicorp.cdktf.TerraformStack
import de.benkeil.model.DefaultEnvironment
import software.constructs.Construct

open class DefaultTerraformStack(
    scope: Construct,
    val stackId: String,
    override val env: DefaultEnvironment,
    block: (DefaultTerraformStack.() -> Unit)? = null,
) : TerraformStack(scope, stackId), EnvironmentProvider {

  init {
    block?.invoke(this)
  }

  companion object {}

  inline fun <reified T : TerraformProvider> getProvider(alias: String? = null): TerraformProvider {
    return allProviders().first { it is T && it.alias == alias }
  }
}

interface EnvironmentProvider {
  val env: DefaultEnvironment
}
