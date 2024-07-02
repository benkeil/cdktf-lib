package de.benkeil.builder.lambda

import com.hashicorp.cdktf.providers.aws.cloudwatch_event_rule.CloudwatchEventRule
import com.hashicorp.cdktf.providers.aws.cloudwatch_event_target.CloudwatchEventTarget
import com.hashicorp.cdktf.providers.aws.lambda_permission.LambdaPermission

fun TriggerContext.cloudwatchEventRule(
    id: String,
    rule: CloudwatchEventRule,
) {
    with(builder) {
        addPostBuildAction {
            CloudwatchEventTarget.Builder.create(scope, "${this.computedId}_CloudwatchEventTarget_${id}")
                .arn(function.lambdaFunctionArnOutput)
                .rule(rule.name)
                .build()
            LambdaPermission.Builder.create(scope, "${this.computedId}_LambdaPermission_${id}")
                .statementId("AllowExecutionFromCloudWatch")
                .action("lambda:InvokeFunction")
                .functionName(lambdaFunctionName)
                .principal("events.amazonaws.com")
                .sourceArn(rule.arn)
                .build()
        }
    }
}
