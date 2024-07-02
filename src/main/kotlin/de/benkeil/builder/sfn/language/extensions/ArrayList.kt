package de.benkeil.builder.sfn.language.extensions

import de.benkeil.builder.sfn.language.NextOrEnd
import de.benkeil.builder.sfn.language.states.State

fun ArrayList<State>.chain(): List<State> =
    mapIndexed { index, state ->
        if (state is NextOrEnd) {
            val next = getOrNull(index + 1)
            if (next != null) {
                state.next = next.id
            } else {
                state.end = true
            }
        }
        state
    }

fun Collection<State>.toMap(): Map<String, State> = associateBy { it.id }
