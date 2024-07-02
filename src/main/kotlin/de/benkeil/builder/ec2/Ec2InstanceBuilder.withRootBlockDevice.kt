package de.benkeil.builder.ec2

import de.benkeil.model.Size

fun Ec2InstanceBuilder.withRootBlockDevice(
    size: Size,
    type: EbsVolumeBuilder.Type = EbsVolumeBuilder.Type.gp3,
    throughput: Int = 125,
    encrypted: Boolean = true,
): Ec2InstanceBuilder {
  require(size in type.range) { "EBS volume size must be within the range of ${type.range}" }
  require(throughput in 125..1000) { "Throughput must be between 125 and 1000" }
  return applyBuilder {
    rootBlockDevice(
        listOf(
            mapOf(
                "encrypted" to encrypted,
                "volume_type" to type.name,
                "throughput" to throughput,
                "volume_size" to size.inGigaBytes,
            )))
  }
}
