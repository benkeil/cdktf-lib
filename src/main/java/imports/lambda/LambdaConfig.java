package imports.lambda;

@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.286Z")
@software.amazon.jsii.Jsii(module = imports.lambda.$Module.class, fqn = "lambda.LambdaConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaConfig.Jsii$Proxy.class)
public interface LambdaConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserConfig {

    /**
     * Map of allowed triggers to create Lambda permissions The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getAllowedTriggers() {
        return null;
    }

    /**
     * Instruction set architecture for your Lambda function.
     * <p>
     * Valid values are ["x86_64"] and ["arm64"].
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArchitectures() {
        return null;
    }

    /**
     * Directory name where artifacts should be stored builds.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getArtifactsDir() {
        return null;
    }

    /**
     * Map of dynamic policy statements for assuming Lambda Function role (trust relationship).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAssumeRolePolicyStatements() {
        return null;
    }

    /**
     * Controls whether async event policy should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachAsyncEventPolicy() {
        return null;
    }

    /**
     * Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCloudwatchLogsPolicy() {
        return null;
    }

    /**
     * Controls whether to add the create log group permission to the CloudWatch logs policy true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachCreateLogGroupPermission() {
        return null;
    }

    /**
     * Controls whether SNS/SQS dead letter notification policy should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachDeadLetterPolicy() {
        return null;
    }

    /**
     * Controls whether VPC/network policy should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachNetworkPolicy() {
        return null;
    }

    /**
     * Controls whether list of policies should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicies() {
        return null;
    }

    /**
     * Controls whether policy should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicy() {
        return null;
    }

    /**
     * Controls whether policy_json should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJson() {
        return null;
    }

    /**
     * Controls whether policy_jsons should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyJsons() {
        return null;
    }

    /**
     * Controls whether policy_statements should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachPolicyStatements() {
        return null;
    }

    /**
     * Controls whether X-Ray tracing policy should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachTracingPolicy() {
        return null;
    }

    /**
     * The type of authentication that the Lambda Function URL uses.
     * <p>
     * Set to 'AWS_IAM' to restrict access to authenticated IAM users only. Set to 'NONE' to bypass IAM authentication and create a public endpoint.
     * NONE
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationType() {
        return null;
    }

    /**
     * Whether to build dependencies in Docker.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBuildInDocker() {
        return null;
    }

    /**
     * The ARN of the KMS Key to use when encrypting log data.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogsKmsKeyId() {
        return null;
    }

    /**
     * Specified the log class of the log group.
     * <p>
     * Possible values are: <code>STANDARD</code> or <code>INFREQUENT_ACCESS</code>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCloudwatchLogsLogGroupClass() {
        return null;
    }

    /**
     * Specifies the number of days you want to retain log events in the specified log group.
     * <p>
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCloudwatchLogsRetentionInDays() {
        return null;
    }

    /**
     * Whether to keep the log group (and any logs it may contain) at destroy time.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCloudwatchLogsSkipDestroy() {
        return null;
    }

    /**
     * A map of tags to assign to the resource.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCloudwatchLogsTags() {
        return null;
    }

    /**
     * Amazon Resource Name (ARN) for a Code Signing Configuration.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCodeSigningConfigArn() {
        return null;
    }

    /**
     * A list of Architectures Lambda layer is compatible with.
     * <p>
     * Currently x86_64 and arm64 can be specified.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCompatibleArchitectures() {
        return null;
    }

    /**
     * A list of Runtimes this layer is compatible with.
     * <p>
     * Up to 5 runtimes can be specified.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCompatibleRuntimes() {
        return null;
    }

    /**
     * CORS settings to be used by the Lambda Function URL.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCors() {
        return null;
    }

    /**
     * Controls whether resources should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreate() {
        return null;
    }

    /**
     * Controls whether async event configuration for Lambda Function/Alias should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateAsyncEventConfig() {
        return null;
    }

    /**
     * Whether to allow triggers on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateCurrentVersionAllowedTriggers() {
        return null;
    }

    /**
     * Whether to allow async event configuration on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateCurrentVersionAsyncEventConfig() {
        return null;
    }

    /**
     * Controls whether Lambda Function resource should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateFunction() {
        return null;
    }

    /**
     * Controls whether the Lambda Function URL resource should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateLambdaFunctionUrl() {
        return null;
    }

    /**
     * Controls whether Lambda Layer resource should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateLayer() {
        return null;
    }

    /**
     * Controls whether Lambda package should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreatePackage() {
        return null;
    }

    /**
     * Controls whether IAM role for Lambda Function should be created true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateRole() {
        return null;
    }

    /**
     * Controls whether the SAM metadata null resource should be created.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateSamMetadata() {
        return null;
    }

    /**
     * Whether to allow triggers on unqualified alias pointing to $LATEST version true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasAllowedTriggers() {
        return null;
    }

    /**
     * Whether to allow async event configuration on unqualified alias pointing to $LATEST version true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasAsyncEventConfig() {
        return null;
    }

    /**
     * Whether to use unqualified alias pointing to $LATEST version in Lambda Function URL true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateUnqualifiedAliasLambdaFunctionUrl() {
        return null;
    }

    /**
     * The ARN of an SNS topic or SQS queue to notify when an invocation fails.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDeadLetterTargetArn() {
        return null;
    }

    /**
     * Description of your Lambda Function (or Layer).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     * Amazon Resource Name (ARN) of the destination resource for failed asynchronous invocations.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDestinationOnFailure() {
        return null;
    }

    /**
     * Amazon Resource Name (ARN) of the destination resource for successful asynchronous invocations.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDestinationOnSuccess() {
        return null;
    }

    /**
     * Additional options to pass to the docker run command (e.g. to set environment variables, volumes, etc.).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDockerAdditionalOptions() {
        return null;
    }

    /**
     * Root dir where to build in Docker.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDockerBuildRoot() {
        return null;
    }

    /**
     * Path to the Docker entrypoint to use.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDockerEntrypoint() {
        return null;
    }

    /**
     * Path to a Dockerfile when building in Docker.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDockerFile() {
        return null;
    }

    /**
     * Docker image to use for the build.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDockerImage() {
        return null;
    }

    /**
     * Whether to mount a shared pip cache folder into docker environment or not.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDockerPipCache() {
        return null;
    }

    /**
     * Whether to pass SSH_AUTH_SOCK into docker environment or not.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getDockerWithSshAgent() {
        return null;
    }

    /**
     * A map that defines environment variables for the Lambda Function.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariables() {
        return null;
    }

    /**
     * Amount of ephemeral storage (/tmp) in MB your Lambda Function can use at runtime.
     * <p>
     * Valid value between 512 MB to 10,240 MB (10 GB).
     * 512
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getEphemeralStorageSize() {
        return null;
    }

    /**
     * Map of event source mapping.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEventSourceMapping() {
        return null;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFileSystemArn() {
        return null;
    }

    /**
     * The path where the function can access the file system, starting with /mnt/.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFileSystemLocalMountPath() {
        return null;
    }

    /**
     * A unique name for your Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFunctionName() {
        return null;
    }

    /**
     * A map of tags to assign only to the lambda function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getFunctionTags() {
        return null;
    }

    /**
     * Lambda Function entrypoint in your code.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHandler() {
        return null;
    }

    /**
     * The string to add into hashing function.
     * <p>
     * Useful when building same source path for different functions.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHashExtra() {
        return null;
    }

    /**
     * Whether to ignore changes to the function's source code hash.
     * <p>
     * Set to true if you manage infrastructure and code deployments separately.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getIgnoreSourceCodeHash() {
        return null;
    }

    /**
     * The CMD for the docker image.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getImageConfigCommand() {
        return null;
    }

    /**
     * The ENTRYPOINT for the docker image.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getImageConfigEntryPoint() {
        return null;
    }

    /**
     * The working directory for the docker image.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImageConfigWorkingDirectory() {
        return null;
    }

    /**
     * The ECR image URI containing the function's deployment package.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImageUri() {
        return null;
    }

    /**
     * Invoke mode of the Lambda Function URL.
     * <p>
     * Valid values are BUFFERED (default) and RESPONSE_STREAM.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInvokeMode() {
        return null;
    }

    /**
     * The ARN of KMS key to use by your Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyArn() {
        return null;
    }

    /**
     * Set this to true if using Lambda&#64;Edge, to enable publishing, limit the timeout, and allow edgelambda.amazonaws.com to invoke the function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getLambdaAtEdge() {
        return null;
    }

    /**
     * Whether to specify a wildcard in IAM policy used by Lambda&#64;Edge to allow logging in all regions true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getLambdaAtEdgeLogsAllRegions() {
        return null;
    }

    /**
     * IAM role ARN attached to the Lambda Function.
     * <p>
     * This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See Lambda Permission Model for more details.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLambdaRole() {
        return null;
    }

    /**
     * Name of Lambda Layer to create.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLayerName() {
        return null;
    }

    /**
     * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLayers() {
        return null;
    }

    /**
     * Whether to retain the old version of a previously deployed Lambda Layer.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getLayerSkipDestroy() {
        return null;
    }

    /**
     * License info for your Lambda Layer.
     * <p>
     * Eg, MIT or full url of a license.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLicenseInfo() {
        return null;
    }

    /**
     * The absolute path to an existing zip-file to use.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLocalExistingPackage() {
        return null;
    }

    /**
     * The application log level of the Lambda Function.
     * <p>
     * Valid values are "TRACE", "DEBUG", "INFO", "WARN", "ERROR", or "FATAL".
     * INFO
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingApplicationLogLevel() {
        return null;
    }

    /**
     * The log format of the Lambda Function.
     * <p>
     * Valid values are "JSON" or "Text".
     * Text
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingLogFormat() {
        return null;
    }

    /**
     * The CloudWatch log group to send logs to.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingLogGroup() {
        return null;
    }

    /**
     * The system log level of the Lambda Function.
     * <p>
     * Valid values are "DEBUG", "INFO", or "WARN".
     * INFO
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoggingSystemLogLevel() {
        return null;
    }

    /**
     * Maximum age of a request that Lambda sends to a function for processing in seconds.
     * <p>
     * Valid values between 60 and 21600.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumEventAgeInSeconds() {
        return null;
    }

    /**
     * Maximum number of times to retry when the function returns an error.
     * <p>
     * Valid values between 0 and 2. Defaults to 2.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRetryAttempts() {
        return null;
    }

    /**
     * Amount of memory in MB your Lambda Function can use at runtime.
     * <p>
     * Valid value between 128 MB to 10,240 MB (10 GB), in 64 MB increments.
     * 128
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMemorySize() {
        return null;
    }

    /**
     * Number of policies to attach to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicies() {
        return null;
    }

    /**
     * Number of policies JSON to attach to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfPolicyJsons() {
        return null;
    }

    /**
     * The Lambda deployment package type.
     * <p>
     * Valid options: Zip or Image
     * Zip
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPackageType() {
        return null;
    }

    /**
     * List of policy statements ARN to attach to Lambda Function role.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicies() {
        return null;
    }

    /**
     * An additional policy document ARN to attach to the Lambda Function role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicy() {
        return null;
    }

    /**
     * An additional policy document as JSON to attach to the Lambda Function role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyJson() {
        return null;
    }

    /**
     * List of additional policy documents as JSON to attach to Lambda Function role.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyJsons() {
        return null;
    }

    /**
     * IAM policy name.
     * <p>
     * It override the default value, which is the same as role_name
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyName() {
        return null;
    }

    /**
     * Path of policies to that should be added to IAM role for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPolicyPath() {
        return null;
    }

    /**
     * Map of dynamic policy statements to attach to Lambda Function role.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getPolicyStatements() {
        return null;
    }

    /**
     * Amount of capacity to allocate.
     * <p>
     * Set to 1 or greater to enable, or set to 0 to disable provisioned concurrency.
     * -1
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getProvisionedConcurrentExecutions() {
        return null;
    }

    /**
     * Whether to publish creation/change as new Lambda Function Version.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPublish() {
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
     * Whether to recreate missing Lambda package if it is missing locally or not true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRecreateMissingPackage() {
        return null;
    }

    /**
     * (Optional) List of security group IDs to assign to orphaned Lambda function network interfaces upon destruction.
     * <p>
     * replace_security_groups_on_destroy must be set to true to use this attribute.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getReplacementSecurityGroupIds() {
        return null;
    }

    /**
     * (Optional) When true, all security groups defined in vpc_security_group_ids will be replaced with the default security group after the function is destroyed.
     * <p>
     * Set the replacement_security_group_ids variable to use a custom list of security groups for replacement instead.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReplaceSecurityGroupsOnDestroy() {
        return null;
    }

    /**
     * The amount of reserved concurrent executions for this Lambda Function.
     * <p>
     * A value of 0 disables Lambda Function from being triggered and -1 removes any concurrency limitations. Defaults to Unreserved Concurrency Limits -1.
     * -1
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReservedConcurrentExecutions() {
        return null;
    }

    /**
     * Description of IAM role to use for Lambda Function.
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
     * Maximum session duration, in seconds, for the IAM role 3.600.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRoleMaximumSessionDuration() {
        return null;
    }

    /**
     * Name of IAM role to use for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRoleName() {
        return null;
    }

    /**
     * Path of IAM role to use for Lambda Function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRolePath() {
        return null;
    }

    /**
     * The ARN of the policy that is used to set the permissions boundary for the IAM role used by Lambda Function.
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
     * Lambda Function runtime.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRuntime() {
        return null;
    }

    /**
     * The canned ACL to apply.
     * <p>
     * Valid values are private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, and bucket-owner-full-control. Defaults to private.
     * private
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3Acl() {
        return null;
    }

    /**
     * S3 bucket to store artifacts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3Bucket() {
        return null;
    }

    /**
     * The S3 bucket object with keys bucket, key, version pointing to an existing zip-file to use The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getS3ExistingPackage() {
        return null;
    }

    /**
     * Specifies a custom KMS key to use for S3 object encryption.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3KmsKeyId() {
        return null;
    }

    /**
     * Whether to override the default_tags from provider?
     * <p>
     * NB: S3 objects support a maximum of 10 tags.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ObjectOverrideDefaultTags() {
        return null;
    }

    /**
     * Specifies the desired Storage Class for the artifact uploaded to S3.
     * <p>
     * Can be either STANDARD, REDUCED_REDUNDANCY, ONEZONE_IA, INTELLIGENT_TIERING, or STANDARD_IA.
     * ONEZONE_IA
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3ObjectStorageClass() {
        return null;
    }

    /**
     * A map of tags to assign to S3 bucket object.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getS3ObjectTags() {
        return null;
    }

    /**
     * Set to true to not merge tags with s3_object_tags.
     * <p>
     * Useful to avoid breaching S3 Object 10 tag limit.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getS3ObjectTagsOnly() {
        return null;
    }

    /**
     * Directory name where artifacts should be stored in the S3 bucket.
     * <p>
     * If unset, the path from <code>artifacts_dir</code> is used
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3Prefix() {
        return null;
    }

    /**
     * Specifies server-side encryption of the object in S3.
     * <p>
     * Valid values are "AES256" and "aws:kms".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getS3ServerSideEncryption() {
        return null;
    }

    /**
     * (Optional) Snap start settings for low-latency startups.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getSnapStart() {
        return null;
    }

    /**
     * The absolute path to a local file or directory containing your Lambda source code.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSourcePath() {
        return null;
    }

    /**
     * Whether to store produced artifacts on S3 or locally.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getStoreOnS3() {
        return null;
    }

    /**
     * A map of tags to assign to resources.
     * <p>
     * The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * The amount of time your Lambda Function has to run in seconds.
     * <p>
     * 3
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeout() {
        return null;
    }

    /**
     * Define maximum timeout for creating, updating, and deleting Lambda Function resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTimeouts() {
        return null;
    }

    /**
     * Tracing mode of the Lambda Function.
     * <p>
     * Valid value can be either PassThrough or Active.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTracingMode() {
        return null;
    }

    /**
     * Whether to recreate the Lambda package if the timestamp changes true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getTriggerOnPackageTimestamp() {
        return null;
    }

    /**
     * List of additional trusted entities for assuming Lambda Function role (trust relationship).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTrustedEntities() {
        return null;
    }

    /**
     * Whether to use an existing CloudWatch log group or create new.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseExistingCloudwatchLogGroup() {
        return null;
    }

    /**
     * List of security group ids when Lambda Function should run in the VPC.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSecurityGroupIds() {
        return null;
    }

    /**
     * List of subnet ids when Lambda Function should run in the VPC.
     * <p>
     * Usually private or intra subnets.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVpcSubnetIds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaConfig> {
        java.util.Map<java.lang.String, java.lang.Object> allowedTriggers;
        java.util.List<java.lang.String> architectures;
        java.lang.String artifactsDir;
        java.lang.Object assumeRolePolicyStatements;
        java.lang.Boolean attachAsyncEventPolicy;
        java.lang.Boolean attachCloudwatchLogsPolicy;
        java.lang.Boolean attachCreateLogGroupPermission;
        java.lang.Boolean attachDeadLetterPolicy;
        java.lang.Boolean attachNetworkPolicy;
        java.lang.Boolean attachPolicies;
        java.lang.Boolean attachPolicy;
        java.lang.Boolean attachPolicyJson;
        java.lang.Boolean attachPolicyJsons;
        java.lang.Boolean attachPolicyStatements;
        java.lang.Boolean attachTracingPolicy;
        java.lang.String authorizationType;
        java.lang.Boolean buildInDocker;
        java.lang.String cloudwatchLogsKmsKeyId;
        java.lang.String cloudwatchLogsLogGroupClass;
        java.lang.Number cloudwatchLogsRetentionInDays;
        java.lang.Boolean cloudwatchLogsSkipDestroy;
        java.util.Map<java.lang.String, java.lang.String> cloudwatchLogsTags;
        java.lang.String codeSigningConfigArn;
        java.util.List<java.lang.String> compatibleArchitectures;
        java.util.List<java.lang.String> compatibleRuntimes;
        java.lang.Object cors;
        java.lang.Boolean create;
        java.lang.Boolean createAsyncEventConfig;
        java.lang.Boolean createCurrentVersionAllowedTriggers;
        java.lang.Boolean createCurrentVersionAsyncEventConfig;
        java.lang.Boolean createFunction;
        java.lang.Boolean createLambdaFunctionUrl;
        java.lang.Boolean createLayer;
        java.lang.Boolean createPackage;
        java.lang.Boolean createRole;
        java.lang.Boolean createSamMetadata;
        java.lang.Boolean createUnqualifiedAliasAllowedTriggers;
        java.lang.Boolean createUnqualifiedAliasAsyncEventConfig;
        java.lang.Boolean createUnqualifiedAliasLambdaFunctionUrl;
        java.lang.String deadLetterTargetArn;
        java.lang.String description;
        java.lang.String destinationOnFailure;
        java.lang.String destinationOnSuccess;
        java.util.List<java.lang.String> dockerAdditionalOptions;
        java.lang.String dockerBuildRoot;
        java.lang.String dockerEntrypoint;
        java.lang.String dockerFile;
        java.lang.String dockerImage;
        java.lang.Object dockerPipCache;
        java.lang.Boolean dockerWithSshAgent;
        java.util.Map<java.lang.String, java.lang.String> environmentVariables;
        java.lang.Number ephemeralStorageSize;
        java.lang.Object eventSourceMapping;
        java.lang.String fileSystemArn;
        java.lang.String fileSystemLocalMountPath;
        java.lang.String functionName;
        java.util.Map<java.lang.String, java.lang.String> functionTags;
        java.lang.String handler;
        java.lang.String hashExtra;
        java.lang.Boolean ignoreSourceCodeHash;
        java.util.List<java.lang.String> imageConfigCommand;
        java.util.List<java.lang.String> imageConfigEntryPoint;
        java.lang.String imageConfigWorkingDirectory;
        java.lang.String imageUri;
        java.lang.String invokeMode;
        java.lang.String kmsKeyArn;
        java.lang.Boolean lambdaAtEdge;
        java.lang.Boolean lambdaAtEdgeLogsAllRegions;
        java.lang.String lambdaRole;
        java.lang.String layerName;
        java.util.List<java.lang.String> layers;
        java.lang.Boolean layerSkipDestroy;
        java.lang.String licenseInfo;
        java.lang.String localExistingPackage;
        java.lang.String loggingApplicationLogLevel;
        java.lang.String loggingLogFormat;
        java.lang.String loggingLogGroup;
        java.lang.String loggingSystemLogLevel;
        java.lang.Number maximumEventAgeInSeconds;
        java.lang.Number maximumRetryAttempts;
        java.lang.Number memorySize;
        java.lang.Number numberOfPolicies;
        java.lang.Number numberOfPolicyJsons;
        java.lang.String packageType;
        java.util.List<java.lang.String> policies;
        java.lang.String policy;
        java.lang.String policyJson;
        java.util.List<java.lang.String> policyJsons;
        java.lang.String policyName;
        java.lang.String policyPath;
        java.lang.Object policyStatements;
        java.lang.Number provisionedConcurrentExecutions;
        java.lang.Boolean publish;
        java.lang.Boolean putinKhuylo;
        java.lang.Boolean recreateMissingPackage;
        java.util.List<java.lang.String> replacementSecurityGroupIds;
        java.lang.Boolean replaceSecurityGroupsOnDestroy;
        java.lang.Number reservedConcurrentExecutions;
        java.lang.String roleDescription;
        java.lang.Boolean roleForceDetachPolicies;
        java.lang.Number roleMaximumSessionDuration;
        java.lang.String roleName;
        java.lang.String rolePath;
        java.lang.String rolePermissionsBoundary;
        java.util.Map<java.lang.String, java.lang.String> roleTags;
        java.lang.String runtime;
        java.lang.String s3Acl;
        java.lang.String s3Bucket;
        java.util.Map<java.lang.String, java.lang.String> s3ExistingPackage;
        java.lang.String s3KmsKeyId;
        java.lang.Boolean s3ObjectOverrideDefaultTags;
        java.lang.String s3ObjectStorageClass;
        java.util.Map<java.lang.String, java.lang.String> s3ObjectTags;
        java.lang.Boolean s3ObjectTagsOnly;
        java.lang.String s3Prefix;
        java.lang.String s3ServerSideEncryption;
        java.lang.Boolean snapStart;
        java.lang.Object sourcePath;
        java.lang.Boolean storeOnS3;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.lang.Number timeout;
        java.util.Map<java.lang.String, java.lang.String> timeouts;
        java.lang.String tracingMode;
        java.lang.Boolean triggerOnPackageTimestamp;
        java.lang.Object trustedEntities;
        java.lang.Boolean useExistingCloudwatchLogGroup;
        java.util.List<java.lang.String> vpcSecurityGroupIds;
        java.util.List<java.lang.String> vpcSubnetIds;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link LambdaConfig#getAllowedTriggers}
         * @param allowedTriggers Map of allowed triggers to create Lambda permissions The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder allowedTriggers(java.util.Map<java.lang.String, ? extends java.lang.Object> allowedTriggers) {
            this.allowedTriggers = (java.util.Map<java.lang.String, java.lang.Object>)allowedTriggers;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getArchitectures}
         * @param architectures Instruction set architecture for your Lambda function.
         *                      Valid values are ["x86_64"] and ["arm64"].
         * @return {@code this}
         */
        public Builder architectures(java.util.List<java.lang.String> architectures) {
            this.architectures = architectures;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getArtifactsDir}
         * @param artifactsDir Directory name where artifacts should be stored builds.
         * @return {@code this}
         */
        public Builder artifactsDir(java.lang.String artifactsDir) {
            this.artifactsDir = artifactsDir;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAssumeRolePolicyStatements}
         * @param assumeRolePolicyStatements Map of dynamic policy statements for assuming Lambda Function role (trust relationship).
         * @return {@code this}
         */
        public Builder assumeRolePolicyStatements(java.lang.Object assumeRolePolicyStatements) {
            this.assumeRolePolicyStatements = assumeRolePolicyStatements;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachAsyncEventPolicy}
         * @param attachAsyncEventPolicy Controls whether async event policy should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachAsyncEventPolicy(java.lang.Boolean attachAsyncEventPolicy) {
            this.attachAsyncEventPolicy = attachAsyncEventPolicy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachCloudwatchLogsPolicy}
         * @param attachCloudwatchLogsPolicy Controls whether CloudWatch Logs policy should be added to IAM role for Lambda Function true.
         * @return {@code this}
         */
        public Builder attachCloudwatchLogsPolicy(java.lang.Boolean attachCloudwatchLogsPolicy) {
            this.attachCloudwatchLogsPolicy = attachCloudwatchLogsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachCreateLogGroupPermission}
         * @param attachCreateLogGroupPermission Controls whether to add the create log group permission to the CloudWatch logs policy true.
         * @return {@code this}
         */
        public Builder attachCreateLogGroupPermission(java.lang.Boolean attachCreateLogGroupPermission) {
            this.attachCreateLogGroupPermission = attachCreateLogGroupPermission;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachDeadLetterPolicy}
         * @param attachDeadLetterPolicy Controls whether SNS/SQS dead letter notification policy should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachDeadLetterPolicy(java.lang.Boolean attachDeadLetterPolicy) {
            this.attachDeadLetterPolicy = attachDeadLetterPolicy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachNetworkPolicy}
         * @param attachNetworkPolicy Controls whether VPC/network policy should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachNetworkPolicy(java.lang.Boolean attachNetworkPolicy) {
            this.attachNetworkPolicy = attachNetworkPolicy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachPolicies}
         * @param attachPolicies Controls whether list of policies should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachPolicies(java.lang.Boolean attachPolicies) {
            this.attachPolicies = attachPolicies;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachPolicy}
         * @param attachPolicy Controls whether policy should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachPolicy(java.lang.Boolean attachPolicy) {
            this.attachPolicy = attachPolicy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachPolicyJson}
         * @param attachPolicyJson Controls whether policy_json should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachPolicyJson(java.lang.Boolean attachPolicyJson) {
            this.attachPolicyJson = attachPolicyJson;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachPolicyJsons}
         * @param attachPolicyJsons Controls whether policy_jsons should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachPolicyJsons(java.lang.Boolean attachPolicyJsons) {
            this.attachPolicyJsons = attachPolicyJsons;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachPolicyStatements}
         * @param attachPolicyStatements Controls whether policy_statements should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachPolicyStatements(java.lang.Boolean attachPolicyStatements) {
            this.attachPolicyStatements = attachPolicyStatements;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAttachTracingPolicy}
         * @param attachTracingPolicy Controls whether X-Ray tracing policy should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder attachTracingPolicy(java.lang.Boolean attachTracingPolicy) {
            this.attachTracingPolicy = attachTracingPolicy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getAuthorizationType}
         * @param authorizationType The type of authentication that the Lambda Function URL uses.
         *                          Set to 'AWS_IAM' to restrict access to authenticated IAM users only. Set to 'NONE' to bypass IAM authentication and create a public endpoint.
         *                          NONE
         * @return {@code this}
         */
        public Builder authorizationType(java.lang.String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getBuildInDocker}
         * @param buildInDocker Whether to build dependencies in Docker.
         * @return {@code this}
         */
        public Builder buildInDocker(java.lang.Boolean buildInDocker) {
            this.buildInDocker = buildInDocker;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCloudwatchLogsKmsKeyId}
         * @param cloudwatchLogsKmsKeyId The ARN of the KMS Key to use when encrypting log data.
         * @return {@code this}
         */
        public Builder cloudwatchLogsKmsKeyId(java.lang.String cloudwatchLogsKmsKeyId) {
            this.cloudwatchLogsKmsKeyId = cloudwatchLogsKmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCloudwatchLogsLogGroupClass}
         * @param cloudwatchLogsLogGroupClass Specified the log class of the log group.
         *                                    Possible values are: <code>STANDARD</code> or <code>INFREQUENT_ACCESS</code>
         * @return {@code this}
         */
        public Builder cloudwatchLogsLogGroupClass(java.lang.String cloudwatchLogsLogGroupClass) {
            this.cloudwatchLogsLogGroupClass = cloudwatchLogsLogGroupClass;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCloudwatchLogsRetentionInDays}
         * @param cloudwatchLogsRetentionInDays Specifies the number of days you want to retain log events in the specified log group.
         *                                      Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
         * @return {@code this}
         */
        public Builder cloudwatchLogsRetentionInDays(java.lang.Number cloudwatchLogsRetentionInDays) {
            this.cloudwatchLogsRetentionInDays = cloudwatchLogsRetentionInDays;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCloudwatchLogsSkipDestroy}
         * @param cloudwatchLogsSkipDestroy Whether to keep the log group (and any logs it may contain) at destroy time.
         * @return {@code this}
         */
        public Builder cloudwatchLogsSkipDestroy(java.lang.Boolean cloudwatchLogsSkipDestroy) {
            this.cloudwatchLogsSkipDestroy = cloudwatchLogsSkipDestroy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCloudwatchLogsTags}
         * @param cloudwatchLogsTags A map of tags to assign to the resource.
         *                           The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder cloudwatchLogsTags(java.util.Map<java.lang.String, java.lang.String> cloudwatchLogsTags) {
            this.cloudwatchLogsTags = cloudwatchLogsTags;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCodeSigningConfigArn}
         * @param codeSigningConfigArn Amazon Resource Name (ARN) for a Code Signing Configuration.
         * @return {@code this}
         */
        public Builder codeSigningConfigArn(java.lang.String codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCompatibleArchitectures}
         * @param compatibleArchitectures A list of Architectures Lambda layer is compatible with.
         *                                Currently x86_64 and arm64 can be specified.
         * @return {@code this}
         */
        public Builder compatibleArchitectures(java.util.List<java.lang.String> compatibleArchitectures) {
            this.compatibleArchitectures = compatibleArchitectures;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCompatibleRuntimes}
         * @param compatibleRuntimes A list of Runtimes this layer is compatible with.
         *                           Up to 5 runtimes can be specified.
         * @return {@code this}
         */
        public Builder compatibleRuntimes(java.util.List<java.lang.String> compatibleRuntimes) {
            this.compatibleRuntimes = compatibleRuntimes;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCors}
         * @param cors CORS settings to be used by the Lambda Function URL.
         * @return {@code this}
         */
        public Builder cors(java.lang.Object cors) {
            this.cors = cors;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreate}
         * @param create Controls whether resources should be created true.
         * @return {@code this}
         */
        public Builder create(java.lang.Boolean create) {
            this.create = create;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateAsyncEventConfig}
         * @param createAsyncEventConfig Controls whether async event configuration for Lambda Function/Alias should be created.
         * @return {@code this}
         */
        public Builder createAsyncEventConfig(java.lang.Boolean createAsyncEventConfig) {
            this.createAsyncEventConfig = createAsyncEventConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateCurrentVersionAllowedTriggers}
         * @param createCurrentVersionAllowedTriggers Whether to allow triggers on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true.
         * @return {@code this}
         */
        public Builder createCurrentVersionAllowedTriggers(java.lang.Boolean createCurrentVersionAllowedTriggers) {
            this.createCurrentVersionAllowedTriggers = createCurrentVersionAllowedTriggers;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateCurrentVersionAsyncEventConfig}
         * @param createCurrentVersionAsyncEventConfig Whether to allow async event configuration on current version of Lambda Function (this will revoke permissions from previous version because Terraform manages only current resources) true.
         * @return {@code this}
         */
        public Builder createCurrentVersionAsyncEventConfig(java.lang.Boolean createCurrentVersionAsyncEventConfig) {
            this.createCurrentVersionAsyncEventConfig = createCurrentVersionAsyncEventConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateFunction}
         * @param createFunction Controls whether Lambda Function resource should be created true.
         * @return {@code this}
         */
        public Builder createFunction(java.lang.Boolean createFunction) {
            this.createFunction = createFunction;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateLambdaFunctionUrl}
         * @param createLambdaFunctionUrl Controls whether the Lambda Function URL resource should be created.
         * @return {@code this}
         */
        public Builder createLambdaFunctionUrl(java.lang.Boolean createLambdaFunctionUrl) {
            this.createLambdaFunctionUrl = createLambdaFunctionUrl;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateLayer}
         * @param createLayer Controls whether Lambda Layer resource should be created.
         * @return {@code this}
         */
        public Builder createLayer(java.lang.Boolean createLayer) {
            this.createLayer = createLayer;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreatePackage}
         * @param createPackage Controls whether Lambda package should be created true.
         * @return {@code this}
         */
        public Builder createPackage(java.lang.Boolean createPackage) {
            this.createPackage = createPackage;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateRole}
         * @param createRole Controls whether IAM role for Lambda Function should be created true.
         * @return {@code this}
         */
        public Builder createRole(java.lang.Boolean createRole) {
            this.createRole = createRole;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateSamMetadata}
         * @param createSamMetadata Controls whether the SAM metadata null resource should be created.
         * @return {@code this}
         */
        public Builder createSamMetadata(java.lang.Boolean createSamMetadata) {
            this.createSamMetadata = createSamMetadata;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateUnqualifiedAliasAllowedTriggers}
         * @param createUnqualifiedAliasAllowedTriggers Whether to allow triggers on unqualified alias pointing to $LATEST version true.
         * @return {@code this}
         */
        public Builder createUnqualifiedAliasAllowedTriggers(java.lang.Boolean createUnqualifiedAliasAllowedTriggers) {
            this.createUnqualifiedAliasAllowedTriggers = createUnqualifiedAliasAllowedTriggers;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateUnqualifiedAliasAsyncEventConfig}
         * @param createUnqualifiedAliasAsyncEventConfig Whether to allow async event configuration on unqualified alias pointing to $LATEST version true.
         * @return {@code this}
         */
        public Builder createUnqualifiedAliasAsyncEventConfig(java.lang.Boolean createUnqualifiedAliasAsyncEventConfig) {
            this.createUnqualifiedAliasAsyncEventConfig = createUnqualifiedAliasAsyncEventConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getCreateUnqualifiedAliasLambdaFunctionUrl}
         * @param createUnqualifiedAliasLambdaFunctionUrl Whether to use unqualified alias pointing to $LATEST version in Lambda Function URL true.
         * @return {@code this}
         */
        public Builder createUnqualifiedAliasLambdaFunctionUrl(java.lang.Boolean createUnqualifiedAliasLambdaFunctionUrl) {
            this.createUnqualifiedAliasLambdaFunctionUrl = createUnqualifiedAliasLambdaFunctionUrl;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDeadLetterTargetArn}
         * @param deadLetterTargetArn The ARN of an SNS topic or SQS queue to notify when an invocation fails.
         * @return {@code this}
         */
        public Builder deadLetterTargetArn(java.lang.String deadLetterTargetArn) {
            this.deadLetterTargetArn = deadLetterTargetArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDescription}
         * @param description Description of your Lambda Function (or Layer).
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDestinationOnFailure}
         * @param destinationOnFailure Amazon Resource Name (ARN) of the destination resource for failed asynchronous invocations.
         * @return {@code this}
         */
        public Builder destinationOnFailure(java.lang.String destinationOnFailure) {
            this.destinationOnFailure = destinationOnFailure;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDestinationOnSuccess}
         * @param destinationOnSuccess Amazon Resource Name (ARN) of the destination resource for successful asynchronous invocations.
         * @return {@code this}
         */
        public Builder destinationOnSuccess(java.lang.String destinationOnSuccess) {
            this.destinationOnSuccess = destinationOnSuccess;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDockerAdditionalOptions}
         * @param dockerAdditionalOptions Additional options to pass to the docker run command (e.g. to set environment variables, volumes, etc.).
         * @return {@code this}
         */
        public Builder dockerAdditionalOptions(java.util.List<java.lang.String> dockerAdditionalOptions) {
            this.dockerAdditionalOptions = dockerAdditionalOptions;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDockerBuildRoot}
         * @param dockerBuildRoot Root dir where to build in Docker.
         * @return {@code this}
         */
        public Builder dockerBuildRoot(java.lang.String dockerBuildRoot) {
            this.dockerBuildRoot = dockerBuildRoot;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDockerEntrypoint}
         * @param dockerEntrypoint Path to the Docker entrypoint to use.
         * @return {@code this}
         */
        public Builder dockerEntrypoint(java.lang.String dockerEntrypoint) {
            this.dockerEntrypoint = dockerEntrypoint;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDockerFile}
         * @param dockerFile Path to a Dockerfile when building in Docker.
         * @return {@code this}
         */
        public Builder dockerFile(java.lang.String dockerFile) {
            this.dockerFile = dockerFile;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDockerImage}
         * @param dockerImage Docker image to use for the build.
         * @return {@code this}
         */
        public Builder dockerImage(java.lang.String dockerImage) {
            this.dockerImage = dockerImage;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDockerPipCache}
         * @param dockerPipCache Whether to mount a shared pip cache folder into docker environment or not.
         * @return {@code this}
         */
        public Builder dockerPipCache(java.lang.Object dockerPipCache) {
            this.dockerPipCache = dockerPipCache;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDockerWithSshAgent}
         * @param dockerWithSshAgent Whether to pass SSH_AUTH_SOCK into docker environment or not.
         * @return {@code this}
         */
        public Builder dockerWithSshAgent(java.lang.Boolean dockerWithSshAgent) {
            this.dockerWithSshAgent = dockerWithSshAgent;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getEnvironmentVariables}
         * @param environmentVariables A map that defines environment variables for the Lambda Function.
         *                             The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder environmentVariables(java.util.Map<java.lang.String, java.lang.String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getEphemeralStorageSize}
         * @param ephemeralStorageSize Amount of ephemeral storage (/tmp) in MB your Lambda Function can use at runtime.
         *                             Valid value between 512 MB to 10,240 MB (10 GB).
         *                             512
         * @return {@code this}
         */
        public Builder ephemeralStorageSize(java.lang.Number ephemeralStorageSize) {
            this.ephemeralStorageSize = ephemeralStorageSize;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getEventSourceMapping}
         * @param eventSourceMapping Map of event source mapping.
         * @return {@code this}
         */
        public Builder eventSourceMapping(java.lang.Object eventSourceMapping) {
            this.eventSourceMapping = eventSourceMapping;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getFileSystemArn}
         * @param fileSystemArn The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
         * @return {@code this}
         */
        public Builder fileSystemArn(java.lang.String fileSystemArn) {
            this.fileSystemArn = fileSystemArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getFileSystemLocalMountPath}
         * @param fileSystemLocalMountPath The path where the function can access the file system, starting with /mnt/.
         * @return {@code this}
         */
        public Builder fileSystemLocalMountPath(java.lang.String fileSystemLocalMountPath) {
            this.fileSystemLocalMountPath = fileSystemLocalMountPath;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getFunctionName}
         * @param functionName A unique name for your Lambda Function.
         * @return {@code this}
         */
        public Builder functionName(java.lang.String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getFunctionTags}
         * @param functionTags A map of tags to assign only to the lambda function The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder functionTags(java.util.Map<java.lang.String, java.lang.String> functionTags) {
            this.functionTags = functionTags;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getHandler}
         * @param handler Lambda Function entrypoint in your code.
         * @return {@code this}
         */
        public Builder handler(java.lang.String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getHashExtra}
         * @param hashExtra The string to add into hashing function.
         *                  Useful when building same source path for different functions.
         * @return {@code this}
         */
        public Builder hashExtra(java.lang.String hashExtra) {
            this.hashExtra = hashExtra;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getIgnoreSourceCodeHash}
         * @param ignoreSourceCodeHash Whether to ignore changes to the function's source code hash.
         *                             Set to true if you manage infrastructure and code deployments separately.
         * @return {@code this}
         */
        public Builder ignoreSourceCodeHash(java.lang.Boolean ignoreSourceCodeHash) {
            this.ignoreSourceCodeHash = ignoreSourceCodeHash;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getImageConfigCommand}
         * @param imageConfigCommand The CMD for the docker image.
         * @return {@code this}
         */
        public Builder imageConfigCommand(java.util.List<java.lang.String> imageConfigCommand) {
            this.imageConfigCommand = imageConfigCommand;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getImageConfigEntryPoint}
         * @param imageConfigEntryPoint The ENTRYPOINT for the docker image.
         * @return {@code this}
         */
        public Builder imageConfigEntryPoint(java.util.List<java.lang.String> imageConfigEntryPoint) {
            this.imageConfigEntryPoint = imageConfigEntryPoint;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getImageConfigWorkingDirectory}
         * @param imageConfigWorkingDirectory The working directory for the docker image.
         * @return {@code this}
         */
        public Builder imageConfigWorkingDirectory(java.lang.String imageConfigWorkingDirectory) {
            this.imageConfigWorkingDirectory = imageConfigWorkingDirectory;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getImageUri}
         * @param imageUri The ECR image URI containing the function's deployment package.
         * @return {@code this}
         */
        public Builder imageUri(java.lang.String imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getInvokeMode}
         * @param invokeMode Invoke mode of the Lambda Function URL.
         *                   Valid values are BUFFERED (default) and RESPONSE_STREAM.
         * @return {@code this}
         */
        public Builder invokeMode(java.lang.String invokeMode) {
            this.invokeMode = invokeMode;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getKmsKeyArn}
         * @param kmsKeyArn The ARN of KMS key to use by your Lambda Function.
         * @return {@code this}
         */
        public Builder kmsKeyArn(java.lang.String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLambdaAtEdge}
         * @param lambdaAtEdge Set this to true if using Lambda&#64;Edge, to enable publishing, limit the timeout, and allow edgelambda.amazonaws.com to invoke the function.
         * @return {@code this}
         */
        public Builder lambdaAtEdge(java.lang.Boolean lambdaAtEdge) {
            this.lambdaAtEdge = lambdaAtEdge;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLambdaAtEdgeLogsAllRegions}
         * @param lambdaAtEdgeLogsAllRegions Whether to specify a wildcard in IAM policy used by Lambda&#64;Edge to allow logging in all regions true.
         * @return {@code this}
         */
        public Builder lambdaAtEdgeLogsAllRegions(java.lang.Boolean lambdaAtEdgeLogsAllRegions) {
            this.lambdaAtEdgeLogsAllRegions = lambdaAtEdgeLogsAllRegions;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLambdaRole}
         * @param lambdaRole IAM role ARN attached to the Lambda Function.
         *                   This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See Lambda Permission Model for more details.
         * @return {@code this}
         */
        public Builder lambdaRole(java.lang.String lambdaRole) {
            this.lambdaRole = lambdaRole;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLayerName}
         * @param layerName Name of Lambda Layer to create.
         * @return {@code this}
         */
        public Builder layerName(java.lang.String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLayers}
         * @param layers List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function.
         * @return {@code this}
         */
        public Builder layers(java.util.List<java.lang.String> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLayerSkipDestroy}
         * @param layerSkipDestroy Whether to retain the old version of a previously deployed Lambda Layer.
         * @return {@code this}
         */
        public Builder layerSkipDestroy(java.lang.Boolean layerSkipDestroy) {
            this.layerSkipDestroy = layerSkipDestroy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLicenseInfo}
         * @param licenseInfo License info for your Lambda Layer.
         *                    Eg, MIT or full url of a license.
         * @return {@code this}
         */
        public Builder licenseInfo(java.lang.String licenseInfo) {
            this.licenseInfo = licenseInfo;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLocalExistingPackage}
         * @param localExistingPackage The absolute path to an existing zip-file to use.
         * @return {@code this}
         */
        public Builder localExistingPackage(java.lang.String localExistingPackage) {
            this.localExistingPackage = localExistingPackage;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLoggingApplicationLogLevel}
         * @param loggingApplicationLogLevel The application log level of the Lambda Function.
         *                                   Valid values are "TRACE", "DEBUG", "INFO", "WARN", "ERROR", or "FATAL".
         *                                   INFO
         * @return {@code this}
         */
        public Builder loggingApplicationLogLevel(java.lang.String loggingApplicationLogLevel) {
            this.loggingApplicationLogLevel = loggingApplicationLogLevel;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLoggingLogFormat}
         * @param loggingLogFormat The log format of the Lambda Function.
         *                         Valid values are "JSON" or "Text".
         *                         Text
         * @return {@code this}
         */
        public Builder loggingLogFormat(java.lang.String loggingLogFormat) {
            this.loggingLogFormat = loggingLogFormat;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLoggingLogGroup}
         * @param loggingLogGroup The CloudWatch log group to send logs to.
         * @return {@code this}
         */
        public Builder loggingLogGroup(java.lang.String loggingLogGroup) {
            this.loggingLogGroup = loggingLogGroup;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getLoggingSystemLogLevel}
         * @param loggingSystemLogLevel The system log level of the Lambda Function.
         *                              Valid values are "DEBUG", "INFO", or "WARN".
         *                              INFO
         * @return {@code this}
         */
        public Builder loggingSystemLogLevel(java.lang.String loggingSystemLogLevel) {
            this.loggingSystemLogLevel = loggingSystemLogLevel;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getMaximumEventAgeInSeconds}
         * @param maximumEventAgeInSeconds Maximum age of a request that Lambda sends to a function for processing in seconds.
         *                                 Valid values between 60 and 21600.
         * @return {@code this}
         */
        public Builder maximumEventAgeInSeconds(java.lang.Number maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getMaximumRetryAttempts}
         * @param maximumRetryAttempts Maximum number of times to retry when the function returns an error.
         *                             Valid values between 0 and 2. Defaults to 2.
         * @return {@code this}
         */
        public Builder maximumRetryAttempts(java.lang.Number maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getMemorySize}
         * @param memorySize Amount of memory in MB your Lambda Function can use at runtime.
         *                   Valid value between 128 MB to 10,240 MB (10 GB), in 64 MB increments.
         *                   128
         * @return {@code this}
         */
        public Builder memorySize(java.lang.Number memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getNumberOfPolicies}
         * @param numberOfPolicies Number of policies to attach to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder numberOfPolicies(java.lang.Number numberOfPolicies) {
            this.numberOfPolicies = numberOfPolicies;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getNumberOfPolicyJsons}
         * @param numberOfPolicyJsons Number of policies JSON to attach to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder numberOfPolicyJsons(java.lang.Number numberOfPolicyJsons) {
            this.numberOfPolicyJsons = numberOfPolicyJsons;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPackageType}
         * @param packageType The Lambda deployment package type.
         *                    Valid options: Zip or Image
         *                    Zip
         * @return {@code this}
         */
        public Builder packageType(java.lang.String packageType) {
            this.packageType = packageType;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPolicies}
         * @param policies List of policy statements ARN to attach to Lambda Function role.
         * @return {@code this}
         */
        public Builder policies(java.util.List<java.lang.String> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPolicy}
         * @param policy An additional policy document ARN to attach to the Lambda Function role.
         * @return {@code this}
         */
        public Builder policy(java.lang.String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPolicyJson}
         * @param policyJson An additional policy document as JSON to attach to the Lambda Function role.
         * @return {@code this}
         */
        public Builder policyJson(java.lang.String policyJson) {
            this.policyJson = policyJson;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPolicyJsons}
         * @param policyJsons List of additional policy documents as JSON to attach to Lambda Function role.
         * @return {@code this}
         */
        public Builder policyJsons(java.util.List<java.lang.String> policyJsons) {
            this.policyJsons = policyJsons;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPolicyName}
         * @param policyName IAM policy name.
         *                   It override the default value, which is the same as role_name
         * @return {@code this}
         */
        public Builder policyName(java.lang.String policyName) {
            this.policyName = policyName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPolicyPath}
         * @param policyPath Path of policies to that should be added to IAM role for Lambda Function.
         * @return {@code this}
         */
        public Builder policyPath(java.lang.String policyPath) {
            this.policyPath = policyPath;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPolicyStatements}
         * @param policyStatements Map of dynamic policy statements to attach to Lambda Function role.
         * @return {@code this}
         */
        public Builder policyStatements(java.lang.Object policyStatements) {
            this.policyStatements = policyStatements;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getProvisionedConcurrentExecutions}
         * @param provisionedConcurrentExecutions Amount of capacity to allocate.
         *                                        Set to 1 or greater to enable, or set to 0 to disable provisioned concurrency.
         *                                        -1
         * @return {@code this}
         */
        public Builder provisionedConcurrentExecutions(java.lang.Number provisionedConcurrentExecutions) {
            this.provisionedConcurrentExecutions = provisionedConcurrentExecutions;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPublish}
         * @param publish Whether to publish creation/change as new Lambda Function Version.
         * @return {@code this}
         */
        public Builder publish(java.lang.Boolean publish) {
            this.publish = publish;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getPutinKhuylo}
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
         * Sets the value of {@link LambdaConfig#getRecreateMissingPackage}
         * @param recreateMissingPackage Whether to recreate missing Lambda package if it is missing locally or not true.
         * @return {@code this}
         */
        public Builder recreateMissingPackage(java.lang.Boolean recreateMissingPackage) {
            this.recreateMissingPackage = recreateMissingPackage;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getReplacementSecurityGroupIds}
         * @param replacementSecurityGroupIds (Optional) List of security group IDs to assign to orphaned Lambda function network interfaces upon destruction.
         *                                    replace_security_groups_on_destroy must be set to true to use this attribute.
         * @return {@code this}
         */
        public Builder replacementSecurityGroupIds(java.util.List<java.lang.String> replacementSecurityGroupIds) {
            this.replacementSecurityGroupIds = replacementSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getReplaceSecurityGroupsOnDestroy}
         * @param replaceSecurityGroupsOnDestroy (Optional) When true, all security groups defined in vpc_security_group_ids will be replaced with the default security group after the function is destroyed.
         *                                       Set the replacement_security_group_ids variable to use a custom list of security groups for replacement instead.
         * @return {@code this}
         */
        public Builder replaceSecurityGroupsOnDestroy(java.lang.Boolean replaceSecurityGroupsOnDestroy) {
            this.replaceSecurityGroupsOnDestroy = replaceSecurityGroupsOnDestroy;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getReservedConcurrentExecutions}
         * @param reservedConcurrentExecutions The amount of reserved concurrent executions for this Lambda Function.
         *                                     A value of 0 disables Lambda Function from being triggered and -1 removes any concurrency limitations. Defaults to Unreserved Concurrency Limits -1.
         *                                     -1
         * @return {@code this}
         */
        public Builder reservedConcurrentExecutions(java.lang.Number reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRoleDescription}
         * @param roleDescription Description of IAM role to use for Lambda Function.
         * @return {@code this}
         */
        public Builder roleDescription(java.lang.String roleDescription) {
            this.roleDescription = roleDescription;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRoleForceDetachPolicies}
         * @param roleForceDetachPolicies Specifies to force detaching any policies the IAM role has before destroying it.
         *                                true
         * @return {@code this}
         */
        public Builder roleForceDetachPolicies(java.lang.Boolean roleForceDetachPolicies) {
            this.roleForceDetachPolicies = roleForceDetachPolicies;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRoleMaximumSessionDuration}
         * @param roleMaximumSessionDuration Maximum session duration, in seconds, for the IAM role 3.600.
         * @return {@code this}
         */
        public Builder roleMaximumSessionDuration(java.lang.Number roleMaximumSessionDuration) {
            this.roleMaximumSessionDuration = roleMaximumSessionDuration;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRoleName}
         * @param roleName Name of IAM role to use for Lambda Function.
         * @return {@code this}
         */
        public Builder roleName(java.lang.String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRolePath}
         * @param rolePath Path of IAM role to use for Lambda Function.
         * @return {@code this}
         */
        public Builder rolePath(java.lang.String rolePath) {
            this.rolePath = rolePath;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRolePermissionsBoundary}
         * @param rolePermissionsBoundary The ARN of the policy that is used to set the permissions boundary for the IAM role used by Lambda Function.
         * @return {@code this}
         */
        public Builder rolePermissionsBoundary(java.lang.String rolePermissionsBoundary) {
            this.rolePermissionsBoundary = rolePermissionsBoundary;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRoleTags}
         * @param roleTags A map of tags to assign to IAM role The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder roleTags(java.util.Map<java.lang.String, java.lang.String> roleTags) {
            this.roleTags = roleTags;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getRuntime}
         * @param runtime Lambda Function runtime.
         * @return {@code this}
         */
        public Builder runtime(java.lang.String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3Acl}
         * @param s3Acl The canned ACL to apply.
         *              Valid values are private, public-read, public-read-write, aws-exec-read, authenticated-read, bucket-owner-read, and bucket-owner-full-control. Defaults to private.
         *              private
         * @return {@code this}
         */
        public Builder s3Acl(java.lang.String s3Acl) {
            this.s3Acl = s3Acl;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3Bucket}
         * @param s3Bucket S3 bucket to store artifacts.
         * @return {@code this}
         */
        public Builder s3Bucket(java.lang.String s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3ExistingPackage}
         * @param s3ExistingPackage The S3 bucket object with keys bucket, key, version pointing to an existing zip-file to use The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder s3ExistingPackage(java.util.Map<java.lang.String, java.lang.String> s3ExistingPackage) {
            this.s3ExistingPackage = s3ExistingPackage;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3KmsKeyId}
         * @param s3KmsKeyId Specifies a custom KMS key to use for S3 object encryption.
         * @return {@code this}
         */
        public Builder s3KmsKeyId(java.lang.String s3KmsKeyId) {
            this.s3KmsKeyId = s3KmsKeyId;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3ObjectOverrideDefaultTags}
         * @param s3ObjectOverrideDefaultTags Whether to override the default_tags from provider?.
         *                                    NB: S3 objects support a maximum of 10 tags.
         * @return {@code this}
         */
        public Builder s3ObjectOverrideDefaultTags(java.lang.Boolean s3ObjectOverrideDefaultTags) {
            this.s3ObjectOverrideDefaultTags = s3ObjectOverrideDefaultTags;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3ObjectStorageClass}
         * @param s3ObjectStorageClass Specifies the desired Storage Class for the artifact uploaded to S3.
         *                             Can be either STANDARD, REDUCED_REDUNDANCY, ONEZONE_IA, INTELLIGENT_TIERING, or STANDARD_IA.
         *                             ONEZONE_IA
         * @return {@code this}
         */
        public Builder s3ObjectStorageClass(java.lang.String s3ObjectStorageClass) {
            this.s3ObjectStorageClass = s3ObjectStorageClass;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3ObjectTags}
         * @param s3ObjectTags A map of tags to assign to S3 bucket object.
         *                     The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder s3ObjectTags(java.util.Map<java.lang.String, java.lang.String> s3ObjectTags) {
            this.s3ObjectTags = s3ObjectTags;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3ObjectTagsOnly}
         * @param s3ObjectTagsOnly Set to true to not merge tags with s3_object_tags.
         *                         Useful to avoid breaching S3 Object 10 tag limit.
         * @return {@code this}
         */
        public Builder s3ObjectTagsOnly(java.lang.Boolean s3ObjectTagsOnly) {
            this.s3ObjectTagsOnly = s3ObjectTagsOnly;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3Prefix}
         * @param s3Prefix Directory name where artifacts should be stored in the S3 bucket.
         *                 If unset, the path from <code>artifacts_dir</code> is used
         * @return {@code this}
         */
        public Builder s3Prefix(java.lang.String s3Prefix) {
            this.s3Prefix = s3Prefix;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getS3ServerSideEncryption}
         * @param s3ServerSideEncryption Specifies server-side encryption of the object in S3.
         *                               Valid values are "AES256" and "aws:kms".
         * @return {@code this}
         */
        public Builder s3ServerSideEncryption(java.lang.String s3ServerSideEncryption) {
            this.s3ServerSideEncryption = s3ServerSideEncryption;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getSnapStart}
         * @param snapStart (Optional) Snap start settings for low-latency startups.
         * @return {@code this}
         */
        public Builder snapStart(java.lang.Boolean snapStart) {
            this.snapStart = snapStart;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getSourcePath}
         * @param sourcePath The absolute path to a local file or directory containing your Lambda source code.
         * @return {@code this}
         */
        public Builder sourcePath(java.lang.Object sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getStoreOnS3}
         * @param storeOnS3 Whether to store produced artifacts on S3 or locally.
         * @return {@code this}
         */
        public Builder storeOnS3(java.lang.Boolean storeOnS3) {
            this.storeOnS3 = storeOnS3;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getTags}
         * @param tags A map of tags to assign to resources.
         *             The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getTimeout}
         * @param timeout The amount of time your Lambda Function has to run in seconds.
         *                3
         * @return {@code this}
         */
        public Builder timeout(java.lang.Number timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getTimeouts}
         * @param timeouts Define maximum timeout for creating, updating, and deleting Lambda Function resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder timeouts(java.util.Map<java.lang.String, java.lang.String> timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getTracingMode}
         * @param tracingMode Tracing mode of the Lambda Function.
         *                    Valid value can be either PassThrough or Active.
         * @return {@code this}
         */
        public Builder tracingMode(java.lang.String tracingMode) {
            this.tracingMode = tracingMode;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getTriggerOnPackageTimestamp}
         * @param triggerOnPackageTimestamp Whether to recreate the Lambda package if the timestamp changes true.
         * @return {@code this}
         */
        public Builder triggerOnPackageTimestamp(java.lang.Boolean triggerOnPackageTimestamp) {
            this.triggerOnPackageTimestamp = triggerOnPackageTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getTrustedEntities}
         * @param trustedEntities List of additional trusted entities for assuming Lambda Function role (trust relationship).
         * @return {@code this}
         */
        public Builder trustedEntities(java.lang.Object trustedEntities) {
            this.trustedEntities = trustedEntities;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getUseExistingCloudwatchLogGroup}
         * @param useExistingCloudwatchLogGroup Whether to use an existing CloudWatch log group or create new.
         * @return {@code this}
         */
        public Builder useExistingCloudwatchLogGroup(java.lang.Boolean useExistingCloudwatchLogGroup) {
            this.useExistingCloudwatchLogGroup = useExistingCloudwatchLogGroup;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getVpcSecurityGroupIds}
         * @param vpcSecurityGroupIds List of security group ids when Lambda Function should run in the VPC.
         * @return {@code this}
         */
        public Builder vpcSecurityGroupIds(java.util.List<java.lang.String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getVpcSubnetIds}
         * @param vpcSubnetIds List of subnet ids when Lambda Function should run in the VPC.
         *                     Usually private or intra subnets.
         * @return {@code this}
         */
        public Builder vpcSubnetIds(java.util.List<java.lang.String> vpcSubnetIds) {
            this.vpcSubnetIds = vpcSubnetIds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getDependsOn}
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
         * Sets the value of {@link LambdaConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link LambdaConfig#getProviders}
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
         * Sets the value of {@link LambdaConfig#getSkipAssetCreationFromLocalModules}
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
         * @return a new instance of {@link LambdaConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LambdaConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaConfig {
        private final java.util.Map<java.lang.String, java.lang.Object> allowedTriggers;
        private final java.util.List<java.lang.String> architectures;
        private final java.lang.String artifactsDir;
        private final java.lang.Object assumeRolePolicyStatements;
        private final java.lang.Boolean attachAsyncEventPolicy;
        private final java.lang.Boolean attachCloudwatchLogsPolicy;
        private final java.lang.Boolean attachCreateLogGroupPermission;
        private final java.lang.Boolean attachDeadLetterPolicy;
        private final java.lang.Boolean attachNetworkPolicy;
        private final java.lang.Boolean attachPolicies;
        private final java.lang.Boolean attachPolicy;
        private final java.lang.Boolean attachPolicyJson;
        private final java.lang.Boolean attachPolicyJsons;
        private final java.lang.Boolean attachPolicyStatements;
        private final java.lang.Boolean attachTracingPolicy;
        private final java.lang.String authorizationType;
        private final java.lang.Boolean buildInDocker;
        private final java.lang.String cloudwatchLogsKmsKeyId;
        private final java.lang.String cloudwatchLogsLogGroupClass;
        private final java.lang.Number cloudwatchLogsRetentionInDays;
        private final java.lang.Boolean cloudwatchLogsSkipDestroy;
        private final java.util.Map<java.lang.String, java.lang.String> cloudwatchLogsTags;
        private final java.lang.String codeSigningConfigArn;
        private final java.util.List<java.lang.String> compatibleArchitectures;
        private final java.util.List<java.lang.String> compatibleRuntimes;
        private final java.lang.Object cors;
        private final java.lang.Boolean create;
        private final java.lang.Boolean createAsyncEventConfig;
        private final java.lang.Boolean createCurrentVersionAllowedTriggers;
        private final java.lang.Boolean createCurrentVersionAsyncEventConfig;
        private final java.lang.Boolean createFunction;
        private final java.lang.Boolean createLambdaFunctionUrl;
        private final java.lang.Boolean createLayer;
        private final java.lang.Boolean createPackage;
        private final java.lang.Boolean createRole;
        private final java.lang.Boolean createSamMetadata;
        private final java.lang.Boolean createUnqualifiedAliasAllowedTriggers;
        private final java.lang.Boolean createUnqualifiedAliasAsyncEventConfig;
        private final java.lang.Boolean createUnqualifiedAliasLambdaFunctionUrl;
        private final java.lang.String deadLetterTargetArn;
        private final java.lang.String description;
        private final java.lang.String destinationOnFailure;
        private final java.lang.String destinationOnSuccess;
        private final java.util.List<java.lang.String> dockerAdditionalOptions;
        private final java.lang.String dockerBuildRoot;
        private final java.lang.String dockerEntrypoint;
        private final java.lang.String dockerFile;
        private final java.lang.String dockerImage;
        private final java.lang.Object dockerPipCache;
        private final java.lang.Boolean dockerWithSshAgent;
        private final java.util.Map<java.lang.String, java.lang.String> environmentVariables;
        private final java.lang.Number ephemeralStorageSize;
        private final java.lang.Object eventSourceMapping;
        private final java.lang.String fileSystemArn;
        private final java.lang.String fileSystemLocalMountPath;
        private final java.lang.String functionName;
        private final java.util.Map<java.lang.String, java.lang.String> functionTags;
        private final java.lang.String handler;
        private final java.lang.String hashExtra;
        private final java.lang.Boolean ignoreSourceCodeHash;
        private final java.util.List<java.lang.String> imageConfigCommand;
        private final java.util.List<java.lang.String> imageConfigEntryPoint;
        private final java.lang.String imageConfigWorkingDirectory;
        private final java.lang.String imageUri;
        private final java.lang.String invokeMode;
        private final java.lang.String kmsKeyArn;
        private final java.lang.Boolean lambdaAtEdge;
        private final java.lang.Boolean lambdaAtEdgeLogsAllRegions;
        private final java.lang.String lambdaRole;
        private final java.lang.String layerName;
        private final java.util.List<java.lang.String> layers;
        private final java.lang.Boolean layerSkipDestroy;
        private final java.lang.String licenseInfo;
        private final java.lang.String localExistingPackage;
        private final java.lang.String loggingApplicationLogLevel;
        private final java.lang.String loggingLogFormat;
        private final java.lang.String loggingLogGroup;
        private final java.lang.String loggingSystemLogLevel;
        private final java.lang.Number maximumEventAgeInSeconds;
        private final java.lang.Number maximumRetryAttempts;
        private final java.lang.Number memorySize;
        private final java.lang.Number numberOfPolicies;
        private final java.lang.Number numberOfPolicyJsons;
        private final java.lang.String packageType;
        private final java.util.List<java.lang.String> policies;
        private final java.lang.String policy;
        private final java.lang.String policyJson;
        private final java.util.List<java.lang.String> policyJsons;
        private final java.lang.String policyName;
        private final java.lang.String policyPath;
        private final java.lang.Object policyStatements;
        private final java.lang.Number provisionedConcurrentExecutions;
        private final java.lang.Boolean publish;
        private final java.lang.Boolean putinKhuylo;
        private final java.lang.Boolean recreateMissingPackage;
        private final java.util.List<java.lang.String> replacementSecurityGroupIds;
        private final java.lang.Boolean replaceSecurityGroupsOnDestroy;
        private final java.lang.Number reservedConcurrentExecutions;
        private final java.lang.String roleDescription;
        private final java.lang.Boolean roleForceDetachPolicies;
        private final java.lang.Number roleMaximumSessionDuration;
        private final java.lang.String roleName;
        private final java.lang.String rolePath;
        private final java.lang.String rolePermissionsBoundary;
        private final java.util.Map<java.lang.String, java.lang.String> roleTags;
        private final java.lang.String runtime;
        private final java.lang.String s3Acl;
        private final java.lang.String s3Bucket;
        private final java.util.Map<java.lang.String, java.lang.String> s3ExistingPackage;
        private final java.lang.String s3KmsKeyId;
        private final java.lang.Boolean s3ObjectOverrideDefaultTags;
        private final java.lang.String s3ObjectStorageClass;
        private final java.util.Map<java.lang.String, java.lang.String> s3ObjectTags;
        private final java.lang.Boolean s3ObjectTagsOnly;
        private final java.lang.String s3Prefix;
        private final java.lang.String s3ServerSideEncryption;
        private final java.lang.Boolean snapStart;
        private final java.lang.Object sourcePath;
        private final java.lang.Boolean storeOnS3;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number timeout;
        private final java.util.Map<java.lang.String, java.lang.String> timeouts;
        private final java.lang.String tracingMode;
        private final java.lang.Boolean triggerOnPackageTimestamp;
        private final java.lang.Object trustedEntities;
        private final java.lang.Boolean useExistingCloudwatchLogGroup;
        private final java.util.List<java.lang.String> vpcSecurityGroupIds;
        private final java.util.List<java.lang.String> vpcSubnetIds;
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
            this.allowedTriggers = software.amazon.jsii.Kernel.get(this, "allowedTriggers", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
            this.architectures = software.amazon.jsii.Kernel.get(this, "architectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.artifactsDir = software.amazon.jsii.Kernel.get(this, "artifactsDir", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.assumeRolePolicyStatements = software.amazon.jsii.Kernel.get(this, "assumeRolePolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.attachAsyncEventPolicy = software.amazon.jsii.Kernel.get(this, "attachAsyncEventPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachCloudwatchLogsPolicy = software.amazon.jsii.Kernel.get(this, "attachCloudwatchLogsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachCreateLogGroupPermission = software.amazon.jsii.Kernel.get(this, "attachCreateLogGroupPermission", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachDeadLetterPolicy = software.amazon.jsii.Kernel.get(this, "attachDeadLetterPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachNetworkPolicy = software.amazon.jsii.Kernel.get(this, "attachNetworkPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicies = software.amazon.jsii.Kernel.get(this, "attachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicy = software.amazon.jsii.Kernel.get(this, "attachPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyJson = software.amazon.jsii.Kernel.get(this, "attachPolicyJson", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyJsons = software.amazon.jsii.Kernel.get(this, "attachPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachPolicyStatements = software.amazon.jsii.Kernel.get(this, "attachPolicyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.attachTracingPolicy = software.amazon.jsii.Kernel.get(this, "attachTracingPolicy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.authorizationType = software.amazon.jsii.Kernel.get(this, "authorizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.buildInDocker = software.amazon.jsii.Kernel.get(this, "buildInDocker", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.cloudwatchLogsKmsKeyId = software.amazon.jsii.Kernel.get(this, "cloudwatchLogsKmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogsLogGroupClass = software.amazon.jsii.Kernel.get(this, "cloudwatchLogsLogGroupClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cloudwatchLogsRetentionInDays = software.amazon.jsii.Kernel.get(this, "cloudwatchLogsRetentionInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.cloudwatchLogsSkipDestroy = software.amazon.jsii.Kernel.get(this, "cloudwatchLogsSkipDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.cloudwatchLogsTags = software.amazon.jsii.Kernel.get(this, "cloudwatchLogsTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.codeSigningConfigArn = software.amazon.jsii.Kernel.get(this, "codeSigningConfigArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.compatibleArchitectures = software.amazon.jsii.Kernel.get(this, "compatibleArchitectures", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.compatibleRuntimes = software.amazon.jsii.Kernel.get(this, "compatibleRuntimes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.cors = software.amazon.jsii.Kernel.get(this, "cors", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.create = software.amazon.jsii.Kernel.get(this, "create", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createAsyncEventConfig = software.amazon.jsii.Kernel.get(this, "createAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createCurrentVersionAllowedTriggers = software.amazon.jsii.Kernel.get(this, "createCurrentVersionAllowedTriggers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createCurrentVersionAsyncEventConfig = software.amazon.jsii.Kernel.get(this, "createCurrentVersionAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createFunction = software.amazon.jsii.Kernel.get(this, "createFunction", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createLambdaFunctionUrl = software.amazon.jsii.Kernel.get(this, "createLambdaFunctionUrl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createLayer = software.amazon.jsii.Kernel.get(this, "createLayer", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createPackage = software.amazon.jsii.Kernel.get(this, "createPackage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createRole = software.amazon.jsii.Kernel.get(this, "createRole", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createSamMetadata = software.amazon.jsii.Kernel.get(this, "createSamMetadata", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createUnqualifiedAliasAllowedTriggers = software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasAllowedTriggers", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createUnqualifiedAliasAsyncEventConfig = software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasAsyncEventConfig", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.createUnqualifiedAliasLambdaFunctionUrl = software.amazon.jsii.Kernel.get(this, "createUnqualifiedAliasLambdaFunctionUrl", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.deadLetterTargetArn = software.amazon.jsii.Kernel.get(this, "deadLetterTargetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationOnFailure = software.amazon.jsii.Kernel.get(this, "destinationOnFailure", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.destinationOnSuccess = software.amazon.jsii.Kernel.get(this, "destinationOnSuccess", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dockerAdditionalOptions = software.amazon.jsii.Kernel.get(this, "dockerAdditionalOptions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.dockerBuildRoot = software.amazon.jsii.Kernel.get(this, "dockerBuildRoot", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dockerEntrypoint = software.amazon.jsii.Kernel.get(this, "dockerEntrypoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dockerFile = software.amazon.jsii.Kernel.get(this, "dockerFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dockerImage = software.amazon.jsii.Kernel.get(this, "dockerImage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dockerPipCache = software.amazon.jsii.Kernel.get(this, "dockerPipCache", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.dockerWithSshAgent = software.amazon.jsii.Kernel.get(this, "dockerWithSshAgent", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.environmentVariables = software.amazon.jsii.Kernel.get(this, "environmentVariables", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ephemeralStorageSize = software.amazon.jsii.Kernel.get(this, "ephemeralStorageSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.eventSourceMapping = software.amazon.jsii.Kernel.get(this, "eventSourceMapping", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.fileSystemArn = software.amazon.jsii.Kernel.get(this, "fileSystemArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fileSystemLocalMountPath = software.amazon.jsii.Kernel.get(this, "fileSystemLocalMountPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.functionName = software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.functionTags = software.amazon.jsii.Kernel.get(this, "functionTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.handler = software.amazon.jsii.Kernel.get(this, "handler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hashExtra = software.amazon.jsii.Kernel.get(this, "hashExtra", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ignoreSourceCodeHash = software.amazon.jsii.Kernel.get(this, "ignoreSourceCodeHash", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.imageConfigCommand = software.amazon.jsii.Kernel.get(this, "imageConfigCommand", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.imageConfigEntryPoint = software.amazon.jsii.Kernel.get(this, "imageConfigEntryPoint", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.imageConfigWorkingDirectory = software.amazon.jsii.Kernel.get(this, "imageConfigWorkingDirectory", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.imageUri = software.amazon.jsii.Kernel.get(this, "imageUri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.invokeMode = software.amazon.jsii.Kernel.get(this, "invokeMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.kmsKeyArn = software.amazon.jsii.Kernel.get(this, "kmsKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lambdaAtEdge = software.amazon.jsii.Kernel.get(this, "lambdaAtEdge", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.lambdaAtEdgeLogsAllRegions = software.amazon.jsii.Kernel.get(this, "lambdaAtEdgeLogsAllRegions", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.lambdaRole = software.amazon.jsii.Kernel.get(this, "lambdaRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.layerName = software.amazon.jsii.Kernel.get(this, "layerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.layers = software.amazon.jsii.Kernel.get(this, "layers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.layerSkipDestroy = software.amazon.jsii.Kernel.get(this, "layerSkipDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.licenseInfo = software.amazon.jsii.Kernel.get(this, "licenseInfo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.localExistingPackage = software.amazon.jsii.Kernel.get(this, "localExistingPackage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingApplicationLogLevel = software.amazon.jsii.Kernel.get(this, "loggingApplicationLogLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingLogFormat = software.amazon.jsii.Kernel.get(this, "loggingLogFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingLogGroup = software.amazon.jsii.Kernel.get(this, "loggingLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.loggingSystemLogLevel = software.amazon.jsii.Kernel.get(this, "loggingSystemLogLevel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maximumEventAgeInSeconds = software.amazon.jsii.Kernel.get(this, "maximumEventAgeInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maximumRetryAttempts = software.amazon.jsii.Kernel.get(this, "maximumRetryAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.memorySize = software.amazon.jsii.Kernel.get(this, "memorySize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.numberOfPolicies = software.amazon.jsii.Kernel.get(this, "numberOfPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.numberOfPolicyJsons = software.amazon.jsii.Kernel.get(this, "numberOfPolicyJsons", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.packageType = software.amazon.jsii.Kernel.get(this, "packageType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policies = software.amazon.jsii.Kernel.get(this, "policies", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policy = software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyJson = software.amazon.jsii.Kernel.get(this, "policyJson", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyJsons = software.amazon.jsii.Kernel.get(this, "policyJsons", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.policyName = software.amazon.jsii.Kernel.get(this, "policyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyPath = software.amazon.jsii.Kernel.get(this, "policyPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.policyStatements = software.amazon.jsii.Kernel.get(this, "policyStatements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.provisionedConcurrentExecutions = software.amazon.jsii.Kernel.get(this, "provisionedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.publish = software.amazon.jsii.Kernel.get(this, "publish", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.putinKhuylo = software.amazon.jsii.Kernel.get(this, "putinKhuylo", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.recreateMissingPackage = software.amazon.jsii.Kernel.get(this, "recreateMissingPackage", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.replacementSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "replacementSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.replaceSecurityGroupsOnDestroy = software.amazon.jsii.Kernel.get(this, "replaceSecurityGroupsOnDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.reservedConcurrentExecutions = software.amazon.jsii.Kernel.get(this, "reservedConcurrentExecutions", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.roleDescription = software.amazon.jsii.Kernel.get(this, "roleDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleForceDetachPolicies = software.amazon.jsii.Kernel.get(this, "roleForceDetachPolicies", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.roleMaximumSessionDuration = software.amazon.jsii.Kernel.get(this, "roleMaximumSessionDuration", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.roleName = software.amazon.jsii.Kernel.get(this, "roleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rolePath = software.amazon.jsii.Kernel.get(this, "rolePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rolePermissionsBoundary = software.amazon.jsii.Kernel.get(this, "rolePermissionsBoundary", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleTags = software.amazon.jsii.Kernel.get(this, "roleTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.runtime = software.amazon.jsii.Kernel.get(this, "runtime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Acl = software.amazon.jsii.Kernel.get(this, "s3Acl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Bucket = software.amazon.jsii.Kernel.get(this, "s3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ExistingPackage = software.amazon.jsii.Kernel.get(this, "s3ExistingPackage", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.s3KmsKeyId = software.amazon.jsii.Kernel.get(this, "s3KmsKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ObjectOverrideDefaultTags = software.amazon.jsii.Kernel.get(this, "s3ObjectOverrideDefaultTags", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.s3ObjectStorageClass = software.amazon.jsii.Kernel.get(this, "s3ObjectStorageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ObjectTags = software.amazon.jsii.Kernel.get(this, "s3ObjectTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.s3ObjectTagsOnly = software.amazon.jsii.Kernel.get(this, "s3ObjectTagsOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.s3Prefix = software.amazon.jsii.Kernel.get(this, "s3Prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ServerSideEncryption = software.amazon.jsii.Kernel.get(this, "s3ServerSideEncryption", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.snapStart = software.amazon.jsii.Kernel.get(this, "snapStart", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.sourcePath = software.amazon.jsii.Kernel.get(this, "sourcePath", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.storeOnS3 = software.amazon.jsii.Kernel.get(this, "storeOnS3", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeout = software.amazon.jsii.Kernel.get(this, "timeout", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tracingMode = software.amazon.jsii.Kernel.get(this, "tracingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.triggerOnPackageTimestamp = software.amazon.jsii.Kernel.get(this, "triggerOnPackageTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.trustedEntities = software.amazon.jsii.Kernel.get(this, "trustedEntities", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.useExistingCloudwatchLogGroup = software.amazon.jsii.Kernel.get(this, "useExistingCloudwatchLogGroup", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.vpcSecurityGroupIds = software.amazon.jsii.Kernel.get(this, "vpcSecurityGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcSubnetIds = software.amazon.jsii.Kernel.get(this, "vpcSubnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
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
            this.allowedTriggers = (java.util.Map<java.lang.String, java.lang.Object>)builder.allowedTriggers;
            this.architectures = builder.architectures;
            this.artifactsDir = builder.artifactsDir;
            this.assumeRolePolicyStatements = builder.assumeRolePolicyStatements;
            this.attachAsyncEventPolicy = builder.attachAsyncEventPolicy;
            this.attachCloudwatchLogsPolicy = builder.attachCloudwatchLogsPolicy;
            this.attachCreateLogGroupPermission = builder.attachCreateLogGroupPermission;
            this.attachDeadLetterPolicy = builder.attachDeadLetterPolicy;
            this.attachNetworkPolicy = builder.attachNetworkPolicy;
            this.attachPolicies = builder.attachPolicies;
            this.attachPolicy = builder.attachPolicy;
            this.attachPolicyJson = builder.attachPolicyJson;
            this.attachPolicyJsons = builder.attachPolicyJsons;
            this.attachPolicyStatements = builder.attachPolicyStatements;
            this.attachTracingPolicy = builder.attachTracingPolicy;
            this.authorizationType = builder.authorizationType;
            this.buildInDocker = builder.buildInDocker;
            this.cloudwatchLogsKmsKeyId = builder.cloudwatchLogsKmsKeyId;
            this.cloudwatchLogsLogGroupClass = builder.cloudwatchLogsLogGroupClass;
            this.cloudwatchLogsRetentionInDays = builder.cloudwatchLogsRetentionInDays;
            this.cloudwatchLogsSkipDestroy = builder.cloudwatchLogsSkipDestroy;
            this.cloudwatchLogsTags = builder.cloudwatchLogsTags;
            this.codeSigningConfigArn = builder.codeSigningConfigArn;
            this.compatibleArchitectures = builder.compatibleArchitectures;
            this.compatibleRuntimes = builder.compatibleRuntimes;
            this.cors = builder.cors;
            this.create = builder.create;
            this.createAsyncEventConfig = builder.createAsyncEventConfig;
            this.createCurrentVersionAllowedTriggers = builder.createCurrentVersionAllowedTriggers;
            this.createCurrentVersionAsyncEventConfig = builder.createCurrentVersionAsyncEventConfig;
            this.createFunction = builder.createFunction;
            this.createLambdaFunctionUrl = builder.createLambdaFunctionUrl;
            this.createLayer = builder.createLayer;
            this.createPackage = builder.createPackage;
            this.createRole = builder.createRole;
            this.createSamMetadata = builder.createSamMetadata;
            this.createUnqualifiedAliasAllowedTriggers = builder.createUnqualifiedAliasAllowedTriggers;
            this.createUnqualifiedAliasAsyncEventConfig = builder.createUnqualifiedAliasAsyncEventConfig;
            this.createUnqualifiedAliasLambdaFunctionUrl = builder.createUnqualifiedAliasLambdaFunctionUrl;
            this.deadLetterTargetArn = builder.deadLetterTargetArn;
            this.description = builder.description;
            this.destinationOnFailure = builder.destinationOnFailure;
            this.destinationOnSuccess = builder.destinationOnSuccess;
            this.dockerAdditionalOptions = builder.dockerAdditionalOptions;
            this.dockerBuildRoot = builder.dockerBuildRoot;
            this.dockerEntrypoint = builder.dockerEntrypoint;
            this.dockerFile = builder.dockerFile;
            this.dockerImage = builder.dockerImage;
            this.dockerPipCache = builder.dockerPipCache;
            this.dockerWithSshAgent = builder.dockerWithSshAgent;
            this.environmentVariables = builder.environmentVariables;
            this.ephemeralStorageSize = builder.ephemeralStorageSize;
            this.eventSourceMapping = builder.eventSourceMapping;
            this.fileSystemArn = builder.fileSystemArn;
            this.fileSystemLocalMountPath = builder.fileSystemLocalMountPath;
            this.functionName = builder.functionName;
            this.functionTags = builder.functionTags;
            this.handler = builder.handler;
            this.hashExtra = builder.hashExtra;
            this.ignoreSourceCodeHash = builder.ignoreSourceCodeHash;
            this.imageConfigCommand = builder.imageConfigCommand;
            this.imageConfigEntryPoint = builder.imageConfigEntryPoint;
            this.imageConfigWorkingDirectory = builder.imageConfigWorkingDirectory;
            this.imageUri = builder.imageUri;
            this.invokeMode = builder.invokeMode;
            this.kmsKeyArn = builder.kmsKeyArn;
            this.lambdaAtEdge = builder.lambdaAtEdge;
            this.lambdaAtEdgeLogsAllRegions = builder.lambdaAtEdgeLogsAllRegions;
            this.lambdaRole = builder.lambdaRole;
            this.layerName = builder.layerName;
            this.layers = builder.layers;
            this.layerSkipDestroy = builder.layerSkipDestroy;
            this.licenseInfo = builder.licenseInfo;
            this.localExistingPackage = builder.localExistingPackage;
            this.loggingApplicationLogLevel = builder.loggingApplicationLogLevel;
            this.loggingLogFormat = builder.loggingLogFormat;
            this.loggingLogGroup = builder.loggingLogGroup;
            this.loggingSystemLogLevel = builder.loggingSystemLogLevel;
            this.maximumEventAgeInSeconds = builder.maximumEventAgeInSeconds;
            this.maximumRetryAttempts = builder.maximumRetryAttempts;
            this.memorySize = builder.memorySize;
            this.numberOfPolicies = builder.numberOfPolicies;
            this.numberOfPolicyJsons = builder.numberOfPolicyJsons;
            this.packageType = builder.packageType;
            this.policies = builder.policies;
            this.policy = builder.policy;
            this.policyJson = builder.policyJson;
            this.policyJsons = builder.policyJsons;
            this.policyName = builder.policyName;
            this.policyPath = builder.policyPath;
            this.policyStatements = builder.policyStatements;
            this.provisionedConcurrentExecutions = builder.provisionedConcurrentExecutions;
            this.publish = builder.publish;
            this.putinKhuylo = builder.putinKhuylo;
            this.recreateMissingPackage = builder.recreateMissingPackage;
            this.replacementSecurityGroupIds = builder.replacementSecurityGroupIds;
            this.replaceSecurityGroupsOnDestroy = builder.replaceSecurityGroupsOnDestroy;
            this.reservedConcurrentExecutions = builder.reservedConcurrentExecutions;
            this.roleDescription = builder.roleDescription;
            this.roleForceDetachPolicies = builder.roleForceDetachPolicies;
            this.roleMaximumSessionDuration = builder.roleMaximumSessionDuration;
            this.roleName = builder.roleName;
            this.rolePath = builder.rolePath;
            this.rolePermissionsBoundary = builder.rolePermissionsBoundary;
            this.roleTags = builder.roleTags;
            this.runtime = builder.runtime;
            this.s3Acl = builder.s3Acl;
            this.s3Bucket = builder.s3Bucket;
            this.s3ExistingPackage = builder.s3ExistingPackage;
            this.s3KmsKeyId = builder.s3KmsKeyId;
            this.s3ObjectOverrideDefaultTags = builder.s3ObjectOverrideDefaultTags;
            this.s3ObjectStorageClass = builder.s3ObjectStorageClass;
            this.s3ObjectTags = builder.s3ObjectTags;
            this.s3ObjectTagsOnly = builder.s3ObjectTagsOnly;
            this.s3Prefix = builder.s3Prefix;
            this.s3ServerSideEncryption = builder.s3ServerSideEncryption;
            this.snapStart = builder.snapStart;
            this.sourcePath = builder.sourcePath;
            this.storeOnS3 = builder.storeOnS3;
            this.tags = builder.tags;
            this.timeout = builder.timeout;
            this.timeouts = builder.timeouts;
            this.tracingMode = builder.tracingMode;
            this.triggerOnPackageTimestamp = builder.triggerOnPackageTimestamp;
            this.trustedEntities = builder.trustedEntities;
            this.useExistingCloudwatchLogGroup = builder.useExistingCloudwatchLogGroup;
            this.vpcSecurityGroupIds = builder.vpcSecurityGroupIds;
            this.vpcSubnetIds = builder.vpcSubnetIds;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.Object> getAllowedTriggers() {
            return this.allowedTriggers;
        }

        @Override
        public final java.util.List<java.lang.String> getArchitectures() {
            return this.architectures;
        }

        @Override
        public final java.lang.String getArtifactsDir() {
            return this.artifactsDir;
        }

        @Override
        public final java.lang.Object getAssumeRolePolicyStatements() {
            return this.assumeRolePolicyStatements;
        }

        @Override
        public final java.lang.Boolean getAttachAsyncEventPolicy() {
            return this.attachAsyncEventPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachCloudwatchLogsPolicy() {
            return this.attachCloudwatchLogsPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachCreateLogGroupPermission() {
            return this.attachCreateLogGroupPermission;
        }

        @Override
        public final java.lang.Boolean getAttachDeadLetterPolicy() {
            return this.attachDeadLetterPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachNetworkPolicy() {
            return this.attachNetworkPolicy;
        }

        @Override
        public final java.lang.Boolean getAttachPolicies() {
            return this.attachPolicies;
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
        public final java.lang.Boolean getAttachTracingPolicy() {
            return this.attachTracingPolicy;
        }

        @Override
        public final java.lang.String getAuthorizationType() {
            return this.authorizationType;
        }

        @Override
        public final java.lang.Boolean getBuildInDocker() {
            return this.buildInDocker;
        }

        @Override
        public final java.lang.String getCloudwatchLogsKmsKeyId() {
            return this.cloudwatchLogsKmsKeyId;
        }

        @Override
        public final java.lang.String getCloudwatchLogsLogGroupClass() {
            return this.cloudwatchLogsLogGroupClass;
        }

        @Override
        public final java.lang.Number getCloudwatchLogsRetentionInDays() {
            return this.cloudwatchLogsRetentionInDays;
        }

        @Override
        public final java.lang.Boolean getCloudwatchLogsSkipDestroy() {
            return this.cloudwatchLogsSkipDestroy;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getCloudwatchLogsTags() {
            return this.cloudwatchLogsTags;
        }

        @Override
        public final java.lang.String getCodeSigningConfigArn() {
            return this.codeSigningConfigArn;
        }

        @Override
        public final java.util.List<java.lang.String> getCompatibleArchitectures() {
            return this.compatibleArchitectures;
        }

        @Override
        public final java.util.List<java.lang.String> getCompatibleRuntimes() {
            return this.compatibleRuntimes;
        }

        @Override
        public final java.lang.Object getCors() {
            return this.cors;
        }

        @Override
        public final java.lang.Boolean getCreate() {
            return this.create;
        }

        @Override
        public final java.lang.Boolean getCreateAsyncEventConfig() {
            return this.createAsyncEventConfig;
        }

        @Override
        public final java.lang.Boolean getCreateCurrentVersionAllowedTriggers() {
            return this.createCurrentVersionAllowedTriggers;
        }

        @Override
        public final java.lang.Boolean getCreateCurrentVersionAsyncEventConfig() {
            return this.createCurrentVersionAsyncEventConfig;
        }

        @Override
        public final java.lang.Boolean getCreateFunction() {
            return this.createFunction;
        }

        @Override
        public final java.lang.Boolean getCreateLambdaFunctionUrl() {
            return this.createLambdaFunctionUrl;
        }

        @Override
        public final java.lang.Boolean getCreateLayer() {
            return this.createLayer;
        }

        @Override
        public final java.lang.Boolean getCreatePackage() {
            return this.createPackage;
        }

        @Override
        public final java.lang.Boolean getCreateRole() {
            return this.createRole;
        }

        @Override
        public final java.lang.Boolean getCreateSamMetadata() {
            return this.createSamMetadata;
        }

        @Override
        public final java.lang.Boolean getCreateUnqualifiedAliasAllowedTriggers() {
            return this.createUnqualifiedAliasAllowedTriggers;
        }

        @Override
        public final java.lang.Boolean getCreateUnqualifiedAliasAsyncEventConfig() {
            return this.createUnqualifiedAliasAsyncEventConfig;
        }

        @Override
        public final java.lang.Boolean getCreateUnqualifiedAliasLambdaFunctionUrl() {
            return this.createUnqualifiedAliasLambdaFunctionUrl;
        }

        @Override
        public final java.lang.String getDeadLetterTargetArn() {
            return this.deadLetterTargetArn;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getDestinationOnFailure() {
            return this.destinationOnFailure;
        }

        @Override
        public final java.lang.String getDestinationOnSuccess() {
            return this.destinationOnSuccess;
        }

        @Override
        public final java.util.List<java.lang.String> getDockerAdditionalOptions() {
            return this.dockerAdditionalOptions;
        }

        @Override
        public final java.lang.String getDockerBuildRoot() {
            return this.dockerBuildRoot;
        }

        @Override
        public final java.lang.String getDockerEntrypoint() {
            return this.dockerEntrypoint;
        }

        @Override
        public final java.lang.String getDockerFile() {
            return this.dockerFile;
        }

        @Override
        public final java.lang.String getDockerImage() {
            return this.dockerImage;
        }

        @Override
        public final java.lang.Object getDockerPipCache() {
            return this.dockerPipCache;
        }

        @Override
        public final java.lang.Boolean getDockerWithSshAgent() {
            return this.dockerWithSshAgent;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        @Override
        public final java.lang.Number getEphemeralStorageSize() {
            return this.ephemeralStorageSize;
        }

        @Override
        public final java.lang.Object getEventSourceMapping() {
            return this.eventSourceMapping;
        }

        @Override
        public final java.lang.String getFileSystemArn() {
            return this.fileSystemArn;
        }

        @Override
        public final java.lang.String getFileSystemLocalMountPath() {
            return this.fileSystemLocalMountPath;
        }

        @Override
        public final java.lang.String getFunctionName() {
            return this.functionName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getFunctionTags() {
            return this.functionTags;
        }

        @Override
        public final java.lang.String getHandler() {
            return this.handler;
        }

        @Override
        public final java.lang.String getHashExtra() {
            return this.hashExtra;
        }

        @Override
        public final java.lang.Boolean getIgnoreSourceCodeHash() {
            return this.ignoreSourceCodeHash;
        }

        @Override
        public final java.util.List<java.lang.String> getImageConfigCommand() {
            return this.imageConfigCommand;
        }

        @Override
        public final java.util.List<java.lang.String> getImageConfigEntryPoint() {
            return this.imageConfigEntryPoint;
        }

        @Override
        public final java.lang.String getImageConfigWorkingDirectory() {
            return this.imageConfigWorkingDirectory;
        }

        @Override
        public final java.lang.String getImageUri() {
            return this.imageUri;
        }

        @Override
        public final java.lang.String getInvokeMode() {
            return this.invokeMode;
        }

        @Override
        public final java.lang.String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

        @Override
        public final java.lang.Boolean getLambdaAtEdge() {
            return this.lambdaAtEdge;
        }

        @Override
        public final java.lang.Boolean getLambdaAtEdgeLogsAllRegions() {
            return this.lambdaAtEdgeLogsAllRegions;
        }

        @Override
        public final java.lang.String getLambdaRole() {
            return this.lambdaRole;
        }

        @Override
        public final java.lang.String getLayerName() {
            return this.layerName;
        }

        @Override
        public final java.util.List<java.lang.String> getLayers() {
            return this.layers;
        }

        @Override
        public final java.lang.Boolean getLayerSkipDestroy() {
            return this.layerSkipDestroy;
        }

        @Override
        public final java.lang.String getLicenseInfo() {
            return this.licenseInfo;
        }

        @Override
        public final java.lang.String getLocalExistingPackage() {
            return this.localExistingPackage;
        }

        @Override
        public final java.lang.String getLoggingApplicationLogLevel() {
            return this.loggingApplicationLogLevel;
        }

        @Override
        public final java.lang.String getLoggingLogFormat() {
            return this.loggingLogFormat;
        }

        @Override
        public final java.lang.String getLoggingLogGroup() {
            return this.loggingLogGroup;
        }

        @Override
        public final java.lang.String getLoggingSystemLogLevel() {
            return this.loggingSystemLogLevel;
        }

        @Override
        public final java.lang.Number getMaximumEventAgeInSeconds() {
            return this.maximumEventAgeInSeconds;
        }

        @Override
        public final java.lang.Number getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        @Override
        public final java.lang.Number getMemorySize() {
            return this.memorySize;
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
        public final java.lang.String getPackageType() {
            return this.packageType;
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
        public final java.lang.String getPolicyName() {
            return this.policyName;
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
        public final java.lang.Number getProvisionedConcurrentExecutions() {
            return this.provisionedConcurrentExecutions;
        }

        @Override
        public final java.lang.Boolean getPublish() {
            return this.publish;
        }

        @Override
        public final java.lang.Boolean getPutinKhuylo() {
            return this.putinKhuylo;
        }

        @Override
        public final java.lang.Boolean getRecreateMissingPackage() {
            return this.recreateMissingPackage;
        }

        @Override
        public final java.util.List<java.lang.String> getReplacementSecurityGroupIds() {
            return this.replacementSecurityGroupIds;
        }

        @Override
        public final java.lang.Boolean getReplaceSecurityGroupsOnDestroy() {
            return this.replaceSecurityGroupsOnDestroy;
        }

        @Override
        public final java.lang.Number getReservedConcurrentExecutions() {
            return this.reservedConcurrentExecutions;
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
        public final java.lang.Number getRoleMaximumSessionDuration() {
            return this.roleMaximumSessionDuration;
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
        public final java.lang.String getRuntime() {
            return this.runtime;
        }

        @Override
        public final java.lang.String getS3Acl() {
            return this.s3Acl;
        }

        @Override
        public final java.lang.String getS3Bucket() {
            return this.s3Bucket;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getS3ExistingPackage() {
            return this.s3ExistingPackage;
        }

        @Override
        public final java.lang.String getS3KmsKeyId() {
            return this.s3KmsKeyId;
        }

        @Override
        public final java.lang.Boolean getS3ObjectOverrideDefaultTags() {
            return this.s3ObjectOverrideDefaultTags;
        }

        @Override
        public final java.lang.String getS3ObjectStorageClass() {
            return this.s3ObjectStorageClass;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getS3ObjectTags() {
            return this.s3ObjectTags;
        }

        @Override
        public final java.lang.Boolean getS3ObjectTagsOnly() {
            return this.s3ObjectTagsOnly;
        }

        @Override
        public final java.lang.String getS3Prefix() {
            return this.s3Prefix;
        }

        @Override
        public final java.lang.String getS3ServerSideEncryption() {
            return this.s3ServerSideEncryption;
        }

        @Override
        public final java.lang.Boolean getSnapStart() {
            return this.snapStart;
        }

        @Override
        public final java.lang.Object getSourcePath() {
            return this.sourcePath;
        }

        @Override
        public final java.lang.Boolean getStoreOnS3() {
            return this.storeOnS3;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getTimeout() {
            return this.timeout;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.String getTracingMode() {
            return this.tracingMode;
        }

        @Override
        public final java.lang.Boolean getTriggerOnPackageTimestamp() {
            return this.triggerOnPackageTimestamp;
        }

        @Override
        public final java.lang.Object getTrustedEntities() {
            return this.trustedEntities;
        }

        @Override
        public final java.lang.Boolean getUseExistingCloudwatchLogGroup() {
            return this.useExistingCloudwatchLogGroup;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSecurityGroupIds() {
            return this.vpcSecurityGroupIds;
        }

        @Override
        public final java.util.List<java.lang.String> getVpcSubnetIds() {
            return this.vpcSubnetIds;
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

            if (this.getAllowedTriggers() != null) {
                data.set("allowedTriggers", om.valueToTree(this.getAllowedTriggers()));
            }
            if (this.getArchitectures() != null) {
                data.set("architectures", om.valueToTree(this.getArchitectures()));
            }
            if (this.getArtifactsDir() != null) {
                data.set("artifactsDir", om.valueToTree(this.getArtifactsDir()));
            }
            if (this.getAssumeRolePolicyStatements() != null) {
                data.set("assumeRolePolicyStatements", om.valueToTree(this.getAssumeRolePolicyStatements()));
            }
            if (this.getAttachAsyncEventPolicy() != null) {
                data.set("attachAsyncEventPolicy", om.valueToTree(this.getAttachAsyncEventPolicy()));
            }
            if (this.getAttachCloudwatchLogsPolicy() != null) {
                data.set("attachCloudwatchLogsPolicy", om.valueToTree(this.getAttachCloudwatchLogsPolicy()));
            }
            if (this.getAttachCreateLogGroupPermission() != null) {
                data.set("attachCreateLogGroupPermission", om.valueToTree(this.getAttachCreateLogGroupPermission()));
            }
            if (this.getAttachDeadLetterPolicy() != null) {
                data.set("attachDeadLetterPolicy", om.valueToTree(this.getAttachDeadLetterPolicy()));
            }
            if (this.getAttachNetworkPolicy() != null) {
                data.set("attachNetworkPolicy", om.valueToTree(this.getAttachNetworkPolicy()));
            }
            if (this.getAttachPolicies() != null) {
                data.set("attachPolicies", om.valueToTree(this.getAttachPolicies()));
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
            if (this.getAttachTracingPolicy() != null) {
                data.set("attachTracingPolicy", om.valueToTree(this.getAttachTracingPolicy()));
            }
            if (this.getAuthorizationType() != null) {
                data.set("authorizationType", om.valueToTree(this.getAuthorizationType()));
            }
            if (this.getBuildInDocker() != null) {
                data.set("buildInDocker", om.valueToTree(this.getBuildInDocker()));
            }
            if (this.getCloudwatchLogsKmsKeyId() != null) {
                data.set("cloudwatchLogsKmsKeyId", om.valueToTree(this.getCloudwatchLogsKmsKeyId()));
            }
            if (this.getCloudwatchLogsLogGroupClass() != null) {
                data.set("cloudwatchLogsLogGroupClass", om.valueToTree(this.getCloudwatchLogsLogGroupClass()));
            }
            if (this.getCloudwatchLogsRetentionInDays() != null) {
                data.set("cloudwatchLogsRetentionInDays", om.valueToTree(this.getCloudwatchLogsRetentionInDays()));
            }
            if (this.getCloudwatchLogsSkipDestroy() != null) {
                data.set("cloudwatchLogsSkipDestroy", om.valueToTree(this.getCloudwatchLogsSkipDestroy()));
            }
            if (this.getCloudwatchLogsTags() != null) {
                data.set("cloudwatchLogsTags", om.valueToTree(this.getCloudwatchLogsTags()));
            }
            if (this.getCodeSigningConfigArn() != null) {
                data.set("codeSigningConfigArn", om.valueToTree(this.getCodeSigningConfigArn()));
            }
            if (this.getCompatibleArchitectures() != null) {
                data.set("compatibleArchitectures", om.valueToTree(this.getCompatibleArchitectures()));
            }
            if (this.getCompatibleRuntimes() != null) {
                data.set("compatibleRuntimes", om.valueToTree(this.getCompatibleRuntimes()));
            }
            if (this.getCors() != null) {
                data.set("cors", om.valueToTree(this.getCors()));
            }
            if (this.getCreate() != null) {
                data.set("create", om.valueToTree(this.getCreate()));
            }
            if (this.getCreateAsyncEventConfig() != null) {
                data.set("createAsyncEventConfig", om.valueToTree(this.getCreateAsyncEventConfig()));
            }
            if (this.getCreateCurrentVersionAllowedTriggers() != null) {
                data.set("createCurrentVersionAllowedTriggers", om.valueToTree(this.getCreateCurrentVersionAllowedTriggers()));
            }
            if (this.getCreateCurrentVersionAsyncEventConfig() != null) {
                data.set("createCurrentVersionAsyncEventConfig", om.valueToTree(this.getCreateCurrentVersionAsyncEventConfig()));
            }
            if (this.getCreateFunction() != null) {
                data.set("createFunction", om.valueToTree(this.getCreateFunction()));
            }
            if (this.getCreateLambdaFunctionUrl() != null) {
                data.set("createLambdaFunctionUrl", om.valueToTree(this.getCreateLambdaFunctionUrl()));
            }
            if (this.getCreateLayer() != null) {
                data.set("createLayer", om.valueToTree(this.getCreateLayer()));
            }
            if (this.getCreatePackage() != null) {
                data.set("createPackage", om.valueToTree(this.getCreatePackage()));
            }
            if (this.getCreateRole() != null) {
                data.set("createRole", om.valueToTree(this.getCreateRole()));
            }
            if (this.getCreateSamMetadata() != null) {
                data.set("createSamMetadata", om.valueToTree(this.getCreateSamMetadata()));
            }
            if (this.getCreateUnqualifiedAliasAllowedTriggers() != null) {
                data.set("createUnqualifiedAliasAllowedTriggers", om.valueToTree(this.getCreateUnqualifiedAliasAllowedTriggers()));
            }
            if (this.getCreateUnqualifiedAliasAsyncEventConfig() != null) {
                data.set("createUnqualifiedAliasAsyncEventConfig", om.valueToTree(this.getCreateUnqualifiedAliasAsyncEventConfig()));
            }
            if (this.getCreateUnqualifiedAliasLambdaFunctionUrl() != null) {
                data.set("createUnqualifiedAliasLambdaFunctionUrl", om.valueToTree(this.getCreateUnqualifiedAliasLambdaFunctionUrl()));
            }
            if (this.getDeadLetterTargetArn() != null) {
                data.set("deadLetterTargetArn", om.valueToTree(this.getDeadLetterTargetArn()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getDestinationOnFailure() != null) {
                data.set("destinationOnFailure", om.valueToTree(this.getDestinationOnFailure()));
            }
            if (this.getDestinationOnSuccess() != null) {
                data.set("destinationOnSuccess", om.valueToTree(this.getDestinationOnSuccess()));
            }
            if (this.getDockerAdditionalOptions() != null) {
                data.set("dockerAdditionalOptions", om.valueToTree(this.getDockerAdditionalOptions()));
            }
            if (this.getDockerBuildRoot() != null) {
                data.set("dockerBuildRoot", om.valueToTree(this.getDockerBuildRoot()));
            }
            if (this.getDockerEntrypoint() != null) {
                data.set("dockerEntrypoint", om.valueToTree(this.getDockerEntrypoint()));
            }
            if (this.getDockerFile() != null) {
                data.set("dockerFile", om.valueToTree(this.getDockerFile()));
            }
            if (this.getDockerImage() != null) {
                data.set("dockerImage", om.valueToTree(this.getDockerImage()));
            }
            if (this.getDockerPipCache() != null) {
                data.set("dockerPipCache", om.valueToTree(this.getDockerPipCache()));
            }
            if (this.getDockerWithSshAgent() != null) {
                data.set("dockerWithSshAgent", om.valueToTree(this.getDockerWithSshAgent()));
            }
            if (this.getEnvironmentVariables() != null) {
                data.set("environmentVariables", om.valueToTree(this.getEnvironmentVariables()));
            }
            if (this.getEphemeralStorageSize() != null) {
                data.set("ephemeralStorageSize", om.valueToTree(this.getEphemeralStorageSize()));
            }
            if (this.getEventSourceMapping() != null) {
                data.set("eventSourceMapping", om.valueToTree(this.getEventSourceMapping()));
            }
            if (this.getFileSystemArn() != null) {
                data.set("fileSystemArn", om.valueToTree(this.getFileSystemArn()));
            }
            if (this.getFileSystemLocalMountPath() != null) {
                data.set("fileSystemLocalMountPath", om.valueToTree(this.getFileSystemLocalMountPath()));
            }
            if (this.getFunctionName() != null) {
                data.set("functionName", om.valueToTree(this.getFunctionName()));
            }
            if (this.getFunctionTags() != null) {
                data.set("functionTags", om.valueToTree(this.getFunctionTags()));
            }
            if (this.getHandler() != null) {
                data.set("handler", om.valueToTree(this.getHandler()));
            }
            if (this.getHashExtra() != null) {
                data.set("hashExtra", om.valueToTree(this.getHashExtra()));
            }
            if (this.getIgnoreSourceCodeHash() != null) {
                data.set("ignoreSourceCodeHash", om.valueToTree(this.getIgnoreSourceCodeHash()));
            }
            if (this.getImageConfigCommand() != null) {
                data.set("imageConfigCommand", om.valueToTree(this.getImageConfigCommand()));
            }
            if (this.getImageConfigEntryPoint() != null) {
                data.set("imageConfigEntryPoint", om.valueToTree(this.getImageConfigEntryPoint()));
            }
            if (this.getImageConfigWorkingDirectory() != null) {
                data.set("imageConfigWorkingDirectory", om.valueToTree(this.getImageConfigWorkingDirectory()));
            }
            if (this.getImageUri() != null) {
                data.set("imageUri", om.valueToTree(this.getImageUri()));
            }
            if (this.getInvokeMode() != null) {
                data.set("invokeMode", om.valueToTree(this.getInvokeMode()));
            }
            if (this.getKmsKeyArn() != null) {
                data.set("kmsKeyArn", om.valueToTree(this.getKmsKeyArn()));
            }
            if (this.getLambdaAtEdge() != null) {
                data.set("lambdaAtEdge", om.valueToTree(this.getLambdaAtEdge()));
            }
            if (this.getLambdaAtEdgeLogsAllRegions() != null) {
                data.set("lambdaAtEdgeLogsAllRegions", om.valueToTree(this.getLambdaAtEdgeLogsAllRegions()));
            }
            if (this.getLambdaRole() != null) {
                data.set("lambdaRole", om.valueToTree(this.getLambdaRole()));
            }
            if (this.getLayerName() != null) {
                data.set("layerName", om.valueToTree(this.getLayerName()));
            }
            if (this.getLayers() != null) {
                data.set("layers", om.valueToTree(this.getLayers()));
            }
            if (this.getLayerSkipDestroy() != null) {
                data.set("layerSkipDestroy", om.valueToTree(this.getLayerSkipDestroy()));
            }
            if (this.getLicenseInfo() != null) {
                data.set("licenseInfo", om.valueToTree(this.getLicenseInfo()));
            }
            if (this.getLocalExistingPackage() != null) {
                data.set("localExistingPackage", om.valueToTree(this.getLocalExistingPackage()));
            }
            if (this.getLoggingApplicationLogLevel() != null) {
                data.set("loggingApplicationLogLevel", om.valueToTree(this.getLoggingApplicationLogLevel()));
            }
            if (this.getLoggingLogFormat() != null) {
                data.set("loggingLogFormat", om.valueToTree(this.getLoggingLogFormat()));
            }
            if (this.getLoggingLogGroup() != null) {
                data.set("loggingLogGroup", om.valueToTree(this.getLoggingLogGroup()));
            }
            if (this.getLoggingSystemLogLevel() != null) {
                data.set("loggingSystemLogLevel", om.valueToTree(this.getLoggingSystemLogLevel()));
            }
            if (this.getMaximumEventAgeInSeconds() != null) {
                data.set("maximumEventAgeInSeconds", om.valueToTree(this.getMaximumEventAgeInSeconds()));
            }
            if (this.getMaximumRetryAttempts() != null) {
                data.set("maximumRetryAttempts", om.valueToTree(this.getMaximumRetryAttempts()));
            }
            if (this.getMemorySize() != null) {
                data.set("memorySize", om.valueToTree(this.getMemorySize()));
            }
            if (this.getNumberOfPolicies() != null) {
                data.set("numberOfPolicies", om.valueToTree(this.getNumberOfPolicies()));
            }
            if (this.getNumberOfPolicyJsons() != null) {
                data.set("numberOfPolicyJsons", om.valueToTree(this.getNumberOfPolicyJsons()));
            }
            if (this.getPackageType() != null) {
                data.set("packageType", om.valueToTree(this.getPackageType()));
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
            if (this.getPolicyName() != null) {
                data.set("policyName", om.valueToTree(this.getPolicyName()));
            }
            if (this.getPolicyPath() != null) {
                data.set("policyPath", om.valueToTree(this.getPolicyPath()));
            }
            if (this.getPolicyStatements() != null) {
                data.set("policyStatements", om.valueToTree(this.getPolicyStatements()));
            }
            if (this.getProvisionedConcurrentExecutions() != null) {
                data.set("provisionedConcurrentExecutions", om.valueToTree(this.getProvisionedConcurrentExecutions()));
            }
            if (this.getPublish() != null) {
                data.set("publish", om.valueToTree(this.getPublish()));
            }
            if (this.getPutinKhuylo() != null) {
                data.set("putinKhuylo", om.valueToTree(this.getPutinKhuylo()));
            }
            if (this.getRecreateMissingPackage() != null) {
                data.set("recreateMissingPackage", om.valueToTree(this.getRecreateMissingPackage()));
            }
            if (this.getReplacementSecurityGroupIds() != null) {
                data.set("replacementSecurityGroupIds", om.valueToTree(this.getReplacementSecurityGroupIds()));
            }
            if (this.getReplaceSecurityGroupsOnDestroy() != null) {
                data.set("replaceSecurityGroupsOnDestroy", om.valueToTree(this.getReplaceSecurityGroupsOnDestroy()));
            }
            if (this.getReservedConcurrentExecutions() != null) {
                data.set("reservedConcurrentExecutions", om.valueToTree(this.getReservedConcurrentExecutions()));
            }
            if (this.getRoleDescription() != null) {
                data.set("roleDescription", om.valueToTree(this.getRoleDescription()));
            }
            if (this.getRoleForceDetachPolicies() != null) {
                data.set("roleForceDetachPolicies", om.valueToTree(this.getRoleForceDetachPolicies()));
            }
            if (this.getRoleMaximumSessionDuration() != null) {
                data.set("roleMaximumSessionDuration", om.valueToTree(this.getRoleMaximumSessionDuration()));
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
            if (this.getRuntime() != null) {
                data.set("runtime", om.valueToTree(this.getRuntime()));
            }
            if (this.getS3Acl() != null) {
                data.set("s3Acl", om.valueToTree(this.getS3Acl()));
            }
            if (this.getS3Bucket() != null) {
                data.set("s3Bucket", om.valueToTree(this.getS3Bucket()));
            }
            if (this.getS3ExistingPackage() != null) {
                data.set("s3ExistingPackage", om.valueToTree(this.getS3ExistingPackage()));
            }
            if (this.getS3KmsKeyId() != null) {
                data.set("s3KmsKeyId", om.valueToTree(this.getS3KmsKeyId()));
            }
            if (this.getS3ObjectOverrideDefaultTags() != null) {
                data.set("s3ObjectOverrideDefaultTags", om.valueToTree(this.getS3ObjectOverrideDefaultTags()));
            }
            if (this.getS3ObjectStorageClass() != null) {
                data.set("s3ObjectStorageClass", om.valueToTree(this.getS3ObjectStorageClass()));
            }
            if (this.getS3ObjectTags() != null) {
                data.set("s3ObjectTags", om.valueToTree(this.getS3ObjectTags()));
            }
            if (this.getS3ObjectTagsOnly() != null) {
                data.set("s3ObjectTagsOnly", om.valueToTree(this.getS3ObjectTagsOnly()));
            }
            if (this.getS3Prefix() != null) {
                data.set("s3Prefix", om.valueToTree(this.getS3Prefix()));
            }
            if (this.getS3ServerSideEncryption() != null) {
                data.set("s3ServerSideEncryption", om.valueToTree(this.getS3ServerSideEncryption()));
            }
            if (this.getSnapStart() != null) {
                data.set("snapStart", om.valueToTree(this.getSnapStart()));
            }
            if (this.getSourcePath() != null) {
                data.set("sourcePath", om.valueToTree(this.getSourcePath()));
            }
            if (this.getStoreOnS3() != null) {
                data.set("storeOnS3", om.valueToTree(this.getStoreOnS3()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTimeout() != null) {
                data.set("timeout", om.valueToTree(this.getTimeout()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getTracingMode() != null) {
                data.set("tracingMode", om.valueToTree(this.getTracingMode()));
            }
            if (this.getTriggerOnPackageTimestamp() != null) {
                data.set("triggerOnPackageTimestamp", om.valueToTree(this.getTriggerOnPackageTimestamp()));
            }
            if (this.getTrustedEntities() != null) {
                data.set("trustedEntities", om.valueToTree(this.getTrustedEntities()));
            }
            if (this.getUseExistingCloudwatchLogGroup() != null) {
                data.set("useExistingCloudwatchLogGroup", om.valueToTree(this.getUseExistingCloudwatchLogGroup()));
            }
            if (this.getVpcSecurityGroupIds() != null) {
                data.set("vpcSecurityGroupIds", om.valueToTree(this.getVpcSecurityGroupIds()));
            }
            if (this.getVpcSubnetIds() != null) {
                data.set("vpcSubnetIds", om.valueToTree(this.getVpcSubnetIds()));
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
            struct.set("fqn", om.valueToTree("lambda.LambdaConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaConfig.Jsii$Proxy that = (LambdaConfig.Jsii$Proxy) o;

            if (this.allowedTriggers != null ? !this.allowedTriggers.equals(that.allowedTriggers) : that.allowedTriggers != null) return false;
            if (this.architectures != null ? !this.architectures.equals(that.architectures) : that.architectures != null) return false;
            if (this.artifactsDir != null ? !this.artifactsDir.equals(that.artifactsDir) : that.artifactsDir != null) return false;
            if (this.assumeRolePolicyStatements != null ? !this.assumeRolePolicyStatements.equals(that.assumeRolePolicyStatements) : that.assumeRolePolicyStatements != null) return false;
            if (this.attachAsyncEventPolicy != null ? !this.attachAsyncEventPolicy.equals(that.attachAsyncEventPolicy) : that.attachAsyncEventPolicy != null) return false;
            if (this.attachCloudwatchLogsPolicy != null ? !this.attachCloudwatchLogsPolicy.equals(that.attachCloudwatchLogsPolicy) : that.attachCloudwatchLogsPolicy != null) return false;
            if (this.attachCreateLogGroupPermission != null ? !this.attachCreateLogGroupPermission.equals(that.attachCreateLogGroupPermission) : that.attachCreateLogGroupPermission != null) return false;
            if (this.attachDeadLetterPolicy != null ? !this.attachDeadLetterPolicy.equals(that.attachDeadLetterPolicy) : that.attachDeadLetterPolicy != null) return false;
            if (this.attachNetworkPolicy != null ? !this.attachNetworkPolicy.equals(that.attachNetworkPolicy) : that.attachNetworkPolicy != null) return false;
            if (this.attachPolicies != null ? !this.attachPolicies.equals(that.attachPolicies) : that.attachPolicies != null) return false;
            if (this.attachPolicy != null ? !this.attachPolicy.equals(that.attachPolicy) : that.attachPolicy != null) return false;
            if (this.attachPolicyJson != null ? !this.attachPolicyJson.equals(that.attachPolicyJson) : that.attachPolicyJson != null) return false;
            if (this.attachPolicyJsons != null ? !this.attachPolicyJsons.equals(that.attachPolicyJsons) : that.attachPolicyJsons != null) return false;
            if (this.attachPolicyStatements != null ? !this.attachPolicyStatements.equals(that.attachPolicyStatements) : that.attachPolicyStatements != null) return false;
            if (this.attachTracingPolicy != null ? !this.attachTracingPolicy.equals(that.attachTracingPolicy) : that.attachTracingPolicy != null) return false;
            if (this.authorizationType != null ? !this.authorizationType.equals(that.authorizationType) : that.authorizationType != null) return false;
            if (this.buildInDocker != null ? !this.buildInDocker.equals(that.buildInDocker) : that.buildInDocker != null) return false;
            if (this.cloudwatchLogsKmsKeyId != null ? !this.cloudwatchLogsKmsKeyId.equals(that.cloudwatchLogsKmsKeyId) : that.cloudwatchLogsKmsKeyId != null) return false;
            if (this.cloudwatchLogsLogGroupClass != null ? !this.cloudwatchLogsLogGroupClass.equals(that.cloudwatchLogsLogGroupClass) : that.cloudwatchLogsLogGroupClass != null) return false;
            if (this.cloudwatchLogsRetentionInDays != null ? !this.cloudwatchLogsRetentionInDays.equals(that.cloudwatchLogsRetentionInDays) : that.cloudwatchLogsRetentionInDays != null) return false;
            if (this.cloudwatchLogsSkipDestroy != null ? !this.cloudwatchLogsSkipDestroy.equals(that.cloudwatchLogsSkipDestroy) : that.cloudwatchLogsSkipDestroy != null) return false;
            if (this.cloudwatchLogsTags != null ? !this.cloudwatchLogsTags.equals(that.cloudwatchLogsTags) : that.cloudwatchLogsTags != null) return false;
            if (this.codeSigningConfigArn != null ? !this.codeSigningConfigArn.equals(that.codeSigningConfigArn) : that.codeSigningConfigArn != null) return false;
            if (this.compatibleArchitectures != null ? !this.compatibleArchitectures.equals(that.compatibleArchitectures) : that.compatibleArchitectures != null) return false;
            if (this.compatibleRuntimes != null ? !this.compatibleRuntimes.equals(that.compatibleRuntimes) : that.compatibleRuntimes != null) return false;
            if (this.cors != null ? !this.cors.equals(that.cors) : that.cors != null) return false;
            if (this.create != null ? !this.create.equals(that.create) : that.create != null) return false;
            if (this.createAsyncEventConfig != null ? !this.createAsyncEventConfig.equals(that.createAsyncEventConfig) : that.createAsyncEventConfig != null) return false;
            if (this.createCurrentVersionAllowedTriggers != null ? !this.createCurrentVersionAllowedTriggers.equals(that.createCurrentVersionAllowedTriggers) : that.createCurrentVersionAllowedTriggers != null) return false;
            if (this.createCurrentVersionAsyncEventConfig != null ? !this.createCurrentVersionAsyncEventConfig.equals(that.createCurrentVersionAsyncEventConfig) : that.createCurrentVersionAsyncEventConfig != null) return false;
            if (this.createFunction != null ? !this.createFunction.equals(that.createFunction) : that.createFunction != null) return false;
            if (this.createLambdaFunctionUrl != null ? !this.createLambdaFunctionUrl.equals(that.createLambdaFunctionUrl) : that.createLambdaFunctionUrl != null) return false;
            if (this.createLayer != null ? !this.createLayer.equals(that.createLayer) : that.createLayer != null) return false;
            if (this.createPackage != null ? !this.createPackage.equals(that.createPackage) : that.createPackage != null) return false;
            if (this.createRole != null ? !this.createRole.equals(that.createRole) : that.createRole != null) return false;
            if (this.createSamMetadata != null ? !this.createSamMetadata.equals(that.createSamMetadata) : that.createSamMetadata != null) return false;
            if (this.createUnqualifiedAliasAllowedTriggers != null ? !this.createUnqualifiedAliasAllowedTriggers.equals(that.createUnqualifiedAliasAllowedTriggers) : that.createUnqualifiedAliasAllowedTriggers != null) return false;
            if (this.createUnqualifiedAliasAsyncEventConfig != null ? !this.createUnqualifiedAliasAsyncEventConfig.equals(that.createUnqualifiedAliasAsyncEventConfig) : that.createUnqualifiedAliasAsyncEventConfig != null) return false;
            if (this.createUnqualifiedAliasLambdaFunctionUrl != null ? !this.createUnqualifiedAliasLambdaFunctionUrl.equals(that.createUnqualifiedAliasLambdaFunctionUrl) : that.createUnqualifiedAliasLambdaFunctionUrl != null) return false;
            if (this.deadLetterTargetArn != null ? !this.deadLetterTargetArn.equals(that.deadLetterTargetArn) : that.deadLetterTargetArn != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.destinationOnFailure != null ? !this.destinationOnFailure.equals(that.destinationOnFailure) : that.destinationOnFailure != null) return false;
            if (this.destinationOnSuccess != null ? !this.destinationOnSuccess.equals(that.destinationOnSuccess) : that.destinationOnSuccess != null) return false;
            if (this.dockerAdditionalOptions != null ? !this.dockerAdditionalOptions.equals(that.dockerAdditionalOptions) : that.dockerAdditionalOptions != null) return false;
            if (this.dockerBuildRoot != null ? !this.dockerBuildRoot.equals(that.dockerBuildRoot) : that.dockerBuildRoot != null) return false;
            if (this.dockerEntrypoint != null ? !this.dockerEntrypoint.equals(that.dockerEntrypoint) : that.dockerEntrypoint != null) return false;
            if (this.dockerFile != null ? !this.dockerFile.equals(that.dockerFile) : that.dockerFile != null) return false;
            if (this.dockerImage != null ? !this.dockerImage.equals(that.dockerImage) : that.dockerImage != null) return false;
            if (this.dockerPipCache != null ? !this.dockerPipCache.equals(that.dockerPipCache) : that.dockerPipCache != null) return false;
            if (this.dockerWithSshAgent != null ? !this.dockerWithSshAgent.equals(that.dockerWithSshAgent) : that.dockerWithSshAgent != null) return false;
            if (this.environmentVariables != null ? !this.environmentVariables.equals(that.environmentVariables) : that.environmentVariables != null) return false;
            if (this.ephemeralStorageSize != null ? !this.ephemeralStorageSize.equals(that.ephemeralStorageSize) : that.ephemeralStorageSize != null) return false;
            if (this.eventSourceMapping != null ? !this.eventSourceMapping.equals(that.eventSourceMapping) : that.eventSourceMapping != null) return false;
            if (this.fileSystemArn != null ? !this.fileSystemArn.equals(that.fileSystemArn) : that.fileSystemArn != null) return false;
            if (this.fileSystemLocalMountPath != null ? !this.fileSystemLocalMountPath.equals(that.fileSystemLocalMountPath) : that.fileSystemLocalMountPath != null) return false;
            if (this.functionName != null ? !this.functionName.equals(that.functionName) : that.functionName != null) return false;
            if (this.functionTags != null ? !this.functionTags.equals(that.functionTags) : that.functionTags != null) return false;
            if (this.handler != null ? !this.handler.equals(that.handler) : that.handler != null) return false;
            if (this.hashExtra != null ? !this.hashExtra.equals(that.hashExtra) : that.hashExtra != null) return false;
            if (this.ignoreSourceCodeHash != null ? !this.ignoreSourceCodeHash.equals(that.ignoreSourceCodeHash) : that.ignoreSourceCodeHash != null) return false;
            if (this.imageConfigCommand != null ? !this.imageConfigCommand.equals(that.imageConfigCommand) : that.imageConfigCommand != null) return false;
            if (this.imageConfigEntryPoint != null ? !this.imageConfigEntryPoint.equals(that.imageConfigEntryPoint) : that.imageConfigEntryPoint != null) return false;
            if (this.imageConfigWorkingDirectory != null ? !this.imageConfigWorkingDirectory.equals(that.imageConfigWorkingDirectory) : that.imageConfigWorkingDirectory != null) return false;
            if (this.imageUri != null ? !this.imageUri.equals(that.imageUri) : that.imageUri != null) return false;
            if (this.invokeMode != null ? !this.invokeMode.equals(that.invokeMode) : that.invokeMode != null) return false;
            if (this.kmsKeyArn != null ? !this.kmsKeyArn.equals(that.kmsKeyArn) : that.kmsKeyArn != null) return false;
            if (this.lambdaAtEdge != null ? !this.lambdaAtEdge.equals(that.lambdaAtEdge) : that.lambdaAtEdge != null) return false;
            if (this.lambdaAtEdgeLogsAllRegions != null ? !this.lambdaAtEdgeLogsAllRegions.equals(that.lambdaAtEdgeLogsAllRegions) : that.lambdaAtEdgeLogsAllRegions != null) return false;
            if (this.lambdaRole != null ? !this.lambdaRole.equals(that.lambdaRole) : that.lambdaRole != null) return false;
            if (this.layerName != null ? !this.layerName.equals(that.layerName) : that.layerName != null) return false;
            if (this.layers != null ? !this.layers.equals(that.layers) : that.layers != null) return false;
            if (this.layerSkipDestroy != null ? !this.layerSkipDestroy.equals(that.layerSkipDestroy) : that.layerSkipDestroy != null) return false;
            if (this.licenseInfo != null ? !this.licenseInfo.equals(that.licenseInfo) : that.licenseInfo != null) return false;
            if (this.localExistingPackage != null ? !this.localExistingPackage.equals(that.localExistingPackage) : that.localExistingPackage != null) return false;
            if (this.loggingApplicationLogLevel != null ? !this.loggingApplicationLogLevel.equals(that.loggingApplicationLogLevel) : that.loggingApplicationLogLevel != null) return false;
            if (this.loggingLogFormat != null ? !this.loggingLogFormat.equals(that.loggingLogFormat) : that.loggingLogFormat != null) return false;
            if (this.loggingLogGroup != null ? !this.loggingLogGroup.equals(that.loggingLogGroup) : that.loggingLogGroup != null) return false;
            if (this.loggingSystemLogLevel != null ? !this.loggingSystemLogLevel.equals(that.loggingSystemLogLevel) : that.loggingSystemLogLevel != null) return false;
            if (this.maximumEventAgeInSeconds != null ? !this.maximumEventAgeInSeconds.equals(that.maximumEventAgeInSeconds) : that.maximumEventAgeInSeconds != null) return false;
            if (this.maximumRetryAttempts != null ? !this.maximumRetryAttempts.equals(that.maximumRetryAttempts) : that.maximumRetryAttempts != null) return false;
            if (this.memorySize != null ? !this.memorySize.equals(that.memorySize) : that.memorySize != null) return false;
            if (this.numberOfPolicies != null ? !this.numberOfPolicies.equals(that.numberOfPolicies) : that.numberOfPolicies != null) return false;
            if (this.numberOfPolicyJsons != null ? !this.numberOfPolicyJsons.equals(that.numberOfPolicyJsons) : that.numberOfPolicyJsons != null) return false;
            if (this.packageType != null ? !this.packageType.equals(that.packageType) : that.packageType != null) return false;
            if (this.policies != null ? !this.policies.equals(that.policies) : that.policies != null) return false;
            if (this.policy != null ? !this.policy.equals(that.policy) : that.policy != null) return false;
            if (this.policyJson != null ? !this.policyJson.equals(that.policyJson) : that.policyJson != null) return false;
            if (this.policyJsons != null ? !this.policyJsons.equals(that.policyJsons) : that.policyJsons != null) return false;
            if (this.policyName != null ? !this.policyName.equals(that.policyName) : that.policyName != null) return false;
            if (this.policyPath != null ? !this.policyPath.equals(that.policyPath) : that.policyPath != null) return false;
            if (this.policyStatements != null ? !this.policyStatements.equals(that.policyStatements) : that.policyStatements != null) return false;
            if (this.provisionedConcurrentExecutions != null ? !this.provisionedConcurrentExecutions.equals(that.provisionedConcurrentExecutions) : that.provisionedConcurrentExecutions != null) return false;
            if (this.publish != null ? !this.publish.equals(that.publish) : that.publish != null) return false;
            if (this.putinKhuylo != null ? !this.putinKhuylo.equals(that.putinKhuylo) : that.putinKhuylo != null) return false;
            if (this.recreateMissingPackage != null ? !this.recreateMissingPackage.equals(that.recreateMissingPackage) : that.recreateMissingPackage != null) return false;
            if (this.replacementSecurityGroupIds != null ? !this.replacementSecurityGroupIds.equals(that.replacementSecurityGroupIds) : that.replacementSecurityGroupIds != null) return false;
            if (this.replaceSecurityGroupsOnDestroy != null ? !this.replaceSecurityGroupsOnDestroy.equals(that.replaceSecurityGroupsOnDestroy) : that.replaceSecurityGroupsOnDestroy != null) return false;
            if (this.reservedConcurrentExecutions != null ? !this.reservedConcurrentExecutions.equals(that.reservedConcurrentExecutions) : that.reservedConcurrentExecutions != null) return false;
            if (this.roleDescription != null ? !this.roleDescription.equals(that.roleDescription) : that.roleDescription != null) return false;
            if (this.roleForceDetachPolicies != null ? !this.roleForceDetachPolicies.equals(that.roleForceDetachPolicies) : that.roleForceDetachPolicies != null) return false;
            if (this.roleMaximumSessionDuration != null ? !this.roleMaximumSessionDuration.equals(that.roleMaximumSessionDuration) : that.roleMaximumSessionDuration != null) return false;
            if (this.roleName != null ? !this.roleName.equals(that.roleName) : that.roleName != null) return false;
            if (this.rolePath != null ? !this.rolePath.equals(that.rolePath) : that.rolePath != null) return false;
            if (this.rolePermissionsBoundary != null ? !this.rolePermissionsBoundary.equals(that.rolePermissionsBoundary) : that.rolePermissionsBoundary != null) return false;
            if (this.roleTags != null ? !this.roleTags.equals(that.roleTags) : that.roleTags != null) return false;
            if (this.runtime != null ? !this.runtime.equals(that.runtime) : that.runtime != null) return false;
            if (this.s3Acl != null ? !this.s3Acl.equals(that.s3Acl) : that.s3Acl != null) return false;
            if (this.s3Bucket != null ? !this.s3Bucket.equals(that.s3Bucket) : that.s3Bucket != null) return false;
            if (this.s3ExistingPackage != null ? !this.s3ExistingPackage.equals(that.s3ExistingPackage) : that.s3ExistingPackage != null) return false;
            if (this.s3KmsKeyId != null ? !this.s3KmsKeyId.equals(that.s3KmsKeyId) : that.s3KmsKeyId != null) return false;
            if (this.s3ObjectOverrideDefaultTags != null ? !this.s3ObjectOverrideDefaultTags.equals(that.s3ObjectOverrideDefaultTags) : that.s3ObjectOverrideDefaultTags != null) return false;
            if (this.s3ObjectStorageClass != null ? !this.s3ObjectStorageClass.equals(that.s3ObjectStorageClass) : that.s3ObjectStorageClass != null) return false;
            if (this.s3ObjectTags != null ? !this.s3ObjectTags.equals(that.s3ObjectTags) : that.s3ObjectTags != null) return false;
            if (this.s3ObjectTagsOnly != null ? !this.s3ObjectTagsOnly.equals(that.s3ObjectTagsOnly) : that.s3ObjectTagsOnly != null) return false;
            if (this.s3Prefix != null ? !this.s3Prefix.equals(that.s3Prefix) : that.s3Prefix != null) return false;
            if (this.s3ServerSideEncryption != null ? !this.s3ServerSideEncryption.equals(that.s3ServerSideEncryption) : that.s3ServerSideEncryption != null) return false;
            if (this.snapStart != null ? !this.snapStart.equals(that.snapStart) : that.snapStart != null) return false;
            if (this.sourcePath != null ? !this.sourcePath.equals(that.sourcePath) : that.sourcePath != null) return false;
            if (this.storeOnS3 != null ? !this.storeOnS3.equals(that.storeOnS3) : that.storeOnS3 != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.timeout != null ? !this.timeout.equals(that.timeout) : that.timeout != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.tracingMode != null ? !this.tracingMode.equals(that.tracingMode) : that.tracingMode != null) return false;
            if (this.triggerOnPackageTimestamp != null ? !this.triggerOnPackageTimestamp.equals(that.triggerOnPackageTimestamp) : that.triggerOnPackageTimestamp != null) return false;
            if (this.trustedEntities != null ? !this.trustedEntities.equals(that.trustedEntities) : that.trustedEntities != null) return false;
            if (this.useExistingCloudwatchLogGroup != null ? !this.useExistingCloudwatchLogGroup.equals(that.useExistingCloudwatchLogGroup) : that.useExistingCloudwatchLogGroup != null) return false;
            if (this.vpcSecurityGroupIds != null ? !this.vpcSecurityGroupIds.equals(that.vpcSecurityGroupIds) : that.vpcSecurityGroupIds != null) return false;
            if (this.vpcSubnetIds != null ? !this.vpcSubnetIds.equals(that.vpcSubnetIds) : that.vpcSubnetIds != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allowedTriggers != null ? this.allowedTriggers.hashCode() : 0;
            result = 31 * result + (this.architectures != null ? this.architectures.hashCode() : 0);
            result = 31 * result + (this.artifactsDir != null ? this.artifactsDir.hashCode() : 0);
            result = 31 * result + (this.assumeRolePolicyStatements != null ? this.assumeRolePolicyStatements.hashCode() : 0);
            result = 31 * result + (this.attachAsyncEventPolicy != null ? this.attachAsyncEventPolicy.hashCode() : 0);
            result = 31 * result + (this.attachCloudwatchLogsPolicy != null ? this.attachCloudwatchLogsPolicy.hashCode() : 0);
            result = 31 * result + (this.attachCreateLogGroupPermission != null ? this.attachCreateLogGroupPermission.hashCode() : 0);
            result = 31 * result + (this.attachDeadLetterPolicy != null ? this.attachDeadLetterPolicy.hashCode() : 0);
            result = 31 * result + (this.attachNetworkPolicy != null ? this.attachNetworkPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPolicies != null ? this.attachPolicies.hashCode() : 0);
            result = 31 * result + (this.attachPolicy != null ? this.attachPolicy.hashCode() : 0);
            result = 31 * result + (this.attachPolicyJson != null ? this.attachPolicyJson.hashCode() : 0);
            result = 31 * result + (this.attachPolicyJsons != null ? this.attachPolicyJsons.hashCode() : 0);
            result = 31 * result + (this.attachPolicyStatements != null ? this.attachPolicyStatements.hashCode() : 0);
            result = 31 * result + (this.attachTracingPolicy != null ? this.attachTracingPolicy.hashCode() : 0);
            result = 31 * result + (this.authorizationType != null ? this.authorizationType.hashCode() : 0);
            result = 31 * result + (this.buildInDocker != null ? this.buildInDocker.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogsKmsKeyId != null ? this.cloudwatchLogsKmsKeyId.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogsLogGroupClass != null ? this.cloudwatchLogsLogGroupClass.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogsRetentionInDays != null ? this.cloudwatchLogsRetentionInDays.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogsSkipDestroy != null ? this.cloudwatchLogsSkipDestroy.hashCode() : 0);
            result = 31 * result + (this.cloudwatchLogsTags != null ? this.cloudwatchLogsTags.hashCode() : 0);
            result = 31 * result + (this.codeSigningConfigArn != null ? this.codeSigningConfigArn.hashCode() : 0);
            result = 31 * result + (this.compatibleArchitectures != null ? this.compatibleArchitectures.hashCode() : 0);
            result = 31 * result + (this.compatibleRuntimes != null ? this.compatibleRuntimes.hashCode() : 0);
            result = 31 * result + (this.cors != null ? this.cors.hashCode() : 0);
            result = 31 * result + (this.create != null ? this.create.hashCode() : 0);
            result = 31 * result + (this.createAsyncEventConfig != null ? this.createAsyncEventConfig.hashCode() : 0);
            result = 31 * result + (this.createCurrentVersionAllowedTriggers != null ? this.createCurrentVersionAllowedTriggers.hashCode() : 0);
            result = 31 * result + (this.createCurrentVersionAsyncEventConfig != null ? this.createCurrentVersionAsyncEventConfig.hashCode() : 0);
            result = 31 * result + (this.createFunction != null ? this.createFunction.hashCode() : 0);
            result = 31 * result + (this.createLambdaFunctionUrl != null ? this.createLambdaFunctionUrl.hashCode() : 0);
            result = 31 * result + (this.createLayer != null ? this.createLayer.hashCode() : 0);
            result = 31 * result + (this.createPackage != null ? this.createPackage.hashCode() : 0);
            result = 31 * result + (this.createRole != null ? this.createRole.hashCode() : 0);
            result = 31 * result + (this.createSamMetadata != null ? this.createSamMetadata.hashCode() : 0);
            result = 31 * result + (this.createUnqualifiedAliasAllowedTriggers != null ? this.createUnqualifiedAliasAllowedTriggers.hashCode() : 0);
            result = 31 * result + (this.createUnqualifiedAliasAsyncEventConfig != null ? this.createUnqualifiedAliasAsyncEventConfig.hashCode() : 0);
            result = 31 * result + (this.createUnqualifiedAliasLambdaFunctionUrl != null ? this.createUnqualifiedAliasLambdaFunctionUrl.hashCode() : 0);
            result = 31 * result + (this.deadLetterTargetArn != null ? this.deadLetterTargetArn.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.destinationOnFailure != null ? this.destinationOnFailure.hashCode() : 0);
            result = 31 * result + (this.destinationOnSuccess != null ? this.destinationOnSuccess.hashCode() : 0);
            result = 31 * result + (this.dockerAdditionalOptions != null ? this.dockerAdditionalOptions.hashCode() : 0);
            result = 31 * result + (this.dockerBuildRoot != null ? this.dockerBuildRoot.hashCode() : 0);
            result = 31 * result + (this.dockerEntrypoint != null ? this.dockerEntrypoint.hashCode() : 0);
            result = 31 * result + (this.dockerFile != null ? this.dockerFile.hashCode() : 0);
            result = 31 * result + (this.dockerImage != null ? this.dockerImage.hashCode() : 0);
            result = 31 * result + (this.dockerPipCache != null ? this.dockerPipCache.hashCode() : 0);
            result = 31 * result + (this.dockerWithSshAgent != null ? this.dockerWithSshAgent.hashCode() : 0);
            result = 31 * result + (this.environmentVariables != null ? this.environmentVariables.hashCode() : 0);
            result = 31 * result + (this.ephemeralStorageSize != null ? this.ephemeralStorageSize.hashCode() : 0);
            result = 31 * result + (this.eventSourceMapping != null ? this.eventSourceMapping.hashCode() : 0);
            result = 31 * result + (this.fileSystemArn != null ? this.fileSystemArn.hashCode() : 0);
            result = 31 * result + (this.fileSystemLocalMountPath != null ? this.fileSystemLocalMountPath.hashCode() : 0);
            result = 31 * result + (this.functionName != null ? this.functionName.hashCode() : 0);
            result = 31 * result + (this.functionTags != null ? this.functionTags.hashCode() : 0);
            result = 31 * result + (this.handler != null ? this.handler.hashCode() : 0);
            result = 31 * result + (this.hashExtra != null ? this.hashExtra.hashCode() : 0);
            result = 31 * result + (this.ignoreSourceCodeHash != null ? this.ignoreSourceCodeHash.hashCode() : 0);
            result = 31 * result + (this.imageConfigCommand != null ? this.imageConfigCommand.hashCode() : 0);
            result = 31 * result + (this.imageConfigEntryPoint != null ? this.imageConfigEntryPoint.hashCode() : 0);
            result = 31 * result + (this.imageConfigWorkingDirectory != null ? this.imageConfigWorkingDirectory.hashCode() : 0);
            result = 31 * result + (this.imageUri != null ? this.imageUri.hashCode() : 0);
            result = 31 * result + (this.invokeMode != null ? this.invokeMode.hashCode() : 0);
            result = 31 * result + (this.kmsKeyArn != null ? this.kmsKeyArn.hashCode() : 0);
            result = 31 * result + (this.lambdaAtEdge != null ? this.lambdaAtEdge.hashCode() : 0);
            result = 31 * result + (this.lambdaAtEdgeLogsAllRegions != null ? this.lambdaAtEdgeLogsAllRegions.hashCode() : 0);
            result = 31 * result + (this.lambdaRole != null ? this.lambdaRole.hashCode() : 0);
            result = 31 * result + (this.layerName != null ? this.layerName.hashCode() : 0);
            result = 31 * result + (this.layers != null ? this.layers.hashCode() : 0);
            result = 31 * result + (this.layerSkipDestroy != null ? this.layerSkipDestroy.hashCode() : 0);
            result = 31 * result + (this.licenseInfo != null ? this.licenseInfo.hashCode() : 0);
            result = 31 * result + (this.localExistingPackage != null ? this.localExistingPackage.hashCode() : 0);
            result = 31 * result + (this.loggingApplicationLogLevel != null ? this.loggingApplicationLogLevel.hashCode() : 0);
            result = 31 * result + (this.loggingLogFormat != null ? this.loggingLogFormat.hashCode() : 0);
            result = 31 * result + (this.loggingLogGroup != null ? this.loggingLogGroup.hashCode() : 0);
            result = 31 * result + (this.loggingSystemLogLevel != null ? this.loggingSystemLogLevel.hashCode() : 0);
            result = 31 * result + (this.maximumEventAgeInSeconds != null ? this.maximumEventAgeInSeconds.hashCode() : 0);
            result = 31 * result + (this.maximumRetryAttempts != null ? this.maximumRetryAttempts.hashCode() : 0);
            result = 31 * result + (this.memorySize != null ? this.memorySize.hashCode() : 0);
            result = 31 * result + (this.numberOfPolicies != null ? this.numberOfPolicies.hashCode() : 0);
            result = 31 * result + (this.numberOfPolicyJsons != null ? this.numberOfPolicyJsons.hashCode() : 0);
            result = 31 * result + (this.packageType != null ? this.packageType.hashCode() : 0);
            result = 31 * result + (this.policies != null ? this.policies.hashCode() : 0);
            result = 31 * result + (this.policy != null ? this.policy.hashCode() : 0);
            result = 31 * result + (this.policyJson != null ? this.policyJson.hashCode() : 0);
            result = 31 * result + (this.policyJsons != null ? this.policyJsons.hashCode() : 0);
            result = 31 * result + (this.policyName != null ? this.policyName.hashCode() : 0);
            result = 31 * result + (this.policyPath != null ? this.policyPath.hashCode() : 0);
            result = 31 * result + (this.policyStatements != null ? this.policyStatements.hashCode() : 0);
            result = 31 * result + (this.provisionedConcurrentExecutions != null ? this.provisionedConcurrentExecutions.hashCode() : 0);
            result = 31 * result + (this.publish != null ? this.publish.hashCode() : 0);
            result = 31 * result + (this.putinKhuylo != null ? this.putinKhuylo.hashCode() : 0);
            result = 31 * result + (this.recreateMissingPackage != null ? this.recreateMissingPackage.hashCode() : 0);
            result = 31 * result + (this.replacementSecurityGroupIds != null ? this.replacementSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.replaceSecurityGroupsOnDestroy != null ? this.replaceSecurityGroupsOnDestroy.hashCode() : 0);
            result = 31 * result + (this.reservedConcurrentExecutions != null ? this.reservedConcurrentExecutions.hashCode() : 0);
            result = 31 * result + (this.roleDescription != null ? this.roleDescription.hashCode() : 0);
            result = 31 * result + (this.roleForceDetachPolicies != null ? this.roleForceDetachPolicies.hashCode() : 0);
            result = 31 * result + (this.roleMaximumSessionDuration != null ? this.roleMaximumSessionDuration.hashCode() : 0);
            result = 31 * result + (this.roleName != null ? this.roleName.hashCode() : 0);
            result = 31 * result + (this.rolePath != null ? this.rolePath.hashCode() : 0);
            result = 31 * result + (this.rolePermissionsBoundary != null ? this.rolePermissionsBoundary.hashCode() : 0);
            result = 31 * result + (this.roleTags != null ? this.roleTags.hashCode() : 0);
            result = 31 * result + (this.runtime != null ? this.runtime.hashCode() : 0);
            result = 31 * result + (this.s3Acl != null ? this.s3Acl.hashCode() : 0);
            result = 31 * result + (this.s3Bucket != null ? this.s3Bucket.hashCode() : 0);
            result = 31 * result + (this.s3ExistingPackage != null ? this.s3ExistingPackage.hashCode() : 0);
            result = 31 * result + (this.s3KmsKeyId != null ? this.s3KmsKeyId.hashCode() : 0);
            result = 31 * result + (this.s3ObjectOverrideDefaultTags != null ? this.s3ObjectOverrideDefaultTags.hashCode() : 0);
            result = 31 * result + (this.s3ObjectStorageClass != null ? this.s3ObjectStorageClass.hashCode() : 0);
            result = 31 * result + (this.s3ObjectTags != null ? this.s3ObjectTags.hashCode() : 0);
            result = 31 * result + (this.s3ObjectTagsOnly != null ? this.s3ObjectTagsOnly.hashCode() : 0);
            result = 31 * result + (this.s3Prefix != null ? this.s3Prefix.hashCode() : 0);
            result = 31 * result + (this.s3ServerSideEncryption != null ? this.s3ServerSideEncryption.hashCode() : 0);
            result = 31 * result + (this.snapStart != null ? this.snapStart.hashCode() : 0);
            result = 31 * result + (this.sourcePath != null ? this.sourcePath.hashCode() : 0);
            result = 31 * result + (this.storeOnS3 != null ? this.storeOnS3.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.tracingMode != null ? this.tracingMode.hashCode() : 0);
            result = 31 * result + (this.triggerOnPackageTimestamp != null ? this.triggerOnPackageTimestamp.hashCode() : 0);
            result = 31 * result + (this.trustedEntities != null ? this.trustedEntities.hashCode() : 0);
            result = 31 * result + (this.useExistingCloudwatchLogGroup != null ? this.useExistingCloudwatchLogGroup.hashCode() : 0);
            result = 31 * result + (this.vpcSecurityGroupIds != null ? this.vpcSecurityGroupIds.hashCode() : 0);
            result = 31 * result + (this.vpcSubnetIds != null ? this.vpcSubnetIds.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
