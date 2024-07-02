package de.benkeil.extensions

import com.hashicorp.cdktf.TerraformOutput
import com.hashicorp.cdktf.TerraformResource
import software.constructs.Construct

fun <T : TerraformResource> T.withTerraformOutput(
    scope: Construct,
    block: (T) -> Pair<String, String>
): T {
  val (key, value) = block(this)
  TerraformOutput.Builder.create(scope, key).value(value).build()
  return this
}
