package de.benkeil.builder.sfn.language.tasks.lambda

import de.benkeil.builder.sfn.language.StrandContext
import de.benkeil.builder.sfn.language.states.TaskContext
import imports.lambda.Lambda

fun StrandContext.lambdaInvokeFunction(id: String, function: Lambda, block: (TaskContext.() -> Unit)? = null) =
    task(id, function.lambdaFunctionArnOutput, block)
