package de.benkeil.builder.sfn.language.tasks.athena

import de.benkeil.builder.sfn.language.StrandContext
import de.benkeil.builder.sfn.language.states.TaskContext

fun StrandContext.athenaGetQueryResults(id: String, block: (TaskContext.() -> Unit)? = null) =
    task(id, "arn:aws:states:::athena:getQueryResults", block)

/**
 * Gets the `QueryExecutionId` from `$.QueryExecution.QueryExecutionId`
 */
fun StrandContext.athenaGetQueryResults(id: String) =
    athenaGetQueryResults(id) {
        parameters {
            path("QueryExecutionId", "$.QueryExecution.QueryExecutionId")
        }
    }
