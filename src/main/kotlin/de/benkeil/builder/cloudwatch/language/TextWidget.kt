package de.benkeil.builder.cloudwatch.language

import com.fasterxml.jackson.annotation.JsonInclude

class TextWidget(width: Int?, markdown: String) :
    Widget<TextWidget.Properties>(type = "text", width = width) {
  override val properties: Properties = Properties(markdown)

  @JsonInclude(JsonInclude.Include.NON_NULL)
  data class Properties(
      val markdown: String,
  )
}
