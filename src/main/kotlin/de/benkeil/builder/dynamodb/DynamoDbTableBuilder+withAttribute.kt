package de.benkeil.builder.dynamodb

import com.hashicorp.cdktf.providers.aws.dynamodb_table.DynamodbTableAttribute

fun DynamoDbTableBuilder.withAttribute(
    name: String,
    type: DynamoDbTableBuilder.AttributeType
): DynamoDbTableBuilder {
  this.attributesList.add(DynamodbTableAttribute.builder().name(name).type(type.type).build())
  return this
}
