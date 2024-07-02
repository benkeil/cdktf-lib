package de.benkeil.stack

import com.hashicorp.cdktf.Testing
import com.hashicorp.cdktf.providers.aws.s3_bucket.S3Bucket
import de.benkeil.builder.ResourceBuilder
import de.benkeil.builder.fixtures.createTestEnvironment
import io.kotest.core.spec.style.FunSpec
import software.constructs.Construct

class DefaultTerraformStackTest :
    FunSpec({
      val app = Testing.app()
      val env = createTestEnvironment()
      val stack =
          DefaultTerraformStack(app, "test-stack", env) {
            S3BucketBuilder(this, "test-bucket", S3BucketBuilder.Config("test-bucket")).build()
          }

      val synthesized = Testing.synth(stack)

      beforeTest { println(synthesized) }

      test("withDefinition") {}
    })

context(DefaultTerraformStack)
private class S3BucketBuilder(scope: Construct, id: String, config: Config) :
    ResourceBuilder<S3Bucket, S3Bucket.Builder, S3BucketBuilder.Config, S3BucketBuilder>(
        scope,
        id,
        config,
        S3Bucket.TF_RESOURCE_TYPE,
        S3Bucket.Builder::create,
    ) {
  init {
    builder.bucket("${env.service}-${config.name}")
  }

  data class Config(val name: String)
}
