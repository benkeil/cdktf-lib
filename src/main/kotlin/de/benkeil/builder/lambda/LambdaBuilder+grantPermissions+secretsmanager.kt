package de.benkeil.builder.lambda

import de.benkeil.builder.secretsmanager.SecretsmanagerPermissions
import de.benkeil.builder.toIamActions
import imports.secretsmanager.Secretsmanager

fun LambdaBuilder.grantPermissions(
    secretsmanager: Secretsmanager, vararg permissions: SecretsmanagerPermissions
): LambdaBuilder {
    return grantPermissions(setOf(secretsmanager.secretArnOutput), permissions.toIamActions())
}
