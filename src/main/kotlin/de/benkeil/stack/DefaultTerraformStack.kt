package de.benkeil.stack

import com.hashicorp.cdktf.TerraformProvider
import com.hashicorp.cdktf.TerraformStack
import de.benkeil.model.DefaultEnvironment
import software.constructs.Construct

open class DefaultTerraformStack<out E : DefaultEnvironment>(
    scope: Construct,
    val stackId: String,
    val env: E,
    block: (DefaultTerraformStack<E>.() -> Unit)? = null,
) : TerraformStack(scope, stackId) {

  init {
    block?.invoke(this)
  }

  companion object {}

  inline fun <reified T : TerraformProvider> getProvider(alias: String? = null): TerraformProvider {
    return allProviders().first { it is T && it.alias == alias }
  }
}
