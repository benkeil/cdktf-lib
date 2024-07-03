package de.benkeil.stack

fun DefaultTerraformStack.buildArn(awsService: String, resource: String): String =
    "arn:aws:$awsService:${env.awsRegion}:${env.awsAccountId}:$resource"
