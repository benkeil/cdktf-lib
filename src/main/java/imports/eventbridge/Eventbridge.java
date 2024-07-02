package imports.eventbridge;

/**
 * Defines an Eventbridge based on a Terraform module.
 * <p>
 * Docs at Terraform Registry: {@link https://registry.terraform.io/modules/terraform-aws-modules/eventbridge/aws/~> 3.5 terraform-aws-modules/eventbridge/aws}
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.313Z")
@software.amazon.jsii.Jsii(module = imports.eventbridge.$Module.class, fqn = "eventbridge.Eventbridge")
public class Eventbridge extends com.hashicorp.cdktf.TerraformModule {

    protected Eventbridge(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Eventbridge(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Eventbridge(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.eventbridge.EventbridgeConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public Eventbridge(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeHclAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeHclAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeApiDestinationArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeApiDestinationArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeApiDestinationsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeApiDestinationsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeArchiveArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeArchiveArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeArchivesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeArchivesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeBusArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeBusArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeBusNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeBusNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeBusOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeBusOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeConnectionArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeConnectionArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeConnectionIdsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeConnectionIdsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeConnectionsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeConnectionsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeIamRolesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeIamRolesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePermissionIdsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePermissionIdsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePermissionsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePermissionsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePipeArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePipeArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePipeIdsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePipeIdsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePipeRoleArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePipeRoleArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePipeRoleNamesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePipeRoleNamesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePipesIamRolesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePipesIamRolesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgePipesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgePipesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeRoleArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeRoleArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeRoleNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeRoleNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeRuleArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeRuleArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeRuleIdsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeRuleIdsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeRulesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeRulesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeScheduleArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeScheduleArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeScheduleGroupArnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeScheduleGroupArnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeScheduleGroupIdsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeScheduleGroupIdsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeScheduleGroupsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeScheduleGroupsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeScheduleGroupStatesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeScheduleGroupStatesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeScheduleIdsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeScheduleIdsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeSchedulesOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeSchedulesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventbridgeTargetsOutput() {
        return software.amazon.jsii.Kernel.get(this, "eventbridgeTargetsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getConnections() {
        return software.amazon.jsii.Kernel.get(this, "connections", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setConnections(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "connections", java.util.Objects.requireNonNull(value, "connections is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPipes() {
        return software.amazon.jsii.Kernel.get(this, "pipes", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPipes(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "pipes", java.util.Objects.requireNonNull(value, "pipes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPolicyStatements(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "policyStatements", java.util.Objects.requireNonNull(value, "policyStatements is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getScheduleGroups() {
        return software.amazon.jsii.Kernel.get(this, "scheduleGroups", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setScheduleGroups(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "scheduleGroups", java.util.Objects.requireNonNull(value, "scheduleGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getTargets() {
        return software.amazon.jsii.Kernel.get(this, "targets", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setTargets(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "targets", java.util.Objects.requireNonNull(value, "targets is required"));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getApiDestinations() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "apiDestinations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setApiDestinations(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "apiDestinations", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendConnectionPostfix() {
        return software.amazon.jsii.Kernel.get(this, "appendConnectionPostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAppendConnectionPostfix(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "appendConnectionPostfix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendDestinationPostfix() {
        return software.amazon.jsii.Kernel.get(this, "appendDestinationPostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAppendDestinationPostfix(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "appendDestinationPostfix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendPipePostfix() {
        return software.amazon.jsii.Kernel.get(this, "appendPipePostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAppendPipePostfix(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "appendPipePostfix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendRulePostfix() {
        return software.amazon.jsii.Kernel.get(this, "appendRulePostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAppendRulePostfix(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "appendRulePostfix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendScheduleGroupPostfix() {
        return software.amazon.jsii.Kernel.get(this, "appendScheduleGroupPostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAppendScheduleGroupPostfix(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "appendScheduleGroupPostfix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAppendSchedulePostfix() {
        return software.amazon.jsii.Kernel.get(this, "appendSchedulePostfix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAppendSchedulePostfix(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "appendSchedulePostfix", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getArchives() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "archives", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setArchives(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "archives", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachApiDestinationPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachApiDestinationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachApiDestinationPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachApiDestinationPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCloudwatchPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachCloudwatchPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachCloudwatchPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachCloudwatchPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachEcsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachEcsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachEcsPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachEcsPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachKinesisFirehosePolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachKinesisFirehosePolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachKinesisFirehosePolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachKinesisFirehosePolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachKinesisPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachKinesisPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachKinesisPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachKinesisPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachLambdaPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachLambdaPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachLambdaPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachLambdaPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicies() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicies(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJson() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicyJson", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicyJson(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicyJson", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJsons() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicyJsons(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicyJsons", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicyStatements(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicyStatements", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachSfnPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachSfnPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachSfnPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachSfnPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachSnsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachSnsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachSnsPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachSnsPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachSqsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachSqsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachSqsPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachSqsPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachTracingPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachTracingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachTracingPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachTracingPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBusName() {
        return software.amazon.jsii.Kernel.get(this, "busName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBusName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "busName", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCloudwatchTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "cloudwatchTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setCloudwatchTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreate(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "create", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateApiDestinations() {
        return software.amazon.jsii.Kernel.get(this, "createApiDestinations", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateApiDestinations(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createApiDestinations", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateArchives() {
        return software.amazon.jsii.Kernel.get(this, "createArchives", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateArchives(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createArchives", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateBus() {
        return software.amazon.jsii.Kernel.get(this, "createBus", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateBus(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createBus", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateConnections() {
        return software.amazon.jsii.Kernel.get(this, "createConnections", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateConnections(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createConnections", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePermissions() {
        return software.amazon.jsii.Kernel.get(this, "createPermissions", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreatePermissions(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createPermissions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePipes() {
        return software.amazon.jsii.Kernel.get(this, "createPipes", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreatePipes(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createPipes", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRole() {
        return software.amazon.jsii.Kernel.get(this, "createRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateRole(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRules() {
        return software.amazon.jsii.Kernel.get(this, "createRules", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateRules(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createRules", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateScheduleGroups() {
        return software.amazon.jsii.Kernel.get(this, "createScheduleGroups", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateScheduleGroups(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createScheduleGroups", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSchedules() {
        return software.amazon.jsii.Kernel.get(this, "createSchedules", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateSchedules(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createSchedules", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSchemasDiscoverer() {
        return software.amazon.jsii.Kernel.get(this, "createSchemasDiscoverer", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateSchemasDiscoverer(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createSchemasDiscoverer", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateTargets() {
        return software.amazon.jsii.Kernel.get(this, "createTargets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateTargets(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createTargets", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEcsTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ecsTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setEcsTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ecsTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventSourceName() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventSourceName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventSourceName", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getKinesisFirehoseTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "kinesisFirehoseTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setKinesisFirehoseTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "kinesisFirehoseTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getKinesisTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "kinesisTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setKinesisTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "kinesisTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLambdaTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "lambdaTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setLambdaTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "lambdaTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicies() {
        return software.amazon.jsii.Kernel.get(this, "numberOfPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfPolicies(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfPolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicyJsons() {
        return software.amazon.jsii.Kernel.get(this, "numberOfPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNumberOfPolicyJsons(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "numberOfPolicyJsons", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getPermissions() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setPermissions(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "permissions", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicies() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "policies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setPolicies(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "policies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyJson() {
        return software.amazon.jsii.Kernel.get(this, "policyJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyJson(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyJson", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyJsons() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "policyJsons", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setPolicyJsons(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "policyJsons", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleDescription() {
        return software.amazon.jsii.Kernel.get(this, "roleDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleDescription", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRoleForceDetachPolicies() {
        return software.amazon.jsii.Kernel.get(this, "roleForceDetachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRoleForceDetachPolicies(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "roleForceDetachPolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleName() {
        return software.amazon.jsii.Kernel.get(this, "roleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleName", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRolePath() {
        return software.amazon.jsii.Kernel.get(this, "rolePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRolePath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rolePath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRolePermissionsBoundary() {
        return software.amazon.jsii.Kernel.get(this, "rolePermissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRolePermissionsBoundary(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rolePermissionsBoundary", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRoleTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "roleTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setRoleTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "roleTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getRules() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "rules", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setRules(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "rules", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getScheduleGroupTimeouts() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "scheduleGroupTimeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setScheduleGroupTimeouts(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "scheduleGroupTimeouts", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getSchedules() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "schedules", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setSchedules(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "schedules", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSchemasDiscovererDescription() {
        return software.amazon.jsii.Kernel.get(this, "schemasDiscovererDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSchemasDiscovererDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "schemasDiscovererDescription", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSfnTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sfnTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setSfnTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "sfnTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSnsTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "snsTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setSnsTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "snsTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSqsTargetArns() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sqsTargetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setSqsTargetArns(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "sqsTargetArns", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTrustedEntities() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "trustedEntities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setTrustedEntities(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "trustedEntities", value);
    }

    /**
     * A fluent builder for {@link imports.eventbridge.Eventbridge}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.eventbridge.Eventbridge> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope This parameter is required.
         * @param id This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private imports.eventbridge.EventbridgeConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param providers This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder providers(final java.util.List<? extends java.lang.Object> providers) {
            this.config().providers(providers);
            return this;
        }

        /**
         * @return {@code this}
         * @param skipAssetCreationFromLocalModules This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder skipAssetCreationFromLocalModules(final java.lang.Boolean skipAssetCreationFromLocalModules) {
            this.config().skipAssetCreationFromLocalModules(skipAssetCreationFromLocalModules);
            return this;
        }

        /**
         * A map of objects with EventBridge Destination definitions.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param apiDestinations A map of objects with EventBridge Destination definitions. This parameter is required.
         */
        public Builder apiDestinations(final java.util.Map<java.lang.String, ? extends java.lang.Object> apiDestinations) {
            this.config().apiDestinations(apiDestinations);
            return this;
        }

        /**
         * Controls whether to append '-connection' to the name of the connection true.
         * <p>
         * @return {@code this}
         * @param appendConnectionPostfix Controls whether to append '-connection' to the name of the connection true. This parameter is required.
         */
        public Builder appendConnectionPostfix(final java.lang.Boolean appendConnectionPostfix) {
            this.config().appendConnectionPostfix(appendConnectionPostfix);
            return this;
        }

        /**
         * Controls whether to append '-destination' to the name of the destination true.
         * <p>
         * @return {@code this}
         * @param appendDestinationPostfix Controls whether to append '-destination' to the name of the destination true. This parameter is required.
         */
        public Builder appendDestinationPostfix(final java.lang.Boolean appendDestinationPostfix) {
            this.config().appendDestinationPostfix(appendDestinationPostfix);
            return this;
        }

        /**
         * Controls whether to append '-pipe' to the name of the pipe true.
         * <p>
         * @return {@code this}
         * @param appendPipePostfix Controls whether to append '-pipe' to the name of the pipe true. This parameter is required.
         */
        public Builder appendPipePostfix(final java.lang.Boolean appendPipePostfix) {
            this.config().appendPipePostfix(appendPipePostfix);
            return this;
        }

        /**
         * Controls whether to append '-rule' to the name of the rule true.
         * <p>
         * @return {@code this}
         * @param appendRulePostfix Controls whether to append '-rule' to the name of the rule true. This parameter is required.
         */
        public Builder appendRulePostfix(final java.lang.Boolean appendRulePostfix) {
            this.config().appendRulePostfix(appendRulePostfix);
            return this;
        }

        /**
         * Controls whether to append '-group' to the name of the schedule group true.
         * <p>
         * @return {@code this}
         * @param appendScheduleGroupPostfix Controls whether to append '-group' to the name of the schedule group true. This parameter is required.
         */
        public Builder appendScheduleGroupPostfix(final java.lang.Boolean appendScheduleGroupPostfix) {
            this.config().appendScheduleGroupPostfix(appendScheduleGroupPostfix);
            return this;
        }

        /**
         * Controls whether to append '-schedule' to the name of the schedule true.
         * <p>
         * @return {@code this}
         * @param appendSchedulePostfix Controls whether to append '-schedule' to the name of the schedule true. This parameter is required.
         */
        public Builder appendSchedulePostfix(final java.lang.Boolean appendSchedulePostfix) {
            this.config().appendSchedulePostfix(appendSchedulePostfix);
            return this;
        }

        /**
         * A map of objects with the EventBridge Archive definitions.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param archives A map of objects with the EventBridge Archive definitions. This parameter is required.
         */
        public Builder archives(final java.util.Map<java.lang.String, ? extends java.lang.Object> archives) {
            this.config().archives(archives);
            return this;
        }

        /**
         * Controls whether the API Destination policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachApiDestinationPolicy Controls whether the API Destination policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachApiDestinationPolicy(final java.lang.Boolean attachApiDestinationPolicy) {
            this.config().attachApiDestinationPolicy(attachApiDestinationPolicy);
            return this;
        }

        /**
         * Controls whether the Cloudwatch policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachCloudwatchPolicy Controls whether the Cloudwatch policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachCloudwatchPolicy(final java.lang.Boolean attachCloudwatchPolicy) {
            this.config().attachCloudwatchPolicy(attachCloudwatchPolicy);
            return this;
        }

        /**
         * Controls whether the ECS policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachEcsPolicy Controls whether the ECS policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachEcsPolicy(final java.lang.Boolean attachEcsPolicy) {
            this.config().attachEcsPolicy(attachEcsPolicy);
            return this;
        }

        /**
         * Controls whether the Kinesis Firehose policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachKinesisFirehosePolicy Controls whether the Kinesis Firehose policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachKinesisFirehosePolicy(final java.lang.Boolean attachKinesisFirehosePolicy) {
            this.config().attachKinesisFirehosePolicy(attachKinesisFirehosePolicy);
            return this;
        }

        /**
         * Controls whether the Kinesis policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachKinesisPolicy Controls whether the Kinesis policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachKinesisPolicy(final java.lang.Boolean attachKinesisPolicy) {
            this.config().attachKinesisPolicy(attachKinesisPolicy);
            return this;
        }

        /**
         * Controls whether the Lambda Function policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachLambdaPolicy Controls whether the Lambda Function policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachLambdaPolicy(final java.lang.Boolean attachLambdaPolicy) {
            this.config().attachLambdaPolicy(attachLambdaPolicy);
            return this;
        }

        /**
         * Controls whether list of policies should be added to IAM role.
         * <p>
         * @return {@code this}
         * @param attachPolicies Controls whether list of policies should be added to IAM role. This parameter is required.
         */
        public Builder attachPolicies(final java.lang.Boolean attachPolicies) {
            this.config().attachPolicies(attachPolicies);
            return this;
        }

        /**
         * Controls whether policy should be added to IAM role.
         * <p>
         * @return {@code this}
         * @param attachPolicy Controls whether policy should be added to IAM role. This parameter is required.
         */
        public Builder attachPolicy(final java.lang.Boolean attachPolicy) {
            this.config().attachPolicy(attachPolicy);
            return this;
        }

        /**
         * Controls whether policy_json should be added to IAM role.
         * <p>
         * @return {@code this}
         * @param attachPolicyJson Controls whether policy_json should be added to IAM role. This parameter is required.
         */
        public Builder attachPolicyJson(final java.lang.Boolean attachPolicyJson) {
            this.config().attachPolicyJson(attachPolicyJson);
            return this;
        }

        /**
         * Controls whether policy_jsons should be added to IAM role.
         * <p>
         * @return {@code this}
         * @param attachPolicyJsons Controls whether policy_jsons should be added to IAM role. This parameter is required.
         */
        public Builder attachPolicyJsons(final java.lang.Boolean attachPolicyJsons) {
            this.config().attachPolicyJsons(attachPolicyJsons);
            return this;
        }

        /**
         * Controls whether policy_statements should be added to IAM role.
         * <p>
         * @return {@code this}
         * @param attachPolicyStatements Controls whether policy_statements should be added to IAM role. This parameter is required.
         */
        public Builder attachPolicyStatements(final java.lang.Boolean attachPolicyStatements) {
            this.config().attachPolicyStatements(attachPolicyStatements);
            return this;
        }

        /**
         * Controls whether the StepFunction policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachSfnPolicy Controls whether the StepFunction policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachSfnPolicy(final java.lang.Boolean attachSfnPolicy) {
            this.config().attachSfnPolicy(attachSfnPolicy);
            return this;
        }

        /**
         * Controls whether the SNS policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachSnsPolicy Controls whether the SNS policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachSnsPolicy(final java.lang.Boolean attachSnsPolicy) {
            this.config().attachSnsPolicy(attachSnsPolicy);
            return this;
        }

        /**
         * Controls whether the SQS policy should be added to IAM role for EventBridge Target.
         * <p>
         * @return {@code this}
         * @param attachSqsPolicy Controls whether the SQS policy should be added to IAM role for EventBridge Target. This parameter is required.
         */
        public Builder attachSqsPolicy(final java.lang.Boolean attachSqsPolicy) {
            this.config().attachSqsPolicy(attachSqsPolicy);
            return this;
        }

        /**
         * Controls whether X-Ray tracing policy should be added to IAM role for EventBridge.
         * <p>
         * @return {@code this}
         * @param attachTracingPolicy Controls whether X-Ray tracing policy should be added to IAM role for EventBridge. This parameter is required.
         */
        public Builder attachTracingPolicy(final java.lang.Boolean attachTracingPolicy) {
            this.config().attachTracingPolicy(attachTracingPolicy);
            return this;
        }

        /**
         * A unique name for your EventBridge Bus default.
         * <p>
         * @return {@code this}
         * @param busName A unique name for your EventBridge Bus default. This parameter is required.
         */
        public Builder busName(final java.lang.String busName) {
            this.config().busName(busName);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the Cloudwatch Log Streams you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param cloudwatchTargetArns The Amazon Resource Name (ARN) of the Cloudwatch Log Streams you want to use as EventBridge targets. This parameter is required.
         */
        public Builder cloudwatchTargetArns(final java.util.List<java.lang.String> cloudwatchTargetArns) {
            this.config().cloudwatchTargetArns(cloudwatchTargetArns);
            return this;
        }

        /**
         * A map of objects with EventBridge Connection definitions.
         * <p>
         * @return {@code this}
         * @param connections A map of objects with EventBridge Connection definitions. This parameter is required.
         */
        public Builder connections(final java.lang.Object connections) {
            this.config().connections(connections);
            return this;
        }

        /**
         * Controls whether resources should be created true.
         * <p>
         * @return {@code this}
         * @param create Controls whether resources should be created true. This parameter is required.
         */
        public Builder create(final java.lang.Boolean create) {
            this.config().create(create);
            return this;
        }

        /**
         * Controls whether EventBridge Destination resources should be created.
         * <p>
         * @return {@code this}
         * @param createApiDestinations Controls whether EventBridge Destination resources should be created. This parameter is required.
         */
        public Builder createApiDestinations(final java.lang.Boolean createApiDestinations) {
            this.config().createApiDestinations(createApiDestinations);
            return this;
        }

        /**
         * Controls whether EventBridge Archive resources should be created.
         * <p>
         * @return {@code this}
         * @param createArchives Controls whether EventBridge Archive resources should be created. This parameter is required.
         */
        public Builder createArchives(final java.lang.Boolean createArchives) {
            this.config().createArchives(createArchives);
            return this;
        }

        /**
         * Controls whether EventBridge Bus resource should be created true.
         * <p>
         * @return {@code this}
         * @param createBus Controls whether EventBridge Bus resource should be created true. This parameter is required.
         */
        public Builder createBus(final java.lang.Boolean createBus) {
            this.config().createBus(createBus);
            return this;
        }

        /**
         * Controls whether EventBridge Connection resources should be created.
         * <p>
         * @return {@code this}
         * @param createConnections Controls whether EventBridge Connection resources should be created. This parameter is required.
         */
        public Builder createConnections(final java.lang.Boolean createConnections) {
            this.config().createConnections(createConnections);
            return this;
        }

        /**
         * Controls whether EventBridge Permission resources should be created true.
         * <p>
         * @return {@code this}
         * @param createPermissions Controls whether EventBridge Permission resources should be created true. This parameter is required.
         */
        public Builder createPermissions(final java.lang.Boolean createPermissions) {
            this.config().createPermissions(createPermissions);
            return this;
        }

        /**
         * Controls whether EventBridge Pipes resources should be created true.
         * <p>
         * @return {@code this}
         * @param createPipes Controls whether EventBridge Pipes resources should be created true. This parameter is required.
         */
        public Builder createPipes(final java.lang.Boolean createPipes) {
            this.config().createPipes(createPipes);
            return this;
        }

        /**
         * Controls whether IAM roles should be created true.
         * <p>
         * @return {@code this}
         * @param createRole Controls whether IAM roles should be created true. This parameter is required.
         */
        public Builder createRole(final java.lang.Boolean createRole) {
            this.config().createRole(createRole);
            return this;
        }

        /**
         * Controls whether EventBridge Rule resources should be created true.
         * <p>
         * @return {@code this}
         * @param createRules Controls whether EventBridge Rule resources should be created true. This parameter is required.
         */
        public Builder createRules(final java.lang.Boolean createRules) {
            this.config().createRules(createRules);
            return this;
        }

        /**
         * Controls whether EventBridge Schedule Group resources should be created true.
         * <p>
         * @return {@code this}
         * @param createScheduleGroups Controls whether EventBridge Schedule Group resources should be created true. This parameter is required.
         */
        public Builder createScheduleGroups(final java.lang.Boolean createScheduleGroups) {
            this.config().createScheduleGroups(createScheduleGroups);
            return this;
        }

        /**
         * Controls whether EventBridge Schedule resources should be created true.
         * <p>
         * @return {@code this}
         * @param createSchedules Controls whether EventBridge Schedule resources should be created true. This parameter is required.
         */
        public Builder createSchedules(final java.lang.Boolean createSchedules) {
            this.config().createSchedules(createSchedules);
            return this;
        }

        /**
         * Controls whether default schemas discoverer should be created.
         * <p>
         * @return {@code this}
         * @param createSchemasDiscoverer Controls whether default schemas discoverer should be created. This parameter is required.
         */
        public Builder createSchemasDiscoverer(final java.lang.Boolean createSchemasDiscoverer) {
            this.config().createSchemasDiscoverer(createSchemasDiscoverer);
            return this;
        }

        /**
         * Controls whether EventBridge Target resources should be created true.
         * <p>
         * @return {@code this}
         * @param createTargets Controls whether EventBridge Target resources should be created true. This parameter is required.
         */
        public Builder createTargets(final java.lang.Boolean createTargets) {
            this.config().createTargets(createTargets);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the AWS ECS Tasks you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param ecsTargetArns The Amazon Resource Name (ARN) of the AWS ECS Tasks you want to use as EventBridge targets. This parameter is required.
         */
        public Builder ecsTargetArns(final java.util.List<java.lang.String> ecsTargetArns) {
            this.config().ecsTargetArns(ecsTargetArns);
            return this;
        }

        /**
         * The partner event source that the new event bus will be matched with.
         * <p>
         * Must match name.
         * <p>
         * @return {@code this}
         * @param eventSourceName The partner event source that the new event bus will be matched with. This parameter is required.
         */
        public Builder eventSourceName(final java.lang.String eventSourceName) {
            this.config().eventSourceName(eventSourceName);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the Kinesis Firehose Delivery Streams you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param kinesisFirehoseTargetArns The Amazon Resource Name (ARN) of the Kinesis Firehose Delivery Streams you want to use as EventBridge targets. This parameter is required.
         */
        public Builder kinesisFirehoseTargetArns(final java.util.List<java.lang.String> kinesisFirehoseTargetArns) {
            this.config().kinesisFirehoseTargetArns(kinesisFirehoseTargetArns);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the Kinesis Streams you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param kinesisTargetArns The Amazon Resource Name (ARN) of the Kinesis Streams you want to use as EventBridge targets. This parameter is required.
         */
        public Builder kinesisTargetArns(final java.util.List<java.lang.String> kinesisTargetArns) {
            this.config().kinesisTargetArns(kinesisTargetArns);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the Lambda Functions you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param lambdaTargetArns The Amazon Resource Name (ARN) of the Lambda Functions you want to use as EventBridge targets. This parameter is required.
         */
        public Builder lambdaTargetArns(final java.util.List<java.lang.String> lambdaTargetArns) {
            this.config().lambdaTargetArns(lambdaTargetArns);
            return this;
        }

        /**
         * Number of policies to attach to IAM role.
         * <p>
         * @return {@code this}
         * @param numberOfPolicies Number of policies to attach to IAM role. This parameter is required.
         */
        public Builder numberOfPolicies(final java.lang.Number numberOfPolicies) {
            this.config().numberOfPolicies(numberOfPolicies);
            return this;
        }

        /**
         * Number of policies JSON to attach to IAM role.
         * <p>
         * @return {@code this}
         * @param numberOfPolicyJsons Number of policies JSON to attach to IAM role. This parameter is required.
         */
        public Builder numberOfPolicyJsons(final java.lang.Number numberOfPolicyJsons) {
            this.config().numberOfPolicyJsons(numberOfPolicyJsons);
            return this;
        }

        /**
         * A map of objects with EventBridge Permission definitions.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param permissions A map of objects with EventBridge Permission definitions. This parameter is required.
         */
        public Builder permissions(final java.util.Map<java.lang.String, ? extends java.lang.Object> permissions) {
            this.config().permissions(permissions);
            return this;
        }

        /**
         * A map of objects with EventBridge Pipe definitions.
         * <p>
         * @return {@code this}
         * @param pipes A map of objects with EventBridge Pipe definitions. This parameter is required.
         */
        public Builder pipes(final java.lang.Object pipes) {
            this.config().pipes(pipes);
            return this;
        }

        /**
         * List of policy statements ARN to attach to IAM role.
         * <p>
         * @return {@code this}
         * @param policies List of policy statements ARN to attach to IAM role. This parameter is required.
         */
        public Builder policies(final java.util.List<java.lang.String> policies) {
            this.config().policies(policies);
            return this;
        }

        /**
         * An additional policy document ARN to attach to IAM role.
         * <p>
         * @return {@code this}
         * @param policy An additional policy document ARN to attach to IAM role. This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config().policy(policy);
            return this;
        }

        /**
         * An additional policy document as JSON to attach to IAM role.
         * <p>
         * @return {@code this}
         * @param policyJson An additional policy document as JSON to attach to IAM role. This parameter is required.
         */
        public Builder policyJson(final java.lang.String policyJson) {
            this.config().policyJson(policyJson);
            return this;
        }

        /**
         * List of additional policy documents as JSON to attach to IAM role.
         * <p>
         * @return {@code this}
         * @param policyJsons List of additional policy documents as JSON to attach to IAM role. This parameter is required.
         */
        public Builder policyJsons(final java.util.List<java.lang.String> policyJsons) {
            this.config().policyJsons(policyJsons);
            return this;
        }

        /**
         * Map of dynamic policy statements to attach to IAM role.
         * <p>
         * @return {@code this}
         * @param policyStatements Map of dynamic policy statements to attach to IAM role. This parameter is required.
         */
        public Builder policyStatements(final java.lang.Object policyStatements) {
            this.config().policyStatements(policyStatements);
            return this;
        }

        /**
         * Description of IAM role to use for EventBridge.
         * <p>
         * @return {@code this}
         * @param roleDescription Description of IAM role to use for EventBridge. This parameter is required.
         */
        public Builder roleDescription(final java.lang.String roleDescription) {
            this.config().roleDescription(roleDescription);
            return this;
        }

        /**
         * Specifies to force detaching any policies the IAM role has before destroying it.
         * <p>
         * true
         * <p>
         * @return {@code this}
         * @param roleForceDetachPolicies Specifies to force detaching any policies the IAM role has before destroying it. This parameter is required.
         */
        public Builder roleForceDetachPolicies(final java.lang.Boolean roleForceDetachPolicies) {
            this.config().roleForceDetachPolicies(roleForceDetachPolicies);
            return this;
        }

        /**
         * Name of IAM role to use for EventBridge.
         * <p>
         * @return {@code this}
         * @param roleName Name of IAM role to use for EventBridge. This parameter is required.
         */
        public Builder roleName(final java.lang.String roleName) {
            this.config().roleName(roleName);
            return this;
        }

        /**
         * Path of IAM role to use for EventBridge.
         * <p>
         * @return {@code this}
         * @param rolePath Path of IAM role to use for EventBridge. This parameter is required.
         */
        public Builder rolePath(final java.lang.String rolePath) {
            this.config().rolePath(rolePath);
            return this;
        }

        /**
         * The ARN of the policy that is used to set the permissions boundary for the IAM role used by EventBridge.
         * <p>
         * @return {@code this}
         * @param rolePermissionsBoundary The ARN of the policy that is used to set the permissions boundary for the IAM role used by EventBridge. This parameter is required.
         */
        public Builder rolePermissionsBoundary(final java.lang.String rolePermissionsBoundary) {
            this.config().rolePermissionsBoundary(rolePermissionsBoundary);
            return this;
        }

        /**
         * A map of tags to assign to IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param roleTags A map of tags to assign to IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder roleTags(final java.util.Map<java.lang.String, java.lang.String> roleTags) {
            this.config().roleTags(roleTags);
            return this;
        }

        /**
         * A map of objects with EventBridge Rule definitions.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param rules A map of objects with EventBridge Rule definitions. This parameter is required.
         */
        public Builder rules(final java.util.Map<java.lang.String, ? extends java.lang.Object> rules) {
            this.config().rules(rules);
            return this;
        }

        /**
         * A map of objects with EventBridge Schedule Group definitions.
         * <p>
         * @return {@code this}
         * @param scheduleGroups A map of objects with EventBridge Schedule Group definitions. This parameter is required.
         */
        public Builder scheduleGroups(final java.lang.Object scheduleGroups) {
            this.config().scheduleGroups(scheduleGroups);
            return this;
        }

        /**
         * A map of objects with EventBridge Schedule Group create and delete timeouts.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param scheduleGroupTimeouts A map of objects with EventBridge Schedule Group create and delete timeouts. This parameter is required.
         */
        public Builder scheduleGroupTimeouts(final java.util.Map<java.lang.String, java.lang.String> scheduleGroupTimeouts) {
            this.config().scheduleGroupTimeouts(scheduleGroupTimeouts);
            return this;
        }

        /**
         * A map of objects with EventBridge Schedule definitions.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param schedules A map of objects with EventBridge Schedule definitions. This parameter is required.
         */
        public Builder schedules(final java.util.Map<java.lang.String, ? extends java.lang.Object> schedules) {
            this.config().schedules(schedules);
            return this;
        }

        /**
         * Default schemas discoverer description Auto schemas discoverer event.
         * <p>
         * @return {@code this}
         * @param schemasDiscovererDescription Default schemas discoverer description Auto schemas discoverer event. This parameter is required.
         */
        public Builder schemasDiscovererDescription(final java.lang.String schemasDiscovererDescription) {
            this.config().schemasDiscovererDescription(schemasDiscovererDescription);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the StepFunctions you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param sfnTargetArns The Amazon Resource Name (ARN) of the StepFunctions you want to use as EventBridge targets. This parameter is required.
         */
        public Builder sfnTargetArns(final java.util.List<java.lang.String> sfnTargetArns) {
            this.config().sfnTargetArns(sfnTargetArns);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the AWS SNS's you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param snsTargetArns The Amazon Resource Name (ARN) of the AWS SNS's you want to use as EventBridge targets. This parameter is required.
         */
        public Builder snsTargetArns(final java.util.List<java.lang.String> snsTargetArns) {
            this.config().snsTargetArns(snsTargetArns);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the AWS SQS Queues you want to use as EventBridge targets.
         * <p>
         * @return {@code this}
         * @param sqsTargetArns The Amazon Resource Name (ARN) of the AWS SQS Queues you want to use as EventBridge targets. This parameter is required.
         */
        public Builder sqsTargetArns(final java.util.List<java.lang.String> sqsTargetArns) {
            this.config().sqsTargetArns(sqsTargetArns);
            return this;
        }

        /**
         * A map of tags to assign to resources.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param tags A map of tags to assign to resources. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * A map of objects with EventBridge Target definitions.
         * <p>
         * @return {@code this}
         * @param targets A map of objects with EventBridge Target definitions. This parameter is required.
         */
        public Builder targets(final java.lang.Object targets) {
            this.config().targets(targets);
            return this;
        }

        /**
         * Additional trusted entities for assuming roles (trust relationship).
         * <p>
         * @return {@code this}
         * @param trustedEntities Additional trusted entities for assuming roles (trust relationship). This parameter is required.
         */
        public Builder trustedEntities(final java.util.List<java.lang.String> trustedEntities) {
            this.config().trustedEntities(trustedEntities);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.eventbridge.Eventbridge}.
         */
        @Override
        public imports.eventbridge.Eventbridge build() {
            return new imports.eventbridge.Eventbridge(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.eventbridge.EventbridgeConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.eventbridge.EventbridgeConfig.Builder();
            }
            return this.config;
        }
    }
}
