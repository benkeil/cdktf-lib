package de.benkeil.builder.lambda

import de.benkeil.builder.IamPermissionScope
import de.benkeil.builder.Permissions

enum class LambdaPermissions(override val iamPermissions: Collection<Iam>) : Permissions<LambdaPermissions.Iam> {
    Invoke(
        listOf(
            Iam.InvokeAsync,
            Iam.InvokeFunction,
            Iam.InvokeFunctionUrl,
        ),
    ),
    ;

    enum class Iam(override val scope: String = "lambda") : IamPermissionScope {
        InvokeAsync,
        InvokeFunction,
        InvokeFunctionUrl,
    }
}
