package de.benkeil.builder.ec2

import com.hashicorp.cdktf.providers.aws.ebs_volume.EbsVolume
import com.hashicorp.cdktf.providers.aws.volume_attachment.VolumeAttachment

fun Ec2InstanceBuilder.attachEbsVolume(
    id: String,
    volume: EbsVolume,
    deviceName: String,
): Ec2InstanceBuilder {
  require(deviceName.matches(("""/dev/xvd[b-z]""").toRegex())) {
    "Device name must match /dev/xvd[b-z]"
  }
  return addPostBuildAction {
    VolumeAttachment.Builder.create(scope, "${computedId}_VolumeAttachment_$id")
        .deviceName(deviceName)
        .instanceId(it.idOutput)
        .volumeId(volume.id)
        .build()
  }
}
