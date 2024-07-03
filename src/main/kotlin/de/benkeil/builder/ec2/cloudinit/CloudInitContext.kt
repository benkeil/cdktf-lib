package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonUnwrapped

@JsonInclude(JsonInclude.Include.NON_NULL)
data class CloudInit(
    val packageUpgrade: Boolean?,
    val writeFiles: List<WriteFile>?,
    @JsonUnwrapped val diskSetup: DiskSetup?,
    @JsonUnwrapped val mounts: Mounts?,
    @JsonUnwrapped val packages: Packages?,
    @JsonUnwrapped val users: Users?,
    val systemInfo: SystemInfo?,
    val runcmd: List<String>?,
    val ansible: Ansible?
)

@CloudInitLanguageDsl
class CloudInitContext {
  private var packageUpgrade: Boolean? = null
  private var writeFiles: List<WriteFile>? = null
  private var diskSetup: DiskSetup? = null
  private var mounts: Mounts? = null
  private var packages: Packages? = null
  private var users: Users? = null
  private var systemInfo: SystemInfo? = null
  private var runcmd: MutableList<String>? = null
  private var ansible: Ansible? = null

  fun packageUpgrade(value: Boolean = true): CloudInitContext {
    packageUpgrade = value
    return this
  }

  fun writeFiles(block: WriteFilesContext.() -> Unit) {
    writeFiles = WriteFilesContext().apply(block).build()
  }

  fun diskSetup(block: DiskSetupContext.() -> Unit) {
    diskSetup = DiskSetupContext().apply(block).build()
  }

  fun mounts(block: MountsContext.() -> Unit) {
    mounts = MountsContext().apply(block).build()
  }

  fun users(block: UserContext.() -> Unit) {
    users = UserContext().apply(block).build()
  }

  fun systemInfo(block: SystemInfoContext.() -> Unit) {
    systemInfo = SystemInfoContext().apply(block).build()
  }

  fun ansible(block: AnsibleContext.() -> Unit) {
    ansible = AnsibleContext().apply(block).build()
  }

  fun packages(
      update: Boolean? = null,
      upgrade: Boolean? = null,
      rebootIfRequired: Boolean? = null,
      block: PackageContext.() -> Unit
  ) {
    packages =
        PackageContext(
                packageRebootIfRequired = rebootIfRequired,
                packageUpdate = update,
                packageUpgrade = upgrade,
            )
            .apply(block)
            .build()
  }

  fun runCmd(cmd: String) {
    if (runcmd == null) {
      runcmd = mutableListOf()
    }
    runcmd!!.add(cmd)
  }

  fun build(): CloudInit {
    return CloudInit(
        packageUpgrade = packageUpgrade,
        writeFiles = writeFiles,
        diskSetup = diskSetup,
        mounts = mounts,
        packages = packages,
        users = users,
        systemInfo = systemInfo,
        runcmd = runcmd,
        ansible = ansible,
    )
  }
}
