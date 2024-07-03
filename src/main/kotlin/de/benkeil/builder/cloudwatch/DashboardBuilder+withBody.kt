package de.benkeil.builder.cloudwatch

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import de.benkeil.builder.cloudwatch.language.DashboardContext
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

private val mapper = jacksonObjectMapper()

fun DashboardBuilder.withBody(
    start: Start? = null,
    periodOverride: PeriodOverride? = null,
    block: DashboardContext.() -> Unit
): DashboardBuilder {
  val dashboard =
      DashboardContext(
              width = 24,
              start = start,
              periodOverride = periodOverride,
          )
          .apply(block)
          .build()
  val json = mapper.writeValueAsString(dashboard)
  return applyBuilder { dashboardBody(json) }
}

enum class PeriodOverride {
  auto,
  inherit
}

sealed class Start(val start: String, val end: String? = null) {
  class Relative(ago: Duration) : Start(ago.times(-1).toIsoString()) {
    init {
      require(ago > 0.seconds) { "value must be positive" }
    }
  }

  data class Absolute(val from: ZonedDateTime, val to: ZonedDateTime) :
      Start(
          from.format(DateTimeFormatter.ISO_DATE_TIME),
          to.format(DateTimeFormatter.ISO_DATE_TIME),
      )
}
