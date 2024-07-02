package de.benkeil.builder.lambda

fun LambdaBuilder.withEnvironment(pair: Pair<String, String>): LambdaBuilder {
    environment[pair.first] = pair.second
    return this
}

fun LambdaBuilder.withEnvironment(environment: Map<String, String>): LambdaBuilder {
    this.environment.putAll(environment)
    return this
}
