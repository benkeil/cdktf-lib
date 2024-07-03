package de.benkeil.builder.cloudwatch.language

import kotlin.time.Duration
import kotlin.time.Duration.Companion.minutes

@AmazonDashboardLanguageDsl
class MetricContext {
  private val metrics = mutableListOf<Metric>()

  fun metricExpression(
      id: String? = null,
      label: String? = null,
      color: String? = null,
      region: String? = null,
      yAxis: MetricsWidget.Axis<*>? = null,
      stat: MetricsWidget.Stat? = null,
      period: Duration = 1.minutes,
      visible: Boolean? = null,
      block: () -> String
  ) {
    metrics.add(
        Metric(
            mutableListOf(
                MetricExpression(
                    expression = block(),
                    label = label,
                    id = id,
                    color = color,
                    visible = visible,
                    yAxis = yAxis,
                    period = period.inWholeSeconds,
                    stat = stat,
                    region = region,
                )
            ))
    )
  }

  fun metricStrings(
      id: String? = null,
      label: String? = null,
      color: String? = null,
      region: String? = null,
      yAxis: MetricsWidget.Axis<*>? = null,
      stat: MetricsWidget.Stat? = null,
      period: Duration = 1.minutes,
      visible: Boolean? = null,
      block: () -> Array<String>
  ) {
    metrics.add(
        Metric(block().map { MetricString(it) }.toMutableList()).apply {
          add(
              MetricSetting(
                  id = id,
                  color = color,
                  label = label,
                  yAxis = yAxis,
                  period = period.inWholeSeconds,
                  stat = stat,
                  visible = visible,
                  region = region,
              )
          )
        })
  }

  fun build(): List<Metric> {
    return metrics
  }
}
