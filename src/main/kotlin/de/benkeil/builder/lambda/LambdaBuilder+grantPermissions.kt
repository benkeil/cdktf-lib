package de.benkeil.builder.lambda

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement

fun LambdaBuilder.grantPermissions(
    arns: Collection<String>,
    vararg permissions: String,
): LambdaBuilder {
  return grantPermissions(arns, permissions.toList())
}

fun LambdaBuilder.grantPermissions(
    arns: Collection<String>,
    permissions: Collection<String>,
): LambdaBuilder {
  return withPermissions(
      DataAwsIamPolicyDocumentStatement.builder()
          .effect("Allow")
          .actions(permissions.toList())
          .resources(arns.toList())
          .build())
}
