package de.benkeil.stack

import com.hashicorp.cdktf.LocalBackend

fun DefaultTerraformStack.withLocalBackend(): DefaultTerraformStack {
  LocalBackend.Builder.create(this).build()
  return this
}
