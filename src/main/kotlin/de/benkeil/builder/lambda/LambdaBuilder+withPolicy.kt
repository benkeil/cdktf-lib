package de.benkeil.builder.lambda

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy.DataAwsIamPolicy

fun LambdaBuilder.withPolicy(policy: DataAwsIamPolicy): LambdaBuilder {
    policies.add(policy)
    return this
}
