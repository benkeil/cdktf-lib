package de.benkeil.stack

import com.hashicorp.cdktf.S3Backend

fun DefaultTerraformStack.withS3Backend(): DefaultTerraformStack {
  S3Backend.Builder.create(this)
      .key("${env.service}-$stackId.tfstate")
      .bucket("${env.awsAccountId}-terraform-state")
      .region(env.awsRegion)
      .dynamodbTable("terraform-state-lock")
      .encrypt(true)
      .build()
  return this
}
