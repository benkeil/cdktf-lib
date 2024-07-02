package de.benkeil.builder.sfn.language.states

import de.benkeil.builder.sfn.language.AmazonStatesLanguageDsl
import de.benkeil.builder.sfn.language.DefinitionContext

sealed class MapState(id: String) : State(id, Type.Map)

context(DefinitionContext)
@AmazonStatesLanguageDsl
class MapContext(val id: String) {
    internal lateinit var state: MapState

    fun inline(block: InlineMapContext.() -> Unit): MapState {
        val map = InlineMapContext(id).apply(block).build()
        state = map
        return map
    }

    fun build(): MapState {
        return state
    }
}
