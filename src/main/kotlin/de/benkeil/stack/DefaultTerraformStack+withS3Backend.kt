package de.benkeil.stack

import com.hashicorp.cdktf.S3Backend
import de.benkeil.model.DefaultEnvironment

fun <E : DefaultEnvironment> DefaultTerraformStack<E>.withS3Backend(): DefaultTerraformStack<E> {
  S3Backend.Builder.create(this)
      .key("${env.service}-$stackId.tfstate")
      .bucket("${env.awsAccountId}-terraform-state")
      .region(env.awsRegion)
      .dynamodbTable("terraform-state-lock")
      .encrypt(true)
      .build()
  return this
}
