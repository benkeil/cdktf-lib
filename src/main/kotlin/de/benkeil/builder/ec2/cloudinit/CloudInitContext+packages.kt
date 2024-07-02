package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonValue

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Packages(
    val packageRebootIfRequired: Boolean?,
    val packageUpdate: Boolean?,
    val packageUpgrade: Boolean?,
    val packages: List<Package>?,
)

class PackageContext(
    private var packageRebootIfRequired: Boolean? = null,
    private var packageUpdate: Boolean? = null,
    private var packageUpgrade: Boolean? = null,
) {
  private var packages: MutableList<Package>? = null

  fun name(name: String) {
    if (packages == null) {
      packages = mutableListOf()
    }
    packages!!.add(Package.Simple(name))
  }

  fun build(): Packages =
      Packages(
          packageRebootIfRequired = packageRebootIfRequired,
          packageUpdate = packageUpdate,
          packageUpgrade = packageUpgrade,
          packages = packages,
      )
}

sealed class Package {
  data class Simple(@JsonValue val value: String) : Package()
}
