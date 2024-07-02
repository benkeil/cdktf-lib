package de.benkeil.builder.ec2.cloudinit

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator
import com.fasterxml.jackson.module.kotlin.kotlinModule
import com.hashicorp.cdktf.providers.cloudinit.data_cloudinit_config.DataCloudinitConfigPart

class UserDataContext {
  private val mapper =
      ObjectMapper(
              YAMLFactory()
                  .configure(YAMLGenerator.Feature.LITERAL_BLOCK_STYLE, true)
                  .configure(YAMLGenerator.Feature.INDENT_ARRAYS_WITH_INDICATOR, true)
                  .configure(YAMLGenerator.Feature.INDENT_ARRAYS, true))
          .registerModules(kotlinModule())
          .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)

  private val parts: MutableList<DataCloudinitConfigPart> = mutableListOf()

  fun cloudInit(block: CloudInitContext.() -> Unit) {
    val cloudInit = CloudInitContext().apply(block).build()
    val content = mapper.writeValueAsString(cloudInit)
    // println(content)
    parts.add(
        DataCloudinitConfigPart.builder()
            .contentType("text/cloud-config")
            .filename("cloud-config.yaml")
            .content(content)
            .build())
  }

  fun shellScript(filename: String, content: String) {
    parts.add(
        DataCloudinitConfigPart.builder()
            .contentType("text/x-shellscript")
            .filename(filename)
            .content(content)
            .build())
  }

  fun build(): List<DataCloudinitConfigPart> = parts
}
