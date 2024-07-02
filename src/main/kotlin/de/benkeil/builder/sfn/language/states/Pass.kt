package de.benkeil.builder.sfn.language.states

import de.benkeil.builder.sfn.language.*

class Pass(
    id: String,
    val result: Map<String, Any>?,
    override val inputPath: String?,
    override val outputPath: String?,
    override val parameters: Map<String, Any>?,
    override val resultPath: String?,
    override val resultSelector: Map<String, String>?,
    override var end: Boolean?,
    override var next: String?,
    override val comment: String?,
) : State(id, Type.Pass),
    InputOutput,
    ResultSelector,
    NextOrEnd,
    Commentable,
    ResultPath,
    Parameters

context(DefinitionContext)
@AmazonStatesLanguageDsl
class PassContext(
    val id: String,
) : RetryableBuilder by RetryableBuilderImpl(),
    ResultSelectorBuilder by ResultSelectorBuilderImpl(),
    InputOutputBuilder by InputOutputBuilderImpl(),
    NextOrEndBuilder by NextOrEndBuilderImpl(),
    CommentableBuilder by CommentableBuilderImpl(),
    ResultPathBuilder by ResultPathBuilderImpl(),
    ParametersBuilder by ParametersBuilderImpl() {
    private var result: Map<String, Any>? = null

    fun result(block: ResultContext.() -> Unit) {
        result = ResultContext().apply(block).build()
    }

    fun build(): Pass =
        Pass(
            id = id,
            result = result,
            inputPath = inputPath(),
            outputPath = outputPath(),
            parameters = parameters(),
            resultPath = resultPath(),
            resultSelector = resultSelector(),
            next = next(),
            end = end(),
            comment = comment(),
        )
}

class ResultContext {
    private val parameters = mutableMapOf<String, Any>()

    fun constant(
        key: String,
        value: String,
    ) {
        parameters[key] = value
    }

    fun param(
        key: String,
        value: String,
    ) {
        require(value.startsWith("$")) { "Parameter $key value must be a path and start with '$.'" }
        parameters["$key.$"] = value
    }

    fun map(
        key: String,
        block: ResultContext.() -> Unit,
    ) {
        parameters[key] = ResultContext().apply(block).build()
    }

    fun build(): Map<String, Any> = parameters
}
