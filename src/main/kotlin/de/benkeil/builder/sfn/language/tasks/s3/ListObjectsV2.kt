package de.benkeil.builder.sfn.language.tasks.s3

import de.benkeil.builder.sfn.language.StrandContext
import de.benkeil.builder.sfn.language.states.Task
import de.benkeil.builder.sfn.language.states.TaskContext

fun StrandContext.s3ListObjectsV2(id: String, block: (TaskContext.() -> Unit)? = null): Task =
    task(id, "arn:aws:states:::aws-sdk:s3:listObjectsV2", block)
