package de.benkeil.builder.lambda

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement

fun LambdaBuilder.withPermissions(permission: DataAwsIamPolicyDocumentStatement): LambdaBuilder {
    this.applicationPolicyStatements.add(permission)
    return this
}
