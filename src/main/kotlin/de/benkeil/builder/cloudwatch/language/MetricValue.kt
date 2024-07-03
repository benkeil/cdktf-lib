package de.benkeil.builder.cloudwatch.language

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize

@JsonSerialize(using = MetricJsonSerializer::class)
data class Metric(val metrics: MutableList<MetricValue>) {
  fun add(metric: MetricValue) {
    metrics.add(metric)
  }
}

sealed class MetricValue

@JsonInclude(Include.NON_NULL)
open class MetricSetting(
    val id: String?,
    val label: String?,
    val color: String?,
    val region: String?,
    val visible: Boolean?,
    @get:JsonProperty("yAxis") @JsonUnwrapped val yAxis: MetricsWidget.Axis<*>?,
    val period: Long?,
    val stat: MetricsWidget.Stat?,
) : MetricValue()

@JsonInclude(Include.NON_NULL)
class MetricExpression(
    val expression: String,
    id: String?,
    label: String?,
    color: String?,
    region: String?,
    visible: Boolean?,
    yAxis: MetricsWidget.Axis<*>?,
    period: Long?,
    stat: MetricsWidget.Stat?,
) :
    MetricSetting(
        id = id,
        label = label,
        color = color,
        region = region,
        visible = visible,
        yAxis = yAxis,
        period = period,
        stat = stat,
    )

@JsonSerialize(using = MetricStringJsonSerializer::class)
data class MetricString(
    val value: String,
) : MetricValue()

class MetricStringJsonSerializer : JsonSerializer<MetricString>() {
  override fun serialize(value: MetricString, gen: JsonGenerator, serializers: SerializerProvider) {
    gen.writeString(value.value)
  }
}

class MetricJsonSerializer : JsonSerializer<Metric>() {
  override fun serialize(value: Metric, gen: JsonGenerator, serializers: SerializerProvider) {
    gen.writeObject(value.metrics)
  }
}
