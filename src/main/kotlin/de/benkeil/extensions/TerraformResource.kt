package de.benkeil.extensions

import com.hashicorp.cdktf.TerraformOutput
import com.hashicorp.cdktf.TerraformResource
import software.constructs.Construct

fun <T : TerraformResource> T.withTerraformOutput(
    scope: Construct,
    sensitive: Boolean = false,
    block: (T) -> Pair<String, Any>
): T {
  val (key, value) = block(this)
  TerraformOutput.Builder.create(scope, key).sensitive(sensitive).value(value).build()
  return this
}
