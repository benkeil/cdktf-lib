package de.benkeil.builder.secretsmanager

import com.hashicorp.cdktf.Fn

fun SecretsmanagerBuilder.Config.Companion.fromData(
    name: String,
    description: String,
    data: Any,
) =
    SecretsmanagerBuilder.Config(
        name = name,
        description = description,
        secretString = Fn.jsonencode(data),
    )
