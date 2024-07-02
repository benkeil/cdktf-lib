package de.benkeil.builder.sfn

fun StepFunctionsBuilder.withTrigger(block: TriggerContext.() -> Unit): StepFunctionsBuilder {
    addPostBuildAction { TriggerContext(this).apply(block) }; return this
}

class TriggerContext(internal val builder: StepFunctionsBuilder) {
    companion object
}
