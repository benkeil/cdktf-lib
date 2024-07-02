package de.benkeil.builder.s3

fun S3BucketBuilder.withForceDestroy(value: Boolean = true): S3BucketBuilder {
  return applyBuilder { forceDestroy(value) }
}
