package de.benkeil.builder.sfn

import com.hashicorp.cdktf.providers.aws.cloudwatch_event_bus.CloudwatchEventBus
import com.hashicorp.cdktf.providers.aws.scheduler_schedule_group.SchedulerScheduleGroup
import de.benkeil.builder.eventbridge.EventbridgeSchedulerBuilder
import de.benkeil.builder.eventbridge.forStepFunction
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.DefaultTerraformStack

context(DefaultTerraformStack<DefaultEnvironment>)
fun TriggerContext.scheduler(
    id: String,
    name: String,
    description: String,
    scheduleExpression: String,
    group: SchedulerScheduleGroup,
    bus: CloudwatchEventBus,
    enabled: Boolean = true,
    inputString: String? = null,
) {
  with(builder) {
    EventbridgeSchedulerBuilder(
            scope,
            id,
            EventbridgeSchedulerBuilder.Config(
                id = id,
                name = name,
                description = description,
                scheduleExpression = scheduleExpression,
                scheduleGroup = group,
                eventBus = bus,
                enabled = enabled,
                inputString = inputString,
            ))
        .forStepFunction(this.function)
        .build()
  }
}
