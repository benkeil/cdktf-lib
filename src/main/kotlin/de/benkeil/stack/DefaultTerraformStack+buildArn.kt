package de.benkeil.stack

import de.benkeil.model.DefaultEnvironment

fun DefaultTerraformStack<DefaultEnvironment>.buildArn(awsService: String, resource: String): String =
    "arn:aws:$awsService:${env.awsRegion}:${env.awsAccountId}:$resource"
