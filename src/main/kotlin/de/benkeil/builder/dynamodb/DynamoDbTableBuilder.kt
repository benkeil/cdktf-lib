package de.benkeil.builder.dynamodb

import com.hashicorp.cdktf.TerraformResourceLifecycle
import com.hashicorp.cdktf.providers.aws.dynamodb_table.DynamodbTable
import com.hashicorp.cdktf.providers.aws.dynamodb_table.DynamodbTableAttribute
import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.DefaultTerraformStack
import software.constructs.Construct

context(DefaultTerraformStack<DefaultEnvironment>)
class DynamoDbTableBuilder(scope: Construct, id: String, config: Config) :
    ResourceBuilder<
        DynamodbTable, DynamodbTable.Builder, DynamoDbTableBuilder.Config, DynamoDbTableBuilder>(
        scope,
        id,
        config,
        DynamodbTable.TF_RESOURCE_TYPE,
        DynamodbTable.Builder::create,
    ) {
  internal lateinit var table: DynamodbTable
  internal val attributesList: MutableList<DynamodbTableAttribute> = mutableListOf()

  init {
    builder
        .name("${env.service}.${config.name}")
        .billingMode(config.billingMode.name)
        .lifecycle(TerraformResourceLifecycle.builder().preventDestroy(true).build())

    addPreBuildAction { builder.attribute(attributesList) }

    addPostBuildAction { table = it }
  }

  data class Config(
      val name: String,
      val billingMode: BillingMode = BillingMode.PAY_PER_REQUEST,
  )

  enum class AttributeType(val type: String) {
    STRING("S"),
    NUMBER("N"),
    BINARY("B")
  }

  enum class BillingMode {
    PAY_PER_REQUEST,
    PROVISIONED,
  }
}
