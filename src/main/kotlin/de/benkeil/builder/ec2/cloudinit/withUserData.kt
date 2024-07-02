package de.benkeil.builder.ec2.cloudinit

import com.hashicorp.cdktf.providers.cloudinit.data_cloudinit_config.DataCloudinitConfig
import software.constructs.Construct

fun withUserData(
    scope: Construct,
    id: String,
    block: UserDataContext.() -> Unit
): DataCloudinitConfig {
  return DataCloudinitConfig.Builder.create(scope, "${id}_UserData")
      .part(UserDataContext().apply(block).build())
      .build()
}
