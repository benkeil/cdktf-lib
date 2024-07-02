package imports.metric_alarm;

/**
 * Defines an MetricAlarm based on a Terraform module.
 * <p>
 * Docs at Terraform Registry: {@link https://registry.terraform.io/modules/terraform-aws-modules/cloudwatch/aws/~> 3.0/submodules/metric-alarm terraform-aws-modules/cloudwatch/aws//modules/metric-alarm}
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.94.0 (build b380f01)", date = "2024-06-25T19:29:42.369Z")
@software.amazon.jsii.Jsii(module = imports.metric_alarm.$Module.class, fqn = "metric-alarm.MetricAlarm")
public class MetricAlarm extends com.hashicorp.cdktf.TerraformModule {

    protected MetricAlarm(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MetricAlarm(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public MetricAlarm(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.metric_alarm.MetricAlarmConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeHclAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeHclAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchMetricAlarmArnOutput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchMetricAlarmArnOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudwatchMetricAlarmIdOutput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchMetricAlarmIdOutput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAlarmName() {
        return software.amazon.jsii.Kernel.get(this, "alarmName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAlarmName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alarmName", java.util.Objects.requireNonNull(value, "alarmName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComparisonOperator() {
        return software.amazon.jsii.Kernel.get(this, "comparisonOperator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComparisonOperator(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "comparisonOperator", java.util.Objects.requireNonNull(value, "comparisonOperator is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDimensions() {
        return software.amazon.jsii.Kernel.get(this, "dimensions", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDimensions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "dimensions", java.util.Objects.requireNonNull(value, "dimensions is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getEvaluationPeriods() {
        return software.amazon.jsii.Kernel.get(this, "evaluationPeriods", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setEvaluationPeriods(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "evaluationPeriods", java.util.Objects.requireNonNull(value, "evaluationPeriods is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getMetricQuery() {
        return software.amazon.jsii.Kernel.get(this, "metricQuery", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setMetricQuery(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.set(this, "metricQuery", java.util.Objects.requireNonNull(value, "metricQuery is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getActionsEnabled() {
        return software.amazon.jsii.Kernel.get(this, "actionsEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setActionsEnabled(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "actionsEnabled", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAlarmActions() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "alarmActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setAlarmActions(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "alarmActions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAlarmDescription() {
        return software.amazon.jsii.Kernel.get(this, "alarmDescription", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAlarmDescription(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "alarmDescription", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Boolean getCreateMetricAlarm() {
        return software.amazon.jsii.Kernel.get(this, "createMetricAlarm", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
    }

    public void setCreateMetricAlarm(final @org.jetbrains.annotations.Nullable java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createMetricAlarm", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDatapointsToAlarm() {
        return software.amazon.jsii.Kernel.get(this, "datapointsToAlarm", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDatapointsToAlarm(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "datapointsToAlarm", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEvaluateLowSampleCountPercentiles() {
        return software.amazon.jsii.Kernel.get(this, "evaluateLowSampleCountPercentiles", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEvaluateLowSampleCountPercentiles(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "evaluateLowSampleCountPercentiles", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExtendedStatistic() {
        return software.amazon.jsii.Kernel.get(this, "extendedStatistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExtendedStatistic(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "extendedStatistic", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getInsufficientDataActions() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "insufficientDataActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setInsufficientDataActions(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "insufficientDataActions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getMetricName() {
        return software.amazon.jsii.Kernel.get(this, "metricName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setMetricName(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "metricName", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return software.amazon.jsii.Kernel.get(this, "namespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamespace(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namespace", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getOkActions() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "okActions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public void setOkActions(final @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "okActions", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeriod() {
        return software.amazon.jsii.Kernel.get(this, "period", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeriod(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "period", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatistic() {
        return software.amazon.jsii.Kernel.get(this, "statistic", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatistic(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "statistic", value);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public void setTags(final @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getThreshold() {
        return software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setThreshold(final @org.jetbrains.annotations.Nullable java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "threshold", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getThresholdMetricId() {
        return software.amazon.jsii.Kernel.get(this, "thresholdMetricId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setThresholdMetricId(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "thresholdMetricId", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTreatMissingData() {
        return software.amazon.jsii.Kernel.get(this, "treatMissingData", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTreatMissingData(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "treatMissingData", value);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUnit() {
        return software.amazon.jsii.Kernel.get(this, "unit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUnit(final @org.jetbrains.annotations.Nullable java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "unit", value);
    }

    /**
     * A fluent builder for {@link imports.metric_alarm.MetricAlarm}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.metric_alarm.MetricAlarm> {
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
        private final imports.metric_alarm.MetricAlarmConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.metric_alarm.MetricAlarmConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param providers This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder providers(final java.util.List<? extends java.lang.Object> providers) {
            this.config.providers(providers);
            return this;
        }

        /**
         * @return {@code this}
         * @param skipAssetCreationFromLocalModules This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder skipAssetCreationFromLocalModules(final java.lang.Boolean skipAssetCreationFromLocalModules) {
            this.config.skipAssetCreationFromLocalModules(skipAssetCreationFromLocalModules);
            return this;
        }

        /**
         * The descriptive name for the alarm.
         * <p>
         * This name must be unique within the user's AWS account.
         * <p>
         * @return {@code this}
         * @param alarmName The descriptive name for the alarm. This parameter is required.
         */
        public Builder alarmName(final java.lang.String alarmName) {
            this.config.alarmName(alarmName);
            return this;
        }

        /**
         * The arithmetic operation to use when comparing the specified Statistic and Threshold.
         * <p>
         * The specified Statistic value is used as the first operand. Either of the following is supported: GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold.
         * <p>
         * @return {@code this}
         * @param comparisonOperator The arithmetic operation to use when comparing the specified Statistic and Threshold. This parameter is required.
         */
        public Builder comparisonOperator(final java.lang.String comparisonOperator) {
            this.config.comparisonOperator(comparisonOperator);
            return this;
        }

        /**
         * The number of periods over which data is compared to the specified threshold.
         * <p>
         * @return {@code this}
         * @param evaluationPeriods The number of periods over which data is compared to the specified threshold. This parameter is required.
         */
        public Builder evaluationPeriods(final java.lang.Number evaluationPeriods) {
            this.config.evaluationPeriods(evaluationPeriods);
            return this;
        }

        /**
         * Indicates whether or not actions should be executed during any changes to the alarm's state.
         * <p>
         * Defaults to true.
         * true
         * <p>
         * @return {@code this}
         * @param actionsEnabled Indicates whether or not actions should be executed during any changes to the alarm's state. This parameter is required.
         */
        public Builder actionsEnabled(final java.lang.Boolean actionsEnabled) {
            this.config.actionsEnabled(actionsEnabled);
            return this;
        }

        /**
         * The list of actions to execute when this alarm transitions into an ALARM state from any other state.
         * <p>
         * Each action is specified as an Amazon Resource Name (ARN).
         * <p>
         * @return {@code this}
         * @param alarmActions The list of actions to execute when this alarm transitions into an ALARM state from any other state. This parameter is required.
         */
        public Builder alarmActions(final java.util.List<java.lang.String> alarmActions) {
            this.config.alarmActions(alarmActions);
            return this;
        }

        /**
         * The description for the alarm.
         * <p>
         * @return {@code this}
         * @param alarmDescription The description for the alarm. This parameter is required.
         */
        public Builder alarmDescription(final java.lang.String alarmDescription) {
            this.config.alarmDescription(alarmDescription);
            return this;
        }

        /**
         * Whether to create the Cloudwatch metric alarm true.
         * <p>
         * @return {@code this}
         * @param createMetricAlarm Whether to create the Cloudwatch metric alarm true. This parameter is required.
         */
        public Builder createMetricAlarm(final java.lang.Boolean createMetricAlarm) {
            this.config.createMetricAlarm(createMetricAlarm);
            return this;
        }

        /**
         * The number of datapoints that must be breaching to trigger the alarm.
         * <p>
         * @return {@code this}
         * @param datapointsToAlarm The number of datapoints that must be breaching to trigger the alarm. This parameter is required.
         */
        public Builder datapointsToAlarm(final java.lang.Number datapointsToAlarm) {
            this.config.datapointsToAlarm(datapointsToAlarm);
            return this;
        }

        /**
         * The dimensions for the alarm's associated metric.
         * <p>
         * @return {@code this}
         * @param dimensions The dimensions for the alarm's associated metric. This parameter is required.
         */
        public Builder dimensions(final java.lang.Object dimensions) {
            this.config.dimensions(dimensions);
            return this;
        }

        /**
         * Used only for alarms based on percentiles.
         * <p>
         * If you specify ignore, the alarm state will not change during periods with too few data points to be statistically significant. If you specify evaluate or omit this parameter, the alarm will always be evaluated and possibly change state no matter how many data points are available. The following values are supported: ignore, and evaluate.
         * <p>
         * @return {@code this}
         * @param evaluateLowSampleCountPercentiles Used only for alarms based on percentiles. This parameter is required.
         */
        public Builder evaluateLowSampleCountPercentiles(final java.lang.String evaluateLowSampleCountPercentiles) {
            this.config.evaluateLowSampleCountPercentiles(evaluateLowSampleCountPercentiles);
            return this;
        }

        /**
         * The percentile statistic for the metric associated with the alarm.
         * <p>
         * Specify a value between p0.0 and p100.
         * <p>
         * @return {@code this}
         * @param extendedStatistic The percentile statistic for the metric associated with the alarm. This parameter is required.
         */
        public Builder extendedStatistic(final java.lang.String extendedStatistic) {
            this.config.extendedStatistic(extendedStatistic);
            return this;
        }

        /**
         * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state.
         * <p>
         * Each action is specified as an Amazon Resource Name (ARN).
         * <p>
         * @return {@code this}
         * @param insufficientDataActions The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. This parameter is required.
         */
        public Builder insufficientDataActions(final java.util.List<java.lang.String> insufficientDataActions) {
            this.config.insufficientDataActions(insufficientDataActions);
            return this;
        }

        /**
         * The name for the alarm's associated metric.
         * <p>
         * See docs for supported metrics.
         * <p>
         * @return {@code this}
         * @param metricName The name for the alarm's associated metric. This parameter is required.
         */
        public Builder metricName(final java.lang.String metricName) {
            this.config.metricName(metricName);
            return this;
        }

        /**
         * Enables you to create an alarm based on a metric math expression.
         * <p>
         * You may specify at most 20.
         * <p>
         * @return {@code this}
         * @param metricQuery Enables you to create an alarm based on a metric math expression. This parameter is required.
         */
        public Builder metricQuery(final java.lang.Object metricQuery) {
            this.config.metricQuery(metricQuery);
            return this;
        }

        /**
         * The namespace for the alarm's associated metric.
         * <p>
         * See docs for the list of namespaces. See docs for supported metrics.
         * <p>
         * @return {@code this}
         * @param namespace The namespace for the alarm's associated metric. This parameter is required.
         */
        public Builder namespace(final java.lang.String namespace) {
            this.config.namespace(namespace);
            return this;
        }

        /**
         * The list of actions to execute when this alarm transitions into an OK state from any other state.
         * <p>
         * Each action is specified as an Amazon Resource Name (ARN).
         * <p>
         * @return {@code this}
         * @param okActions The list of actions to execute when this alarm transitions into an OK state from any other state. This parameter is required.
         */
        public Builder okActions(final java.util.List<java.lang.String> okActions) {
            this.config.okActions(okActions);
            return this;
        }

        /**
         * The period in seconds over which the specified statistic is applied.
         * <p>
         * @return {@code this}
         * @param period The period in seconds over which the specified statistic is applied. This parameter is required.
         */
        public Builder period(final java.lang.String period) {
            this.config.period(period);
            return this;
        }

        /**
         * The statistic to apply to the alarm's associated metric.
         * <p>
         * Either of the following is supported: SampleCount, Average, Sum, Minimum, Maximum
         * <p>
         * @return {@code this}
         * @param statistic The statistic to apply to the alarm's associated metric. This parameter is required.
         */
        public Builder statistic(final java.lang.String statistic) {
            this.config.statistic(statistic);
            return this;
        }

        /**
         * A mapping of tags to assign to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}.
         * <p>
         * @return {@code this}
         * @param tags A mapping of tags to assign to all resources The property type contains a map, they have special handling, please see {@link cdk.tf /module-map-inputs the docs}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * The value against which the specified statistic is compared.
         * <p>
         * @return {@code this}
         * @param threshold The value against which the specified statistic is compared. This parameter is required.
         */
        public Builder threshold(final java.lang.Number threshold) {
            this.config.threshold(threshold);
            return this;
        }

        /**
         * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
         * <p>
         * @return {@code this}
         * @param thresholdMetricId If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function. This parameter is required.
         */
        public Builder thresholdMetricId(final java.lang.String thresholdMetricId) {
            this.config.thresholdMetricId(thresholdMetricId);
            return this;
        }

        /**
         * Sets how this alarm is to handle missing data points.
         * <p>
         * The following values are supported: missing, ignore, breaching and notBreaching.
         * missing
         * <p>
         * @return {@code this}
         * @param treatMissingData Sets how this alarm is to handle missing data points. This parameter is required.
         */
        public Builder treatMissingData(final java.lang.String treatMissingData) {
            this.config.treatMissingData(treatMissingData);
            return this;
        }

        /**
         * The unit for the alarm's associated metric.
         * <p>
         * @return {@code this}
         * @param unit The unit for the alarm's associated metric. This parameter is required.
         */
        public Builder unit(final java.lang.String unit) {
            this.config.unit(unit);
            return this;
        }

        /**
         * @return a newly built instance of {@link imports.metric_alarm.MetricAlarm}.
         */
        @Override
        public imports.metric_alarm.MetricAlarm build() {
            return new imports.metric_alarm.MetricAlarm(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
