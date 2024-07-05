package de.benkeil.extensions

import com.hashicorp.cdktf.TerraformModule
import com.hashicorp.cdktf.TerraformOutput
import software.constructs.Construct

fun <T : TerraformModule> T.withTerraformOutput(
    scope: Construct,
    block: (T) -> Pair<String, Any>
): T {
  val (key, value) = block(this)
  TerraformOutput.Builder.create(scope, key).value(value).build()
  return this
}
