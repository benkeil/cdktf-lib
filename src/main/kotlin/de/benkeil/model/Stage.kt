package de.benkeil.model

import de.benkeil.extensions.toKebabCase

enum class Stage {
  LIVE,
  DEV,
  TEST,
  ;

  override fun toString(): String = name.toKebabCase()

  companion object {
    fun fromEnv(): Stage? {
      val environment = System.getenv()["ENVIRONMENT"]
      return entries.firstOrNull { it.name == environment?.uppercase() }
    }
  }
}
