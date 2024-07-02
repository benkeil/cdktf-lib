package de.benkeil.builder.sfn.language

import de.benkeil.builder.sfn.language.states.*

class Strand(
    val states: ArrayList<State>,
    val startWith: Boolean = false,
)

context(DefinitionContext)
@AmazonStatesLanguageDsl
class StrandContext {
    private val states = arrayListOf<State>()

    private fun <T : State> add(state: T): T {
        require(states.find { it.id == state.id } == null) { "State with id ${state.id} already exists" }
        states.add(state)
        return state
    }

    fun pass(
        id: String,
        block: (PassContext.() -> Unit)? = null,
    ): Pass {
        val context = PassContext(id)
        if (block != null) {
            context.apply(block)
        }
        return add(context.build())
    }

    fun task(
        id: String,
        resource: String,
        block: (TaskContext.() -> Unit)? = null,
    ): Task {
        val context = TaskContext(id, resource)
        if (block != null) {
            context.apply(block)
        }
        val task = context.build()
        return add(task)
    }

    fun fail(
        id: String,
        block: FailContext.() -> Unit,
    ): Fail = add(FailContext(id).apply(block).build())

    fun map(
        id: String,
        block: MapContext.() -> Unit,
    ): MapState = add(MapContext(id).apply(block).build())

    fun succeed(
        id: String,
        block: (SucceedContext.() -> Unit)? = null,
    ): Succeed {
        val context = SucceedContext(id)
        if (block != null) {
            context.apply(block)
        }
        val succeed = context.build()
        return add(succeed)
    }

    fun choice(
        id: String,
        block: ChoiceContext.() -> Unit,
    ): Choice = add(ChoiceContext(id).apply(block).build())

    fun build(): ArrayList<State> = states
}
