/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The shape of the DB System. The shape determines resources to allocate
 * to the DB System - CPU cores and memory for VM shapes; CPU cores, memory
 * and storage for non-VM (or bare metal) shapes.  For a description of
 * shapes, see [DB System Shape Options](https://docs.cloud.oracle.com/mysql-database/doc/shapes.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ShapeSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSupportedFor")
        private java.util.List<IsSupportedFor> isSupportedFor;

        public Builder isSupportedFor(java.util.List<IsSupportedFor> isSupportedFor) {
            this.isSupportedFor = isSupportedFor;
            this.__explicitlySet__.add("isSupportedFor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeSummary build() {
            ShapeSummary __instance__ =
                    new ShapeSummary(name, cpuCoreCount, memorySizeInGBs, isSupportedFor);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .isSupportedFor(o.getIsSupportedFor());

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
     * The name of the shape used for the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The number of CPU Cores the Instance provides. These are \"OCPU\"s.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The amount of RAM the Instance provides. This is an IEC base-2 number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    Integer memorySizeInGBs;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum IsSupportedFor {
        Dbsystem("DBSYSTEM"),
        Analyticscluster("ANALYTICSCLUSTER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, IsSupportedFor> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSupportedFor v : IsSupportedFor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IsSupportedFor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSupportedFor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IsSupportedFor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * What service features the shape is supported for.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportedFor")
    java.util.List<IsSupportedFor> isSupportedFor;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
