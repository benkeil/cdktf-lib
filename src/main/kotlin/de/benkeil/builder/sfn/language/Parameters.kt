package de.benkeil.builder.sfn.language

interface Parameters {
    val parameters: Map<String, Any>?
}

interface ParametersBuilder {
    fun parameters(): Map<String, Any>?

    fun parameters(block: ParametersContext.() -> Unit)
}

class ParametersBuilderImpl : ParametersBuilder {
    private var parameters: Map<String, Any>? = null

    override fun parameters(block: ParametersContext.() -> Unit) {
        parameters = ParametersContext().apply(block).build()
    }

    override fun parameters(): Map<String, Any>? = parameters
}

class ParametersContext {
    private val parameters = mutableMapOf<String, Any>()

    fun static(
        key: String,
        value: String,
    ) {
        parameters[key] = value
    }

    fun path(
        key: String,
        value: String,
    ) {
        require(value.startsWith("$")) { "Parameter $key value must be a path and start with '$.'" }
        parameters["${key.removeSuffix(".$")}.$"] = value
    }

    fun path(
        key: String,
        block: StatesContext.() -> String,
    ) {
        val value = StatesContext().block()
        parameters["${key.removeSuffix(".$")}.$"] = value
    }

    fun map(
        key: String,
        block: ParametersContext.() -> Unit,
    ) {
        parameters[key] = ParametersContext().apply(block).build()
    }

    fun build(): Map<String, Any> = parameters
}
