package de.benkeil.builder.ec2

fun DataAmi.Config.Companion.latestAmazonLinux2(): DataAmi.Config {
    return DataAmi.Config(
        owners = listOf("amazon"),
        name = listOf("amzn2-ami-kernel-*"),
        virtualizationType = listOf("hvm"),
        architecture = listOf(DataAmi.Architecture.x86_64),
    )
}
