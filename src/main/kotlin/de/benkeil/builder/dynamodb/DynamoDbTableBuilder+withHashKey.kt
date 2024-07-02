package de.benkeil.builder.dynamodb

fun DynamoDbTableBuilder.withHashKey(
    name: String,
    type: DynamoDbTableBuilder.AttributeType
): DynamoDbTableBuilder {
  builder.hashKey(name)
  withAttribute(name, type)
  return this
}
