package de.benkeil.stack

import de.benkeil.model.DefaultEnvironment

fun DefaultTerraformStack.buildArn(service: String, resource: String): String =
    buildArn(this.env, service, resource)

fun buildArn(env: DefaultEnvironment, service: String, resource: String): String =
    "arn:aws:$service:${env.awsRegion}:${env.awsAccountId}:$resource"
