/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines the `routesTo` relationship between virtual network topology entities. A `RoutesTo` relationship
 * is defined when a routing table and a routing rule  are used to govern how to route traffic
 * from one entity to another. For example, a DRG might have a routing rule to send certain traffic to an LPG.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopologyRoutesToEntityRelationship.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TopologyRoutesToEntityRelationship extends TopologyEntityRelationship {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id1")
        private String id1;

        public Builder id1(String id1) {
            this.id1 = id1;
            this.__explicitlySet__.add("id1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id2")
        private String id2;

        public Builder id2(String id2) {
            this.id2 = id2;
            this.__explicitlySet__.add("id2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeRuleDetails")
        private TopologyRoutesToRelationshipDetails routeRuleDetails;

        public Builder routeRuleDetails(TopologyRoutesToRelationshipDetails routeRuleDetails) {
            this.routeRuleDetails = routeRuleDetails;
            this.__explicitlySet__.add("routeRuleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopologyRoutesToEntityRelationship build() {
            TopologyRoutesToEntityRelationship __instance__ =
                    new TopologyRoutesToEntityRelationship(id1, id2, routeRuleDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyRoutesToEntityRelationship o) {
            Builder copiedBuilder =
                    id1(o.getId1()).id2(o.getId2()).routeRuleDetails(o.getRouteRuleDetails());

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
    public TopologyRoutesToEntityRelationship(
            String id1, String id2, TopologyRoutesToRelationshipDetails routeRuleDetails) {
        super(id1, id2);
        this.routeRuleDetails = routeRuleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("routeRuleDetails")
    TopologyRoutesToRelationshipDetails routeRuleDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
