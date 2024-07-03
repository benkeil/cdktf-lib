package de.benkeil.builder.lambda

import de.benkeil.permissions.GrantableScope
import de.benkeil.permissions.IamPermissionScope
import de.benkeil.permissions.Permissions
import imports.lambda.Lambda

val Lambda.grantScope
  get() =
      object : GrantableScope<LambdaPermissions> {
        override fun arns(): List<String> = listOf(lambdaFunctionArnOutput)
      }

enum class LambdaPermissions(override val iamPermissions: Collection<Iam>) :
    Permissions<LambdaPermissions.Iam> {
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
