package imports.step_functions;

/**
 * Defines an StepFunctions based on a Terraform module.
 * <p>
 * Docs at Terraform Registry: {@link https://registry.terraform.io/modules/terraform-aws-modules/step-functions/aws/~> 4.2 terraform-aws-modules/step-functions/aws}
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.367Z")
@software.amazon.jsii.Jsii(module = imports.step_functions.$Module.class, fqn = "step-functions.StepFunctions")
public class StepFunctions extends com.hashicorp.cdktf.TerraformModule {

    protected StepFunctions(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StepFunctions(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public StepFunctions(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.step_functions.StepFunctionsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public StepFunctions(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
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

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchLogGroupArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchLogGroupNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "roleNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateMachineArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "stateMachineArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateMachineCreationDateOutput() {
        return software.amazon.jsii.Kernel.get(this, "stateMachineCreationDateOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateMachineIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "stateMachineIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateMachineNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "stateMachineNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateMachineStatusOutput() {
        return software.amazon.jsii.Kernel.get(this, "stateMachineStatusOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateMachineVersionArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "stateMachineVersionArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPolicyStatements(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "policyStatements", java.util.Objects.requireNonNull(value, "policyStatements is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getServiceIntegrations() {
        return software.amazon.jsii.Kernel.get(this, "serviceIntegrations", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setServiceIntegrations(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "serviceIntegrations", java.util.Objects.requireNonNull(value, "serviceIntegrations is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCloudwatchLogsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachCloudwatchLogsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachCloudwatchLogsPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachCloudwatchLogsPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicies() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicies(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPoliciesForIntegrations() {
        return software.amazon.jsii.Kernel.get(this, "attachPoliciesForIntegrations", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPoliciesForIntegrations(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPoliciesForIntegrations", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getAwsRegionAssumeRole() {
        return software.amazon.jsii.Kernel.get(this, "awsRegionAssumeRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAwsRegionAssumeRole(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "awsRegionAssumeRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroupKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchLogGroupKmsKeyId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogGroupKmsKeyId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroupName() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchLogGroupName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogGroupName", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCloudwatchLogGroupRetentionInDays() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupRetentionInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCloudwatchLogGroupRetentionInDays(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogGroupRetentionInDays", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCloudwatchLogGroupTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setCloudwatchLogGroupTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogGroupTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreate(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "create", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRole() {
        return software.amazon.jsii.Kernel.get(this, "createRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateRole(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefinition() {
        return software.amazon.jsii.Kernel.get(this, "definition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefinition(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "definition", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLoggingConfiguration() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "loggingConfiguration", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setLoggingConfiguration(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "loggingConfiguration", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyPath() {
        return software.amazon.jsii.Kernel.get(this, "policyPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPublish() {
        return software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPublish(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publish", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", value);
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

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSfnStateMachineTimeouts() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sfnStateMachineTimeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setSfnStateMachineTimeouts(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "sfnStateMachineTimeouts", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUseExistingCloudwatchLogGroup() {
        return software.amazon.jsii.Kernel.get(this, "useExistingCloudwatchLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUseExistingCloudwatchLogGroup(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useExistingCloudwatchLogGroup", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUseExistingRole() {
        return software.amazon.jsii.Kernel.get(this, "useExistingRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUseExistingRole(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useExistingRole", value);
    }

    /**
     * A fluent builder for {@link imports.step_functions.StepFunctions}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.step_functions.StepFunctions> {
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
        private imports.step_functions.StepFunctionsConfig.Builder config;

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
         * Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function true.
         * <p>
         * @return {@code this}
         * @param attachCloudwatchLogsPolicy Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function true. This parameter is required.
         */
        public Builder attachCloudwatchLogsPolicy(final java.lang.Boolean attachCloudwatchLogsPolicy) {
            this.config().attachCloudwatchLogsPolicy(attachCloudwatchLogsPolicy);
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
         * Whether to attach AWS Service policies to IAM role true.
         * <p>
         * @return {@code this}
         * @param attachPoliciesForIntegrations Whether to attach AWS Service policies to IAM role true. This parameter is required.
         */
        public Builder attachPoliciesForIntegrations(final java.lang.Boolean attachPoliciesForIntegrations) {
            this.config().attachPoliciesForIntegrations(attachPoliciesForIntegrations);
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
         * Name of AWS regions where IAM role can be assumed by the Step Function.
         * <p>
         * @return {@code this}
         * @param awsRegionAssumeRole Name of AWS regions where IAM role can be assumed by the Step Function. This parameter is required.
         */
        public Builder awsRegionAssumeRole(final java.lang.String awsRegionAssumeRole) {
            this.config().awsRegionAssumeRole(awsRegionAssumeRole);
            return this;
        }

        /**
         * The ARN of the KMS Key to use when encrypting log data.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogGroupKmsKeyId The ARN of the KMS Key to use when encrypting log data. This parameter is required.
         */
        public Builder cloudwatchLogGroupKmsKeyId(final java.lang.String cloudwatchLogGroupKmsKeyId) {
            this.config().cloudwatchLogGroupKmsKeyId(cloudwatchLogGroupKmsKeyId);
            return this;
        }

        /**
         * Name of Cloudwatch Logs group name to use.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogGroupName Name of Cloudwatch Logs group name to use. This parameter is required.
         */
        public Builder cloudwatchLogGroupName(final java.lang.String cloudwatchLogGroupName) {
            this.config().cloudwatchLogGroupName(cloudwatchLogGroupName);
            return this;
        }

        /**
         * Specifies the number of days you want to retain log events in the specified log group.
         * <p>
         * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogGroupRetentionInDays Specifies the number of days you want to retain log events in the specified log group. This parameter is required.
         */
        public Builder cloudwatchLogGroupRetentionInDays(final java.lang.Number cloudwatchLogGroupRetentionInDays) {
            this.config().cloudwatchLogGroupRetentionInDays(cloudwatchLogGroupRetentionInDays);
            return this;
        }

        /**
         * A map of tags to assign to the resource.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param cloudwatchLogGroupTags A map of tags to assign to the resource. This parameter is required.
         */
        public Builder cloudwatchLogGroupTags(final java.util.Map<java.lang.String, java.lang.String> cloudwatchLogGroupTags) {
            this.config().cloudwatchLogGroupTags(cloudwatchLogGroupTags);
            return this;
        }

        /**
         * Whether to create Step Function resource true.
         * <p>
         * @return {@code this}
         * @param create Whether to create Step Function resource true. This parameter is required.
         */
        public Builder create(final java.lang.Boolean create) {
            this.config().create(create);
            return this;
        }

        /**
         * Whether to create IAM role for the Step Function true.
         * <p>
         * @return {@code this}
         * @param createRole Whether to create IAM role for the Step Function true. This parameter is required.
         */
        public Builder createRole(final java.lang.Boolean createRole) {
            this.config().createRole(createRole);
            return this;
        }

        /**
         * The Amazon States Language definition of the Step Function.
         * <p>
         * @return {@code this}
         * @param definition The Amazon States Language definition of the Step Function. This parameter is required.
         */
        public Builder definition(final java.lang.String definition) {
            this.config().definition(definition);
            return this;
        }

        /**
         * Defines what execution history events are logged and where they are logged The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param loggingConfiguration Defines what execution history events are logged and where they are logged The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder loggingConfiguration(final java.util.Map<java.lang.String, java.lang.String> loggingConfiguration) {
            this.config().loggingConfiguration(loggingConfiguration);
            return this;
        }

        /**
         * The name of the Step Function.
         * <p>
         * @return {@code this}
         * @param name The name of the Step Function. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
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
         * Path of IAM policies to use for Step Function.
         * <p>
         * @return {@code this}
         * @param policyPath Path of IAM policies to use for Step Function. This parameter is required.
         */
        public Builder policyPath(final java.lang.String policyPath) {
            this.config().policyPath(policyPath);
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
         * Determines whether to set a version of the state machine when it is created.
         * <p>
         * @return {@code this}
         * @param publish Determines whether to set a version of the state machine when it is created. This parameter is required.
         */
        public Builder publish(final java.lang.Boolean publish) {
            this.config().publish(publish);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the IAM role to use for this Step Function.
         * <p>
         * @return {@code this}
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this Step Function. This parameter is required.
         */
        public Builder roleArn(final java.lang.String roleArn) {
            this.config().roleArn(roleArn);
            return this;
        }

        /**
         * Description of IAM role to use for Step Function.
         * <p>
         * @return {@code this}
         * @param roleDescription Description of IAM role to use for Step Function. This parameter is required.
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
         * Name of IAM role to use for Step Function.
         * <p>
         * @return {@code this}
         * @param roleName Name of IAM role to use for Step Function. This parameter is required.
         */
        public Builder roleName(final java.lang.String roleName) {
            this.config().roleName(roleName);
            return this;
        }

        /**
         * Path of IAM role to use for Step Function.
         * <p>
         * @return {@code this}
         * @param rolePath Path of IAM role to use for Step Function. This parameter is required.
         */
        public Builder rolePath(final java.lang.String rolePath) {
            this.config().rolePath(rolePath);
            return this;
        }

        /**
         * The ARN of the policy that is used to set the permissions boundary for the IAM role used by Step Function.
         * <p>
         * @return {@code this}
         * @param rolePermissionsBoundary The ARN of the policy that is used to set the permissions boundary for the IAM role used by Step Function. This parameter is required.
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
         * Map of AWS service integrations to allow in IAM role policy.
         * <p>
         * @return {@code this}
         * @param serviceIntegrations Map of AWS service integrations to allow in IAM role policy. This parameter is required.
         */
        public Builder serviceIntegrations(final java.lang.Object serviceIntegrations) {
            this.config().serviceIntegrations(serviceIntegrations);
            return this;
        }

        /**
         * Create, update, and delete timeout configurations for the step function.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param sfnStateMachineTimeouts Create, update, and delete timeout configurations for the step function. This parameter is required.
         */
        public Builder sfnStateMachineTimeouts(final java.util.Map<java.lang.String, java.lang.String> sfnStateMachineTimeouts) {
            this.config().sfnStateMachineTimeouts(sfnStateMachineTimeouts);
            return this;
        }

        /**
         * Maps of tags to assign to the Step Function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param tags Maps of tags to assign to the Step Function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * Step Function additional trusted entities for assuming roles (trust relationship).
         * <p>
         * @return {@code this}
         * @param trustedEntities Step Function additional trusted entities for assuming roles (trust relationship). This parameter is required.
         */
        public Builder trustedEntities(final java.util.List<java.lang.String> trustedEntities) {
            this.config().trustedEntities(trustedEntities);
            return this;
        }

        /**
         * Determines whether a Standard or Express state machine is created.
         * <p>
         * The default is STANDARD. Valid Values: STANDARD | EXPRESS
         * STANDARD
         * <p>
         * @return {@code this}
         * @param type Determines whether a Standard or Express state machine is created. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config().type(type);
            return this;
        }

        /**
         * Whether to use an existing CloudWatch log group or create new.
         * <p>
         * @return {@code this}
         * @param useExistingCloudwatchLogGroup Whether to use an existing CloudWatch log group or create new. This parameter is required.
         */
        public Builder useExistingCloudwatchLogGroup(final java.lang.Boolean useExistingCloudwatchLogGroup) {
            this.config().useExistingCloudwatchLogGroup(useExistingCloudwatchLogGroup);
            return this;
        }

        /**
         * Whether to use an existing IAM role for this Step Function.
         * <p>
         * @return {@code this}
         * @param useExistingRole Whether to use an existing IAM role for this Step Function. This parameter is required.
         */
        public Builder useExistingRole(final java.lang.Boolean useExistingRole) {
            this.config().useExistingRole(useExistingRole);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.step_functions.StepFunctions}.
         */
        @Override
        public imports.step_functions.StepFunctions build() {
            return new imports.step_functions.StepFunctions(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.step_functions.StepFunctionsConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.step_functions.StepFunctionsConfig.Builder();
            }
            return this.config;
        }
    }
}
