package de.benkeil.builder

fun <T> T.action() where T : Enum<T>, T : IamPermissionScope = "$scope:$name"

fun <T, P> Collection<T>.toIamActions() where T : Permissions<P>, P : Enum<P>, P : IamPermissionScope =
    this.map { it.iamPermissions }.flatten().map { it.action() }

fun <T, P> Array<T>.toIamActions() where T : Permissions<P>, P : Enum<P>, P : IamPermissionScope =
    this.map { it.iamPermissions }.flatten().map { it.action() }

interface IamPermissionScope {
    val scope: String
}

interface Permissions<T> where T : Enum<T>, T : IamPermissionScope {
    val iamPermissions: Collection<T>
}
