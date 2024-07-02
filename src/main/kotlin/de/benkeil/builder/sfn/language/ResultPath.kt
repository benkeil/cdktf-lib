package de.benkeil.builder.sfn.language

interface ResultPath {
    val resultPath: String?
}

interface ResultPathBuilder {
    fun resultPath(): String?

    fun resultPath(path: String)
}

class ResultPathBuilderImpl : ResultPathBuilder {
    private var resultPath: String? = null

    override fun resultPath(path: String) {
        require(path.startsWith("$")) { "Result path must start with '$'." }
        resultPath = path
    }

    override fun resultPath(): String? = resultPath
}
