/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible shape, the amount of networking bandwidth available for instances that use this shape.
 * <p>
 * If this field is null, then this shape has a fixed amount of bandwidth equivalent to `networkingBandwidthInGbps`.
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
    builder = ShapeNetworkingBandwidthOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ShapeNetworkingBandwidthOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("minInGbps")
        private Float minInGbps;

        public Builder minInGbps(Float minInGbps) {
            this.minInGbps = minInGbps;
            this.__explicitlySet__.add("minInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxInGbps")
        private Float maxInGbps;

        public Builder maxInGbps(Float maxInGbps) {
            this.maxInGbps = maxInGbps;
            this.__explicitlySet__.add("maxInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGbps")
        private Float defaultPerOcpuInGbps;

        public Builder defaultPerOcpuInGbps(Float defaultPerOcpuInGbps) {
            this.defaultPerOcpuInGbps = defaultPerOcpuInGbps;
            this.__explicitlySet__.add("defaultPerOcpuInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeNetworkingBandwidthOptions build() {
            ShapeNetworkingBandwidthOptions __instance__ =
                    new ShapeNetworkingBandwidthOptions(minInGbps, maxInGbps, defaultPerOcpuInGbps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeNetworkingBandwidthOptions o) {
            Builder copiedBuilder =
                    minInGbps(o.getMinInGbps())
                            .maxInGbps(o.getMaxInGbps())
                            .defaultPerOcpuInGbps(o.getDefaultPerOcpuInGbps());

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
     * The minimum amount of networking bandwidth, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minInGbps")
    Float minInGbps;

    /**
     * The maximum amount of networking bandwidth, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGbps")
    Float maxInGbps;

    /**
     * The default amount of networking bandwidth per OCPU, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGbps")
    Float defaultPerOcpuInGbps;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
