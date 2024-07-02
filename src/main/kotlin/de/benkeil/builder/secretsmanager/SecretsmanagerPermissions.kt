package de.benkeil.builder.secretsmanager

import de.benkeil.builder.IamPermissionScope
import de.benkeil.builder.Permissions

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
