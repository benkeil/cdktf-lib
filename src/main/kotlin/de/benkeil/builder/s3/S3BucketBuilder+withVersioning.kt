package de.benkeil.builder.s3

fun S3BucketBuilder.withVersioning(): S3BucketBuilder {
  return applyBuilder { versioning(mapOf("enabled" to "true")) }
}
