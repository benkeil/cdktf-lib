package de.benkeil.builder.eventbridge

import imports.step_functions.StepFunctions

fun EventbridgeSchedulerBuilder.forStepFunction(
    function: StepFunctions
): EventbridgeSchedulerBuilder {
  arn = function.stateMachineArnOutput
  applyBuilder {
    sfnTargetArns(listOf(function.stateMachineArnOutput))
    attachSfnPolicy(true)
  }
  return this
}
