/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The configuration details of an Object Storage based collection rule.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsObjectCollectionRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsObjectCollectionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osNamespace")
        private String osNamespace;

        public Builder osNamespace(String osNamespace) {
            this.osNamespace = osNamespace;
            this.__explicitlySet__.add("osNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osBucketName")
        private String osBucketName;

        public Builder osBucketName(String osBucketName) {
            this.osBucketName = osBucketName;
            this.__explicitlySet__.add("osBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
        private ObjectCollectionRuleCollectionTypes collectionType;

        public Builder collectionType(ObjectCollectionRuleCollectionTypes collectionType) {
            this.collectionType = collectionType;
            this.__explicitlySet__.add("collectionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pollSince")
        private String pollSince;

        public Builder pollSince(String pollSince) {
            this.pollSince = pollSince;
            this.__explicitlySet__.add("pollSince");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pollTill")
        private String pollTill;

        public Builder pollTill(String pollTill) {
            this.pollTill = pollTill;
            this.__explicitlySet__.add("pollTill");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logSourceName")
        private String logSourceName;

        public Builder logSourceName(String logSourceName) {
            this.logSourceName = logSourceName;
            this.__explicitlySet__.add("logSourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("charEncoding")
        private String charEncoding;

        public Builder charEncoding(String charEncoding) {
            this.charEncoding = charEncoding;
            this.__explicitlySet__.add("charEncoding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overrides")
        private java.util.Map<String, java.util.List<PropertyOverride>> overrides;

        public Builder overrides(
                java.util.Map<String, java.util.List<PropertyOverride>> overrides) {
            this.overrides = overrides;
            this.__explicitlySet__.add("overrides");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsObjectCollectionRule build() {
            LogAnalyticsObjectCollectionRule __instance__ =
                    new LogAnalyticsObjectCollectionRule(
                            id,
                            name,
                            description,
                            compartmentId,
                            osNamespace,
                            osBucketName,
                            collectionType,
                            pollSince,
                            pollTill,
                            logGroupId,
                            logSourceName,
                            entityId,
                            charEncoding,
                            overrides,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            timeUpdated,
                            definedTags,
                            freeformTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsObjectCollectionRule o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .osNamespace(o.getOsNamespace())
                            .osBucketName(o.getOsBucketName())
                            .collectionType(o.getCollectionType())
                            .pollSince(o.getPollSince())
                            .pollTill(o.getPollTill())
                            .logGroupId(o.getLogGroupId())
                            .logSourceName(o.getLogSourceName())
                            .entityId(o.getEntityId())
                            .charEncoding(o.getCharEncoding())
                            .overrides(o.getOverrides())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * A unique name to the rule. The name must be unique, within the tenancy, and cannot be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A string that describes the details of the rule. It does not have to be unique, and can be changed.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this rule belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Object Storage namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osNamespace")
    String osNamespace;

    /**
     * Name of the Object Storage bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osBucketName")
    String osBucketName;

    /**
     * The type of collection.
     * Supported collection types: LIVE, HISTORIC, HISTORIC_LIVE
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
    ObjectCollectionRuleCollectionTypes collectionType;

    /**
     * The oldest time of the file in the bucket to consider for collection.
     * Accepted values are: BEGINNING or CURRENT_TIME or RFC3339 formatted datetime string.
     * When collectionType is LIVE, specifying pollSince value other than CURRENT_TIME will result in error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pollSince")
    String pollSince;

    /**
     * The oldest time of the file in the bucket to consider for collection.
     * Accepted values are: CURRENT_TIME or RFC3339 formatted datetime string.
     * When collectionType is LIVE, specifying pollTill will result in error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pollTill")
    String pollTill;

    /**
     * Logging Analytics Log group OCID to associate the processed logs with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    String logGroupId;

    /**
     * Name of the Logging Analytics Source to use for the processing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logSourceName")
    String logSourceName;

    /**
     * Logging Analytics entity OCID to associate the processed logs with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    String entityId;

    /**
     * An optional character encoding to aid in detecting the character encoding of the contents of the objects while processing.
     * It is recommended to set this value as ISO_8589_1 when configuring content of the objects having more numeric characters,
     * and very few alphabets.
     * For e.g. this applies when configuring VCN Flow Logs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("charEncoding")
    String charEncoding;

    /**
     * Use this to override some property values which are defined at bucket level to the scope of object.
     * Supported propeties for override are, logSourceName, charEncoding.
     * Supported matchType for override are \"contains\".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    java.util.Map<String, java.util.List<PropertyOverride>> overrides;
    /**
     * The current state of the rule.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Active("ACTIVE"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the rule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A detailed status of the life cycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The time when this rule was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time when this rule was last updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
