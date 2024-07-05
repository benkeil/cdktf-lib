package de.benkeil.builder.eventbridge

import com.hashicorp.cdktf.providers.aws.cloudwatch_event_bus.CloudwatchEventBus
import com.hashicorp.cdktf.providers.aws.scheduler_schedule_group.SchedulerScheduleGroup
import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.DefaultTerraformStack
import imports.eventbridge.Eventbridge
import software.constructs.Construct

context(DefaultTerraformStack<DefaultEnvironment>)
class EventbridgeSchedulerBuilder(scope: Construct, id: String, config: Config) :
    ResourceBuilder<
        Eventbridge,
        Eventbridge.Builder,
        EventbridgeSchedulerBuilder.Config,
        EventbridgeSchedulerBuilder>(
        scope,
        id,
        config,
        "S3Bucket",
        Eventbridge.Builder::create,
    ) {
  lateinit internal var arn: String

  init {
    val ruleName = "${env.service}.${config.name}"
    builder
        .createBus(false)
        .busName(config.eventBus.name)
        .roleName("${env.service}.${config.name}-scheduler")
        .dependsOn(listOf(config.scheduleGroup, config.eventBus))

    applyBuilder {
      schedules(
          mapOf(
              ruleName to
                  buildMap {
                    this["group_name"] = config.scheduleGroup.name
                    this["description"] = config.description
                    this["schedule_expression"] = config.scheduleExpression
                    this["timezone"] = "Europe/Berlin"
                    this["state"] = config.enabled
                    this["arn"] = arn
                    config.inputString?.let { this["input"] = it }
                  }))
    }
  }

  data class Config(
      val id: String,
      val name: String,
      val description: String,
      val scheduleExpression: String,
      val scheduleGroup: SchedulerScheduleGroup,
      val eventBus: CloudwatchEventBus,
      val enabled: Boolean = true,
      val inputString: String? = null,
  )
}
