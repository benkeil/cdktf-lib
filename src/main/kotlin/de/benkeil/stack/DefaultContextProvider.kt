package de.benkeil.stack

import de.benkeil.model.DefaultEnvironment
import software.constructs.Construct

class DefaultContextProvider(
    private val construct: Construct,
    private val env: DefaultEnvironment
) {
  fun scope(): Construct = construct

  fun env(): DefaultEnvironment = env
}
