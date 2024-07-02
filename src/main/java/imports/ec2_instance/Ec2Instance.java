package imports.ec2_instance;

/**
 * Defines an Ec2Instance based on a Terraform module.
 * <p>
 * Docs at Terraform Registry: {@link https://registry.terraform.io/modules/terraform-aws-modules/ec2-instance/aws/~> 5.6 terraform-aws-modules/ec2-instance/aws}
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:43:29.772Z")
@software.amazon.jsii.Jsii(module = imports.ec2_instance.$Module.class, fqn = "ec2-instance.Ec2Instance")
public class Ec2Instance extends com.hashicorp.cdktf.TerraformModule {

    protected Ec2Instance(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2Instance(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public Ec2Instance(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.ec2_instance.Ec2InstanceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    public Ec2Instance(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
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

    public @org.jetbrains.annotations.NotNull java.lang.String getAmiOutput() {
        return software.amazon.jsii.Kernel.get(this, "amiOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "arnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZoneOutput() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCapacityReservationSpecificationOutput() {
        return software.amazon.jsii.Kernel.get(this, "capacityReservationSpecificationOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEbsBlockDeviceOutput() {
        return software.amazon.jsii.Kernel.get(this, "ebsBlockDeviceOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEphemeralBlockDeviceOutput() {
        return software.amazon.jsii.Kernel.get(this, "ephemeralBlockDeviceOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamInstanceProfileArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "iamInstanceProfileArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamInstanceProfileIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "iamInstanceProfileIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamInstanceProfileUniqueOutput() {
        return software.amazon.jsii.Kernel.get(this, "iamInstanceProfileUniqueOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRoleArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRoleNameOutput() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleNameOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRoleUniqueIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleUniqueIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "idOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInstanceStateOutput() {
        return software.amazon.jsii.Kernel.get(this, "instanceStateOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpv6AddressesOutput() {
        return software.amazon.jsii.Kernel.get(this, "ipv6AddressesOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOutpostArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "outpostArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPasswordDataOutput() {
        return software.amazon.jsii.Kernel.get(this, "passwordDataOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrimaryNetworkInterfaceIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "primaryNetworkInterfaceIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateDnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "privateDnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateIpOutput() {
        return software.amazon.jsii.Kernel.get(this, "privateIpOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicDnsOutput() {
        return software.amazon.jsii.Kernel.get(this, "publicDnsOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPublicIpOutput() {
        return software.amazon.jsii.Kernel.get(this, "publicIpOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRootBlockDeviceOutput() {
        return software.amazon.jsii.Kernel.get(this, "rootBlockDeviceOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSpotBidStatusOutput() {
        return software.amazon.jsii.Kernel.get(this, "spotBidStatusOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSpotInstanceIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "spotInstanceIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSpotRequestStateOutput() {
        return software.amazon.jsii.Kernel.get(this, "spotRequestStateOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTagsAllOutput() {
        return software.amazon.jsii.Kernel.get(this, "tagsAllOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCapacityReservationSpecification() {
        return software.amazon.jsii.Kernel.get(this, "capacityReservationSpecification", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCapacityReservationSpecification(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "capacityReservationSpecification", java.util.Objects.requireNonNull(value, "capacityReservationSpecification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCpuOptions() {
        return software.amazon.jsii.Kernel.get(this, "cpuOptions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCpuOptions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "cpuOptions", java.util.Objects.requireNonNull(value, "cpuOptions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMaintenanceOptions() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceOptions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMaintenanceOptions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "maintenanceOptions", java.util.Objects.requireNonNull(value, "maintenanceOptions is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAmi() {
        return software.amazon.jsii.Kernel.get(this, "ami", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAmi(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ami", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAmiSsmParameter() {
        return software.amazon.jsii.Kernel.get(this, "amiSsmParameter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAmiSsmParameter(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "amiSsmParameter", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getAssociatePublicIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "associatePublicIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setAssociatePublicIpAddress(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "associatePublicIpAddress", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAvailabilityZone(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "availabilityZone", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCpuCoreCount() {
        return software.amazon.jsii.Kernel.get(this, "cpuCoreCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCpuCoreCount(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cpuCoreCount", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCpuCredits() {
        return software.amazon.jsii.Kernel.get(this, "cpuCredits", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCpuCredits(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cpuCredits", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getCpuThreadsPerCore() {
        return software.amazon.jsii.Kernel.get(this, "cpuThreadsPerCore", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setCpuThreadsPerCore(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "cpuThreadsPerCore", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreate(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "create", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateIamInstanceProfile() {
        return software.amazon.jsii.Kernel.get(this, "createIamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateIamInstanceProfile(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createIamInstanceProfile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSpotInstance() {
        return software.amazon.jsii.Kernel.get(this, "createSpotInstance", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateSpotInstance(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createSpotInstance", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableApiStop() {
        return software.amazon.jsii.Kernel.get(this, "disableApiStop", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDisableApiStop(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableApiStop", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableApiTermination() {
        return software.amazon.jsii.Kernel.get(this, "disableApiTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setDisableApiTermination(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "disableApiTermination", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.Object> getEbsBlockDevice() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setEbsBlockDevice(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "ebsBlockDevice", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimized() {
        return software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEbsOptimized(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ebsOptimized", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableVolumeTags() {
        return software.amazon.jsii.Kernel.get(this, "enableVolumeTags", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnableVolumeTags(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableVolumeTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getEnclaveOptionsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enclaveOptionsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setEnclaveOptionsEnabled(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enclaveOptionsEnabled", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.util.Map<java.lang.String, java.lang.String>> getEphemeralBlockDevice() {
        return java.util.Optional.ofNullable((java.util.List<java.util.Map<java.lang.String, java.lang.String>>)(software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setEphemeralBlockDevice(final @org.jetbrains.annotations.Nullable java.util.List<java.util.Map<java.lang.String, java.lang.String>> value) {
        software.amazon.jsii.Kernel.set(this, "ephemeralBlockDevice", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getFetchPasswordData() {
        return software.amazon.jsii.Kernel.get(this, "fetchPasswordData", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setFetchPasswordData(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "fetchPasswordData", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getHibernation() {
        return software.amazon.jsii.Kernel.get(this, "hibernation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setHibernation(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "hibernation", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHostId() {
        return software.amazon.jsii.Kernel.get(this, "hostId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHostId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hostId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamInstanceProfile() {
        return software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamInstanceProfile(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamInstanceProfile", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRoleDescription() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRoleDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRoleDescription", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRoleName() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRoleName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRoleName", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRolePath() {
        return software.amazon.jsii.Kernel.get(this, "iamRolePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRolePath(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRolePath", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIamRolePermissionsBoundary() {
        return software.amazon.jsii.Kernel.get(this, "iamRolePermissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIamRolePermissionsBoundary(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "iamRolePermissionsBoundary", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getIamRolePolicies() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "iamRolePolicies", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setIamRolePolicies(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "iamRolePolicies", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getIamRoleTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "iamRoleTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setIamRoleTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "iamRoleTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIamRoleUseNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleUseNamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIamRoleUseNamePrefix(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "iamRoleUseNamePrefix", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreAmiChanges() {
        return software.amazon.jsii.Kernel.get(this, "ignoreAmiChanges", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setIgnoreAmiChanges(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "ignoreAmiChanges", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceInitiatedShutdownBehavior() {
        return software.amazon.jsii.Kernel.get(this, "instanceInitiatedShutdownBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceInitiatedShutdownBehavior(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceInitiatedShutdownBehavior", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getInstanceTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "instanceTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setInstanceTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "instanceTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInstanceType() {
        return software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInstanceType(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "instanceType", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIpv6AddressCount() {
        return software.amazon.jsii.Kernel.get(this, "ipv6AddressCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setIpv6AddressCount(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "ipv6AddressCount", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpv6Addresses() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ipv6Addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setIpv6Addresses(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ipv6Addresses", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyName() {
        return software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyName", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLaunchTemplate() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "launchTemplate", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setLaunchTemplate(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "launchTemplate", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMetadataOptions() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "metadataOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setMetadataOptions(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "metadataOptions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getMonitoring() {
        return software.amazon.jsii.Kernel.get(this, "monitoring", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setMonitoring(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "monitoring", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.util.Map<java.lang.String, java.lang.String>> getNetworkInterface() {
        return java.util.Optional.ofNullable((java.util.List<java.util.Map<java.lang.String, java.lang.String>>)(software.amazon.jsii.Kernel.get(this, "networkInterface", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setNetworkInterface(final @org.jetbrains.annotations.Nullable java.util.List<java.util.Map<java.lang.String, java.lang.String>> value) {
        software.amazon.jsii.Kernel.set(this, "networkInterface", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPlacementGroup() {
        return software.amazon.jsii.Kernel.get(this, "placementGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPlacementGroup(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "placementGroup", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getPrivateDnsNameOptions() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "privateDnsNameOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setPrivateDnsNameOptions(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "privateDnsNameOptions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateIp() {
        return software.amazon.jsii.Kernel.get(this, "privateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateIp(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateIp", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getPutinKhuylo() {
        return software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setPutinKhuylo(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "putinKhuylo", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.Object> getRootBlockDevice() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setRootBlockDevice(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "rootBlockDevice", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecondaryPrivateIps() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "secondaryPrivateIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setSecondaryPrivateIps(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "secondaryPrivateIps", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSourceDestCheck() {
        return software.amazon.jsii.Kernel.get(this, "sourceDestCheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSourceDestCheck(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "sourceDestCheck", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getSpotBlockDurationMinutes() {
        return software.amazon.jsii.Kernel.get(this, "spotBlockDurationMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setSpotBlockDurationMinutes(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "spotBlockDurationMinutes", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotInstanceInterruptionBehavior() {
        return software.amazon.jsii.Kernel.get(this, "spotInstanceInterruptionBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotInstanceInterruptionBehavior(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotInstanceInterruptionBehavior", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotLaunchGroup() {
        return software.amazon.jsii.Kernel.get(this, "spotLaunchGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotLaunchGroup(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotLaunchGroup", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotPrice() {
        return software.amazon.jsii.Kernel.get(this, "spotPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotPrice(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotPrice", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotType() {
        return software.amazon.jsii.Kernel.get(this, "spotType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotType(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotType", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotValidFrom() {
        return software.amazon.jsii.Kernel.get(this, "spotValidFrom", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotValidFrom(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotValidFrom", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSpotValidUntil() {
        return software.amazon.jsii.Kernel.get(this, "spotValidUntil", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSpotValidUntil(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "spotValidUntil", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getSpotWaitForFulfillment() {
        return software.amazon.jsii.Kernel.get(this, "spotWaitForFulfillment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setSpotWaitForFulfillment(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "spotWaitForFulfillment", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubnetId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subnetId", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTenancy() {
        return software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTenancy(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tenancy", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTimeouts() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTimeouts(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "timeouts", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserData() {
        return software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserData(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userData", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserDataBase64() {
        return software.amazon.jsii.Kernel.get(this, "userDataBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserDataBase64(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userDataBase64", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getUserDataReplaceOnChange() {
        return software.amazon.jsii.Kernel.get(this, "userDataReplaceOnChange", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setUserDataReplaceOnChange(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "userDataReplaceOnChange", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "volumeTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setVolumeTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "volumeTags", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setVpcSecurityGroupIds(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "vpcSecurityGroupIds", value);
    }

    /**
     * A fluent builder for {@link imports.ec2_instance.Ec2Instance}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.ec2_instance.Ec2Instance> {
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
        private imports.ec2_instance.Ec2InstanceConfig.Builder config;

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
         * ID of AMI to use for the instance.
         * <p>
         * @return {@code this}
         * @param ami ID of AMI to use for the instance. This parameter is required.
         */
        public Builder ami(final java.lang.String ami) {
            this.config().ami(ami);
            return this;
        }

        /**
         * SSM parameter name for the AMI ID.
         * <p>
         * For Amazon Linux AMI SSM parameters see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-public-parameters-ami.html">reference</a>
         * /aws/service/ami-amazon-linux-latest/amzn2-ami-hvm-x86_64-gp2
         * <p>
         * @return {@code this}
         * @param amiSsmParameter SSM parameter name for the AMI ID. This parameter is required.
         */
        public Builder amiSsmParameter(final java.lang.String amiSsmParameter) {
            this.config().amiSsmParameter(amiSsmParameter);
            return this;
        }

        /**
         * Whether to associate a public IP address with an instance in a VPC.
         * <p>
         * @return {@code this}
         * @param associatePublicIpAddress Whether to associate a public IP address with an instance in a VPC. This parameter is required.
         */
        public Builder associatePublicIpAddress(final java.lang.Boolean associatePublicIpAddress) {
            this.config().associatePublicIpAddress(associatePublicIpAddress);
            return this;
        }

        /**
         * AZ to start the instance in.
         * <p>
         * @return {@code this}
         * @param availabilityZone AZ to start the instance in. This parameter is required.
         */
        public Builder availabilityZone(final java.lang.String availabilityZone) {
            this.config().availabilityZone(availabilityZone);
            return this;
        }

        /**
         * Describes an instance's Capacity Reservation targeting option.
         * <p>
         * @return {@code this}
         * @param capacityReservationSpecification Describes an instance's Capacity Reservation targeting option. This parameter is required.
         */
        public Builder capacityReservationSpecification(final java.lang.Object capacityReservationSpecification) {
            this.config().capacityReservationSpecification(capacityReservationSpecification);
            return this;
        }

        /**
         * Sets the number of CPU cores for an instance.
         * <p>
         * @return {@code this}
         * @param cpuCoreCount Sets the number of CPU cores for an instance. This parameter is required.
         */
        public Builder cpuCoreCount(final java.lang.Number cpuCoreCount) {
            this.config().cpuCoreCount(cpuCoreCount);
            return this;
        }

        /**
         * The credit option for CPU usage (unlimited or standard).
         * <p>
         * @return {@code this}
         * @param cpuCredits The credit option for CPU usage (unlimited or standard). This parameter is required.
         */
        public Builder cpuCredits(final java.lang.String cpuCredits) {
            this.config().cpuCredits(cpuCredits);
            return this;
        }

        /**
         * Defines CPU options to apply to the instance at launch time.
         * <p>
         * @return {@code this}
         * @param cpuOptions Defines CPU options to apply to the instance at launch time. This parameter is required.
         */
        public Builder cpuOptions(final java.lang.Object cpuOptions) {
            this.config().cpuOptions(cpuOptions);
            return this;
        }

        /**
         * Sets the number of CPU threads per core for an instance (has no effect unless cpu_core_count is also set).
         * <p>
         * @return {@code this}
         * @param cpuThreadsPerCore Sets the number of CPU threads per core for an instance (has no effect unless cpu_core_count is also set). This parameter is required.
         */
        public Builder cpuThreadsPerCore(final java.lang.Number cpuThreadsPerCore) {
            this.config().cpuThreadsPerCore(cpuThreadsPerCore);
            return this;
        }

        /**
         * Whether to create an instance true.
         * <p>
         * @return {@code this}
         * @param create Whether to create an instance true. This parameter is required.
         */
        public Builder create(final java.lang.Boolean create) {
            this.config().create(create);
            return this;
        }

        /**
         * Determines whether an IAM instance profile is created or to use an existing IAM instance profile.
         * <p>
         * @return {@code this}
         * @param createIamInstanceProfile Determines whether an IAM instance profile is created or to use an existing IAM instance profile. This parameter is required.
         */
        public Builder createIamInstanceProfile(final java.lang.Boolean createIamInstanceProfile) {
            this.config().createIamInstanceProfile(createIamInstanceProfile);
            return this;
        }

        /**
         * Depicts if the instance is a spot instance.
         * <p>
         * @return {@code this}
         * @param createSpotInstance Depicts if the instance is a spot instance. This parameter is required.
         */
        public Builder createSpotInstance(final java.lang.Boolean createSpotInstance) {
            this.config().createSpotInstance(createSpotInstance);
            return this;
        }

        /**
         * If true, enables EC2 Instance Stop Protection.
         * <p>
         * @return {@code this}
         * @param disableApiStop If true, enables EC2 Instance Stop Protection. This parameter is required.
         */
        public Builder disableApiStop(final java.lang.Boolean disableApiStop) {
            this.config().disableApiStop(disableApiStop);
            return this;
        }

        /**
         * If true, enables EC2 Instance Termination Protection.
         * <p>
         * @return {@code this}
         * @param disableApiTermination If true, enables EC2 Instance Termination Protection. This parameter is required.
         */
        public Builder disableApiTermination(final java.lang.Boolean disableApiTermination) {
            this.config().disableApiTermination(disableApiTermination);
            return this;
        }

        /**
         * Additional EBS block devices to attach to the instance.
         * <p>
         * @return {@code this}
         * @param ebsBlockDevice Additional EBS block devices to attach to the instance. This parameter is required.
         */
        public Builder ebsBlockDevice(final java.util.List<? extends java.lang.Object> ebsBlockDevice) {
            this.config().ebsBlockDevice(ebsBlockDevice);
            return this;
        }

        /**
         * If true, the launched EC2 instance will be EBS-optimized.
         * <p>
         * @return {@code this}
         * @param ebsOptimized If true, the launched EC2 instance will be EBS-optimized. This parameter is required.
         */
        public Builder ebsOptimized(final java.lang.Boolean ebsOptimized) {
            this.config().ebsOptimized(ebsOptimized);
            return this;
        }

        /**
         * Whether to enable volume tags (if enabled it conflicts with root_block_device tags) true.
         * <p>
         * @return {@code this}
         * @param enableVolumeTags Whether to enable volume tags (if enabled it conflicts with root_block_device tags) true. This parameter is required.
         */
        public Builder enableVolumeTags(final java.lang.Boolean enableVolumeTags) {
            this.config().enableVolumeTags(enableVolumeTags);
            return this;
        }

        /**
         * Whether Nitro Enclaves will be enabled on the instance.
         * <p>
         * Defaults to <code>false</code>
         * <p>
         * @return {@code this}
         * @param enclaveOptionsEnabled Whether Nitro Enclaves will be enabled on the instance. This parameter is required.
         */
        public Builder enclaveOptionsEnabled(final java.lang.Boolean enclaveOptionsEnabled) {
            this.config().enclaveOptionsEnabled(enclaveOptionsEnabled);
            return this;
        }

        /**
         * Customize Ephemeral (also known as Instance Store) volumes on the instance.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param ephemeralBlockDevice Customize Ephemeral (also known as Instance Store) volumes on the instance. This parameter is required.
         */
        public Builder ephemeralBlockDevice(final java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> ephemeralBlockDevice) {
            this.config().ephemeralBlockDevice(ephemeralBlockDevice);
            return this;
        }

        /**
         * If true, wait for password data to become available and retrieve it.
         * <p>
         * @return {@code this}
         * @param fetchPasswordData If true, wait for password data to become available and retrieve it. This parameter is required.
         */
        public Builder fetchPasswordData(final java.lang.Boolean fetchPasswordData) {
            this.config().fetchPasswordData(fetchPasswordData);
            return this;
        }

        /**
         * If true, the launched EC2 instance will support hibernation.
         * <p>
         * @return {@code this}
         * @param hibernation If true, the launched EC2 instance will support hibernation. This parameter is required.
         */
        public Builder hibernation(final java.lang.Boolean hibernation) {
            this.config().hibernation(hibernation);
            return this;
        }

        /**
         * ID of a dedicated host that the instance will be assigned to.
         * <p>
         * Use when an instance is to be launched on a specific dedicated host
         * <p>
         * @return {@code this}
         * @param hostId ID of a dedicated host that the instance will be assigned to. This parameter is required.
         */
        public Builder hostId(final java.lang.String hostId) {
            this.config().hostId(hostId);
            return this;
        }

        /**
         * IAM Instance Profile to launch the instance with.
         * <p>
         * Specified as the name of the Instance Profile
         * <p>
         * @return {@code this}
         * @param iamInstanceProfile IAM Instance Profile to launch the instance with. This parameter is required.
         */
        public Builder iamInstanceProfile(final java.lang.String iamInstanceProfile) {
            this.config().iamInstanceProfile(iamInstanceProfile);
            return this;
        }

        /**
         * Description of the role.
         * <p>
         * @return {@code this}
         * @param iamRoleDescription Description of the role. This parameter is required.
         */
        public Builder iamRoleDescription(final java.lang.String iamRoleDescription) {
            this.config().iamRoleDescription(iamRoleDescription);
            return this;
        }

        /**
         * Name to use on IAM role created.
         * <p>
         * @return {@code this}
         * @param iamRoleName Name to use on IAM role created. This parameter is required.
         */
        public Builder iamRoleName(final java.lang.String iamRoleName) {
            this.config().iamRoleName(iamRoleName);
            return this;
        }

        /**
         * IAM role path.
         * <p>
         * @return {@code this}
         * @param iamRolePath IAM role path. This parameter is required.
         */
        public Builder iamRolePath(final java.lang.String iamRolePath) {
            this.config().iamRolePath(iamRolePath);
            return this;
        }

        /**
         * ARN of the policy that is used to set the permissions boundary for the IAM role.
         * <p>
         * @return {@code this}
         * @param iamRolePermissionsBoundary ARN of the policy that is used to set the permissions boundary for the IAM role. This parameter is required.
         */
        public Builder iamRolePermissionsBoundary(final java.lang.String iamRolePermissionsBoundary) {
            this.config().iamRolePermissionsBoundary(iamRolePermissionsBoundary);
            return this;
        }

        /**
         * Policies attached to the IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param iamRolePolicies Policies attached to the IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder iamRolePolicies(final java.util.Map<java.lang.String, java.lang.String> iamRolePolicies) {
            this.config().iamRolePolicies(iamRolePolicies);
            return this;
        }

        /**
         * A map of additional tags to add to the IAM role/profile created The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param iamRoleTags A map of additional tags to add to the IAM role/profile created The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder iamRoleTags(final java.util.Map<java.lang.String, java.lang.String> iamRoleTags) {
            this.config().iamRoleTags(iamRoleTags);
            return this;
        }

        /**
         * Determines whether the IAM role name (<code>iam_role_name</code> or <code>name</code>) is used as a prefix true.
         * <p>
         * @return {@code this}
         * @param iamRoleUseNamePrefix Determines whether the IAM role name (<code>iam_role_name</code> or <code>name</code>) is used as a prefix true. This parameter is required.
         */
        public Builder iamRoleUseNamePrefix(final java.lang.Boolean iamRoleUseNamePrefix) {
            this.config().iamRoleUseNamePrefix(iamRoleUseNamePrefix);
            return this;
        }

        /**
         * Whether changes to the AMI ID changes should be ignored by Terraform.
         * <p>
         * Note - changing this value will result in the replacement of the instance
         * <p>
         * @return {@code this}
         * @param ignoreAmiChanges Whether changes to the AMI ID changes should be ignored by Terraform. This parameter is required.
         */
        public Builder ignoreAmiChanges(final java.lang.Boolean ignoreAmiChanges) {
            this.config().ignoreAmiChanges(ignoreAmiChanges);
            return this;
        }

        /**
         * Shutdown behavior for the instance.
         * <p>
         * Amazon defaults this to stop for EBS-backed instances and terminate for instance-store instances. Cannot be set on instance-store instance
         * <p>
         * @return {@code this}
         * @param instanceInitiatedShutdownBehavior Shutdown behavior for the instance. This parameter is required.
         */
        public Builder instanceInitiatedShutdownBehavior(final java.lang.String instanceInitiatedShutdownBehavior) {
            this.config().instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
            return this;
        }

        /**
         * Additional tags for the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param instanceTags Additional tags for the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder instanceTags(final java.util.Map<java.lang.String, java.lang.String> instanceTags) {
            this.config().instanceTags(instanceTags);
            return this;
        }

        /**
         * The type of instance to start t3.micro.
         * <p>
         * @return {@code this}
         * @param instanceType The type of instance to start t3.micro. This parameter is required.
         */
        public Builder instanceType(final java.lang.String instanceType) {
            this.config().instanceType(instanceType);
            return this;
        }

        /**
         * A number of IPv6 addresses to associate with the primary network interface.
         * <p>
         * Amazon EC2 chooses the IPv6 addresses from the range of your subnet
         * <p>
         * @return {@code this}
         * @param ipv6AddressCount A number of IPv6 addresses to associate with the primary network interface. This parameter is required.
         */
        public Builder ipv6AddressCount(final java.lang.Number ipv6AddressCount) {
            this.config().ipv6AddressCount(ipv6AddressCount);
            return this;
        }

        /**
         * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface.
         * <p>
         * @return {@code this}
         * @param ipv6Addresses Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface. This parameter is required.
         */
        public Builder ipv6Addresses(final java.util.List<java.lang.String> ipv6Addresses) {
            this.config().ipv6Addresses(ipv6Addresses);
            return this;
        }

        /**
         * Key name of the Key Pair to use for the instance;
         * <p>
         * which can be managed using the <code>aws_key_pair</code> resource
         * <p>
         * @return {@code this}
         * @param keyName Key name of the Key Pair to use for the instance;. This parameter is required.
         */
        public Builder keyName(final java.lang.String keyName) {
            this.config().keyName(keyName);
            return this;
        }

        /**
         * Specifies a Launch Template to configure the instance.
         * <p>
         * Parameters configured on this resource will override the corresponding parameters in the Launch Template
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param launchTemplate Specifies a Launch Template to configure the instance. This parameter is required.
         */
        public Builder launchTemplate(final java.util.Map<java.lang.String, java.lang.String> launchTemplate) {
            this.config().launchTemplate(launchTemplate);
            return this;
        }

        /**
         * The maintenance options for the instance.
         * <p>
         * @return {@code this}
         * @param maintenanceOptions The maintenance options for the instance. This parameter is required.
         */
        public Builder maintenanceOptions(final java.lang.Object maintenanceOptions) {
            this.config().maintenanceOptions(maintenanceOptions);
            return this;
        }

        /**
         * Customize the metadata options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param metadataOptions Customize the metadata options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder metadataOptions(final java.util.Map<java.lang.String, java.lang.String> metadataOptions) {
            this.config().metadataOptions(metadataOptions);
            return this;
        }

        /**
         * If true, the launched EC2 instance will have detailed monitoring enabled.
         * <p>
         * @return {@code this}
         * @param monitoring If true, the launched EC2 instance will have detailed monitoring enabled. This parameter is required.
         */
        public Builder monitoring(final java.lang.Boolean monitoring) {
            this.config().monitoring(monitoring);
            return this;
        }

        /**
         * Name to be used on EC2 instance created.
         * <p>
         * @return {@code this}
         * @param name Name to be used on EC2 instance created. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config().name(name);
            return this;
        }

        /**
         * Customize network interfaces to be attached at instance boot time.
         * <p>
         * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * <p>
         * @return {@code this}
         * @param networkInterface Customize network interfaces to be attached at instance boot time. This parameter is required.
         */
        public Builder networkInterface(final java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> networkInterface) {
            this.config().networkInterface(networkInterface);
            return this;
        }

        /**
         * The Placement Group to start the instance in.
         * <p>
         * @return {@code this}
         * @param placementGroup The Placement Group to start the instance in. This parameter is required.
         */
        public Builder placementGroup(final java.lang.String placementGroup) {
            this.config().placementGroup(placementGroup);
            return this;
        }

        /**
         * Customize the private DNS name options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param privateDnsNameOptions Customize the private DNS name options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder privateDnsNameOptions(final java.util.Map<java.lang.String, java.lang.String> privateDnsNameOptions) {
            this.config().privateDnsNameOptions(privateDnsNameOptions);
            return this;
        }

        /**
         * Private IP address to associate with the instance in a VPC.
         * <p>
         * @return {@code this}
         * @param privateIp Private IP address to associate with the instance in a VPC. This parameter is required.
         */
        public Builder privateIp(final java.lang.String privateIp) {
            this.config().privateIp(privateIp);
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
         * Customize details about the root block device of the instance.
         * <p>
         * See Block Devices below for details
         * <p>
         * @return {@code this}
         * @param rootBlockDevice Customize details about the root block device of the instance. This parameter is required.
         */
        public Builder rootBlockDevice(final java.util.List<? extends java.lang.Object> rootBlockDevice) {
            this.config().rootBlockDevice(rootBlockDevice);
            return this;
        }

        /**
         * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC.
         * <p>
         * Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a <code>network_interface block</code>
         * <p>
         * @return {@code this}
         * @param secondaryPrivateIps A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC. This parameter is required.
         */
        public Builder secondaryPrivateIps(final java.util.List<java.lang.String> secondaryPrivateIps) {
            this.config().secondaryPrivateIps(secondaryPrivateIps);
            return this;
        }

        /**
         * Controls if traffic is routed to the instance when the destination address does not match the instance.
         * <p>
         * Used for NAT or VPNs
         * <p>
         * @return {@code this}
         * @param sourceDestCheck Controls if traffic is routed to the instance when the destination address does not match the instance. This parameter is required.
         */
        public Builder sourceDestCheck(final java.lang.Boolean sourceDestCheck) {
            this.config().sourceDestCheck(sourceDestCheck);
            return this;
        }

        /**
         * The required duration for the Spot instances, in minutes.
         * <p>
         * This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360)
         * <p>
         * @return {@code this}
         * @param spotBlockDurationMinutes The required duration for the Spot instances, in minutes. This parameter is required.
         */
        public Builder spotBlockDurationMinutes(final java.lang.Number spotBlockDurationMinutes) {
            this.config().spotBlockDurationMinutes(spotBlockDurationMinutes);
            return this;
        }

        /**
         * Indicates Spot instance behavior when it is interrupted.
         * <p>
         * Valid values are <code>terminate</code>, <code>stop</code>, or <code>hibernate</code>
         * <p>
         * @return {@code this}
         * @param spotInstanceInterruptionBehavior Indicates Spot instance behavior when it is interrupted. This parameter is required.
         */
        public Builder spotInstanceInterruptionBehavior(final java.lang.String spotInstanceInterruptionBehavior) {
            this.config().spotInstanceInterruptionBehavior(spotInstanceInterruptionBehavior);
            return this;
        }

        /**
         * A launch group is a group of spot instances that launch together and terminate together.
         * <p>
         * If left empty instances are launched and terminated individually
         * <p>
         * @return {@code this}
         * @param spotLaunchGroup A launch group is a group of spot instances that launch together and terminate together. This parameter is required.
         */
        public Builder spotLaunchGroup(final java.lang.String spotLaunchGroup) {
            this.config().spotLaunchGroup(spotLaunchGroup);
            return this;
        }

        /**
         * The maximum price to request on the spot market.
         * <p>
         * Defaults to on-demand price
         * <p>
         * @return {@code this}
         * @param spotPrice The maximum price to request on the spot market. This parameter is required.
         */
        public Builder spotPrice(final java.lang.String spotPrice) {
            this.config().spotPrice(spotPrice);
            return this;
        }

        /**
         * If set to one-time, after the instance is terminated, the spot request will be closed.
         * <p>
         * Default <code>persistent</code>
         * <p>
         * @return {@code this}
         * @param spotType If set to one-time, after the instance is terminated, the spot request will be closed. This parameter is required.
         */
        public Builder spotType(final java.lang.String spotType) {
            this.config().spotType(spotType);
            return this;
        }

        /**
         * The start date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * <p>
         * @return {@code this}
         * @param spotValidFrom The start date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ). This parameter is required.
         */
        public Builder spotValidFrom(final java.lang.String spotValidFrom) {
            this.config().spotValidFrom(spotValidFrom);
            return this;
        }

        /**
         * The end date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * <p>
         * @return {@code this}
         * @param spotValidUntil The end date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ). This parameter is required.
         */
        public Builder spotValidUntil(final java.lang.String spotValidUntil) {
            this.config().spotValidUntil(spotValidUntil);
            return this;
        }

        /**
         * If set, Terraform will wait for the Spot Request to be fulfilled, and will throw an error if the timeout of 10m is reached.
         * <p>
         * @return {@code this}
         * @param spotWaitForFulfillment If set, Terraform will wait for the Spot Request to be fulfilled, and will throw an error if the timeout of 10m is reached. This parameter is required.
         */
        public Builder spotWaitForFulfillment(final java.lang.Boolean spotWaitForFulfillment) {
            this.config().spotWaitForFulfillment(spotWaitForFulfillment);
            return this;
        }

        /**
         * The VPC Subnet ID to launch in.
         * <p>
         * @return {@code this}
         * @param subnetId The VPC Subnet ID to launch in. This parameter is required.
         */
        public Builder subnetId(final java.lang.String subnetId) {
            this.config().subnetId(subnetId);
            return this;
        }

        /**
         * A mapping of tags to assign to the resource The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param tags A mapping of tags to assign to the resource The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * The tenancy of the instance (if the instance is running in a VPC).
         * <p>
         * Available values: default, dedicated, host
         * <p>
         * @return {@code this}
         * @param tenancy The tenancy of the instance (if the instance is running in a VPC). This parameter is required.
         */
        public Builder tenancy(final java.lang.String tenancy) {
            this.config().tenancy(tenancy);
            return this;
        }

        /**
         * Define maximum timeout for creating, updating, and deleting EC2 instance resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param timeouts Define maximum timeout for creating, updating, and deleting EC2 instance resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder timeouts(final java.util.Map<java.lang.String, java.lang.String> timeouts) {
            this.config().timeouts(timeouts);
            return this;
        }

        /**
         * The user data to provide when launching the instance.
         * <p>
         * Do not pass gzip-compressed data via this argument; see user_data_base64 instead
         * <p>
         * @return {@code this}
         * @param userData The user data to provide when launching the instance. This parameter is required.
         */
        public Builder userData(final java.lang.String userData) {
            this.config().userData(userData);
            return this;
        }

        /**
         * Can be used instead of user_data to pass base64-encoded binary data directly.
         * <p>
         * Use this instead of user_data whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption
         * <p>
         * @return {@code this}
         * @param userDataBase64 Can be used instead of user_data to pass base64-encoded binary data directly. This parameter is required.
         */
        public Builder userDataBase64(final java.lang.String userDataBase64) {
            this.config().userDataBase64(userDataBase64);
            return this;
        }

        /**
         * When used in combination with user_data or user_data_base64 will trigger a destroy and recreate when set to true.
         * <p>
         * Defaults to false if not set
         * <p>
         * @return {@code this}
         * @param userDataReplaceOnChange When used in combination with user_data or user_data_base64 will trigger a destroy and recreate when set to true. This parameter is required.
         */
        public Builder userDataReplaceOnChange(final java.lang.Boolean userDataReplaceOnChange) {
            this.config().userDataReplaceOnChange(userDataReplaceOnChange);
            return this;
        }

        /**
         * A mapping of tags to assign to the devices created by the instance at launch time The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param volumeTags A mapping of tags to assign to the devices created by the instance at launch time The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder volumeTags(final java.util.Map<java.lang.String, java.lang.String> volumeTags) {
            this.config().volumeTags(volumeTags);
            return this;
        }

        /**
         * A list of security group IDs to associate with.
         * <p>
         * @return {@code this}
         * @param vpcSecurityGroupIds A list of security group IDs to associate with. This parameter is required.
         */
        public Builder vpcSecurityGroupIds(final java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.config().vpcSecurityGroupIds(vpcSecurityGroupIds);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.ec2_instance.Ec2Instance}.
         */
        @Override
        public imports.ec2_instance.Ec2Instance build() {
            return new imports.ec2_instance.Ec2Instance(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.ec2_instance.Ec2InstanceConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.ec2_instance.Ec2InstanceConfig.Builder();
            }
            return this.config;
        }
    }
}
