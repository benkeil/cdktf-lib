package de.benkeil.builder.sfn

import org.intellij.lang.annotations.Language

fun StepFunctionsBuilder.withDefinition(@Language("json") definition: String): StepFunctionsBuilder {
    return applyBuilder {
        definition(definition)
    }
}
