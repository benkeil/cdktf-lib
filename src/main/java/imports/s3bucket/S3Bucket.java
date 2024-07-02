package imports.s3bucket;

/**
 * Defines an S3Bucket based on a Terraform module.
 * <p>
 * Docs at Terraform Registry: {@link https://registry.terraform.io/modules/terraform-aws-modules/s3-bucket/aws/~> 4.1 terraform-aws-modules/s3-bucket/aws}
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.451Z")
@software.amazon.jsii.Jsii(module = imports.s3bucket.$Module.class, fqn = "s3bucket.S3Bucket")
public class S3Bucket extends com.hashicorp.cdktf.TerraformModule {

    protected S3Bucket(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3Bucket(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public S3Bucket(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.s3bucket.S3BucketConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public S3Bucket(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
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

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketBucketDomainNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketBucketDomainNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketBucketRegionalDomainNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketBucketRegionalDomainNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketHostedZoneIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketHostedZoneIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketLifecycleConfigurationRulesOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketLifecycleConfigurationRulesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketPolicyOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketPolicyOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketRegionOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketRegionOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketWebsiteDomainOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketWebsiteDomainOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getS3BucketWebsiteEndpointOutput() {
        return software.amazon.jsii.Kernel.get(this, "s3BucketWebsiteEndpointOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAnalyticsConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "analyticsConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAnalyticsConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "analyticsConfiguration", java.util.Objects.requireNonNull(value, "analyticsConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCorsRule() {
        return software.amazon.jsii.Kernel.get(this, "corsRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCorsRule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "corsRule", java.util.Objects.requireNonNull(value, "corsRule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getGrant() {
        return software.amazon.jsii.Kernel.get(this, "grant", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setGrant(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "grant", java.util.Objects.requireNonNull(value, "grant is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIntelligentTiering() {
        return software.amazon.jsii.Kernel.get(this, "intelligentTiering", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIntelligentTiering(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "intelligentTiering", java.util.Objects.requireNonNull(value, "intelligentTiering is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getInventoryConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "inventoryConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInventoryConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "inventoryConfiguration", java.util.Objects.requireNonNull(value, "inventoryConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getLifecycleRule() {
        return software.amazon.jsii.Kernel.get(this, "lifecycleRule", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setLifecycleRule(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "lifecycleRule", java.util.Objects.requireNonNull(value, "lifecycleRule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getLogging() {
        return software.amazon.jsii.Kernel.get(this, "logging", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setLogging(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "logging", java.util.Objects.requireNonNull(value, "logging is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMetricConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "metricConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMetricConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "metricConfiguration", java.util.Objects.requireNonNull(value, "metricConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getObjectLockConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "objectLockConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setObjectLockConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "objectLockConfiguration", java.util.Objects.requireNonNull(value, "objectLockConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getReplicationConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "replicationConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setReplicationConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "replicationConfiguration", java.util.Objects.requireNonNull(value, "replicationConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getServerSideEncryptionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setServerSideEncryptionConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "serverSideEncryptionConfiguration", java.util.Objects.requireNonNull(value, "serverSideEncryptionConfiguration is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getWebsite() {
        return software.amazon.jsii.Kernel.get(this, "website", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setWebsite(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "website", java.util.Objects.requireNonNull(value, "website is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccelerationStatus() {
        return software.amazon.jsii.Kernel.get(this, "accelerationStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccelerationStatus(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accelerationStatus", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessLogDeliveryPolicySourceAccounts() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "accessLogDeliveryPolicySourceAccounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setAccessLogDeliveryPolicySourceAccounts(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "accessLogDeliveryPolicySourceAccounts", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAccessLogDeliveryPolicySourceBuckets() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "accessLogDeliveryPolicySourceBuckets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setAccessLogDeliveryPolicySourceBuckets(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "accessLogDeliveryPolicySourceBuckets", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAcl() {
        return software.amazon.jsii.Kernel.get(this, "acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAcl(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "acl", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAllowedKmsKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "allowedKmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAllowedKmsKeyArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "allowedKmsKeyArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAnalyticsSelfSourceDestination() {
        return software.amazon.jsii.Kernel.get(this, "analyticsSelfSourceDestination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAnalyticsSelfSourceDestination(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "analyticsSelfSourceDestination", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAnalyticsSourceAccountId() {
        return software.amazon.jsii.Kernel.get(this, "analyticsSourceAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAnalyticsSourceAccountId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "analyticsSourceAccountId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAnalyticsSourceBucketArn() {
        return software.amazon.jsii.Kernel.get(this, "analyticsSourceBucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAnalyticsSourceBucketArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "analyticsSourceBucketArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachAccessLogDeliveryPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachAccessLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachAccessLogDeliveryPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachAccessLogDeliveryPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachAnalyticsDestinationPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachAnalyticsDestinationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachAnalyticsDestinationPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachAnalyticsDestinationPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyIncorrectEncryptionHeaders() {
        return software.amazon.jsii.Kernel.get(this, "attachDenyIncorrectEncryptionHeaders", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachDenyIncorrectEncryptionHeaders(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachDenyIncorrectEncryptionHeaders", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyIncorrectKmsKeySse() {
        return software.amazon.jsii.Kernel.get(this, "attachDenyIncorrectKmsKeySse", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachDenyIncorrectKmsKeySse(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachDenyIncorrectKmsKeySse", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyInsecureTransportPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachDenyInsecureTransportPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachDenyInsecureTransportPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachDenyInsecureTransportPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDenyUnencryptedObjectUploads() {
        return software.amazon.jsii.Kernel.get(this, "attachDenyUnencryptedObjectUploads", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachDenyUnencryptedObjectUploads(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachDenyUnencryptedObjectUploads", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachElbLogDeliveryPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachElbLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachElbLogDeliveryPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachElbLogDeliveryPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachInventoryDestinationPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachInventoryDestinationPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachInventoryDestinationPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachInventoryDestinationPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachLbLogDeliveryPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachLbLogDeliveryPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachLbLogDeliveryPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachLbLogDeliveryPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPublicPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachPublicPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachPublicPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachRequireLatestTlsPolicy() {
        return software.amazon.jsii.Kernel.get(this, "attachRequireLatestTlsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAttachRequireLatestTlsPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "attachRequireLatestTlsPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicAcls() {
        return software.amazon.jsii.Kernel.get(this, "blockPublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBlockPublicAcls(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "blockPublicAcls", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockPublicPolicy() {
        return software.amazon.jsii.Kernel.get(this, "blockPublicPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setBlockPublicPolicy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "blockPublicPolicy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucket() {
        return software.amazon.jsii.Kernel.get(this, "bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucket(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucket", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBucketPrefix() {
        return software.amazon.jsii.Kernel.get(this, "bucketPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBucketPrefix(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bucketPrefix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getControlObjectOwnership() {
        return software.amazon.jsii.Kernel.get(this, "controlObjectOwnership", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setControlObjectOwnership(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "controlObjectOwnership", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateBucket() {
        return software.amazon.jsii.Kernel.get(this, "createBucket", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateBucket(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createBucket", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExpectedBucketOwner() {
        return software.amazon.jsii.Kernel.get(this, "expectedBucketOwner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExpectedBucketOwner(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "expectedBucketOwner", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getForceDestroy() {
        return software.amazon.jsii.Kernel.get(this, "forceDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setForceDestroy(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceDestroy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnorePublicAcls() {
        return software.amazon.jsii.Kernel.get(this, "ignorePublicAcls", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIgnorePublicAcls(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ignorePublicAcls", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getInventorySelfSourceDestination() {
        return software.amazon.jsii.Kernel.get(this, "inventorySelfSourceDestination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setInventorySelfSourceDestination(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "inventorySelfSourceDestination", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInventorySourceAccountId() {
        return software.amazon.jsii.Kernel.get(this, "inventorySourceAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInventorySourceAccountId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inventorySourceAccountId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInventorySourceBucketArn() {
        return software.amazon.jsii.Kernel.get(this, "inventorySourceBucketArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInventorySourceBucketArn(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inventorySourceBucketArn", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getObjectLockEnabled() {
        return software.amazon.jsii.Kernel.get(this, "objectLockEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setObjectLockEnabled(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "objectLockEnabled", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getObjectOwnership() {
        return software.amazon.jsii.Kernel.get(this, "objectOwnership", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setObjectOwnership(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "objectOwnership", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getOwner() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setOwner(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "owner", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPutinKhuylo() {
        return software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPutinKhuylo(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "putinKhuylo", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRequestPayer() {
        return software.amazon.jsii.Kernel.get(this, "requestPayer", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRequestPayer(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "requestPayer", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getRestrictPublicBuckets() {
        return software.amazon.jsii.Kernel.get(this, "restrictPublicBuckets", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setRestrictPublicBuckets(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "restrictPublicBuckets", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVersioning() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "versioning", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setVersioning(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "versioning", value);
    }

    /**
     * A fluent builder for {@link imports.s3bucket.S3Bucket}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.s3bucket.S3Bucket> {
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
        private imports.s3bucket.S3BucketConfig.Builder config;

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
         * (Optional) Sets the accelerate configuration of an existing bucket.
         * <p>
         * Can be Enabled or Suspended.
         * <p>
         * @return {@code this}
         * @param accelerationStatus (Optional) Sets the accelerate configuration of an existing bucket. This parameter is required.
         */
        public Builder accelerationStatus(final java.lang.String accelerationStatus) {
            this.config().accelerationStatus(accelerationStatus);
            return this;
        }

        /**
         * (Optional) List of AWS Account IDs should be allowed to deliver access logs to this bucket.
         * <p>
         * @return {@code this}
         * @param accessLogDeliveryPolicySourceAccounts (Optional) List of AWS Account IDs should be allowed to deliver access logs to this bucket. This parameter is required.
         */
        public Builder accessLogDeliveryPolicySourceAccounts(final java.util.List<java.lang.String> accessLogDeliveryPolicySourceAccounts) {
            this.config().accessLogDeliveryPolicySourceAccounts(accessLogDeliveryPolicySourceAccounts);
            return this;
        }

        /**
         * (Optional) List of S3 bucket ARNs which should be allowed to deliver access logs to this bucket.
         * <p>
         * @return {@code this}
         * @param accessLogDeliveryPolicySourceBuckets (Optional) List of S3 bucket ARNs which should be allowed to deliver access logs to this bucket. This parameter is required.
         */
        public Builder accessLogDeliveryPolicySourceBuckets(final java.util.List<java.lang.String> accessLogDeliveryPolicySourceBuckets) {
            this.config().accessLogDeliveryPolicySourceBuckets(accessLogDeliveryPolicySourceBuckets);
            return this;
        }

        /**
         * (Optional) The canned ACL to apply.
         * <p>
         * Conflicts with <code>grant</code>
         * <p>
         * @return {@code this}
         * @param acl (Optional) The canned ACL to apply. This parameter is required.
         */
        public Builder acl(final java.lang.String acl) {
            this.config().acl(acl);
            return this;
        }

        /**
         * The ARN of KMS key which should be allowed in PutObject.
         * <p>
         * @return {@code this}
         * @param allowedKmsKeyArn The ARN of KMS key which should be allowed in PutObject. This parameter is required.
         */
        public Builder allowedKmsKeyArn(final java.lang.String allowedKmsKeyArn) {
            this.config().allowedKmsKeyArn(allowedKmsKeyArn);
            return this;
        }

        /**
         * Map containing bucket analytics configuration.
         * <p>
         * @return {@code this}
         * @param analyticsConfiguration Map containing bucket analytics configuration. This parameter is required.
         */
        public Builder analyticsConfiguration(final java.lang.Object analyticsConfiguration) {
            this.config().analyticsConfiguration(analyticsConfiguration);
            return this;
        }

        /**
         * Whether or not the analytics source bucket is also the destination bucket.
         * <p>
         * @return {@code this}
         * @param analyticsSelfSourceDestination Whether or not the analytics source bucket is also the destination bucket. This parameter is required.
         */
        public Builder analyticsSelfSourceDestination(final java.lang.Boolean analyticsSelfSourceDestination) {
            this.config().analyticsSelfSourceDestination(analyticsSelfSourceDestination);
            return this;
        }

        /**
         * The analytics source account id.
         * <p>
         * @return {@code this}
         * @param analyticsSourceAccountId The analytics source account id. This parameter is required.
         */
        public Builder analyticsSourceAccountId(final java.lang.String analyticsSourceAccountId) {
            this.config().analyticsSourceAccountId(analyticsSourceAccountId);
            return this;
        }

        /**
         * The analytics source bucket ARN.
         * <p>
         * @return {@code this}
         * @param analyticsSourceBucketArn The analytics source bucket ARN. This parameter is required.
         */
        public Builder analyticsSourceBucketArn(final java.lang.String analyticsSourceBucketArn) {
            this.config().analyticsSourceBucketArn(analyticsSourceBucketArn);
            return this;
        }

        /**
         * Controls if S3 bucket should have S3 access log delivery policy attached.
         * <p>
         * @return {@code this}
         * @param attachAccessLogDeliveryPolicy Controls if S3 bucket should have S3 access log delivery policy attached. This parameter is required.
         */
        public Builder attachAccessLogDeliveryPolicy(final java.lang.Boolean attachAccessLogDeliveryPolicy) {
            this.config().attachAccessLogDeliveryPolicy(attachAccessLogDeliveryPolicy);
            return this;
        }

        /**
         * Controls if S3 bucket should have bucket analytics destination policy attached.
         * <p>
         * @return {@code this}
         * @param attachAnalyticsDestinationPolicy Controls if S3 bucket should have bucket analytics destination policy attached. This parameter is required.
         */
        public Builder attachAnalyticsDestinationPolicy(final java.lang.Boolean attachAnalyticsDestinationPolicy) {
            this.config().attachAnalyticsDestinationPolicy(attachAnalyticsDestinationPolicy);
            return this;
        }

        /**
         * Controls if S3 bucket should deny incorrect encryption headers policy attached.
         * <p>
         * @return {@code this}
         * @param attachDenyIncorrectEncryptionHeaders Controls if S3 bucket should deny incorrect encryption headers policy attached. This parameter is required.
         */
        public Builder attachDenyIncorrectEncryptionHeaders(final java.lang.Boolean attachDenyIncorrectEncryptionHeaders) {
            this.config().attachDenyIncorrectEncryptionHeaders(attachDenyIncorrectEncryptionHeaders);
            return this;
        }

        /**
         * Controls if S3 bucket policy should deny usage of incorrect KMS key SSE.
         * <p>
         * @return {@code this}
         * @param attachDenyIncorrectKmsKeySse Controls if S3 bucket policy should deny usage of incorrect KMS key SSE. This parameter is required.
         */
        public Builder attachDenyIncorrectKmsKeySse(final java.lang.Boolean attachDenyIncorrectKmsKeySse) {
            this.config().attachDenyIncorrectKmsKeySse(attachDenyIncorrectKmsKeySse);
            return this;
        }

        /**
         * Controls if S3 bucket should have deny non-SSL transport policy attached.
         * <p>
         * @return {@code this}
         * @param attachDenyInsecureTransportPolicy Controls if S3 bucket should have deny non-SSL transport policy attached. This parameter is required.
         */
        public Builder attachDenyInsecureTransportPolicy(final java.lang.Boolean attachDenyInsecureTransportPolicy) {
            this.config().attachDenyInsecureTransportPolicy(attachDenyInsecureTransportPolicy);
            return this;
        }

        /**
         * Controls if S3 bucket should deny unencrypted object uploads policy attached.
         * <p>
         * @return {@code this}
         * @param attachDenyUnencryptedObjectUploads Controls if S3 bucket should deny unencrypted object uploads policy attached. This parameter is required.
         */
        public Builder attachDenyUnencryptedObjectUploads(final java.lang.Boolean attachDenyUnencryptedObjectUploads) {
            this.config().attachDenyUnencryptedObjectUploads(attachDenyUnencryptedObjectUploads);
            return this;
        }

        /**
         * Controls if S3 bucket should have ELB log delivery policy attached.
         * <p>
         * @return {@code this}
         * @param attachElbLogDeliveryPolicy Controls if S3 bucket should have ELB log delivery policy attached. This parameter is required.
         */
        public Builder attachElbLogDeliveryPolicy(final java.lang.Boolean attachElbLogDeliveryPolicy) {
            this.config().attachElbLogDeliveryPolicy(attachElbLogDeliveryPolicy);
            return this;
        }

        /**
         * Controls if S3 bucket should have bucket inventory destination policy attached.
         * <p>
         * @return {@code this}
         * @param attachInventoryDestinationPolicy Controls if S3 bucket should have bucket inventory destination policy attached. This parameter is required.
         */
        public Builder attachInventoryDestinationPolicy(final java.lang.Boolean attachInventoryDestinationPolicy) {
            this.config().attachInventoryDestinationPolicy(attachInventoryDestinationPolicy);
            return this;
        }

        /**
         * Controls if S3 bucket should have ALB/NLB log delivery policy attached.
         * <p>
         * @return {@code this}
         * @param attachLbLogDeliveryPolicy Controls if S3 bucket should have ALB/NLB log delivery policy attached. This parameter is required.
         */
        public Builder attachLbLogDeliveryPolicy(final java.lang.Boolean attachLbLogDeliveryPolicy) {
            this.config().attachLbLogDeliveryPolicy(attachLbLogDeliveryPolicy);
            return this;
        }

        /**
         * Controls if S3 bucket should have bucket policy attached (set to <code>true</code> to use value of <code>policy</code> as bucket policy).
         * <p>
         * @return {@code this}
         * @param attachPolicy Controls if S3 bucket should have bucket policy attached (set to <code>true</code> to use value of <code>policy</code> as bucket policy). This parameter is required.
         */
        public Builder attachPolicy(final java.lang.Boolean attachPolicy) {
            this.config().attachPolicy(attachPolicy);
            return this;
        }

        /**
         * Controls if a user defined public bucket policy will be attached (set to <code>false</code> to allow upstream to apply defaults to the bucket) true.
         * <p>
         * @return {@code this}
         * @param attachPublicPolicy Controls if a user defined public bucket policy will be attached (set to <code>false</code> to allow upstream to apply defaults to the bucket) true. This parameter is required.
         */
        public Builder attachPublicPolicy(final java.lang.Boolean attachPublicPolicy) {
            this.config().attachPublicPolicy(attachPublicPolicy);
            return this;
        }

        /**
         * Controls if S3 bucket should require the latest version of TLS.
         * <p>
         * @return {@code this}
         * @param attachRequireLatestTlsPolicy Controls if S3 bucket should require the latest version of TLS. This parameter is required.
         */
        public Builder attachRequireLatestTlsPolicy(final java.lang.Boolean attachRequireLatestTlsPolicy) {
            this.config().attachRequireLatestTlsPolicy(attachRequireLatestTlsPolicy);
            return this;
        }

        /**
         * Whether Amazon S3 should block public ACLs for this bucket.
         * <p>
         * true
         * <p>
         * @return {@code this}
         * @param blockPublicAcls Whether Amazon S3 should block public ACLs for this bucket. This parameter is required.
         */
        public Builder blockPublicAcls(final java.lang.Boolean blockPublicAcls) {
            this.config().blockPublicAcls(blockPublicAcls);
            return this;
        }

        /**
         * Whether Amazon S3 should block public bucket policies for this bucket.
         * <p>
         * true
         * <p>
         * @return {@code this}
         * @param blockPublicPolicy Whether Amazon S3 should block public bucket policies for this bucket. This parameter is required.
         */
        public Builder blockPublicPolicy(final java.lang.Boolean blockPublicPolicy) {
            this.config().blockPublicPolicy(blockPublicPolicy);
            return this;
        }

        /**
         * (Optional, Forces new resource) The name of the bucket.
         * <p>
         * If omitted, Terraform will assign a random, unique name.
         * <p>
         * @return {@code this}
         * @param bucket (Optional, Forces new resource) The name of the bucket. This parameter is required.
         */
        public Builder bucket(final java.lang.String bucket) {
            this.config().bucket(bucket);
            return this;
        }

        /**
         * (Optional, Forces new resource) Creates a unique bucket name beginning with the specified prefix.
         * <p>
         * Conflicts with bucket.
         * <p>
         * @return {@code this}
         * @param bucketPrefix (Optional, Forces new resource) Creates a unique bucket name beginning with the specified prefix. This parameter is required.
         */
        public Builder bucketPrefix(final java.lang.String bucketPrefix) {
            this.config().bucketPrefix(bucketPrefix);
            return this;
        }

        /**
         * Whether to manage S3 Bucket Ownership Controls on this bucket.
         * <p>
         * @return {@code this}
         * @param controlObjectOwnership Whether to manage S3 Bucket Ownership Controls on this bucket. This parameter is required.
         */
        public Builder controlObjectOwnership(final java.lang.Boolean controlObjectOwnership) {
            this.config().controlObjectOwnership(controlObjectOwnership);
            return this;
        }

        /**
         * List of maps containing rules for Cross-Origin Resource Sharing.
         * <p>
         * @return {@code this}
         * @param corsRule List of maps containing rules for Cross-Origin Resource Sharing. This parameter is required.
         */
        public Builder corsRule(final java.lang.Object corsRule) {
            this.config().corsRule(corsRule);
            return this;
        }

        /**
         * Controls if S3 bucket should be created true.
         * <p>
         * @return {@code this}
         * @param createBucket Controls if S3 bucket should be created true. This parameter is required.
         */
        public Builder createBucket(final java.lang.Boolean createBucket) {
            this.config().createBucket(createBucket);
            return this;
        }

        /**
         * The account ID of the expected bucket owner.
         * <p>
         * @return {@code this}
         * @param expectedBucketOwner The account ID of the expected bucket owner. This parameter is required.
         */
        public Builder expectedBucketOwner(final java.lang.String expectedBucketOwner) {
            this.config().expectedBucketOwner(expectedBucketOwner);
            return this;
        }

        /**
         * (Optional, Default:false ) A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error.
         * <p>
         * These objects are not recoverable.
         * <p>
         * @return {@code this}
         * @param forceDestroy (Optional, Default:false ) A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. This parameter is required.
         */
        public Builder forceDestroy(final java.lang.Boolean forceDestroy) {
            this.config().forceDestroy(forceDestroy);
            return this;
        }

        /**
         * An ACL policy grant.
         * <p>
         * Conflicts with <code>acl</code>
         * <p>
         * @return {@code this}
         * @param grant An ACL policy grant. This parameter is required.
         */
        public Builder grant(final java.lang.Object grant) {
            this.config().grant(grant);
            return this;
        }

        /**
         * Whether Amazon S3 should ignore public ACLs for this bucket.
         * <p>
         * true
         * <p>
         * @return {@code this}
         * @param ignorePublicAcls Whether Amazon S3 should ignore public ACLs for this bucket. This parameter is required.
         */
        public Builder ignorePublicAcls(final java.lang.Boolean ignorePublicAcls) {
            this.config().ignorePublicAcls(ignorePublicAcls);
            return this;
        }

        /**
         * Map containing intelligent tiering configuration.
         * <p>
         * @return {@code this}
         * @param intelligentTiering Map containing intelligent tiering configuration. This parameter is required.
         */
        public Builder intelligentTiering(final java.lang.Object intelligentTiering) {
            this.config().intelligentTiering(intelligentTiering);
            return this;
        }

        /**
         * Map containing S3 inventory configuration.
         * <p>
         * @return {@code this}
         * @param inventoryConfiguration Map containing S3 inventory configuration. This parameter is required.
         */
        public Builder inventoryConfiguration(final java.lang.Object inventoryConfiguration) {
            this.config().inventoryConfiguration(inventoryConfiguration);
            return this;
        }

        /**
         * Whether or not the inventory source bucket is also the destination bucket.
         * <p>
         * @return {@code this}
         * @param inventorySelfSourceDestination Whether or not the inventory source bucket is also the destination bucket. This parameter is required.
         */
        public Builder inventorySelfSourceDestination(final java.lang.Boolean inventorySelfSourceDestination) {
            this.config().inventorySelfSourceDestination(inventorySelfSourceDestination);
            return this;
        }

        /**
         * The inventory source account id.
         * <p>
         * @return {@code this}
         * @param inventorySourceAccountId The inventory source account id. This parameter is required.
         */
        public Builder inventorySourceAccountId(final java.lang.String inventorySourceAccountId) {
            this.config().inventorySourceAccountId(inventorySourceAccountId);
            return this;
        }

        /**
         * The inventory source bucket ARN.
         * <p>
         * @return {@code this}
         * @param inventorySourceBucketArn The inventory source bucket ARN. This parameter is required.
         */
        public Builder inventorySourceBucketArn(final java.lang.String inventorySourceBucketArn) {
            this.config().inventorySourceBucketArn(inventorySourceBucketArn);
            return this;
        }

        /**
         * List of maps containing configuration of object lifecycle management.
         * <p>
         * @return {@code this}
         * @param lifecycleRule List of maps containing configuration of object lifecycle management. This parameter is required.
         */
        public Builder lifecycleRule(final java.lang.Object lifecycleRule) {
            this.config().lifecycleRule(lifecycleRule);
            return this;
        }

        /**
         * Map containing access bucket logging configuration.
         * <p>
         * @return {@code this}
         * @param logging Map containing access bucket logging configuration. This parameter is required.
         */
        public Builder logging(final java.lang.Object logging) {
            this.config().logging(logging);
            return this;
        }

        /**
         * Map containing bucket metric configuration.
         * <p>
         * @return {@code this}
         * @param metricConfiguration Map containing bucket metric configuration. This parameter is required.
         */
        public Builder metricConfiguration(final java.lang.Object metricConfiguration) {
            this.config().metricConfiguration(metricConfiguration);
            return this;
        }

        /**
         * Map containing S3 object locking configuration.
         * <p>
         * @return {@code this}
         * @param objectLockConfiguration Map containing S3 object locking configuration. This parameter is required.
         */
        public Builder objectLockConfiguration(final java.lang.Object objectLockConfiguration) {
            this.config().objectLockConfiguration(objectLockConfiguration);
            return this;
        }

        /**
         * Whether S3 bucket should have an Object Lock configuration enabled.
         * <p>
         * @return {@code this}
         * @param objectLockEnabled Whether S3 bucket should have an Object Lock configuration enabled. This parameter is required.
         */
        public Builder objectLockEnabled(final java.lang.Boolean objectLockEnabled) {
            this.config().objectLockEnabled(objectLockEnabled);
            return this;
        }

        /**
         * Object ownership.
         * <p>
         * Valid values: BucketOwnerEnforced, BucketOwnerPreferred or ObjectWriter. 'BucketOwnerEnforced': ACLs are disabled, and the bucket owner automatically owns and has full control over every object in the bucket. 'BucketOwnerPreferred': Objects uploaded to the bucket change ownership to the bucket owner if the objects are uploaded with the bucket-owner-full-control canned ACL. 'ObjectWriter': The uploading account will own the object if the object is uploaded with the bucket-owner-full-control canned ACL.
         * BucketOwnerEnforced
         * <p>
         * @return {@code this}
         * @param objectOwnership Object ownership. This parameter is required.
         */
        public Builder objectOwnership(final java.lang.String objectOwnership) {
            this.config().objectOwnership(objectOwnership);
            return this;
        }

        /**
         * Bucket owner's display name and ID.
         * <p>
         * Conflicts with `acl`
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param owner Bucket owner's display name and ID. This parameter is required.
         */
        public Builder owner(final java.util.Map<java.lang.String, java.lang.String> owner) {
            this.config().owner(owner);
            return this;
        }

        /**
         * (Optional) A valid bucket policy JSON document.
         * <p>
         * Note that if the policy document is not specific enough (but still valid), Terraform may view the policy as constantly changing in a terraform plan. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with Terraform, see the AWS IAM Policy Document Guide.
         * <p>
         * @return {@code this}
         * @param policy (Optional) A valid bucket policy JSON document. This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config().policy(policy);
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
         * Map containing cross-region replication configuration.
         * <p>
         * @return {@code this}
         * @param replicationConfiguration Map containing cross-region replication configuration. This parameter is required.
         */
        public Builder replicationConfiguration(final java.lang.Object replicationConfiguration) {
            this.config().replicationConfiguration(replicationConfiguration);
            return this;
        }

        /**
         * (Optional) Specifies who should bear the cost of Amazon S3 data transfer.
         * <p>
         * Can be either BucketOwner or Requester. By default, the owner of the S3 bucket would incur the costs of any data transfer. See Requester Pays Buckets developer guide for more information.
         * <p>
         * @return {@code this}
         * @param requestPayer (Optional) Specifies who should bear the cost of Amazon S3 data transfer. This parameter is required.
         */
        public Builder requestPayer(final java.lang.String requestPayer) {
            this.config().requestPayer(requestPayer);
            return this;
        }

        /**
         * Whether Amazon S3 should restrict public bucket policies for this bucket.
         * <p>
         * true
         * <p>
         * @return {@code this}
         * @param restrictPublicBuckets Whether Amazon S3 should restrict public bucket policies for this bucket. This parameter is required.
         */
        public Builder restrictPublicBuckets(final java.lang.Boolean restrictPublicBuckets) {
            this.config().restrictPublicBuckets(restrictPublicBuckets);
            return this;
        }

        /**
         * Map containing server-side encryption configuration.
         * <p>
         * @return {@code this}
         * @param serverSideEncryptionConfiguration Map containing server-side encryption configuration. This parameter is required.
         */
        public Builder serverSideEncryptionConfiguration(final java.lang.Object serverSideEncryptionConfiguration) {
            this.config().serverSideEncryptionConfiguration(serverSideEncryptionConfiguration);
            return this;
        }

        /**
         * (Optional) A mapping of tags to assign to the bucket.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param tags (Optional) A mapping of tags to assign to the bucket. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * Map containing versioning configuration.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param versioning Map containing versioning configuration. This parameter is required.
         */
        public Builder versioning(final java.util.Map<java.lang.String, java.lang.String> versioning) {
            this.config().versioning(versioning);
            return this;
        }

        /**
         * Map containing static web-site hosting or redirect configuration.
         * <p>
         * @return {@code this}
         * @param website Map containing static web-site hosting or redirect configuration. This parameter is required.
         */
        public Builder website(final java.lang.Object website) {
            this.config().website(website);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.s3bucket.S3Bucket}.
         */
        @Override
        public imports.s3bucket.S3Bucket build() {
            return new imports.s3bucket.S3Bucket(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.s3bucket.S3BucketConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.s3bucket.S3BucketConfig.Builder();
            }
            return this.config;
        }
    }
}
