package imports.step_functions;

@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.376Z")
@software.amazon.jsii.Jsii(module = imports.step_functions.$Module.class, fqn = "step-functions.StepFunctionsConfig")
@software.amazon.jsii.Jsii.Proxy(StepFunctionsConfig.Jsii$Proxy.class)
public interface StepFunctionsConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserConfig {

    /**
     * Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCloudwatchLogsPolicy() {
        return null;
    }

    /**
     * Controls whether list of policies should be added to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicies() {
        return null;
    }

    /**
     * Whether to attach AWS Service policies to IAM role true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPoliciesForIntegrations() {
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
     * Name of AWS regions where IAM role can be assumed by the Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAwsRegionAssumeRole() {
        return null;
    }

    /**
     * The ARN of the KMS Key to use when encrypting log data.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroupKmsKeyId() {
        return null;
    }

    /**
     * Name of Cloudwatch Logs group name to use.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogGroupName() {
        return null;
    }

    /**
     * Specifies the number of days you want to retain log events in the specified log group.
     * <p>
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCloudwatchLogGroupRetentionInDays() {
        return null;
    }

    /**
     * A map of tags to assign to the resource.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCloudwatchLogGroupTags() {
        return null;
    }

    /**
     * Whether to create Step Function resource true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return null;
    }

    /**
     * Whether to create IAM role for the Step Function true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRole() {
        return null;
    }

    /**
     * The Amazon States Language definition of the Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefinition() {
        return null;
    }

    /**
     * Defines what execution history events are logged and where they are logged The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLoggingConfiguration() {
        return null;
    }

    /**
     * The name of the Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
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
     * Path of IAM policies to use for Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyPath() {
        return null;
    }

    /**
     * Map of dynamic policy statements to attach to IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPolicyStatements() {
        return null;
    }

    /**
     * Determines whether to set a version of the state machine when it is created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPublish() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleArn() {
        return null;
    }

    /**
     * Description of IAM role to use for Step Function.
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
     * Name of IAM role to use for Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleName() {
        return null;
    }

    /**
     * Path of IAM role to use for Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRolePath() {
        return null;
    }

    /**
     * The ARN of the policy that is used to set the permissions boundary for the IAM role used by Step Function.
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
     * Map of AWS service integrations to allow in IAM role policy.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getServiceIntegrations() {
        return null;
    }

    /**
     * Create, update, and delete timeout configurations for the step function.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSfnStateMachineTimeouts() {
        return null;
    }

    /**
     * Maps of tags to assign to the Step Function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Step Function additional trusted entities for assuming roles (trust relationship).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTrustedEntities() {
        return null;
    }

    /**
     * Determines whether a Standard or Express state machine is created.
     * <p>
     * The default is STANDARD. Valid Values: STANDARD | EXPRESS
     * STANDARD
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * Whether to use an existing CloudWatch log group or create new.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseExistingCloudwatchLogGroup() {
        return null;
    }

    /**
     * Whether to use an existing IAM role for this Step Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseExistingRole() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StepFunctionsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StepFunctionsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StepFunctionsConfig> {
        java.lang.Boolean attachCloudwatchLogsPolicy;
        java.lang.Boolean attachPolicies;
        java.lang.Boolean attachPoliciesForIntegrations;
        java.lang.Boolean attachPolicy;
        java.lang.Boolean attachPolicyJson;
        java.lang.Boolean attachPolicyJsons;
        java.lang.Boolean attachPolicyStatements;
        java.lang.String awsRegionAssumeRole;
        java.lang.String cloudwatchLogGroupKmsKeyId;
        java.lang.String cloudwatchLogGroupName;
        java.lang.Number cloudwatchLogGroupRetentionInDays;
        java.util.Map<java.lang.String, java.lang.String> cloudwatchLogGroupTags;
        java.lang.Boolean create;
        java.lang.Boolean createRole;
        java.lang.String definition;
        java.util.Map<java.lang.String, java.lang.String> loggingConfiguration;
        java.lang.String name;
        java.lang.Number numberOfPolicies;
        java.lang.Number numberOfPolicyJsons;
        java.util.List<java.lang.String> policies;
        java.lang.String policy;
        java.lang.String policyJson;
        java.util.List<java.lang.String> policyJsons;
        java.lang.String policyPath;
        java.lang.Object policyStatements;
        java.lang.Boolean publish;
        java.lang.String roleArn;
        java.lang.String roleDescription;
        java.lang.Boolean roleForceDetachPolicies;
        java.lang.String roleName;
        java.lang.String rolePath;
        java.lang.String rolePermissionsBoundary;
        java.util.Map<java.lang.String, java.lang.String> roleTags;
        java.lang.Object serviceIntegrations;
        java.util.Map<java.lang.String, java.lang.String> sfnStateMachineTimeouts;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.List<java.lang.String> trustedEntities;
        java.lang.String type;
        java.lang.Boolean useExistingCloudwatchLogGroup;
        java.lang.Boolean useExistingRole;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link StepFunctionsConfig#getAttachCloudwatchLogsPolicy}
         * @param attachCloudwatchLogsPolicy Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function true.
         * @return {@code this}
         */
        public Builder attachCloudwatchLogsPolicy(java.lang.Boolean attachCloudwatchLogsPolicy) {
            this.attachCloudwatchLogsPolicy = attachCloudwatchLogsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getAttachPolicies}
         * @param attachPolicies Controls whether list of policies should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicies(java.lang.Boolean attachPolicies) {
            this.attachPolicies = attachPolicies;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getAttachPoliciesForIntegrations}
         * @param attachPoliciesForIntegrations Whether to attach AWS Service policies to IAM role true.
         * @return {@code this}
         */
        public Builder attachPoliciesForIntegrations(java.lang.Boolean attachPoliciesForIntegrations) {
            this.attachPoliciesForIntegrations = attachPoliciesForIntegrations;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getAttachPolicy}
         * @param attachPolicy Controls whether policy should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicy(java.lang.Boolean attachPolicy) {
            this.attachPolicy = attachPolicy;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getAttachPolicyJson}
         * @param attachPolicyJson Controls whether policy_json should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicyJson(java.lang.Boolean attachPolicyJson) {
            this.attachPolicyJson = attachPolicyJson;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getAttachPolicyJsons}
         * @param attachPolicyJsons Controls whether policy_jsons should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicyJsons(java.lang.Boolean attachPolicyJsons) {
            this.attachPolicyJsons = attachPolicyJsons;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getAttachPolicyStatements}
         * @param attachPolicyStatements Controls whether policy_statements should be added to IAM role.
         * @return {@code this}
         */
        public Builder attachPolicyStatements(java.lang.Boolean attachPolicyStatements) {
            this.attachPolicyStatements = attachPolicyStatements;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getAwsRegionAssumeRole}
         * @param awsRegionAssumeRole Name of AWS regions where IAM role can be assumed by the Step Function.
         * @return {@code this}
         */
        public Builder awsRegionAssumeRole(java.lang.String awsRegionAssumeRole) {
            this.awsRegionAssumeRole = awsRegionAssumeRole;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getCloudwatchLogGroupKmsKeyId}
         * @param cloudwatchLogGroupKmsKeyId The ARN of the KMS Key to use when encrypting log data.
         * @return {@code this}
         */
        public Builder cloudwatchLogGroupKmsKeyId(java.lang.String cloudwatchLogGroupKmsKeyId) {
            this.cloudwatchLogGroupKmsKeyId = cloudwatchLogGroupKmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getCloudwatchLogGroupName}
         * @param cloudwatchLogGroupName Name of Cloudwatch Logs group name to use.
         * @return {@code this}
         */
        public Builder cloudwatchLogGroupName(java.lang.String cloudwatchLogGroupName) {
            this.cloudwatchLogGroupName = cloudwatchLogGroupName;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getCloudwatchLogGroupRetentionInDays}
         * @param cloudwatchLogGroupRetentionInDays Specifies the number of days you want to retain log events in the specified log group.
         *                                          Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
         * @return {@code this}
         */
        public Builder cloudwatchLogGroupRetentionInDays(java.lang.Number cloudwatchLogGroupRetentionInDays) {
            this.cloudwatchLogGroupRetentionInDays = cloudwatchLogGroupRetentionInDays;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getCloudwatchLogGroupTags}
         * @param cloudwatchLogGroupTags A map of tags to assign to the resource.
         *                               The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder cloudwatchLogGroupTags(java.util.Map<java.lang.String, java.lang.String> cloudwatchLogGroupTags) {
            this.cloudwatchLogGroupTags = cloudwatchLogGroupTags;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getCreate}
         * @param create Whether to create Step Function resource true.
         * @return {@code this}
         */
        public Builder create(java.lang.Boolean create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getCreateRole}
         * @param createRole Whether to create IAM role for the Step Function true.
         * @return {@code this}
         */
        public Builder createRole(java.lang.Boolean createRole) {
            this.createRole = createRole;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getDefinition}
         * @param definition The Amazon States Language definition of the Step Function.
         * @return {@code this}
         */
        public Builder definition(java.lang.String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getLoggingConfiguration}
         * @param loggingConfiguration Defines what execution history events are logged and where they are logged The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder loggingConfiguration(java.util.Map<java.lang.String, java.lang.String> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getName}
         * @param name The name of the Step Function.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getNumberOfPolicies}
         * @param numberOfPolicies Number of policies to attach to IAM role.
         * @return {@code this}
         */
        public Builder numberOfPolicies(java.lang.Number numberOfPolicies) {
            this.numberOfPolicies = numberOfPolicies;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getNumberOfPolicyJsons}
         * @param numberOfPolicyJsons Number of policies JSON to attach to IAM role.
         * @return {@code this}
         */
        public Builder numberOfPolicyJsons(java.lang.Number numberOfPolicyJsons) {
            this.numberOfPolicyJsons = numberOfPolicyJsons;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getPolicies}
         * @param policies List of policy statements ARN to attach to IAM role.
         * @return {@code this}
         */
        public Builder policies(java.util.List<java.lang.String> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getPolicy}
         * @param policy An additional policy document ARN to attach to IAM role.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getPolicyJson}
         * @param policyJson An additional policy document as JSON to attach to IAM role.
         * @return {@code this}
         */
        public Builder policyJson(java.lang.String policyJson) {
            this.policyJson = policyJson;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getPolicyJsons}
         * @param policyJsons List of additional policy documents as JSON to attach to IAM role.
         * @return {@code this}
         */
        public Builder policyJsons(java.util.List<java.lang.String> policyJsons) {
            this.policyJsons = policyJsons;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getPolicyPath}
         * @param policyPath Path of IAM policies to use for Step Function.
         * @return {@code this}
         */
        public Builder policyPath(java.lang.String policyPath) {
            this.policyPath = policyPath;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getPolicyStatements}
         * @param policyStatements Map of dynamic policy statements to attach to IAM role.
         * @return {@code this}
         */
        public Builder policyStatements(java.lang.Object policyStatements) {
            this.policyStatements = policyStatements;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getPublish}
         * @param publish Determines whether to set a version of the state machine when it is created.
         * @return {@code this}
         */
        public Builder publish(java.lang.Boolean publish) {
            this.publish = publish;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getRoleArn}
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role to use for this Step Function.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getRoleDescription}
         * @param roleDescription Description of IAM role to use for Step Function.
         * @return {@code this}
         */
        public Builder roleDescription(java.lang.String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getRoleForceDetachPolicies}
         * @param roleForceDetachPolicies Specifies to force detaching any policies the IAM role has before destroying it.
         *                                true
         * @return {@code this}
         */
        public Builder roleForceDetachPolicies(java.lang.Boolean roleForceDetachPolicies) {
            this.roleForceDetachPolicies = roleForceDetachPolicies;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getRoleName}
         * @param roleName Name of IAM role to use for Step Function.
         * @return {@code this}
         */
        public Builder roleName(java.lang.String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getRolePath}
         * @param rolePath Path of IAM role to use for Step Function.
         * @return {@code this}
         */
        public Builder rolePath(java.lang.String rolePath) {
            this.rolePath = rolePath;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getRolePermissionsBoundary}
         * @param rolePermissionsBoundary The ARN of the policy that is used to set the permissions boundary for the IAM role used by Step Function.
         * @return {@code this}
         */
        public Builder rolePermissionsBoundary(java.lang.String rolePermissionsBoundary) {
            this.rolePermissionsBoundary = rolePermissionsBoundary;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getRoleTags}
         * @param roleTags A map of tags to assign to IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder roleTags(java.util.Map<java.lang.String, java.lang.String> roleTags) {
            this.roleTags = roleTags;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getServiceIntegrations}
         * @param serviceIntegrations Map of AWS service integrations to allow in IAM role policy.
         * @return {@code this}
         */
        public Builder serviceIntegrations(java.lang.Object serviceIntegrations) {
            this.serviceIntegrations = serviceIntegrations;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getSfnStateMachineTimeouts}
         * @param sfnStateMachineTimeouts Create, update, and delete timeout configurations for the step function.
         *                                The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder sfnStateMachineTimeouts(java.util.Map<java.lang.String, java.lang.String> sfnStateMachineTimeouts) {
            this.sfnStateMachineTimeouts = sfnStateMachineTimeouts;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getTags}
         * @param tags Maps of tags to assign to the Step Function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getTrustedEntities}
         * @param trustedEntities Step Function additional trusted entities for assuming roles (trust relationship).
         * @return {@code this}
         */
        public Builder trustedEntities(java.util.List<java.lang.String> trustedEntities) {
            this.trustedEntities = trustedEntities;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getType}
         * @param type Determines whether a Standard or Express state machine is created.
         *             The default is STANDARD. Valid Values: STANDARD | EXPRESS
         *             STANDARD
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getUseExistingCloudwatchLogGroup}
         * @param useExistingCloudwatchLogGroup Whether to use an existing CloudWatch log group or create new.
         * @return {@code this}
         */
        public Builder useExistingCloudwatchLogGroup(java.lang.Boolean useExistingCloudwatchLogGroup) {
            this.useExistingCloudwatchLogGroup = useExistingCloudwatchLogGroup;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getUseExistingRole}
         * @param useExistingRole Whether to use an existing IAM role for this Step Function.
         * @return {@code this}
         */
        public Builder useExistingRole(java.lang.Boolean useExistingRole) {
            this.useExistingRole = useExistingRole;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getDependsOn}
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
         * Sets the value of {@link StepFunctionsConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link StepFunctionsConfig#getProviders}
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
         * Sets the value of {@link StepFunctionsConfig#getSkipAssetCreationFromLocalModules}
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
         * @return a new instance of {@link StepFunctionsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StepFunctionsConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link StepFunctionsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StepFunctionsConfig {
        private final java.lang.Boolean attachCloudwatchLogsPolicy;
        private final java.lang.Boolean attachPolicies;
        private final java.lang.Boolean attachPoliciesForIntegrations;
        private final java.lang.Boolean attachPolicy;
        private final java.lang.Boolean attachPolicyJson;
        private final java.lang.Boolean attachPolicyJsons;
        private final java.lang.Boolean attachPolicyStatements;
        private final java.lang.String awsRegionAssumeRole;
        private final java.lang.String cloudwatchLogGroupKmsKeyId;
        private final java.lang.String cloudwatchLogGroupName;
        private final java.lang.Number cloudwatchLogGroupRetentionInDays;
        private final java.util.Map<java.lang.String, java.lang.String> cloudwatchLogGroupTags;
        private final java.lang.Boolean create;
        private final java.lang.Boolean createRole;
        private final java.lang.String definition;
        private final java.util.Map<java.lang.String, java.lang.String> loggingConfiguration;
        private final java.lang.String name;
        private final java.lang.Number numberOfPolicies;
        private final java.lang.Number numberOfPolicyJsons;
        private final java.util.List<java.lang.String> policies;
        private final java.lang.String policy;
        private final java.lang.String policyJson;
        private final java.util.List<java.lang.String> policyJsons;
        private final java.lang.String policyPath;
        private final java.lang.Object policyStatements;
        private final java.lang.Boolean publish;
        private final java.lang.String roleArn;
        private final java.lang.String roleDescription;
        private final java.lang.Boolean roleForceDetachPolicies;
        private final java.lang.String roleName;
        private final java.lang.String rolePath;
        private final java.lang.String rolePermissionsBoundary;
        private final java.util.Map<java.lang.String, java.lang.String> roleTags;
        private final java.lang.Object serviceIntegrations;
        private final java.util.Map<java.lang.String, java.lang.String> sfnStateMachineTimeouts;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<java.lang.String> trustedEntities;
        private final java.lang.String type;
        private final java.lang.Boolean useExistingCloudwatchLogGroup;
        private final java.lang.Boolean useExistingRole;
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
            this.attachCloudwatchLogsPolicy = software.amazon.jsii.Kernel.get(this, "attachCloudwatchLogsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicies = software.amazon.jsii.Kernel.get(this, "attachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPoliciesForIntegrations = software.amazon.jsii.Kernel.get(this, "attachPoliciesForIntegrations", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicy = software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyJson = software.amazon.jsii.Kernel.get(this, "attachPolicyJson", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyJsons = software.amazon.jsii.Kernel.get(this, "attachPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyStatements = software.amazon.jsii.Kernel.get(this, "attachPolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.awsRegionAssumeRole = software.amazon.jsii.Kernel.get(this, "awsRegionAssumeRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogGroupKmsKeyId = software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogGroupName = software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogGroupRetentionInDays = software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupRetentionInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cloudwatchLogGroupTags = software.amazon.jsii.Kernel.get(this, "cloudwatchLogGroupTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createRole = software.amazon.jsii.Kernel.get(this, "createRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.definition = software.amazon.jsii.Kernel.get(this, "definition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingConfiguration = software.amazon.jsii.Kernel.get(this, "loggingConfiguration", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.numberOfPolicies = software.amazon.jsii.Kernel.get(this, "numberOfPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.numberOfPolicyJsons = software.amazon.jsii.Kernel.get(this, "numberOfPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.policies = software.amazon.jsii.Kernel.get(this, "policies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyJson = software.amazon.jsii.Kernel.get(this, "policyJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyJsons = software.amazon.jsii.Kernel.get(this, "policyJsons", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policyPath = software.amazon.jsii.Kernel.get(this, "policyPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyStatements = software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.publish = software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleDescription = software.amazon.jsii.Kernel.get(this, "roleDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleForceDetachPolicies = software.amazon.jsii.Kernel.get(this, "roleForceDetachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.roleName = software.amazon.jsii.Kernel.get(this, "roleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rolePath = software.amazon.jsii.Kernel.get(this, "rolePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rolePermissionsBoundary = software.amazon.jsii.Kernel.get(this, "rolePermissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleTags = software.amazon.jsii.Kernel.get(this, "roleTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.serviceIntegrations = software.amazon.jsii.Kernel.get(this, "serviceIntegrations", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.sfnStateMachineTimeouts = software.amazon.jsii.Kernel.get(this, "sfnStateMachineTimeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.trustedEntities = software.amazon.jsii.Kernel.get(this, "trustedEntities", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useExistingCloudwatchLogGroup = software.amazon.jsii.Kernel.get(this, "useExistingCloudwatchLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.useExistingRole = software.amazon.jsii.Kernel.get(this, "useExistingRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
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
            this.attachCloudwatchLogsPolicy = builder.attachCloudwatchLogsPolicy;
            this.attachPolicies = builder.attachPolicies;
            this.attachPoliciesForIntegrations = builder.attachPoliciesForIntegrations;
            this.attachPolicy = builder.attachPolicy;
            this.attachPolicyJson = builder.attachPolicyJson;
            this.attachPolicyJsons = builder.attachPolicyJsons;
            this.attachPolicyStatements = builder.attachPolicyStatements;
            this.awsRegionAssumeRole = builder.awsRegionAssumeRole;
            this.cloudwatchLogGroupKmsKeyId = builder.cloudwatchLogGroupKmsKeyId;
            this.cloudwatchLogGroupName = builder.cloudwatchLogGroupName;
            this.cloudwatchLogGroupRetentionInDays = builder.cloudwatchLogGroupRetentionInDays;
            this.cloudwatchLogGroupTags = builder.cloudwatchLogGroupTags;
            this.create = builder.create;
            this.createRole = builder.createRole;
            this.definition = builder.definition;
            this.loggingConfiguration = builder.loggingConfiguration;
            this.name = builder.name;
            this.numberOfPolicies = builder.numberOfPolicies;
            this.numberOfPolicyJsons = builder.numberOfPolicyJsons;
            this.policies = builder.policies;
            this.policy = builder.policy;
            this.policyJson = builder.policyJson;
            this.policyJsons = builder.policyJsons;
            this.policyPath = builder.policyPath;
            this.policyStatements = builder.policyStatements;
            this.publish = builder.publish;
            this.roleArn = builder.roleArn;
            this.roleDescription = builder.roleDescription;
            this.roleForceDetachPolicies = builder.roleForceDetachPolicies;
            this.roleName = builder.roleName;
            this.rolePath = builder.rolePath;
            this.rolePermissionsBoundary = builder.rolePermissionsBoundary;
            this.roleTags = builder.roleTags;
            this.serviceIntegrations = builder.serviceIntegrations;
            this.sfnStateMachineTimeouts = builder.sfnStateMachineTimeouts;
            this.tags = builder.tags;
            this.trustedEntities = builder.trustedEntities;
            this.type = builder.type;
            this.useExistingCloudwatchLogGroup = builder.useExistingCloudwatchLogGroup;
            this.useExistingRole = builder.useExistingRole;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.lang.Boolean getAttachCloudwatchLogsPolicy() {
            return this.attachCloudwatchLogsPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPolicies() {
            return this.attachPolicies;
        }

        @Override
        public final java.lang.Boolean getAttachPoliciesForIntegrations() {
            return this.attachPoliciesForIntegrations;
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
        public final java.lang.String getAwsRegionAssumeRole() {
            return this.awsRegionAssumeRole;
        }

        @Override
        public final java.lang.String getCloudwatchLogGroupKmsKeyId() {
            return this.cloudwatchLogGroupKmsKeyId;
        }

        @Override
        public final java.lang.String getCloudwatchLogGroupName() {
            return this.cloudwatchLogGroupName;
        }

        @Override
        public final java.lang.Number getCloudwatchLogGroupRetentionInDays() {
            return this.cloudwatchLogGroupRetentionInDays;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getCloudwatchLogGroupTags() {
            return this.cloudwatchLogGroupTags;
        }

        @Override
        public final java.lang.Boolean getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.Boolean getCreateRole() {
            return this.createRole;
        }

        @Override
        public final java.lang.String getDefinition() {
            return this.definition;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLoggingConfiguration() {
            return this.loggingConfiguration;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
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
        public final java.lang.String getPolicyPath() {
            return this.policyPath;
        }

        @Override
        public final java.lang.Object getPolicyStatements() {
            return this.policyStatements;
        }

        @Override
        public final java.lang.Boolean getPublish() {
            return this.publish;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
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
        public final java.lang.Object getServiceIntegrations() {
            return this.serviceIntegrations;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getSfnStateMachineTimeouts() {
            return this.sfnStateMachineTimeouts;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<java.lang.String> getTrustedEntities() {
            return this.trustedEntities;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Boolean getUseExistingCloudwatchLogGroup() {
            return this.useExistingCloudwatchLogGroup;
        }

        @Override
        public final java.lang.Boolean getUseExistingRole() {
            return this.useExistingRole;
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

            if (this.getAttachCloudwatchLogsPolicy() != null) {
                data.set("attachCloudwatchLogsPolicy", om.valueToTree(this.getAttachCloudwatchLogsPolicy()));
            }
            if (this.getAttachPolicies() != null) {
                data.set("attachPolicies", om.valueToTree(this.getAttachPolicies()));
            }
            if (this.getAttachPoliciesForIntegrations() != null) {
                data.set("attachPoliciesForIntegrations", om.valueToTree(this.getAttachPoliciesForIntegrations()));
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
            if (this.getAwsRegionAssumeRole() != null) {
                data.set("awsRegionAssumeRole", om.valueToTree(this.getAwsRegionAssumeRole()));
            }
            if (this.getCloudwatchLogGroupKmsKeyId() != null) {
                data.set("cloudwatchLogGroupKmsKeyId", om.valueToTree(this.getCloudwatchLogGroupKmsKeyId()));
            }
            if (this.getCloudwatchLogGroupName() != null) {
                data.set("cloudwatchLogGroupName", om.valueToTree(this.getCloudwatchLogGroupName()));
            }
            if (this.getCloudwatchLogGroupRetentionInDays() != null) {
                data.set("cloudwatchLogGroupRetentionInDays", om.valueToTree(this.getCloudwatchLogGroupRetentionInDays()));
            }
            if (this.getCloudwatchLogGroupTags() != null) {
                data.set("cloudwatchLogGroupTags", om.valueToTree(this.getCloudwatchLogGroupTags()));
            }
            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getCreateRole() != null) {
                data.set("createRole", om.valueToTree(this.getCreateRole()));
            }
            if (this.getDefinition() != null) {
                data.set("definition", om.valueToTree(this.getDefinition()));
            }
            if (this.getLoggingConfiguration() != null) {
                data.set("loggingConfiguration", om.valueToTree(this.getLoggingConfiguration()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNumberOfPolicies() != null) {
                data.set("numberOfPolicies", om.valueToTree(this.getNumberOfPolicies()));
            }
            if (this.getNumberOfPolicyJsons() != null) {
                data.set("numberOfPolicyJsons", om.valueToTree(this.getNumberOfPolicyJsons()));
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
            if (this.getPolicyPath() != null) {
                data.set("policyPath", om.valueToTree(this.getPolicyPath()));
            }
            if (this.getPolicyStatements() != null) {
                data.set("policyStatements", om.valueToTree(this.getPolicyStatements()));
            }
            if (this.getPublish() != null) {
                data.set("publish", om.valueToTree(this.getPublish()));
            }
            if (this.getRoleArn() != null) {
                data.set("roleArn", om.valueToTree(this.getRoleArn()));
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
            if (this.getServiceIntegrations() != null) {
                data.set("serviceIntegrations", om.valueToTree(this.getServiceIntegrations()));
            }
            if (this.getSfnStateMachineTimeouts() != null) {
                data.set("sfnStateMachineTimeouts", om.valueToTree(this.getSfnStateMachineTimeouts()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTrustedEntities() != null) {
                data.set("trustedEntities", om.valueToTree(this.getTrustedEntities()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getUseExistingCloudwatchLogGroup() != null) {
                data.set("useExistingCloudwatchLogGroup", om.valueToTree(this.getUseExistingCloudwatchLogGroup()));
            }
            if (this.getUseExistingRole() != null) {
                data.set("useExistingRole", om.valueToTree(this.getUseExistingRole()));
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
            struct.set("fqn", om.valueToTree("step-functions.StepFunctionsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StepFunctionsConfig.Jsii$Proxy that = (StepFunctionsConfig.Jsii$Proxy) o;

            if (this.attachCloudwatchLogsPolicy != null ? !this.attachCloudwatchLogsPolicy.equals(that.attachCloudwatchLogsPolicy) : that.attachCloudwatchLogsPolicy != null) return false;
            if (this.attachPolicies != null ? !this.attachPolicies.equals(that.attachPolicies) : that.attachPolicies != null) return false;
            if (this.attachPoliciesForIntegrations != null ? !this.attachPoliciesForIntegrations.equals(that.attachPoliciesForIntegrations) : that.attachPoliciesForIntegrations != null) return false;
            if (this.attachPolicy != null ? !this.attachPolicy.equals(that.attachPolicy) : that.attachPolicy != null) return false;
            if (this.attachPolicyJson != null ? !this.attachPolicyJson.equals(that.attachPolicyJson) : that.attachPolicyJson != null) return false;
            if (this.attachPolicyJsons != null ? !this.attachPolicyJsons.equals(that.attachPolicyJsons) : that.attachPolicyJsons != null) return false;
            if (this.attachPolicyStatements != null ? !this.attachPolicyStatements.equals(that.attachPolicyStatements) : that.attachPolicyStatements != null) return false;
            if (this.awsRegionAssumeRole != null ? !this.awsRegionAssumeRole.equals(that.awsRegionAssumeRole) : that.awsRegionAssumeRole != null) return false;
            if (this.cloudwatchLogGroupKmsKeyId != null ? !this.cloudwatchLogGroupKmsKeyId.equals(that.cloudwatchLogGroupKmsKeyId) : that.cloudwatchLogGroupKmsKeyId != null) return false;
            if (this.cloudwatchLogGroupName != null ? !this.cloudwatchLogGroupName.equals(that.cloudwatchLogGroupName) : that.cloudwatchLogGroupName != null) return false;
            if (this.cloudwatchLogGroupRetentionInDays != null ? !this.cloudwatchLogGroupRetentionInDays.equals(that.cloudwatchLogGroupRetentionInDays) : that.cloudwatchLogGroupRetentionInDays != null) return false;
            if (this.cloudwatchLogGroupTags != null ? !this.cloudwatchLogGroupTags.equals(that.cloudwatchLogGroupTags) : that.cloudwatchLogGroupTags != null) return false;
            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            if (this.createRole != null ? !this.createRole.equals(that.createRole) : that.createRole != null) return false;
            if (this.definition != null ? !this.definition.equals(that.definition) : that.definition != null) return false;
            if (this.loggingConfiguration != null ? !this.loggingConfiguration.equals(that.loggingConfiguration) : that.loggingConfiguration != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.numberOfPolicies != null ? !this.numberOfPolicies.equals(that.numberOfPolicies) : that.numberOfPolicies != null) return false;
            if (this.numberOfPolicyJsons != null ? !this.numberOfPolicyJsons.equals(that.numberOfPolicyJsons) : that.numberOfPolicyJsons != null) return false;
            if (this.policies != null ? !this.policies.equals(that.policies) : that.policies != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.policyJson != null ? !this.policyJson.equals(that.policyJson) : that.policyJson != null) return false;
            if (this.policyJsons != null ? !this.policyJsons.equals(that.policyJsons) : that.policyJsons != null) return false;
            if (this.policyPath != null ? !this.policyPath.equals(that.policyPath) : that.policyPath != null) return false;
            if (this.policyStatements != null ? !this.policyStatements.equals(that.policyStatements) : that.policyStatements != null) return false;
            if (this.publish != null ? !this.publish.equals(that.publish) : that.publish != null) return false;
            if (this.roleArn != null ? !this.roleArn.equals(that.roleArn) : that.roleArn != null) return false;
            if (this.roleDescription != null ? !this.roleDescription.equals(that.roleDescription) : that.roleDescription != null) return false;
            if (this.roleForceDetachPolicies != null ? !this.roleForceDetachPolicies.equals(that.roleForceDetachPolicies) : that.roleForceDetachPolicies != null) return false;
            if (this.roleName != null ? !this.roleName.equals(that.roleName) : that.roleName != null) return false;
            if (this.rolePath != null ? !this.rolePath.equals(that.rolePath) : that.rolePath != null) return false;
            if (this.rolePermissionsBoundary != null ? !this.rolePermissionsBoundary.equals(that.rolePermissionsBoundary) : that.rolePermissionsBoundary != null) return false;
            if (this.roleTags != null ? !this.roleTags.equals(that.roleTags) : that.roleTags != null) return false;
            if (this.serviceIntegrations != null ? !this.serviceIntegrations.equals(that.serviceIntegrations) : that.serviceIntegrations != null) return false;
            if (this.sfnStateMachineTimeouts != null ? !this.sfnStateMachineTimeouts.equals(that.sfnStateMachineTimeouts) : that.sfnStateMachineTimeouts != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.trustedEntities != null ? !this.trustedEntities.equals(that.trustedEntities) : that.trustedEntities != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            if (this.useExistingCloudwatchLogGroup != null ? !this.useExistingCloudwatchLogGroup.equals(that.useExistingCloudwatchLogGroup) : that.useExistingCloudwatchLogGroup != null) return false;
            if (this.useExistingRole != null ? !this.useExistingRole.equals(that.useExistingRole) : that.useExistingRole != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attachCloudwatchLogsPolicy != null ? this.attachCloudwatchLogsPolicy.hashCode() : 0;
            result = 31 * result + (this.attachPolicies != null ? this.attachPolicies.hashCode() : 0);
            result = 31 * result + (this.attachPoliciesForIntegrations != null ? this.attachPoliciesForIntegrations.hashCode() : 0);
            result = 31 * result + (this.attachPolicy != null ? this.attachPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPolicyJson != null ? this.attachPolicyJson.hashCode() : 0);
            result = 31 * result + (this.attachPolicyJsons != null ? this.attachPolicyJsons.hashCode() : 0);
            result = 31 * result + (this.attachPolicyStatements != null ? this.attachPolicyStatements.hashCode() : 0);
            result = 31 * result + (this.awsRegionAssumeRole != null ? this.awsRegionAssumeRole.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogGroupKmsKeyId != null ? this.cloudwatchLogGroupKmsKeyId.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogGroupName != null ? this.cloudwatchLogGroupName.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogGroupRetentionInDays != null ? this.cloudwatchLogGroupRetentionInDays.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogGroupTags != null ? this.cloudwatchLogGroupTags.hashCode() : 0);
            result = 31 * result + (this.create != null ? this.create.hashCode() : 0);
            result = 31 * result + (this.createRole != null ? this.createRole.hashCode() : 0);
            result = 31 * result + (this.definition != null ? this.definition.hashCode() : 0);
            result = 31 * result + (this.loggingConfiguration != null ? this.loggingConfiguration.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.numberOfPolicies != null ? this.numberOfPolicies.hashCode() : 0);
            result = 31 * result + (this.numberOfPolicyJsons != null ? this.numberOfPolicyJsons.hashCode() : 0);
            result = 31 * result + (this.policies != null ? this.policies.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.policyJson != null ? this.policyJson.hashCode() : 0);
            result = 31 * result + (this.policyJsons != null ? this.policyJsons.hashCode() : 0);
            result = 31 * result + (this.policyPath != null ? this.policyPath.hashCode() : 0);
            result = 31 * result + (this.policyStatements != null ? this.policyStatements.hashCode() : 0);
            result = 31 * result + (this.publish != null ? this.publish.hashCode() : 0);
            result = 31 * result + (this.roleArn != null ? this.roleArn.hashCode() : 0);
            result = 31 * result + (this.roleDescription != null ? this.roleDescription.hashCode() : 0);
            result = 31 * result + (this.roleForceDetachPolicies != null ? this.roleForceDetachPolicies.hashCode() : 0);
            result = 31 * result + (this.roleName != null ? this.roleName.hashCode() : 0);
            result = 31 * result + (this.rolePath != null ? this.rolePath.hashCode() : 0);
            result = 31 * result + (this.rolePermissionsBoundary != null ? this.rolePermissionsBoundary.hashCode() : 0);
            result = 31 * result + (this.roleTags != null ? this.roleTags.hashCode() : 0);
            result = 31 * result + (this.serviceIntegrations != null ? this.serviceIntegrations.hashCode() : 0);
            result = 31 * result + (this.sfnStateMachineTimeouts != null ? this.sfnStateMachineTimeouts.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.trustedEntities != null ? this.trustedEntities.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.useExistingCloudwatchLogGroup != null ? this.useExistingCloudwatchLogGroup.hashCode() : 0);
            result = 31 * result + (this.useExistingRole != null ? this.useExistingRole.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
