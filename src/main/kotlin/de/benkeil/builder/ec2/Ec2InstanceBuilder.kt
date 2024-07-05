package de.benkeil.builder.ec2

import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.DefaultTerraformStack
import imports.ec2_instance.Ec2Instance
import software.constructs.Construct

context(DefaultTerraformStack<DefaultEnvironment>)
class Ec2InstanceBuilder(scope: Construct, id: String) :
    ResourceBuilder<Ec2Instance, Ec2Instance.Builder, Unit, Ec2InstanceBuilder>(
        scope,
        id,
        Unit,
        "Ec2Instance",
        Ec2Instance.Builder::create,
    )
