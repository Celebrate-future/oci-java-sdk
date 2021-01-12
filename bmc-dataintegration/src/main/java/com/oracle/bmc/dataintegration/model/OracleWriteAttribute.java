/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The Oracle write attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OracleWriteAttribute.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OracleWriteAttribute extends AbstractWriteAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("batchSize")
        private Integer batchSize;

        public Builder batchSize(Integer batchSize) {
            this.batchSize = batchSize;
            this.__explicitlySet__.add("batchSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTruncate")
        private Boolean isTruncate;

        public Builder isTruncate(Boolean isTruncate) {
            this.isTruncate = isTruncate;
            this.__explicitlySet__.add("isTruncate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isolationLevel")
        private String isolationLevel;

        public Builder isolationLevel(String isolationLevel) {
            this.isolationLevel = isolationLevel;
            this.__explicitlySet__.add("isolationLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleWriteAttribute build() {
            OracleWriteAttribute __instance__ =
                    new OracleWriteAttribute(batchSize, isTruncate, isolationLevel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleWriteAttribute o) {
            Builder copiedBuilder =
                    batchSize(o.getBatchSize())
                            .isTruncate(o.getIsTruncate())
                            .isolationLevel(o.getIsolationLevel());

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
    public OracleWriteAttribute(Integer batchSize, Boolean isTruncate, String isolationLevel) {
        super();
        this.batchSize = batchSize;
        this.isTruncate = isTruncate;
        this.isolationLevel = isolationLevel;
    }

    /**
     * The batch size for writing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchSize")
    Integer batchSize;

    /**
     * Specifies whether to truncate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTruncate")
    Boolean isTruncate;

    /**
     * Specifies the isolation level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isolationLevel")
    String isolationLevel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
