package de.benkeil.builder.ec2.cloudinit

data class SystemInfo(
    val defaultUser: UserContainer.User?,
)

class SystemInfoContext {
  private var defaultUser: UserContainer.User? = null

  fun defaultUser(
      groups: List<String>? = null,
      sudo: String? = null,
      shell: String? = null,
      sshAuthorizedKeys: Collection<String>? = null,
  ) {
    defaultUser =
        UserContainer.User(
            name = null,
            groups = groups,
            sudo = sudo,
            shell = shell,
            sshAuthorizedKeys = sshAuthorizedKeys,
        )
  }

  fun build(): SystemInfo = SystemInfo(defaultUser = defaultUser)
}
