package de.benkeil.builder.sfn

import de.benkeil.builder.lambda.LambdaPermissions
import de.benkeil.builder.toIamActions
import imports.lambda.Lambda

fun StepFunctionsBuilder.grantPermissions(
    lambda: Lambda, vararg permissions: LambdaPermissions,
): StepFunctionsBuilder {
    return grantPermissions(listOf(lambda.lambdaFunctionArnOutput), permissions.toIamActions())
}
