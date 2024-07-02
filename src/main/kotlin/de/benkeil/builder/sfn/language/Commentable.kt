package de.benkeil.builder.sfn.language

interface Commentable {
    val comment: String?
}

interface CommentableBuilder {
    fun comment(): String?

    fun comment(comment: String): CommentableBuilder
}

class CommentableBuilderImpl : CommentableBuilder {
    private var comment: String? = null

    override fun comment(): String? = comment

    override fun comment(comment: String): CommentableBuilder {
        this.comment = comment
        return this
    }
}
