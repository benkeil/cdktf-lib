package de.benkeil.builder.secretsmanager

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement
import de.benkeil.builder.toIamActions
import imports.lambda.Lambda

fun SecretsmanagerBuilder.grantPermissions(
    lambda: Lambda,
    vararg permissions: SecretsmanagerPermissions
): SecretsmanagerBuilder {
  DataAwsIamPolicyDocumentStatement.builder()
      .effect("Allow")
      .actions(permissions.toIamActions())
      .resources(listOf(lambda.lambdaFunctionArnOutput))
      .build()
  return this
}
