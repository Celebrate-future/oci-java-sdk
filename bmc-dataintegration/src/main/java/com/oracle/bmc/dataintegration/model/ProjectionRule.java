/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Base type for how fields are projected. There are many different mechanisms for doing this such as by a name pattern, datatype and so on. See the `modelType` property for the types.
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
    defaultImpl = ProjectionRule.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RenameRule.class,
        name = "RENAME_RULE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TypeListRule.class,
        name = "TYPE_LIST_RULE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TypedNamePatternRule.class,
        name = "TYPED_NAME_PATTERN_RULE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NamePatternRule.class,
        name = "NAME_PATTERN_RULE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NameListRule.class,
        name = "NAME_LIST_RULE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ProjectionRule {

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

    /**
     * Specifies whether the rule uses a java regex syntax.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
    Boolean isJavaRegexSyntax;

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    ConfigValues configValues;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * A user defined description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The type of the project rule.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ModelType {
        NamePatternRule("NAME_PATTERN_RULE"),
        TypeListRule("TYPE_LIST_RULE"),
        NameListRule("NAME_LIST_RULE"),
        TypedNamePatternRule("TYPED_NAME_PATTERN_RULE"),
        RenameRule("RENAME_RULE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
