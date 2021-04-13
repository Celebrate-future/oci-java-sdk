/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about Oracle GoldenGate Microservices. Required for online logical migration.
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
    builder = CreateGoldenGateHub.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateGoldenGateHub {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("restAdminCredentials")
        private CreateAdminCredentials restAdminCredentials;

        public Builder restAdminCredentials(CreateAdminCredentials restAdminCredentials) {
            this.restAdminCredentials = restAdminCredentials;
            this.__explicitlySet__.add("restAdminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDbAdminCredentials")
        private CreateAdminCredentials sourceDbAdminCredentials;

        public Builder sourceDbAdminCredentials(CreateAdminCredentials sourceDbAdminCredentials) {
            this.sourceDbAdminCredentials = sourceDbAdminCredentials;
            this.__explicitlySet__.add("sourceDbAdminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbAdminCredentials")
        private CreateAdminCredentials sourceContainerDbAdminCredentials;

        public Builder sourceContainerDbAdminCredentials(
                CreateAdminCredentials sourceContainerDbAdminCredentials) {
            this.sourceContainerDbAdminCredentials = sourceContainerDbAdminCredentials;
            this.__explicitlySet__.add("sourceContainerDbAdminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDbAdminCredentials")
        private CreateAdminCredentials targetDbAdminCredentials;

        public Builder targetDbAdminCredentials(CreateAdminCredentials targetDbAdminCredentials) {
            this.targetDbAdminCredentials = targetDbAdminCredentials;
            this.__explicitlySet__.add("targetDbAdminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceMicroservicesDeploymentName")
        private String sourceMicroservicesDeploymentName;

        public Builder sourceMicroservicesDeploymentName(String sourceMicroservicesDeploymentName) {
            this.sourceMicroservicesDeploymentName = sourceMicroservicesDeploymentName;
            this.__explicitlySet__.add("sourceMicroservicesDeploymentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetMicroservicesDeploymentName")
        private String targetMicroservicesDeploymentName;

        public Builder targetMicroservicesDeploymentName(String targetMicroservicesDeploymentName) {
            this.targetMicroservicesDeploymentName = targetMicroservicesDeploymentName;
            this.__explicitlySet__.add("targetMicroservicesDeploymentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeId")
        private String computeId;

        public Builder computeId(String computeId) {
            this.computeId = computeId;
            this.__explicitlySet__.add("computeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGoldenGateHub build() {
            CreateGoldenGateHub __instance__ =
                    new CreateGoldenGateHub(
                            restAdminCredentials,
                            sourceDbAdminCredentials,
                            sourceContainerDbAdminCredentials,
                            targetDbAdminCredentials,
                            url,
                            sourceMicroservicesDeploymentName,
                            targetMicroservicesDeploymentName,
                            computeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGoldenGateHub o) {
            Builder copiedBuilder =
                    restAdminCredentials(o.getRestAdminCredentials())
                            .sourceDbAdminCredentials(o.getSourceDbAdminCredentials())
                            .sourceContainerDbAdminCredentials(
                                    o.getSourceContainerDbAdminCredentials())
                            .targetDbAdminCredentials(o.getTargetDbAdminCredentials())
                            .url(o.getUrl())
                            .sourceMicroservicesDeploymentName(
                                    o.getSourceMicroservicesDeploymentName())
                            .targetMicroservicesDeploymentName(
                                    o.getTargetMicroservicesDeploymentName())
                            .computeId(o.getComputeId());

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

    @com.fasterxml.jackson.annotation.JsonProperty("restAdminCredentials")
    CreateAdminCredentials restAdminCredentials;

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDbAdminCredentials")
    CreateAdminCredentials sourceDbAdminCredentials;

    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDbAdminCredentials")
    CreateAdminCredentials sourceContainerDbAdminCredentials;

    @com.fasterxml.jackson.annotation.JsonProperty("targetDbAdminCredentials")
    CreateAdminCredentials targetDbAdminCredentials;

    /**
     * Oracle GoldenGate hub's REST endpoint.
     * Refer to https://docs.oracle.com/en/middleware/goldengate/core/19.1/securing/network.html#GUID-A709DA55-111D-455E-8942-C9BDD1E38CAA
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    String url;

    /**
     * Name of Microservices deployment to operate on source DB
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMicroservicesDeploymentName")
    String sourceMicroservicesDeploymentName;

    /**
     * Name of Microservices deployment to operate on target DB
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetMicroservicesDeploymentName")
    String targetMicroservicesDeploymentName;

    /**
     * OCID of Golden Gate compute instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeId")
    String computeId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
