package de.benkeil.builder.sfn

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocumentStatement

fun StepFunctionsBuilder.grantPermissions(
    arns: Collection<String>,
    permissions: Collection<String>
): StepFunctionsBuilder {
    return withPermissions(
        DataAwsIamPolicyDocumentStatement.builder()
            .effect("Allow")
            .actions(permissions.toList())
            .resources(arns.toList())
            .build()
    )
}
