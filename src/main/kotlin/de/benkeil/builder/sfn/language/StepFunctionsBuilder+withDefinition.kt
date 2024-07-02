package de.benkeil.builder.sfn.language

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import de.benkeil.builder.sfn.StepFunctionsBuilder
import de.benkeil.builder.sfn.withDefinition

private val objectMapper =
    jacksonObjectMapper()
        .setSerializationInclusion(JsonInclude.Include.NON_NULL)
        .setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE)

private val debugObjectMapper = objectMapper.copy().enable(SerializationFeature.INDENT_OUTPUT)

@StateMachineBuilder
fun StepFunctionsBuilder.withDefinition(
    comment: String,
    block: DefinitionContext.() -> Unit,
): StepFunctionsBuilder {
  val definition = DefinitionContext(comment).apply(block).build()
  withDefinition(objectMapper.writeValueAsString(definition))
  if (System.getProperty("DEBUG") == "true") {
    println(debugObjectMapper.writeValueAsString(definition))
  }
  return this
}

@RequiresOptIn(
    message = "This feature is experimental. It may be changed in the future without notice.")
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class StateMachineBuilder
