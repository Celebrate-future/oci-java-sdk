/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Update Migration resource parameters.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200720")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateMigrationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateMigrationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MigrationTypes type;

        public Builder type(MigrationTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
        private String sourceDatabaseConnectionId;

        public Builder sourceDatabaseConnectionId(String sourceDatabaseConnectionId) {
            this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
            this.__explicitlySet__.add("sourceDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        public Builder sourceContainerDatabaseConnectionId(
                String sourceContainerDatabaseConnectionId) {
            this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
            this.__explicitlySet__.add("sourceContainerDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
        private String targetDatabaseConnectionId;

        public Builder targetDatabaseConnectionId(String targetDatabaseConnectionId) {
            this.targetDatabaseConnectionId = targetDatabaseConnectionId;
            this.__explicitlySet__.add("targetDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
        private UpdateDataTransferMediumDetails dataTransferMediumDetails;

        public Builder dataTransferMediumDetails(
                UpdateDataTransferMediumDetails dataTransferMediumDetails) {
            this.dataTransferMediumDetails = dataTransferMediumDetails;
            this.__explicitlySet__.add("dataTransferMediumDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("datapumpSettings")
        private UpdateDataPumpSettings datapumpSettings;

        public Builder datapumpSettings(UpdateDataPumpSettings datapumpSettings) {
            this.datapumpSettings = datapumpSettings;
            this.__explicitlySet__.add("datapumpSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
        private java.util.List<DatabaseObject> excludeObjects;

        public Builder excludeObjects(java.util.List<DatabaseObject> excludeObjects) {
            this.excludeObjects = excludeObjects;
            this.__explicitlySet__.add("excludeObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("goldenGateDetails")
        private UpdateGoldenGateDetails goldenGateDetails;

        public Builder goldenGateDetails(UpdateGoldenGateDetails goldenGateDetails) {
            this.goldenGateDetails = goldenGateDetails;
            this.__explicitlySet__.add("goldenGateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
        private UpdateVaultDetails vaultDetails;

        public Builder vaultDetails(UpdateVaultDetails vaultDetails) {
            this.vaultDetails = vaultDetails;
            this.__explicitlySet__.add("vaultDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMigrationDetails build() {
            UpdateMigrationDetails __instance__ =
                    new UpdateMigrationDetails(
                            type,
                            displayName,
                            agentId,
                            sourceDatabaseConnectionId,
                            sourceContainerDatabaseConnectionId,
                            targetDatabaseConnectionId,
                            dataTransferMediumDetails,
                            datapumpSettings,
                            excludeObjects,
                            goldenGateDetails,
                            vaultDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMigrationDetails o) {
            Builder copiedBuilder =
                    type(o.getType())
                            .displayName(o.getDisplayName())
                            .agentId(o.getAgentId())
                            .sourceDatabaseConnectionId(o.getSourceDatabaseConnectionId())
                            .sourceContainerDatabaseConnectionId(
                                    o.getSourceContainerDatabaseConnectionId())
                            .targetDatabaseConnectionId(o.getTargetDatabaseConnectionId())
                            .dataTransferMediumDetails(o.getDataTransferMediumDetails())
                            .datapumpSettings(o.getDatapumpSettings())
                            .excludeObjects(o.getExcludeObjects())
                            .goldenGateDetails(o.getGoldenGateDetails())
                            .vaultDetails(o.getVaultDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * Migration type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    MigrationTypes type;

    /**
     * Migration Display Name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the registered ODMS Agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    String agentId;

    /**
     * The OCID of the Source Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
    String sourceDatabaseConnectionId;

    /**
     * The OCID of the Source Container Database Connection. Only used for ONLINE migrations.
     * Only Connections of type Non-Autonomous can be used as source container databases.
     * An empty value would remove the stored Connection Id.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the Target Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
    String targetDatabaseConnectionId;

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    UpdateDataTransferMediumDetails dataTransferMediumDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("datapumpSettings")
    UpdateDataPumpSettings datapumpSettings;

    /**
     * Database objects to exclude from migration.
     * If specified, the list will be replaced entirely. Empty list will remove stored excludeObjects details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
    java.util.List<DatabaseObject> excludeObjects;

    @com.fasterxml.jackson.annotation.JsonProperty("goldenGateDetails")
    UpdateGoldenGateDetails goldenGateDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    UpdateVaultDetails vaultDetails;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
