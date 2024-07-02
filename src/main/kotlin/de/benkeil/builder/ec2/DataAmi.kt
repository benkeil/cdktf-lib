package de.benkeil.builder.ec2

import com.hashicorp.cdktf.providers.aws.data_aws_ami.DataAwsAmi
import com.hashicorp.cdktf.providers.aws.data_aws_ami.DataAwsAmiFilter
import de.benkeil.builder.ResourceBuilder
import software.constructs.Construct

class DataAmi(
    scope: Construct,
    id: String,
    config: Config,
) :
    ResourceBuilder<DataAwsAmi, DataAwsAmi.Builder, DataAmi.Config, DataAmi>(
        scope,
        id,
        config,
        DataAwsAmi.TF_RESOURCE_TYPE,
        DataAwsAmi.Builder::create,
    ) {

  internal var filter: List<DataAwsAmiFilter>? = null

  companion object {}

  init {
    builder
        .mostRecent(true)
        .owners(config.owners)
        .filter(
            buildList {
              config.name?.let { add(DataAwsAmiFilter.builder().name("name").values(it).build()) }
              config.virtualizationType?.let {
                add(DataAwsAmiFilter.builder().name("virtualization-type").values(it).build())
              }
              config.architecture?.let {
                add(
                    DataAwsAmiFilter.builder()
                        .name("architecture")
                        .values(it.map { architecture -> architecture.name })
                        .build())
              }
            })
  }

  data class Config(
      val owners: List<String>? = null,
      val name: List<String>? = null,
      val virtualizationType: List<String>? = null,
      val architecture: List<Architecture>? = null,
  ) {
    companion object
  }

  enum class Architecture {
    x86_64,
    arm64,
    x86_64_mac,
    arm64_mac,
    i386,
  }
}
