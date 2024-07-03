package de.benkeil.permissions

interface Grantable<Self> {
  fun <T, P> grant(to: GrantableScope<T>, vararg permissions: T): Self where
  T : Permissions<P>,
  P : Enum<P>,
  P : IamPermissionScope
}

interface GrantableScope<P> {
  fun arns(): List<String>
}
