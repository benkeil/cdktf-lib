package imports.secretsmanager;

@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:31.458Z")
@software.amazon.jsii.Jsii(module = imports.secretsmanager.$Module.class, fqn = "secretsmanager.SecretsmanagerConfig")
@software.amazon.jsii.Jsii.Proxy(SecretsmanagerConfig.Jsii$Proxy.class)
public interface SecretsmanagerConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserConfig {

    /**
     * Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicy() {
        return null;
    }

    /**
     * Determines whether resources will be created (affects all resources) true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return null;
    }

    /**
     * Determines whether a policy will be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePolicy() {
        return null;
    }

    /**
     * Determines whether a random password will be generated.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRandomPassword() {
        return null;
    }

    /**
     * A description of the secret.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Determines whether secret rotation is enabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableRotation() {
        return null;
    }

    /**
     * Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceOverwriteReplicaSecret() {
        return null;
    }

    /**
     * Determines whether or not Terraform will ignore changes made externally to <code>secret_string</code> or <code>secret_binary</code>.
     * <p>
     * Changing this value after creation is a destructive operation
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreSecretChanges() {
        return null;
    }

    /**
     * ARN or Id of the AWS KMS key to be used to encrypt the secret values in the versions stored in this secret.
     * <p>
     * If you need to reference a CMK in a different account, you can use only the key ARN. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default KMS key (the one named <code>aws/secretsmanager</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyId() {
        return null;
    }

    /**
     * Friendly name of the new secret.
     * <p>
     * The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: <code>/_+=.&#64;-</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Creates a unique name beginning with the specified prefix.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    /**
     * List of IAM policy documents that are merged together into the exported document.
     * <p>
     * In merging, statements with non-blank <code>sid</code>s will override statements with the same <code>sid</code>
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOverridePolicyDocuments() {
        return null;
    }

    /**
     * A map of IAM policy [statements](https://registry.terraform.io/providers/hashicorp/aws/latest/docs/data-sources/iam_policy_document#statement) for custom permission usage The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getPolicyStatements() {
        return null;
    }

    /**
     * The length of the generated random password 32.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRandomPasswordLength() {
        return null;
    }

    /**
     * Supply your own list of special characters to use for string generation.
     * <p>
     * This overrides the default character list in the special argument
     * !&#64;#$%&amp;*()-_=+[]{}&lt;&gt;:?
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRandomPasswordOverrideSpecial() {
        return null;
    }

    /**
     * Number of days that AWS Secrets Manager waits before it can delete the secret.
     * <p>
     * This value can be <code>0</code> to force deletion without recovery or range from <code>7</code> to <code>30</code> days. The default value is <code>30</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRecoveryWindowInDays() {
        return null;
    }

    /**
     * Configuration block to support secret replication The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getReplica() {
        return null;
    }

    /**
     * Specifies the ARN of the Lambda function that can rotate the secret.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRotationLambdaArn() {
        return null;
    }

    /**
     * A structure that defines the rotation configuration for this secret The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getRotationRules() {
        return null;
    }

    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret.
     * <p>
     * This is required if <code>secret_string</code> is not set. Needs to be encoded to base64
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretBinary() {
        return null;
    }

    /**
     * Specifies text data that you want to encrypt and store in this version of the secret.
     * <p>
     * This is required if <code>secret_binary</code> is not set
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretString() {
        return null;
    }

    /**
     * List of IAM policy documents that are merged together into the exported document.
     * <p>
     * Statements must have unique <code>sid</code>s
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSourcePolicyDocuments() {
        return null;
    }

    /**
     * A map of tags to add to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Specifies a list of staging labels that are attached to this version of the secret.
     * <p>
     * A staging label must be unique to a single version of the secret
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVersionStages() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SecretsmanagerConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SecretsmanagerConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SecretsmanagerConfig> {
        java.lang.Boolean blockPublicPolicy;
        java.lang.Boolean create;
        java.lang.Boolean createPolicy;
        java.lang.Boolean createRandomPassword;
        java.lang.String description;
        java.lang.Boolean enableRotation;
        java.lang.Boolean forceOverwriteReplicaSecret;
        java.lang.Boolean ignoreSecretChanges;
        java.lang.String kmsKeyId;
        java.lang.String name;
        java.lang.String namePrefix;
        java.util.List<java.lang.String> overridePolicyDocuments;
        java.util.Map<java.lang.String, java.lang.Object> policyStatements;
        java.lang.Number randomPasswordLength;
        java.lang.String randomPasswordOverrideSpecial;
        java.lang.Number recoveryWindowInDays;
        java.util.Map<java.lang.String, java.lang.Object> replica;
        java.lang.String rotationLambdaArn;
        java.util.Map<java.lang.String, java.lang.Object> rotationRules;
        java.lang.String secretBinary;
        java.lang.String secretString;
        java.util.List<java.lang.String> sourcePolicyDocuments;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.List<java.lang.String> versionStages;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link SecretsmanagerConfig#getBlockPublicPolicy}
         * @param blockPublicPolicy Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
         * @return {@code this}
         */
        public Builder blockPublicPolicy(java.lang.Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getCreate}
         * @param create Determines whether resources will be created (affects all resources) true.
         * @return {@code this}
         */
        public Builder create(java.lang.Boolean create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getCreatePolicy}
         * @param createPolicy Determines whether a policy will be created.
         * @return {@code this}
         */
        public Builder createPolicy(java.lang.Boolean createPolicy) {
            this.createPolicy = createPolicy;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getCreateRandomPassword}
         * @param createRandomPassword Determines whether a random password will be generated.
         * @return {@code this}
         */
        public Builder createRandomPassword(java.lang.Boolean createRandomPassword) {
            this.createRandomPassword = createRandomPassword;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getDescription}
         * @param description A description of the secret.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getEnableRotation}
         * @param enableRotation Determines whether secret rotation is enabled.
         * @return {@code this}
         */
        public Builder enableRotation(java.lang.Boolean enableRotation) {
            this.enableRotation = enableRotation;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getForceOverwriteReplicaSecret}
         * @param forceOverwriteReplicaSecret Accepts boolean value to specify whether to overwrite a secret with the same name in the destination Region.
         * @return {@code this}
         */
        public Builder forceOverwriteReplicaSecret(java.lang.Boolean forceOverwriteReplicaSecret) {
            this.forceOverwriteReplicaSecret = forceOverwriteReplicaSecret;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getIgnoreSecretChanges}
         * @param ignoreSecretChanges Determines whether or not Terraform will ignore changes made externally to <code>secret_string</code> or <code>secret_binary</code>.
         *                            Changing this value after creation is a destructive operation
         * @return {@code this}
         */
        public Builder ignoreSecretChanges(java.lang.Boolean ignoreSecretChanges) {
            this.ignoreSecretChanges = ignoreSecretChanges;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getKmsKeyId}
         * @param kmsKeyId ARN or Id of the AWS KMS key to be used to encrypt the secret values in the versions stored in this secret.
         *                 If you need to reference a CMK in a different account, you can use only the key ARN. If you don't specify this value, then Secrets Manager defaults to using the AWS account's default KMS key (the one named <code>aws/secretsmanager</code>
         * @return {@code this}
         */
        public Builder kmsKeyId(java.lang.String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getName}
         * @param name Friendly name of the new secret.
         *             The secret name can consist of uppercase letters, lowercase letters, digits, and any of the following characters: <code>/_+=.&#64;-</code>
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getNamePrefix}
         * @param namePrefix Creates a unique name beginning with the specified prefix.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getOverridePolicyDocuments}
         * @param overridePolicyDocuments List of IAM policy documents that are merged together into the exported document.
         *                                In merging, statements with non-blank <code>sid</code>s will override statements with the same <code>sid</code>
         * @return {@code this}
         */
        public Builder overridePolicyDocuments(java.util.List<java.lang.String> overridePolicyDocuments) {
            this.overridePolicyDocuments = overridePolicyDocuments;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getPolicyStatements}
         * @param policyStatements A map of IAM policy [statements](https://registry.terraform.io/providers/hashicorp/aws/latest/docs/data-sources/iam_policy_document#statement) for custom permission usage The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder policyStatements(java.util.Map<java.lang.String, ? extends java.lang.Object> policyStatements) {
            this.policyStatements = (java.util.Map<java.lang.String, java.lang.Object>)policyStatements;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getRandomPasswordLength}
         * @param randomPasswordLength The length of the generated random password 32.
         * @return {@code this}
         */
        public Builder randomPasswordLength(java.lang.Number randomPasswordLength) {
            this.randomPasswordLength = randomPasswordLength;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getRandomPasswordOverrideSpecial}
         * @param randomPasswordOverrideSpecial Supply your own list of special characters to use for string generation.
         *                                      This overrides the default character list in the special argument
         *                                      !&#64;#$%&amp;*()-_=+[]{}&lt;&gt;:?
         * @return {@code this}
         */
        public Builder randomPasswordOverrideSpecial(java.lang.String randomPasswordOverrideSpecial) {
            this.randomPasswordOverrideSpecial = randomPasswordOverrideSpecial;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getRecoveryWindowInDays}
         * @param recoveryWindowInDays Number of days that AWS Secrets Manager waits before it can delete the secret.
         *                             This value can be <code>0</code> to force deletion without recovery or range from <code>7</code> to <code>30</code> days. The default value is <code>30</code>
         * @return {@code this}
         */
        public Builder recoveryWindowInDays(java.lang.Number recoveryWindowInDays) {
            this.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getReplica}
         * @param replica Configuration block to support secret replication The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder replica(java.util.Map<java.lang.String, ? extends java.lang.Object> replica) {
            this.replica = (java.util.Map<java.lang.String, java.lang.Object>)replica;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getRotationLambdaArn}
         * @param rotationLambdaArn Specifies the ARN of the Lambda function that can rotate the secret.
         * @return {@code this}
         */
        public Builder rotationLambdaArn(java.lang.String rotationLambdaArn) {
            this.rotationLambdaArn = rotationLambdaArn;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getRotationRules}
         * @param rotationRules A structure that defines the rotation configuration for this secret The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rotationRules(java.util.Map<java.lang.String, ? extends java.lang.Object> rotationRules) {
            this.rotationRules = (java.util.Map<java.lang.String, java.lang.Object>)rotationRules;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getSecretBinary}
         * @param secretBinary Specifies binary data that you want to encrypt and store in this version of the secret.
         *                     This is required if <code>secret_string</code> is not set. Needs to be encoded to base64
         * @return {@code this}
         */
        public Builder secretBinary(java.lang.String secretBinary) {
            this.secretBinary = secretBinary;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getSecretString}
         * @param secretString Specifies text data that you want to encrypt and store in this version of the secret.
         *                     This is required if <code>secret_binary</code> is not set
         * @return {@code this}
         */
        public Builder secretString(java.lang.String secretString) {
            this.secretString = secretString;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getSourcePolicyDocuments}
         * @param sourcePolicyDocuments List of IAM policy documents that are merged together into the exported document.
         *                              Statements must have unique <code>sid</code>s
         * @return {@code this}
         */
        public Builder sourcePolicyDocuments(java.util.List<java.lang.String> sourcePolicyDocuments) {
            this.sourcePolicyDocuments = sourcePolicyDocuments;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getTags}
         * @param tags A map of tags to add to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getVersionStages}
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret.
         *                      A staging label must be unique to a single version of the secret
         * @return {@code this}
         */
        public Builder versionStages(java.util.List<java.lang.String> versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getDependsOn}
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
         * Sets the value of {@link SecretsmanagerConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link SecretsmanagerConfig#getProviders}
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
         * Sets the value of {@link SecretsmanagerConfig#getSkipAssetCreationFromLocalModules}
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
         * @return a new instance of {@link SecretsmanagerConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SecretsmanagerConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SecretsmanagerConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SecretsmanagerConfig {
        private final java.lang.Boolean blockPublicPolicy;
        private final java.lang.Boolean create;
        private final java.lang.Boolean createPolicy;
        private final java.lang.Boolean createRandomPassword;
        private final java.lang.String description;
        private final java.lang.Boolean enableRotation;
        private final java.lang.Boolean forceOverwriteReplicaSecret;
        private final java.lang.Boolean ignoreSecretChanges;
        private final java.lang.String kmsKeyId;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.util.List<java.lang.String> overridePolicyDocuments;
        private final java.util.Map<java.lang.String, java.lang.Object> policyStatements;
        private final java.lang.Number randomPasswordLength;
        private final java.lang.String randomPasswordOverrideSpecial;
        private final java.lang.Number recoveryWindowInDays;
        private final java.util.Map<java.lang.String, java.lang.Object> replica;
        private final java.lang.String rotationLambdaArn;
        private final java.util.Map<java.lang.String, java.lang.Object> rotationRules;
        private final java.lang.String secretBinary;
        private final java.lang.String secretString;
        private final java.util.List<java.lang.String> sourcePolicyDocuments;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.List<java.lang.String> versionStages;
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
            this.blockPublicPolicy = software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createPolicy = software.amazon.jsii.Kernel.get(this, "createPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createRandomPassword = software.amazon.jsii.Kernel.get(this, "createRandomPassword", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableRotation = software.amazon.jsii.Kernel.get(this, "enableRotation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.forceOverwriteReplicaSecret = software.amazon.jsii.Kernel.get(this, "forceOverwriteReplicaSecret", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ignoreSecretChanges = software.amazon.jsii.Kernel.get(this, "ignoreSecretChanges", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.kmsKeyId = software.amazon.jsii.Kernel.get(this, "kmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.overridePolicyDocuments = software.amazon.jsii.Kernel.get(this, "overridePolicyDocuments", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policyStatements = software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.randomPasswordLength = software.amazon.jsii.Kernel.get(this, "randomPasswordLength", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.randomPasswordOverrideSpecial = software.amazon.jsii.Kernel.get(this, "randomPasswordOverrideSpecial", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.recoveryWindowInDays = software.amazon.jsii.Kernel.get(this, "recoveryWindowInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.replica = software.amazon.jsii.Kernel.get(this, "replica", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.rotationLambdaArn = software.amazon.jsii.Kernel.get(this, "rotationLambdaArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rotationRules = software.amazon.jsii.Kernel.get(this, "rotationRules", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.secretBinary = software.amazon.jsii.Kernel.get(this, "secretBinary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.secretString = software.amazon.jsii.Kernel.get(this, "secretString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourcePolicyDocuments = software.amazon.jsii.Kernel.get(this, "sourcePolicyDocuments", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.versionStages = software.amazon.jsii.Kernel.get(this, "versionStages", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
            this.blockPublicPolicy = builder.blockPublicPolicy;
            this.create = builder.create;
            this.createPolicy = builder.createPolicy;
            this.createRandomPassword = builder.createRandomPassword;
            this.description = builder.description;
            this.enableRotation = builder.enableRotation;
            this.forceOverwriteReplicaSecret = builder.forceOverwriteReplicaSecret;
            this.ignoreSecretChanges = builder.ignoreSecretChanges;
            this.kmsKeyId = builder.kmsKeyId;
            this.name = builder.name;
            this.namePrefix = builder.namePrefix;
            this.overridePolicyDocuments = builder.overridePolicyDocuments;
            this.policyStatements = (java.util.Map<java.lang.String, java.lang.Object>)builder.policyStatements;
            this.randomPasswordLength = builder.randomPasswordLength;
            this.randomPasswordOverrideSpecial = builder.randomPasswordOverrideSpecial;
            this.recoveryWindowInDays = builder.recoveryWindowInDays;
            this.replica = (java.util.Map<java.lang.String, java.lang.Object>)builder.replica;
            this.rotationLambdaArn = builder.rotationLambdaArn;
            this.rotationRules = (java.util.Map<java.lang.String, java.lang.Object>)builder.rotationRules;
            this.secretBinary = builder.secretBinary;
            this.secretString = builder.secretString;
            this.sourcePolicyDocuments = builder.sourcePolicyDocuments;
            this.tags = builder.tags;
            this.versionStages = builder.versionStages;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.lang.Boolean getBlockPublicPolicy() {
            return this.blockPublicPolicy;
        }

        @Override
        public final java.lang.Boolean getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.Boolean getCreatePolicy() {
            return this.createPolicy;
        }

        @Override
        public final java.lang.Boolean getCreateRandomPassword() {
            return this.createRandomPassword;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.Boolean getEnableRotation() {
            return this.enableRotation;
        }

        @Override
        public final java.lang.Boolean getForceOverwriteReplicaSecret() {
            return this.forceOverwriteReplicaSecret;
        }

        @Override
        public final java.lang.Boolean getIgnoreSecretChanges() {
            return this.ignoreSecretChanges;
        }

        @Override
        public final java.lang.String getKmsKeyId() {
            return this.kmsKeyId;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.util.List<java.lang.String> getOverridePolicyDocuments() {
            return this.overridePolicyDocuments;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getPolicyStatements() {
            return this.policyStatements;
        }

        @Override
        public final java.lang.Number getRandomPasswordLength() {
            return this.randomPasswordLength;
        }

        @Override
        public final java.lang.String getRandomPasswordOverrideSpecial() {
            return this.randomPasswordOverrideSpecial;
        }

        @Override
        public final java.lang.Number getRecoveryWindowInDays() {
            return this.recoveryWindowInDays;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getReplica() {
            return this.replica;
        }

        @Override
        public final java.lang.String getRotationLambdaArn() {
            return this.rotationLambdaArn;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getRotationRules() {
            return this.rotationRules;
        }

        @Override
        public final java.lang.String getSecretBinary() {
            return this.secretBinary;
        }

        @Override
        public final java.lang.String getSecretString() {
            return this.secretString;
        }

        @Override
        public final java.util.List<java.lang.String> getSourcePolicyDocuments() {
            return this.sourcePolicyDocuments;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.List<java.lang.String> getVersionStages() {
            return this.versionStages;
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

            if (this.getBlockPublicPolicy() != null) {
                data.set("blockPublicPolicy", om.valueToTree(this.getBlockPublicPolicy()));
            }
            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getCreatePolicy() != null) {
                data.set("createPolicy", om.valueToTree(this.getCreatePolicy()));
            }
            if (this.getCreateRandomPassword() != null) {
                data.set("createRandomPassword", om.valueToTree(this.getCreateRandomPassword()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEnableRotation() != null) {
                data.set("enableRotation", om.valueToTree(this.getEnableRotation()));
            }
            if (this.getForceOverwriteReplicaSecret() != null) {
                data.set("forceOverwriteReplicaSecret", om.valueToTree(this.getForceOverwriteReplicaSecret()));
            }
            if (this.getIgnoreSecretChanges() != null) {
                data.set("ignoreSecretChanges", om.valueToTree(this.getIgnoreSecretChanges()));
            }
            if (this.getKmsKeyId() != null) {
                data.set("kmsKeyId", om.valueToTree(this.getKmsKeyId()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getOverridePolicyDocuments() != null) {
                data.set("overridePolicyDocuments", om.valueToTree(this.getOverridePolicyDocuments()));
            }
            if (this.getPolicyStatements() != null) {
                data.set("policyStatements", om.valueToTree(this.getPolicyStatements()));
            }
            if (this.getRandomPasswordLength() != null) {
                data.set("randomPasswordLength", om.valueToTree(this.getRandomPasswordLength()));
            }
            if (this.getRandomPasswordOverrideSpecial() != null) {
                data.set("randomPasswordOverrideSpecial", om.valueToTree(this.getRandomPasswordOverrideSpecial()));
            }
            if (this.getRecoveryWindowInDays() != null) {
                data.set("recoveryWindowInDays", om.valueToTree(this.getRecoveryWindowInDays()));
            }
            if (this.getReplica() != null) {
                data.set("replica", om.valueToTree(this.getReplica()));
            }
            if (this.getRotationLambdaArn() != null) {
                data.set("rotationLambdaArn", om.valueToTree(this.getRotationLambdaArn()));
            }
            if (this.getRotationRules() != null) {
                data.set("rotationRules", om.valueToTree(this.getRotationRules()));
            }
            if (this.getSecretBinary() != null) {
                data.set("secretBinary", om.valueToTree(this.getSecretBinary()));
            }
            if (this.getSecretString() != null) {
                data.set("secretString", om.valueToTree(this.getSecretString()));
            }
            if (this.getSourcePolicyDocuments() != null) {
                data.set("sourcePolicyDocuments", om.valueToTree(this.getSourcePolicyDocuments()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVersionStages() != null) {
                data.set("versionStages", om.valueToTree(this.getVersionStages()));
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
            struct.set("fqn", om.valueToTree("secretsmanager.SecretsmanagerConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SecretsmanagerConfig.Jsii$Proxy that = (SecretsmanagerConfig.Jsii$Proxy) o;

            if (this.blockPublicPolicy != null ? !this.blockPublicPolicy.equals(that.blockPublicPolicy) : that.blockPublicPolicy != null) return false;
            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            if (this.createPolicy != null ? !this.createPolicy.equals(that.createPolicy) : that.createPolicy != null) return false;
            if (this.createRandomPassword != null ? !this.createRandomPassword.equals(that.createRandomPassword) : that.createRandomPassword != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.enableRotation != null ? !this.enableRotation.equals(that.enableRotation) : that.enableRotation != null) return false;
            if (this.forceOverwriteReplicaSecret != null ? !this.forceOverwriteReplicaSecret.equals(that.forceOverwriteReplicaSecret) : that.forceOverwriteReplicaSecret != null) return false;
            if (this.ignoreSecretChanges != null ? !this.ignoreSecretChanges.equals(that.ignoreSecretChanges) : that.ignoreSecretChanges != null) return false;
            if (this.kmsKeyId != null ? !this.kmsKeyId.equals(that.kmsKeyId) : that.kmsKeyId != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.overridePolicyDocuments != null ? !this.overridePolicyDocuments.equals(that.overridePolicyDocuments) : that.overridePolicyDocuments != null) return false;
            if (this.policyStatements != null ? !this.policyStatements.equals(that.policyStatements) : that.policyStatements != null) return false;
            if (this.randomPasswordLength != null ? !this.randomPasswordLength.equals(that.randomPasswordLength) : that.randomPasswordLength != null) return false;
            if (this.randomPasswordOverrideSpecial != null ? !this.randomPasswordOverrideSpecial.equals(that.randomPasswordOverrideSpecial) : that.randomPasswordOverrideSpecial != null) return false;
            if (this.recoveryWindowInDays != null ? !this.recoveryWindowInDays.equals(that.recoveryWindowInDays) : that.recoveryWindowInDays != null) return false;
            if (this.replica != null ? !this.replica.equals(that.replica) : that.replica != null) return false;
            if (this.rotationLambdaArn != null ? !this.rotationLambdaArn.equals(that.rotationLambdaArn) : that.rotationLambdaArn != null) return false;
            if (this.rotationRules != null ? !this.rotationRules.equals(that.rotationRules) : that.rotationRules != null) return false;
            if (this.secretBinary != null ? !this.secretBinary.equals(that.secretBinary) : that.secretBinary != null) return false;
            if (this.secretString != null ? !this.secretString.equals(that.secretString) : that.secretString != null) return false;
            if (this.sourcePolicyDocuments != null ? !this.sourcePolicyDocuments.equals(that.sourcePolicyDocuments) : that.sourcePolicyDocuments != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.versionStages != null ? !this.versionStages.equals(that.versionStages) : that.versionStages != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.blockPublicPolicy != null ? this.blockPublicPolicy.hashCode() : 0;
            result = 31 * result + (this.create != null ? this.create.hashCode() : 0);
            result = 31 * result + (this.createPolicy != null ? this.createPolicy.hashCode() : 0);
            result = 31 * result + (this.createRandomPassword != null ? this.createRandomPassword.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.enableRotation != null ? this.enableRotation.hashCode() : 0);
            result = 31 * result + (this.forceOverwriteReplicaSecret != null ? this.forceOverwriteReplicaSecret.hashCode() : 0);
            result = 31 * result + (this.ignoreSecretChanges != null ? this.ignoreSecretChanges.hashCode() : 0);
            result = 31 * result + (this.kmsKeyId != null ? this.kmsKeyId.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.overridePolicyDocuments != null ? this.overridePolicyDocuments.hashCode() : 0);
            result = 31 * result + (this.policyStatements != null ? this.policyStatements.hashCode() : 0);
            result = 31 * result + (this.randomPasswordLength != null ? this.randomPasswordLength.hashCode() : 0);
            result = 31 * result + (this.randomPasswordOverrideSpecial != null ? this.randomPasswordOverrideSpecial.hashCode() : 0);
            result = 31 * result + (this.recoveryWindowInDays != null ? this.recoveryWindowInDays.hashCode() : 0);
            result = 31 * result + (this.replica != null ? this.replica.hashCode() : 0);
            result = 31 * result + (this.rotationLambdaArn != null ? this.rotationLambdaArn.hashCode() : 0);
            result = 31 * result + (this.rotationRules != null ? this.rotationRules.hashCode() : 0);
            result = 31 * result + (this.secretBinary != null ? this.secretBinary.hashCode() : 0);
            result = 31 * result + (this.secretString != null ? this.secretString.hashCode() : 0);
            result = 31 * result + (this.sourcePolicyDocuments != null ? this.sourcePolicyDocuments.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.versionStages != null ? this.versionStages.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
