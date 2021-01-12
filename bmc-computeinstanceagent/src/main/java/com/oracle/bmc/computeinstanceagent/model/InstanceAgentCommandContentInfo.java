/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The command content.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceAgentCommandContentInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceAgentCommandContentInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("instanceAgentCommandId")
        private String instanceAgentCommandId;

        public Builder instanceAgentCommandId(String instanceAgentCommandId) {
            this.instanceAgentCommandId = instanceAgentCommandId;
            this.__explicitlySet__.add("instanceAgentCommandId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCanceled")
        private Boolean isCanceled;

        public Builder isCanceled(Boolean isCanceled) {
            this.isCanceled = isCanceled;
            this.__explicitlySet__.add("isCanceled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
        private Integer executionTimeOutInSeconds;

        public Builder executionTimeOutInSeconds(Integer executionTimeOutInSeconds) {
            this.executionTimeOutInSeconds = executionTimeOutInSeconds;
            this.__explicitlySet__.add("executionTimeOutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private InstanceAgentCommandContent content;

        public Builder content(InstanceAgentCommandContent content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandContentInfo build() {
            InstanceAgentCommandContentInfo __instance__ =
                    new InstanceAgentCommandContentInfo(
                            instanceAgentCommandId,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            isCanceled,
                            executionTimeOutInSeconds,
                            content);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandContentInfo o) {
            Builder copiedBuilder =
                    instanceAgentCommandId(o.getInstanceAgentCommandId())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .isCanceled(o.getIsCanceled())
                            .executionTimeOutInSeconds(o.getExecutionTimeOutInSeconds())
                            .content(o.getContent());

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
     * The command ocid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceAgentCommandId")
    String instanceAgentCommandId;

    /**
     * The OCID of the compartment the command is created in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * created at time of command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * updated time of command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Whether the command has been canceled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCanceled")
    Boolean isCanceled;

    /**
     * The last command time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionTimeOutInSeconds")
    Integer executionTimeOutInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    InstanceAgentCommandContent content;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
