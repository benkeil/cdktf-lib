package imports.ec2_instance;

@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:43:29.782Z")
@software.amazon.jsii.Jsii(module = imports.ec2_instance.$Module.class, fqn = "ec2-instance.Ec2InstanceConfig")
@software.amazon.jsii.Jsii.Proxy(Ec2InstanceConfig.Jsii$Proxy.class)
public interface Ec2InstanceConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserConfig {

    /**
     * ID of AMI to use for the instance.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAmi() {
        return null;
    }

    /**
     * SSM parameter name for the AMI ID.
     * <p>
     * For Amazon Linux AMI SSM parameters see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-public-parameters-ami.html">reference</a>
     * /aws/service/ami-amazon-linux-latest/amzn2-ami-hvm-x86_64-gp2
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAmiSsmParameter() {
        return null;
    }

    /**
     * Whether to associate a public IP address with an instance in a VPC.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAssociatePublicIpAddress() {
        return null;
    }

    /**
     * AZ to start the instance in.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAvailabilityZone() {
        return null;
    }

    /**
     * Describes an instance's Capacity Reservation targeting option.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCapacityReservationSpecification() {
        return null;
    }

    /**
     * Sets the number of CPU cores for an instance.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCpuCoreCount() {
        return null;
    }

    /**
     * The credit option for CPU usage (unlimited or standard).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCpuCredits() {
        return null;
    }

    /**
     * Defines CPU options to apply to the instance at launch time.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCpuOptions() {
        return null;
    }

    /**
     * Sets the number of CPU threads per core for an instance (has no effect unless cpu_core_count is also set).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCpuThreadsPerCore() {
        return null;
    }

    /**
     * Whether to create an instance true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return null;
    }

    /**
     * Determines whether an IAM instance profile is created or to use an existing IAM instance profile.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateIamInstanceProfile() {
        return null;
    }

    /**
     * Depicts if the instance is a spot instance.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSpotInstance() {
        return null;
    }

    /**
     * If true, enables EC2 Instance Stop Protection.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableApiStop() {
        return null;
    }

    /**
     * If true, enables EC2 Instance Termination Protection.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDisableApiTermination() {
        return null;
    }

    /**
     * Additional EBS block devices to attach to the instance.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.Object> getEbsBlockDevice() {
        return null;
    }

    /**
     * If true, the launched EC2 instance will be EBS-optimized.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEbsOptimized() {
        return null;
    }

    /**
     * Whether to enable volume tags (if enabled it conflicts with root_block_device tags) true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableVolumeTags() {
        return null;
    }

    /**
     * Whether Nitro Enclaves will be enabled on the instance.
     * <p>
     * Defaults to <code>false</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnclaveOptionsEnabled() {
        return null;
    }

    /**
     * Customize Ephemeral (also known as Instance Store) volumes on the instance.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.util.Map<java.lang.String, java.lang.String>> getEphemeralBlockDevice() {
        return null;
    }

    /**
     * If true, wait for password data to become available and retrieve it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getFetchPasswordData() {
        return null;
    }

    /**
     * If true, the launched EC2 instance will support hibernation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHibernation() {
        return null;
    }

    /**
     * ID of a dedicated host that the instance will be assigned to.
     * <p>
     * Use when an instance is to be launched on a specific dedicated host
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostId() {
        return null;
    }

    /**
     * IAM Instance Profile to launch the instance with.
     * <p>
     * Specified as the name of the Instance Profile
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIamInstanceProfile() {
        return null;
    }

    /**
     * Description of the role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIamRoleDescription() {
        return null;
    }

    /**
     * Name to use on IAM role created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIamRoleName() {
        return null;
    }

    /**
     * IAM role path.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIamRolePath() {
        return null;
    }

    /**
     * ARN of the policy that is used to set the permissions boundary for the IAM role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIamRolePermissionsBoundary() {
        return null;
    }

    /**
     * Policies attached to the IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getIamRolePolicies() {
        return null;
    }

    /**
     * A map of additional tags to add to the IAM role/profile created The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getIamRoleTags() {
        return null;
    }

    /**
     * Determines whether the IAM role name (<code>iam_role_name</code> or <code>name</code>) is used as a prefix true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIamRoleUseNamePrefix() {
        return null;
    }

    /**
     * Whether changes to the AMI ID changes should be ignored by Terraform.
     * <p>
     * Note - changing this value will result in the replacement of the instance
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreAmiChanges() {
        return null;
    }

    /**
     * Shutdown behavior for the instance.
     * <p>
     * Amazon defaults this to stop for EBS-backed instances and terminate for instance-store instances. Cannot be set on instance-store instance
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceInitiatedShutdownBehavior() {
        return null;
    }

    /**
     * Additional tags for the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getInstanceTags() {
        return null;
    }

    /**
     * The type of instance to start t3.micro.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceType() {
        return null;
    }

    /**
     * A number of IPv6 addresses to associate with the primary network interface.
     * <p>
     * Amazon EC2 chooses the IPv6 addresses from the range of your subnet
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getIpv6AddressCount() {
        return null;
    }

    /**
     * Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpv6Addresses() {
        return null;
    }

    /**
     * Key name of the Key Pair to use for the instance;
     * <p>
     * which can be managed using the <code>aws_key_pair</code> resource
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKeyName() {
        return null;
    }

    /**
     * Specifies a Launch Template to configure the instance.
     * <p>
     * Parameters configured on this resource will override the corresponding parameters in the Launch Template
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLaunchTemplate() {
        return null;
    }

    /**
     * The maintenance options for the instance.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMaintenanceOptions() {
        return null;
    }

    /**
     * Customize the metadata options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMetadataOptions() {
        return null;
    }

    /**
     * If true, the launched EC2 instance will have detailed monitoring enabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getMonitoring() {
        return null;
    }

    /**
     * Name to be used on EC2 instance created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Customize network interfaces to be attached at instance boot time.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.util.Map<java.lang.String, java.lang.String>> getNetworkInterface() {
        return null;
    }

    /**
     * The Placement Group to start the instance in.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPlacementGroup() {
        return null;
    }

    /**
     * Customize the private DNS name options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getPrivateDnsNameOptions() {
        return null;
    }

    /**
     * Private IP address to associate with the instance in a VPC.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPrivateIp() {
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
     * Customize details about the root block device of the instance.
     * <p>
     * See Block Devices below for details
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.Object> getRootBlockDevice() {
        return null;
    }

    /**
     * A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC.
     * <p>
     * Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a <code>network_interface block</code>
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecondaryPrivateIps() {
        return null;
    }

    /**
     * Controls if traffic is routed to the instance when the destination address does not match the instance.
     * <p>
     * Used for NAT or VPNs
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSourceDestCheck() {
        return null;
    }

    /**
     * The required duration for the Spot instances, in minutes.
     * <p>
     * This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360)
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSpotBlockDurationMinutes() {
        return null;
    }

    /**
     * Indicates Spot instance behavior when it is interrupted.
     * <p>
     * Valid values are <code>terminate</code>, <code>stop</code>, or <code>hibernate</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSpotInstanceInterruptionBehavior() {
        return null;
    }

    /**
     * A launch group is a group of spot instances that launch together and terminate together.
     * <p>
     * If left empty instances are launched and terminated individually
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSpotLaunchGroup() {
        return null;
    }

    /**
     * The maximum price to request on the spot market.
     * <p>
     * Defaults to on-demand price
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSpotPrice() {
        return null;
    }

    /**
     * If set to one-time, after the instance is terminated, the spot request will be closed.
     * <p>
     * Default <code>persistent</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSpotType() {
        return null;
    }

    /**
     * The start date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSpotValidFrom() {
        return null;
    }

    /**
     * The end date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSpotValidUntil() {
        return null;
    }

    /**
     * If set, Terraform will wait for the Spot Request to be fulfilled, and will throw an error if the timeout of 10m is reached.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSpotWaitForFulfillment() {
        return null;
    }

    /**
     * The VPC Subnet ID to launch in.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubnetId() {
        return null;
    }

    /**
     * A mapping of tags to assign to the resource The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * The tenancy of the instance (if the instance is running in a VPC).
     * <p>
     * Available values: default, dedicated, host
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTenancy() {
        return null;
    }

    /**
     * Define maximum timeout for creating, updating, and deleting EC2 instance resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTimeouts() {
        return null;
    }

    /**
     * The user data to provide when launching the instance.
     * <p>
     * Do not pass gzip-compressed data via this argument; see user_data_base64 instead
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUserData() {
        return null;
    }

    /**
     * Can be used instead of user_data to pass base64-encoded binary data directly.
     * <p>
     * Use this instead of user_data whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUserDataBase64() {
        return null;
    }

    /**
     * When used in combination with user_data or user_data_base64 will trigger a destroy and recreate when set to true.
     * <p>
     * Defaults to false if not set
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUserDataReplaceOnChange() {
        return null;
    }

    /**
     * A mapping of tags to assign to the devices created by the instance at launch time The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getVolumeTags() {
        return null;
    }

    /**
     * A list of security group IDs to associate with.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2InstanceConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2InstanceConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2InstanceConfig> {
        java.lang.String ami;
        java.lang.String amiSsmParameter;
        java.lang.Boolean associatePublicIpAddress;
        java.lang.String availabilityZone;
        java.lang.Object capacityReservationSpecification;
        java.lang.Number cpuCoreCount;
        java.lang.String cpuCredits;
        java.lang.Object cpuOptions;
        java.lang.Number cpuThreadsPerCore;
        java.lang.Boolean create;
        java.lang.Boolean createIamInstanceProfile;
        java.lang.Boolean createSpotInstance;
        java.lang.Boolean disableApiStop;
        java.lang.Boolean disableApiTermination;
        java.util.List<java.lang.Object> ebsBlockDevice;
        java.lang.Boolean ebsOptimized;
        java.lang.Boolean enableVolumeTags;
        java.lang.Boolean enclaveOptionsEnabled;
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> ephemeralBlockDevice;
        java.lang.Boolean fetchPasswordData;
        java.lang.Boolean hibernation;
        java.lang.String hostId;
        java.lang.String iamInstanceProfile;
        java.lang.String iamRoleDescription;
        java.lang.String iamRoleName;
        java.lang.String iamRolePath;
        java.lang.String iamRolePermissionsBoundary;
        java.util.Map<java.lang.String, java.lang.String> iamRolePolicies;
        java.util.Map<java.lang.String, java.lang.String> iamRoleTags;
        java.lang.Boolean iamRoleUseNamePrefix;
        java.lang.Boolean ignoreAmiChanges;
        java.lang.String instanceInitiatedShutdownBehavior;
        java.util.Map<java.lang.String, java.lang.String> instanceTags;
        java.lang.String instanceType;
        java.lang.Number ipv6AddressCount;
        java.util.List<java.lang.String> ipv6Addresses;
        java.lang.String keyName;
        java.util.Map<java.lang.String, java.lang.String> launchTemplate;
        java.lang.Object maintenanceOptions;
        java.util.Map<java.lang.String, java.lang.String> metadataOptions;
        java.lang.Boolean monitoring;
        java.lang.String name;
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> networkInterface;
        java.lang.String placementGroup;
        java.util.Map<java.lang.String, java.lang.String> privateDnsNameOptions;
        java.lang.String privateIp;
        java.lang.Boolean putinKhuylo;
        java.util.List<java.lang.Object> rootBlockDevice;
        java.util.List<java.lang.String> secondaryPrivateIps;
        java.lang.Boolean sourceDestCheck;
        java.lang.Number spotBlockDurationMinutes;
        java.lang.String spotInstanceInterruptionBehavior;
        java.lang.String spotLaunchGroup;
        java.lang.String spotPrice;
        java.lang.String spotType;
        java.lang.String spotValidFrom;
        java.lang.String spotValidUntil;
        java.lang.Boolean spotWaitForFulfillment;
        java.lang.String subnetId;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.lang.String tenancy;
        java.util.Map<java.lang.String, java.lang.String> timeouts;
        java.lang.String userData;
        java.lang.String userDataBase64;
        java.lang.Boolean userDataReplaceOnChange;
        java.util.Map<java.lang.String, java.lang.String> volumeTags;
        java.util.List<java.lang.String> vpcSecurityGroupIds;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link Ec2InstanceConfig#getAmi}
         * @param ami ID of AMI to use for the instance.
         * @return {@code this}
         */
        public Builder ami(java.lang.String ami) {
            this.ami = ami;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getAmiSsmParameter}
         * @param amiSsmParameter SSM parameter name for the AMI ID.
         *                        For Amazon Linux AMI SSM parameters see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-public-parameters-ami.html">reference</a>
         *                        /aws/service/ami-amazon-linux-latest/amzn2-ami-hvm-x86_64-gp2
         * @return {@code this}
         */
        public Builder amiSsmParameter(java.lang.String amiSsmParameter) {
            this.amiSsmParameter = amiSsmParameter;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getAssociatePublicIpAddress}
         * @param associatePublicIpAddress Whether to associate a public IP address with an instance in a VPC.
         * @return {@code this}
         */
        public Builder associatePublicIpAddress(java.lang.Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getAvailabilityZone}
         * @param availabilityZone AZ to start the instance in.
         * @return {@code this}
         */
        public Builder availabilityZone(java.lang.String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCapacityReservationSpecification}
         * @param capacityReservationSpecification Describes an instance's Capacity Reservation targeting option.
         * @return {@code this}
         */
        public Builder capacityReservationSpecification(java.lang.Object capacityReservationSpecification) {
            this.capacityReservationSpecification = capacityReservationSpecification;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCpuCoreCount}
         * @param cpuCoreCount Sets the number of CPU cores for an instance.
         * @return {@code this}
         */
        public Builder cpuCoreCount(java.lang.Number cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCpuCredits}
         * @param cpuCredits The credit option for CPU usage (unlimited or standard).
         * @return {@code this}
         */
        public Builder cpuCredits(java.lang.String cpuCredits) {
            this.cpuCredits = cpuCredits;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCpuOptions}
         * @param cpuOptions Defines CPU options to apply to the instance at launch time.
         * @return {@code this}
         */
        public Builder cpuOptions(java.lang.Object cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCpuThreadsPerCore}
         * @param cpuThreadsPerCore Sets the number of CPU threads per core for an instance (has no effect unless cpu_core_count is also set).
         * @return {@code this}
         */
        public Builder cpuThreadsPerCore(java.lang.Number cpuThreadsPerCore) {
            this.cpuThreadsPerCore = cpuThreadsPerCore;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCreate}
         * @param create Whether to create an instance true.
         * @return {@code this}
         */
        public Builder create(java.lang.Boolean create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCreateIamInstanceProfile}
         * @param createIamInstanceProfile Determines whether an IAM instance profile is created or to use an existing IAM instance profile.
         * @return {@code this}
         */
        public Builder createIamInstanceProfile(java.lang.Boolean createIamInstanceProfile) {
            this.createIamInstanceProfile = createIamInstanceProfile;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getCreateSpotInstance}
         * @param createSpotInstance Depicts if the instance is a spot instance.
         * @return {@code this}
         */
        public Builder createSpotInstance(java.lang.Boolean createSpotInstance) {
            this.createSpotInstance = createSpotInstance;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getDisableApiStop}
         * @param disableApiStop If true, enables EC2 Instance Stop Protection.
         * @return {@code this}
         */
        public Builder disableApiStop(java.lang.Boolean disableApiStop) {
            this.disableApiStop = disableApiStop;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getDisableApiTermination}
         * @param disableApiTermination If true, enables EC2 Instance Termination Protection.
         * @return {@code this}
         */
        public Builder disableApiTermination(java.lang.Boolean disableApiTermination) {
            this.disableApiTermination = disableApiTermination;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getEbsBlockDevice}
         * @param ebsBlockDevice Additional EBS block devices to attach to the instance.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ebsBlockDevice(java.util.List<? extends java.lang.Object> ebsBlockDevice) {
            this.ebsBlockDevice = (java.util.List<java.lang.Object>)ebsBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getEbsOptimized}
         * @param ebsOptimized If true, the launched EC2 instance will be EBS-optimized.
         * @return {@code this}
         */
        public Builder ebsOptimized(java.lang.Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getEnableVolumeTags}
         * @param enableVolumeTags Whether to enable volume tags (if enabled it conflicts with root_block_device tags) true.
         * @return {@code this}
         */
        public Builder enableVolumeTags(java.lang.Boolean enableVolumeTags) {
            this.enableVolumeTags = enableVolumeTags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getEnclaveOptionsEnabled}
         * @param enclaveOptionsEnabled Whether Nitro Enclaves will be enabled on the instance.
         *                              Defaults to <code>false</code>
         * @return {@code this}
         */
        public Builder enclaveOptionsEnabled(java.lang.Boolean enclaveOptionsEnabled) {
            this.enclaveOptionsEnabled = enclaveOptionsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getEphemeralBlockDevice}
         * @param ephemeralBlockDevice Customize Ephemeral (also known as Instance Store) volumes on the instance.
         *                             The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ephemeralBlockDevice(java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> ephemeralBlockDevice) {
            this.ephemeralBlockDevice = (java.util.List<java.util.Map<java.lang.String, java.lang.String>>)ephemeralBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getFetchPasswordData}
         * @param fetchPasswordData If true, wait for password data to become available and retrieve it.
         * @return {@code this}
         */
        public Builder fetchPasswordData(java.lang.Boolean fetchPasswordData) {
            this.fetchPasswordData = fetchPasswordData;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getHibernation}
         * @param hibernation If true, the launched EC2 instance will support hibernation.
         * @return {@code this}
         */
        public Builder hibernation(java.lang.Boolean hibernation) {
            this.hibernation = hibernation;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getHostId}
         * @param hostId ID of a dedicated host that the instance will be assigned to.
         *               Use when an instance is to be launched on a specific dedicated host
         * @return {@code this}
         */
        public Builder hostId(java.lang.String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamInstanceProfile}
         * @param iamInstanceProfile IAM Instance Profile to launch the instance with.
         *                           Specified as the name of the Instance Profile
         * @return {@code this}
         */
        public Builder iamInstanceProfile(java.lang.String iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamRoleDescription}
         * @param iamRoleDescription Description of the role.
         * @return {@code this}
         */
        public Builder iamRoleDescription(java.lang.String iamRoleDescription) {
            this.iamRoleDescription = iamRoleDescription;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamRoleName}
         * @param iamRoleName Name to use on IAM role created.
         * @return {@code this}
         */
        public Builder iamRoleName(java.lang.String iamRoleName) {
            this.iamRoleName = iamRoleName;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamRolePath}
         * @param iamRolePath IAM role path.
         * @return {@code this}
         */
        public Builder iamRolePath(java.lang.String iamRolePath) {
            this.iamRolePath = iamRolePath;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamRolePermissionsBoundary}
         * @param iamRolePermissionsBoundary ARN of the policy that is used to set the permissions boundary for the IAM role.
         * @return {@code this}
         */
        public Builder iamRolePermissionsBoundary(java.lang.String iamRolePermissionsBoundary) {
            this.iamRolePermissionsBoundary = iamRolePermissionsBoundary;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamRolePolicies}
         * @param iamRolePolicies Policies attached to the IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder iamRolePolicies(java.util.Map<java.lang.String, java.lang.String> iamRolePolicies) {
            this.iamRolePolicies = iamRolePolicies;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamRoleTags}
         * @param iamRoleTags A map of additional tags to add to the IAM role/profile created The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder iamRoleTags(java.util.Map<java.lang.String, java.lang.String> iamRoleTags) {
            this.iamRoleTags = iamRoleTags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIamRoleUseNamePrefix}
         * @param iamRoleUseNamePrefix Determines whether the IAM role name (<code>iam_role_name</code> or <code>name</code>) is used as a prefix true.
         * @return {@code this}
         */
        public Builder iamRoleUseNamePrefix(java.lang.Boolean iamRoleUseNamePrefix) {
            this.iamRoleUseNamePrefix = iamRoleUseNamePrefix;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIgnoreAmiChanges}
         * @param ignoreAmiChanges Whether changes to the AMI ID changes should be ignored by Terraform.
         *                         Note - changing this value will result in the replacement of the instance
         * @return {@code this}
         */
        public Builder ignoreAmiChanges(java.lang.Boolean ignoreAmiChanges) {
            this.ignoreAmiChanges = ignoreAmiChanges;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getInstanceInitiatedShutdownBehavior}
         * @param instanceInitiatedShutdownBehavior Shutdown behavior for the instance.
         *                                          Amazon defaults this to stop for EBS-backed instances and terminate for instance-store instances. Cannot be set on instance-store instance
         * @return {@code this}
         */
        public Builder instanceInitiatedShutdownBehavior(java.lang.String instanceInitiatedShutdownBehavior) {
            this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getInstanceTags}
         * @param instanceTags Additional tags for the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder instanceTags(java.util.Map<java.lang.String, java.lang.String> instanceTags) {
            this.instanceTags = instanceTags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getInstanceType}
         * @param instanceType The type of instance to start t3.micro.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIpv6AddressCount}
         * @param ipv6AddressCount A number of IPv6 addresses to associate with the primary network interface.
         *                         Amazon EC2 chooses the IPv6 addresses from the range of your subnet
         * @return {@code this}
         */
        public Builder ipv6AddressCount(java.lang.Number ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getIpv6Addresses}
         * @param ipv6Addresses Specify one or more IPv6 addresses from the range of the subnet to associate with the primary network interface.
         * @return {@code this}
         */
        public Builder ipv6Addresses(java.util.List<java.lang.String> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getKeyName}
         * @param keyName Key name of the Key Pair to use for the instance;.
         *                which can be managed using the <code>aws_key_pair</code> resource
         * @return {@code this}
         */
        public Builder keyName(java.lang.String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getLaunchTemplate}
         * @param launchTemplate Specifies a Launch Template to configure the instance.
         *                       Parameters configured on this resource will override the corresponding parameters in the Launch Template
         *                       The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder launchTemplate(java.util.Map<java.lang.String, java.lang.String> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getMaintenanceOptions}
         * @param maintenanceOptions The maintenance options for the instance.
         * @return {@code this}
         */
        public Builder maintenanceOptions(java.lang.Object maintenanceOptions) {
            this.maintenanceOptions = maintenanceOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getMetadataOptions}
         * @param metadataOptions Customize the metadata options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder metadataOptions(java.util.Map<java.lang.String, java.lang.String> metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getMonitoring}
         * @param monitoring If true, the launched EC2 instance will have detailed monitoring enabled.
         * @return {@code this}
         */
        public Builder monitoring(java.lang.Boolean monitoring) {
            this.monitoring = monitoring;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getName}
         * @param name Name to be used on EC2 instance created.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getNetworkInterface}
         * @param networkInterface Customize network interfaces to be attached at instance boot time.
         *                         The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder networkInterface(java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> networkInterface) {
            this.networkInterface = (java.util.List<java.util.Map<java.lang.String, java.lang.String>>)networkInterface;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getPlacementGroup}
         * @param placementGroup The Placement Group to start the instance in.
         * @return {@code this}
         */
        public Builder placementGroup(java.lang.String placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getPrivateDnsNameOptions}
         * @param privateDnsNameOptions Customize the private DNS name options of the instance The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder privateDnsNameOptions(java.util.Map<java.lang.String, java.lang.String> privateDnsNameOptions) {
            this.privateDnsNameOptions = privateDnsNameOptions;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getPrivateIp}
         * @param privateIp Private IP address to associate with the instance in a VPC.
         * @return {@code this}
         */
        public Builder privateIp(java.lang.String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getPutinKhuylo}
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
         * Sets the value of {@link Ec2InstanceConfig#getRootBlockDevice}
         * @param rootBlockDevice Customize details about the root block device of the instance.
         *                        See Block Devices below for details
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rootBlockDevice(java.util.List<? extends java.lang.Object> rootBlockDevice) {
            this.rootBlockDevice = (java.util.List<java.lang.Object>)rootBlockDevice;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSecondaryPrivateIps}
         * @param secondaryPrivateIps A list of secondary private IPv4 addresses to assign to the instance's primary network interface (eth0) in a VPC.
         *                            Can only be assigned to the primary network interface (eth0) attached at instance creation, not a pre-existing network interface i.e. referenced in a <code>network_interface block</code>
         * @return {@code this}
         */
        public Builder secondaryPrivateIps(java.util.List<java.lang.String> secondaryPrivateIps) {
            this.secondaryPrivateIps = secondaryPrivateIps;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSourceDestCheck}
         * @param sourceDestCheck Controls if traffic is routed to the instance when the destination address does not match the instance.
         *                        Used for NAT or VPNs
         * @return {@code this}
         */
        public Builder sourceDestCheck(java.lang.Boolean sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotBlockDurationMinutes}
         * @param spotBlockDurationMinutes The required duration for the Spot instances, in minutes.
         *                                 This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360)
         * @return {@code this}
         */
        public Builder spotBlockDurationMinutes(java.lang.Number spotBlockDurationMinutes) {
            this.spotBlockDurationMinutes = spotBlockDurationMinutes;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotInstanceInterruptionBehavior}
         * @param spotInstanceInterruptionBehavior Indicates Spot instance behavior when it is interrupted.
         *                                         Valid values are <code>terminate</code>, <code>stop</code>, or <code>hibernate</code>
         * @return {@code this}
         */
        public Builder spotInstanceInterruptionBehavior(java.lang.String spotInstanceInterruptionBehavior) {
            this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotLaunchGroup}
         * @param spotLaunchGroup A launch group is a group of spot instances that launch together and terminate together.
         *                        If left empty instances are launched and terminated individually
         * @return {@code this}
         */
        public Builder spotLaunchGroup(java.lang.String spotLaunchGroup) {
            this.spotLaunchGroup = spotLaunchGroup;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotPrice}
         * @param spotPrice The maximum price to request on the spot market.
         *                  Defaults to on-demand price
         * @return {@code this}
         */
        public Builder spotPrice(java.lang.String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotType}
         * @param spotType If set to one-time, after the instance is terminated, the spot request will be closed.
         *                 Default <code>persistent</code>
         * @return {@code this}
         */
        public Builder spotType(java.lang.String spotType) {
            this.spotType = spotType;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotValidFrom}
         * @param spotValidFrom The start date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * @return {@code this}
         */
        public Builder spotValidFrom(java.lang.String spotValidFrom) {
            this.spotValidFrom = spotValidFrom;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotValidUntil}
         * @param spotValidUntil The end date and time of the request, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
         * @return {@code this}
         */
        public Builder spotValidUntil(java.lang.String spotValidUntil) {
            this.spotValidUntil = spotValidUntil;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSpotWaitForFulfillment}
         * @param spotWaitForFulfillment If set, Terraform will wait for the Spot Request to be fulfilled, and will throw an error if the timeout of 10m is reached.
         * @return {@code this}
         */
        public Builder spotWaitForFulfillment(java.lang.Boolean spotWaitForFulfillment) {
            this.spotWaitForFulfillment = spotWaitForFulfillment;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getSubnetId}
         * @param subnetId The VPC Subnet ID to launch in.
         * @return {@code this}
         */
        public Builder subnetId(java.lang.String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getTags}
         * @param tags A mapping of tags to assign to the resource The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getTenancy}
         * @param tenancy The tenancy of the instance (if the instance is running in a VPC).
         *                Available values: default, dedicated, host
         * @return {@code this}
         */
        public Builder tenancy(java.lang.String tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getTimeouts}
         * @param timeouts Define maximum timeout for creating, updating, and deleting EC2 instance resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder timeouts(java.util.Map<java.lang.String, java.lang.String> timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getUserData}
         * @param userData The user data to provide when launching the instance.
         *                 Do not pass gzip-compressed data via this argument; see user_data_base64 instead
         * @return {@code this}
         */
        public Builder userData(java.lang.String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getUserDataBase64}
         * @param userDataBase64 Can be used instead of user_data to pass base64-encoded binary data directly.
         *                       Use this instead of user_data whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption
         * @return {@code this}
         */
        public Builder userDataBase64(java.lang.String userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getUserDataReplaceOnChange}
         * @param userDataReplaceOnChange When used in combination with user_data or user_data_base64 will trigger a destroy and recreate when set to true.
         *                                Defaults to false if not set
         * @return {@code this}
         */
        public Builder userDataReplaceOnChange(java.lang.Boolean userDataReplaceOnChange) {
            this.userDataReplaceOnChange = userDataReplaceOnChange;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getVolumeTags}
         * @param volumeTags A mapping of tags to assign to the devices created by the instance at launch time The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder volumeTags(java.util.Map<java.lang.String, java.lang.String> volumeTags) {
            this.volumeTags = volumeTags;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds A list of security group IDs to associate with.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getDependsOn}
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
         * Sets the value of {@link Ec2InstanceConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link Ec2InstanceConfig#getProviders}
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
         * Sets the value of {@link Ec2InstanceConfig#getSkipAssetCreationFromLocalModules}
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
         * @return a new instance of {@link Ec2InstanceConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2InstanceConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Ec2InstanceConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2InstanceConfig {
        private final java.lang.String ami;
        private final java.lang.String amiSsmParameter;
        private final java.lang.Boolean associatePublicIpAddress;
        private final java.lang.String availabilityZone;
        private final java.lang.Object capacityReservationSpecification;
        private final java.lang.Number cpuCoreCount;
        private final java.lang.String cpuCredits;
        private final java.lang.Object cpuOptions;
        private final java.lang.Number cpuThreadsPerCore;
        private final java.lang.Boolean create;
        private final java.lang.Boolean createIamInstanceProfile;
        private final java.lang.Boolean createSpotInstance;
        private final java.lang.Boolean disableApiStop;
        private final java.lang.Boolean disableApiTermination;
        private final java.util.List<java.lang.Object> ebsBlockDevice;
        private final java.lang.Boolean ebsOptimized;
        private final java.lang.Boolean enableVolumeTags;
        private final java.lang.Boolean enclaveOptionsEnabled;
        private final java.util.List<java.util.Map<java.lang.String, java.lang.String>> ephemeralBlockDevice;
        private final java.lang.Boolean fetchPasswordData;
        private final java.lang.Boolean hibernation;
        private final java.lang.String hostId;
        private final java.lang.String iamInstanceProfile;
        private final java.lang.String iamRoleDescription;
        private final java.lang.String iamRoleName;
        private final java.lang.String iamRolePath;
        private final java.lang.String iamRolePermissionsBoundary;
        private final java.util.Map<java.lang.String, java.lang.String> iamRolePolicies;
        private final java.util.Map<java.lang.String, java.lang.String> iamRoleTags;
        private final java.lang.Boolean iamRoleUseNamePrefix;
        private final java.lang.Boolean ignoreAmiChanges;
        private final java.lang.String instanceInitiatedShutdownBehavior;
        private final java.util.Map<java.lang.String, java.lang.String> instanceTags;
        private final java.lang.String instanceType;
        private final java.lang.Number ipv6AddressCount;
        private final java.util.List<java.lang.String> ipv6Addresses;
        private final java.lang.String keyName;
        private final java.util.Map<java.lang.String, java.lang.String> launchTemplate;
        private final java.lang.Object maintenanceOptions;
        private final java.util.Map<java.lang.String, java.lang.String> metadataOptions;
        private final java.lang.Boolean monitoring;
        private final java.lang.String name;
        private final java.util.List<java.util.Map<java.lang.String, java.lang.String>> networkInterface;
        private final java.lang.String placementGroup;
        private final java.util.Map<java.lang.String, java.lang.String> privateDnsNameOptions;
        private final java.lang.String privateIp;
        private final java.lang.Boolean putinKhuylo;
        private final java.util.List<java.lang.Object> rootBlockDevice;
        private final java.util.List<java.lang.String> secondaryPrivateIps;
        private final java.lang.Boolean sourceDestCheck;
        private final java.lang.Number spotBlockDurationMinutes;
        private final java.lang.String spotInstanceInterruptionBehavior;
        private final java.lang.String spotLaunchGroup;
        private final java.lang.String spotPrice;
        private final java.lang.String spotType;
        private final java.lang.String spotValidFrom;
        private final java.lang.String spotValidUntil;
        private final java.lang.Boolean spotWaitForFulfillment;
        private final java.lang.String subnetId;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.String tenancy;
        private final java.util.Map<java.lang.String, java.lang.String> timeouts;
        private final java.lang.String userData;
        private final java.lang.String userDataBase64;
        private final java.lang.Boolean userDataReplaceOnChange;
        private final java.util.Map<java.lang.String, java.lang.String> volumeTags;
        private final java.util.List<java.lang.String> vpcSecurityGroupIds;
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
            this.ami = software.amazon.jsii.Kernel.get(this, "ami", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.amiSsmParameter = software.amazon.jsii.Kernel.get(this, "amiSsmParameter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.associatePublicIpAddress = software.amazon.jsii.Kernel.get(this, "associatePublicIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.availabilityZone = software.amazon.jsii.Kernel.get(this, "availabilityZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.capacityReservationSpecification = software.amazon.jsii.Kernel.get(this, "capacityReservationSpecification", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.cpuCoreCount = software.amazon.jsii.Kernel.get(this, "cpuCoreCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cpuCredits = software.amazon.jsii.Kernel.get(this, "cpuCredits", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cpuOptions = software.amazon.jsii.Kernel.get(this, "cpuOptions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.cpuThreadsPerCore = software.amazon.jsii.Kernel.get(this, "cpuThreadsPerCore", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createIamInstanceProfile = software.amazon.jsii.Kernel.get(this, "createIamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createSpotInstance = software.amazon.jsii.Kernel.get(this, "createSpotInstance", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.disableApiStop = software.amazon.jsii.Kernel.get(this, "disableApiStop", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.disableApiTermination = software.amazon.jsii.Kernel.get(this, "disableApiTermination", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ebsBlockDevice = software.amazon.jsii.Kernel.get(this, "ebsBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.ebsOptimized = software.amazon.jsii.Kernel.get(this, "ebsOptimized", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enableVolumeTags = software.amazon.jsii.Kernel.get(this, "enableVolumeTags", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.enclaveOptionsEnabled = software.amazon.jsii.Kernel.get(this, "enclaveOptionsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ephemeralBlockDevice = software.amazon.jsii.Kernel.get(this, "ephemeralBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
            this.fetchPasswordData = software.amazon.jsii.Kernel.get(this, "fetchPasswordData", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hibernation = software.amazon.jsii.Kernel.get(this, "hibernation", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hostId = software.amazon.jsii.Kernel.get(this, "hostId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamInstanceProfile = software.amazon.jsii.Kernel.get(this, "iamInstanceProfile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamRoleDescription = software.amazon.jsii.Kernel.get(this, "iamRoleDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamRoleName = software.amazon.jsii.Kernel.get(this, "iamRoleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamRolePath = software.amazon.jsii.Kernel.get(this, "iamRolePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamRolePermissionsBoundary = software.amazon.jsii.Kernel.get(this, "iamRolePermissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iamRolePolicies = software.amazon.jsii.Kernel.get(this, "iamRolePolicies", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.iamRoleTags = software.amazon.jsii.Kernel.get(this, "iamRoleTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.iamRoleUseNamePrefix = software.amazon.jsii.Kernel.get(this, "iamRoleUseNamePrefix", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.ignoreAmiChanges = software.amazon.jsii.Kernel.get(this, "ignoreAmiChanges", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.instanceInitiatedShutdownBehavior = software.amazon.jsii.Kernel.get(this, "instanceInitiatedShutdownBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceTags = software.amazon.jsii.Kernel.get(this, "instanceTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ipv6AddressCount = software.amazon.jsii.Kernel.get(this, "ipv6AddressCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipv6Addresses = software.amazon.jsii.Kernel.get(this, "ipv6Addresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.keyName = software.amazon.jsii.Kernel.get(this, "keyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.launchTemplate = software.amazon.jsii.Kernel.get(this, "launchTemplate", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.maintenanceOptions = software.amazon.jsii.Kernel.get(this, "maintenanceOptions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.metadataOptions = software.amazon.jsii.Kernel.get(this, "metadataOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.monitoring = software.amazon.jsii.Kernel.get(this, "monitoring", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.networkInterface = software.amazon.jsii.Kernel.get(this, "networkInterface", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
            this.placementGroup = software.amazon.jsii.Kernel.get(this, "placementGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.privateDnsNameOptions = software.amazon.jsii.Kernel.get(this, "privateDnsNameOptions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.privateIp = software.amazon.jsii.Kernel.get(this, "privateIp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.putinKhuylo = software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.rootBlockDevice = software.amazon.jsii.Kernel.get(this, "rootBlockDevice", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.secondaryPrivateIps = software.amazon.jsii.Kernel.get(this, "secondaryPrivateIps", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sourceDestCheck = software.amazon.jsii.Kernel.get(this, "sourceDestCheck", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.spotBlockDurationMinutes = software.amazon.jsii.Kernel.get(this, "spotBlockDurationMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.spotInstanceInterruptionBehavior = software.amazon.jsii.Kernel.get(this, "spotInstanceInterruptionBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotLaunchGroup = software.amazon.jsii.Kernel.get(this, "spotLaunchGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotPrice = software.amazon.jsii.Kernel.get(this, "spotPrice", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotType = software.amazon.jsii.Kernel.get(this, "spotType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotValidFrom = software.amazon.jsii.Kernel.get(this, "spotValidFrom", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotValidUntil = software.amazon.jsii.Kernel.get(this, "spotValidUntil", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.spotWaitForFulfillment = software.amazon.jsii.Kernel.get(this, "spotWaitForFulfillment", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.subnetId = software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tenancy = software.amazon.jsii.Kernel.get(this, "tenancy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.userData = software.amazon.jsii.Kernel.get(this, "userData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userDataBase64 = software.amazon.jsii.Kernel.get(this, "userDataBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.userDataReplaceOnChange = software.amazon.jsii.Kernel.get(this, "userDataReplaceOnChange", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.volumeTags = software.amazon.jsii.Kernel.get(this, "volumeTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
            this.ami = builder.ami;
            this.amiSsmParameter = builder.amiSsmParameter;
            this.associatePublicIpAddress = builder.associatePublicIpAddress;
            this.availabilityZone = builder.availabilityZone;
            this.capacityReservationSpecification = builder.capacityReservationSpecification;
            this.cpuCoreCount = builder.cpuCoreCount;
            this.cpuCredits = builder.cpuCredits;
            this.cpuOptions = builder.cpuOptions;
            this.cpuThreadsPerCore = builder.cpuThreadsPerCore;
            this.create = builder.create;
            this.createIamInstanceProfile = builder.createIamInstanceProfile;
            this.createSpotInstance = builder.createSpotInstance;
            this.disableApiStop = builder.disableApiStop;
            this.disableApiTermination = builder.disableApiTermination;
            this.ebsBlockDevice = (java.util.List<java.lang.Object>)builder.ebsBlockDevice;
            this.ebsOptimized = builder.ebsOptimized;
            this.enableVolumeTags = builder.enableVolumeTags;
            this.enclaveOptionsEnabled = builder.enclaveOptionsEnabled;
            this.ephemeralBlockDevice = (java.util.List<java.util.Map<java.lang.String, java.lang.String>>)builder.ephemeralBlockDevice;
            this.fetchPasswordData = builder.fetchPasswordData;
            this.hibernation = builder.hibernation;
            this.hostId = builder.hostId;
            this.iamInstanceProfile = builder.iamInstanceProfile;
            this.iamRoleDescription = builder.iamRoleDescription;
            this.iamRoleName = builder.iamRoleName;
            this.iamRolePath = builder.iamRolePath;
            this.iamRolePermissionsBoundary = builder.iamRolePermissionsBoundary;
            this.iamRolePolicies = builder.iamRolePolicies;
            this.iamRoleTags = builder.iamRoleTags;
            this.iamRoleUseNamePrefix = builder.iamRoleUseNamePrefix;
            this.ignoreAmiChanges = builder.ignoreAmiChanges;
            this.instanceInitiatedShutdownBehavior = builder.instanceInitiatedShutdownBehavior;
            this.instanceTags = builder.instanceTags;
            this.instanceType = builder.instanceType;
            this.ipv6AddressCount = builder.ipv6AddressCount;
            this.ipv6Addresses = builder.ipv6Addresses;
            this.keyName = builder.keyName;
            this.launchTemplate = builder.launchTemplate;
            this.maintenanceOptions = builder.maintenanceOptions;
            this.metadataOptions = builder.metadataOptions;
            this.monitoring = builder.monitoring;
            this.name = builder.name;
            this.networkInterface = (java.util.List<java.util.Map<java.lang.String, java.lang.String>>)builder.networkInterface;
            this.placementGroup = builder.placementGroup;
            this.privateDnsNameOptions = builder.privateDnsNameOptions;
            this.privateIp = builder.privateIp;
            this.putinKhuylo = builder.putinKhuylo;
            this.rootBlockDevice = (java.util.List<java.lang.Object>)builder.rootBlockDevice;
            this.secondaryPrivateIps = builder.secondaryPrivateIps;
            this.sourceDestCheck = builder.sourceDestCheck;
            this.spotBlockDurationMinutes = builder.spotBlockDurationMinutes;
            this.spotInstanceInterruptionBehavior = builder.spotInstanceInterruptionBehavior;
            this.spotLaunchGroup = builder.spotLaunchGroup;
            this.spotPrice = builder.spotPrice;
            this.spotType = builder.spotType;
            this.spotValidFrom = builder.spotValidFrom;
            this.spotValidUntil = builder.spotValidUntil;
            this.spotWaitForFulfillment = builder.spotWaitForFulfillment;
            this.subnetId = builder.subnetId;
            this.tags = builder.tags;
            this.tenancy = builder.tenancy;
            this.timeouts = builder.timeouts;
            this.userData = builder.userData;
            this.userDataBase64 = builder.userDataBase64;
            this.userDataReplaceOnChange = builder.userDataReplaceOnChange;
            this.volumeTags = builder.volumeTags;
            this.vpcSecurityGroupIds = builder.vpcSecurityGroupIds;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.lang.String getAmi() {
            return this.ami;
        }

        @Override
        public final java.lang.String getAmiSsmParameter() {
            return this.amiSsmParameter;
        }

        @Override
        public final java.lang.Boolean getAssociatePublicIpAddress() {
            return this.associatePublicIpAddress;
        }

        @Override
        public final java.lang.String getAvailabilityZone() {
            return this.availabilityZone;
        }

        @Override
        public final java.lang.Object getCapacityReservationSpecification() {
            return this.capacityReservationSpecification;
        }

        @Override
        public final java.lang.Number getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        @Override
        public final java.lang.String getCpuCredits() {
            return this.cpuCredits;
        }

        @Override
        public final java.lang.Object getCpuOptions() {
            return this.cpuOptions;
        }

        @Override
        public final java.lang.Number getCpuThreadsPerCore() {
            return this.cpuThreadsPerCore;
        }

        @Override
        public final java.lang.Boolean getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.Boolean getCreateIamInstanceProfile() {
            return this.createIamInstanceProfile;
        }

        @Override
        public final java.lang.Boolean getCreateSpotInstance() {
            return this.createSpotInstance;
        }

        @Override
        public final java.lang.Boolean getDisableApiStop() {
            return this.disableApiStop;
        }

        @Override
        public final java.lang.Boolean getDisableApiTermination() {
            return this.disableApiTermination;
        }

        @Override
        public final java.util.List<java.lang.Object> getEbsBlockDevice() {
            return this.ebsBlockDevice;
        }

        @Override
        public final java.lang.Boolean getEbsOptimized() {
            return this.ebsOptimized;
        }

        @Override
        public final java.lang.Boolean getEnableVolumeTags() {
            return this.enableVolumeTags;
        }

        @Override
        public final java.lang.Boolean getEnclaveOptionsEnabled() {
            return this.enclaveOptionsEnabled;
        }

        @Override
        public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> getEphemeralBlockDevice() {
            return this.ephemeralBlockDevice;
        }

        @Override
        public final java.lang.Boolean getFetchPasswordData() {
            return this.fetchPasswordData;
        }

        @Override
        public final java.lang.Boolean getHibernation() {
            return this.hibernation;
        }

        @Override
        public final java.lang.String getHostId() {
            return this.hostId;
        }

        @Override
        public final java.lang.String getIamInstanceProfile() {
            return this.iamInstanceProfile;
        }

        @Override
        public final java.lang.String getIamRoleDescription() {
            return this.iamRoleDescription;
        }

        @Override
        public final java.lang.String getIamRoleName() {
            return this.iamRoleName;
        }

        @Override
        public final java.lang.String getIamRolePath() {
            return this.iamRolePath;
        }

        @Override
        public final java.lang.String getIamRolePermissionsBoundary() {
            return this.iamRolePermissionsBoundary;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getIamRolePolicies() {
            return this.iamRolePolicies;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getIamRoleTags() {
            return this.iamRoleTags;
        }

        @Override
        public final java.lang.Boolean getIamRoleUseNamePrefix() {
            return this.iamRoleUseNamePrefix;
        }

        @Override
        public final java.lang.Boolean getIgnoreAmiChanges() {
            return this.ignoreAmiChanges;
        }

        @Override
        public final java.lang.String getInstanceInitiatedShutdownBehavior() {
            return this.instanceInitiatedShutdownBehavior;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getInstanceTags() {
            return this.instanceTags;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.Number getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        @Override
        public final java.util.List<java.lang.String> getIpv6Addresses() {
            return this.ipv6Addresses;
        }

        @Override
        public final java.lang.String getKeyName() {
            return this.keyName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getLaunchTemplate() {
            return this.launchTemplate;
        }

        @Override
        public final java.lang.Object getMaintenanceOptions() {
            return this.maintenanceOptions;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getMetadataOptions() {
            return this.metadataOptions;
        }

        @Override
        public final java.lang.Boolean getMonitoring() {
            return this.monitoring;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.util.Map<java.lang.String, java.lang.String>> getNetworkInterface() {
            return this.networkInterface;
        }

        @Override
        public final java.lang.String getPlacementGroup() {
            return this.placementGroup;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getPrivateDnsNameOptions() {
            return this.privateDnsNameOptions;
        }

        @Override
        public final java.lang.String getPrivateIp() {
            return this.privateIp;
        }

        @Override
        public final java.lang.Boolean getPutinKhuylo() {
            return this.putinKhuylo;
        }

        @Override
        public final java.util.List<java.lang.Object> getRootBlockDevice() {
            return this.rootBlockDevice;
        }

        @Override
        public final java.util.List<java.lang.String> getSecondaryPrivateIps() {
            return this.secondaryPrivateIps;
        }

        @Override
        public final java.lang.Boolean getSourceDestCheck() {
            return this.sourceDestCheck;
        }

        @Override
        public final java.lang.Number getSpotBlockDurationMinutes() {
            return this.spotBlockDurationMinutes;
        }

        @Override
        public final java.lang.String getSpotInstanceInterruptionBehavior() {
            return this.spotInstanceInterruptionBehavior;
        }

        @Override
        public final java.lang.String getSpotLaunchGroup() {
            return this.spotLaunchGroup;
        }

        @Override
        public final java.lang.String getSpotPrice() {
            return this.spotPrice;
        }

        @Override
        public final java.lang.String getSpotType() {
            return this.spotType;
        }

        @Override
        public final java.lang.String getSpotValidFrom() {
            return this.spotValidFrom;
        }

        @Override
        public final java.lang.String getSpotValidUntil() {
            return this.spotValidUntil;
        }

        @Override
        public final java.lang.Boolean getSpotWaitForFulfillment() {
            return this.spotWaitForFulfillment;
        }

        @Override
        public final java.lang.String getSubnetId() {
            return this.subnetId;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.String getTenancy() {
            return this.tenancy;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getUserData() {
            return this.userData;
        }

        @Override
        public final java.lang.String getUserDataBase64() {
            return this.userDataBase64;
        }

        @Override
        public final java.lang.Boolean getUserDataReplaceOnChange() {
            return this.userDataReplaceOnChange;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getVolumeTags() {
            return this.volumeTags;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSecurityGroupIds() {
            return this.vpcSecurityGroupIds;
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

            if (this.getAmi() != null) {
                data.set("ami", om.valueToTree(this.getAmi()));
            }
            if (this.getAmiSsmParameter() != null) {
                data.set("amiSsmParameter", om.valueToTree(this.getAmiSsmParameter()));
            }
            if (this.getAssociatePublicIpAddress() != null) {
                data.set("associatePublicIpAddress", om.valueToTree(this.getAssociatePublicIpAddress()));
            }
            if (this.getAvailabilityZone() != null) {
                data.set("availabilityZone", om.valueToTree(this.getAvailabilityZone()));
            }
            if (this.getCapacityReservationSpecification() != null) {
                data.set("capacityReservationSpecification", om.valueToTree(this.getCapacityReservationSpecification()));
            }
            if (this.getCpuCoreCount() != null) {
                data.set("cpuCoreCount", om.valueToTree(this.getCpuCoreCount()));
            }
            if (this.getCpuCredits() != null) {
                data.set("cpuCredits", om.valueToTree(this.getCpuCredits()));
            }
            if (this.getCpuOptions() != null) {
                data.set("cpuOptions", om.valueToTree(this.getCpuOptions()));
            }
            if (this.getCpuThreadsPerCore() != null) {
                data.set("cpuThreadsPerCore", om.valueToTree(this.getCpuThreadsPerCore()));
            }
            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getCreateIamInstanceProfile() != null) {
                data.set("createIamInstanceProfile", om.valueToTree(this.getCreateIamInstanceProfile()));
            }
            if (this.getCreateSpotInstance() != null) {
                data.set("createSpotInstance", om.valueToTree(this.getCreateSpotInstance()));
            }
            if (this.getDisableApiStop() != null) {
                data.set("disableApiStop", om.valueToTree(this.getDisableApiStop()));
            }
            if (this.getDisableApiTermination() != null) {
                data.set("disableApiTermination", om.valueToTree(this.getDisableApiTermination()));
            }
            if (this.getEbsBlockDevice() != null) {
                data.set("ebsBlockDevice", om.valueToTree(this.getEbsBlockDevice()));
            }
            if (this.getEbsOptimized() != null) {
                data.set("ebsOptimized", om.valueToTree(this.getEbsOptimized()));
            }
            if (this.getEnableVolumeTags() != null) {
                data.set("enableVolumeTags", om.valueToTree(this.getEnableVolumeTags()));
            }
            if (this.getEnclaveOptionsEnabled() != null) {
                data.set("enclaveOptionsEnabled", om.valueToTree(this.getEnclaveOptionsEnabled()));
            }
            if (this.getEphemeralBlockDevice() != null) {
                data.set("ephemeralBlockDevice", om.valueToTree(this.getEphemeralBlockDevice()));
            }
            if (this.getFetchPasswordData() != null) {
                data.set("fetchPasswordData", om.valueToTree(this.getFetchPasswordData()));
            }
            if (this.getHibernation() != null) {
                data.set("hibernation", om.valueToTree(this.getHibernation()));
            }
            if (this.getHostId() != null) {
                data.set("hostId", om.valueToTree(this.getHostId()));
            }
            if (this.getIamInstanceProfile() != null) {
                data.set("iamInstanceProfile", om.valueToTree(this.getIamInstanceProfile()));
            }
            if (this.getIamRoleDescription() != null) {
                data.set("iamRoleDescription", om.valueToTree(this.getIamRoleDescription()));
            }
            if (this.getIamRoleName() != null) {
                data.set("iamRoleName", om.valueToTree(this.getIamRoleName()));
            }
            if (this.getIamRolePath() != null) {
                data.set("iamRolePath", om.valueToTree(this.getIamRolePath()));
            }
            if (this.getIamRolePermissionsBoundary() != null) {
                data.set("iamRolePermissionsBoundary", om.valueToTree(this.getIamRolePermissionsBoundary()));
            }
            if (this.getIamRolePolicies() != null) {
                data.set("iamRolePolicies", om.valueToTree(this.getIamRolePolicies()));
            }
            if (this.getIamRoleTags() != null) {
                data.set("iamRoleTags", om.valueToTree(this.getIamRoleTags()));
            }
            if (this.getIamRoleUseNamePrefix() != null) {
                data.set("iamRoleUseNamePrefix", om.valueToTree(this.getIamRoleUseNamePrefix()));
            }
            if (this.getIgnoreAmiChanges() != null) {
                data.set("ignoreAmiChanges", om.valueToTree(this.getIgnoreAmiChanges()));
            }
            if (this.getInstanceInitiatedShutdownBehavior() != null) {
                data.set("instanceInitiatedShutdownBehavior", om.valueToTree(this.getInstanceInitiatedShutdownBehavior()));
            }
            if (this.getInstanceTags() != null) {
                data.set("instanceTags", om.valueToTree(this.getInstanceTags()));
            }
            if (this.getInstanceType() != null) {
                data.set("instanceType", om.valueToTree(this.getInstanceType()));
            }
            if (this.getIpv6AddressCount() != null) {
                data.set("ipv6AddressCount", om.valueToTree(this.getIpv6AddressCount()));
            }
            if (this.getIpv6Addresses() != null) {
                data.set("ipv6Addresses", om.valueToTree(this.getIpv6Addresses()));
            }
            if (this.getKeyName() != null) {
                data.set("keyName", om.valueToTree(this.getKeyName()));
            }
            if (this.getLaunchTemplate() != null) {
                data.set("launchTemplate", om.valueToTree(this.getLaunchTemplate()));
            }
            if (this.getMaintenanceOptions() != null) {
                data.set("maintenanceOptions", om.valueToTree(this.getMaintenanceOptions()));
            }
            if (this.getMetadataOptions() != null) {
                data.set("metadataOptions", om.valueToTree(this.getMetadataOptions()));
            }
            if (this.getMonitoring() != null) {
                data.set("monitoring", om.valueToTree(this.getMonitoring()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNetworkInterface() != null) {
                data.set("networkInterface", om.valueToTree(this.getNetworkInterface()));
            }
            if (this.getPlacementGroup() != null) {
                data.set("placementGroup", om.valueToTree(this.getPlacementGroup()));
            }
            if (this.getPrivateDnsNameOptions() != null) {
                data.set("privateDnsNameOptions", om.valueToTree(this.getPrivateDnsNameOptions()));
            }
            if (this.getPrivateIp() != null) {
                data.set("privateIp", om.valueToTree(this.getPrivateIp()));
            }
            if (this.getPutinKhuylo() != null) {
                data.set("putinKhuylo", om.valueToTree(this.getPutinKhuylo()));
            }
            if (this.getRootBlockDevice() != null) {
                data.set("rootBlockDevice", om.valueToTree(this.getRootBlockDevice()));
            }
            if (this.getSecondaryPrivateIps() != null) {
                data.set("secondaryPrivateIps", om.valueToTree(this.getSecondaryPrivateIps()));
            }
            if (this.getSourceDestCheck() != null) {
                data.set("sourceDestCheck", om.valueToTree(this.getSourceDestCheck()));
            }
            if (this.getSpotBlockDurationMinutes() != null) {
                data.set("spotBlockDurationMinutes", om.valueToTree(this.getSpotBlockDurationMinutes()));
            }
            if (this.getSpotInstanceInterruptionBehavior() != null) {
                data.set("spotInstanceInterruptionBehavior", om.valueToTree(this.getSpotInstanceInterruptionBehavior()));
            }
            if (this.getSpotLaunchGroup() != null) {
                data.set("spotLaunchGroup", om.valueToTree(this.getSpotLaunchGroup()));
            }
            if (this.getSpotPrice() != null) {
                data.set("spotPrice", om.valueToTree(this.getSpotPrice()));
            }
            if (this.getSpotType() != null) {
                data.set("spotType", om.valueToTree(this.getSpotType()));
            }
            if (this.getSpotValidFrom() != null) {
                data.set("spotValidFrom", om.valueToTree(this.getSpotValidFrom()));
            }
            if (this.getSpotValidUntil() != null) {
                data.set("spotValidUntil", om.valueToTree(this.getSpotValidUntil()));
            }
            if (this.getSpotWaitForFulfillment() != null) {
                data.set("spotWaitForFulfillment", om.valueToTree(this.getSpotWaitForFulfillment()));
            }
            if (this.getSubnetId() != null) {
                data.set("subnetId", om.valueToTree(this.getSubnetId()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTenancy() != null) {
                data.set("tenancy", om.valueToTree(this.getTenancy()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getUserData() != null) {
                data.set("userData", om.valueToTree(this.getUserData()));
            }
            if (this.getUserDataBase64() != null) {
                data.set("userDataBase64", om.valueToTree(this.getUserDataBase64()));
            }
            if (this.getUserDataReplaceOnChange() != null) {
                data.set("userDataReplaceOnChange", om.valueToTree(this.getUserDataReplaceOnChange()));
            }
            if (this.getVolumeTags() != null) {
                data.set("volumeTags", om.valueToTree(this.getVolumeTags()));
            }
            if (this.getVpcSecurityGroupIds() != null) {
                data.set("vpcSecurityGroupIds", om.valueToTree(this.getVpcSecurityGroupIds()));
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
            struct.set("fqn", om.valueToTree("ec2-instance.Ec2InstanceConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2InstanceConfig.Jsii$Proxy that = (Ec2InstanceConfig.Jsii$Proxy) o;

            if (this.ami != null ? !this.ami.equals(that.ami) : that.ami != null) return false;
            if (this.amiSsmParameter != null ? !this.amiSsmParameter.equals(that.amiSsmParameter) : that.amiSsmParameter != null) return false;
            if (this.associatePublicIpAddress != null ? !this.associatePublicIpAddress.equals(that.associatePublicIpAddress) : that.associatePublicIpAddress != null) return false;
            if (this.availabilityZone != null ? !this.availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null) return false;
            if (this.capacityReservationSpecification != null ? !this.capacityReservationSpecification.equals(that.capacityReservationSpecification) : that.capacityReservationSpecification != null) return false;
            if (this.cpuCoreCount != null ? !this.cpuCoreCount.equals(that.cpuCoreCount) : that.cpuCoreCount != null) return false;
            if (this.cpuCredits != null ? !this.cpuCredits.equals(that.cpuCredits) : that.cpuCredits != null) return false;
            if (this.cpuOptions != null ? !this.cpuOptions.equals(that.cpuOptions) : that.cpuOptions != null) return false;
            if (this.cpuThreadsPerCore != null ? !this.cpuThreadsPerCore.equals(that.cpuThreadsPerCore) : that.cpuThreadsPerCore != null) return false;
            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            if (this.createIamInstanceProfile != null ? !this.createIamInstanceProfile.equals(that.createIamInstanceProfile) : that.createIamInstanceProfile != null) return false;
            if (this.createSpotInstance != null ? !this.createSpotInstance.equals(that.createSpotInstance) : that.createSpotInstance != null) return false;
            if (this.disableApiStop != null ? !this.disableApiStop.equals(that.disableApiStop) : that.disableApiStop != null) return false;
            if (this.disableApiTermination != null ? !this.disableApiTermination.equals(that.disableApiTermination) : that.disableApiTermination != null) return false;
            if (this.ebsBlockDevice != null ? !this.ebsBlockDevice.equals(that.ebsBlockDevice) : that.ebsBlockDevice != null) return false;
            if (this.ebsOptimized != null ? !this.ebsOptimized.equals(that.ebsOptimized) : that.ebsOptimized != null) return false;
            if (this.enableVolumeTags != null ? !this.enableVolumeTags.equals(that.enableVolumeTags) : that.enableVolumeTags != null) return false;
            if (this.enclaveOptionsEnabled != null ? !this.enclaveOptionsEnabled.equals(that.enclaveOptionsEnabled) : that.enclaveOptionsEnabled != null) return false;
            if (this.ephemeralBlockDevice != null ? !this.ephemeralBlockDevice.equals(that.ephemeralBlockDevice) : that.ephemeralBlockDevice != null) return false;
            if (this.fetchPasswordData != null ? !this.fetchPasswordData.equals(that.fetchPasswordData) : that.fetchPasswordData != null) return false;
            if (this.hibernation != null ? !this.hibernation.equals(that.hibernation) : that.hibernation != null) return false;
            if (this.hostId != null ? !this.hostId.equals(that.hostId) : that.hostId != null) return false;
            if (this.iamInstanceProfile != null ? !this.iamInstanceProfile.equals(that.iamInstanceProfile) : that.iamInstanceProfile != null) return false;
            if (this.iamRoleDescription != null ? !this.iamRoleDescription.equals(that.iamRoleDescription) : that.iamRoleDescription != null) return false;
            if (this.iamRoleName != null ? !this.iamRoleName.equals(that.iamRoleName) : that.iamRoleName != null) return false;
            if (this.iamRolePath != null ? !this.iamRolePath.equals(that.iamRolePath) : that.iamRolePath != null) return false;
            if (this.iamRolePermissionsBoundary != null ? !this.iamRolePermissionsBoundary.equals(that.iamRolePermissionsBoundary) : that.iamRolePermissionsBoundary != null) return false;
            if (this.iamRolePolicies != null ? !this.iamRolePolicies.equals(that.iamRolePolicies) : that.iamRolePolicies != null) return false;
            if (this.iamRoleTags != null ? !this.iamRoleTags.equals(that.iamRoleTags) : that.iamRoleTags != null) return false;
            if (this.iamRoleUseNamePrefix != null ? !this.iamRoleUseNamePrefix.equals(that.iamRoleUseNamePrefix) : that.iamRoleUseNamePrefix != null) return false;
            if (this.ignoreAmiChanges != null ? !this.ignoreAmiChanges.equals(that.ignoreAmiChanges) : that.ignoreAmiChanges != null) return false;
            if (this.instanceInitiatedShutdownBehavior != null ? !this.instanceInitiatedShutdownBehavior.equals(that.instanceInitiatedShutdownBehavior) : that.instanceInitiatedShutdownBehavior != null) return false;
            if (this.instanceTags != null ? !this.instanceTags.equals(that.instanceTags) : that.instanceTags != null) return false;
            if (this.instanceType != null ? !this.instanceType.equals(that.instanceType) : that.instanceType != null) return false;
            if (this.ipv6AddressCount != null ? !this.ipv6AddressCount.equals(that.ipv6AddressCount) : that.ipv6AddressCount != null) return false;
            if (this.ipv6Addresses != null ? !this.ipv6Addresses.equals(that.ipv6Addresses) : that.ipv6Addresses != null) return false;
            if (this.keyName != null ? !this.keyName.equals(that.keyName) : that.keyName != null) return false;
            if (this.launchTemplate != null ? !this.launchTemplate.equals(that.launchTemplate) : that.launchTemplate != null) return false;
            if (this.maintenanceOptions != null ? !this.maintenanceOptions.equals(that.maintenanceOptions) : that.maintenanceOptions != null) return false;
            if (this.metadataOptions != null ? !this.metadataOptions.equals(that.metadataOptions) : that.metadataOptions != null) return false;
            if (this.monitoring != null ? !this.monitoring.equals(that.monitoring) : that.monitoring != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.networkInterface != null ? !this.networkInterface.equals(that.networkInterface) : that.networkInterface != null) return false;
            if (this.placementGroup != null ? !this.placementGroup.equals(that.placementGroup) : that.placementGroup != null) return false;
            if (this.privateDnsNameOptions != null ? !this.privateDnsNameOptions.equals(that.privateDnsNameOptions) : that.privateDnsNameOptions != null) return false;
            if (this.privateIp != null ? !this.privateIp.equals(that.privateIp) : that.privateIp != null) return false;
            if (this.putinKhuylo != null ? !this.putinKhuylo.equals(that.putinKhuylo) : that.putinKhuylo != null) return false;
            if (this.rootBlockDevice != null ? !this.rootBlockDevice.equals(that.rootBlockDevice) : that.rootBlockDevice != null) return false;
            if (this.secondaryPrivateIps != null ? !this.secondaryPrivateIps.equals(that.secondaryPrivateIps) : that.secondaryPrivateIps != null) return false;
            if (this.sourceDestCheck != null ? !this.sourceDestCheck.equals(that.sourceDestCheck) : that.sourceDestCheck != null) return false;
            if (this.spotBlockDurationMinutes != null ? !this.spotBlockDurationMinutes.equals(that.spotBlockDurationMinutes) : that.spotBlockDurationMinutes != null) return false;
            if (this.spotInstanceInterruptionBehavior != null ? !this.spotInstanceInterruptionBehavior.equals(that.spotInstanceInterruptionBehavior) : that.spotInstanceInterruptionBehavior != null) return false;
            if (this.spotLaunchGroup != null ? !this.spotLaunchGroup.equals(that.spotLaunchGroup) : that.spotLaunchGroup != null) return false;
            if (this.spotPrice != null ? !this.spotPrice.equals(that.spotPrice) : that.spotPrice != null) return false;
            if (this.spotType != null ? !this.spotType.equals(that.spotType) : that.spotType != null) return false;
            if (this.spotValidFrom != null ? !this.spotValidFrom.equals(that.spotValidFrom) : that.spotValidFrom != null) return false;
            if (this.spotValidUntil != null ? !this.spotValidUntil.equals(that.spotValidUntil) : that.spotValidUntil != null) return false;
            if (this.spotWaitForFulfillment != null ? !this.spotWaitForFulfillment.equals(that.spotWaitForFulfillment) : that.spotWaitForFulfillment != null) return false;
            if (this.subnetId != null ? !this.subnetId.equals(that.subnetId) : that.subnetId != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tenancy != null ? !this.tenancy.equals(that.tenancy) : that.tenancy != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.userData != null ? !this.userData.equals(that.userData) : that.userData != null) return false;
            if (this.userDataBase64 != null ? !this.userDataBase64.equals(that.userDataBase64) : that.userDataBase64 != null) return false;
            if (this.userDataReplaceOnChange != null ? !this.userDataReplaceOnChange.equals(that.userDataReplaceOnChange) : that.userDataReplaceOnChange != null) return false;
            if (this.volumeTags != null ? !this.volumeTags.equals(that.volumeTags) : that.volumeTags != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ami != null ? this.ami.hashCode() : 0;
            result = 31 * result + (this.amiSsmParameter != null ? this.amiSsmParameter.hashCode() : 0);
            result = 31 * result + (this.associatePublicIpAddress != null ? this.associatePublicIpAddress.hashCode() : 0);
            result = 31 * result + (this.availabilityZone != null ? this.availabilityZone.hashCode() : 0);
            result = 31 * result + (this.capacityReservationSpecification != null ? this.capacityReservationSpecification.hashCode() : 0);
            result = 31 * result + (this.cpuCoreCount != null ? this.cpuCoreCount.hashCode() : 0);
            result = 31 * result + (this.cpuCredits != null ? this.cpuCredits.hashCode() : 0);
            result = 31 * result + (this.cpuOptions != null ? this.cpuOptions.hashCode() : 0);
            result = 31 * result + (this.cpuThreadsPerCore != null ? this.cpuThreadsPerCore.hashCode() : 0);
            result = 31 * result + (this.create != null ? this.create.hashCode() : 0);
            result = 31 * result + (this.createIamInstanceProfile != null ? this.createIamInstanceProfile.hashCode() : 0);
            result = 31 * result + (this.createSpotInstance != null ? this.createSpotInstance.hashCode() : 0);
            result = 31 * result + (this.disableApiStop != null ? this.disableApiStop.hashCode() : 0);
            result = 31 * result + (this.disableApiTermination != null ? this.disableApiTermination.hashCode() : 0);
            result = 31 * result + (this.ebsBlockDevice != null ? this.ebsBlockDevice.hashCode() : 0);
            result = 31 * result + (this.ebsOptimized != null ? this.ebsOptimized.hashCode() : 0);
            result = 31 * result + (this.enableVolumeTags != null ? this.enableVolumeTags.hashCode() : 0);
            result = 31 * result + (this.enclaveOptionsEnabled != null ? this.enclaveOptionsEnabled.hashCode() : 0);
            result = 31 * result + (this.ephemeralBlockDevice != null ? this.ephemeralBlockDevice.hashCode() : 0);
            result = 31 * result + (this.fetchPasswordData != null ? this.fetchPasswordData.hashCode() : 0);
            result = 31 * result + (this.hibernation != null ? this.hibernation.hashCode() : 0);
            result = 31 * result + (this.hostId != null ? this.hostId.hashCode() : 0);
            result = 31 * result + (this.iamInstanceProfile != null ? this.iamInstanceProfile.hashCode() : 0);
            result = 31 * result + (this.iamRoleDescription != null ? this.iamRoleDescription.hashCode() : 0);
            result = 31 * result + (this.iamRoleName != null ? this.iamRoleName.hashCode() : 0);
            result = 31 * result + (this.iamRolePath != null ? this.iamRolePath.hashCode() : 0);
            result = 31 * result + (this.iamRolePermissionsBoundary != null ? this.iamRolePermissionsBoundary.hashCode() : 0);
            result = 31 * result + (this.iamRolePolicies != null ? this.iamRolePolicies.hashCode() : 0);
            result = 31 * result + (this.iamRoleTags != null ? this.iamRoleTags.hashCode() : 0);
            result = 31 * result + (this.iamRoleUseNamePrefix != null ? this.iamRoleUseNamePrefix.hashCode() : 0);
            result = 31 * result + (this.ignoreAmiChanges != null ? this.ignoreAmiChanges.hashCode() : 0);
            result = 31 * result + (this.instanceInitiatedShutdownBehavior != null ? this.instanceInitiatedShutdownBehavior.hashCode() : 0);
            result = 31 * result + (this.instanceTags != null ? this.instanceTags.hashCode() : 0);
            result = 31 * result + (this.instanceType != null ? this.instanceType.hashCode() : 0);
            result = 31 * result + (this.ipv6AddressCount != null ? this.ipv6AddressCount.hashCode() : 0);
            result = 31 * result + (this.ipv6Addresses != null ? this.ipv6Addresses.hashCode() : 0);
            result = 31 * result + (this.keyName != null ? this.keyName.hashCode() : 0);
            result = 31 * result + (this.launchTemplate != null ? this.launchTemplate.hashCode() : 0);
            result = 31 * result + (this.maintenanceOptions != null ? this.maintenanceOptions.hashCode() : 0);
            result = 31 * result + (this.metadataOptions != null ? this.metadataOptions.hashCode() : 0);
            result = 31 * result + (this.monitoring != null ? this.monitoring.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.networkInterface != null ? this.networkInterface.hashCode() : 0);
            result = 31 * result + (this.placementGroup != null ? this.placementGroup.hashCode() : 0);
            result = 31 * result + (this.privateDnsNameOptions != null ? this.privateDnsNameOptions.hashCode() : 0);
            result = 31 * result + (this.privateIp != null ? this.privateIp.hashCode() : 0);
            result = 31 * result + (this.putinKhuylo != null ? this.putinKhuylo.hashCode() : 0);
            result = 31 * result + (this.rootBlockDevice != null ? this.rootBlockDevice.hashCode() : 0);
            result = 31 * result + (this.secondaryPrivateIps != null ? this.secondaryPrivateIps.hashCode() : 0);
            result = 31 * result + (this.sourceDestCheck != null ? this.sourceDestCheck.hashCode() : 0);
            result = 31 * result + (this.spotBlockDurationMinutes != null ? this.spotBlockDurationMinutes.hashCode() : 0);
            result = 31 * result + (this.spotInstanceInterruptionBehavior != null ? this.spotInstanceInterruptionBehavior.hashCode() : 0);
            result = 31 * result + (this.spotLaunchGroup != null ? this.spotLaunchGroup.hashCode() : 0);
            result = 31 * result + (this.spotPrice != null ? this.spotPrice.hashCode() : 0);
            result = 31 * result + (this.spotType != null ? this.spotType.hashCode() : 0);
            result = 31 * result + (this.spotValidFrom != null ? this.spotValidFrom.hashCode() : 0);
            result = 31 * result + (this.spotValidUntil != null ? this.spotValidUntil.hashCode() : 0);
            result = 31 * result + (this.spotWaitForFulfillment != null ? this.spotWaitForFulfillment.hashCode() : 0);
            result = 31 * result + (this.subnetId != null ? this.subnetId.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tenancy != null ? this.tenancy.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.userData != null ? this.userData.hashCode() : 0);
            result = 31 * result + (this.userDataBase64 != null ? this.userDataBase64.hashCode() : 0);
            result = 31 * result + (this.userDataReplaceOnChange != null ? this.userDataReplaceOnChange.hashCode() : 0);
            result = 31 * result + (this.volumeTags != null ? this.volumeTags.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
