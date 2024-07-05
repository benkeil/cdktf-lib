package de.benkeil.stack

import com.hashicorp.cdktf.providers.null_provider.provider.NullProvider
import de.benkeil.model.DefaultEnvironment

fun <E : DefaultEnvironment> DefaultTerraformStack<E>.withNullProvider(): DefaultTerraformStack<E> {
  NullProvider(this, "null-provider")
  return this
}
