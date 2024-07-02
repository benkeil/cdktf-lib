package de.benkeil.builder.sfn.language.tasks.helper

import de.benkeil.builder.sfn.language.StrandContext
import de.benkeil.builder.sfn.language.states.Pass

fun StrandContext.bodyToJsonString(id: String): Pass {
    return pass(id) {
        parameters {
            path("JsonString") { jsonToString("$") }
        }
        outputPath("$.JsonString")
    }
}
