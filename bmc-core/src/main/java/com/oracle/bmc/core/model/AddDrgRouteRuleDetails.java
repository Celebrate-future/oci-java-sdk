/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details needed when adding a DRG route rule.
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
    builder = AddDrgRouteRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AddDrgRouteRuleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
        private String nextHopDrgAttachmentId;

        public Builder nextHopDrgAttachmentId(String nextHopDrgAttachmentId) {
            this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
            this.__explicitlySet__.add("nextHopDrgAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDrgRouteRuleDetails build() {
            AddDrgRouteRuleDetails __instance__ =
                    new AddDrgRouteRuleDetails(
                            destinationType, destination, nextHopDrgAttachmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDrgRouteRuleDetails o) {
            Builder copiedBuilder =
                    destinationType(o.getDestinationType())
                            .destination(o.getDestination())
                            .nextHopDrgAttachmentId(o.getNextHopDrgAttachmentId());

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
     * Type of destination for the rule. Required if `direction` = `EGRESS`.
     * Allowed values:
     *   * `CIDR_BLOCK`: If the rule's `destination` is an IP address range in CIDR notation.
     *
     **/
    public enum DestinationType {
        CidrBlock("CIDR_BLOCK"),
        ;

        private final String value;
        private static java.util.Map<String, DestinationType> map;

        static {
            map = new java.util.HashMap<>();
            for (DestinationType v : DestinationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DestinationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DestinationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DestinationType: " + key);
        }
    };
    /**
     * Type of destination for the rule. Required if `direction` = `EGRESS`.
     * Allowed values:
     *   * `CIDR_BLOCK`: If the rule's `destination` is an IP address range in CIDR notation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    DestinationType destinationType;

    /**
     * This is the range of IP addresses used for matching when routing
     * traffic. Only CIDR_BLOCK values are allowed.
     * <p>
     * Potential values:
     *   * IP address range in CIDR notation. This can be an IPv4 or IPv6 CIDR. For example: `192.168.1.0/24`
     *   or `2001:0db8:0123:45::/56`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    String destination;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment. The next hop DRG attachment is responsible
     * for reaching the network destination.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
    String nextHopDrgAttachmentId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
