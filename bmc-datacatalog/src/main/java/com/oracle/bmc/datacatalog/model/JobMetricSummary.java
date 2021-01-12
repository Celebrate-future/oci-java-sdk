/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Job metric summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobMetricSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JobMetricSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
        private String jobExecutionKey;

        public Builder jobExecutionKey(String jobExecutionKey) {
            this.jobExecutionKey = jobExecutionKey;
            this.__explicitlySet__.add("jobExecutionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeInserted")
        private java.util.Date timeInserted;

        public Builder timeInserted(java.util.Date timeInserted) {
            this.timeInserted = timeInserted;
            this.__explicitlySet__.add("timeInserted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
        private String subCategory;

        public Builder subCategory(String subCategory) {
            this.subCategory = subCategory;
            this.__explicitlySet__.add("subCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchKey")
        private String batchKey;

        public Builder batchKey(String batchKey) {
            this.batchKey = batchKey;
            this.__explicitlySet__.add("batchKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobMetricSummary build() {
            JobMetricSummary __instance__ =
                    new JobMetricSummary(
                            key,
                            description,
                            jobExecutionKey,
                            uri,
                            timeCreated,
                            timeInserted,
                            category,
                            displayName,
                            subCategory,
                            unit,
                            value,
                            batchKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobMetricSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .description(o.getDescription())
                            .jobExecutionKey(o.getJobExecutionKey())
                            .uri(o.getUri())
                            .timeCreated(o.getTimeCreated())
                            .timeInserted(o.getTimeInserted())
                            .category(o.getCategory())
                            .displayName(o.getDisplayName())
                            .subCategory(o.getSubCategory())
                            .unit(o.getUnit())
                            .value(o.getValue())
                            .batchKey(o.getBatchKey());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Key of the job metric that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Detailed description of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The unique key of the parent job execution for which the job metric resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
    String jobExecutionKey;

    /**
     * URI to the job metric instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * The date and time the job metric was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the metric was logged or captured in the system where the job executed.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInserted")
    java.util.Date timeInserted;

    /**
     * Category of this metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Sub category of this metric under the category. Used for aggregating values. May be null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
    String subCategory;

    /**
     * Unit of this metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    String unit;

    /**
     * Value of this metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * Batch key for grouping, may be null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchKey")
    String batchKey;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
