package de.benkeil.builder.sfn.language.states

import com.fasterxml.jackson.annotation.JsonIgnore

sealed class State(
    @JsonIgnore val id: String,
    val type: Type,
) {
    enum class Type {
        Pass,
        Task,
        Map,
        Fail,
        Succeed,
        Choice,
    }
}

class States {
    companion object {
        val ALL = "States.ALL"
        val DataLimitExceeded = "States.DataLimitExceeded"
        val ExceedToleratedFailureThreshold = "States.ExceedToleratedFailureThreshold"
        val HeartbeatTimeout = "States.HeartbeatTimeout"
        val IntrinsicFailure = "States.IntrinsicFailure"
        val ItemReaderFailed = "States.ItemReaderFailed"
        val NoChoiceMatched = "States.NoChoiceMatched"
        val ParameterPathFailure = "States.ParameterPathFailure"
        val Permissions = "States.Permissions"
        val ResultPathMatchFailure = "States.ResultPathMatchFailure"
        val ResultWriterFailed = "States.ResultWriterFailed"
        val Runtime = "States.Runtime"
        val TaskFailed = "States.TaskFailed"
        val Timeout = "States.Timeout"

        fun jsonToString(path: String): String {
            require(path.startsWith("$")) { "Path must start with '$'." }
            return "States.JsonToString($path)"
        }
    }
}
