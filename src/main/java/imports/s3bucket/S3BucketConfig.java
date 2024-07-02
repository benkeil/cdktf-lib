package imports.s3bucket;

@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.460Z")
@software.amazon.jsii.Jsii(module = imports.s3bucket.$Module.class, fqn = "s3bucket.S3BucketConfig")
@software.amazon.jsii.Jsii.Proxy(S3BucketConfig.Jsii$Proxy.class)
public interface S3BucketConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserConfig {

    /**
     * (Optional) Sets the accelerate configuration of an existing bucket.
     * <p>
     * Can be Enabled or Suspended.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccelerationStatus() {
        return null;
    }

    /**
     * (Optional) List of AWS Account IDs should be allowed to deliver access logs to this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessLogDeliveryPolicySourceAccounts() {
        return null;
    }

    /**
     * (Optional) List of S3 bucket ARNs which should be allowed to deliver access logs to this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessLogDeliveryPolicySourceBuckets() {
        return null;
    }

    /**
     * (Optional) The canned ACL to apply.
     * <p>
     * Conflicts with <code>grant</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAcl() {
        return null;
    }

    /**
     * The ARN of KMS key which should be allowed in PutObject.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAllowedKmsKeyArn() {
        return null;
    }

    /**
     * Map containing bucket analytics configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAnalyticsConfiguration() {
        return null;
    }

    /**
     * Whether or not the analytics source bucket is also the destination bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAnalyticsSelfSourceDestination() {
        return null;
    }

    /**
     * The analytics source account id.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAnalyticsSourceAccountId() {
        return null;
    }

    /**
     * The analytics source bucket ARN.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAnalyticsSourceBucketArn() {
        return null;
    }

    /**
     * Controls if S3 bucket should have S3 access log delivery policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachAccessLogDeliveryPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should have bucket analytics destination policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachAnalyticsDestinationPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should deny incorrect encryption headers policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyIncorrectEncryptionHeaders() {
        return null;
    }

    /**
     * Controls if S3 bucket policy should deny usage of incorrect KMS key SSE.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyIncorrectKmsKeySse() {
        return null;
    }

    /**
     * Controls if S3 bucket should have deny non-SSL transport policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyInsecureTransportPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should deny unencrypted object uploads policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyUnencryptedObjectUploads() {
        return null;
    }

    /**
     * Controls if S3 bucket should have ELB log delivery policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachElbLogDeliveryPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should have bucket inventory destination policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachInventoryDestinationPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should have ALB/NLB log delivery policy attached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachLbLogDeliveryPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should have bucket policy attached (set to <code>true</code> to use value of <code>policy</code> as bucket policy).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicy() {
        return null;
    }

    /**
     * Controls if a user defined public bucket policy will be attached (set to <code>false</code> to allow upstream to apply defaults to the bucket) true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPublicPolicy() {
        return null;
    }

    /**
     * Controls if S3 bucket should require the latest version of TLS.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachRequireLatestTlsPolicy() {
        return null;
    }

    /**
     * Whether Amazon S3 should block public ACLs for this bucket.
     * <p>
     * true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicAcls() {
        return null;
    }

    /**
     * Whether Amazon S3 should block public bucket policies for this bucket.
     * <p>
     * true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicy() {
        return null;
    }

    /**
     * (Optional, Forces new resource) The name of the bucket.
     * <p>
     * If omitted, Terraform will assign a random, unique name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucket() {
        return null;
    }

    /**
     * (Optional, Forces new resource) Creates a unique bucket name beginning with the specified prefix.
     * <p>
     * Conflicts with bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefix() {
        return null;
    }

    /**
     * Whether to manage S3 Bucket Ownership Controls on this bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getControlObjectOwnership() {
        return null;
    }

    /**
     * List of maps containing rules for Cross-Origin Resource Sharing.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCorsRule() {
        return null;
    }

    /**
     * Controls if S3 bucket should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateBucket() {
        return null;
    }

    /**
     * The account ID of the expected bucket owner.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExpectedBucketOwner() {
        return null;
    }

    /**
     * (Optional, Default:false ) A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error.
     * <p>
     * These objects are not recoverable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroy() {
        return null;
    }

    /**
     * An ACL policy grant.
     * <p>
     * Conflicts with <code>acl</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getGrant() {
        return null;
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for this bucket.
     * <p>
     * true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnorePublicAcls() {
        return null;
    }

    /**
     * Map containing intelligent tiering configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIntelligentTiering() {
        return null;
    }

    /**
     * Map containing S3 inventory configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInventoryConfiguration() {
        return null;
    }

    /**
     * Whether or not the inventory source bucket is also the destination bucket.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getInventorySelfSourceDestination() {
        return null;
    }

    /**
     * The inventory source account id.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInventorySourceAccountId() {
        return null;
    }

    /**
     * The inventory source bucket ARN.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInventorySourceBucketArn() {
        return null;
    }

    /**
     * List of maps containing configuration of object lifecycle management.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLifecycleRule() {
        return null;
    }

    /**
     * Map containing access bucket logging configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLogging() {
        return null;
    }

    /**
     * Map containing bucket metric configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMetricConfiguration() {
        return null;
    }

    /**
     * Map containing S3 object locking configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getObjectLockConfiguration() {
        return null;
    }

    /**
     * Whether S3 bucket should have an Object Lock configuration enabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getObjectLockEnabled() {
        return null;
    }

    /**
     * Object ownership.
     * <p>
     * Valid values: BucketOwnerEnforced, BucketOwnerPreferred or ObjectWriter. 'BucketOwnerEnforced': ACLs are disabled, and the bucket owner automatically owns and has full control over every object in the bucket. 'BucketOwnerPreferred': Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the bucket-owner-full-control canned ACL. 'ObjectWriter': The uploading account will own the object if the object is uploaded with the bucket-owner-full-control canned ACL.
     * BucketOwnerEnforced
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getObjectOwnership() {
        return null;
    }

    /**
     * Bucket owner's display name and ID.
     * <p>
     * Conflicts with `acl`
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getOwner() {
        return null;
    }

    /**
     * (Optional) A valid bucket policy JSON document.
     * <p>
     * Note that if the policy document is not specific enough (but still valid), Terraform may view the policy as constantly changing in a terraform plan. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with Terraform, see the AWS IAM Policy Document Guide.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    /**
     * Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?
     * <p>
     * More info: https://en.wikipedia.org/wiki/Putin_khuylo!
     * true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPutinKhuylo() {
        return null;
    }

    /**
     * Map containing cross-region replication configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getReplicationConfiguration() {
        return null;
    }

    /**
     * (Optional) Specifies who should bear the cost of Amazon S3 data transfer.
     * <p>
     * Can be either BucketOwner or Requester. By default, the owner of the S3 bucket would incur the costs of any data transfer. See Requester Pays Buckets developer guide for more information.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRequestPayer() {
        return null;
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for this bucket.
     * <p>
     * true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRestrictPublicBuckets() {
        return null;
    }

    /**
     * Map containing server-side encryption configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getServerSideEncryptionConfiguration() {
        return null;
    }

    /**
     * (Optional) A mapping of tags to assign to the bucket.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Map containing versioning configuration.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVersioning() {
        return null;
    }

    /**
     * Map containing static web-site hosting or redirect configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getWebsite() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketConfig> {
        java.lang.String accelerationStatus;
        java.util.List<java.lang.String> accessLogDeliveryPolicySourceAccounts;
        java.util.List<java.lang.String> accessLogDeliveryPolicySourceBuckets;
        java.lang.String acl;
        java.lang.String allowedKmsKeyArn;
        java.lang.Object analyticsConfiguration;
        java.lang.Boolean analyticsSelfSourceDestination;
        java.lang.String analyticsSourceAccountId;
        java.lang.String analyticsSourceBucketArn;
        java.lang.Boolean attachAccessLogDeliveryPolicy;
        java.lang.Boolean attachAnalyticsDestinationPolicy;
        java.lang.Boolean attachDenyIncorrectEncryptionHeaders;
        java.lang.Boolean attachDenyIncorrectKmsKeySse;
        java.lang.Boolean attachDenyInsecureTransportPolicy;
        java.lang.Boolean attachDenyUnencryptedObjectUploads;
        java.lang.Boolean attachElbLogDeliveryPolicy;
        java.lang.Boolean attachInventoryDestinationPolicy;
        java.lang.Boolean attachLbLogDeliveryPolicy;
        java.lang.Boolean attachPolicy;
        java.lang.Boolean attachPublicPolicy;
        java.lang.Boolean attachRequireLatestTlsPolicy;
        java.lang.Boolean blockPublicAcls;
        java.lang.Boolean blockPublicPolicy;
        java.lang.String bucket;
        java.lang.String bucketPrefix;
        java.lang.Boolean controlObjectOwnership;
        java.lang.Object corsRule;
        java.lang.Boolean createBucket;
        java.lang.String expectedBucketOwner;
        java.lang.Boolean forceDestroy;
        java.lang.Object grant;
        java.lang.Boolean ignorePublicAcls;
        java.lang.Object intelligentTiering;
        java.lang.Object inventoryConfiguration;
        java.lang.Boolean inventorySelfSourceDestination;
        java.lang.String inventorySourceAccountId;
        java.lang.String inventorySourceBucketArn;
        java.lang.Object lifecycleRule;
        java.lang.Object logging;
        java.lang.Object metricConfiguration;
        java.lang.Object objectLockConfiguration;
        java.lang.Boolean objectLockEnabled;
        java.lang.String objectOwnership;
        java.util.Map<java.lang.String, java.lang.String> owner;
        java.lang.String policy;
        java.lang.Boolean putinKhuylo;
        java.lang.Object replicationConfiguration;
        java.lang.String requestPayer;
        java.lang.Boolean restrictPublicBuckets;
        java.lang.Object serverSideEncryptionConfiguration;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> versioning;
        java.lang.Object website;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link S3BucketConfig#getAccelerationStatus}
         * @param accelerationStatus (Optional) Sets the accelerate configuration of an existing bucket.
         *                           Can be Enabled or Suspended.
         * @return {@code this}
         */
        public Builder accelerationStatus(java.lang.String accelerationStatus) {
            this.accelerationStatus = accelerationStatus;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAccessLogDeliveryPolicySourceAccounts}
         * @param accessLogDeliveryPolicySourceAccounts (Optional) List of AWS Account IDs should be allowed to deliver access logs to this bucket.
         * @return {@code this}
         */
        public Builder accessLogDeliveryPolicySourceAccounts(java.util.List<java.lang.String> accessLogDeliveryPolicySourceAccounts) {
            this.accessLogDeliveryPolicySourceAccounts = accessLogDeliveryPolicySourceAccounts;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAccessLogDeliveryPolicySourceBuckets}
         * @param accessLogDeliveryPolicySourceBuckets (Optional) List of S3 bucket ARNs which should be allowed to deliver access logs to this bucket.
         * @return {@code this}
         */
        public Builder accessLogDeliveryPolicySourceBuckets(java.util.List<java.lang.String> accessLogDeliveryPolicySourceBuckets) {
            this.accessLogDeliveryPolicySourceBuckets = accessLogDeliveryPolicySourceBuckets;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAcl}
         * @param acl (Optional) The canned ACL to apply.
         *            Conflicts with <code>grant</code>
         * @return {@code this}
         */
        public Builder acl(java.lang.String acl) {
            this.acl = acl;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAllowedKmsKeyArn}
         * @param allowedKmsKeyArn The ARN of KMS key which should be allowed in PutObject.
         * @return {@code this}
         */
        public Builder allowedKmsKeyArn(java.lang.String allowedKmsKeyArn) {
            this.allowedKmsKeyArn = allowedKmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAnalyticsConfiguration}
         * @param analyticsConfiguration Map containing bucket analytics configuration.
         * @return {@code this}
         */
        public Builder analyticsConfiguration(java.lang.Object analyticsConfiguration) {
            this.analyticsConfiguration = analyticsConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAnalyticsSelfSourceDestination}
         * @param analyticsSelfSourceDestination Whether or not the analytics source bucket is also the destination bucket.
         * @return {@code this}
         */
        public Builder analyticsSelfSourceDestination(java.lang.Boolean analyticsSelfSourceDestination) {
            this.analyticsSelfSourceDestination = analyticsSelfSourceDestination;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAnalyticsSourceAccountId}
         * @param analyticsSourceAccountId The analytics source account id.
         * @return {@code this}
         */
        public Builder analyticsSourceAccountId(java.lang.String analyticsSourceAccountId) {
            this.analyticsSourceAccountId = analyticsSourceAccountId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAnalyticsSourceBucketArn}
         * @param analyticsSourceBucketArn The analytics source bucket ARN.
         * @return {@code this}
         */
        public Builder analyticsSourceBucketArn(java.lang.String analyticsSourceBucketArn) {
            this.analyticsSourceBucketArn = analyticsSourceBucketArn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachAccessLogDeliveryPolicy}
         * @param attachAccessLogDeliveryPolicy Controls if S3 bucket should have S3 access log delivery policy attached.
         * @return {@code this}
         */
        public Builder attachAccessLogDeliveryPolicy(java.lang.Boolean attachAccessLogDeliveryPolicy) {
            this.attachAccessLogDeliveryPolicy = attachAccessLogDeliveryPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachAnalyticsDestinationPolicy}
         * @param attachAnalyticsDestinationPolicy Controls if S3 bucket should have bucket analytics destination policy attached.
         * @return {@code this}
         */
        public Builder attachAnalyticsDestinationPolicy(java.lang.Boolean attachAnalyticsDestinationPolicy) {
            this.attachAnalyticsDestinationPolicy = attachAnalyticsDestinationPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachDenyIncorrectEncryptionHeaders}
         * @param attachDenyIncorrectEncryptionHeaders Controls if S3 bucket should deny incorrect encryption headers policy attached.
         * @return {@code this}
         */
        public Builder attachDenyIncorrectEncryptionHeaders(java.lang.Boolean attachDenyIncorrectEncryptionHeaders) {
            this.attachDenyIncorrectEncryptionHeaders = attachDenyIncorrectEncryptionHeaders;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachDenyIncorrectKmsKeySse}
         * @param attachDenyIncorrectKmsKeySse Controls if S3 bucket policy should deny usage of incorrect KMS key SSE.
         * @return {@code this}
         */
        public Builder attachDenyIncorrectKmsKeySse(java.lang.Boolean attachDenyIncorrectKmsKeySse) {
            this.attachDenyIncorrectKmsKeySse = attachDenyIncorrectKmsKeySse;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachDenyInsecureTransportPolicy}
         * @param attachDenyInsecureTransportPolicy Controls if S3 bucket should have deny non-SSL transport policy attached.
         * @return {@code this}
         */
        public Builder attachDenyInsecureTransportPolicy(java.lang.Boolean attachDenyInsecureTransportPolicy) {
            this.attachDenyInsecureTransportPolicy = attachDenyInsecureTransportPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachDenyUnencryptedObjectUploads}
         * @param attachDenyUnencryptedObjectUploads Controls if S3 bucket should deny unencrypted object uploads policy attached.
         * @return {@code this}
         */
        public Builder attachDenyUnencryptedObjectUploads(java.lang.Boolean attachDenyUnencryptedObjectUploads) {
            this.attachDenyUnencryptedObjectUploads = attachDenyUnencryptedObjectUploads;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachElbLogDeliveryPolicy}
         * @param attachElbLogDeliveryPolicy Controls if S3 bucket should have ELB log delivery policy attached.
         * @return {@code this}
         */
        public Builder attachElbLogDeliveryPolicy(java.lang.Boolean attachElbLogDeliveryPolicy) {
            this.attachElbLogDeliveryPolicy = attachElbLogDeliveryPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachInventoryDestinationPolicy}
         * @param attachInventoryDestinationPolicy Controls if S3 bucket should have bucket inventory destination policy attached.
         * @return {@code this}
         */
        public Builder attachInventoryDestinationPolicy(java.lang.Boolean attachInventoryDestinationPolicy) {
            this.attachInventoryDestinationPolicy = attachInventoryDestinationPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachLbLogDeliveryPolicy}
         * @param attachLbLogDeliveryPolicy Controls if S3 bucket should have ALB/NLB log delivery policy attached.
         * @return {@code this}
         */
        public Builder attachLbLogDeliveryPolicy(java.lang.Boolean attachLbLogDeliveryPolicy) {
            this.attachLbLogDeliveryPolicy = attachLbLogDeliveryPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachPolicy}
         * @param attachPolicy Controls if S3 bucket should have bucket policy attached (set to <code>true</code> to use value of <code>policy</code> as bucket policy).
         * @return {@code this}
         */
        public Builder attachPolicy(java.lang.Boolean attachPolicy) {
            this.attachPolicy = attachPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachPublicPolicy}
         * @param attachPublicPolicy Controls if a user defined public bucket policy will be attached (set to <code>false</code> to allow upstream to apply defaults to the bucket) true.
         * @return {@code this}
         */
        public Builder attachPublicPolicy(java.lang.Boolean attachPublicPolicy) {
            this.attachPublicPolicy = attachPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getAttachRequireLatestTlsPolicy}
         * @param attachRequireLatestTlsPolicy Controls if S3 bucket should require the latest version of TLS.
         * @return {@code this}
         */
        public Builder attachRequireLatestTlsPolicy(java.lang.Boolean attachRequireLatestTlsPolicy) {
            this.attachRequireLatestTlsPolicy = attachRequireLatestTlsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getBlockPublicAcls}
         * @param blockPublicAcls Whether Amazon S3 should block public ACLs for this bucket.
         *                        true
         * @return {@code this}
         */
        public Builder blockPublicAcls(java.lang.Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getBlockPublicPolicy}
         * @param blockPublicPolicy Whether Amazon S3 should block public bucket policies for this bucket.
         *                          true
         * @return {@code this}
         */
        public Builder blockPublicPolicy(java.lang.Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getBucket}
         * @param bucket (Optional, Forces new resource) The name of the bucket.
         *               If omitted, Terraform will assign a random, unique name.
         * @return {@code this}
         */
        public Builder bucket(java.lang.String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getBucketPrefix}
         * @param bucketPrefix (Optional, Forces new resource) Creates a unique bucket name beginning with the specified prefix.
         *                     Conflicts with bucket.
         * @return {@code this}
         */
        public Builder bucketPrefix(java.lang.String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getControlObjectOwnership}
         * @param controlObjectOwnership Whether to manage S3 Bucket Ownership Controls on this bucket.
         * @return {@code this}
         */
        public Builder controlObjectOwnership(java.lang.Boolean controlObjectOwnership) {
            this.controlObjectOwnership = controlObjectOwnership;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getCorsRule}
         * @param corsRule List of maps containing rules for Cross-Origin Resource Sharing.
         * @return {@code this}
         */
        public Builder corsRule(java.lang.Object corsRule) {
            this.corsRule = corsRule;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getCreateBucket}
         * @param createBucket Controls if S3 bucket should be created true.
         * @return {@code this}
         */
        public Builder createBucket(java.lang.Boolean createBucket) {
            this.createBucket = createBucket;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getExpectedBucketOwner}
         * @param expectedBucketOwner The account ID of the expected bucket owner.
         * @return {@code this}
         */
        public Builder expectedBucketOwner(java.lang.String expectedBucketOwner) {
            this.expectedBucketOwner = expectedBucketOwner;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getForceDestroy}
         * @param forceDestroy (Optional, Default:false ) A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error.
         *                     These objects are not recoverable.
         * @return {@code this}
         */
        public Builder forceDestroy(java.lang.Boolean forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getGrant}
         * @param grant An ACL policy grant.
         *              Conflicts with <code>acl</code>
         * @return {@code this}
         */
        public Builder grant(java.lang.Object grant) {
            this.grant = grant;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getIgnorePublicAcls}
         * @param ignorePublicAcls Whether Amazon S3 should ignore public ACLs for this bucket.
         *                         true
         * @return {@code this}
         */
        public Builder ignorePublicAcls(java.lang.Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getIntelligentTiering}
         * @param intelligentTiering Map containing intelligent tiering configuration.
         * @return {@code this}
         */
        public Builder intelligentTiering(java.lang.Object intelligentTiering) {
            this.intelligentTiering = intelligentTiering;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getInventoryConfiguration}
         * @param inventoryConfiguration Map containing S3 inventory configuration.
         * @return {@code this}
         */
        public Builder inventoryConfiguration(java.lang.Object inventoryConfiguration) {
            this.inventoryConfiguration = inventoryConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getInventorySelfSourceDestination}
         * @param inventorySelfSourceDestination Whether or not the inventory source bucket is also the destination bucket.
         * @return {@code this}
         */
        public Builder inventorySelfSourceDestination(java.lang.Boolean inventorySelfSourceDestination) {
            this.inventorySelfSourceDestination = inventorySelfSourceDestination;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getInventorySourceAccountId}
         * @param inventorySourceAccountId The inventory source account id.
         * @return {@code this}
         */
        public Builder inventorySourceAccountId(java.lang.String inventorySourceAccountId) {
            this.inventorySourceAccountId = inventorySourceAccountId;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getInventorySourceBucketArn}
         * @param inventorySourceBucketArn The inventory source bucket ARN.
         * @return {@code this}
         */
        public Builder inventorySourceBucketArn(java.lang.String inventorySourceBucketArn) {
            this.inventorySourceBucketArn = inventorySourceBucketArn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getLifecycleRule}
         * @param lifecycleRule List of maps containing configuration of object lifecycle management.
         * @return {@code this}
         */
        public Builder lifecycleRule(java.lang.Object lifecycleRule) {
            this.lifecycleRule = lifecycleRule;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getLogging}
         * @param logging Map containing access bucket logging configuration.
         * @return {@code this}
         */
        public Builder logging(java.lang.Object logging) {
            this.logging = logging;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getMetricConfiguration}
         * @param metricConfiguration Map containing bucket metric configuration.
         * @return {@code this}
         */
        public Builder metricConfiguration(java.lang.Object metricConfiguration) {
            this.metricConfiguration = metricConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getObjectLockConfiguration}
         * @param objectLockConfiguration Map containing S3 object locking configuration.
         * @return {@code this}
         */
        public Builder objectLockConfiguration(java.lang.Object objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getObjectLockEnabled}
         * @param objectLockEnabled Whether S3 bucket should have an Object Lock configuration enabled.
         * @return {@code this}
         */
        public Builder objectLockEnabled(java.lang.Boolean objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getObjectOwnership}
         * @param objectOwnership Object ownership.
         *                        Valid values: BucketOwnerEnforced, BucketOwnerPreferred or ObjectWriter. 'BucketOwnerEnforced': ACLs are disabled, and the bucket owner automatically owns and has full control over every object in the bucket. 'BucketOwnerPreferred': Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the bucket-owner-full-control canned ACL. 'ObjectWriter': The uploading account will own the object if the object is uploaded with the bucket-owner-full-control canned ACL.
         *                        BucketOwnerEnforced
         * @return {@code this}
         */
        public Builder objectOwnership(java.lang.String objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getOwner}
         * @param owner Bucket owner's display name and ID.
         *              Conflicts with `acl`
         *              The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder owner(java.util.Map<java.lang.String, java.lang.String> owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getPolicy}
         * @param policy (Optional) A valid bucket policy JSON document.
         *               Note that if the policy document is not specific enough (but still valid), Terraform may view the policy as constantly changing in a terraform plan. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with Terraform, see the AWS IAM Policy Document Guide.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getPutinKhuylo}
         * @param putinKhuylo Do you agree that Putin doesn't respect Ukrainian sovereignty and territorial integrity?.
         *                    More info: https://en.wikipedia.org/wiki/Putin_khuylo!
         *                    true
         * @return {@code this}
         */
        public Builder putinKhuylo(java.lang.Boolean putinKhuylo) {
            this.putinKhuylo = putinKhuylo;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getReplicationConfiguration}
         * @param replicationConfiguration Map containing cross-region replication configuration.
         * @return {@code this}
         */
        public Builder replicationConfiguration(java.lang.Object replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getRequestPayer}
         * @param requestPayer (Optional) Specifies who should bear the cost of Amazon S3 data transfer.
         *                     Can be either BucketOwner or Requester. By default, the owner of the S3 bucket would incur the costs of any data transfer. See Requester Pays Buckets developer guide for more information.
         * @return {@code this}
         */
        public Builder requestPayer(java.lang.String requestPayer) {
            this.requestPayer = requestPayer;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getRestrictPublicBuckets}
         * @param restrictPublicBuckets Whether Amazon S3 should restrict public bucket policies for this bucket.
         *                              true
         * @return {@code this}
         */
        public Builder restrictPublicBuckets(java.lang.Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getServerSideEncryptionConfiguration}
         * @param serverSideEncryptionConfiguration Map containing server-side encryption configuration.
         * @return {@code this}
         */
        public Builder serverSideEncryptionConfiguration(java.lang.Object serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getTags}
         * @param tags (Optional) A mapping of tags to assign to the bucket.
         *             The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getVersioning}
         * @param versioning Map containing versioning configuration.
         *                   The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder versioning(java.util.Map<java.lang.String, java.lang.String> versioning) {
            this.versioning = versioning;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getWebsite}
         * @param website Map containing static web-site hosting or redirect configuration.
         * @return {@code this}
         */
        public Builder website(java.lang.Object website) {
            this.website = website;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getDependsOn}
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
         * Sets the value of {@link S3BucketConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketConfig#getProviders}
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
         * Sets the value of {@link S3BucketConfig#getSkipAssetCreationFromLocalModules}
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
         * @return a new instance of {@link S3BucketConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketConfig {
        private final java.lang.String accelerationStatus;
        private final java.util.List<java.lang.String> accessLogDeliveryPolicySourceAccounts;
        private final java.util.List<java.lang.String> accessLogDeliveryPolicySourceBuckets;
        private final java.lang.String acl;
        private final java.lang.String allowedKmsKeyArn;
        private final java.lang.Object analyticsConfiguration;
        private final java.lang.Boolean analyticsSelfSourceDestination;
        private final java.lang.String analyticsSourceAccountId;
        private final java.lang.String analyticsSourceBucketArn;
        private final java.lang.Boolean attachAccessLogDeliveryPolicy;
        private final java.lang.Boolean attachAnalyticsDestinationPolicy;
        private final java.lang.Boolean attachDenyIncorrectEncryptionHeaders;
        private final java.lang.Boolean attachDenyIncorrectKmsKeySse;
        private final java.lang.Boolean attachDenyInsecureTransportPolicy;
        private final java.lang.Boolean attachDenyUnencryptedObjectUploads;
        private final java.lang.Boolean attachElbLogDeliveryPolicy;
        private final java.lang.Boolean attachInventoryDestinationPolicy;
        private final java.lang.Boolean attachLbLogDeliveryPolicy;
        private final java.lang.Boolean attachPolicy;
        private final java.lang.Boolean attachPublicPolicy;
        private final java.lang.Boolean attachRequireLatestTlsPolicy;
        private final java.lang.Boolean blockPublicAcls;
        private final java.lang.Boolean blockPublicPolicy;
        private final java.lang.String bucket;
        private final java.lang.String bucketPrefix;
        private final java.lang.Boolean controlObjectOwnership;
        private final java.lang.Object corsRule;
        private final java.lang.Boolean createBucket;
        private final java.lang.String expectedBucketOwner;
        private final java.lang.Boolean forceDestroy;
        private final java.lang.Object grant;
        private final java.lang.Boolean ignorePublicAcls;
        private final java.lang.Object intelligentTiering;
        private final java.lang.Object inventoryConfiguration;
        private final java.lang.Boolean inventorySelfSourceDestination;
        private final java.lang.String inventorySourceAccountId;
        private final java.lang.String inventorySourceBucketArn;
        private final java.lang.Object lifecycleRule;
        private final java.lang.Object logging;
        private final java.lang.Object metricConfiguration;
        private final java.lang.Object objectLockConfiguration;
        private final java.lang.Boolean objectLockEnabled;
        private final java.lang.String objectOwnership;
        private final java.util.Map<java.lang.String, java.lang.String> owner;
        private final java.lang.String policy;
        private final java.lang.Boolean putinKhuylo;
        private final java.lang.Object replicationConfiguration;
        private final java.lang.String requestPayer;
        private final java.lang.Boolean restrictPublicBuckets;
        private final java.lang.Object serverSideEncryptionConfiguration;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> versioning;
        private final java.lang.Object website;
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
            this.accelerationStatus = software.amazon.jsii.Kernel.get(this, "accelerationStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessLogDeliveryPolicySourceAccounts = software.amazon.jsii.Kernel.get(this, "accessLogDeliveryPolicySourceAccounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.accessLogDeliveryPolicySourceBuckets = software.amazon.jsii.Kernel.get(this, "accessLogDeliveryPolicySourceBuckets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.acl = software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowedKmsKeyArn = software.amazon.jsii.Kernel.get(this, "allowedKmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.analyticsConfiguration = software.amazon.jsii.Kernel.get(this, "analyticsConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.analyticsSelfSourceDestination = software.amazon.jsii.Kernel.get(this, "analyticsSelfSourceDestination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.analyticsSourceAccountId = software.amazon.jsii.Kernel.get(this, "analyticsSourceAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.analyticsSourceBucketArn = software.amazon.jsii.Kernel.get(this, "analyticsSourceBucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.attachAccessLogDeliveryPolicy = software.amazon.jsii.Kernel.get(this, "attachAccessLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachAnalyticsDestinationPolicy = software.amazon.jsii.Kernel.get(this, "attachAnalyticsDestinationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachDenyIncorrectEncryptionHeaders = software.amazon.jsii.Kernel.get(this, "attachDenyIncorrectEncryptionHeaders", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachDenyIncorrectKmsKeySse = software.amazon.jsii.Kernel.get(this, "attachDenyIncorrectKmsKeySse", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachDenyInsecureTransportPolicy = software.amazon.jsii.Kernel.get(this, "attachDenyInsecureTransportPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachDenyUnencryptedObjectUploads = software.amazon.jsii.Kernel.get(this, "attachDenyUnencryptedObjectUploads", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachElbLogDeliveryPolicy = software.amazon.jsii.Kernel.get(this, "attachElbLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachInventoryDestinationPolicy = software.amazon.jsii.Kernel.get(this, "attachInventoryDestinationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachLbLogDeliveryPolicy = software.amazon.jsii.Kernel.get(this, "attachLbLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicy = software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPublicPolicy = software.amazon.jsii.Kernel.get(this, "attachPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachRequireLatestTlsPolicy = software.amazon.jsii.Kernel.get(this, "attachRequireLatestTlsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.blockPublicAcls = software.amazon.jsii.Kernel.get(this, "blockPublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.blockPublicPolicy = software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.bucket = software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketPrefix = software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.controlObjectOwnership = software.amazon.jsii.Kernel.get(this, "controlObjectOwnership", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.corsRule = software.amazon.jsii.Kernel.get(this, "corsRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.createBucket = software.amazon.jsii.Kernel.get(this, "createBucket", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.expectedBucketOwner = software.amazon.jsii.Kernel.get(this, "expectedBucketOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.forceDestroy = software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.grant = software.amazon.jsii.Kernel.get(this, "grant", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.ignorePublicAcls = software.amazon.jsii.Kernel.get(this, "ignorePublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.intelligentTiering = software.amazon.jsii.Kernel.get(this, "intelligentTiering", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.inventoryConfiguration = software.amazon.jsii.Kernel.get(this, "inventoryConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.inventorySelfSourceDestination = software.amazon.jsii.Kernel.get(this, "inventorySelfSourceDestination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.inventorySourceAccountId = software.amazon.jsii.Kernel.get(this, "inventorySourceAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.inventorySourceBucketArn = software.amazon.jsii.Kernel.get(this, "inventorySourceBucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lifecycleRule = software.amazon.jsii.Kernel.get(this, "lifecycleRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.logging = software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.metricConfiguration = software.amazon.jsii.Kernel.get(this, "metricConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.objectLockConfiguration = software.amazon.jsii.Kernel.get(this, "objectLockConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.objectLockEnabled = software.amazon.jsii.Kernel.get(this, "objectLockEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.objectOwnership = software.amazon.jsii.Kernel.get(this, "objectOwnership", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.owner = software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.putinKhuylo = software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.replicationConfiguration = software.amazon.jsii.Kernel.get(this, "replicationConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.requestPayer = software.amazon.jsii.Kernel.get(this, "requestPayer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.restrictPublicBuckets = software.amazon.jsii.Kernel.get(this, "restrictPublicBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.serverSideEncryptionConfiguration = software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.versioning = software.amazon.jsii.Kernel.get(this, "versioning", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.website = software.amazon.jsii.Kernel.get(this, "website", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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
            this.accelerationStatus = builder.accelerationStatus;
            this.accessLogDeliveryPolicySourceAccounts = builder.accessLogDeliveryPolicySourceAccounts;
            this.accessLogDeliveryPolicySourceBuckets = builder.accessLogDeliveryPolicySourceBuckets;
            this.acl = builder.acl;
            this.allowedKmsKeyArn = builder.allowedKmsKeyArn;
            this.analyticsConfiguration = builder.analyticsConfiguration;
            this.analyticsSelfSourceDestination = builder.analyticsSelfSourceDestination;
            this.analyticsSourceAccountId = builder.analyticsSourceAccountId;
            this.analyticsSourceBucketArn = builder.analyticsSourceBucketArn;
            this.attachAccessLogDeliveryPolicy = builder.attachAccessLogDeliveryPolicy;
            this.attachAnalyticsDestinationPolicy = builder.attachAnalyticsDestinationPolicy;
            this.attachDenyIncorrectEncryptionHeaders = builder.attachDenyIncorrectEncryptionHeaders;
            this.attachDenyIncorrectKmsKeySse = builder.attachDenyIncorrectKmsKeySse;
            this.attachDenyInsecureTransportPolicy = builder.attachDenyInsecureTransportPolicy;
            this.attachDenyUnencryptedObjectUploads = builder.attachDenyUnencryptedObjectUploads;
            this.attachElbLogDeliveryPolicy = builder.attachElbLogDeliveryPolicy;
            this.attachInventoryDestinationPolicy = builder.attachInventoryDestinationPolicy;
            this.attachLbLogDeliveryPolicy = builder.attachLbLogDeliveryPolicy;
            this.attachPolicy = builder.attachPolicy;
            this.attachPublicPolicy = builder.attachPublicPolicy;
            this.attachRequireLatestTlsPolicy = builder.attachRequireLatestTlsPolicy;
            this.blockPublicAcls = builder.blockPublicAcls;
            this.blockPublicPolicy = builder.blockPublicPolicy;
            this.bucket = builder.bucket;
            this.bucketPrefix = builder.bucketPrefix;
            this.controlObjectOwnership = builder.controlObjectOwnership;
            this.corsRule = builder.corsRule;
            this.createBucket = builder.createBucket;
            this.expectedBucketOwner = builder.expectedBucketOwner;
            this.forceDestroy = builder.forceDestroy;
            this.grant = builder.grant;
            this.ignorePublicAcls = builder.ignorePublicAcls;
            this.intelligentTiering = builder.intelligentTiering;
            this.inventoryConfiguration = builder.inventoryConfiguration;
            this.inventorySelfSourceDestination = builder.inventorySelfSourceDestination;
            this.inventorySourceAccountId = builder.inventorySourceAccountId;
            this.inventorySourceBucketArn = builder.inventorySourceBucketArn;
            this.lifecycleRule = builder.lifecycleRule;
            this.logging = builder.logging;
            this.metricConfiguration = builder.metricConfiguration;
            this.objectLockConfiguration = builder.objectLockConfiguration;
            this.objectLockEnabled = builder.objectLockEnabled;
            this.objectOwnership = builder.objectOwnership;
            this.owner = builder.owner;
            this.policy = builder.policy;
            this.putinKhuylo = builder.putinKhuylo;
            this.replicationConfiguration = builder.replicationConfiguration;
            this.requestPayer = builder.requestPayer;
            this.restrictPublicBuckets = builder.restrictPublicBuckets;
            this.serverSideEncryptionConfiguration = builder.serverSideEncryptionConfiguration;
            this.tags = builder.tags;
            this.versioning = builder.versioning;
            this.website = builder.website;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.lang.String getAccelerationStatus() {
            return this.accelerationStatus;
        }

        @Override
        public final java.util.List<java.lang.String> getAccessLogDeliveryPolicySourceAccounts() {
            return this.accessLogDeliveryPolicySourceAccounts;
        }

        @Override
        public final java.util.List<java.lang.String> getAccessLogDeliveryPolicySourceBuckets() {
            return this.accessLogDeliveryPolicySourceBuckets;
        }

        @Override
        public final java.lang.String getAcl() {
            return this.acl;
        }

        @Override
        public final java.lang.String getAllowedKmsKeyArn() {
            return this.allowedKmsKeyArn;
        }

        @Override
        public final java.lang.Object getAnalyticsConfiguration() {
            return this.analyticsConfiguration;
        }

        @Override
        public final java.lang.Boolean getAnalyticsSelfSourceDestination() {
            return this.analyticsSelfSourceDestination;
        }

        @Override
        public final java.lang.String getAnalyticsSourceAccountId() {
            return this.analyticsSourceAccountId;
        }

        @Override
        public final java.lang.String getAnalyticsSourceBucketArn() {
            return this.analyticsSourceBucketArn;
        }

        @Override
        public final java.lang.Boolean getAttachAccessLogDeliveryPolicy() {
            return this.attachAccessLogDeliveryPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachAnalyticsDestinationPolicy() {
            return this.attachAnalyticsDestinationPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachDenyIncorrectEncryptionHeaders() {
            return this.attachDenyIncorrectEncryptionHeaders;
        }

        @Override
        public final java.lang.Boolean getAttachDenyIncorrectKmsKeySse() {
            return this.attachDenyIncorrectKmsKeySse;
        }

        @Override
        public final java.lang.Boolean getAttachDenyInsecureTransportPolicy() {
            return this.attachDenyInsecureTransportPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachDenyUnencryptedObjectUploads() {
            return this.attachDenyUnencryptedObjectUploads;
        }

        @Override
        public final java.lang.Boolean getAttachElbLogDeliveryPolicy() {
            return this.attachElbLogDeliveryPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachInventoryDestinationPolicy() {
            return this.attachInventoryDestinationPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachLbLogDeliveryPolicy() {
            return this.attachLbLogDeliveryPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPolicy() {
            return this.attachPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPublicPolicy() {
            return this.attachPublicPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachRequireLatestTlsPolicy() {
            return this.attachRequireLatestTlsPolicy;
        }

        @Override
        public final java.lang.Boolean getBlockPublicAcls() {
            return this.blockPublicAcls;
        }

        @Override
        public final java.lang.Boolean getBlockPublicPolicy() {
            return this.blockPublicPolicy;
        }

        @Override
        public final java.lang.String getBucket() {
            return this.bucket;
        }

        @Override
        public final java.lang.String getBucketPrefix() {
            return this.bucketPrefix;
        }

        @Override
        public final java.lang.Boolean getControlObjectOwnership() {
            return this.controlObjectOwnership;
        }

        @Override
        public final java.lang.Object getCorsRule() {
            return this.corsRule;
        }

        @Override
        public final java.lang.Boolean getCreateBucket() {
            return this.createBucket;
        }

        @Override
        public final java.lang.String getExpectedBucketOwner() {
            return this.expectedBucketOwner;
        }

        @Override
        public final java.lang.Boolean getForceDestroy() {
            return this.forceDestroy;
        }

        @Override
        public final java.lang.Object getGrant() {
            return this.grant;
        }

        @Override
        public final java.lang.Boolean getIgnorePublicAcls() {
            return this.ignorePublicAcls;
        }

        @Override
        public final java.lang.Object getIntelligentTiering() {
            return this.intelligentTiering;
        }

        @Override
        public final java.lang.Object getInventoryConfiguration() {
            return this.inventoryConfiguration;
        }

        @Override
        public final java.lang.Boolean getInventorySelfSourceDestination() {
            return this.inventorySelfSourceDestination;
        }

        @Override
        public final java.lang.String getInventorySourceAccountId() {
            return this.inventorySourceAccountId;
        }

        @Override
        public final java.lang.String getInventorySourceBucketArn() {
            return this.inventorySourceBucketArn;
        }

        @Override
        public final java.lang.Object getLifecycleRule() {
            return this.lifecycleRule;
        }

        @Override
        public final java.lang.Object getLogging() {
            return this.logging;
        }

        @Override
        public final java.lang.Object getMetricConfiguration() {
            return this.metricConfiguration;
        }

        @Override
        public final java.lang.Object getObjectLockConfiguration() {
            return this.objectLockConfiguration;
        }

        @Override
        public final java.lang.Boolean getObjectLockEnabled() {
            return this.objectLockEnabled;
        }

        @Override
        public final java.lang.String getObjectOwnership() {
            return this.objectOwnership;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getOwner() {
            return this.owner;
        }

        @Override
        public final java.lang.String getPolicy() {
            return this.policy;
        }

        @Override
        public final java.lang.Boolean getPutinKhuylo() {
            return this.putinKhuylo;
        }

        @Override
        public final java.lang.Object getReplicationConfiguration() {
            return this.replicationConfiguration;
        }

        @Override
        public final java.lang.String getRequestPayer() {
            return this.requestPayer;
        }

        @Override
        public final java.lang.Boolean getRestrictPublicBuckets() {
            return this.restrictPublicBuckets;
        }

        @Override
        public final java.lang.Object getServerSideEncryptionConfiguration() {
            return this.serverSideEncryptionConfiguration;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVersioning() {
            return this.versioning;
        }

        @Override
        public final java.lang.Object getWebsite() {
            return this.website;
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

            if (this.getAccelerationStatus() != null) {
                data.set("accelerationStatus", om.valueToTree(this.getAccelerationStatus()));
            }
            if (this.getAccessLogDeliveryPolicySourceAccounts() != null) {
                data.set("accessLogDeliveryPolicySourceAccounts", om.valueToTree(this.getAccessLogDeliveryPolicySourceAccounts()));
            }
            if (this.getAccessLogDeliveryPolicySourceBuckets() != null) {
                data.set("accessLogDeliveryPolicySourceBuckets", om.valueToTree(this.getAccessLogDeliveryPolicySourceBuckets()));
            }
            if (this.getAcl() != null) {
                data.set("acl", om.valueToTree(this.getAcl()));
            }
            if (this.getAllowedKmsKeyArn() != null) {
                data.set("allowedKmsKeyArn", om.valueToTree(this.getAllowedKmsKeyArn()));
            }
            if (this.getAnalyticsConfiguration() != null) {
                data.set("analyticsConfiguration", om.valueToTree(this.getAnalyticsConfiguration()));
            }
            if (this.getAnalyticsSelfSourceDestination() != null) {
                data.set("analyticsSelfSourceDestination", om.valueToTree(this.getAnalyticsSelfSourceDestination()));
            }
            if (this.getAnalyticsSourceAccountId() != null) {
                data.set("analyticsSourceAccountId", om.valueToTree(this.getAnalyticsSourceAccountId()));
            }
            if (this.getAnalyticsSourceBucketArn() != null) {
                data.set("analyticsSourceBucketArn", om.valueToTree(this.getAnalyticsSourceBucketArn()));
            }
            if (this.getAttachAccessLogDeliveryPolicy() != null) {
                data.set("attachAccessLogDeliveryPolicy", om.valueToTree(this.getAttachAccessLogDeliveryPolicy()));
            }
            if (this.getAttachAnalyticsDestinationPolicy() != null) {
                data.set("attachAnalyticsDestinationPolicy", om.valueToTree(this.getAttachAnalyticsDestinationPolicy()));
            }
            if (this.getAttachDenyIncorrectEncryptionHeaders() != null) {
                data.set("attachDenyIncorrectEncryptionHeaders", om.valueToTree(this.getAttachDenyIncorrectEncryptionHeaders()));
            }
            if (this.getAttachDenyIncorrectKmsKeySse() != null) {
                data.set("attachDenyIncorrectKmsKeySse", om.valueToTree(this.getAttachDenyIncorrectKmsKeySse()));
            }
            if (this.getAttachDenyInsecureTransportPolicy() != null) {
                data.set("attachDenyInsecureTransportPolicy", om.valueToTree(this.getAttachDenyInsecureTransportPolicy()));
            }
            if (this.getAttachDenyUnencryptedObjectUploads() != null) {
                data.set("attachDenyUnencryptedObjectUploads", om.valueToTree(this.getAttachDenyUnencryptedObjectUploads()));
            }
            if (this.getAttachElbLogDeliveryPolicy() != null) {
                data.set("attachElbLogDeliveryPolicy", om.valueToTree(this.getAttachElbLogDeliveryPolicy()));
            }
            if (this.getAttachInventoryDestinationPolicy() != null) {
                data.set("attachInventoryDestinationPolicy", om.valueToTree(this.getAttachInventoryDestinationPolicy()));
            }
            if (this.getAttachLbLogDeliveryPolicy() != null) {
                data.set("attachLbLogDeliveryPolicy", om.valueToTree(this.getAttachLbLogDeliveryPolicy()));
            }
            if (this.getAttachPolicy() != null) {
                data.set("attachPolicy", om.valueToTree(this.getAttachPolicy()));
            }
            if (this.getAttachPublicPolicy() != null) {
                data.set("attachPublicPolicy", om.valueToTree(this.getAttachPublicPolicy()));
            }
            if (this.getAttachRequireLatestTlsPolicy() != null) {
                data.set("attachRequireLatestTlsPolicy", om.valueToTree(this.getAttachRequireLatestTlsPolicy()));
            }
            if (this.getBlockPublicAcls() != null) {
                data.set("blockPublicAcls", om.valueToTree(this.getBlockPublicAcls()));
            }
            if (this.getBlockPublicPolicy() != null) {
                data.set("blockPublicPolicy", om.valueToTree(this.getBlockPublicPolicy()));
            }
            if (this.getBucket() != null) {
                data.set("bucket", om.valueToTree(this.getBucket()));
            }
            if (this.getBucketPrefix() != null) {
                data.set("bucketPrefix", om.valueToTree(this.getBucketPrefix()));
            }
            if (this.getControlObjectOwnership() != null) {
                data.set("controlObjectOwnership", om.valueToTree(this.getControlObjectOwnership()));
            }
            if (this.getCorsRule() != null) {
                data.set("corsRule", om.valueToTree(this.getCorsRule()));
            }
            if (this.getCreateBucket() != null) {
                data.set("createBucket", om.valueToTree(this.getCreateBucket()));
            }
            if (this.getExpectedBucketOwner() != null) {
                data.set("expectedBucketOwner", om.valueToTree(this.getExpectedBucketOwner()));
            }
            if (this.getForceDestroy() != null) {
                data.set("forceDestroy", om.valueToTree(this.getForceDestroy()));
            }
            if (this.getGrant() != null) {
                data.set("grant", om.valueToTree(this.getGrant()));
            }
            if (this.getIgnorePublicAcls() != null) {
                data.set("ignorePublicAcls", om.valueToTree(this.getIgnorePublicAcls()));
            }
            if (this.getIntelligentTiering() != null) {
                data.set("intelligentTiering", om.valueToTree(this.getIntelligentTiering()));
            }
            if (this.getInventoryConfiguration() != null) {
                data.set("inventoryConfiguration", om.valueToTree(this.getInventoryConfiguration()));
            }
            if (this.getInventorySelfSourceDestination() != null) {
                data.set("inventorySelfSourceDestination", om.valueToTree(this.getInventorySelfSourceDestination()));
            }
            if (this.getInventorySourceAccountId() != null) {
                data.set("inventorySourceAccountId", om.valueToTree(this.getInventorySourceAccountId()));
            }
            if (this.getInventorySourceBucketArn() != null) {
                data.set("inventorySourceBucketArn", om.valueToTree(this.getInventorySourceBucketArn()));
            }
            if (this.getLifecycleRule() != null) {
                data.set("lifecycleRule", om.valueToTree(this.getLifecycleRule()));
            }
            if (this.getLogging() != null) {
                data.set("logging", om.valueToTree(this.getLogging()));
            }
            if (this.getMetricConfiguration() != null) {
                data.set("metricConfiguration", om.valueToTree(this.getMetricConfiguration()));
            }
            if (this.getObjectLockConfiguration() != null) {
                data.set("objectLockConfiguration", om.valueToTree(this.getObjectLockConfiguration()));
            }
            if (this.getObjectLockEnabled() != null) {
                data.set("objectLockEnabled", om.valueToTree(this.getObjectLockEnabled()));
            }
            if (this.getObjectOwnership() != null) {
                data.set("objectOwnership", om.valueToTree(this.getObjectOwnership()));
            }
            if (this.getOwner() != null) {
                data.set("owner", om.valueToTree(this.getOwner()));
            }
            if (this.getPolicy() != null) {
                data.set("policy", om.valueToTree(this.getPolicy()));
            }
            if (this.getPutinKhuylo() != null) {
                data.set("putinKhuylo", om.valueToTree(this.getPutinKhuylo()));
            }
            if (this.getReplicationConfiguration() != null) {
                data.set("replicationConfiguration", om.valueToTree(this.getReplicationConfiguration()));
            }
            if (this.getRequestPayer() != null) {
                data.set("requestPayer", om.valueToTree(this.getRequestPayer()));
            }
            if (this.getRestrictPublicBuckets() != null) {
                data.set("restrictPublicBuckets", om.valueToTree(this.getRestrictPublicBuckets()));
            }
            if (this.getServerSideEncryptionConfiguration() != null) {
                data.set("serverSideEncryptionConfiguration", om.valueToTree(this.getServerSideEncryptionConfiguration()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getVersioning() != null) {
                data.set("versioning", om.valueToTree(this.getVersioning()));
            }
            if (this.getWebsite() != null) {
                data.set("website", om.valueToTree(this.getWebsite()));
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
            struct.set("fqn", om.valueToTree("s3bucket.S3BucketConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketConfig.Jsii$Proxy that = (S3BucketConfig.Jsii$Proxy) o;

            if (this.accelerationStatus != null ? !this.accelerationStatus.equals(that.accelerationStatus) : that.accelerationStatus != null) return false;
            if (this.accessLogDeliveryPolicySourceAccounts != null ? !this.accessLogDeliveryPolicySourceAccounts.equals(that.accessLogDeliveryPolicySourceAccounts) : that.accessLogDeliveryPolicySourceAccounts != null) return false;
            if (this.accessLogDeliveryPolicySourceBuckets != null ? !this.accessLogDeliveryPolicySourceBuckets.equals(that.accessLogDeliveryPolicySourceBuckets) : that.accessLogDeliveryPolicySourceBuckets != null) return false;
            if (this.acl != null ? !this.acl.equals(that.acl) : that.acl != null) return false;
            if (this.allowedKmsKeyArn != null ? !this.allowedKmsKeyArn.equals(that.allowedKmsKeyArn) : that.allowedKmsKeyArn != null) return false;
            if (this.analyticsConfiguration != null ? !this.analyticsConfiguration.equals(that.analyticsConfiguration) : that.analyticsConfiguration != null) return false;
            if (this.analyticsSelfSourceDestination != null ? !this.analyticsSelfSourceDestination.equals(that.analyticsSelfSourceDestination) : that.analyticsSelfSourceDestination != null) return false;
            if (this.analyticsSourceAccountId != null ? !this.analyticsSourceAccountId.equals(that.analyticsSourceAccountId) : that.analyticsSourceAccountId != null) return false;
            if (this.analyticsSourceBucketArn != null ? !this.analyticsSourceBucketArn.equals(that.analyticsSourceBucketArn) : that.analyticsSourceBucketArn != null) return false;
            if (this.attachAccessLogDeliveryPolicy != null ? !this.attachAccessLogDeliveryPolicy.equals(that.attachAccessLogDeliveryPolicy) : that.attachAccessLogDeliveryPolicy != null) return false;
            if (this.attachAnalyticsDestinationPolicy != null ? !this.attachAnalyticsDestinationPolicy.equals(that.attachAnalyticsDestinationPolicy) : that.attachAnalyticsDestinationPolicy != null) return false;
            if (this.attachDenyIncorrectEncryptionHeaders != null ? !this.attachDenyIncorrectEncryptionHeaders.equals(that.attachDenyIncorrectEncryptionHeaders) : that.attachDenyIncorrectEncryptionHeaders != null) return false;
            if (this.attachDenyIncorrectKmsKeySse != null ? !this.attachDenyIncorrectKmsKeySse.equals(that.attachDenyIncorrectKmsKeySse) : that.attachDenyIncorrectKmsKeySse != null) return false;
            if (this.attachDenyInsecureTransportPolicy != null ? !this.attachDenyInsecureTransportPolicy.equals(that.attachDenyInsecureTransportPolicy) : that.attachDenyInsecureTransportPolicy != null) return false;
            if (this.attachDenyUnencryptedObjectUploads != null ? !this.attachDenyUnencryptedObjectUploads.equals(that.attachDenyUnencryptedObjectUploads) : that.attachDenyUnencryptedObjectUploads != null) return false;
            if (this.attachElbLogDeliveryPolicy != null ? !this.attachElbLogDeliveryPolicy.equals(that.attachElbLogDeliveryPolicy) : that.attachElbLogDeliveryPolicy != null) return false;
            if (this.attachInventoryDestinationPolicy != null ? !this.attachInventoryDestinationPolicy.equals(that.attachInventoryDestinationPolicy) : that.attachInventoryDestinationPolicy != null) return false;
            if (this.attachLbLogDeliveryPolicy != null ? !this.attachLbLogDeliveryPolicy.equals(that.attachLbLogDeliveryPolicy) : that.attachLbLogDeliveryPolicy != null) return false;
            if (this.attachPolicy != null ? !this.attachPolicy.equals(that.attachPolicy) : that.attachPolicy != null) return false;
            if (this.attachPublicPolicy != null ? !this.attachPublicPolicy.equals(that.attachPublicPolicy) : that.attachPublicPolicy != null) return false;
            if (this.attachRequireLatestTlsPolicy != null ? !this.attachRequireLatestTlsPolicy.equals(that.attachRequireLatestTlsPolicy) : that.attachRequireLatestTlsPolicy != null) return false;
            if (this.blockPublicAcls != null ? !this.blockPublicAcls.equals(that.blockPublicAcls) : that.blockPublicAcls != null) return false;
            if (this.blockPublicPolicy != null ? !this.blockPublicPolicy.equals(that.blockPublicPolicy) : that.blockPublicPolicy != null) return false;
            if (this.bucket != null ? !this.bucket.equals(that.bucket) : that.bucket != null) return false;
            if (this.bucketPrefix != null ? !this.bucketPrefix.equals(that.bucketPrefix) : that.bucketPrefix != null) return false;
            if (this.controlObjectOwnership != null ? !this.controlObjectOwnership.equals(that.controlObjectOwnership) : that.controlObjectOwnership != null) return false;
            if (this.corsRule != null ? !this.corsRule.equals(that.corsRule) : that.corsRule != null) return false;
            if (this.createBucket != null ? !this.createBucket.equals(that.createBucket) : that.createBucket != null) return false;
            if (this.expectedBucketOwner != null ? !this.expectedBucketOwner.equals(that.expectedBucketOwner) : that.expectedBucketOwner != null) return false;
            if (this.forceDestroy != null ? !this.forceDestroy.equals(that.forceDestroy) : that.forceDestroy != null) return false;
            if (this.grant != null ? !this.grant.equals(that.grant) : that.grant != null) return false;
            if (this.ignorePublicAcls != null ? !this.ignorePublicAcls.equals(that.ignorePublicAcls) : that.ignorePublicAcls != null) return false;
            if (this.intelligentTiering != null ? !this.intelligentTiering.equals(that.intelligentTiering) : that.intelligentTiering != null) return false;
            if (this.inventoryConfiguration != null ? !this.inventoryConfiguration.equals(that.inventoryConfiguration) : that.inventoryConfiguration != null) return false;
            if (this.inventorySelfSourceDestination != null ? !this.inventorySelfSourceDestination.equals(that.inventorySelfSourceDestination) : that.inventorySelfSourceDestination != null) return false;
            if (this.inventorySourceAccountId != null ? !this.inventorySourceAccountId.equals(that.inventorySourceAccountId) : that.inventorySourceAccountId != null) return false;
            if (this.inventorySourceBucketArn != null ? !this.inventorySourceBucketArn.equals(that.inventorySourceBucketArn) : that.inventorySourceBucketArn != null) return false;
            if (this.lifecycleRule != null ? !this.lifecycleRule.equals(that.lifecycleRule) : that.lifecycleRule != null) return false;
            if (this.logging != null ? !this.logging.equals(that.logging) : that.logging != null) return false;
            if (this.metricConfiguration != null ? !this.metricConfiguration.equals(that.metricConfiguration) : that.metricConfiguration != null) return false;
            if (this.objectLockConfiguration != null ? !this.objectLockConfiguration.equals(that.objectLockConfiguration) : that.objectLockConfiguration != null) return false;
            if (this.objectLockEnabled != null ? !this.objectLockEnabled.equals(that.objectLockEnabled) : that.objectLockEnabled != null) return false;
            if (this.objectOwnership != null ? !this.objectOwnership.equals(that.objectOwnership) : that.objectOwnership != null) return false;
            if (this.owner != null ? !this.owner.equals(that.owner) : that.owner != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.putinKhuylo != null ? !this.putinKhuylo.equals(that.putinKhuylo) : that.putinKhuylo != null) return false;
            if (this.replicationConfiguration != null ? !this.replicationConfiguration.equals(that.replicationConfiguration) : that.replicationConfiguration != null) return false;
            if (this.requestPayer != null ? !this.requestPayer.equals(that.requestPayer) : that.requestPayer != null) return false;
            if (this.restrictPublicBuckets != null ? !this.restrictPublicBuckets.equals(that.restrictPublicBuckets) : that.restrictPublicBuckets != null) return false;
            if (this.serverSideEncryptionConfiguration != null ? !this.serverSideEncryptionConfiguration.equals(that.serverSideEncryptionConfiguration) : that.serverSideEncryptionConfiguration != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.versioning != null ? !this.versioning.equals(that.versioning) : that.versioning != null) return false;
            if (this.website != null ? !this.website.equals(that.website) : that.website != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accelerationStatus != null ? this.accelerationStatus.hashCode() : 0;
            result = 31 * result + (this.accessLogDeliveryPolicySourceAccounts != null ? this.accessLogDeliveryPolicySourceAccounts.hashCode() : 0);
            result = 31 * result + (this.accessLogDeliveryPolicySourceBuckets != null ? this.accessLogDeliveryPolicySourceBuckets.hashCode() : 0);
            result = 31 * result + (this.acl != null ? this.acl.hashCode() : 0);
            result = 31 * result + (this.allowedKmsKeyArn != null ? this.allowedKmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.analyticsConfiguration != null ? this.analyticsConfiguration.hashCode() : 0);
            result = 31 * result + (this.analyticsSelfSourceDestination != null ? this.analyticsSelfSourceDestination.hashCode() : 0);
            result = 31 * result + (this.analyticsSourceAccountId != null ? this.analyticsSourceAccountId.hashCode() : 0);
            result = 31 * result + (this.analyticsSourceBucketArn != null ? this.analyticsSourceBucketArn.hashCode() : 0);
            result = 31 * result + (this.attachAccessLogDeliveryPolicy != null ? this.attachAccessLogDeliveryPolicy.hashCode() : 0);
            result = 31 * result + (this.attachAnalyticsDestinationPolicy != null ? this.attachAnalyticsDestinationPolicy.hashCode() : 0);
            result = 31 * result + (this.attachDenyIncorrectEncryptionHeaders != null ? this.attachDenyIncorrectEncryptionHeaders.hashCode() : 0);
            result = 31 * result + (this.attachDenyIncorrectKmsKeySse != null ? this.attachDenyIncorrectKmsKeySse.hashCode() : 0);
            result = 31 * result + (this.attachDenyInsecureTransportPolicy != null ? this.attachDenyInsecureTransportPolicy.hashCode() : 0);
            result = 31 * result + (this.attachDenyUnencryptedObjectUploads != null ? this.attachDenyUnencryptedObjectUploads.hashCode() : 0);
            result = 31 * result + (this.attachElbLogDeliveryPolicy != null ? this.attachElbLogDeliveryPolicy.hashCode() : 0);
            result = 31 * result + (this.attachInventoryDestinationPolicy != null ? this.attachInventoryDestinationPolicy.hashCode() : 0);
            result = 31 * result + (this.attachLbLogDeliveryPolicy != null ? this.attachLbLogDeliveryPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPolicy != null ? this.attachPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPublicPolicy != null ? this.attachPublicPolicy.hashCode() : 0);
            result = 31 * result + (this.attachRequireLatestTlsPolicy != null ? this.attachRequireLatestTlsPolicy.hashCode() : 0);
            result = 31 * result + (this.blockPublicAcls != null ? this.blockPublicAcls.hashCode() : 0);
            result = 31 * result + (this.blockPublicPolicy != null ? this.blockPublicPolicy.hashCode() : 0);
            result = 31 * result + (this.bucket != null ? this.bucket.hashCode() : 0);
            result = 31 * result + (this.bucketPrefix != null ? this.bucketPrefix.hashCode() : 0);
            result = 31 * result + (this.controlObjectOwnership != null ? this.controlObjectOwnership.hashCode() : 0);
            result = 31 * result + (this.corsRule != null ? this.corsRule.hashCode() : 0);
            result = 31 * result + (this.createBucket != null ? this.createBucket.hashCode() : 0);
            result = 31 * result + (this.expectedBucketOwner != null ? this.expectedBucketOwner.hashCode() : 0);
            result = 31 * result + (this.forceDestroy != null ? this.forceDestroy.hashCode() : 0);
            result = 31 * result + (this.grant != null ? this.grant.hashCode() : 0);
            result = 31 * result + (this.ignorePublicAcls != null ? this.ignorePublicAcls.hashCode() : 0);
            result = 31 * result + (this.intelligentTiering != null ? this.intelligentTiering.hashCode() : 0);
            result = 31 * result + (this.inventoryConfiguration != null ? this.inventoryConfiguration.hashCode() : 0);
            result = 31 * result + (this.inventorySelfSourceDestination != null ? this.inventorySelfSourceDestination.hashCode() : 0);
            result = 31 * result + (this.inventorySourceAccountId != null ? this.inventorySourceAccountId.hashCode() : 0);
            result = 31 * result + (this.inventorySourceBucketArn != null ? this.inventorySourceBucketArn.hashCode() : 0);
            result = 31 * result + (this.lifecycleRule != null ? this.lifecycleRule.hashCode() : 0);
            result = 31 * result + (this.logging != null ? this.logging.hashCode() : 0);
            result = 31 * result + (this.metricConfiguration != null ? this.metricConfiguration.hashCode() : 0);
            result = 31 * result + (this.objectLockConfiguration != null ? this.objectLockConfiguration.hashCode() : 0);
            result = 31 * result + (this.objectLockEnabled != null ? this.objectLockEnabled.hashCode() : 0);
            result = 31 * result + (this.objectOwnership != null ? this.objectOwnership.hashCode() : 0);
            result = 31 * result + (this.owner != null ? this.owner.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.putinKhuylo != null ? this.putinKhuylo.hashCode() : 0);
            result = 31 * result + (this.replicationConfiguration != null ? this.replicationConfiguration.hashCode() : 0);
            result = 31 * result + (this.requestPayer != null ? this.requestPayer.hashCode() : 0);
            result = 31 * result + (this.restrictPublicBuckets != null ? this.restrictPublicBuckets.hashCode() : 0);
            result = 31 * result + (this.serverSideEncryptionConfiguration != null ? this.serverSideEncryptionConfiguration.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.versioning != null ? this.versioning.hashCode() : 0);
            result = 31 * result + (this.website != null ? this.website.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
