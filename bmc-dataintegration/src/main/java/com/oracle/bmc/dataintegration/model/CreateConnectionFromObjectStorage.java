/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The details to create an Oracle Object Storage data asset connection.
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
    builder = CreateConnectionFromObjectStorage.Builder.class
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
public class CreateConnectionFromObjectStorage extends CreateConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.List<ConnectionProperty> connectionProperties;

        public Builder connectionProperties(
                java.util.List<ConnectionProperty> connectionProperties) {
            this.connectionProperties = connectionProperties;
            this.__explicitlySet__.add("connectionProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
        private String credentialFileContent;

        public Builder credentialFileContent(String credentialFileContent) {
            this.credentialFileContent = credentialFileContent;
            this.__explicitlySet__.add("credentialFileContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fingerPrint")
        private String fingerPrint;

        public Builder fingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            this.__explicitlySet__.add("fingerPrint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passPhrase")
        private String passPhrase;

        public Builder passPhrase(String passPhrase) {
            this.passPhrase = passPhrase;
            this.__explicitlySet__.add("passPhrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateConnectionFromObjectStorage build() {
            CreateConnectionFromObjectStorage __instance__ =
                    new CreateConnectionFromObjectStorage(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectStatus,
                            identifier,
                            connectionProperties,
                            registryMetadata,
                            credentialFileContent,
                            userId,
                            fingerPrint,
                            passPhrase);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateConnectionFromObjectStorage o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .connectionProperties(o.getConnectionProperties())
                            .registryMetadata(o.getRegistryMetadata())
                            .credentialFileContent(o.getCredentialFileContent())
                            .userId(o.getUserId())
                            .fingerPrint(o.getFingerPrint())
                            .passPhrase(o.getPassPhrase());

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
    public CreateConnectionFromObjectStorage(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            java.util.List<ConnectionProperty> connectionProperties,
            RegistryMetadata registryMetadata,
            String credentialFileContent,
            String userId,
            String fingerPrint,
            String passPhrase) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectStatus,
                identifier,
                connectionProperties,
                registryMetadata);
        this.credentialFileContent = credentialFileContent;
        this.userId = userId;
        this.fingerPrint = fingerPrint;
        this.passPhrase = passPhrase;
    }

    /**
     * The credential file content from an Oracle Object Storage wallet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
    String credentialFileContent;

    /**
     * The OCI user OCID for the user to connect to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    /**
     * The fingerprint for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fingerPrint")
    String fingerPrint;

    /**
     * The passphrase for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passPhrase")
    String passPhrase;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
