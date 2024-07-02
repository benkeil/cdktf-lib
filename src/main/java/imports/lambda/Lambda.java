package imports.lambda;

/**
 * Defines an Lambda based on a Terraform module.
 * <p>
 * Docs at Terraform Registry: {@link https://registry.terraform.io/modules/terraform-aws-modules/lambda/aws/~> 7.4 terraform-aws-modules/lambda/aws}
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.273Z")
@software.amazon.jsii.Jsii(module = imports.lambda.$Module.class, fqn = "lambda.Lambda")
public class Lambda extends com.hashicorp.cdktf.TerraformModule {

    protected Lambda(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Lambda(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Lambda(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.lambda.LambdaConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public Lambda(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
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

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaCloudwatchLogGroupArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaCloudwatchLogGroupArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaCloudwatchLogGroupNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaCloudwatchLogGroupNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingFunctionArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingFunctionArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingStateOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingStateOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingStateTransitionReasonOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingStateTransitionReasonOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaEventSourceMappingUuidOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaEventSourceMappingUuidOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionArnStaticOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionArnStaticOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionInvokeArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionInvokeArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionKmsKeyArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionKmsKeyArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionLastModifiedOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionLastModifiedOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionQualifiedArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionQualifiedArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionQualifiedInvokeArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionQualifiedInvokeArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionSigningJobArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionSigningJobArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionSigningProfileVersionArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionSigningProfileVersionArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionSourceCodeHashOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionSourceCodeHashOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionSourceCodeSizeOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionSourceCodeSizeOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionUrlIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionUrlIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionUrlOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionUrlOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaFunctionVersionOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaFunctionVersionOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerCreatedDateOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerCreatedDateOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerLayerArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerLayerArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerSourceCodeSizeOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerSourceCodeSizeOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaLayerVersionOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaLayerVersionOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaRoleArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRoleArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaRoleNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRoleNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLambdaRoleUniqueIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRoleUniqueIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocalFilenameOutput() {
        return software.amazon.jsii.Kernel.get(this, "localFilenameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3ObjectOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAssumeRolePolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "assumeRolePolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAssumeRolePolicyStatements(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "assumeRolePolicyStatements", java.util.Objects.requireNonNull(value, "assumeRolePolicyStatements is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCors() {
        return software.amazon.jsii.Kernel.get(this, "cors", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCors(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "cors", java.util.Objects.requireNonNull(value, "cors is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDockerPipCache() {
        return software.amazon.jsii.Kernel.get(this, "dockerPipCache", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDockerPipCache(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "dockerPipCache", java.util.Objects.requireNonNull(value, "dockerPipCache is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEventSourceMapping() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceMapping", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEventSourceMapping(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "eventSourceMapping", java.util.Objects.requireNonNull(value, "eventSourceMapping is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPolicyStatements() {
        return software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPolicyStatements(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "policyStatements", java.util.Objects.requireNonNull(value, "policyStatements is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSourcePath() {
        return software.amazon.jsii.Kernel.get(this, "sourcePath", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSourcePath(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "sourcePath", java.util.Objects.requireNonNull(value, "sourcePath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getTrustedEntities() {
        return software.amazon.jsii.Kernel.get(this, "trustedEntities", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setTrustedEntities(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "trustedEntities", java.util.Objects.requireNonNull(value, "trustedEntities is required"));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getAllowedTriggers() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "allowedTriggers", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setAllowedTriggers(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "allowedTriggers", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArchitectures() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "architectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setArchitectures(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "architectures", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getArtifactsDir() {
        return software.amazon.jsii.Kernel.get(this, "artifactsDir", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArtifactsDir(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "artifactsDir", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachAsyncEventPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachAsyncEventPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachAsyncEventPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachAsyncEventPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCloudwatchLogsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachCloudwatchLogsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachCloudwatchLogsPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachCloudwatchLogsPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCreateLogGroupPermission() {
        return software.amazon.jsii.Kernel.get(this, "attachCreateLogGroupPermission", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachCreateLogGroupPermission(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachCreateLogGroupPermission", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDeadLetterPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachDeadLetterPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachDeadLetterPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachDeadLetterPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachNetworkPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachNetworkPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachNetworkPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachNetworkPolicy", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachTracingPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachTracingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachTracingPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachTracingPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationType() {
        return software.amazon.jsii.Kernel.get(this, "authorizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizationType(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizationType", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBuildInDocker() {
        return software.amazon.jsii.Kernel.get(this, "buildInDocker", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBuildInDocker(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "buildInDocker", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogsKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchLogsKmsKeyId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsKmsKeyId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogsLogGroupClass() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsLogGroupClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudwatchLogsLogGroupClass(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsLogGroupClass", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCloudwatchLogsRetentionInDays() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsRetentionInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCloudwatchLogsRetentionInDays(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsRetentionInDays", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCloudwatchLogsSkipDestroy() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsSkipDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCloudwatchLogsSkipDestroy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsSkipDestroy", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCloudwatchLogsTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "cloudwatchLogsTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setCloudwatchLogsTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "cloudwatchLogsTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCodeSigningConfigArn() {
        return software.amazon.jsii.Kernel.get(this, "codeSigningConfigArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCodeSigningConfigArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "codeSigningConfigArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCompatibleArchitectures() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "compatibleArchitectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setCompatibleArchitectures(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "compatibleArchitectures", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCompatibleRuntimes() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "compatibleRuntimes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setCompatibleRuntimes(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "compatibleRuntimes", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreate(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "create", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateAsyncEventConfig() {
        return software.amazon.jsii.Kernel.get(this, "createAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateAsyncEventConfig(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createAsyncEventConfig", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateCurrentVersionAllowedTriggers() {
        return software.amazon.jsii.Kernel.get(this, "createCurrentVersionAllowedTriggers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateCurrentVersionAllowedTriggers(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createCurrentVersionAllowedTriggers", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateCurrentVersionAsyncEventConfig() {
        return software.amazon.jsii.Kernel.get(this, "createCurrentVersionAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateCurrentVersionAsyncEventConfig(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createCurrentVersionAsyncEventConfig", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateFunction() {
        return software.amazon.jsii.Kernel.get(this, "createFunction", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateFunction(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createFunction", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateLambdaFunctionUrl() {
        return software.amazon.jsii.Kernel.get(this, "createLambdaFunctionUrl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateLambdaFunctionUrl(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createLambdaFunctionUrl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateLayer() {
        return software.amazon.jsii.Kernel.get(this, "createLayer", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateLayer(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createLayer", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePackage() {
        return software.amazon.jsii.Kernel.get(this, "createPackage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreatePackage(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRole() {
        return software.amazon.jsii.Kernel.get(this, "createRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateRole(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSamMetadata() {
        return software.amazon.jsii.Kernel.get(this, "createSamMetadata", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateSamMetadata(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createSamMetadata", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasAllowedTriggers() {
        return software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasAllowedTriggers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateUnqualifiedAliasAllowedTriggers(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createUnqualifiedAliasAllowedTriggers", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasAsyncEventConfig() {
        return software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateUnqualifiedAliasAsyncEventConfig(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createUnqualifiedAliasAsyncEventConfig", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasLambdaFunctionUrl() {
        return software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasLambdaFunctionUrl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateUnqualifiedAliasLambdaFunctionUrl(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createUnqualifiedAliasLambdaFunctionUrl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeadLetterTargetArn() {
        return software.amazon.jsii.Kernel.get(this, "deadLetterTargetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeadLetterTargetArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deadLetterTargetArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationOnFailure() {
        return software.amazon.jsii.Kernel.get(this, "destinationOnFailure", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationOnFailure(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationOnFailure", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationOnSuccess() {
        return software.amazon.jsii.Kernel.get(this, "destinationOnSuccess", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationOnSuccess(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationOnSuccess", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDockerAdditionalOptions() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "dockerAdditionalOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setDockerAdditionalOptions(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "dockerAdditionalOptions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerBuildRoot() {
        return software.amazon.jsii.Kernel.get(this, "dockerBuildRoot", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerBuildRoot(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerBuildRoot", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerEntrypoint() {
        return software.amazon.jsii.Kernel.get(this, "dockerEntrypoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerEntrypoint(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerEntrypoint", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerFile() {
        return software.amazon.jsii.Kernel.get(this, "dockerFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerFile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerFile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDockerImage() {
        return software.amazon.jsii.Kernel.get(this, "dockerImage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDockerImage(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dockerImage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDockerWithSshAgent() {
        return software.amazon.jsii.Kernel.get(this, "dockerWithSshAgent", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDockerWithSshAgent(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "dockerWithSshAgent", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariables() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "environmentVariables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setEnvironmentVariables(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "environmentVariables", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getEphemeralStorageSize() {
        return software.amazon.jsii.Kernel.get(this, "ephemeralStorageSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEphemeralStorageSize(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ephemeralStorageSize", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFileSystemArn() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFileSystemArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fileSystemArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFileSystemLocalMountPath() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemLocalMountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFileSystemLocalMountPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fileSystemLocalMountPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFunctionName() {
        return software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFunctionName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "functionName", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getFunctionTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "functionTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setFunctionTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "functionTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHandler() {
        return software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHandler(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "handler", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHashExtra() {
        return software.amazon.jsii.Kernel.get(this, "hashExtra", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHashExtra(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hashExtra", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreSourceCodeHash() {
        return software.amazon.jsii.Kernel.get(this, "ignoreSourceCodeHash", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIgnoreSourceCodeHash(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ignoreSourceCodeHash", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getImageConfigCommand() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "imageConfigCommand", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setImageConfigCommand(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "imageConfigCommand", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getImageConfigEntryPoint() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "imageConfigEntryPoint", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setImageConfigEntryPoint(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "imageConfigEntryPoint", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageConfigWorkingDirectory() {
        return software.amazon.jsii.Kernel.get(this, "imageConfigWorkingDirectory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageConfigWorkingDirectory(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageConfigWorkingDirectory", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getImageUri() {
        return software.amazon.jsii.Kernel.get(this, "imageUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setImageUri(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "imageUri", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInvokeMode() {
        return software.amazon.jsii.Kernel.get(this, "invokeMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInvokeMode(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "invokeMode", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getLambdaAtEdge() {
        return software.amazon.jsii.Kernel.get(this, "lambdaAtEdge", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setLambdaAtEdge(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "lambdaAtEdge", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getLambdaAtEdgeLogsAllRegions() {
        return software.amazon.jsii.Kernel.get(this, "lambdaAtEdgeLogsAllRegions", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setLambdaAtEdgeLogsAllRegions(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "lambdaAtEdgeLogsAllRegions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLambdaRole() {
        return software.amazon.jsii.Kernel.get(this, "lambdaRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLambdaRole(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lambdaRole", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLayerName() {
        return software.amazon.jsii.Kernel.get(this, "layerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLayerName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "layerName", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLayers() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "layers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setLayers(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "layers", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getLayerSkipDestroy() {
        return software.amazon.jsii.Kernel.get(this, "layerSkipDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setLayerSkipDestroy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "layerSkipDestroy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLicenseInfo() {
        return software.amazon.jsii.Kernel.get(this, "licenseInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLicenseInfo(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "licenseInfo", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocalExistingPackage() {
        return software.amazon.jsii.Kernel.get(this, "localExistingPackage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocalExistingPackage(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "localExistingPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoggingApplicationLogLevel() {
        return software.amazon.jsii.Kernel.get(this, "loggingApplicationLogLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoggingApplicationLogLevel(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loggingApplicationLogLevel", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoggingLogFormat() {
        return software.amazon.jsii.Kernel.get(this, "loggingLogFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoggingLogFormat(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loggingLogFormat", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoggingLogGroup() {
        return software.amazon.jsii.Kernel.get(this, "loggingLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoggingLogGroup(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loggingLogGroup", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLoggingSystemLogLevel() {
        return software.amazon.jsii.Kernel.get(this, "loggingSystemLogLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLoggingSystemLogLevel(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "loggingSystemLogLevel", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumEventAgeInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "maximumEventAgeInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumEventAgeInSeconds(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumEventAgeInSeconds", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRetryAttempts() {
        return software.amazon.jsii.Kernel.get(this, "maximumRetryAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumRetryAttempts(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumRetryAttempts", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMemorySize() {
        return software.amazon.jsii.Kernel.get(this, "memorySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMemorySize(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "memorySize", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getPackageType() {
        return software.amazon.jsii.Kernel.get(this, "packageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPackageType(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "packageType", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyName() {
        return software.amazon.jsii.Kernel.get(this, "policyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyName", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyPath() {
        return software.amazon.jsii.Kernel.get(this, "policyPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyPath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyPath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getProvisionedConcurrentExecutions() {
        return software.amazon.jsii.Kernel.get(this, "provisionedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setProvisionedConcurrentExecutions(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "provisionedConcurrentExecutions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPublish() {
        return software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPublish(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "publish", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPutinKhuylo() {
        return software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPutinKhuylo(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "putinKhuylo", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRecreateMissingPackage() {
        return software.amazon.jsii.Kernel.get(this, "recreateMissingPackage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRecreateMissingPackage(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "recreateMissingPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getReplacementSecurityGroupIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "replacementSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setReplacementSecurityGroupIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "replacementSecurityGroupIds", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getReplaceSecurityGroupsOnDestroy() {
        return software.amazon.jsii.Kernel.get(this, "replaceSecurityGroupsOnDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setReplaceSecurityGroupsOnDestroy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "replaceSecurityGroupsOnDestroy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getReservedConcurrentExecutions() {
        return software.amazon.jsii.Kernel.get(this, "reservedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setReservedConcurrentExecutions(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "reservedConcurrentExecutions", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.Number getRoleMaximumSessionDuration() {
        return software.amazon.jsii.Kernel.get(this, "roleMaximumSessionDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRoleMaximumSessionDuration(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "roleMaximumSessionDuration", value);
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

    public @org.jetbrains.annotations.Nullable java.lang.String getRuntime() {
        return software.amazon.jsii.Kernel.get(this, "runtime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRuntime(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "runtime", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3Acl() {
        return software.amazon.jsii.Kernel.get(this, "s3Acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Acl(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Acl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3Bucket() {
        return software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Bucket(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Bucket", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getS3ExistingPackage() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "s3ExistingPackage", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setS3ExistingPackage(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "s3ExistingPackage", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3KmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "s3KmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3KmsKeyId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3KmsKeyId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ObjectOverrideDefaultTags() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectOverrideDefaultTags", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setS3ObjectOverrideDefaultTags(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectOverrideDefaultTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3ObjectStorageClass() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectStorageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3ObjectStorageClass(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectStorageClass", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getS3ObjectTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "s3ObjectTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setS3ObjectTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ObjectTagsOnly() {
        return software.amazon.jsii.Kernel.get(this, "s3ObjectTagsOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setS3ObjectTagsOnly(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "s3ObjectTagsOnly", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3Prefix() {
        return software.amazon.jsii.Kernel.get(this, "s3Prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3Prefix(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3Prefix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getS3ServerSideEncryption() {
        return software.amazon.jsii.Kernel.get(this, "s3ServerSideEncryption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setS3ServerSideEncryption(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "s3ServerSideEncryption", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSnapStart() {
        return software.amazon.jsii.Kernel.get(this, "snapStart", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSnapStart(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "snapStart", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getStoreOnS3() {
        return software.amazon.jsii.Kernel.get(this, "storeOnS3", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setStoreOnS3(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "storeOnS3", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTimeout(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "timeout", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTimeouts() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTimeouts(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTracingMode() {
        return software.amazon.jsii.Kernel.get(this, "tracingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTracingMode(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tracingMode", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getTriggerOnPackageTimestamp() {
        return software.amazon.jsii.Kernel.get(this, "triggerOnPackageTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setTriggerOnPackageTimestamp(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "triggerOnPackageTimestamp", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUseExistingCloudwatchLogGroup() {
        return software.amazon.jsii.Kernel.get(this, "useExistingCloudwatchLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUseExistingCloudwatchLogGroup(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "useExistingCloudwatchLogGroup", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setVpcSecurityGroupIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSecurityGroupIds", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSubnetIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSubnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setVpcSubnetIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSubnetIds", value);
    }

    /**
     * A fluent builder for {@link imports.lambda.Lambda}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.lambda.Lambda> {
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
        private imports.lambda.LambdaConfig.Builder config;

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
         * Map of allowed triggers to create Lambda permissions The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param allowedTriggers Map of allowed triggers to create Lambda permissions The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder allowedTriggers(final java.util.Map<java.lang.String, ? extends java.lang.Object> allowedTriggers) {
            this.config().allowedTriggers(allowedTriggers);
            return this;
        }

        /**
         * Instruction set architecture for your Lambda function.
         * <p>
         * Valid values are ["x86_64"] and ["arm64"].
         * <p>
         * @return {@code this}
         * @param architectures Instruction set architecture for your Lambda function. This parameter is required.
         */
        public Builder architectures(final java.util.List<java.lang.String> architectures) {
            this.config().architectures(architectures);
            return this;
        }

        /**
         * Directory name where artifacts should be stored builds.
         * <p>
         * @return {@code this}
         * @param artifactsDir Directory name where artifacts should be stored builds. This parameter is required.
         */
        public Builder artifactsDir(final java.lang.String artifactsDir) {
            this.config().artifactsDir(artifactsDir);
            return this;
        }

        /**
         * Map of dynamic policy statements for assuming Lambda Function role (trust relationship).
         * <p>
         * @return {@code this}
         * @param assumeRolePolicyStatements Map of dynamic policy statements for assuming Lambda Function role (trust relationship). This parameter is required.
         */
        public Builder assumeRolePolicyStatements(final java.lang.Object assumeRolePolicyStatements) {
            this.config().assumeRolePolicyStatements(assumeRolePolicyStatements);
            return this;
        }

        /**
         * Controls whether async event policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachAsyncEventPolicy Controls whether async event policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachAsyncEventPolicy(final java.lang.Boolean attachAsyncEventPolicy) {
            this.config().attachAsyncEventPolicy(attachAsyncEventPolicy);
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
         * Controls whether to add the create log group permission to the CloudWatch logs policy true.
         * <p>
         * @return {@code this}
         * @param attachCreateLogGroupPermission Controls whether to add the create log group permission to the CloudWatch logs policy true. This parameter is required.
         */
        public Builder attachCreateLogGroupPermission(final java.lang.Boolean attachCreateLogGroupPermission) {
            this.config().attachCreateLogGroupPermission(attachCreateLogGroupPermission);
            return this;
        }

        /**
         * Controls whether SNS/SQS dead letter notification policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachDeadLetterPolicy Controls whether SNS/SQS dead letter notification policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachDeadLetterPolicy(final java.lang.Boolean attachDeadLetterPolicy) {
            this.config().attachDeadLetterPolicy(attachDeadLetterPolicy);
            return this;
        }

        /**
         * Controls whether VPC/network policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachNetworkPolicy Controls whether VPC/network policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachNetworkPolicy(final java.lang.Boolean attachNetworkPolicy) {
            this.config().attachNetworkPolicy(attachNetworkPolicy);
            return this;
        }

        /**
         * Controls whether list of policies should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicies Controls whether list of policies should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicies(final java.lang.Boolean attachPolicies) {
            this.config().attachPolicies(attachPolicies);
            return this;
        }

        /**
         * Controls whether policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicy Controls whether policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicy(final java.lang.Boolean attachPolicy) {
            this.config().attachPolicy(attachPolicy);
            return this;
        }

        /**
         * Controls whether policy_json should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicyJson Controls whether policy_json should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicyJson(final java.lang.Boolean attachPolicyJson) {
            this.config().attachPolicyJson(attachPolicyJson);
            return this;
        }

        /**
         * Controls whether policy_jsons should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicyJsons Controls whether policy_jsons should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicyJsons(final java.lang.Boolean attachPolicyJsons) {
            this.config().attachPolicyJsons(attachPolicyJsons);
            return this;
        }

        /**
         * Controls whether policy_statements should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachPolicyStatements Controls whether policy_statements should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachPolicyStatements(final java.lang.Boolean attachPolicyStatements) {
            this.config().attachPolicyStatements(attachPolicyStatements);
            return this;
        }

        /**
         * Controls whether X-Ray tracing policy should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param attachTracingPolicy Controls whether X-Ray tracing policy should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder attachTracingPolicy(final java.lang.Boolean attachTracingPolicy) {
            this.config().attachTracingPolicy(attachTracingPolicy);
            return this;
        }

        /**
         * The type of authentication that the Lambda Function URL uses.
         * <p>
         * Set to 'AWS_IAM' to restrict access to authenticated IAM users only. Set to 'NONE' to bypass IAM authentication and create a public endpoint.
         * NONE
         * <p>
         * @return {@code this}
         * @param authorizationType The type of authentication that the Lambda Function URL uses. This parameter is required.
         */
        public Builder authorizationType(final java.lang.String authorizationType) {
            this.config().authorizationType(authorizationType);
            return this;
        }

        /**
         * Whether to build dependencies in Docker.
         * <p>
         * @return {@code this}
         * @param buildInDocker Whether to build dependencies in Docker. This parameter is required.
         */
        public Builder buildInDocker(final java.lang.Boolean buildInDocker) {
            this.config().buildInDocker(buildInDocker);
            return this;
        }

        /**
         * The ARN of the KMS Key to use when encrypting log data.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsKmsKeyId The ARN of the KMS Key to use when encrypting log data. This parameter is required.
         */
        public Builder cloudwatchLogsKmsKeyId(final java.lang.String cloudwatchLogsKmsKeyId) {
            this.config().cloudwatchLogsKmsKeyId(cloudwatchLogsKmsKeyId);
            return this;
        }

        /**
         * Specified the log class of the log group.
         * <p>
         * Possible values are: <code>STANDARD</code> or <code>INFREQUENT_ACCESS</code>
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsLogGroupClass Specified the log class of the log group. This parameter is required.
         */
        public Builder cloudwatchLogsLogGroupClass(final java.lang.String cloudwatchLogsLogGroupClass) {
            this.config().cloudwatchLogsLogGroupClass(cloudwatchLogsLogGroupClass);
            return this;
        }

        /**
         * Specifies the number of days you want to retain log events in the specified log group.
         * <p>
         * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsRetentionInDays Specifies the number of days you want to retain log events in the specified log group. This parameter is required.
         */
        public Builder cloudwatchLogsRetentionInDays(final java.lang.Number cloudwatchLogsRetentionInDays) {
            this.config().cloudwatchLogsRetentionInDays(cloudwatchLogsRetentionInDays);
            return this;
        }

        /**
         * Whether to keep the log group (and any logs it may contain) at destroy time.
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsSkipDestroy Whether to keep the log group (and any logs it may contain) at destroy time. This parameter is required.
         */
        public Builder cloudwatchLogsSkipDestroy(final java.lang.Boolean cloudwatchLogsSkipDestroy) {
            this.config().cloudwatchLogsSkipDestroy(cloudwatchLogsSkipDestroy);
            return this;
        }

        /**
         * A map of tags to assign to the resource.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param cloudwatchLogsTags A map of tags to assign to the resource. This parameter is required.
         */
        public Builder cloudwatchLogsTags(final java.util.Map<java.lang.String, java.lang.String> cloudwatchLogsTags) {
            this.config().cloudwatchLogsTags(cloudwatchLogsTags);
            return this;
        }

        /**
         * Amazon Resource Name (ARN) for a Code Signing Configuration.
         * <p>
         * @return {@code this}
         * @param codeSigningConfigArn Amazon Resource Name (ARN) for a Code Signing Configuration. This parameter is required.
         */
        public Builder codeSigningConfigArn(final java.lang.String codeSigningConfigArn) {
            this.config().codeSigningConfigArn(codeSigningConfigArn);
            return this;
        }

        /**
         * A list of Architectures Lambda layer is compatible with.
         * <p>
         * Currently x86_64 and arm64 can be specified.
         * <p>
         * @return {@code this}
         * @param compatibleArchitectures A list of Architectures Lambda layer is compatible with. This parameter is required.
         */
        public Builder compatibleArchitectures(final java.util.List<java.lang.String> compatibleArchitectures) {
            this.config().compatibleArchitectures(compatibleArchitectures);
            return this;
        }

        /**
         * A list of Runtimes this layer is compatible with.
         * <p>
         * Up to 5 runtimes can be specified.
         * <p>
         * @return {@code this}
         * @param compatibleRuntimes A list of Runtimes this layer is compatible with. This parameter is required.
         */
        public Builder compatibleRuntimes(final java.util.List<java.lang.String> compatibleRuntimes) {
            this.config().compatibleRuntimes(compatibleRuntimes);
            return this;
        }

        /**
         * CORS settings to be used by the Lambda Function URL.
         * <p>
         * @return {@code this}
         * @param cors CORS settings to be used by the Lambda Function URL. This parameter is required.
         */
        public Builder cors(final java.lang.Object cors) {
            this.config().cors(cors);
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
         * Controls whether async event configuration for Lambda Function/Alias should be created.
         * <p>
         * @return {@code this}
         * @param createAsyncEventConfig Controls whether async event configuration for Lambda Function/Alias should be created. This parameter is required.
         */
        public Builder createAsyncEventConfig(final java.lang.Boolean createAsyncEventConfig) {
            this.config().createAsyncEventConfig(createAsyncEventConfig);
            return this;
        }

        /**
         * Whether to allow triggers on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true.
         * <p>
         * @return {@code this}
         * @param createCurrentVersionAllowedTriggers Whether to allow triggers on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true. This parameter is required.
         */
        public Builder createCurrentVersionAllowedTriggers(final java.lang.Boolean createCurrentVersionAllowedTriggers) {
            this.config().createCurrentVersionAllowedTriggers(createCurrentVersionAllowedTriggers);
            return this;
        }

        /**
         * Whether to allow async event configuration on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true.
         * <p>
         * @return {@code this}
         * @param createCurrentVersionAsyncEventConfig Whether to allow async event configuration on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true. This parameter is required.
         */
        public Builder createCurrentVersionAsyncEventConfig(final java.lang.Boolean createCurrentVersionAsyncEventConfig) {
            this.config().createCurrentVersionAsyncEventConfig(createCurrentVersionAsyncEventConfig);
            return this;
        }

        /**
         * Controls whether Lambda Function resource should be created true.
         * <p>
         * @return {@code this}
         * @param createFunction Controls whether Lambda Function resource should be created true. This parameter is required.
         */
        public Builder createFunction(final java.lang.Boolean createFunction) {
            this.config().createFunction(createFunction);
            return this;
        }

        /**
         * Controls whether the Lambda Function URL resource should be created.
         * <p>
         * @return {@code this}
         * @param createLambdaFunctionUrl Controls whether the Lambda Function URL resource should be created. This parameter is required.
         */
        public Builder createLambdaFunctionUrl(final java.lang.Boolean createLambdaFunctionUrl) {
            this.config().createLambdaFunctionUrl(createLambdaFunctionUrl);
            return this;
        }

        /**
         * Controls whether Lambda Layer resource should be created.
         * <p>
         * @return {@code this}
         * @param createLayer Controls whether Lambda Layer resource should be created. This parameter is required.
         */
        public Builder createLayer(final java.lang.Boolean createLayer) {
            this.config().createLayer(createLayer);
            return this;
        }

        /**
         * Controls whether Lambda package should be created true.
         * <p>
         * @return {@code this}
         * @param createPackage Controls whether Lambda package should be created true. This parameter is required.
         */
        public Builder createPackage(final java.lang.Boolean createPackage) {
            this.config().createPackage(createPackage);
            return this;
        }

        /**
         * Controls whether IAM role for Lambda Function should be created true.
         * <p>
         * @return {@code this}
         * @param createRole Controls whether IAM role for Lambda Function should be created true. This parameter is required.
         */
        public Builder createRole(final java.lang.Boolean createRole) {
            this.config().createRole(createRole);
            return this;
        }

        /**
         * Controls whether the SAM metadata null resource should be created.
         * <p>
         * @return {@code this}
         * @param createSamMetadata Controls whether the SAM metadata null resource should be created. This parameter is required.
         */
        public Builder createSamMetadata(final java.lang.Boolean createSamMetadata) {
            this.config().createSamMetadata(createSamMetadata);
            return this;
        }

        /**
         * Whether to allow triggers on unqualified alias pointing to $LATEST version true.
         * <p>
         * @return {@code this}
         * @param createUnqualifiedAliasAllowedTriggers Whether to allow triggers on unqualified alias pointing to $LATEST version true. This parameter is required.
         */
        public Builder createUnqualifiedAliasAllowedTriggers(final java.lang.Boolean createUnqualifiedAliasAllowedTriggers) {
            this.config().createUnqualifiedAliasAllowedTriggers(createUnqualifiedAliasAllowedTriggers);
            return this;
        }

        /**
         * Whether to allow async event configuration on unqualified alias pointing to $LATEST version true.
         * <p>
         * @return {@code this}
         * @param createUnqualifiedAliasAsyncEventConfig Whether to allow async event configuration on unqualified alias pointing to $LATEST version true. This parameter is required.
         */
        public Builder createUnqualifiedAliasAsyncEventConfig(final java.lang.Boolean createUnqualifiedAliasAsyncEventConfig) {
            this.config().createUnqualifiedAliasAsyncEventConfig(createUnqualifiedAliasAsyncEventConfig);
            return this;
        }

        /**
         * Whether to use unqualified alias pointing to $LATEST version in Lambda Function URL true.
         * <p>
         * @return {@code this}
         * @param createUnqualifiedAliasLambdaFunctionUrl Whether to use unqualified alias pointing to $LATEST version in Lambda Function URL true. This parameter is required.
         */
        public Builder createUnqualifiedAliasLambdaFunctionUrl(final java.lang.Boolean createUnqualifiedAliasLambdaFunctionUrl) {
            this.config().createUnqualifiedAliasLambdaFunctionUrl(createUnqualifiedAliasLambdaFunctionUrl);
            return this;
        }

        /**
         * The ARN of an SNS topic or SQS queue to notify when an invocation fails.
         * <p>
         * @return {@code this}
         * @param deadLetterTargetArn The ARN of an SNS topic or SQS queue to notify when an invocation fails. This parameter is required.
         */
        public Builder deadLetterTargetArn(final java.lang.String deadLetterTargetArn) {
            this.config().deadLetterTargetArn(deadLetterTargetArn);
            return this;
        }

        /**
         * Description of your Lambda Function (or Layer).
         * <p>
         * @return {@code this}
         * @param description Description of your Lambda Function (or Layer). This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config().description(description);
            return this;
        }

        /**
         * Amazon Resource Name (ARN) of the destination resource for failed asynchronous invocations.
         * <p>
         * @return {@code this}
         * @param destinationOnFailure Amazon Resource Name (ARN) of the destination resource for failed asynchronous invocations. This parameter is required.
         */
        public Builder destinationOnFailure(final java.lang.String destinationOnFailure) {
            this.config().destinationOnFailure(destinationOnFailure);
            return this;
        }

        /**
         * Amazon Resource Name (ARN) of the destination resource for successful asynchronous invocations.
         * <p>
         * @return {@code this}
         * @param destinationOnSuccess Amazon Resource Name (ARN) of the destination resource for successful asynchronous invocations. This parameter is required.
         */
        public Builder destinationOnSuccess(final java.lang.String destinationOnSuccess) {
            this.config().destinationOnSuccess(destinationOnSuccess);
            return this;
        }

        /**
         * Additional options to pass to the docker run command (e.g. to set environment variables, volumes, etc.).
         * <p>
         * @return {@code this}
         * @param dockerAdditionalOptions Additional options to pass to the docker run command (e.g. to set environment variables, volumes, etc.). This parameter is required.
         */
        public Builder dockerAdditionalOptions(final java.util.List<java.lang.String> dockerAdditionalOptions) {
            this.config().dockerAdditionalOptions(dockerAdditionalOptions);
            return this;
        }

        /**
         * Root dir where to build in Docker.
         * <p>
         * @return {@code this}
         * @param dockerBuildRoot Root dir where to build in Docker. This parameter is required.
         */
        public Builder dockerBuildRoot(final java.lang.String dockerBuildRoot) {
            this.config().dockerBuildRoot(dockerBuildRoot);
            return this;
        }

        /**
         * Path to the Docker entrypoint to use.
         * <p>
         * @return {@code this}
         * @param dockerEntrypoint Path to the Docker entrypoint to use. This parameter is required.
         */
        public Builder dockerEntrypoint(final java.lang.String dockerEntrypoint) {
            this.config().dockerEntrypoint(dockerEntrypoint);
            return this;
        }

        /**
         * Path to a Dockerfile when building in Docker.
         * <p>
         * @return {@code this}
         * @param dockerFile Path to a Dockerfile when building in Docker. This parameter is required.
         */
        public Builder dockerFile(final java.lang.String dockerFile) {
            this.config().dockerFile(dockerFile);
            return this;
        }

        /**
         * Docker image to use for the build.
         * <p>
         * @return {@code this}
         * @param dockerImage Docker image to use for the build. This parameter is required.
         */
        public Builder dockerImage(final java.lang.String dockerImage) {
            this.config().dockerImage(dockerImage);
            return this;
        }

        /**
         * Whether to mount a shared pip cache folder into docker environment or not.
         * <p>
         * @return {@code this}
         * @param dockerPipCache Whether to mount a shared pip cache folder into docker environment or not. This parameter is required.
         */
        public Builder dockerPipCache(final java.lang.Object dockerPipCache) {
            this.config().dockerPipCache(dockerPipCache);
            return this;
        }

        /**
         * Whether to pass SSH_AUTH_SOCK into docker environment or not.
         * <p>
         * @return {@code this}
         * @param dockerWithSshAgent Whether to pass SSH_AUTH_SOCK into docker environment or not. This parameter is required.
         */
        public Builder dockerWithSshAgent(final java.lang.Boolean dockerWithSshAgent) {
            this.config().dockerWithSshAgent(dockerWithSshAgent);
            return this;
        }

        /**
         * A map that defines environment variables for the Lambda Function.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param environmentVariables A map that defines environment variables for the Lambda Function. This parameter is required.
         */
        public Builder environmentVariables(final java.util.Map<java.lang.String, java.lang.String> environmentVariables) {
            this.config().environmentVariables(environmentVariables);
            return this;
        }

        /**
         * Amount of ephemeral storage (/tmp) in MB your Lambda Function can use at runtime.
         * <p>
         * Valid value between 512 MB to 10,240 MB (10 GB).
         * 512
         * <p>
         * @return {@code this}
         * @param ephemeralStorageSize Amount of ephemeral storage (/tmp) in MB your Lambda Function can use at runtime. This parameter is required.
         */
        public Builder ephemeralStorageSize(final java.lang.Number ephemeralStorageSize) {
            this.config().ephemeralStorageSize(ephemeralStorageSize);
            return this;
        }

        /**
         * Map of event source mapping.
         * <p>
         * @return {@code this}
         * @param eventSourceMapping Map of event source mapping. This parameter is required.
         */
        public Builder eventSourceMapping(final java.lang.Object eventSourceMapping) {
            this.config().eventSourceMapping(eventSourceMapping);
            return this;
        }

        /**
         * The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
         * <p>
         * @return {@code this}
         * @param fileSystemArn The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system. This parameter is required.
         */
        public Builder fileSystemArn(final java.lang.String fileSystemArn) {
            this.config().fileSystemArn(fileSystemArn);
            return this;
        }

        /**
         * The path where the function can access the file system, starting with /mnt/.
         * <p>
         * @return {@code this}
         * @param fileSystemLocalMountPath The path where the function can access the file system, starting with /mnt/. This parameter is required.
         */
        public Builder fileSystemLocalMountPath(final java.lang.String fileSystemLocalMountPath) {
            this.config().fileSystemLocalMountPath(fileSystemLocalMountPath);
            return this;
        }

        /**
         * A unique name for your Lambda Function.
         * <p>
         * @return {@code this}
         * @param functionName A unique name for your Lambda Function. This parameter is required.
         */
        public Builder functionName(final java.lang.String functionName) {
            this.config().functionName(functionName);
            return this;
        }

        /**
         * A map of tags to assign only to the lambda function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param functionTags A map of tags to assign only to the lambda function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder functionTags(final java.util.Map<java.lang.String, java.lang.String> functionTags) {
            this.config().functionTags(functionTags);
            return this;
        }

        /**
         * Lambda Function entrypoint in your code.
         * <p>
         * @return {@code this}
         * @param handler Lambda Function entrypoint in your code. This parameter is required.
         */
        public Builder handler(final java.lang.String handler) {
            this.config().handler(handler);
            return this;
        }

        /**
         * The string to add into hashing function.
         * <p>
         * Useful when building same source path for different functions.
         * <p>
         * @return {@code this}
         * @param hashExtra The string to add into hashing function. This parameter is required.
         */
        public Builder hashExtra(final java.lang.String hashExtra) {
            this.config().hashExtra(hashExtra);
            return this;
        }

        /**
         * Whether to ignore changes to the function's source code hash.
         * <p>
         * Set to true if you manage infrastructure and code deployments separately.
         * <p>
         * @return {@code this}
         * @param ignoreSourceCodeHash Whether to ignore changes to the function's source code hash. This parameter is required.
         */
        public Builder ignoreSourceCodeHash(final java.lang.Boolean ignoreSourceCodeHash) {
            this.config().ignoreSourceCodeHash(ignoreSourceCodeHash);
            return this;
        }

        /**
         * The CMD for the docker image.
         * <p>
         * @return {@code this}
         * @param imageConfigCommand The CMD for the docker image. This parameter is required.
         */
        public Builder imageConfigCommand(final java.util.List<java.lang.String> imageConfigCommand) {
            this.config().imageConfigCommand(imageConfigCommand);
            return this;
        }

        /**
         * The ENTRYPOINT for the docker image.
         * <p>
         * @return {@code this}
         * @param imageConfigEntryPoint The ENTRYPOINT for the docker image. This parameter is required.
         */
        public Builder imageConfigEntryPoint(final java.util.List<java.lang.String> imageConfigEntryPoint) {
            this.config().imageConfigEntryPoint(imageConfigEntryPoint);
            return this;
        }

        /**
         * The working directory for the docker image.
         * <p>
         * @return {@code this}
         * @param imageConfigWorkingDirectory The working directory for the docker image. This parameter is required.
         */
        public Builder imageConfigWorkingDirectory(final java.lang.String imageConfigWorkingDirectory) {
            this.config().imageConfigWorkingDirectory(imageConfigWorkingDirectory);
            return this;
        }

        /**
         * The ECR image URI containing the function's deployment package.
         * <p>
         * @return {@code this}
         * @param imageUri The ECR image URI containing the function's deployment package. This parameter is required.
         */
        public Builder imageUri(final java.lang.String imageUri) {
            this.config().imageUri(imageUri);
            return this;
        }

        /**
         * Invoke mode of the Lambda Function URL.
         * <p>
         * Valid values are BUFFERED (default) and RESPONSE_STREAM.
         * <p>
         * @return {@code this}
         * @param invokeMode Invoke mode of the Lambda Function URL. This parameter is required.
         */
        public Builder invokeMode(final java.lang.String invokeMode) {
            this.config().invokeMode(invokeMode);
            return this;
        }

        /**
         * The ARN of KMS key to use by your Lambda Function.
         * <p>
         * @return {@code this}
         * @param kmsKeyArn The ARN of KMS key to use by your Lambda Function. This parameter is required.
         */
        public Builder kmsKeyArn(final java.lang.String kmsKeyArn) {
            this.config().kmsKeyArn(kmsKeyArn);
            return this;
        }

        /**
         * Set this to true if using Lambda&#64;Edge, to enable publishing, limit the timeout, and allow edgelambda.amazonaws.com to invoke the function.
         * <p>
         * @return {@code this}
         * @param lambdaAtEdge Set this to true if using Lambda&#64;Edge, to enable publishing, limit the timeout, and allow edgelambda.amazonaws.com to invoke the function. This parameter is required.
         */
        public Builder lambdaAtEdge(final java.lang.Boolean lambdaAtEdge) {
            this.config().lambdaAtEdge(lambdaAtEdge);
            return this;
        }

        /**
         * Whether to specify a wildcard in IAM policy used by Lambda&#64;Edge to allow logging in all regions true.
         * <p>
         * @return {@code this}
         * @param lambdaAtEdgeLogsAllRegions Whether to specify a wildcard in IAM policy used by Lambda&#64;Edge to allow logging in all regions true. This parameter is required.
         */
        public Builder lambdaAtEdgeLogsAllRegions(final java.lang.Boolean lambdaAtEdgeLogsAllRegions) {
            this.config().lambdaAtEdgeLogsAllRegions(lambdaAtEdgeLogsAllRegions);
            return this;
        }

        /**
         * IAM role ARN attached to the Lambda Function.
         * <p>
         * This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See Lambda Permission Model for more details.
         * <p>
         * @return {@code this}
         * @param lambdaRole IAM role ARN attached to the Lambda Function. This parameter is required.
         */
        public Builder lambdaRole(final java.lang.String lambdaRole) {
            this.config().lambdaRole(lambdaRole);
            return this;
        }

        /**
         * Name of Lambda Layer to create.
         * <p>
         * @return {@code this}
         * @param layerName Name of Lambda Layer to create. This parameter is required.
         */
        public Builder layerName(final java.lang.String layerName) {
            this.config().layerName(layerName);
            return this;
        }

        /**
         * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function.
         * <p>
         * @return {@code this}
         * @param layers List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. This parameter is required.
         */
        public Builder layers(final java.util.List<java.lang.String> layers) {
            this.config().layers(layers);
            return this;
        }

        /**
         * Whether to retain the old version of a previously deployed Lambda Layer.
         * <p>
         * @return {@code this}
         * @param layerSkipDestroy Whether to retain the old version of a previously deployed Lambda Layer. This parameter is required.
         */
        public Builder layerSkipDestroy(final java.lang.Boolean layerSkipDestroy) {
            this.config().layerSkipDestroy(layerSkipDestroy);
            return this;
        }

        /**
         * License info for your Lambda Layer.
         * <p>
         * Eg, MIT or full url of a license.
         * <p>
         * @return {@code this}
         * @param licenseInfo License info for your Lambda Layer. This parameter is required.
         */
        public Builder licenseInfo(final java.lang.String licenseInfo) {
            this.config().licenseInfo(licenseInfo);
            return this;
        }

        /**
         * The absolute path to an existing zip-file to use.
         * <p>
         * @return {@code this}
         * @param localExistingPackage The absolute path to an existing zip-file to use. This parameter is required.
         */
        public Builder localExistingPackage(final java.lang.String localExistingPackage) {
            this.config().localExistingPackage(localExistingPackage);
            return this;
        }

        /**
         * The application log level of the Lambda Function.
         * <p>
         * Valid values are "TRACE", "DEBUG", "INFO", "WARN", "ERROR", or "FATAL".
         * INFO
         * <p>
         * @return {@code this}
         * @param loggingApplicationLogLevel The application log level of the Lambda Function. This parameter is required.
         */
        public Builder loggingApplicationLogLevel(final java.lang.String loggingApplicationLogLevel) {
            this.config().loggingApplicationLogLevel(loggingApplicationLogLevel);
            return this;
        }

        /**
         * The log format of the Lambda Function.
         * <p>
         * Valid values are "JSON" or "Text".
         * Text
         * <p>
         * @return {@code this}
         * @param loggingLogFormat The log format of the Lambda Function. This parameter is required.
         */
        public Builder loggingLogFormat(final java.lang.String loggingLogFormat) {
            this.config().loggingLogFormat(loggingLogFormat);
            return this;
        }

        /**
         * The CloudWatch log group to send logs to.
         * <p>
         * @return {@code this}
         * @param loggingLogGroup The CloudWatch log group to send logs to. This parameter is required.
         */
        public Builder loggingLogGroup(final java.lang.String loggingLogGroup) {
            this.config().loggingLogGroup(loggingLogGroup);
            return this;
        }

        /**
         * The system log level of the Lambda Function.
         * <p>
         * Valid values are "DEBUG", "INFO", or "WARN".
         * INFO
         * <p>
         * @return {@code this}
         * @param loggingSystemLogLevel The system log level of the Lambda Function. This parameter is required.
         */
        public Builder loggingSystemLogLevel(final java.lang.String loggingSystemLogLevel) {
            this.config().loggingSystemLogLevel(loggingSystemLogLevel);
            return this;
        }

        /**
         * Maximum age of a request that Lambda sends to a function for processing in seconds.
         * <p>
         * Valid values between 60 and 21600.
         * <p>
         * @return {@code this}
         * @param maximumEventAgeInSeconds Maximum age of a request that Lambda sends to a function for processing in seconds. This parameter is required.
         */
        public Builder maximumEventAgeInSeconds(final java.lang.Number maximumEventAgeInSeconds) {
            this.config().maximumEventAgeInSeconds(maximumEventAgeInSeconds);
            return this;
        }

        /**
         * Maximum number of times to retry when the function returns an error.
         * <p>
         * Valid values between 0 and 2. Defaults to 2.
         * <p>
         * @return {@code this}
         * @param maximumRetryAttempts Maximum number of times to retry when the function returns an error. This parameter is required.
         */
        public Builder maximumRetryAttempts(final java.lang.Number maximumRetryAttempts) {
            this.config().maximumRetryAttempts(maximumRetryAttempts);
            return this;
        }

        /**
         * Amount of memory in MB your Lambda Function can use at runtime.
         * <p>
         * Valid value between 128 MB to 10,240 MB (10 GB), in 64 MB increments.
         * 128
         * <p>
         * @return {@code this}
         * @param memorySize Amount of memory in MB your Lambda Function can use at runtime. This parameter is required.
         */
        public Builder memorySize(final java.lang.Number memorySize) {
            this.config().memorySize(memorySize);
            return this;
        }

        /**
         * Number of policies to attach to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param numberOfPolicies Number of policies to attach to IAM role for Lambda Function. This parameter is required.
         */
        public Builder numberOfPolicies(final java.lang.Number numberOfPolicies) {
            this.config().numberOfPolicies(numberOfPolicies);
            return this;
        }

        /**
         * Number of policies JSON to attach to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param numberOfPolicyJsons Number of policies JSON to attach to IAM role for Lambda Function. This parameter is required.
         */
        public Builder numberOfPolicyJsons(final java.lang.Number numberOfPolicyJsons) {
            this.config().numberOfPolicyJsons(numberOfPolicyJsons);
            return this;
        }

        /**
         * The Lambda deployment package type.
         * <p>
         * Valid options: Zip or Image
         * Zip
         * <p>
         * @return {@code this}
         * @param packageType The Lambda deployment package type. This parameter is required.
         */
        public Builder packageType(final java.lang.String packageType) {
            this.config().packageType(packageType);
            return this;
        }

        /**
         * List of policy statements ARN to attach to Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policies List of policy statements ARN to attach to Lambda Function role. This parameter is required.
         */
        public Builder policies(final java.util.List<java.lang.String> policies) {
            this.config().policies(policies);
            return this;
        }

        /**
         * An additional policy document ARN to attach to the Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policy An additional policy document ARN to attach to the Lambda Function role. This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config().policy(policy);
            return this;
        }

        /**
         * An additional policy document as JSON to attach to the Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policyJson An additional policy document as JSON to attach to the Lambda Function role. This parameter is required.
         */
        public Builder policyJson(final java.lang.String policyJson) {
            this.config().policyJson(policyJson);
            return this;
        }

        /**
         * List of additional policy documents as JSON to attach to Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policyJsons List of additional policy documents as JSON to attach to Lambda Function role. This parameter is required.
         */
        public Builder policyJsons(final java.util.List<java.lang.String> policyJsons) {
            this.config().policyJsons(policyJsons);
            return this;
        }

        /**
         * IAM policy name.
         * <p>
         * It override the default value, which is the same as role_name
         * <p>
         * @return {@code this}
         * @param policyName IAM policy name. This parameter is required.
         */
        public Builder policyName(final java.lang.String policyName) {
            this.config().policyName(policyName);
            return this;
        }

        /**
         * Path of policies to that should be added to IAM role for Lambda Function.
         * <p>
         * @return {@code this}
         * @param policyPath Path of policies to that should be added to IAM role for Lambda Function. This parameter is required.
         */
        public Builder policyPath(final java.lang.String policyPath) {
            this.config().policyPath(policyPath);
            return this;
        }

        /**
         * Map of dynamic policy statements to attach to Lambda Function role.
         * <p>
         * @return {@code this}
         * @param policyStatements Map of dynamic policy statements to attach to Lambda Function role. This parameter is required.
         */
        public Builder policyStatements(final java.lang.Object policyStatements) {
            this.config().policyStatements(policyStatements);
            return this;
        }

        /**
         * Amount of capacity to allocate.
         * <p>
         * Set to 1 or greater to enable, or set to 0 to disable provisioned concurrency.
         * -1
         * <p>
         * @return {@code this}
         * @param provisionedConcurrentExecutions Amount of capacity to allocate. This parameter is required.
         */
        public Builder provisionedConcurrentExecutions(final java.lang.Number provisionedConcurrentExecutions) {
            this.config().provisionedConcurrentExecutions(provisionedConcurrentExecutions);
            return this;
        }

        /**
         * Whether to publish creation/change as new Lambda Function Version.
         * <p>
         * @return {@code this}
         * @param publish Whether to publish creation/change as new Lambda Function Version. This parameter is required.
         */
        public Builder publish(final java.lang.Boolean publish) {
            this.config().publish(publish);
            return this;
        }

        /**
         * Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?
         * <p>
         * More info: https://en.wikipedia.org/wiki/Putin_khuylo!
         * true
         * <p>
         * @return {@code this}
         * @param putinKhuylo Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?. This parameter is required.
         */
        public Builder putinKhuylo(final java.lang.Boolean putinKhuylo) {
            this.config().putinKhuylo(putinKhuylo);
            return this;
        }

        /**
         * Whether to recreate missing Lambda package if it is missing locally or not true.
         * <p>
         * @return {@code this}
         * @param recreateMissingPackage Whether to recreate missing Lambda package if it is missing locally or not true. This parameter is required.
         */
        public Builder recreateMissingPackage(final java.lang.Boolean recreateMissingPackage) {
            this.config().recreateMissingPackage(recreateMissingPackage);
            return this;
        }

        /**
         * (Optional) List of security group IDs to assign to orphaned Lambda function network interfaces upon destruction.
         * <p>
         * replace_security_groups_on_destroy must be set to true to use this attribute.
         * <p>
         * @return {@code this}
         * @param replacementSecurityGroupIds (Optional) List of security group IDs to assign to orphaned Lambda function network interfaces upon destruction. This parameter is required.
         */
        public Builder replacementSecurityGroupIds(final java.util.List<java.lang.String> replacementSecurityGroupIds) {
            this.config().replacementSecurityGroupIds(replacementSecurityGroupIds);
            return this;
        }

        /**
         * (Optional) When true, all security groups defined in vpc_security_group_ids will be replaced with the default security group after the function is destroyed.
         * <p>
         * Set the replacement_security_group_ids variable to use a custom list of security groups for replacement instead.
         * <p>
         * @return {@code this}
         * @param replaceSecurityGroupsOnDestroy (Optional) When true, all security groups defined in vpc_security_group_ids will be replaced with the default security group after the function is destroyed. This parameter is required.
         */
        public Builder replaceSecurityGroupsOnDestroy(final java.lang.Boolean replaceSecurityGroupsOnDestroy) {
            this.config().replaceSecurityGroupsOnDestroy(replaceSecurityGroupsOnDestroy);
            return this;
        }

        /**
         * The amount of reserved concurrent executions for this Lambda Function.
         * <p>
         * A value of 0 disables Lambda Function from being triggered and -1 removes any concurrency limitations. Defaults to Unreserved Concurrency Limits -1.
         * -1
         * <p>
         * @return {@code this}
         * @param reservedConcurrentExecutions The amount of reserved concurrent executions for this Lambda Function. This parameter is required.
         */
        public Builder reservedConcurrentExecutions(final java.lang.Number reservedConcurrentExecutions) {
            this.config().reservedConcurrentExecutions(reservedConcurrentExecutions);
            return this;
        }

        /**
         * Description of IAM role to use for Lambda Function.
         * <p>
         * @return {@code this}
         * @param roleDescription Description of IAM role to use for Lambda Function. This parameter is required.
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
         * Maximum session duration, in seconds, for the IAM role 3.600.
         * <p>
         * @return {@code this}
         * @param roleMaximumSessionDuration Maximum session duration, in seconds, for the IAM role 3.600. This parameter is required.
         */
        public Builder roleMaximumSessionDuration(final java.lang.Number roleMaximumSessionDuration) {
            this.config().roleMaximumSessionDuration(roleMaximumSessionDuration);
            return this;
        }

        /**
         * Name of IAM role to use for Lambda Function.
         * <p>
         * @return {@code this}
         * @param roleName Name of IAM role to use for Lambda Function. This parameter is required.
         */
        public Builder roleName(final java.lang.String roleName) {
            this.config().roleName(roleName);
            return this;
        }

        /**
         * Path of IAM role to use for Lambda Function.
         * <p>
         * @return {@code this}
         * @param rolePath Path of IAM role to use for Lambda Function. This parameter is required.
         */
        public Builder rolePath(final java.lang.String rolePath) {
            this.config().rolePath(rolePath);
            return this;
        }

        /**
         * The ARN of the policy that is used to set the permissions boundary for the IAM role used by Lambda Function.
         * <p>
         * @return {@code this}
         * @param rolePermissionsBoundary The ARN of the policy that is used to set the permissions boundary for the IAM role used by Lambda Function. This parameter is required.
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
         * Lambda Function runtime.
         * <p>
         * @return {@code this}
         * @param runtime Lambda Function runtime. This parameter is required.
         */
        public Builder runtime(final java.lang.String runtime) {
            this.config().runtime(runtime);
            return this;
        }

        /**
         * The canned ACL to apply.
         * <p>
         * Valid values are private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, and bucket-owner-full-control. Defaults to private.
         * private
         * <p>
         * @return {@code this}
         * @param s3Acl The canned ACL to apply. This parameter is required.
         */
        public Builder s3Acl(final java.lang.String s3Acl) {
            this.config().s3Acl(s3Acl);
            return this;
        }

        /**
         * S3 bucket to store artifacts.
         * <p>
         * @return {@code this}
         * @param s3Bucket S3 bucket to store artifacts. This parameter is required.
         */
        public Builder s3Bucket(final java.lang.String s3Bucket) {
            this.config().s3Bucket(s3Bucket);
            return this;
        }

        /**
         * The S3 bucket object with keys bucket, key, version pointing to an existing zip-file to use The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param s3ExistingPackage The S3 bucket object with keys bucket, key, version pointing to an existing zip-file to use The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder s3ExistingPackage(final java.util.Map<java.lang.String, java.lang.String> s3ExistingPackage) {
            this.config().s3ExistingPackage(s3ExistingPackage);
            return this;
        }

        /**
         * Specifies a custom KMS key to use for S3 object encryption.
         * <p>
         * @return {@code this}
         * @param s3KmsKeyId Specifies a custom KMS key to use for S3 object encryption. This parameter is required.
         */
        public Builder s3KmsKeyId(final java.lang.String s3KmsKeyId) {
            this.config().s3KmsKeyId(s3KmsKeyId);
            return this;
        }

        /**
         * Whether to override the default_tags from provider?
         * <p>
         * NB: S3 objects support a maximum of 10 tags.
         * <p>
         * @return {@code this}
         * @param s3ObjectOverrideDefaultTags Whether to override the default_tags from provider?. This parameter is required.
         */
        public Builder s3ObjectOverrideDefaultTags(final java.lang.Boolean s3ObjectOverrideDefaultTags) {
            this.config().s3ObjectOverrideDefaultTags(s3ObjectOverrideDefaultTags);
            return this;
        }

        /**
         * Specifies the desired Storage Class for the artifact uploaded to S3.
         * <p>
         * Can be either STANDARD, REDUCED_REDUNDANCY, ONEZONE_IA, INTELLIGENT_TIERING, or STANDARD_IA.
         * ONEZONE_IA
         * <p>
         * @return {@code this}
         * @param s3ObjectStorageClass Specifies the desired Storage Class for the artifact uploaded to S3. This parameter is required.
         */
        public Builder s3ObjectStorageClass(final java.lang.String s3ObjectStorageClass) {
            this.config().s3ObjectStorageClass(s3ObjectStorageClass);
            return this;
        }

        /**
         * A map of tags to assign to S3 bucket object.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param s3ObjectTags A map of tags to assign to S3 bucket object. This parameter is required.
         */
        public Builder s3ObjectTags(final java.util.Map<java.lang.String, java.lang.String> s3ObjectTags) {
            this.config().s3ObjectTags(s3ObjectTags);
            return this;
        }

        /**
         * Set to true to not merge tags with s3_object_tags.
         * <p>
         * Useful to avoid breaching S3 Object 10 tag limit.
         * <p>
         * @return {@code this}
         * @param s3ObjectTagsOnly Set to true to not merge tags with s3_object_tags. This parameter is required.
         */
        public Builder s3ObjectTagsOnly(final java.lang.Boolean s3ObjectTagsOnly) {
            this.config().s3ObjectTagsOnly(s3ObjectTagsOnly);
            return this;
        }

        /**
         * Directory name where artifacts should be stored in the S3 bucket.
         * <p>
         * If unset, the path from <code>artifacts_dir</code> is used
         * <p>
         * @return {@code this}
         * @param s3Prefix Directory name where artifacts should be stored in the S3 bucket. This parameter is required.
         */
        public Builder s3Prefix(final java.lang.String s3Prefix) {
            this.config().s3Prefix(s3Prefix);
            return this;
        }

        /**
         * Specifies server-side encryption of the object in S3.
         * <p>
         * Valid values are "AES256" and "aws:kms".
         * <p>
         * @return {@code this}
         * @param s3ServerSideEncryption Specifies server-side encryption of the object in S3. This parameter is required.
         */
        public Builder s3ServerSideEncryption(final java.lang.String s3ServerSideEncryption) {
            this.config().s3ServerSideEncryption(s3ServerSideEncryption);
            return this;
        }

        /**
         * (Optional) Snap start settings for low-latency startups.
         * <p>
         * @return {@code this}
         * @param snapStart (Optional) Snap start settings for low-latency startups. This parameter is required.
         */
        public Builder snapStart(final java.lang.Boolean snapStart) {
            this.config().snapStart(snapStart);
            return this;
        }

        /**
         * The absolute path to a local file or directory containing your Lambda source code.
         * <p>
         * @return {@code this}
         * @param sourcePath The absolute path to a local file or directory containing your Lambda source code. This parameter is required.
         */
        public Builder sourcePath(final java.lang.Object sourcePath) {
            this.config().sourcePath(sourcePath);
            return this;
        }

        /**
         * Whether to store produced artifacts on S3 or locally.
         * <p>
         * @return {@code this}
         * @param storeOnS3 Whether to store produced artifacts on S3 or locally. This parameter is required.
         */
        public Builder storeOnS3(final java.lang.Boolean storeOnS3) {
            this.config().storeOnS3(storeOnS3);
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
         * The amount of time your Lambda Function has to run in seconds.
         * <p>
         * 3
         * <p>
         * @return {@code this}
         * @param timeout The amount of time your Lambda Function has to run in seconds. This parameter is required.
         */
        public Builder timeout(final java.lang.Number timeout) {
            this.config().timeout(timeout);
            return this;
        }

        /**
         * Define maximum timeout for creating, updating, and deleting Lambda Function resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param timeouts Define maximum timeout for creating, updating, and deleting Lambda Function resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder timeouts(final java.util.Map<java.lang.String, java.lang.String> timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * Tracing mode of the Lambda Function.
         * <p>
         * Valid value can be either PassThrough or Active.
         * <p>
         * @return {@code this}
         * @param tracingMode Tracing mode of the Lambda Function. This parameter is required.
         */
        public Builder tracingMode(final java.lang.String tracingMode) {
            this.config().tracingMode(tracingMode);
            return this;
        }

        /**
         * Whether to recreate the Lambda package if the timestamp changes true.
         * <p>
         * @return {@code this}
         * @param triggerOnPackageTimestamp Whether to recreate the Lambda package if the timestamp changes true. This parameter is required.
         */
        public Builder triggerOnPackageTimestamp(final java.lang.Boolean triggerOnPackageTimestamp) {
            this.config().triggerOnPackageTimestamp(triggerOnPackageTimestamp);
            return this;
        }

        /**
         * List of additional trusted entities for assuming Lambda Function role (trust relationship).
         * <p>
         * @return {@code this}
         * @param trustedEntities List of additional trusted entities for assuming Lambda Function role (trust relationship). This parameter is required.
         */
        public Builder trustedEntities(final java.lang.Object trustedEntities) {
            this.config().trustedEntities(trustedEntities);
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
         * List of security group ids when Lambda Function should run in the VPC.
         * <p>
         * @return {@code this}
         * @param vpcSecurityGroupIds List of security group ids when Lambda Function should run in the VPC. This parameter is required.
         */
        public Builder vpcSecurityGroupIds(final java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.config().vpcSecurityGroupIds(vpcSecurityGroupIds);
            return this;
        }

        /**
         * List of subnet ids when Lambda Function should run in the VPC.
         * <p>
         * Usually private or intra subnets.
         * <p>
         * @return {@code this}
         * @param vpcSubnetIds List of subnet ids when Lambda Function should run in the VPC. This parameter is required.
         */
        public Builder vpcSubnetIds(final java.util.List<java.lang.String> vpcSubnetIds) {
            this.config().vpcSubnetIds(vpcSubnetIds);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.lambda.Lambda}.
         */
        @Override
        public imports.lambda.Lambda build() {
            return new imports.lambda.Lambda(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.lambda.LambdaConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.lambda.LambdaConfig.Builder();
            }
            return this.config;
        }
    }
}
