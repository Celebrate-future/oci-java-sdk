/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Metadata parameter details
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetadataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MetadataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("paramName")
        private String paramName;

        public Builder paramName(String paramName) {
            this.paramName = paramName;
            this.__explicitlySet__.add("paramName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
        private String paramValue;

        public Builder paramValue(String paramValue) {
            this.paramValue = paramValue;
            this.__explicitlySet__.add("paramValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isJsonValue")
        private Boolean isJsonValue;

        public Builder isJsonValue(Boolean isJsonValue) {
            this.isJsonValue = isJsonValue;
            this.__explicitlySet__.add("isJsonValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetadataDetails build() {
            MetadataDetails __instance__ = new MetadataDetails(paramName, paramValue, isJsonValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetadataDetails o) {
            Builder copiedBuilder =
                    paramName(o.getParamName())
                            .paramValue(o.getParamValue())
                            .isJsonValue(o.getIsJsonValue());

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
     * Metadata param name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paramName")
    String paramName;

    /**
     * Metadata param value. Complex value will be a JSON string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paramValue")
    String paramValue;

    /**
     * Indicates if the value is a JSON string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isJsonValue")
    Boolean isJsonValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
