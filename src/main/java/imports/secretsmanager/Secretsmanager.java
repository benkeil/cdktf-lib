package imports.secretsmanager;

/**
 * Defines an Secretsmanager based on a Terraform module.
 * <p>
 * Docs at Terraform Registry: {@link https://registry.terraform.io/modules/terraform-aws-modules/secrets-manager/aws/~> 1.1 terraform-aws-modules/secrets-manager/aws}
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:31.451Z")
@software.amazon.jsii.Jsii(module = imports.secretsmanager.$Module.class, fqn = "secretsmanager.Secretsmanager")
public class Secretsmanager extends com.hashicorp.cdktf.TerraformModule {

    protected Secretsmanager(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Secretsmanager(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Secretsmanager(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.secretsmanager.SecretsmanagerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public Secretsmanager(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
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

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "secretArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "secretIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretReplicaOutput() {
        return software.amazon.jsii.Kernel.get(this, "secretReplicaOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSecretVersionIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "secretVersionIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicy() {
        return software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBlockPublicPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "blockPublicPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreate(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "create", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePolicy() {
        return software.amazon.jsii.Kernel.get(this, "createPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreatePolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRandomPassword() {
        return software.amazon.jsii.Kernel.get(this, "createRandomPassword", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateRandomPassword(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createRandomPassword", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableRotation() {
        return software.amazon.jsii.Kernel.get(this, "enableRotation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableRotation(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableRotation", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getForceOverwriteReplicaSecret() {
        return software.amazon.jsii.Kernel.get(this, "forceOverwriteReplicaSecret", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setForceOverwriteReplicaSecret(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceOverwriteReplicaSecret", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreSecretChanges() {
        return software.amazon.jsii.Kernel.get(this, "ignoreSecretChanges", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIgnoreSecretChanges(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ignoreSecretChanges", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKeyId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKeyId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOverridePolicyDocuments() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "overridePolicyDocuments", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setOverridePolicyDocuments(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "overridePolicyDocuments", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getPolicyStatements() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setPolicyStatements(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "policyStatements", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRandomPasswordLength() {
        return software.amazon.jsii.Kernel.get(this, "randomPasswordLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRandomPasswordLength(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "randomPasswordLength", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRandomPasswordOverrideSpecial() {
        return software.amazon.jsii.Kernel.get(this, "randomPasswordOverrideSpecial", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRandomPasswordOverrideSpecial(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "randomPasswordOverrideSpecial", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRecoveryWindowInDays() {
        return software.amazon.jsii.Kernel.get(this, "recoveryWindowInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRecoveryWindowInDays(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "recoveryWindowInDays", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getReplica() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "replica", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setReplica(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "replica", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRotationLambdaArn() {
        return software.amazon.jsii.Kernel.get(this, "rotationLambdaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRotationLambdaArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rotationLambdaArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getRotationRules() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "rotationRules", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setRotationRules(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "rotationRules", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretBinary() {
        return software.amazon.jsii.Kernel.get(this, "secretBinary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretBinary(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretBinary", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSecretString() {
        return software.amazon.jsii.Kernel.get(this, "secretString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSecretString(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "secretString", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSourcePolicyDocuments() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sourcePolicyDocuments", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setSourcePolicyDocuments(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "sourcePolicyDocuments", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVersionStages() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "versionStages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setVersionStages(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "versionStages", value);
    }

    /**
     * A fluent builder for {@link imports.secretsmanager.Secretsmanager}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.secretsmanager.Secretsmanager> {
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
        private imports.secretsmanager.SecretsmanagerConfig.Builder config;

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
         * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
         * <p>
         * @return {@code this}
         * @param blockPublicPolicy Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret. This parameter is required.
         */
        public Builder blockPublicPolicy(final java.lang.Boolean blockPublicPolicy) {
            this.config().blockPublicPolicy(blockPublicPolicy);
            return this;
        }

        /**
         * Determines whether resources will be created (affects all resources) true.
         * <p>
         * @return {@code this}
         * @param create Determines whether resources will be created (affects all resources) true. This parameter is required.
         */
        public Builder create(final java.lang.Boolean create) {
            this.config().create(create);
            return this;
        }

        /**
         * Determines whether a policy will be created.
         * <p>
         * @return {@code this}
         * @param createPolicy Determines whether a policy will be created. This parameter is required.
         */
        public Builder createPolicy(final java.lang.Boolean createPolicy) {
            this.config().createPolicy(createPolicy);
            return this;
        }

        /**
         * Determines whether a random password will be generated.
         * <p>
         * @return {@code this}
         * @param createRandomPassword Determines whether a random password will be generated. This parameter is required.
         */
        public Builder createRandomPassword(final java.lang.Boolean createRandomPassword) {
            this.config().createRandomPassword(createRandomPassword);
            return this;
        }

        /**
         * A description of the secret.
         * <p>
         * @return {@code this}
         * @param description A description of the secret. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config().description(description);
            return this;
        }

        /**
         * Determines whether secret rotation is enabled.
         * <p>
         * @return {@code this}
         * @param enableRotation Determines whether secret rotation is enabled. This parameter is required.
         */
        public Builder enableRotation(final java.lang.Boolean enableRotation) {
            this.config().enableRotation(enableRotation);
            return this;
        }

        /**
         * Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
         * <p>
         * @return {@code this}
         * @param forceOverwriteReplicaSecret Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region. This parameter is required.
         */
        public Builder forceOverwriteReplicaSecret(final java.lang.Boolean forceOverwriteReplicaSecret) {
            this.config().forceOverwriteReplicaSecret(forceOverwriteReplicaSecret);
            return this;
        }

        /**
         * Determines whether or not Terraform will ignore changes made externally to <code>secret_string</code> or <code>secret_binary</code>.
         * <p>
         * Changing this value after creation is a destructive operation
         * <p>
         * @return {@code this}
         * @param ignoreSecretChanges Determines whether or not Terraform will ignore changes made externally to <code>secret_string</code> or <code>secret_binary</code>. This parameter is required.
         */
        public Builder ignoreSecretChanges(final java.lang.Boolean ignoreSecretChanges) {
            this.config().ignoreSecretChanges(ignoreSecretChanges);
            return this;
        }

        /**
         * ARN or Id of the AWS KMS key to be used to encrypt the secret values in the versions stored in this secret.
         * <p>
         * If you need to reference a CMK in a different account, you can use only the key ARN. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default KMS key (the one named <code>aws/secretsmanager</code>
         * <p>
         * @return {@code this}
         * @param kmsKeyId ARN or Id of the AWS KMS key to be used to encrypt the secret values in the versions stored in this secret. This parameter is required.
         */
        public Builder kmsKeyId(final java.lang.String kmsKeyId) {
            this.config().kmsKeyId(kmsKeyId);
            return this;
        }

        /**
         * Friendly name of the new secret.
         * <p>
         * The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: <code>/_+=.&#64;-</code>
         * <p>
         * @return {@code this}
         * @param name Friendly name of the new secret. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * Creates a unique name beginning with the specified prefix.
         * <p>
         * @return {@code this}
         * @param namePrefix Creates a unique name beginning with the specified prefix. This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config().namePrefix(namePrefix);
            return this;
        }

        /**
         * List of IAM policy documents that are merged together into the exported document.
         * <p>
         * In merging, statements with non-blank <code>sid</code>s will override statements with the same <code>sid</code>
         * <p>
         * @return {@code this}
         * @param overridePolicyDocuments List of IAM policy documents that are merged together into the exported document. This parameter is required.
         */
        public Builder overridePolicyDocuments(final java.util.List<java.lang.String> overridePolicyDocuments) {
            this.config().overridePolicyDocuments(overridePolicyDocuments);
            return this;
        }

        /**
         * A map of IAM policy [statements](https://registry.terraform.io/providers/hashicorp/aws/latest/docs/data-sources/iam_policy_document#statement) for custom permission usage The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param policyStatements A map of IAM policy [statements](https://registry.terraform.io/providers/hashicorp/aws/latest/docs/data-sources/iam_policy_document#statement) for custom permission usage The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder policyStatements(final java.util.Map<java.lang.String, ? extends java.lang.Object> policyStatements) {
            this.config().policyStatements(policyStatements);
            return this;
        }

        /**
         * The length of the generated random password 32.
         * <p>
         * @return {@code this}
         * @param randomPasswordLength The length of the generated random password 32. This parameter is required.
         */
        public Builder randomPasswordLength(final java.lang.Number randomPasswordLength) {
            this.config().randomPasswordLength(randomPasswordLength);
            return this;
        }

        /**
         * Supply your own list of special characters to use for string generation.
         * <p>
         * This overrides the default character list in the special argument
         * !&#64;#$%&amp;*()-_=+[]{}&lt;&gt;:?
         * <p>
         * @return {@code this}
         * @param randomPasswordOverrideSpecial Supply your own list of special characters to use for string generation. This parameter is required.
         */
        public Builder randomPasswordOverrideSpecial(final java.lang.String randomPasswordOverrideSpecial) {
            this.config().randomPasswordOverrideSpecial(randomPasswordOverrideSpecial);
            return this;
        }

        /**
         * Number of days that AWS Secrets Manager waits before it can delete the secret.
         * <p>
         * This value can be <code>0</code> to force deletion without recovery or range from <code>7</code> to <code>30</code> days. The default value is <code>30</code>
         * <p>
         * @return {@code this}
         * @param recoveryWindowInDays Number of days that AWS Secrets Manager waits before it can delete the secret. This parameter is required.
         */
        public Builder recoveryWindowInDays(final java.lang.Number recoveryWindowInDays) {
            this.config().recoveryWindowInDays(recoveryWindowInDays);
            return this;
        }

        /**
         * Configuration block to support secret replication The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param replica Configuration block to support secret replication The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder replica(final java.util.Map<java.lang.String, ? extends java.lang.Object> replica) {
            this.config().replica(replica);
            return this;
        }

        /**
         * Specifies the ARN of the Lambda function that can rotate the secret.
         * <p>
         * @return {@code this}
         * @param rotationLambdaArn Specifies the ARN of the Lambda function that can rotate the secret. This parameter is required.
         */
        public Builder rotationLambdaArn(final java.lang.String rotationLambdaArn) {
            this.config().rotationLambdaArn(rotationLambdaArn);
            return this;
        }

        /**
         * A structure that defines the rotation configuration for this secret The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param rotationRules A structure that defines the rotation configuration for this secret The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder rotationRules(final java.util.Map<java.lang.String, ? extends java.lang.Object> rotationRules) {
            this.config().rotationRules(rotationRules);
            return this;
        }

        /**
         * Specifies binary data that you want to encrypt and store in this version of the secret.
         * <p>
         * This is required if <code>secret_string</code> is not set. Needs to be encoded to base64
         * <p>
         * @return {@code this}
         * @param secretBinary Specifies binary data that you want to encrypt and store in this version of the secret. This parameter is required.
         */
        public Builder secretBinary(final java.lang.String secretBinary) {
            this.config().secretBinary(secretBinary);
            return this;
        }

        /**
         * Specifies text data that you want to encrypt and store in this version of the secret.
         * <p>
         * This is required if <code>secret_binary</code> is not set
         * <p>
         * @return {@code this}
         * @param secretString Specifies text data that you want to encrypt and store in this version of the secret. This parameter is required.
         */
        public Builder secretString(final java.lang.String secretString) {
            this.config().secretString(secretString);
            return this;
        }

        /**
         * List of IAM policy documents that are merged together into the exported document.
         * <p>
         * Statements must have unique <code>sid</code>s
         * <p>
         * @return {@code this}
         * @param sourcePolicyDocuments List of IAM policy documents that are merged together into the exported document. This parameter is required.
         */
        public Builder sourcePolicyDocuments(final java.util.List<java.lang.String> sourcePolicyDocuments) {
            this.config().sourcePolicyDocuments(sourcePolicyDocuments);
            return this;
        }

        /**
         * A map of tags to add to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param tags A map of tags to add to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * Specifies a list of staging labels that are attached to this version of the secret.
         * <p>
         * A staging label must be unique to a single version of the secret
         * <p>
         * @return {@code this}
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret. This parameter is required.
         */
        public Builder versionStages(final java.util.List<java.lang.String> versionStages) {
            this.config().versionStages(versionStages);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.secretsmanager.Secretsmanager}.
         */
        @Override
        public imports.secretsmanager.Secretsmanager build() {
            return new imports.secretsmanager.Secretsmanager(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.secretsmanager.SecretsmanagerConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.secretsmanager.SecretsmanagerConfig.Builder();
            }
            return this.config;
        }
    }
}
