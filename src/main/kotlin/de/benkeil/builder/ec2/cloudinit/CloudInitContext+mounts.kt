package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import de.benkeil.builder.ec2.cloudinit.serialization.DefaultFsTabEntryJsonSerializer
import de.benkeil.builder.ec2.cloudinit.serialization.FsTabEntryJsonSerializer

data class Mounts(
    val mounts: MutableList<FsTabEntry>?,
    val mountDefaultFields: DefaultFsTabEntry?,
)

class MountsContext {
  private var mounts: MutableList<FsTabEntry>? = null
  private var defaults: DefaultFsTabEntry? = null

  fun default(
      fsVfsType: String,
      fsMntOps: String,
      fsReq: String,
      fsPassNo: String,
  ) {
    defaults =
        DefaultFsTabEntry(
            fsSpec = null,
            fsFile = null,
            fsVfsType = fsVfsType,
            fsMntOps = fsMntOps,
            fsFreq = fsReq,
            fsPassNo = fsPassNo,
        )
  }

  fun mount(
      aliasOrPath: String,
      fsFile: String,
      fsVfsType: String? = null,
      fsMntOps: String? = null,
      fsFreq: String? = null,
      fsPassNo: String? = null,
  ) {
    if (mounts == null) {
      mounts = mutableListOf()
    }
    mounts!!.add(
        FsTabEntry(
            fsSpec = aliasOrPath,
            fsFile = fsFile,
            fsVfsType = fsVfsType,
            fsMntOps = fsMntOps,
            fsFreq = fsFreq,
            fsPassNo = fsPassNo,
        ))
  }

  fun build(): Mounts = Mounts(mounts, defaults)
}

@JsonSerialize(using = FsTabEntryJsonSerializer::class)
data class FsTabEntry(
    val fsSpec: String?,
    val fsFile: String?,
    val fsVfsType: String?,
    val fsMntOps: String?,
    val fsFreq: String?,
    val fsPassNo: String?,
)

@JsonSerialize(using = DefaultFsTabEntryJsonSerializer::class)
data class DefaultFsTabEntry(
    val fsSpec: String?,
    val fsFile: String?,
    val fsVfsType: String?,
    val fsMntOps: String?,
    val fsFreq: String?,
    val fsPassNo: String?,
)
