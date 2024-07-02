package de.benkeil.builder.ec2.cloudinit.serialization

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import de.benkeil.builder.ec2.cloudinit.DefaultFsTabEntry
import de.benkeil.builder.ec2.cloudinit.FsTabEntry

class FsTabEntryJsonSerializer : JsonSerializer<FsTabEntry>() {
  override fun serialize(value: FsTabEntry?, gen: JsonGenerator, serializers: SerializerProvider) {
    if (value == null) {
      gen.writeNull()
      return
    }
    val values =
        arrayOf(
                value.fsSpec,
                value.fsFile,
                value.fsVfsType,
                value.fsMntOps,
                value.fsFreq,
                value.fsPassNo)
            .filterNotNull()
            .toTypedArray()
    gen.writeArray(values, 0, values.size)
  }
}

class DefaultFsTabEntryJsonSerializer : JsonSerializer<DefaultFsTabEntry>() {
  override fun serialize(
      value: DefaultFsTabEntry?,
      gen: JsonGenerator,
      serializers: SerializerProvider
  ) {
    if (value == null) {
      gen.writeNull()
      return
    }
    val values =
        arrayOf(
            value.fsSpec,
            value.fsFile,
            value.fsVfsType,
            value.fsMntOps,
            value.fsFreq,
            value.fsPassNo)
    gen.writeArray(values, 0, values.size)
  }
}
