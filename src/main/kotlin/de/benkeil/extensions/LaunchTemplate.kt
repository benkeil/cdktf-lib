package de.benkeil.extensions

import com.hashicorp.cdktf.providers.aws.launch_template.LaunchTemplate
import de.benkeil.builder.ec2.cloudinit.UserDataContext
import software.constructs.Construct

fun LaunchTemplate.Builder.withUserData(
    scope: Construct,
    id: String,
    block: UserDataContext.() -> Unit
): LaunchTemplate.Builder {
  userData(de.benkeil.builder.ec2.cloudinit.withUserData(scope, id, block).rendered)
  return this
}
