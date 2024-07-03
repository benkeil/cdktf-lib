package de.benkeil.builder.cloudwatch.language

import de.benkeil.builder.cloudwatch.Start
import kotlin.time.Duration
import kotlin.time.Duration.Companion.minutes

data class Row(val height: Int, val widgets: List<Widget<*>>)

@AmazonDashboardLanguageDsl
class RowContext(private val height: Int) {

  private val widgets = arrayListOf<Widget<*>>()

  fun textWidget(
      markdown: String,
      width: Int? = null,
  ) {
    widgets.add(TextWidget(width = width, markdown = markdown))
  }

  fun metricsWidget(
      title: String,
      stat: MetricsWidget.Stat,
      period: Duration = 1.minutes,
      region: String,
      view: MetricsWidget.View = MetricsWidget.View.TimeSeries,
      stacked: Boolean = false,
      sparkline: Boolean = false,
      liveData: Boolean = false,
      yAxis: MetricsWidget.Axis<*>? = null,
      width: Int? = null,
      start: Start? = null,
      metrics: MetricContext.() -> Unit
  ) {
    widgets.add(
        MetricsWidget(
            metrics = MetricContext().apply(metrics).build(),
            period = period.inWholeSeconds,
            stat = stat,
            region = region,
            title = title,
            view = view,
            stacked = stacked,
            sparkline = sparkline,
            liveData = liveData,
            yAxis = yAxis,
            width = width,
            start = start?.start,
            end = start?.end,
        )
    )
  }

  fun build(): Row = Row(height, widgets)
}
