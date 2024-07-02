package de.benkeil.builder.lambda

fun LambdaBuilder.withTrigger(block: TriggerContext.() -> Unit): LambdaBuilder {
    addPreBuildAction { TriggerContext(this).apply(block) }; return this
}

class TriggerContext(internal val builder: LambdaBuilder) {
    companion object
}
