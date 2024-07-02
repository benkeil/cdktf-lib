package de.benkeil.builder.ec2.cloudinit.serialization

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import de.benkeil.builder.ec2.cloudinit.Group

class GroupJsonSerializer : JsonSerializer<Group>() {
  override fun serialize(value: Group?, gen: JsonGenerator, serializers: SerializerProvider) {
    if (value == null) {
      gen.writeNull()
      return
    }
    if (value.members == null) {
      gen.writeString(value.name)
    } else {
      gen.writeObject(mapOf(value.name to value.members))
    }
  }
}
