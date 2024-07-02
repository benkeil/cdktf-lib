package de.benkeil.builder.ec2

import de.benkeil.builder.ec2.cloudinit.UserDataContext

fun Ec2InstanceBuilder.withUserData(block: UserDataContext.() -> Unit): Ec2InstanceBuilder {
  return applyBuilder {
    userData(de.benkeil.builder.ec2.cloudinit.withUserData(scope, computedId, block).rendered)
  }
}
