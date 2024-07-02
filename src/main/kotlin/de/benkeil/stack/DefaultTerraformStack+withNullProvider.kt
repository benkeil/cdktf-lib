package de.benkeil.stack

import com.hashicorp.cdktf.providers.null_provider.provider.NullProvider

fun DefaultTerraformStack.withNullProvider(): DefaultTerraformStack {
  NullProvider(this, "null-provider")
  return this
}
