package de.benkeil.builder.sfn.language

class StatesContext {
    fun jsonToString(path: String): String {
        require(path.startsWith("$")) { "Path must start with '$'." }
        return "States.JsonToString($path)"
    }

    fun array(vararg paths: String): String {
        return "States.Array(${paths.joinToString(", ")})"
    }
}

