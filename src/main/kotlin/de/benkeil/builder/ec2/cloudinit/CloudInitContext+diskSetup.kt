package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonValue

@CloudInitLanguageDsl
class DiskSetupContext {
  var deviceAliases: MutableMap<String, String>? = null
  val diskSetup: MutableMap<String, DiskSetupItem> = mutableMapOf()
  val fsSetup: MutableList<FsSetup> = mutableListOf()

  fun alias(alias: String, path: String) {
    if (deviceAliases == null) {
      deviceAliases = mutableMapOf()
    }
    deviceAliases!![alias] = path
  }

  fun disk(
      aliasOrPath: String,
      tableType: TableType,
      layout: Layout<*>,
      overwrite: Boolean? = null
  ) {
    diskSetup[aliasOrPath] = DiskSetupItem(tableType, layout, overwrite)
  }

  fun filesystem(
      aliasOrPath: String,
      filesystem: String,
      label: String,
      partition: String? = null,
      replaceFs: Boolean? = null
  ) {
    fsSetup.add(
        FsSetup(
            device = aliasOrPath,
            filesystem = filesystem,
            label = label,
            partition = partition,
            replaceFs = replaceFs,
        ))
  }

  fun build(): DiskSetup {
    return DiskSetup(deviceAliases, diskSetup, fsSetup)
  }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
data class DiskSetup(
    val deviceAliases: Map<String, String>?,
    val diskSetup: Map<String, DiskSetupItem>,
    val fsSetup: List<FsSetup>,
)

@JsonInclude(JsonInclude.Include.NON_NULL)
data class DiskSetupItem(
    val tableType: TableType,
    val layout: Layout<*>,
    val overwrite: Boolean?,
)

enum class TableType {
  mbr,
  gpt,
}

@JsonInclude(JsonInclude.Include.NON_NULL)
sealed class Layout<T>(@JsonValue val value: T) {
  data class Partition(val values: List<Int>) : Layout<List<Int>>(values)

  object Remove : Layout<String>("remove")

  object Single : Layout<Boolean>(true)

  object No : Layout<Boolean>(false)
}

@JsonInclude(JsonInclude.Include.NON_NULL)
data class FsSetup(
    val device: String?,
    val filesystem: String,
    val label: String,
    val replaceFs: Boolean?,
    val partition: String?,
)
