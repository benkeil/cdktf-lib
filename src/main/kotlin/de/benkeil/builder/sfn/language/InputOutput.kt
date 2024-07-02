package de.benkeil.builder.sfn.language

/**
 * Any state except for the Fail and Succeed States MAY have "InputPath" and "OutputPath".
 */
interface InputOutput {
    val inputPath: String?
    val outputPath: String?
}

interface InputOutputBuilder {
    fun inputPath(): String?
    fun inputPath(path: String)
    fun outputPath(): String?
    fun outputPath(path: String)
}

class InputOutputBuilderImpl : InputOutputBuilder {
    private var inputPath: String? = null
    private var outputPath: String? = null

    override fun inputPath(): String? = inputPath

    override fun inputPath(path: String) {
        require(path.startsWith("$")) { "Input path must start with '$'." }
        inputPath = path
    }

    override fun outputPath(): String? = outputPath

    override fun outputPath(path: String) {
        require(path.startsWith("$")) { "Output path must start with '$'." }
        outputPath = path
    }
}
