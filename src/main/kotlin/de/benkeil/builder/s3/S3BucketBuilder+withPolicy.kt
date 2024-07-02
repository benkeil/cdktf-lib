package de.benkeil.builder.s3

import com.hashicorp.cdktf.providers.aws.data_aws_iam_policy_document.DataAwsIamPolicyDocument

fun S3BucketBuilder.withPolicy(
    block: S3BucketBuilder.() -> DataAwsIamPolicyDocument
): S3BucketBuilder {
  return applyBuilder { policy(block(this@withPolicy).json) }
}
