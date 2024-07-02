package de.benkeil.builder.sfn.language.states

import de.benkeil.builder.sfn.language.*

class Succeed(
    id: String,
    override val comment: String?,
    override val inputPath: String?,
    override val outputPath: String?,
) : State(id, Type.Succeed),
    Commentable,
    InputOutput

class SucceedContext(
    val id: String,
) : CommentableBuilder by CommentableBuilderImpl(),
    InputOutputBuilder by InputOutputBuilderImpl() {
    fun build(): Succeed =
        Succeed(
            id = id,
            comment = comment(),
            inputPath = inputPath(),
            outputPath = outputPath(),
        )
}
