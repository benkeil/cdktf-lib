package de.benkeil.builder.cloudwatch

import com.hashicorp.cdktf.providers.aws.cloudwatch_dashboard.CloudwatchDashboard
import de.benkeil.builder.ResourceBuilder
import de.benkeil.model.DefaultEnvironment
import de.benkeil.stack.DefaultTerraformStack
import software.constructs.Construct

context(DefaultTerraformStack<DefaultEnvironment>)
class DashboardBuilder(scope: Construct, id: String, config: Config) :
    ResourceBuilder<
        CloudwatchDashboard,
        CloudwatchDashboard.Builder,
        DashboardBuilder.Config,
        DashboardBuilder>(
        scope,
        id,
        config,
        CloudwatchDashboard.TF_RESOURCE_TYPE,
        CloudwatchDashboard.Builder::create,
    ) {
  init {
    builder.dashboardName("${env.stage}--${env.service}--${config.name}")
  }

  data class Config(
      val name: String,
  )
}
