/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The configurable properties of an object type.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConfigParameterDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ConfigParameterDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("parameterType")
        private BaseType parameterType;

        public Builder parameterType(BaseType parameterType) {
            this.parameterType = parameterType;
            this.__explicitlySet__.add("parameterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
        private String parameterName;

        public Builder parameterName(String parameterName) {
            this.parameterName = parameterName;
            this.__explicitlySet__.add("parameterName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("classFieldName")
        private String classFieldName;

        public Builder classFieldName(String classFieldName) {
            this.classFieldName = classFieldName;
            this.__explicitlySet__.add("classFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isStatic")
        private Boolean isStatic;

        public Builder isStatic(Boolean isStatic) {
            this.isStatic = isStatic;
            this.__explicitlySet__.add("isStatic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isClassFieldValue")
        private Boolean isClassFieldValue;

        public Builder isClassFieldValue(Boolean isClassFieldValue) {
            this.isClassFieldValue = isClassFieldValue;
            this.__explicitlySet__.add("isClassFieldValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigParameterDefinition build() {
            ConfigParameterDefinition __instance__ =
                    new ConfigParameterDefinition(
                            parameterType,
                            parameterName,
                            description,
                            defaultValue,
                            classFieldName,
                            isStatic,
                            isClassFieldValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigParameterDefinition o) {
            Builder copiedBuilder =
                    parameterType(o.getParameterType())
                            .parameterName(o.getParameterName())
                            .description(o.getDescription())
                            .defaultValue(o.getDefaultValue())
                            .classFieldName(o.getClassFieldName())
                            .isStatic(o.getIsStatic())
                            .isClassFieldValue(o.getIsClassFieldValue());

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

    @com.fasterxml.jackson.annotation.JsonProperty("parameterType")
    BaseType parameterType;

    /**
     * This object represents the configurable properties for an object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
    String parameterName;

    /**
     * A user defined description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The default value for the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    Object defaultValue;

    /**
     * The parameter class field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classFieldName")
    String classFieldName;

    /**
     * Specifies whether the parameter is static or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStatic")
    Boolean isStatic;

    /**
     * Specifies whether the parameter is a class field or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClassFieldValue")
    Boolean isClassFieldValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
