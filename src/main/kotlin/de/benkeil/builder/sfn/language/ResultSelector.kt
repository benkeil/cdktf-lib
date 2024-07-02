package de.benkeil.builder.sfn.language

/**
 * States which potentially generate results MAY have "Parameters", "ResultSelector" and "ResultPath": Task State, Parallel State, and Map State.
 */
interface ResultSelector {
    val resultSelector: Map<String, String>?
}

interface ResultSelectorBuilder {
    fun resultSelector(block: ResultSelectorContext.() -> Unit)

    fun resultSelector(): Map<String, String>?
}

class ResultSelectorBuilderImpl : ResultSelectorBuilder {
    private var resultSelector: Map<String, String>? = null

    override fun resultSelector(block: ResultSelectorContext.() -> Unit) {
        resultSelector = ResultSelectorContext().apply(block).build()
    }

    override fun resultSelector(): Map<String, String>? = resultSelector
}

class ResultSelectorContext {
    private val resultSelector = mutableMapOf<String, String>()

    fun path(
        key: String,
        value: String,
    ) {
        require(value.startsWith("$")) { "Result selector $key value must be a path and start with '$.'" }
        resultSelector["${key.removeSuffix(".$")}.$"] = value
    }

    fun build(): Map<String, String> = resultSelector
}
