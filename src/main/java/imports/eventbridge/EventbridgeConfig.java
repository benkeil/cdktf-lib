package imports.eventbridge;

@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.323Z")
@software.amazon.jsii.Jsii(module = imports.eventbridge.$Module.class, fqn = "eventbridge.EventbridgeConfig")
@software.amazon.jsii.Jsii.Proxy(EventbridgeConfig.Jsii$Proxy.class)
public interface EventbridgeConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserConfig {

    /**
     * A map of objects with EventBridge Destination definitions.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getApiDestinations() {
        return null;
    }

    /**
     * Controls whether to append '-connection' to the name of the connection true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendConnectionPostfix() {
        return null;
    }

    /**
     * Controls whether to append '-destination' to the name of the destination true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendDestinationPostfix() {
        return null;
    }

    /**
     * Controls whether to append '-pipe' to the name of the pipe true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendPipePostfix() {
        return null;
    }

    /**
     * Controls whether to append '-rule' to the name of the rule true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendRulePostfix() {
        return null;
    }

    /**
     * Controls whether to append '-group' to the name of the schedule group true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendScheduleGroupPostfix() {
        return null;
    }

    /**
     * Controls whether to append '-schedule' to the name of the schedule true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendSchedulePostfix() {
        return null;
    }

    /**
     * A map of objects with the EventBridge Archive definitions.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getArchives() {
        return null;
    }

    /**
     * Controls whether the API Destination policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachApiDestinationPolicy() {
        return null;
    }

    /**
     * Controls whether the Cloudwatch policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCloudwatchPolicy() {
        return null;
    }

    /**
     * Controls whether the ECS policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachEcsPolicy() {
        return null;
    }

    /**
     * Controls whether the Kinesis Firehose policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachKinesisFirehosePolicy() {
        return null;
    }

    /**
     * Controls whether the Kinesis policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachKinesisPolicy() {
        return null;
    }

    /**
     * Controls whether the Lambda Function policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachLambdaPolicy() {
        return null;
    }

    /**
     * Controls whether list of policies should be added to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicies() {
        return null;
    }

    /**
     * Controls whether policy should be added to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicy() {
        return null;
    }

    /**
     * Controls whether policy_json should be added to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJson() {
        return null;
    }

    /**
     * Controls whether policy_jsons should be added to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJsons() {
        return null;
    }

    /**
     * Controls whether policy_statements should be added to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyStatements() {
        return null;
    }

    /**
     * Controls whether the StepFunction policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachSfnPolicy() {
        return null;
    }

    /**
     * Controls whether the SNS policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachSnsPolicy() {
        return null;
    }

    /**
     * Controls whether the SQS policy should be added to IAM role for EventBridge Target.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachSqsPolicy() {
        return null;
    }

    /**
     * Controls whether X-Ray tracing policy should be added to IAM role for EventBridge.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachTracingPolicy() {
        return null;
    }

    /**
     * A unique name for your EventBridge Bus default.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBusName() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the Cloudwatch Log Streams you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCloudwatchTargetArns() {
        return null;
    }

    /**
     * A map of objects with EventBridge Connection definitions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getConnections() {
        return null;
    }

    /**
     * Controls whether resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return null;
    }

    /**
     * Controls whether EventBridge Destination resources should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateApiDestinations() {
        return null;
    }

    /**
     * Controls whether EventBridge Archive resources should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateArchives() {
        return null;
    }

    /**
     * Controls whether EventBridge Bus resource should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateBus() {
        return null;
    }

    /**
     * Controls whether EventBridge Connection resources should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateConnections() {
        return null;
    }

    /**
     * Controls whether EventBridge Permission resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePermissions() {
        return null;
    }

    /**
     * Controls whether EventBridge Pipes resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePipes() {
        return null;
    }

    /**
     * Controls whether IAM roles should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRole() {
        return null;
    }

    /**
     * Controls whether EventBridge Rule resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRules() {
        return null;
    }

    /**
     * Controls whether EventBridge Schedule Group resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateScheduleGroups() {
        return null;
    }

    /**
     * Controls whether EventBridge Schedule resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSchedules() {
        return null;
    }

    /**
     * Controls whether default schemas discoverer should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSchemasDiscoverer() {
        return null;
    }

    /**
     * Controls whether EventBridge Target resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateTargets() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS ECS Tasks you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEcsTargetArns() {
        return null;
    }

    /**
     * The partner event source that the new event bus will be matched with.
     * <p>
     * Must match name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEventSourceName() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the Kinesis Firehose Delivery Streams you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getKinesisFirehoseTargetArns() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the Kinesis Streams you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getKinesisTargetArns() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lambda Functions you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLambdaTargetArns() {
        return null;
    }

    /**
     * Number of policies to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicies() {
        return null;
    }

    /**
     * Number of policies JSON to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicyJsons() {
        return null;
    }

    /**
     * A map of objects with EventBridge Permission definitions.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getPermissions() {
        return null;
    }

    /**
     * A map of objects with EventBridge Pipe definitions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPipes() {
        return null;
    }

    /**
     * List of policy statements ARN to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicies() {
        return null;
    }

    /**
     * An additional policy document ARN to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    /**
     * An additional policy document as JSON to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyJson() {
        return null;
    }

    /**
     * List of additional policy documents as JSON to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyJsons() {
        return null;
    }

    /**
     * Map of dynamic policy statements to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPolicyStatements() {
        return null;
    }

    /**
     * Description of IAM role to use for EventBridge.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleDescription() {
        return null;
    }

    /**
     * Specifies to force detaching any policies the IAM role has before destroying it.
     * <p>
     * true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRoleForceDetachPolicies() {
        return null;
    }

    /**
     * Name of IAM role to use for EventBridge.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleName() {
        return null;
    }

    /**
     * Path of IAM role to use for EventBridge.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRolePath() {
        return null;
    }

    /**
     * The ARN of the policy that is used to set the permissions boundary for the IAM role used by EventBridge.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRolePermissionsBoundary() {
        return null;
    }

    /**
     * A map of tags to assign to IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRoleTags() {
        return null;
    }

    /**
     * A map of objects with EventBridge Rule definitions.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getRules() {
        return null;
    }

    /**
     * A map of objects with EventBridge Schedule Group definitions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getScheduleGroups() {
        return null;
    }

    /**
     * A map of objects with EventBridge Schedule Group create and delete timeouts.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getScheduleGroupTimeouts() {
        return null;
    }

    /**
     * A map of objects with EventBridge Schedule definitions.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getSchedules() {
        return null;
    }

    /**
     * Default schemas discoverer description Auto schemas discoverer event.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSchemasDiscovererDescription() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the StepFunctions you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSfnTargetArns() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS SNS's you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSnsTargetArns() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS SQS Queues you want to use as EventBridge targets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSqsTargetArns() {
        return null;
    }

    /**
     * A map of tags to assign to resources.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * A map of objects with EventBridge Target definitions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTargets() {
        return null;
    }

    /**
     * Additional trusted entities for assuming roles (trust relationship).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTrustedEntities() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EventbridgeConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventbridgeConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EventbridgeConfig> {
        java.util.Map<java.lang.String, java.lang.Object> apiDestinations;
        java.lang.Boolean appendConnectionPostfix;
        java.lang.Boolean appendDestinationPostfix;
        java.lang.Boolean appendPipePostfix;
        java.lang.Boolean appendRulePostfix;
        java.lang.Boolean appendScheduleGroupPostfix;
        java.lang.Boolean appendSchedulePostfix;
        java.util.Map<java.lang.String, java.lang.Object> archives;
        java.lang.Boolean attachApiDestinationPolicy;
        java.lang.Boolean attachCloudwatchPolicy;
        java.lang.Boolean attachEcsPolicy;
        java.lang.Boolean attachKinesisFirehosePolicy;
        java.lang.Boolean attachKinesisPolicy;
        java.lang.Boolean attachLambdaPolicy;
        java.lang.Boolean attachPolicies;
        java.lang.Boolean attachPolicy;
        java.lang.Boolean attachPolicyJson;
        java.lang.Boolean attachPolicyJsons;
        java.lang.Boolean attachPolicyStatements;
        java.lang.Boolean attachSfnPolicy;
        java.lang.Boolean attachSnsPolicy;
        java.lang.Boolean attachSqsPolicy;
        java.lang.Boolean attachTracingPolicy;
        java.lang.String busName;
        java.util.List<java.lang.String> cloudwatchTargetArns;
        java.lang.Object connections;
        java.lang.Boolean create;
        java.lang.Boolean createApiDestinations;
        java.lang.Boolean createArchives;
        java.lang.Boolean createBus;
        java.lang.Boolean createConnections;
        java.lang.Boolean createPermissions;
        java.lang.Boolean createPipes;
        java.lang.Boolean createRole;
        java.lang.Boolean createRules;
        java.lang.Boolean createScheduleGroups;
        java.lang.Boolean createSchedules;
        java.lang.Boolean createSchemasDiscoverer;
        java.lang.Boolean createTargets;
        java.util.List<java.lang.String> ecsTargetArns;
        java.lang.String eventSourceName;
        java.util.List<java.lang.String> kinesisFirehoseTargetArns;
        java.util.List<java.lang.String> kinesisTargetArns;
        java.util.List<java.lang.String> lambdaTargetArns;
        java.lang.Number numberOfPolicies;
        java.lang.Number numberOfPolicyJsons;
        java.util.Map<java.lang.String, java.lang.Object> permissions;
        java.lang.Object pipes;
        java.util.List<java.lang.String> policies;
        java.lang.String policy;
        java.lang.String policyJson;
        java.util.List<java.lang.String> policyJsons;
        java.lang.Object policyStatements;
        java.lang.String roleDescription;
        java.lang.Boolean roleForceDetachPolicies;
        java.lang.String roleName;
        java.lang.String rolePath;
        java.lang.String rolePermissionsBoundary;
        java.util.Map<java.lang.String, java.lang.String> roleTags;
        java.util.Map<java.lang.String, java.lang.Object> rules;
        java.lang.Object scheduleGroups;
        java.util.Map<java.lang.String, java.lang.String> scheduleGroupTimeouts;
        java.util.Map<java.lang.String, java.lang.Object> schedules;
        java.lang.String schemasDiscovererDescription;
        java.util.List<java.lang.String> sfnTargetArns;
        java.util.List<java.lang.String> snsTargetArns;
        java.util.List<java.lang.String> sqsTargetArns;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.lang.Object targets;
        java.util.List<java.lang.String> trustedEntities;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link EventbridgeConfig#getApiDestinations}
         * @param apiDestinations A map of objects with EventBridge Destination definitions.
         *                        The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder apiDestinations(java.util.Map<java.lang.String, ? extends java.lang.Object> apiDestinations) {
            this.apiDestinations = (java.util.Map<java.lang.String, java.lang.Object>)apiDestinations;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAppendConnectionPostfix}
         * @param appendConnectionPostfix Controls whether to append '-connection' to the name of the connection true.
         * @return {@code this}
         */
        public Builder appendConnectionPostfix(java.lang.Boolean appendConnectionPostfix) {
            this.appendConnectionPostfix = appendConnectionPostfix;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAppendDestinationPostfix}
         * @param appendDestinationPostfix Controls whether to append '-destination' to the name of the destination true.
         * @return {@code this}
         */
        public Builder appendDestinationPostfix(java.lang.Boolean appendDestinationPostfix) {
            this.appendDestinationPostfix = appendDestinationPostfix;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAppendPipePostfix}
         * @param appendPipePostfix Controls whether to append '-pipe' to the name of the pipe true.
         * @return {@code this}
         */
        public Builder appendPipePostfix(java.lang.Boolean appendPipePostfix) {
            this.appendPipePostfix = appendPipePostfix;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAppendRulePostfix}
         * @param appendRulePostfix Controls whether to append '-rule' to the name of the rule true.
         * @return {@code this}
         */
        public Builder appendRulePostfix(java.lang.Boolean appendRulePostfix) {
            this.appendRulePostfix = appendRulePostfix;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAppendScheduleGroupPostfix}
         * @param appendScheduleGroupPostfix Controls whether to append '-group' to the name of the schedule group true.
         * @return {@code this}
         */
        public Builder appendScheduleGroupPostfix(java.lang.Boolean appendScheduleGroupPostfix) {
            this.appendScheduleGroupPostfix = appendScheduleGroupPostfix;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAppendSchedulePostfix}
         * @param appendSchedulePostfix Controls whether to append '-schedule' to the name of the schedule true.
         * @return {@code this}
         */
        public Builder appendSchedulePostfix(java.lang.Boolean appendSchedulePostfix) {
            this.appendSchedulePostfix = appendSchedulePostfix;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getArchives}
         * @param archives A map of objects with the EventBridge Archive definitions.
         *                 The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder archives(java.util.Map<java.lang.String, ? extends java.lang.Object> archives) {
            this.archives = (java.util.Map<java.lang.String, java.lang.Object>)archives;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachApiDestinationPolicy}
         * @param attachApiDestinationPolicy Controls whether the API Destination policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachApiDestinationPolicy(java.lang.Boolean attachApiDestinationPolicy) {
            this.attachApiDestinationPolicy = attachApiDestinationPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachCloudwatchPolicy}
         * @param attachCloudwatchPolicy Controls whether the Cloudwatch policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachCloudwatchPolicy(java.lang.Boolean attachCloudwatchPolicy) {
            this.attachCloudwatchPolicy = attachCloudwatchPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachEcsPolicy}
         * @param attachEcsPolicy Controls whether the ECS policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachEcsPolicy(java.lang.Boolean attachEcsPolicy) {
            this.attachEcsPolicy = attachEcsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachKinesisFirehosePolicy}
         * @param attachKinesisFirehosePolicy Controls whether the Kinesis Firehose policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachKinesisFirehosePolicy(java.lang.Boolean attachKinesisFirehosePolicy) {
            this.attachKinesisFirehosePolicy = attachKinesisFirehosePolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachKinesisPolicy}
         * @param attachKinesisPolicy Controls whether the Kinesis policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachKinesisPolicy(java.lang.Boolean attachKinesisPolicy) {
            this.attachKinesisPolicy = attachKinesisPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachLambdaPolicy}
         * @param attachLambdaPolicy Controls whether the Lambda Function policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachLambdaPolicy(java.lang.Boolean attachLambdaPolicy) {
            this.attachLambdaPolicy = attachLambdaPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachPolicies}
         * @param attachPolicies Controls whether list of policies should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicies(java.lang.Boolean attachPolicies) {
            this.attachPolicies = attachPolicies;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachPolicy}
         * @param attachPolicy Controls whether policy should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicy(java.lang.Boolean attachPolicy) {
            this.attachPolicy = attachPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachPolicyJson}
         * @param attachPolicyJson Controls whether policy_json should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicyJson(java.lang.Boolean attachPolicyJson) {
            this.attachPolicyJson = attachPolicyJson;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachPolicyJsons}
         * @param attachPolicyJsons Controls whether policy_jsons should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicyJsons(java.lang.Boolean attachPolicyJsons) {
            this.attachPolicyJsons = attachPolicyJsons;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachPolicyStatements}
         * @param attachPolicyStatements Controls whether policy_statements should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicyStatements(java.lang.Boolean attachPolicyStatements) {
            this.attachPolicyStatements = attachPolicyStatements;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachSfnPolicy}
         * @param attachSfnPolicy Controls whether the StepFunction policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachSfnPolicy(java.lang.Boolean attachSfnPolicy) {
            this.attachSfnPolicy = attachSfnPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachSnsPolicy}
         * @param attachSnsPolicy Controls whether the SNS policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachSnsPolicy(java.lang.Boolean attachSnsPolicy) {
            this.attachSnsPolicy = attachSnsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachSqsPolicy}
         * @param attachSqsPolicy Controls whether the SQS policy should be added to IAM role for EventBridge Target.
         * @return {@code this}
         */
        public Builder attachSqsPolicy(java.lang.Boolean attachSqsPolicy) {
            this.attachSqsPolicy = attachSqsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getAttachTracingPolicy}
         * @param attachTracingPolicy Controls whether X-Ray tracing policy should be added to IAM role for EventBridge.
         * @return {@code this}
         */
        public Builder attachTracingPolicy(java.lang.Boolean attachTracingPolicy) {
            this.attachTracingPolicy = attachTracingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getBusName}
         * @param busName A unique name for your EventBridge Bus default.
         * @return {@code this}
         */
        public Builder busName(java.lang.String busName) {
            this.busName = busName;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCloudwatchTargetArns}
         * @param cloudwatchTargetArns The Amazon Resource Name (ARN) of the Cloudwatch Log Streams you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder cloudwatchTargetArns(java.util.List<java.lang.String> cloudwatchTargetArns) {
            this.cloudwatchTargetArns = cloudwatchTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getConnections}
         * @param connections A map of objects with EventBridge Connection definitions.
         * @return {@code this}
         */
        public Builder connections(java.lang.Object connections) {
            this.connections = connections;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreate}
         * @param create Controls whether resources should be created true.
         * @return {@code this}
         */
        public Builder create(java.lang.Boolean create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateApiDestinations}
         * @param createApiDestinations Controls whether EventBridge Destination resources should be created.
         * @return {@code this}
         */
        public Builder createApiDestinations(java.lang.Boolean createApiDestinations) {
            this.createApiDestinations = createApiDestinations;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateArchives}
         * @param createArchives Controls whether EventBridge Archive resources should be created.
         * @return {@code this}
         */
        public Builder createArchives(java.lang.Boolean createArchives) {
            this.createArchives = createArchives;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateBus}
         * @param createBus Controls whether EventBridge Bus resource should be created true.
         * @return {@code this}
         */
        public Builder createBus(java.lang.Boolean createBus) {
            this.createBus = createBus;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateConnections}
         * @param createConnections Controls whether EventBridge Connection resources should be created.
         * @return {@code this}
         */
        public Builder createConnections(java.lang.Boolean createConnections) {
            this.createConnections = createConnections;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreatePermissions}
         * @param createPermissions Controls whether EventBridge Permission resources should be created true.
         * @return {@code this}
         */
        public Builder createPermissions(java.lang.Boolean createPermissions) {
            this.createPermissions = createPermissions;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreatePipes}
         * @param createPipes Controls whether EventBridge Pipes resources should be created true.
         * @return {@code this}
         */
        public Builder createPipes(java.lang.Boolean createPipes) {
            this.createPipes = createPipes;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateRole}
         * @param createRole Controls whether IAM roles should be created true.
         * @return {@code this}
         */
        public Builder createRole(java.lang.Boolean createRole) {
            this.createRole = createRole;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateRules}
         * @param createRules Controls whether EventBridge Rule resources should be created true.
         * @return {@code this}
         */
        public Builder createRules(java.lang.Boolean createRules) {
            this.createRules = createRules;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateScheduleGroups}
         * @param createScheduleGroups Controls whether EventBridge Schedule Group resources should be created true.
         * @return {@code this}
         */
        public Builder createScheduleGroups(java.lang.Boolean createScheduleGroups) {
            this.createScheduleGroups = createScheduleGroups;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateSchedules}
         * @param createSchedules Controls whether EventBridge Schedule resources should be created true.
         * @return {@code this}
         */
        public Builder createSchedules(java.lang.Boolean createSchedules) {
            this.createSchedules = createSchedules;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateSchemasDiscoverer}
         * @param createSchemasDiscoverer Controls whether default schemas discoverer should be created.
         * @return {@code this}
         */
        public Builder createSchemasDiscoverer(java.lang.Boolean createSchemasDiscoverer) {
            this.createSchemasDiscoverer = createSchemasDiscoverer;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getCreateTargets}
         * @param createTargets Controls whether EventBridge Target resources should be created true.
         * @return {@code this}
         */
        public Builder createTargets(java.lang.Boolean createTargets) {
            this.createTargets = createTargets;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getEcsTargetArns}
         * @param ecsTargetArns The Amazon Resource Name (ARN) of the AWS ECS Tasks you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder ecsTargetArns(java.util.List<java.lang.String> ecsTargetArns) {
            this.ecsTargetArns = ecsTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getEventSourceName}
         * @param eventSourceName The partner event source that the new event bus will be matched with.
         *                        Must match name.
         * @return {@code this}
         */
        public Builder eventSourceName(java.lang.String eventSourceName) {
            this.eventSourceName = eventSourceName;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getKinesisFirehoseTargetArns}
         * @param kinesisFirehoseTargetArns The Amazon Resource Name (ARN) of the Kinesis Firehose Delivery Streams you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder kinesisFirehoseTargetArns(java.util.List<java.lang.String> kinesisFirehoseTargetArns) {
            this.kinesisFirehoseTargetArns = kinesisFirehoseTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getKinesisTargetArns}
         * @param kinesisTargetArns The Amazon Resource Name (ARN) of the Kinesis Streams you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder kinesisTargetArns(java.util.List<java.lang.String> kinesisTargetArns) {
            this.kinesisTargetArns = kinesisTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getLambdaTargetArns}
         * @param lambdaTargetArns The Amazon Resource Name (ARN) of the Lambda Functions you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder lambdaTargetArns(java.util.List<java.lang.String> lambdaTargetArns) {
            this.lambdaTargetArns = lambdaTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getNumberOfPolicies}
         * @param numberOfPolicies Number of policies to attach to IAM role.
         * @return {@code this}
         */
        public Builder numberOfPolicies(java.lang.Number numberOfPolicies) {
            this.numberOfPolicies = numberOfPolicies;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getNumberOfPolicyJsons}
         * @param numberOfPolicyJsons Number of policies JSON to attach to IAM role.
         * @return {@code this}
         */
        public Builder numberOfPolicyJsons(java.lang.Number numberOfPolicyJsons) {
            this.numberOfPolicyJsons = numberOfPolicyJsons;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getPermissions}
         * @param permissions A map of objects with EventBridge Permission definitions.
         *                    The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder permissions(java.util.Map<java.lang.String, ? extends java.lang.Object> permissions) {
            this.permissions = (java.util.Map<java.lang.String, java.lang.Object>)permissions;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getPipes}
         * @param pipes A map of objects with EventBridge Pipe definitions.
         * @return {@code this}
         */
        public Builder pipes(java.lang.Object pipes) {
            this.pipes = pipes;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getPolicies}
         * @param policies List of policy statements ARN to attach to IAM role.
         * @return {@code this}
         */
        public Builder policies(java.util.List<java.lang.String> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getPolicy}
         * @param policy An additional policy document ARN to attach to IAM role.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getPolicyJson}
         * @param policyJson An additional policy document as JSON to attach to IAM role.
         * @return {@code this}
         */
        public Builder policyJson(java.lang.String policyJson) {
            this.policyJson = policyJson;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getPolicyJsons}
         * @param policyJsons List of additional policy documents as JSON to attach to IAM role.
         * @return {@code this}
         */
        public Builder policyJsons(java.util.List<java.lang.String> policyJsons) {
            this.policyJsons = policyJsons;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getPolicyStatements}
         * @param policyStatements Map of dynamic policy statements to attach to IAM role.
         * @return {@code this}
         */
        public Builder policyStatements(java.lang.Object policyStatements) {
            this.policyStatements = policyStatements;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getRoleDescription}
         * @param roleDescription Description of IAM role to use for EventBridge.
         * @return {@code this}
         */
        public Builder roleDescription(java.lang.String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getRoleForceDetachPolicies}
         * @param roleForceDetachPolicies Specifies to force detaching any policies the IAM role has before destroying it.
         *                                true
         * @return {@code this}
         */
        public Builder roleForceDetachPolicies(java.lang.Boolean roleForceDetachPolicies) {
            this.roleForceDetachPolicies = roleForceDetachPolicies;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getRoleName}
         * @param roleName Name of IAM role to use for EventBridge.
         * @return {@code this}
         */
        public Builder roleName(java.lang.String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getRolePath}
         * @param rolePath Path of IAM role to use for EventBridge.
         * @return {@code this}
         */
        public Builder rolePath(java.lang.String rolePath) {
            this.rolePath = rolePath;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getRolePermissionsBoundary}
         * @param rolePermissionsBoundary The ARN of the policy that is used to set the permissions boundary for the IAM role used by EventBridge.
         * @return {@code this}
         */
        public Builder rolePermissionsBoundary(java.lang.String rolePermissionsBoundary) {
            this.rolePermissionsBoundary = rolePermissionsBoundary;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getRoleTags}
         * @param roleTags A map of tags to assign to IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder roleTags(java.util.Map<java.lang.String, java.lang.String> roleTags) {
            this.roleTags = roleTags;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getRules}
         * @param rules A map of objects with EventBridge Rule definitions.
         *              The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.Map<java.lang.String, ? extends java.lang.Object> rules) {
            this.rules = (java.util.Map<java.lang.String, java.lang.Object>)rules;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getScheduleGroups}
         * @param scheduleGroups A map of objects with EventBridge Schedule Group definitions.
         * @return {@code this}
         */
        public Builder scheduleGroups(java.lang.Object scheduleGroups) {
            this.scheduleGroups = scheduleGroups;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getScheduleGroupTimeouts}
         * @param scheduleGroupTimeouts A map of objects with EventBridge Schedule Group create and delete timeouts.
         *                              The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder scheduleGroupTimeouts(java.util.Map<java.lang.String, java.lang.String> scheduleGroupTimeouts) {
            this.scheduleGroupTimeouts = scheduleGroupTimeouts;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getSchedules}
         * @param schedules A map of objects with EventBridge Schedule definitions.
         *                  The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder schedules(java.util.Map<java.lang.String, ? extends java.lang.Object> schedules) {
            this.schedules = (java.util.Map<java.lang.String, java.lang.Object>)schedules;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getSchemasDiscovererDescription}
         * @param schemasDiscovererDescription Default schemas discoverer description Auto schemas discoverer event.
         * @return {@code this}
         */
        public Builder schemasDiscovererDescription(java.lang.String schemasDiscovererDescription) {
            this.schemasDiscovererDescription = schemasDiscovererDescription;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getSfnTargetArns}
         * @param sfnTargetArns The Amazon Resource Name (ARN) of the StepFunctions you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder sfnTargetArns(java.util.List<java.lang.String> sfnTargetArns) {
            this.sfnTargetArns = sfnTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getSnsTargetArns}
         * @param snsTargetArns The Amazon Resource Name (ARN) of the AWS SNS's you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder snsTargetArns(java.util.List<java.lang.String> snsTargetArns) {
            this.snsTargetArns = snsTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getSqsTargetArns}
         * @param sqsTargetArns The Amazon Resource Name (ARN) of the AWS SQS Queues you want to use as EventBridge targets.
         * @return {@code this}
         */
        public Builder sqsTargetArns(java.util.List<java.lang.String> sqsTargetArns) {
            this.sqsTargetArns = sqsTargetArns;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getTags}
         * @param tags A map of tags to assign to resources.
         *             The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getTargets}
         * @param targets A map of objects with EventBridge Target definitions.
         * @return {@code this}
         */
        public Builder targets(java.lang.Object targets) {
            this.targets = targets;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getTrustedEntities}
         * @param trustedEntities Additional trusted entities for assuming roles (trust relationship).
         * @return {@code this}
         */
        public Builder trustedEntities(java.util.List<java.lang.String> trustedEntities) {
            this.trustedEntities = trustedEntities;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getProviders}
         * @param providers the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder providers(java.util.List<? extends java.lang.Object> providers) {
            this.providers = (java.util.List<java.lang.Object>)providers;
            return this;
        }

        /**
         * Sets the value of {@link EventbridgeConfig#getSkipAssetCreationFromLocalModules}
         * @param skipAssetCreationFromLocalModules the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder skipAssetCreationFromLocalModules(java.lang.Boolean skipAssetCreationFromLocalModules) {
            this.skipAssetCreationFromLocalModules = skipAssetCreationFromLocalModules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventbridgeConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EventbridgeConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EventbridgeConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventbridgeConfig {
        private final java.util.Map<java.lang.String, java.lang.Object> apiDestinations;
        private final java.lang.Boolean appendConnectionPostfix;
        private final java.lang.Boolean appendDestinationPostfix;
        private final java.lang.Boolean appendPipePostfix;
        private final java.lang.Boolean appendRulePostfix;
        private final java.lang.Boolean appendScheduleGroupPostfix;
        private final java.lang.Boolean appendSchedulePostfix;
        private final java.util.Map<java.lang.String, java.lang.Object> archives;
        private final java.lang.Boolean attachApiDestinationPolicy;
        private final java.lang.Boolean attachCloudwatchPolicy;
        private final java.lang.Boolean attachEcsPolicy;
        private final java.lang.Boolean attachKinesisFirehosePolicy;
        private final java.lang.Boolean attachKinesisPolicy;
        private final java.lang.Boolean attachLambdaPolicy;
        private final java.lang.Boolean attachPolicies;
        private final java.lang.Boolean attachPolicy;
        private final java.lang.Boolean attachPolicyJson;
        private final java.lang.Boolean attachPolicyJsons;
        private final java.lang.Boolean attachPolicyStatements;
        private final java.lang.Boolean attachSfnPolicy;
        private final java.lang.Boolean attachSnsPolicy;
        private final java.lang.Boolean attachSqsPolicy;
        private final java.lang.Boolean attachTracingPolicy;
        private final java.lang.String busName;
        private final java.util.List<java.lang.String> cloudwatchTargetArns;
        private final java.lang.Object connections;
        private final java.lang.Boolean create;
        private final java.lang.Boolean createApiDestinations;
        private final java.lang.Boolean createArchives;
        private final java.lang.Boolean createBus;
        private final java.lang.Boolean createConnections;
        private final java.lang.Boolean createPermissions;
        private final java.lang.Boolean createPipes;
        private final java.lang.Boolean createRole;
        private final java.lang.Boolean createRules;
        private final java.lang.Boolean createScheduleGroups;
        private final java.lang.Boolean createSchedules;
        private final java.lang.Boolean createSchemasDiscoverer;
        private final java.lang.Boolean createTargets;
        private final java.util.List<java.lang.String> ecsTargetArns;
        private final java.lang.String eventSourceName;
        private final java.util.List<java.lang.String> kinesisFirehoseTargetArns;
        private final java.util.List<java.lang.String> kinesisTargetArns;
        private final java.util.List<java.lang.String> lambdaTargetArns;
        private final java.lang.Number numberOfPolicies;
        private final java.lang.Number numberOfPolicyJsons;
        private final java.util.Map<java.lang.String, java.lang.Object> permissions;
        private final java.lang.Object pipes;
        private final java.util.List<java.lang.String> policies;
        private final java.lang.String policy;
        private final java.lang.String policyJson;
        private final java.util.List<java.lang.String> policyJsons;
        private final java.lang.Object policyStatements;
        private final java.lang.String roleDescription;
        private final java.lang.Boolean roleForceDetachPolicies;
        private final java.lang.String roleName;
        private final java.lang.String rolePath;
        private final java.lang.String rolePermissionsBoundary;
        private final java.util.Map<java.lang.String, java.lang.String> roleTags;
        private final java.util.Map<java.lang.String, java.lang.Object> rules;
        private final java.lang.Object scheduleGroups;
        private final java.util.Map<java.lang.String, java.lang.String> scheduleGroupTimeouts;
        private final java.util.Map<java.lang.String, java.lang.Object> schedules;
        private final java.lang.String schemasDiscovererDescription;
        private final java.util.List<java.lang.String> sfnTargetArns;
        private final java.util.List<java.lang.String> snsTargetArns;
        private final java.util.List<java.lang.String> sqsTargetArns;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Object targets;
        private final java.util.List<java.lang.String> trustedEntities;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final java.util.List<java.lang.Object> providers;
        private final java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiDestinations = software.amazon.jsii.Kernel.get(this, "apiDestinations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.appendConnectionPostfix = software.amazon.jsii.Kernel.get(this, "appendConnectionPostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.appendDestinationPostfix = software.amazon.jsii.Kernel.get(this, "appendDestinationPostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.appendPipePostfix = software.amazon.jsii.Kernel.get(this, "appendPipePostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.appendRulePostfix = software.amazon.jsii.Kernel.get(this, "appendRulePostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.appendScheduleGroupPostfix = software.amazon.jsii.Kernel.get(this, "appendScheduleGroupPostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.appendSchedulePostfix = software.amazon.jsii.Kernel.get(this, "appendSchedulePostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.archives = software.amazon.jsii.Kernel.get(this, "archives", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.attachApiDestinationPolicy = software.amazon.jsii.Kernel.get(this, "attachApiDestinationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachCloudwatchPolicy = software.amazon.jsii.Kernel.get(this, "attachCloudwatchPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachEcsPolicy = software.amazon.jsii.Kernel.get(this, "attachEcsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachKinesisFirehosePolicy = software.amazon.jsii.Kernel.get(this, "attachKinesisFirehosePolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachKinesisPolicy = software.amazon.jsii.Kernel.get(this, "attachKinesisPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachLambdaPolicy = software.amazon.jsii.Kernel.get(this, "attachLambdaPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicies = software.amazon.jsii.Kernel.get(this, "attachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicy = software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyJson = software.amazon.jsii.Kernel.get(this, "attachPolicyJson", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyJsons = software.amazon.jsii.Kernel.get(this, "attachPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyStatements = software.amazon.jsii.Kernel.get(this, "attachPolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachSfnPolicy = software.amazon.jsii.Kernel.get(this, "attachSfnPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachSnsPolicy = software.amazon.jsii.Kernel.get(this, "attachSnsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachSqsPolicy = software.amazon.jsii.Kernel.get(this, "attachSqsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachTracingPolicy = software.amazon.jsii.Kernel.get(this, "attachTracingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.busName = software.amazon.jsii.Kernel.get(this, "busName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchTargetArns = software.amazon.jsii.Kernel.get(this, "cloudwatchTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.connections = software.amazon.jsii.Kernel.get(this, "connections", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createApiDestinations = software.amazon.jsii.Kernel.get(this, "createApiDestinations", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createArchives = software.amazon.jsii.Kernel.get(this, "createArchives", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createBus = software.amazon.jsii.Kernel.get(this, "createBus", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createConnections = software.amazon.jsii.Kernel.get(this, "createConnections", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createPermissions = software.amazon.jsii.Kernel.get(this, "createPermissions", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createPipes = software.amazon.jsii.Kernel.get(this, "createPipes", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createRole = software.amazon.jsii.Kernel.get(this, "createRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createRules = software.amazon.jsii.Kernel.get(this, "createRules", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createScheduleGroups = software.amazon.jsii.Kernel.get(this, "createScheduleGroups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createSchedules = software.amazon.jsii.Kernel.get(this, "createSchedules", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createSchemasDiscoverer = software.amazon.jsii.Kernel.get(this, "createSchemasDiscoverer", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createTargets = software.amazon.jsii.Kernel.get(this, "createTargets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ecsTargetArns = software.amazon.jsii.Kernel.get(this, "ecsTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.eventSourceName = software.amazon.jsii.Kernel.get(this, "eventSourceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kinesisFirehoseTargetArns = software.amazon.jsii.Kernel.get(this, "kinesisFirehoseTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.kinesisTargetArns = software.amazon.jsii.Kernel.get(this, "kinesisTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.lambdaTargetArns = software.amazon.jsii.Kernel.get(this, "lambdaTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.numberOfPolicies = software.amazon.jsii.Kernel.get(this, "numberOfPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.numberOfPolicyJsons = software.amazon.jsii.Kernel.get(this, "numberOfPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.permissions = software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.pipes = software.amazon.jsii.Kernel.get(this, "pipes", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.policies = software.amazon.jsii.Kernel.get(this, "policies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyJson = software.amazon.jsii.Kernel.get(this, "policyJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyJsons = software.amazon.jsii.Kernel.get(this, "policyJsons", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policyStatements = software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.roleDescription = software.amazon.jsii.Kernel.get(this, "roleDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleForceDetachPolicies = software.amazon.jsii.Kernel.get(this, "roleForceDetachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.roleName = software.amazon.jsii.Kernel.get(this, "roleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rolePath = software.amazon.jsii.Kernel.get(this, "rolePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rolePermissionsBoundary = software.amazon.jsii.Kernel.get(this, "rolePermissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleTags = software.amazon.jsii.Kernel.get(this, "roleTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.rules = software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.scheduleGroups = software.amazon.jsii.Kernel.get(this, "scheduleGroups", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.scheduleGroupTimeouts = software.amazon.jsii.Kernel.get(this, "scheduleGroupTimeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.schedules = software.amazon.jsii.Kernel.get(this, "schedules", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.schemasDiscovererDescription = software.amazon.jsii.Kernel.get(this, "schemasDiscovererDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sfnTargetArns = software.amazon.jsii.Kernel.get(this, "sfnTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.snsTargetArns = software.amazon.jsii.Kernel.get(this, "snsTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sqsTargetArns = software.amazon.jsii.Kernel.get(this, "sqsTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.targets = software.amazon.jsii.Kernel.get(this, "targets", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.trustedEntities = software.amazon.jsii.Kernel.get(this, "trustedEntities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.providers = software.amazon.jsii.Kernel.get(this, "providers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.skipAssetCreationFromLocalModules = software.amazon.jsii.Kernel.get(this, "skipAssetCreationFromLocalModules", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiDestinations = (java.util.Map<java.lang.String, java.lang.Object>)builder.apiDestinations;
            this.appendConnectionPostfix = builder.appendConnectionPostfix;
            this.appendDestinationPostfix = builder.appendDestinationPostfix;
            this.appendPipePostfix = builder.appendPipePostfix;
            this.appendRulePostfix = builder.appendRulePostfix;
            this.appendScheduleGroupPostfix = builder.appendScheduleGroupPostfix;
            this.appendSchedulePostfix = builder.appendSchedulePostfix;
            this.archives = (java.util.Map<java.lang.String, java.lang.Object>)builder.archives;
            this.attachApiDestinationPolicy = builder.attachApiDestinationPolicy;
            this.attachCloudwatchPolicy = builder.attachCloudwatchPolicy;
            this.attachEcsPolicy = builder.attachEcsPolicy;
            this.attachKinesisFirehosePolicy = builder.attachKinesisFirehosePolicy;
            this.attachKinesisPolicy = builder.attachKinesisPolicy;
            this.attachLambdaPolicy = builder.attachLambdaPolicy;
            this.attachPolicies = builder.attachPolicies;
            this.attachPolicy = builder.attachPolicy;
            this.attachPolicyJson = builder.attachPolicyJson;
            this.attachPolicyJsons = builder.attachPolicyJsons;
            this.attachPolicyStatements = builder.attachPolicyStatements;
            this.attachSfnPolicy = builder.attachSfnPolicy;
            this.attachSnsPolicy = builder.attachSnsPolicy;
            this.attachSqsPolicy = builder.attachSqsPolicy;
            this.attachTracingPolicy = builder.attachTracingPolicy;
            this.busName = builder.busName;
            this.cloudwatchTargetArns = builder.cloudwatchTargetArns;
            this.connections = builder.connections;
            this.create = builder.create;
            this.createApiDestinations = builder.createApiDestinations;
            this.createArchives = builder.createArchives;
            this.createBus = builder.createBus;
            this.createConnections = builder.createConnections;
            this.createPermissions = builder.createPermissions;
            this.createPipes = builder.createPipes;
            this.createRole = builder.createRole;
            this.createRules = builder.createRules;
            this.createScheduleGroups = builder.createScheduleGroups;
            this.createSchedules = builder.createSchedules;
            this.createSchemasDiscoverer = builder.createSchemasDiscoverer;
            this.createTargets = builder.createTargets;
            this.ecsTargetArns = builder.ecsTargetArns;
            this.eventSourceName = builder.eventSourceName;
            this.kinesisFirehoseTargetArns = builder.kinesisFirehoseTargetArns;
            this.kinesisTargetArns = builder.kinesisTargetArns;
            this.lambdaTargetArns = builder.lambdaTargetArns;
            this.numberOfPolicies = builder.numberOfPolicies;
            this.numberOfPolicyJsons = builder.numberOfPolicyJsons;
            this.permissions = (java.util.Map<java.lang.String, java.lang.Object>)builder.permissions;
            this.pipes = builder.pipes;
            this.policies = builder.policies;
            this.policy = builder.policy;
            this.policyJson = builder.policyJson;
            this.policyJsons = builder.policyJsons;
            this.policyStatements = builder.policyStatements;
            this.roleDescription = builder.roleDescription;
            this.roleForceDetachPolicies = builder.roleForceDetachPolicies;
            this.roleName = builder.roleName;
            this.rolePath = builder.rolePath;
            this.rolePermissionsBoundary = builder.rolePermissionsBoundary;
            this.roleTags = builder.roleTags;
            this.rules = (java.util.Map<java.lang.String, java.lang.Object>)builder.rules;
            this.scheduleGroups = builder.scheduleGroups;
            this.scheduleGroupTimeouts = builder.scheduleGroupTimeouts;
            this.schedules = (java.util.Map<java.lang.String, java.lang.Object>)builder.schedules;
            this.schemasDiscovererDescription = builder.schemasDiscovererDescription;
            this.sfnTargetArns = builder.sfnTargetArns;
            this.snsTargetArns = builder.snsTargetArns;
            this.sqsTargetArns = builder.sqsTargetArns;
            this.tags = builder.tags;
            this.targets = builder.targets;
            this.trustedEntities = builder.trustedEntities;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getApiDestinations() {
            return this.apiDestinations;
        }

        @Override
        public final java.lang.Boolean getAppendConnectionPostfix() {
            return this.appendConnectionPostfix;
        }

        @Override
        public final java.lang.Boolean getAppendDestinationPostfix() {
            return this.appendDestinationPostfix;
        }

        @Override
        public final java.lang.Boolean getAppendPipePostfix() {
            return this.appendPipePostfix;
        }

        @Override
        public final java.lang.Boolean getAppendRulePostfix() {
            return this.appendRulePostfix;
        }

        @Override
        public final java.lang.Boolean getAppendScheduleGroupPostfix() {
            return this.appendScheduleGroupPostfix;
        }

        @Override
        public final java.lang.Boolean getAppendSchedulePostfix() {
            return this.appendSchedulePostfix;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getArchives() {
            return this.archives;
        }

        @Override
        public final java.lang.Boolean getAttachApiDestinationPolicy() {
            return this.attachApiDestinationPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachCloudwatchPolicy() {
            return this.attachCloudwatchPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachEcsPolicy() {
            return this.attachEcsPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachKinesisFirehosePolicy() {
            return this.attachKinesisFirehosePolicy;
        }

        @Override
        public final java.lang.Boolean getAttachKinesisPolicy() {
            return this.attachKinesisPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachLambdaPolicy() {
            return this.attachLambdaPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPolicies() {
            return this.attachPolicies;
        }

        @Override
        public final java.lang.Boolean getAttachPolicy() {
            return this.attachPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPolicyJson() {
            return this.attachPolicyJson;
        }

        @Override
        public final java.lang.Boolean getAttachPolicyJsons() {
            return this.attachPolicyJsons;
        }

        @Override
        public final java.lang.Boolean getAttachPolicyStatements() {
            return this.attachPolicyStatements;
        }

        @Override
        public final java.lang.Boolean getAttachSfnPolicy() {
            return this.attachSfnPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachSnsPolicy() {
            return this.attachSnsPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachSqsPolicy() {
            return this.attachSqsPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachTracingPolicy() {
            return this.attachTracingPolicy;
        }

        @Override
        public final java.lang.String getBusName() {
            return this.busName;
        }

        @Override
        public final java.util.List<java.lang.String> getCloudwatchTargetArns() {
            return this.cloudwatchTargetArns;
        }

        @Override
        public final java.lang.Object getConnections() {
            return this.connections;
        }

        @Override
        public final java.lang.Boolean getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.Boolean getCreateApiDestinations() {
            return this.createApiDestinations;
        }

        @Override
        public final java.lang.Boolean getCreateArchives() {
            return this.createArchives;
        }

        @Override
        public final java.lang.Boolean getCreateBus() {
            return this.createBus;
        }

        @Override
        public final java.lang.Boolean getCreateConnections() {
            return this.createConnections;
        }

        @Override
        public final java.lang.Boolean getCreatePermissions() {
            return this.createPermissions;
        }

        @Override
        public final java.lang.Boolean getCreatePipes() {
            return this.createPipes;
        }

        @Override
        public final java.lang.Boolean getCreateRole() {
            return this.createRole;
        }

        @Override
        public final java.lang.Boolean getCreateRules() {
            return this.createRules;
        }

        @Override
        public final java.lang.Boolean getCreateScheduleGroups() {
            return this.createScheduleGroups;
        }

        @Override
        public final java.lang.Boolean getCreateSchedules() {
            return this.createSchedules;
        }

        @Override
        public final java.lang.Boolean getCreateSchemasDiscoverer() {
            return this.createSchemasDiscoverer;
        }

        @Override
        public final java.lang.Boolean getCreateTargets() {
            return this.createTargets;
        }

        @Override
        public final java.util.List<java.lang.String> getEcsTargetArns() {
            return this.ecsTargetArns;
        }

        @Override
        public final java.lang.String getEventSourceName() {
            return this.eventSourceName;
        }

        @Override
        public final java.util.List<java.lang.String> getKinesisFirehoseTargetArns() {
            return this.kinesisFirehoseTargetArns;
        }

        @Override
        public final java.util.List<java.lang.String> getKinesisTargetArns() {
            return this.kinesisTargetArns;
        }

        @Override
        public final java.util.List<java.lang.String> getLambdaTargetArns() {
            return this.lambdaTargetArns;
        }

        @Override
        public final java.lang.Number getNumberOfPolicies() {
            return this.numberOfPolicies;
        }

        @Override
        public final java.lang.Number getNumberOfPolicyJsons() {
            return this.numberOfPolicyJsons;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getPermissions() {
            return this.permissions;
        }

        @Override
        public final java.lang.Object getPipes() {
            return this.pipes;
        }

        @Override
        public final java.util.List<java.lang.String> getPolicies() {
            return this.policies;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.String getPolicyJson() {
            return this.policyJson;
        }

        @Override
        public final java.util.List<java.lang.String> getPolicyJsons() {
            return this.policyJsons;
        }

        @Override
        public final java.lang.Object getPolicyStatements() {
            return this.policyStatements;
        }

        @Override
        public final java.lang.String getRoleDescription() {
            return this.roleDescription;
        }

        @Override
        public final java.lang.Boolean getRoleForceDetachPolicies() {
            return this.roleForceDetachPolicies;
        }

        @Override
        public final java.lang.String getRoleName() {
            return this.roleName;
        }

        @Override
        public final java.lang.String getRolePath() {
            return this.rolePath;
        }

        @Override
        public final java.lang.String getRolePermissionsBoundary() {
            return this.rolePermissionsBoundary;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getRoleTags() {
            return this.roleTags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getRules() {
            return this.rules;
        }

        @Override
        public final java.lang.Object getScheduleGroups() {
            return this.scheduleGroups;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getScheduleGroupTimeouts() {
            return this.scheduleGroupTimeouts;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getSchedules() {
            return this.schedules;
        }

        @Override
        public final java.lang.String getSchemasDiscovererDescription() {
            return this.schemasDiscovererDescription;
        }

        @Override
        public final java.util.List<java.lang.String> getSfnTargetArns() {
            return this.sfnTargetArns;
        }

        @Override
        public final java.util.List<java.lang.String> getSnsTargetArns() {
            return this.snsTargetArns;
        }

        @Override
        public final java.util.List<java.lang.String> getSqsTargetArns() {
            return this.sqsTargetArns;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Object getTargets() {
            return this.targets;
        }

        @Override
        public final java.util.List<java.lang.String> getTrustedEntities() {
            return this.trustedEntities;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final java.util.List<java.lang.Object> getProviders() {
            return this.providers;
        }

        @Override
        public final java.lang.Boolean getSkipAssetCreationFromLocalModules() {
            return this.skipAssetCreationFromLocalModules;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiDestinations() != null) {
                data.set("apiDestinations", om.valueToTree(this.getApiDestinations()));
            }
            if (this.getAppendConnectionPostfix() != null) {
                data.set("appendConnectionPostfix", om.valueToTree(this.getAppendConnectionPostfix()));
            }
            if (this.getAppendDestinationPostfix() != null) {
                data.set("appendDestinationPostfix", om.valueToTree(this.getAppendDestinationPostfix()));
            }
            if (this.getAppendPipePostfix() != null) {
                data.set("appendPipePostfix", om.valueToTree(this.getAppendPipePostfix()));
            }
            if (this.getAppendRulePostfix() != null) {
                data.set("appendRulePostfix", om.valueToTree(this.getAppendRulePostfix()));
            }
            if (this.getAppendScheduleGroupPostfix() != null) {
                data.set("appendScheduleGroupPostfix", om.valueToTree(this.getAppendScheduleGroupPostfix()));
            }
            if (this.getAppendSchedulePostfix() != null) {
                data.set("appendSchedulePostfix", om.valueToTree(this.getAppendSchedulePostfix()));
            }
            if (this.getArchives() != null) {
                data.set("archives", om.valueToTree(this.getArchives()));
            }
            if (this.getAttachApiDestinationPolicy() != null) {
                data.set("attachApiDestinationPolicy", om.valueToTree(this.getAttachApiDestinationPolicy()));
            }
            if (this.getAttachCloudwatchPolicy() != null) {
                data.set("attachCloudwatchPolicy", om.valueToTree(this.getAttachCloudwatchPolicy()));
            }
            if (this.getAttachEcsPolicy() != null) {
                data.set("attachEcsPolicy", om.valueToTree(this.getAttachEcsPolicy()));
            }
            if (this.getAttachKinesisFirehosePolicy() != null) {
                data.set("attachKinesisFirehosePolicy", om.valueToTree(this.getAttachKinesisFirehosePolicy()));
            }
            if (this.getAttachKinesisPolicy() != null) {
                data.set("attachKinesisPolicy", om.valueToTree(this.getAttachKinesisPolicy()));
            }
            if (this.getAttachLambdaPolicy() != null) {
                data.set("attachLambdaPolicy", om.valueToTree(this.getAttachLambdaPolicy()));
            }
            if (this.getAttachPolicies() != null) {
                data.set("attachPolicies", om.valueToTree(this.getAttachPolicies()));
            }
            if (this.getAttachPolicy() != null) {
                data.set("attachPolicy", om.valueToTree(this.getAttachPolicy()));
            }
            if (this.getAttachPolicyJson() != null) {
                data.set("attachPolicyJson", om.valueToTree(this.getAttachPolicyJson()));
            }
            if (this.getAttachPolicyJsons() != null) {
                data.set("attachPolicyJsons", om.valueToTree(this.getAttachPolicyJsons()));
            }
            if (this.getAttachPolicyStatements() != null) {
                data.set("attachPolicyStatements", om.valueToTree(this.getAttachPolicyStatements()));
            }
            if (this.getAttachSfnPolicy() != null) {
                data.set("attachSfnPolicy", om.valueToTree(this.getAttachSfnPolicy()));
            }
            if (this.getAttachSnsPolicy() != null) {
                data.set("attachSnsPolicy", om.valueToTree(this.getAttachSnsPolicy()));
            }
            if (this.getAttachSqsPolicy() != null) {
                data.set("attachSqsPolicy", om.valueToTree(this.getAttachSqsPolicy()));
            }
            if (this.getAttachTracingPolicy() != null) {
                data.set("attachTracingPolicy", om.valueToTree(this.getAttachTracingPolicy()));
            }
            if (this.getBusName() != null) {
                data.set("busName", om.valueToTree(this.getBusName()));
            }
            if (this.getCloudwatchTargetArns() != null) {
                data.set("cloudwatchTargetArns", om.valueToTree(this.getCloudwatchTargetArns()));
            }
            if (this.getConnections() != null) {
                data.set("connections", om.valueToTree(this.getConnections()));
            }
            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getCreateApiDestinations() != null) {
                data.set("createApiDestinations", om.valueToTree(this.getCreateApiDestinations()));
            }
            if (this.getCreateArchives() != null) {
                data.set("createArchives", om.valueToTree(this.getCreateArchives()));
            }
            if (this.getCreateBus() != null) {
                data.set("createBus", om.valueToTree(this.getCreateBus()));
            }
            if (this.getCreateConnections() != null) {
                data.set("createConnections", om.valueToTree(this.getCreateConnections()));
            }
            if (this.getCreatePermissions() != null) {
                data.set("createPermissions", om.valueToTree(this.getCreatePermissions()));
            }
            if (this.getCreatePipes() != null) {
                data.set("createPipes", om.valueToTree(this.getCreatePipes()));
            }
            if (this.getCreateRole() != null) {
                data.set("createRole", om.valueToTree(this.getCreateRole()));
            }
            if (this.getCreateRules() != null) {
                data.set("createRules", om.valueToTree(this.getCreateRules()));
            }
            if (this.getCreateScheduleGroups() != null) {
                data.set("createScheduleGroups", om.valueToTree(this.getCreateScheduleGroups()));
            }
            if (this.getCreateSchedules() != null) {
                data.set("createSchedules", om.valueToTree(this.getCreateSchedules()));
            }
            if (this.getCreateSchemasDiscoverer() != null) {
                data.set("createSchemasDiscoverer", om.valueToTree(this.getCreateSchemasDiscoverer()));
            }
            if (this.getCreateTargets() != null) {
                data.set("createTargets", om.valueToTree(this.getCreateTargets()));
            }
            if (this.getEcsTargetArns() != null) {
                data.set("ecsTargetArns", om.valueToTree(this.getEcsTargetArns()));
            }
            if (this.getEventSourceName() != null) {
                data.set("eventSourceName", om.valueToTree(this.getEventSourceName()));
            }
            if (this.getKinesisFirehoseTargetArns() != null) {
                data.set("kinesisFirehoseTargetArns", om.valueToTree(this.getKinesisFirehoseTargetArns()));
            }
            if (this.getKinesisTargetArns() != null) {
                data.set("kinesisTargetArns", om.valueToTree(this.getKinesisTargetArns()));
            }
            if (this.getLambdaTargetArns() != null) {
                data.set("lambdaTargetArns", om.valueToTree(this.getLambdaTargetArns()));
            }
            if (this.getNumberOfPolicies() != null) {
                data.set("numberOfPolicies", om.valueToTree(this.getNumberOfPolicies()));
            }
            if (this.getNumberOfPolicyJsons() != null) {
                data.set("numberOfPolicyJsons", om.valueToTree(this.getNumberOfPolicyJsons()));
            }
            if (this.getPermissions() != null) {
                data.set("permissions", om.valueToTree(this.getPermissions()));
            }
            if (this.getPipes() != null) {
                data.set("pipes", om.valueToTree(this.getPipes()));
            }
            if (this.getPolicies() != null) {
                data.set("policies", om.valueToTree(this.getPolicies()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getPolicyJson() != null) {
                data.set("policyJson", om.valueToTree(this.getPolicyJson()));
            }
            if (this.getPolicyJsons() != null) {
                data.set("policyJsons", om.valueToTree(this.getPolicyJsons()));
            }
            if (this.getPolicyStatements() != null) {
                data.set("policyStatements", om.valueToTree(this.getPolicyStatements()));
            }
            if (this.getRoleDescription() != null) {
                data.set("roleDescription", om.valueToTree(this.getRoleDescription()));
            }
            if (this.getRoleForceDetachPolicies() != null) {
                data.set("roleForceDetachPolicies", om.valueToTree(this.getRoleForceDetachPolicies()));
            }
            if (this.getRoleName() != null) {
                data.set("roleName", om.valueToTree(this.getRoleName()));
            }
            if (this.getRolePath() != null) {
                data.set("rolePath", om.valueToTree(this.getRolePath()));
            }
            if (this.getRolePermissionsBoundary() != null) {
                data.set("rolePermissionsBoundary", om.valueToTree(this.getRolePermissionsBoundary()));
            }
            if (this.getRoleTags() != null) {
                data.set("roleTags", om.valueToTree(this.getRoleTags()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }
            if (this.getScheduleGroups() != null) {
                data.set("scheduleGroups", om.valueToTree(this.getScheduleGroups()));
            }
            if (this.getScheduleGroupTimeouts() != null) {
                data.set("scheduleGroupTimeouts", om.valueToTree(this.getScheduleGroupTimeouts()));
            }
            if (this.getSchedules() != null) {
                data.set("schedules", om.valueToTree(this.getSchedules()));
            }
            if (this.getSchemasDiscovererDescription() != null) {
                data.set("schemasDiscovererDescription", om.valueToTree(this.getSchemasDiscovererDescription()));
            }
            if (this.getSfnTargetArns() != null) {
                data.set("sfnTargetArns", om.valueToTree(this.getSfnTargetArns()));
            }
            if (this.getSnsTargetArns() != null) {
                data.set("snsTargetArns", om.valueToTree(this.getSnsTargetArns()));
            }
            if (this.getSqsTargetArns() != null) {
                data.set("sqsTargetArns", om.valueToTree(this.getSqsTargetArns()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTargets() != null) {
                data.set("targets", om.valueToTree(this.getTargets()));
            }
            if (this.getTrustedEntities() != null) {
                data.set("trustedEntities", om.valueToTree(this.getTrustedEntities()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getProviders() != null) {
                data.set("providers", om.valueToTree(this.getProviders()));
            }
            if (this.getSkipAssetCreationFromLocalModules() != null) {
                data.set("skipAssetCreationFromLocalModules", om.valueToTree(this.getSkipAssetCreationFromLocalModules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("eventbridge.EventbridgeConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventbridgeConfig.Jsii$Proxy that = (EventbridgeConfig.Jsii$Proxy) o;

            if (this.apiDestinations != null ? !this.apiDestinations.equals(that.apiDestinations) : that.apiDestinations != null) return false;
            if (this.appendConnectionPostfix != null ? !this.appendConnectionPostfix.equals(that.appendConnectionPostfix) : that.appendConnectionPostfix != null) return false;
            if (this.appendDestinationPostfix != null ? !this.appendDestinationPostfix.equals(that.appendDestinationPostfix) : that.appendDestinationPostfix != null) return false;
            if (this.appendPipePostfix != null ? !this.appendPipePostfix.equals(that.appendPipePostfix) : that.appendPipePostfix != null) return false;
            if (this.appendRulePostfix != null ? !this.appendRulePostfix.equals(that.appendRulePostfix) : that.appendRulePostfix != null) return false;
            if (this.appendScheduleGroupPostfix != null ? !this.appendScheduleGroupPostfix.equals(that.appendScheduleGroupPostfix) : that.appendScheduleGroupPostfix != null) return false;
            if (this.appendSchedulePostfix != null ? !this.appendSchedulePostfix.equals(that.appendSchedulePostfix) : that.appendSchedulePostfix != null) return false;
            if (this.archives != null ? !this.archives.equals(that.archives) : that.archives != null) return false;
            if (this.attachApiDestinationPolicy != null ? !this.attachApiDestinationPolicy.equals(that.attachApiDestinationPolicy) : that.attachApiDestinationPolicy != null) return false;
            if (this.attachCloudwatchPolicy != null ? !this.attachCloudwatchPolicy.equals(that.attachCloudwatchPolicy) : that.attachCloudwatchPolicy != null) return false;
            if (this.attachEcsPolicy != null ? !this.attachEcsPolicy.equals(that.attachEcsPolicy) : that.attachEcsPolicy != null) return false;
            if (this.attachKinesisFirehosePolicy != null ? !this.attachKinesisFirehosePolicy.equals(that.attachKinesisFirehosePolicy) : that.attachKinesisFirehosePolicy != null) return false;
            if (this.attachKinesisPolicy != null ? !this.attachKinesisPolicy.equals(that.attachKinesisPolicy) : that.attachKinesisPolicy != null) return false;
            if (this.attachLambdaPolicy != null ? !this.attachLambdaPolicy.equals(that.attachLambdaPolicy) : that.attachLambdaPolicy != null) return false;
            if (this.attachPolicies != null ? !this.attachPolicies.equals(that.attachPolicies) : that.attachPolicies != null) return false;
            if (this.attachPolicy != null ? !this.attachPolicy.equals(that.attachPolicy) : that.attachPolicy != null) return false;
            if (this.attachPolicyJson != null ? !this.attachPolicyJson.equals(that.attachPolicyJson) : that.attachPolicyJson != null) return false;
            if (this.attachPolicyJsons != null ? !this.attachPolicyJsons.equals(that.attachPolicyJsons) : that.attachPolicyJsons != null) return false;
            if (this.attachPolicyStatements != null ? !this.attachPolicyStatements.equals(that.attachPolicyStatements) : that.attachPolicyStatements != null) return false;
            if (this.attachSfnPolicy != null ? !this.attachSfnPolicy.equals(that.attachSfnPolicy) : that.attachSfnPolicy != null) return false;
            if (this.attachSnsPolicy != null ? !this.attachSnsPolicy.equals(that.attachSnsPolicy) : that.attachSnsPolicy != null) return false;
            if (this.attachSqsPolicy != null ? !this.attachSqsPolicy.equals(that.attachSqsPolicy) : that.attachSqsPolicy != null) return false;
            if (this.attachTracingPolicy != null ? !this.attachTracingPolicy.equals(that.attachTracingPolicy) : that.attachTracingPolicy != null) return false;
            if (this.busName != null ? !this.busName.equals(that.busName) : that.busName != null) return false;
            if (this.cloudwatchTargetArns != null ? !this.cloudwatchTargetArns.equals(that.cloudwatchTargetArns) : that.cloudwatchTargetArns != null) return false;
            if (this.connections != null ? !this.connections.equals(that.connections) : that.connections != null) return false;
            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            if (this.createApiDestinations != null ? !this.createApiDestinations.equals(that.createApiDestinations) : that.createApiDestinations != null) return false;
            if (this.createArchives != null ? !this.createArchives.equals(that.createArchives) : that.createArchives != null) return false;
            if (this.createBus != null ? !this.createBus.equals(that.createBus) : that.createBus != null) return false;
            if (this.createConnections != null ? !this.createConnections.equals(that.createConnections) : that.createConnections != null) return false;
            if (this.createPermissions != null ? !this.createPermissions.equals(that.createPermissions) : that.createPermissions != null) return false;
            if (this.createPipes != null ? !this.createPipes.equals(that.createPipes) : that.createPipes != null) return false;
            if (this.createRole != null ? !this.createRole.equals(that.createRole) : that.createRole != null) return false;
            if (this.createRules != null ? !this.createRules.equals(that.createRules) : that.createRules != null) return false;
            if (this.createScheduleGroups != null ? !this.createScheduleGroups.equals(that.createScheduleGroups) : that.createScheduleGroups != null) return false;
            if (this.createSchedules != null ? !this.createSchedules.equals(that.createSchedules) : that.createSchedules != null) return false;
            if (this.createSchemasDiscoverer != null ? !this.createSchemasDiscoverer.equals(that.createSchemasDiscoverer) : that.createSchemasDiscoverer != null) return false;
            if (this.createTargets != null ? !this.createTargets.equals(that.createTargets) : that.createTargets != null) return false;
            if (this.ecsTargetArns != null ? !this.ecsTargetArns.equals(that.ecsTargetArns) : that.ecsTargetArns != null) return false;
            if (this.eventSourceName != null ? !this.eventSourceName.equals(that.eventSourceName) : that.eventSourceName != null) return false;
            if (this.kinesisFirehoseTargetArns != null ? !this.kinesisFirehoseTargetArns.equals(that.kinesisFirehoseTargetArns) : that.kinesisFirehoseTargetArns != null) return false;
            if (this.kinesisTargetArns != null ? !this.kinesisTargetArns.equals(that.kinesisTargetArns) : that.kinesisTargetArns != null) return false;
            if (this.lambdaTargetArns != null ? !this.lambdaTargetArns.equals(that.lambdaTargetArns) : that.lambdaTargetArns != null) return false;
            if (this.numberOfPolicies != null ? !this.numberOfPolicies.equals(that.numberOfPolicies) : that.numberOfPolicies != null) return false;
            if (this.numberOfPolicyJsons != null ? !this.numberOfPolicyJsons.equals(that.numberOfPolicyJsons) : that.numberOfPolicyJsons != null) return false;
            if (this.permissions != null ? !this.permissions.equals(that.permissions) : that.permissions != null) return false;
            if (this.pipes != null ? !this.pipes.equals(that.pipes) : that.pipes != null) return false;
            if (this.policies != null ? !this.policies.equals(that.policies) : that.policies != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.policyJson != null ? !this.policyJson.equals(that.policyJson) : that.policyJson != null) return false;
            if (this.policyJsons != null ? !this.policyJsons.equals(that.policyJsons) : that.policyJsons != null) return false;
            if (this.policyStatements != null ? !this.policyStatements.equals(that.policyStatements) : that.policyStatements != null) return false;
            if (this.roleDescription != null ? !this.roleDescription.equals(that.roleDescription) : that.roleDescription != null) return false;
            if (this.roleForceDetachPolicies != null ? !this.roleForceDetachPolicies.equals(that.roleForceDetachPolicies) : that.roleForceDetachPolicies != null) return false;
            if (this.roleName != null ? !this.roleName.equals(that.roleName) : that.roleName != null) return false;
            if (this.rolePath != null ? !this.rolePath.equals(that.rolePath) : that.rolePath != null) return false;
            if (this.rolePermissionsBoundary != null ? !this.rolePermissionsBoundary.equals(that.rolePermissionsBoundary) : that.rolePermissionsBoundary != null) return false;
            if (this.roleTags != null ? !this.roleTags.equals(that.roleTags) : that.roleTags != null) return false;
            if (this.rules != null ? !this.rules.equals(that.rules) : that.rules != null) return false;
            if (this.scheduleGroups != null ? !this.scheduleGroups.equals(that.scheduleGroups) : that.scheduleGroups != null) return false;
            if (this.scheduleGroupTimeouts != null ? !this.scheduleGroupTimeouts.equals(that.scheduleGroupTimeouts) : that.scheduleGroupTimeouts != null) return false;
            if (this.schedules != null ? !this.schedules.equals(that.schedules) : that.schedules != null) return false;
            if (this.schemasDiscovererDescription != null ? !this.schemasDiscovererDescription.equals(that.schemasDiscovererDescription) : that.schemasDiscovererDescription != null) return false;
            if (this.sfnTargetArns != null ? !this.sfnTargetArns.equals(that.sfnTargetArns) : that.sfnTargetArns != null) return false;
            if (this.snsTargetArns != null ? !this.snsTargetArns.equals(that.snsTargetArns) : that.snsTargetArns != null) return false;
            if (this.sqsTargetArns != null ? !this.sqsTargetArns.equals(that.sqsTargetArns) : that.sqsTargetArns != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.targets != null ? !this.targets.equals(that.targets) : that.targets != null) return false;
            if (this.trustedEntities != null ? !this.trustedEntities.equals(that.trustedEntities) : that.trustedEntities != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.apiDestinations != null ? this.apiDestinations.hashCode() : 0;
            result = 31 * result + (this.appendConnectionPostfix != null ? this.appendConnectionPostfix.hashCode() : 0);
            result = 31 * result + (this.appendDestinationPostfix != null ? this.appendDestinationPostfix.hashCode() : 0);
            result = 31 * result + (this.appendPipePostfix != null ? this.appendPipePostfix.hashCode() : 0);
            result = 31 * result + (this.appendRulePostfix != null ? this.appendRulePostfix.hashCode() : 0);
            result = 31 * result + (this.appendScheduleGroupPostfix != null ? this.appendScheduleGroupPostfix.hashCode() : 0);
            result = 31 * result + (this.appendSchedulePostfix != null ? this.appendSchedulePostfix.hashCode() : 0);
            result = 31 * result + (this.archives != null ? this.archives.hashCode() : 0);
            result = 31 * result + (this.attachApiDestinationPolicy != null ? this.attachApiDestinationPolicy.hashCode() : 0);
            result = 31 * result + (this.attachCloudwatchPolicy != null ? this.attachCloudwatchPolicy.hashCode() : 0);
            result = 31 * result + (this.attachEcsPolicy != null ? this.attachEcsPolicy.hashCode() : 0);
            result = 31 * result + (this.attachKinesisFirehosePolicy != null ? this.attachKinesisFirehosePolicy.hashCode() : 0);
            result = 31 * result + (this.attachKinesisPolicy != null ? this.attachKinesisPolicy.hashCode() : 0);
            result = 31 * result + (this.attachLambdaPolicy != null ? this.attachLambdaPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPolicies != null ? this.attachPolicies.hashCode() : 0);
            result = 31 * result + (this.attachPolicy != null ? this.attachPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPolicyJson != null ? this.attachPolicyJson.hashCode() : 0);
            result = 31 * result + (this.attachPolicyJsons != null ? this.attachPolicyJsons.hashCode() : 0);
            result = 31 * result + (this.attachPolicyStatements != null ? this.attachPolicyStatements.hashCode() : 0);
            result = 31 * result + (this.attachSfnPolicy != null ? this.attachSfnPolicy.hashCode() : 0);
            result = 31 * result + (this.attachSnsPolicy != null ? this.attachSnsPolicy.hashCode() : 0);
            result = 31 * result + (this.attachSqsPolicy != null ? this.attachSqsPolicy.hashCode() : 0);
            result = 31 * result + (this.attachTracingPolicy != null ? this.attachTracingPolicy.hashCode() : 0);
            result = 31 * result + (this.busName != null ? this.busName.hashCode() : 0);
            result = 31 * result + (this.cloudwatchTargetArns != null ? this.cloudwatchTargetArns.hashCode() : 0);
            result = 31 * result + (this.connections != null ? this.connections.hashCode() : 0);
            result = 31 * result + (this.create != null ? this.create.hashCode() : 0);
            result = 31 * result + (this.createApiDestinations != null ? this.createApiDestinations.hashCode() : 0);
            result = 31 * result + (this.createArchives != null ? this.createArchives.hashCode() : 0);
            result = 31 * result + (this.createBus != null ? this.createBus.hashCode() : 0);
            result = 31 * result + (this.createConnections != null ? this.createConnections.hashCode() : 0);
            result = 31 * result + (this.createPermissions != null ? this.createPermissions.hashCode() : 0);
            result = 31 * result + (this.createPipes != null ? this.createPipes.hashCode() : 0);
            result = 31 * result + (this.createRole != null ? this.createRole.hashCode() : 0);
            result = 31 * result + (this.createRules != null ? this.createRules.hashCode() : 0);
            result = 31 * result + (this.createScheduleGroups != null ? this.createScheduleGroups.hashCode() : 0);
            result = 31 * result + (this.createSchedules != null ? this.createSchedules.hashCode() : 0);
            result = 31 * result + (this.createSchemasDiscoverer != null ? this.createSchemasDiscoverer.hashCode() : 0);
            result = 31 * result + (this.createTargets != null ? this.createTargets.hashCode() : 0);
            result = 31 * result + (this.ecsTargetArns != null ? this.ecsTargetArns.hashCode() : 0);
            result = 31 * result + (this.eventSourceName != null ? this.eventSourceName.hashCode() : 0);
            result = 31 * result + (this.kinesisFirehoseTargetArns != null ? this.kinesisFirehoseTargetArns.hashCode() : 0);
            result = 31 * result + (this.kinesisTargetArns != null ? this.kinesisTargetArns.hashCode() : 0);
            result = 31 * result + (this.lambdaTargetArns != null ? this.lambdaTargetArns.hashCode() : 0);
            result = 31 * result + (this.numberOfPolicies != null ? this.numberOfPolicies.hashCode() : 0);
            result = 31 * result + (this.numberOfPolicyJsons != null ? this.numberOfPolicyJsons.hashCode() : 0);
            result = 31 * result + (this.permissions != null ? this.permissions.hashCode() : 0);
            result = 31 * result + (this.pipes != null ? this.pipes.hashCode() : 0);
            result = 31 * result + (this.policies != null ? this.policies.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.policyJson != null ? this.policyJson.hashCode() : 0);
            result = 31 * result + (this.policyJsons != null ? this.policyJsons.hashCode() : 0);
            result = 31 * result + (this.policyStatements != null ? this.policyStatements.hashCode() : 0);
            result = 31 * result + (this.roleDescription != null ? this.roleDescription.hashCode() : 0);
            result = 31 * result + (this.roleForceDetachPolicies != null ? this.roleForceDetachPolicies.hashCode() : 0);
            result = 31 * result + (this.roleName != null ? this.roleName.hashCode() : 0);
            result = 31 * result + (this.rolePath != null ? this.rolePath.hashCode() : 0);
            result = 31 * result + (this.rolePermissionsBoundary != null ? this.rolePermissionsBoundary.hashCode() : 0);
            result = 31 * result + (this.roleTags != null ? this.roleTags.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            result = 31 * result + (this.scheduleGroups != null ? this.scheduleGroups.hashCode() : 0);
            result = 31 * result + (this.scheduleGroupTimeouts != null ? this.scheduleGroupTimeouts.hashCode() : 0);
            result = 31 * result + (this.schedules != null ? this.schedules.hashCode() : 0);
            result = 31 * result + (this.schemasDiscovererDescription != null ? this.schemasDiscovererDescription.hashCode() : 0);
            result = 31 * result + (this.sfnTargetArns != null ? this.sfnTargetArns.hashCode() : 0);
            result = 31 * result + (this.snsTargetArns != null ? this.snsTargetArns.hashCode() : 0);
            result = 31 * result + (this.sqsTargetArns != null ? this.sqsTargetArns.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.targets != null ? this.targets.hashCode() : 0);
            result = 31 * result + (this.trustedEntities != null ? this.trustedEntities.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
