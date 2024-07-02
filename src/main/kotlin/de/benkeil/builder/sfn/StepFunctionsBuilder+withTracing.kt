package de.benkeil.builder.sfn

fun StepFunctionsBuilder.withTracing(enable: Boolean = true): StepFunctionsBuilder {
    serviceIntegrations["xray"] = mapOf("xray" to enable)
    return this
}
