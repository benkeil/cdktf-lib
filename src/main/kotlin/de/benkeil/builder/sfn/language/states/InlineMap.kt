package de.benkeil.builder.sfn.language.states

import de.benkeil.builder.sfn.language.*
import de.benkeil.builder.sfn.language.extensions.chain
import de.benkeil.builder.sfn.language.extensions.toMap

class InlineMap(
    id: String,
    val itemProcessor: ItemProcessor,
    val itemsPath: String?,
    val itemSelector: Map<String, Any>?,
    val maxConcurrency: Int?,
    val maxConcurrencyPath: String? = null,
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
) : MapState(id),
    InputOutput,
    ResultSelector,
    Retryable,
    NextOrEnd,
    Commentable,
    ResultPath,
    Parameters

context(DefinitionContext)
@AmazonStatesLanguageDsl
class InlineMapContext(
    val id: String,
) : RetryableBuilder by RetryableBuilderImpl(),
    ResultSelectorBuilder by ResultSelectorBuilderImpl(),
    NextOrEndBuilder by NextOrEndBuilderImpl(),
    InputOutputBuilder by InputOutputBuilderImpl(),
    CommentableBuilder by CommentableBuilderImpl(),
    ResultPathBuilder by ResultPathBuilderImpl(),
    ParametersBuilder by ParametersBuilderImpl() {
    private lateinit var itemProcessor: ItemProcessor
    private var itemsPath: String? = null
    private var itemSelector: Map<String, Any>? = null
    private var maxConcurrency: Int? = null

    fun itemProcessor(block: StrandContext.() -> Unit) {
        val states = StrandContext().apply(block).build().chain()
        itemProcessor =
            ItemProcessor(
                processorConfig = ProcessorConfig(mode = ProcessorConfigMode.INLINE),
                startAt = states.first().id,
                states = states.toMap(),
            )
    }

    fun itemsPath(path: String) {
        require(path.startsWith("$")) { "Items path must start with '$'." }
        itemsPath = path
    }

    fun itemSelector(block: ItemSelectorContext.() -> Unit) {
        itemSelector = ItemSelectorContext().apply(block).build()
    }

    fun maxConcurrency(value: Int) {
        maxConcurrency = value
    }

    fun build(): InlineMap =
        InlineMap(
            id = id,
            itemProcessor = itemProcessor,
            itemsPath = itemsPath,
            itemSelector = itemSelector,
            maxConcurrency = maxConcurrency,
            retry = retries(),
            catch = catches(),
            parameters = parameters(),
            resultPath = resultPath(),
            resultSelector = resultSelector(),
            next = next(),
            end = end(),
            inputPath = inputPath(),
            outputPath = outputPath(),
            comment = comment(),
        )
}

class ItemSelectorContext {
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

    fun itemIndex(key: String) {
        parameters["${key.removeSuffix(".$")}.$"] = "$$.Map.Item.Index"
    }

    fun itemValue(
        key: String,
        path: String? = null,
    ) {
        parameters["${key.removeSuffix(".$")}.$"] = if (path == null) "$$.Map.Item.Value" else "$$.Map.Item.Value.$path"
    }

    fun map(
        key: String,
        block: ResultContext.() -> Unit,
    ) {
        parameters[key] = ResultContext().apply(block).build()
    }

    fun build(): Map<String, Any> = parameters
}

data class ItemProcessor(
    val processorConfig: ProcessorConfig,
    val startAt: String,
    val states: Map<String, State>,
)

data class ProcessorConfig(
    val mode: ProcessorConfigMode = ProcessorConfigMode.INLINE,
)

enum class ProcessorConfigMode {
    INLINE,
}
