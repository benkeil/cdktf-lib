package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import de.benkeil.builder.ec2.cloudinit.serialization.GroupJsonSerializer

data class Users(val groups: List<Group>?)

@JsonSerialize(using = GroupJsonSerializer::class)
data class Group(val name: String, val members: List<String>?)

data class User(val groups: List<String>?)

class UserContext {
  private var groups: MutableList<Group>? = null

  fun group(name: String, members: List<String>? = null) {
    if (groups == null) {
      groups = mutableListOf()
    }
    groups!!.add(Group(name, members))
  }

  fun build(): Users =
      Users(
          groups = groups,
      )
}
