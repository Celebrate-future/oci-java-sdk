/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * peer to modify ocpu allocation
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
    builder = ModifyPeerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ModifyPeerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("peerName")
        private String peerName;

        public Builder peerName(String peerName) {
            this.peerName = peerName;
            this.__explicitlySet__.add("peerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
        private OcpuAllocationNumberParam ocpuAllocationParam;

        public Builder ocpuAllocationParam(OcpuAllocationNumberParam ocpuAllocationParam) {
            this.ocpuAllocationParam = ocpuAllocationParam;
            this.__explicitlySet__.add("ocpuAllocationParam");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyPeerDetails build() {
            ModifyPeerDetails __instance__ = new ModifyPeerDetails(peerName, ocpuAllocationParam);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyPeerDetails o) {
            Builder copiedBuilder =
                    peerName(o.getPeerName()).ocpuAllocationParam(o.getOcpuAllocationParam());

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
     * peer identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerName")
    String peerName;

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
    OcpuAllocationNumberParam ocpuAllocationParam;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
