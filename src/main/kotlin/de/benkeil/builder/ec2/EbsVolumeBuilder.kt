package de.benkeil.builder.ec2

import com.hashicorp.cdktf.TerraformResourceLifecycle
import com.hashicorp.cdktf.providers.aws.ebs_volume.EbsVolume
import com.hashicorp.cdktf.providers.aws.ebs_volume.EbsVolumeTimeouts
import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.DefaultEnvironment
import de.benkeil.model.Size
import de.benkeil.model.gigaBytes
import software.constructs.Construct

class EbsVolumeBuilder(
    scope: Construct,
    id: String,
    config: Config,
) :
    ResourceBuilder<EbsVolume, EbsVolume.Builder, EbsVolumeBuilder.Config, EbsVolumeBuilder>(
        scope,
        id,
        config,
        EbsVolume.TF_RESOURCE_TYPE,
        EbsVolume.Builder::create,
    ) {

  init {
    require(config.size in config.type.range) {
      "EBS volume size must be within the range of ${config.type.range}"
    }
    require(config.throughput in 125..1000) { "Throughput must be between 125 and 1000" }
    builder
        .availabilityZone(config.availabilityZone)
        .size(config.size.inGigaBytes)
        .type(config.type.name)
        .lifecycle(
            TerraformResourceLifecycle.builder().preventDestroy(config.preventDestroy).build())
        .encrypted(config.encrypted)
        .throughput(config.throughput)
        .tags(
            mapOf(
                "Name" to "${config.env.service}.${config.name}",
                "MountPoint" to "/mnt/${config.name}",
            ))
        .timeouts(EbsVolumeTimeouts.builder().create("2m").update("2m").delete("2m").build())
  }

  data class Config(
      val env: DefaultEnvironment,
      val name: String,
      val availabilityZone: String,
      val throughput: Int = 125,
      val type: Type = Type.gp3,
      val size: Size = 10.gigaBytes,
      val encrypted: Boolean = true,
      val preventDestroy: Boolean = true,
  )

  enum class Type(val range: ClosedRange<Size>) {
    gp2(1.gigaBytes..16_384.gigaBytes),
    gp3(1.gigaBytes..16_384.gigaBytes),
    io1(4.gigaBytes..16_384.gigaBytes),
    io2(4.gigaBytes..65_536.gigaBytes),
    st1(125.gigaBytes..16_384.gigaBytes),
    sc1(125.gigaBytes..16_384.gigaBytes),
    standard(1.gigaBytes..1_024.gigaBytes),
  }
}
