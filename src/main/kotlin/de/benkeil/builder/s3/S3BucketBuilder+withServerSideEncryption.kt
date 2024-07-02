package de.benkeil.builder.s3

fun S3BucketBuilder.withServerSideEncryption(): S3BucketBuilder {
  return applyBuilder {
    serverSideEncryptionConfiguration(
        mapOf(
            "rule" to
                mapOf(
                    "apply_server_side_encryption_by_default" to
                        mapOf("sse_algorithm" to "AES256"))))
  }
}
