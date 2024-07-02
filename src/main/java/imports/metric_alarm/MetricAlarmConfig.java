package imports.metric_alarm;

@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.376Z")
@software.amazon.jsii.Jsii(module = imports.metric_alarm.$Module.class, fqn = "metric-alarm.MetricAlarmConfig")
@software.amazon.jsii.Jsii.Proxy(MetricAlarmConfig.Jsii$Proxy.class)
public interface MetricAlarmConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformModuleUserConfig {

    /**
     * The descriptive name for the alarm.
     * <p>
     * This name must be unique within the user's AWS account.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAlarmName();

    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold.
     * <p>
     * The specified Statistic value is used as the first operand. Either of the following is supported: GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getComparisonOperator();

    /**
     * The number of periods over which data is compared to the specified threshold.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getEvaluationPeriods();

    /**
     * Indicates whether or not actions should be executed during any changes to the alarm's state.
     * <p>
     * Defaults to true.
     * true
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getActionsEnabled() {
        return null;
    }

    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state.
     * <p>
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAlarmActions() {
        return null;
    }

    /**
     * The description for the alarm.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlarmDescription() {
        return null;
    }

    /**
     * Whether to create the Cloudwatch metric alarm true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateMetricAlarm() {
        return null;
    }

    /**
     * The number of datapoints that must be breaching to trigger the alarm.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDatapointsToAlarm() {
        return null;
    }

    /**
     * The dimensions for the alarm's associated metric.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDimensions() {
        return null;
    }

    /**
     * Used only for alarms based on percentiles.
     * <p>
     * If you specify ignore, the alarm state will not change during periods with too few data points to be statistically significant. If you specify evaluate or omit this parameter, the alarm will always be evaluated and possibly change state no matter how many data points are available. The following values are supported: ignore, and evaluate.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEvaluateLowSampleCountPercentiles() {
        return null;
    }

    /**
     * The percentile statistic for the metric associated with the alarm.
     * <p>
     * Specify a value between p0.0 and p100.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExtendedStatistic() {
        return null;
    }

    /**
     * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state.
     * <p>
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInsufficientDataActions() {
        return null;
    }

    /**
     * The name for the alarm's associated metric.
     * <p>
     * See docs for supported metrics.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMetricName() {
        return null;
    }

    /**
     * Enables you to create an alarm based on a metric math expression.
     * <p>
     * You may specify at most 20.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMetricQuery() {
        return null;
    }

    /**
     * The namespace for the alarm's associated metric.
     * <p>
     * See docs for the list of namespaces. See docs for supported metrics.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * The list of actions to execute when this alarm transitions into an OK state from any other state.
     * <p>
     * Each action is specified as an Amazon Resource Name (ARN).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOkActions() {
        return null;
    }

    /**
     * The period in seconds over which the specified statistic is applied.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPeriod() {
        return null;
    }

    /**
     * The statistic to apply to the alarm's associated metric.
     * <p>
     * Either of the following is supported: SampleCount, Average, Sum, Minimum, Maximum
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatistic() {
        return null;
    }

    /**
     * A mapping of tags to assign to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * The value against which the specified statistic is compared.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getThreshold() {
        return null;
    }

    /**
     * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getThresholdMetricId() {
        return null;
    }

    /**
     * Sets how this alarm is to handle missing data points.
     * <p>
     * The following values are supported: missing, ignore, breaching and notBreaching.
     * missing
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTreatMissingData() {
        return null;
    }

    /**
     * The unit for the alarm's associated metric.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUnit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetricAlarmConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricAlarmConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricAlarmConfig> {
        java.lang.String alarmName;
        java.lang.String comparisonOperator;
        java.lang.Number evaluationPeriods;
        java.lang.Boolean actionsEnabled;
        java.util.List<java.lang.String> alarmActions;
        java.lang.String alarmDescription;
        java.lang.Boolean createMetricAlarm;
        java.lang.Number datapointsToAlarm;
        java.lang.Object dimensions;
        java.lang.String evaluateLowSampleCountPercentiles;
        java.lang.String extendedStatistic;
        java.util.List<java.lang.String> insufficientDataActions;
        java.lang.String metricName;
        java.lang.Object metricQuery;
        java.lang.String namespace;
        java.util.List<java.lang.String> okActions;
        java.lang.String period;
        java.lang.String statistic;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.lang.Number threshold;
        java.lang.String thresholdMetricId;
        java.lang.String treatMissingData;
        java.lang.String unit;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        java.util.List<java.lang.Object> providers;
        java.lang.Boolean skipAssetCreationFromLocalModules;

        /**
         * Sets the value of {@link MetricAlarmConfig#getAlarmName}
         * @param alarmName The descriptive name for the alarm. This parameter is required.
         *                  This name must be unique within the user's AWS account.
         * @return {@code this}
         */
        public Builder alarmName(java.lang.String alarmName) {
            this.alarmName = alarmName;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getComparisonOperator}
         * @param comparisonOperator The arithmetic operation to use when comparing the specified Statistic and Threshold. This parameter is required.
         *                           The specified Statistic value is used as the first operand. Either of the following is supported: GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold.
         * @return {@code this}
         */
        public Builder comparisonOperator(java.lang.String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getEvaluationPeriods}
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold. This parameter is required.
         * @return {@code this}
         */
        public Builder evaluationPeriods(java.lang.Number evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getActionsEnabled}
         * @param actionsEnabled Indicates whether or not actions should be executed during any changes to the alarm's state.
         *                       Defaults to true.
         *                       true
         * @return {@code this}
         */
        public Builder actionsEnabled(java.lang.Boolean actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getAlarmActions}
         * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM state from any other state.
         *                     Each action is specified as an Amazon Resource Name (ARN).
         * @return {@code this}
         */
        public Builder alarmActions(java.util.List<java.lang.String> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getAlarmDescription}
         * @param alarmDescription The description for the alarm.
         * @return {@code this}
         */
        public Builder alarmDescription(java.lang.String alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getCreateMetricAlarm}
         * @param createMetricAlarm Whether to create the Cloudwatch metric alarm true.
         * @return {@code this}
         */
        public Builder createMetricAlarm(java.lang.Boolean createMetricAlarm) {
            this.createMetricAlarm = createMetricAlarm;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getDatapointsToAlarm}
         * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the alarm.
         * @return {@code this}
         */
        public Builder datapointsToAlarm(java.lang.Number datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getDimensions}
         * @param dimensions The dimensions for the alarm's associated metric.
         * @return {@code this}
         */
        public Builder dimensions(java.lang.Object dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getEvaluateLowSampleCountPercentiles}
         * @param evaluateLowSampleCountPercentiles Used only for alarms based on percentiles.
         *                                          If you specify ignore, the alarm state will not change during periods with too few data points to be statistically significant. If you specify evaluate or omit this parameter, the alarm will always be evaluated and possibly change state no matter how many data points are available. The following values are supported: ignore, and evaluate.
         * @return {@code this}
         */
        public Builder evaluateLowSampleCountPercentiles(java.lang.String evaluateLowSampleCountPercentiles) {
            this.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getExtendedStatistic}
         * @param extendedStatistic The percentile statistic for the metric associated with the alarm.
         *                          Specify a value between p0.0 and p100.
         * @return {@code this}
         */
        public Builder extendedStatistic(java.lang.String extendedStatistic) {
            this.extendedStatistic = extendedStatistic;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getInsufficientDataActions}
         * @param insufficientDataActions The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state.
         *                                Each action is specified as an Amazon Resource Name (ARN).
         * @return {@code this}
         */
        public Builder insufficientDataActions(java.util.List<java.lang.String> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getMetricName}
         * @param metricName The name for the alarm's associated metric.
         *                   See docs for supported metrics.
         * @return {@code this}
         */
        public Builder metricName(java.lang.String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getMetricQuery}
         * @param metricQuery Enables you to create an alarm based on a metric math expression.
         *                    You may specify at most 20.
         * @return {@code this}
         */
        public Builder metricQuery(java.lang.Object metricQuery) {
            this.metricQuery = metricQuery;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getNamespace}
         * @param namespace The namespace for the alarm's associated metric.
         *                  See docs for the list of namespaces. See docs for supported metrics.
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getOkActions}
         * @param okActions The list of actions to execute when this alarm transitions into an OK state from any other state.
         *                  Each action is specified as an Amazon Resource Name (ARN).
         * @return {@code this}
         */
        public Builder okActions(java.util.List<java.lang.String> okActions) {
            this.okActions = okActions;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getPeriod}
         * @param period The period in seconds over which the specified statistic is applied.
         * @return {@code this}
         */
        public Builder period(java.lang.String period) {
            this.period = period;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getStatistic}
         * @param statistic The statistic to apply to the alarm's associated metric.
         *                  Either of the following is supported: SampleCount, Average, Sum, Minimum, Maximum
         * @return {@code this}
         */
        public Builder statistic(java.lang.String statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getTags}
         * @param tags A mapping of tags to assign to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getThreshold}
         * @param threshold The value against which the specified statistic is compared.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getThresholdMetricId}
         * @param thresholdMetricId If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
         * @return {@code this}
         */
        public Builder thresholdMetricId(java.lang.String thresholdMetricId) {
            this.thresholdMetricId = thresholdMetricId;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getTreatMissingData}
         * @param treatMissingData Sets how this alarm is to handle missing data points.
         *                         The following values are supported: missing, ignore, breaching and notBreaching.
         *                         missing
         * @return {@code this}
         */
        public Builder treatMissingData(java.lang.String treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getUnit}
         * @param unit The unit for the alarm's associated metric.
         * @return {@code this}
         */
        public Builder unit(java.lang.String unit) {
            this.unit = unit;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getDependsOn}
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
         * Sets the value of {@link MetricAlarmConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link MetricAlarmConfig#getProviders}
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
         * Sets the value of {@link MetricAlarmConfig#getSkipAssetCreationFromLocalModules}
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
         * @return a new instance of {@link MetricAlarmConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricAlarmConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetricAlarmConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricAlarmConfig {
        private final java.lang.String alarmName;
        private final java.lang.String comparisonOperator;
        private final java.lang.Number evaluationPeriods;
        private final java.lang.Boolean actionsEnabled;
        private final java.util.List<java.lang.String> alarmActions;
        private final java.lang.String alarmDescription;
        private final java.lang.Boolean createMetricAlarm;
        private final java.lang.Number datapointsToAlarm;
        private final java.lang.Object dimensions;
        private final java.lang.String evaluateLowSampleCountPercentiles;
        private final java.lang.String extendedStatistic;
        private final java.util.List<java.lang.String> insufficientDataActions;
        private final java.lang.String metricName;
        private final java.lang.Object metricQuery;
        private final java.lang.String namespace;
        private final java.util.List<java.lang.String> okActions;
        private final java.lang.String period;
        private final java.lang.String statistic;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.lang.Number threshold;
        private final java.lang.String thresholdMetricId;
        private final java.lang.String treatMissingData;
        private final java.lang.String unit;
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
            this.alarmName = software.amazon.jsii.Kernel.get(this, "alarmName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.comparisonOperator = software.amazon.jsii.Kernel.get(this, "comparisonOperator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.evaluationPeriods = software.amazon.jsii.Kernel.get(this, "evaluationPeriods", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.actionsEnabled = software.amazon.jsii.Kernel.get(this, "actionsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.alarmActions = software.amazon.jsii.Kernel.get(this, "alarmActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.alarmDescription = software.amazon.jsii.Kernel.get(this, "alarmDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.createMetricAlarm = software.amazon.jsii.Kernel.get(this, "createMetricAlarm", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.datapointsToAlarm = software.amazon.jsii.Kernel.get(this, "datapointsToAlarm", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dimensions = software.amazon.jsii.Kernel.get(this, "dimensions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.evaluateLowSampleCountPercentiles = software.amazon.jsii.Kernel.get(this, "evaluateLowSampleCountPercentiles", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.extendedStatistic = software.amazon.jsii.Kernel.get(this, "extendedStatistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.insufficientDataActions = software.amazon.jsii.Kernel.get(this, "insufficientDataActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.metricName = software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.metricQuery = software.amazon.jsii.Kernel.get(this, "metricQuery", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.namespace = software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.okActions = software.amazon.jsii.Kernel.get(this, "okActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.period = software.amazon.jsii.Kernel.get(this, "period", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.statistic = software.amazon.jsii.Kernel.get(this, "statistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.thresholdMetricId = software.amazon.jsii.Kernel.get(this, "thresholdMetricId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.treatMissingData = software.amazon.jsii.Kernel.get(this, "treatMissingData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.unit = software.amazon.jsii.Kernel.get(this, "unit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.alarmName = java.util.Objects.requireNonNull(builder.alarmName, "alarmName is required");
            this.comparisonOperator = java.util.Objects.requireNonNull(builder.comparisonOperator, "comparisonOperator is required");
            this.evaluationPeriods = java.util.Objects.requireNonNull(builder.evaluationPeriods, "evaluationPeriods is required");
            this.actionsEnabled = builder.actionsEnabled;
            this.alarmActions = builder.alarmActions;
            this.alarmDescription = builder.alarmDescription;
            this.createMetricAlarm = builder.createMetricAlarm;
            this.datapointsToAlarm = builder.datapointsToAlarm;
            this.dimensions = builder.dimensions;
            this.evaluateLowSampleCountPercentiles = builder.evaluateLowSampleCountPercentiles;
            this.extendedStatistic = builder.extendedStatistic;
            this.insufficientDataActions = builder.insufficientDataActions;
            this.metricName = builder.metricName;
            this.metricQuery = builder.metricQuery;
            this.namespace = builder.namespace;
            this.okActions = builder.okActions;
            this.period = builder.period;
            this.statistic = builder.statistic;
            this.tags = builder.tags;
            this.threshold = builder.threshold;
            this.thresholdMetricId = builder.thresholdMetricId;
            this.treatMissingData = builder.treatMissingData;
            this.unit = builder.unit;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.providers = (java.util.List<java.lang.Object>)builder.providers;
            this.skipAssetCreationFromLocalModules = builder.skipAssetCreationFromLocalModules;
        }

        @Override
        public final java.lang.String getAlarmName() {
            return this.alarmName;
        }

        @Override
        public final java.lang.String getComparisonOperator() {
            return this.comparisonOperator;
        }

        @Override
        public final java.lang.Number getEvaluationPeriods() {
            return this.evaluationPeriods;
        }

        @Override
        public final java.lang.Boolean getActionsEnabled() {
            return this.actionsEnabled;
        }

        @Override
        public final java.util.List<java.lang.String> getAlarmActions() {
            return this.alarmActions;
        }

        @Override
        public final java.lang.String getAlarmDescription() {
            return this.alarmDescription;
        }

        @Override
        public final java.lang.Boolean getCreateMetricAlarm() {
            return this.createMetricAlarm;
        }

        @Override
        public final java.lang.Number getDatapointsToAlarm() {
            return this.datapointsToAlarm;
        }

        @Override
        public final java.lang.Object getDimensions() {
            return this.dimensions;
        }

        @Override
        public final java.lang.String getEvaluateLowSampleCountPercentiles() {
            return this.evaluateLowSampleCountPercentiles;
        }

        @Override
        public final java.lang.String getExtendedStatistic() {
            return this.extendedStatistic;
        }

        @Override
        public final java.util.List<java.lang.String> getInsufficientDataActions() {
            return this.insufficientDataActions;
        }

        @Override
        public final java.lang.String getMetricName() {
            return this.metricName;
        }

        @Override
        public final java.lang.Object getMetricQuery() {
            return this.metricQuery;
        }

        @Override
        public final java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public final java.util.List<java.lang.String> getOkActions() {
            return this.okActions;
        }

        @Override
        public final java.lang.String getPeriod() {
            return this.period;
        }

        @Override
        public final java.lang.String getStatistic() {
            return this.statistic;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        public final java.lang.String getThresholdMetricId() {
            return this.thresholdMetricId;
        }

        @Override
        public final java.lang.String getTreatMissingData() {
            return this.treatMissingData;
        }

        @Override
        public final java.lang.String getUnit() {
            return this.unit;
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

            data.set("alarmName", om.valueToTree(this.getAlarmName()));
            data.set("comparisonOperator", om.valueToTree(this.getComparisonOperator()));
            data.set("evaluationPeriods", om.valueToTree(this.getEvaluationPeriods()));
            if (this.getActionsEnabled() != null) {
                data.set("actionsEnabled", om.valueToTree(this.getActionsEnabled()));
            }
            if (this.getAlarmActions() != null) {
                data.set("alarmActions", om.valueToTree(this.getAlarmActions()));
            }
            if (this.getAlarmDescription() != null) {
                data.set("alarmDescription", om.valueToTree(this.getAlarmDescription()));
            }
            if (this.getCreateMetricAlarm() != null) {
                data.set("createMetricAlarm", om.valueToTree(this.getCreateMetricAlarm()));
            }
            if (this.getDatapointsToAlarm() != null) {
                data.set("datapointsToAlarm", om.valueToTree(this.getDatapointsToAlarm()));
            }
            if (this.getDimensions() != null) {
                data.set("dimensions", om.valueToTree(this.getDimensions()));
            }
            if (this.getEvaluateLowSampleCountPercentiles() != null) {
                data.set("evaluateLowSampleCountPercentiles", om.valueToTree(this.getEvaluateLowSampleCountPercentiles()));
            }
            if (this.getExtendedStatistic() != null) {
                data.set("extendedStatistic", om.valueToTree(this.getExtendedStatistic()));
            }
            if (this.getInsufficientDataActions() != null) {
                data.set("insufficientDataActions", om.valueToTree(this.getInsufficientDataActions()));
            }
            if (this.getMetricName() != null) {
                data.set("metricName", om.valueToTree(this.getMetricName()));
            }
            if (this.getMetricQuery() != null) {
                data.set("metricQuery", om.valueToTree(this.getMetricQuery()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getOkActions() != null) {
                data.set("okActions", om.valueToTree(this.getOkActions()));
            }
            if (this.getPeriod() != null) {
                data.set("period", om.valueToTree(this.getPeriod()));
            }
            if (this.getStatistic() != null) {
                data.set("statistic", om.valueToTree(this.getStatistic()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }
            if (this.getThresholdMetricId() != null) {
                data.set("thresholdMetricId", om.valueToTree(this.getThresholdMetricId()));
            }
            if (this.getTreatMissingData() != null) {
                data.set("treatMissingData", om.valueToTree(this.getTreatMissingData()));
            }
            if (this.getUnit() != null) {
                data.set("unit", om.valueToTree(this.getUnit()));
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
            struct.set("fqn", om.valueToTree("metric-alarm.MetricAlarmConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricAlarmConfig.Jsii$Proxy that = (MetricAlarmConfig.Jsii$Proxy) o;

            if (!alarmName.equals(that.alarmName)) return false;
            if (!comparisonOperator.equals(that.comparisonOperator)) return false;
            if (!evaluationPeriods.equals(that.evaluationPeriods)) return false;
            if (this.actionsEnabled != null ? !this.actionsEnabled.equals(that.actionsEnabled) : that.actionsEnabled != null) return false;
            if (this.alarmActions != null ? !this.alarmActions.equals(that.alarmActions) : that.alarmActions != null) return false;
            if (this.alarmDescription != null ? !this.alarmDescription.equals(that.alarmDescription) : that.alarmDescription != null) return false;
            if (this.createMetricAlarm != null ? !this.createMetricAlarm.equals(that.createMetricAlarm) : that.createMetricAlarm != null) return false;
            if (this.datapointsToAlarm != null ? !this.datapointsToAlarm.equals(that.datapointsToAlarm) : that.datapointsToAlarm != null) return false;
            if (this.dimensions != null ? !this.dimensions.equals(that.dimensions) : that.dimensions != null) return false;
            if (this.evaluateLowSampleCountPercentiles != null ? !this.evaluateLowSampleCountPercentiles.equals(that.evaluateLowSampleCountPercentiles) : that.evaluateLowSampleCountPercentiles != null) return false;
            if (this.extendedStatistic != null ? !this.extendedStatistic.equals(that.extendedStatistic) : that.extendedStatistic != null) return false;
            if (this.insufficientDataActions != null ? !this.insufficientDataActions.equals(that.insufficientDataActions) : that.insufficientDataActions != null) return false;
            if (this.metricName != null ? !this.metricName.equals(that.metricName) : that.metricName != null) return false;
            if (this.metricQuery != null ? !this.metricQuery.equals(that.metricQuery) : that.metricQuery != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.okActions != null ? !this.okActions.equals(that.okActions) : that.okActions != null) return false;
            if (this.period != null ? !this.period.equals(that.period) : that.period != null) return false;
            if (this.statistic != null ? !this.statistic.equals(that.statistic) : that.statistic != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.threshold != null ? !this.threshold.equals(that.threshold) : that.threshold != null) return false;
            if (this.thresholdMetricId != null ? !this.thresholdMetricId.equals(that.thresholdMetricId) : that.thresholdMetricId != null) return false;
            if (this.treatMissingData != null ? !this.treatMissingData.equals(that.treatMissingData) : that.treatMissingData != null) return false;
            if (this.unit != null ? !this.unit.equals(that.unit) : that.unit != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.providers != null ? !this.providers.equals(that.providers) : that.providers != null) return false;
            return this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.equals(that.skipAssetCreationFromLocalModules) : that.skipAssetCreationFromLocalModules == null;
        }

        @Override
        public final int hashCode() {
            int result = this.alarmName.hashCode();
            result = 31 * result + (this.comparisonOperator.hashCode());
            result = 31 * result + (this.evaluationPeriods.hashCode());
            result = 31 * result + (this.actionsEnabled != null ? this.actionsEnabled.hashCode() : 0);
            result = 31 * result + (this.alarmActions != null ? this.alarmActions.hashCode() : 0);
            result = 31 * result + (this.alarmDescription != null ? this.alarmDescription.hashCode() : 0);
            result = 31 * result + (this.createMetricAlarm != null ? this.createMetricAlarm.hashCode() : 0);
            result = 31 * result + (this.datapointsToAlarm != null ? this.datapointsToAlarm.hashCode() : 0);
            result = 31 * result + (this.dimensions != null ? this.dimensions.hashCode() : 0);
            result = 31 * result + (this.evaluateLowSampleCountPercentiles != null ? this.evaluateLowSampleCountPercentiles.hashCode() : 0);
            result = 31 * result + (this.extendedStatistic != null ? this.extendedStatistic.hashCode() : 0);
            result = 31 * result + (this.insufficientDataActions != null ? this.insufficientDataActions.hashCode() : 0);
            result = 31 * result + (this.metricName != null ? this.metricName.hashCode() : 0);
            result = 31 * result + (this.metricQuery != null ? this.metricQuery.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.okActions != null ? this.okActions.hashCode() : 0);
            result = 31 * result + (this.period != null ? this.period.hashCode() : 0);
            result = 31 * result + (this.statistic != null ? this.statistic.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            result = 31 * result + (this.thresholdMetricId != null ? this.thresholdMetricId.hashCode() : 0);
            result = 31 * result + (this.treatMissingData != null ? this.treatMissingData.hashCode() : 0);
            result = 31 * result + (this.unit != null ? this.unit.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.providers != null ? this.providers.hashCode() : 0);
            result = 31 * result + (this.skipAssetCreationFromLocalModules != null ? this.skipAssetCreationFromLocalModules.hashCode() : 0);
            return result;
        }
    }
}
