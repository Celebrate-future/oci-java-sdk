/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform Instance Summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlockchainPlatformSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BlockchainPlatformSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
        private BlockchainPlatform.PlatformRole platformRole;

        public Builder platformRole(BlockchainPlatform.PlatformRole platformRole) {
            this.platformRole = platformRole;
            this.__explicitlySet__.add("platformRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private BlockchainPlatform.ComputeShape computeShape;

        public Builder computeShape(BlockchainPlatform.ComputeShape computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
        private String serviceEndpoint;

        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            this.__explicitlySet__.add("serviceEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BlockchainPlatform.LifecycleState lifecycleState;

        public Builder lifecycleState(BlockchainPlatform.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockchainPlatformSummary build() {
            BlockchainPlatformSummary __instance__ =
                    new BlockchainPlatformSummary(
                            id,
                            displayName,
                            compartmentId,
                            description,
                            timeCreated,
                            timeUpdated,
                            platformRole,
                            computeShape,
                            serviceEndpoint,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockchainPlatformSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .platformRole(o.getPlatformRole())
                            .computeShape(o.getComputeShape())
                            .serviceEndpoint(o.getServiceEndpoint())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Platform Instance Display name, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Platform Instance Description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The time the the Platform Instance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the Platform Instance was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Role of platform - founder or participant
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
    BlockchainPlatform.PlatformRole platformRole;

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    BlockchainPlatform.ComputeShape computeShape;

    /**
     * Service endpoint URL, valid post-provisioning
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
    String serviceEndpoint;

    /**
     * The current state of the Platform Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    BlockchainPlatform.LifecycleState lifecycleState;

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
