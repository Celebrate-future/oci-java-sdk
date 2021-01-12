/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Entities derived from the application of a pattern to a list of file paths.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DerivedLogicalEntities.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DerivedLogicalEntities {
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

        @com.fasterxml.jackson.annotation.JsonProperty("realizedExpression")
        private String realizedExpression;

        public Builder realizedExpression(String realizedExpression) {
            this.realizedExpression = realizedExpression;
            this.__explicitlySet__.add("realizedExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filesInLogicalGrouping")
        private java.util.List<String> filesInLogicalGrouping;

        public Builder filesInLogicalGrouping(java.util.List<String> filesInLogicalGrouping) {
            this.filesInLogicalGrouping = filesInLogicalGrouping;
            this.__explicitlySet__.add("filesInLogicalGrouping");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DerivedLogicalEntities build() {
            DerivedLogicalEntities __instance__ =
                    new DerivedLogicalEntities(name, realizedExpression, filesInLogicalGrouping);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DerivedLogicalEntities o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .realizedExpression(o.getRealizedExpression())
                            .filesInLogicalGrouping(o.getFilesInLogicalGrouping());

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
     * The name of the derived logical entity. The group name of the unmatched files will be UNMATCHED
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The expression realized after resolving qualifiers . Used in deriving this logical entity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("realizedExpression")
    String realizedExpression;

    /**
     * The list of file paths that belong to the grouping of logical entity or UNMATCHED for which realizedExpression is a selector.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filesInLogicalGrouping")
    java.util.List<String> filesInLogicalGrouping;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
