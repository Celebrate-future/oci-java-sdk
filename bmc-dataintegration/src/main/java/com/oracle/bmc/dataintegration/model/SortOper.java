/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the sort operator.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SortOper.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SortOper extends Operator {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<OutputPort> outputPorts;

        public Builder outputPorts(java.util.List<OutputPort> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortKey")
        private SortKey sortKey;

        public Builder sortKey(SortKey sortKey) {
            this.sortKey = sortKey;
            this.__explicitlySet__.add("sortKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SortOper build() {
            SortOper __instance__ =
                    new SortOper(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            inputPorts,
                            outputPorts,
                            objectStatus,
                            identifier,
                            parameters,
                            opConfigValues,
                            sortKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SortOper o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .inputPorts(o.getInputPorts())
                            .outputPorts(o.getOutputPorts())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .parameters(o.getParameters())
                            .opConfigValues(o.getOpConfigValues())
                            .sortKey(o.getSortKey());

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
    public SortOper(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            Integer objectStatus,
            String identifier,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            SortKey sortKey) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                inputPorts,
                outputPorts,
                objectStatus,
                identifier,
                parameters,
                opConfigValues);
        this.sortKey = sortKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sortKey")
    SortKey sortKey;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
