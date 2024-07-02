package de.benkeil.builder.sfn.language

interface NextOrEnd {
    var end: Boolean?
    var next: String?
}

interface NextOrEndBuilder {
    fun end(): Boolean?

    fun end(end: Boolean)

    fun next(): String?

    fun next(next: String)
}

class NextOrEndBuilderImpl : NextOrEndBuilder {
    private var end: Boolean? = null
    private var next: String? = null

    override fun end(): Boolean? = end

    override fun end(end: Boolean) {
        this.end = end
    }

    override fun next(): String? = next

    override fun next(next: String) {
        this.next = next
    }
}
