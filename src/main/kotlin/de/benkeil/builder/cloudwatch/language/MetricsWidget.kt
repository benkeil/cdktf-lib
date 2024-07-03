package de.benkeil.builder.cloudwatch.language

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue

class MetricsWidget(
    metrics: Collection<Metric>,
    period: Long?,
    stat: Stat,
    region: String,
    title: String,
    view: View,
    stacked: Boolean?,
    sparkline: Boolean?,
    liveData: Boolean?,
    yAxis: Axis<*>?,
    width: Int?,
    start: String?,
    end: String?,
) : Widget<MetricsWidget.Properties>(type = "metric", width = width) {
  override val properties =
      Properties(
          metrics = metrics,
          period = period,
          stat = stat,
          region = region,
          title = title,
          view = view,
          stacked = stacked,
          sparkline = sparkline,
          liveData = liveData,
          yAxis = yAxis,
          start = start,
          end = end,
      )

  @JsonInclude(JsonInclude.Include.NON_NULL)
  data class Properties(
      val metrics: Collection<Metric>,
      val period: Long?,
      val stat: Stat,
      val region: String,
      val title: String,
      val view: View,
      val stacked: Boolean?,
      val sparkline: Boolean?,
      val liveData: Boolean?,
      @get:JsonProperty("yAxis") val yAxis: Axis<*>?,
      val start: String?,
      val end: String?,
  )

  sealed class Axis<T>(@JsonValue val value: T) {
    object Left : Axis<String>("left")

    object Right : Axis<String>("right")

    data class LeftDetailed(
        val min: Number? = null,
        val max: Number? = null,
        val showUnits: Boolean? = null,
        val label: String? = null,
    ) :
        Axis<DetailsContainer>(
            DetailsContainer(
                left = Details(min = min, max = max, showUnits = showUnits, label = label),
                right = null)
        )

    data class RightDetailed(
        val min: Number? = null,
        val max: Number? = null,
        val showUnits: Boolean? = null,
        val label: String? = null,
    ) :
        Axis<DetailsContainer>(
            DetailsContainer(
                left = null,
                right = Details(min = min, max = max, showUnits = showUnits, label = label)
            )
        )

    data class Detailed(val left: Details? = null, val right: Details? = null) :
        Axis<DetailsContainer>(DetailsContainer(left = left, right = right))

    @JsonInclude(JsonInclude.Include.NON_NULL)
    data class DetailsContainer(val left: Details? = null, val right: Details? = null)

    @JsonInclude(JsonInclude.Include.NON_NULL)
    data class Details(
        val min: Number? = null,
        val max: Number? = null,
        val showUnits: Boolean? = null,
        val label: String? = null,
    )
  }

  sealed class Stat(private val value: String) {
    object Average : Stat("Average")

    object Minimum : Stat("Minimum")

    object Maximum : Stat("Maximum")

    object Sum : Stat("Sum")

    object SampleCount : Stat("SampleCount")

    object IQM : Stat("IQM")

    object P99 : Stat("p99")

    object TM99 : Stat("tm99")

    object TC99 : Stat("tc99")

    object TS99 : Stat("ts99")

    class PR(n: Int, m: Int) : Stat("$n:$m")

    @JsonValue
    override fun toString(): String {
      return value
    }
  }

  enum class View(private val value: String) {
    TimeSeries("timeSeries"),
    SingleValue("singleValue"),
    Gauge("gauge"),
    Bar("bar"),
    Pie("pie"),
    ;

    @JsonValue
    override fun toString(): String {
      return value
    }
  }
}
