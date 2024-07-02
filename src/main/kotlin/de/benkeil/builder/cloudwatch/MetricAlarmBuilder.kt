package de.benkeil.builder.cloudwatch

import com.hashicorp.cdktf.Fn
import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.Stage
import de.benkeil.stack.DefaultTerraformStack
import imports.metric_alarm.MetricAlarm
import kotlin.time.Duration
import software.constructs.Construct

context(DefaultTerraformStack)
class MetricAlarmBuilder(scope: Construct, id: String, config: Config) :
    ResourceBuilder<
        MetricAlarm, MetricAlarm.Builder, MetricAlarmBuilder.Config, MetricAlarmBuilder>(
        scope,
        id,
        config,
        "MetricAlarm",
        MetricAlarm.Builder::create,
    ) {

  init {
    builder
        .alarmName("${env.service}.${config.name}")
        .alarmDescription(
            Fn.jsonencode(
                AlarmDescription(
                    description = config.description,
                    critical = config.critical,
                    stage = env.stage,
                    service = env.service,
                    impact = config.impact,
                )))
        .comparisonOperator(config.comparisonOperator.name)
        .evaluationPeriods(config.evaluationPeriods)
        .threshold(config.threshold)
        .period(config.period.inWholeSeconds.toString())
        .unit(config.unit.value)
        .metricName(config.metricName)
        .statistic(config.statistic.name)
        .treatMissingData(config.treatMissingData.name)
    //        .okActions(
    //            listOf(
    //
    // "arn:aws:sns:${env.awsRegion}:${env.awsAccountId}:alarms-${env.environment}"))
    //        .alarmActions(
    //            listOf(
    //
    // "arn:aws:sns:${env.awsRegion}:${env.awsAccountId}:alarms-${env.environment}"))
  }

  data class Config(
      val name: String,
      val critical: Boolean,
      val description: String,
      val comparisonOperator: ComparisonOperator,
      val evaluationPeriods: Number,
      val threshold: Number,
      /** The number of periods over which data is compared to the specified threshold. */
      val period: Duration,
      val unit: MetricUnit,
      val metricName: String,
      val statistic: Statistic,
      val treatMissingData: TreatMissingData,
      val impact: Impact = Impact("none", "none"),
  )

  data class AlarmDescription(
      val description: String,
      val critical: Boolean,
      val stage: Stage,
      val service: String,
      val impact: Impact,
  )

  data class Impact(val customer: String, val inHouse: String)

  enum class ComparisonOperator {
    GreaterThanOrEqualToThreshold,
    GreaterThanThreshold,
    LessThanThreshold,
    LessThanOrEqualToThreshold,
    LessThanLowerOrGreaterThanUpperThreshold,
    LessThanLowerThreshold,
    GreaterThanUpperThreshold,
  }

  enum class Statistic {
    SampleCount,
    Average,
    Sum,
    Minimum,
    Maximum
  }

  enum class MetricUnit(val value: String) {
    Seconds("Seconds"),
    Microseconds("Microseconds"),
    Milliseconds("Milliseconds"),
    Bytes("Bytes"),
    Kilobytes("Kilobytes"),
    Megabytes("Megabytes"),
    Gigabytes("Gigabytes"),
    Terabytes("Terabytes"),
    Bits("Bits"),
    Kilobits("Kilobits"),
    Megabits("Megabits"),
    Gigabits("Gigabits"),
    Terabits("Terabits"),
    Percent("Percent"),
    Count("Count"),
    Bytes_Second("Bytes/Second"),
    Kilobytes_Second("Kilobytes/Second"),
    Megabytes_Second("Megabytes/Second"),
    Gigabytes_Second("Gigabytes/Second"),
    Terabytes_Second("Terabytes/Second"),
    Bits_Second("Bits/Second"),
    Kilobits_Second("Kilobits/Second"),
    Megabits_Second("Megabits/Second"),
    Gigabits_Second("Gigabits/Second"),
    Terabits_Second("Terabits/Second"),
    Count_Second("Count/Second"),
    None("None"),
  }

  enum class TreatMissingData {
    missing,
    ignore,
    breaching,
    notBreaching,
  }
}
