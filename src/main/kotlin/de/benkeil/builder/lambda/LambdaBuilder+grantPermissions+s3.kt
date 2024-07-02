package de.benkeil.builder.lambda

import de.benkeil.builder.s3.S3BucketPermissions
import de.benkeil.builder.toIamActions
import imports.s3bucket.S3Bucket

fun LambdaBuilder.grantPermissions(
    s3Bucket: S3Bucket, vararg permissions: S3BucketPermissions
): LambdaBuilder {
    return grantPermissions(setOf(s3Bucket.s3BucketArnOutput, "${s3Bucket.s3BucketArnOutput}/*"), permissions.toIamActions())
}
