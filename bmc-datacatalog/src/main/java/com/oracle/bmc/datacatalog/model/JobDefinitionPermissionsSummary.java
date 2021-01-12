/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Permissions object for job definitions.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JobDefinitionPermissionsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JobDefinitionPermissionsSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
        private String jobDefinitionKey;

        public Builder jobDefinitionKey(String jobDefinitionKey) {
            this.jobDefinitionKey = jobDefinitionKey;
            this.__explicitlySet__.add("jobDefinitionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
        private java.util.List<String> userPermissions;

        public Builder userPermissions(java.util.List<String> userPermissions) {
            this.userPermissions = userPermissions;
            this.__explicitlySet__.add("userPermissions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobDefinitionPermissionsSummary build() {
            JobDefinitionPermissionsSummary __instance__ =
                    new JobDefinitionPermissionsSummary(jobDefinitionKey, userPermissions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobDefinitionPermissionsSummary o) {
            Builder copiedBuilder =
                    jobDefinitionKey(o.getJobDefinitionKey())
                            .userPermissions(o.getUserPermissions());

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
     * The unique key of the parent job definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
    String jobDefinitionKey;

    /**
     * An array of permissions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userPermissions")
    java.util.List<String> userPermissions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
