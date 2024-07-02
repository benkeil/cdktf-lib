package de.benkeil.builder.ec2.cloudinit

data class SystemInfo(
    val defaultUser: User?,
)

class SystemInfoContext {
  private var defaultUser: User? = null

  fun defaultUser(value: User) {
    defaultUser = value
  }

  fun build(): SystemInfo = SystemInfo(defaultUser = defaultUser)
}
