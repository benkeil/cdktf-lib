package de.benkeil.builder.cloudwatch.language

import com.fasterxml.jackson.annotation.JsonInclude
import de.benkeil.builder.cloudwatch.PeriodOverride
import de.benkeil.builder.cloudwatch.Start

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Dashboard(
    val widgets: List<Widget<*>>,
    val start: String?,
    val end: String?,
    val periodOverride: PeriodOverride?,
)

@AmazonDashboardLanguageDsl
class DashboardContext(
    private val width: Int,
    private val start: Start?,
    private val periodOverride: PeriodOverride?,
) {
  private val rows = arrayListOf<Row>()

  fun row(height: Int = 6, block: RowContext.() -> Unit) {
    require(height in 1..1000) { "height must be between 1 and 1000" }
    val row = RowContext(height = height).apply(block).build()
    rows.add(row)
  }

  fun build(): Dashboard {
    val allWidgets =
        rows.fold(0 to listOf<Widget<*>>()) { (y, widgets), row ->
          // fold row
          val widgetsInRow = row.widgets.size
          val rowWidgets =
              row.widgets.fold(0 to listOf<Widget<*>>()) { (x, widgets), widget ->
                val width = widget.width ?: (width / widgetsInRow)
                val widgetWithCoordinates =
                    widget.withCoordinates(
                        width = width,
                        height = row.height,
                        x = x,
                        y = y,
                    )
                (x + width) to widgets.plus(widgetWithCoordinates)
              }

          val totalWidth = rowWidgets.second.sumOf { it.width ?: 0 }
          require(totalWidth == 24) { "row has width of $totalWidth, must be 24 - row: $row" }
          // return fold
          y + row.height to widgets.plus(rowWidgets.second)
        }
    return Dashboard(
        widgets = allWidgets.second,
        start = start?.start,
        end = start?.end,
        periodOverride = periodOverride,
    )
  }
}
