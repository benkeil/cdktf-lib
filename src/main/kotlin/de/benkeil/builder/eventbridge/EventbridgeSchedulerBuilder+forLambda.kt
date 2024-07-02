package de.benkeil.builder.eventbridge

import imports.lambda.Lambda

fun EventbridgeSchedulerBuilder.forLambda(function: Lambda): EventbridgeSchedulerBuilder {
  arn = function.lambdaFunctionArnOutput
  applyBuilder {
    lambdaTargetArns(listOf(function.lambdaFunctionArnOutput))
    attachLambdaPolicy(true)
  }
  return this
}
