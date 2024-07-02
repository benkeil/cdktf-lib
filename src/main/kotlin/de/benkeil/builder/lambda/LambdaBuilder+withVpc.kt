package de.benkeil.builder.lambda

fun LambdaBuilder.withVpc(
    securityGroupIds: Collection<String>,
    subnetIds: Collection<String>,
): LambdaBuilder {
    return applyBuilder {
        vpcSecurityGroupIds(securityGroupIds.toList())
        vpcSubnetIds(subnetIds.toList())
    }
}
