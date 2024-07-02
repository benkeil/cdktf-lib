package de.benkeil.builder.sfn.language.states

import de.benkeil.builder.sfn.language.*

class Task(
    id: String,
    val resource: String,
    val credentials: String? = null,
    val timeoutSeconds: Int? = null,
    val timeoutSecondsPath: String? = null,
    val heartbeatSeconds: Int? = null,
    val heartbeatSecondsPath: String? = null,
    override val inputPath: String?,
    override val outputPath: String?,
    override val parameters: Map<String, Any>?,
    override val resultPath: String?,
    override val resultSelector: Map<String, String>?,
    override var retry: ArrayList<Retry>?,
    override var catch: ArrayList<Catch>?,
    override var end: Boolean?,
    override var next: String?,
    override val comment: String?,
) : State(id, Type.Task),
    InputOutput,
    ResultSelector,
    Retryable,
    NextOrEnd,
    Commentable,
    ResultPath,
    Parameters

context(DefinitionContext)
@AmazonStatesLanguageDsl
class TaskContext(
    val id: String,
    val resource: String,
) : ResultSelectorBuilder by ResultSelectorBuilderImpl(),
    ResultPathBuilder by ResultPathBuilderImpl(),
    InputOutputBuilder by InputOutputBuilderImpl(),
    RetryableBuilder by RetryableBuilderImpl(),
    NextOrEndBuilder by NextOrEndBuilderImpl(),
    CommentableBuilder by CommentableBuilderImpl(),
    ParametersBuilder by ParametersBuilderImpl() {
    fun build(): Task =
        Task(
            id = id,
            resource = resource,
            comment = comment(),
            retry = retries(),
            catch = catches(),
            inputPath = inputPath(),
            outputPath = outputPath(),
            parameters = parameters(),
            resultPath = resultPath(),
            resultSelector = resultSelector(),
            next = next(),
            end = end(),
        )
}
