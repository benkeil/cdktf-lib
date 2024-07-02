package de.benkeil.builder.ec2

import de.benkeil.builder.ResourceBuilder
import imports.ec2_instance.Ec2Instance
import software.constructs.Construct

class Ec2InstanceBuilder(scope: Construct, id: String) :
    ResourceBuilder<Ec2Instance, Ec2Instance.Builder, Unit, Ec2InstanceBuilder>(
        scope,
        id,
        Unit,
        "Ec2Instance",
        Ec2Instance.Builder::create,
    )
