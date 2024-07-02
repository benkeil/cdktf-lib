package de.benkeil.builder.lambda

import de.benkeil.extensions.toCamelCase
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

fun LambdaBuilder.Config.Companion.kotlin(
    name: String,
    memorySize: Int = 512,
    timeout: Duration = 10.seconds,
    project: String = ".",
    sourcePath: String = "../../../../code/$project/build/libs/function.jar",
    environment: Map<String, String> = mutableMapOf(),
    runtime: LambdaBuilder.Runtime = LambdaBuilder.Runtime.JAVA17,
    tracingMode: LambdaBuilder.TracingMode = LambdaBuilder.TracingMode.PassThrough,
    logLevel: LambdaBuilder.LogLevel = LambdaBuilder.LogLevel.ERROR,
    cloudwatchLogsRetentionInDays: Int = 14,
): LambdaBuilder.Config {
  return LambdaBuilder.Config(
      name = name,
      handler = "de.benkeil.application.lambda.${name.toCamelCase()}Handler::handleRequest",
      memorySize = memorySize,
      timeout = timeout,
      runtime = runtime,
      sourcePath = sourcePath,
      environment = environment,
      logLevel = logLevel,
      tracingMode = tracingMode,
      cloudwatchLogsRetentionInDays = cloudwatchLogsRetentionInDays)
}
