/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An OCI DNS resolver VNIC endpoint.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResolverVnicEndpoint.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "endpointType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResolverVnicEndpoint extends ResolverEndpoint {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forwardingAddress")
        private String forwardingAddress;

        public Builder forwardingAddress(String forwardingAddress) {
            this.forwardingAddress = forwardingAddress;
            this.__explicitlySet__.add("forwardingAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isForwarding")
        private Boolean isForwarding;

        public Builder isForwarding(Boolean isForwarding) {
            this.isForwarding = isForwarding;
            this.__explicitlySet__.add("isForwarding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isListening")
        private Boolean isListening;

        public Builder isListening(Boolean isListening) {
            this.isListening = isListening;
            this.__explicitlySet__.add("isListening");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listeningAddress")
        private String listeningAddress;

        public Builder listeningAddress(String listeningAddress) {
            this.listeningAddress = listeningAddress;
            this.__explicitlySet__.add("listeningAddress");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResolverVnicEndpoint build() {
            ResolverVnicEndpoint __instance__ =
                    new ResolverVnicEndpoint(
                            name,
                            forwardingAddress,
                            isForwarding,
                            isListening,
                            listeningAddress,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            self,
                            subnetId,
                            nsgIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResolverVnicEndpoint o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .forwardingAddress(o.getForwardingAddress())
                            .isForwarding(o.getIsForwarding())
                            .isListening(o.getIsListening())
                            .listeningAddress(o.getListeningAddress())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .self(o.getSelf())
                            .subnetId(o.getSubnetId())
                            .nsgIds(o.getNsgIds());

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

    @Deprecated
    public ResolverVnicEndpoint(
            String name,
            String forwardingAddress,
            Boolean isForwarding,
            Boolean isListening,
            String listeningAddress,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String self,
            String subnetId,
            java.util.List<String> nsgIds) {
        super(
                name,
                forwardingAddress,
                isForwarding,
                isListening,
                listeningAddress,
                compartmentId,
                timeCreated,
                timeUpdated,
                lifecycleState,
                self);
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
    }

    /**
     * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * An array of NSG OCIDs for the resolver endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    java.util.List<String> nsgIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
