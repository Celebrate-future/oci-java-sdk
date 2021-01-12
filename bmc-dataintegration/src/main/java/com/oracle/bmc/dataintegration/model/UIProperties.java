/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The UI properties of the object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UIProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UIProperties {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("coordinateX")
        private java.math.BigDecimal coordinateX;

        public Builder coordinateX(java.math.BigDecimal coordinateX) {
            this.coordinateX = coordinateX;
            this.__explicitlySet__.add("coordinateX");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("coordinateY")
        private java.math.BigDecimal coordinateY;

        public Builder coordinateY(java.math.BigDecimal coordinateY) {
            this.coordinateY = coordinateY;
            this.__explicitlySet__.add("coordinateY");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UIProperties build() {
            UIProperties __instance__ = new UIProperties(coordinateX, coordinateY);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UIProperties o) {
            Builder copiedBuilder = coordinateX(o.getCoordinateX()).coordinateY(o.getCoordinateY());

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
     * The X coordinate of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coordinateX")
    java.math.BigDecimal coordinateX;

    /**
     * The Y coordinate of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coordinateY")
    java.math.BigDecimal coordinateY;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
