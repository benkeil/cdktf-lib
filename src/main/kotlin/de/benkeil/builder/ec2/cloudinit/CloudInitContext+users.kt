package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import de.benkeil.builder.ec2.cloudinit.serialization.GroupJsonSerializer

data class Users(val groups: List<Group>?, val users: Collection<UserContainer>?)

@JsonSerialize(using = GroupJsonSerializer::class)
data class Group(val name: String, val members: List<String>?)

sealed interface UserContainer {
  data class Default(@JsonValue val value: String = "default") : UserContainer

  //  data class New(@JsonValue val container: User) : UserContainer()

  @JsonInclude(JsonInclude.Include.NON_NULL)
  data class User(
      val name: String?,
      val groups: List<String>?,
      val sudo: String?,
      val shell: String?,
      val sshAuthorizedKeys: Collection<String>?,
  ) : UserContainer
}

class UserContext {
  private var users: MutableList<UserContainer>? = null
  private var groups: MutableList<Group>? = null

  fun defaultUser() {
    if (groups == null) {
      users = mutableListOf()
    }
    users!!.add(UserContainer.Default())
  }

  fun user(
      name: String,
      groups: List<String>? = null,
      sudo: String? = "ALL=(ALL) NOPASSWD:ALL",
      shell: String? = "/bin/bash",
      sshAuthorizedKeys: Collection<String>? = null,
  ) {
    if (users == null) {
      users = mutableListOf()
    }
    users!!.add(
        UserContainer.User(
            name = name,
            groups = groups,
            sudo = sudo,
            shell = shell,
            sshAuthorizedKeys = sshAuthorizedKeys,
        ))
  }

  fun group(name: String, members: List<String>? = null) {
    if (groups == null) {
      groups = mutableListOf()
    }
    groups!!.add(Group(name, members))
  }

  fun build(): Users =
      Users(
          groups = groups,
          users = users,
      )
}
