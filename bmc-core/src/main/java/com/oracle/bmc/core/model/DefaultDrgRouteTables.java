/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The default DRG route table for this DRG. Each network type
 * has a default DRG route table.
 * <p>
 * You can update a network type to use a different DRG route table, but
 * each network type must have a default DRG route table. You cannot delete
 * a default DRG route table.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefaultDrgRouteTables.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DefaultDrgRouteTables {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("vcn")
        private String vcn;

        public Builder vcn(String vcn) {
            this.vcn = vcn;
            this.__explicitlySet__.add("vcn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipsecTunnel")
        private String ipsecTunnel;

        public Builder ipsecTunnel(String ipsecTunnel) {
            this.ipsecTunnel = ipsecTunnel;
            this.__explicitlySet__.add("ipsecTunnel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("virtualCircuit")
        private String virtualCircuit;

        public Builder virtualCircuit(String virtualCircuit) {
            this.virtualCircuit = virtualCircuit;
            this.__explicitlySet__.add("virtualCircuit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remotePeeringConnection")
        private String remotePeeringConnection;

        public Builder remotePeeringConnection(String remotePeeringConnection) {
            this.remotePeeringConnection = remotePeeringConnection;
            this.__explicitlySet__.add("remotePeeringConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultDrgRouteTables build() {
            DefaultDrgRouteTables __instance__ =
                    new DefaultDrgRouteTables(
                            vcn, ipsecTunnel, virtualCircuit, remotePeeringConnection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultDrgRouteTables o) {
            Builder copiedBuilder =
                    vcn(o.getVcn())
                            .ipsecTunnel(o.getIpsecTunnel())
                            .virtualCircuit(o.getVirtualCircuit())
                            .remotePeeringConnection(o.getRemotePeeringConnection());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type VCN on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcn")
    String vcn;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table assigned to DRG attachments
     * of type IPSEC_TUNNEL on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecTunnel")
    String ipsecTunnel;

    /**
     * The OCID of the default DRG route table to be assigned to DRG attachments
     * of type VIRTUAL_CIRCUIT on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualCircuit")
    String virtualCircuit;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the default DRG route table to be assigned to DRG attachments
     * of type REMOTE_PEERING_CONNECTION on creation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remotePeeringConnection")
    String remotePeeringConnection;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
