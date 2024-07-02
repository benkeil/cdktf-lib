package de.benkeil.builder.sfn

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement

fun StepFunctionsBuilder.withPermissions(permission: DataAwsIamPolicyDocumentStatement): StepFunctionsBuilder {
    this.applicationPolicyStatements.add(permission)
    return this
}
