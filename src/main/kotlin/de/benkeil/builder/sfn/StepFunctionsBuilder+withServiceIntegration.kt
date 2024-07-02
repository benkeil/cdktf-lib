package de.benkeil.builder.sfn

fun StepFunctionsBuilder.withServiceIntegration(serviceIntegration: ServiceIntegration): StepFunctionsBuilder {
    serviceIntegrations[serviceIntegration.name] = serviceIntegration.toMap()
    return this
}

sealed class ServiceIntegration(val name: String) {
    abstract fun toMap(): Map<String, Any>

    data class AthenaStartQueryExecutionSync(
        val athenaArns: Set<String>,
        val glueArns: Set<String>,
        val s3Arns: Set<String>,
        val lakeformationArns: Set<String>? = null,
    ) : ServiceIntegration("athena_StartQueryExecution_Sync") {
        override fun toMap(): Map<String, Any> = buildMap {
            this["athena"] = athenaArns
            this["glue"] = glueArns
            this["s3"] = s3Arns
            if (lakeformationArns != null) {
                "lakeformation" to lakeformationArns
            }
        }
    }

    data class AthenaStartQueryExecution(
        val athenaArns: Set<String>,
        val glueArns: Set<String>,
        val s3Arns: Set<String>,
        val lakeformationArns: Set<String>? = null,
    ) : ServiceIntegration("athena_StartQueryExecution") {
        override fun toMap(): Map<String, Any> = buildMap {
            this["athena"] = athenaArns
            this["glue"] = glueArns
            this["s3"] = s3Arns
            if (lakeformationArns != null) {
                "lakeformation" to lakeformationArns
            }
        }
    }
}
