/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingingestion.model;

/**
 * Contains the log content with the associated timestamp and ID. Each
 * entry should be less than 1 MB size.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200831")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private java.util.Date time;

        public Builder time(java.util.Date time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogEntry build() {
            LogEntry __instance__ = new LogEntry(data, id, time);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogEntry o) {
            Builder copiedBuilder = data(o.getData()).id(o.getId()).time(o.getTime());

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
     * The log entry content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    String data;

    /**
     * UUID uniquely representing this logEntry. This is not an OCID related
     * to any oracle resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Optional. The timestamp associated with the log entry. An RFC3339-formatted date-time string.
     * If unspecified, defaults to PutLogsDetails.defaultlogentrytime.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    java.util.Date time;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
