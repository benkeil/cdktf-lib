package de.benkeil.builder.sfn.language.tasks.athena

import de.benkeil.builder.sfn.language.StrandContext
import de.benkeil.builder.sfn.language.states.TaskContext

fun StrandContext.athenaStartQueryExecutionSync(id: String, block: (TaskContext.() -> Unit)? = null) =
    task(id, "arn:aws:states:::athena:startQueryExecution.sync", block)
