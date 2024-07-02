package de.benkeil.builder.sfn.language.states

import de.benkeil.builder.sfn.language.AmazonStatesLanguageDsl
import de.benkeil.builder.sfn.language.Commentable
import de.benkeil.builder.sfn.language.CommentableBuilder
import de.benkeil.builder.sfn.language.CommentableBuilderImpl

class Fail(
    id: String,
    val error: String?,
    val cause: String?,
    val errorPath: String?,
    val causePath: String?,
    override val comment: String?,
) : State(id, Type.Fail),
    Commentable

@AmazonStatesLanguageDsl
class FailContext(
    val id: String,
) : CommentableBuilder by CommentableBuilderImpl() {
    internal var error: String? = null
    internal var cause: String? = null
    internal var errorPath: String? = null
    internal var causePath: String? = null

    fun static(
        error: String,
        cause: String,
    ) {
        this.error = error
        this.cause = cause
    }

    fun fromPath(
        errorPath: String,
        causePath: String,
    ) {
        this.errorPath = errorPath
        this.causePath = causePath
    }

    fun build(): Fail =
        Fail(
            id = id,
            error = error,
            cause = cause,
            comment = comment(),
            errorPath = errorPath,
            causePath = causePath,
        )
}
