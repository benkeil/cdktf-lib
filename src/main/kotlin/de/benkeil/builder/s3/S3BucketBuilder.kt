package de.benkeil.builder.s3

import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.buildArn
import imports.s3bucket.S3Bucket
import software.constructs.Construct

class S3BucketBuilder(scope: Construct, id: String, config: Config) :
    ResourceBuilder<S3Bucket, S3Bucket.Builder, S3BucketBuilder.Config, S3BucketBuilder>(
        scope,
        id,
        config,
        "S3Bucket",
        S3Bucket.Builder::create,
    ) {
  companion object {
    fun getBucketName(env: DefaultEnvironment, name: String) =
        "${env.awsAccountId}-${env.service}-$name"

    fun getGlobalBucketName(env: DefaultEnvironment, name: String) =
        "${env.awsAccountId}-$name"
  }

  lateinit var bucket: S3Bucket
  val bucketName =
      if (config.global) getGlobalBucketName(config.env, config.name)
      else getBucketName(config.env, config.name)
  val bucketArn = buildArn(config.env, "s3", bucketName)

  init {
    builder.bucket(bucketName)

    addPreBuildAction { withServerSideEncryption() }

    addPostBuildAction { bucket = it }
  }

  data class Config(
      val env: DefaultEnvironment,
      val name: String,
      val global: Boolean = false,
  ) {
    companion object {}
  }
}
