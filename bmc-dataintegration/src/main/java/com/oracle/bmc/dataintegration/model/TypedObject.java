/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The `TypedObject` class is a base class for any model object that has a type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = TypedObject.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OutputPort.class,
        name = "OUTPUT_PORT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DynamicInputField.class,
        name = "DYNAMIC_INPUT_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AbstractField.class,
        name = "FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InputField.class,
        name = "INPUT_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Shape.class, name = "SHAPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InputPort.class,
        name = "INPUT_PORT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ProxyField.class,
        name = "PROXY_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DynamicProxyField.class,
        name = "DYNAMIC_PROXY_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ShapeField.class,
        name = "SHAPE_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Parameter.class,
        name = "PARAMETER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OutputField.class,
        name = "OUTPUT_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MacroField.class,
        name = "MACRO_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DerivedField.class,
        name = "DERIVED_FIELD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = FlowPort.class, name = "FLOW_PORT")
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TypedObject {

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    ConfigValues configValues;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The type of the types object.
     **/
    public enum ModelType {
        Shape("SHAPE"),
        InputPort("INPUT_PORT"),
        ShapeField("SHAPE_FIELD"),
        InputField("INPUT_FIELD"),
        DerivedField("DERIVED_FIELD"),
        MacroField("MACRO_FIELD"),
        OutputField("OUTPUT_FIELD"),
        DynamicProxyField("DYNAMIC_PROXY_FIELD"),
        OutputPort("OUTPUT_PORT"),
        DynamicInputField("DYNAMIC_INPUT_FIELD"),
        ProxyField("PROXY_FIELD"),
        Parameter("PARAMETER"),
        ;

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ModelType: " + key);
        }
    };
}
