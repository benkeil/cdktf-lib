package de.benkeil.builder.ec2.cloudinit

data class Ansible(
    val packageName: String?,
    val installMethod: AnsibleInstallMethod?,
    val runUser: String?,
    val pull: AnsiblePull,
    val runAnsible: RunAnsible?,
)

data class AnsiblePull(
    val url: String,
    val playbookName: String,
)

data class RunAnsible(
    val playbookDir: String,
)

enum class AnsibleInstallMethod {
  distro,
  pip
}

class AnsibleContext {
  private var packageName: String? = null
  private var installMethod: AnsibleInstallMethod? = null
  private var runUser: String? = null
  private lateinit var pull: AnsiblePull
  private var runAnsible: RunAnsible? = null

  fun packageName(name: String) {
    packageName = name
  }

  fun installMethod(method: AnsibleInstallMethod) {
    installMethod = method
  }

  fun runUser(user: String) {
    runUser = user
  }

  fun runAnsible(playbookDir: String) {
    runAnsible = RunAnsible(playbookDir = playbookDir)
  }

  fun pull(url: String, playbookName: String) {
    pull = AnsiblePull(url = url, playbookName = playbookName)
  }

  fun build(): Ansible =
      Ansible(
          packageName = packageName,
          installMethod = installMethod,
          runUser = runUser,
          pull = pull,
          runAnsible = runAnsible,
      )
}
