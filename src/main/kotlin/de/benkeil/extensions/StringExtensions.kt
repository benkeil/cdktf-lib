package de.benkeil.extensions

import java.util.*

fun String.toKebabCase(): String = this.lowercase().replace("_", "-")

fun String.toCamelCase(): String {
    return this.split("-").joinToString("") { part ->
        part.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}

