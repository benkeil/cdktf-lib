package de.benkeil.builder.sfn

fun StepFunctionsBuilder.Config.Companion.standard(
    name: String,
    loggingLevel: StepFunctionsBuilder.Config.LoggingLevel =
        StepFunctionsBuilder.Config.LoggingLevel.ERROR,
): StepFunctionsBuilder.Config {
  return StepFunctionsBuilder.Config(
      type = StepFunctionsBuilder.Config.Type.STANDARD,
      name = name,
      loggingLevel = loggingLevel,
  )
}
