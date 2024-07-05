package de.benkeil.stack

import com.hashicorp.cdktf.LocalBackend
import de.benkeil.model.DefaultEnvironment

fun <E : DefaultEnvironment> DefaultTerraformStack<E>.withLocalBackend(): DefaultTerraformStack<E> {
  LocalBackend.Builder.create(this).build()
  return this
}
