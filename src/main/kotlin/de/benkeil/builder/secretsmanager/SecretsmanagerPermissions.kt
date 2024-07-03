package de.benkeil.builder.secretsmanager

import de.benkeil.permissions.GrantableScope
import de.benkeil.permissions.IamPermissionScope
import de.benkeil.permissions.Permissions
import imports.secretsmanager.Secretsmanager

val Secretsmanager.grantScope
  get() =
      object : GrantableScope<SecretsmanagerPermissions> {
        override fun arns(): List<String> = listOf(secretArnOutput)
      }

enum class SecretsmanagerPermissions(override val iamPermissions: Collection<Iam>) :
    Permissions<SecretsmanagerPermissions.Iam> {
  Read(
      listOf(
          Iam.GetSecretValue,
          Iam.DescribeSecret,
      )),
  Write(
      listOf(
          Iam.PutSecretValue,
          Iam.UpdateSecretVersionStage,
      )),
  ;

  enum class Iam(override val scope: String = "secretsmanager") : IamPermissionScope {
    GetSecretValue,
    DescribeSecret,
    PutSecretValue,
    UpdateSecretVersionStage,
  }
}
