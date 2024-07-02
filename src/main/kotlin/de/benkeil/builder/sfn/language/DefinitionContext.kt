package de.benkeil.builder.sfn.language

import de.benkeil.builder.sfn.language.extensions.chain
import de.benkeil.builder.sfn.language.extensions.toMap
import de.benkeil.builder.sfn.language.states.State

data class Definition(
    val comment: String,
    val startAt: String,
    val states: Map<String, State>,
)

@AmazonStatesLanguageDsl
class DefinitionContext(
    private val comment: String,
) {
    internal val strands: ArrayList<Strand> = arrayListOf()

    internal fun addStrand(states: ArrayList<State>): Strand {
        val strand = Strand(states)
        strands.add(strand)
        return strand
    }

    fun strand(block: StrandContext.() -> Unit): Strand {
        val states = StrandContext().apply(block).build()
        val strand = Strand(states)
        strands.add(strand)
        return strand
    }

    fun start(block: StrandContext.() -> Unit) {
        val states = StrandContext().apply(block).build()
        val strand = Strand(states, true)
        strands.add(strand)
    }

    fun build(): Definition {
        val startStrand = strands.firstOrNull { it.startWith } ?: throw IllegalStateException("No start strand defined")
        val states = strands.map { it.states.chain() }.flatten()
        return Definition(comment, startStrand.states.first().id, states.toMap())
    }
}
