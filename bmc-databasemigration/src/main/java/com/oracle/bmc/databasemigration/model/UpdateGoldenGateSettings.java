/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional settings for Oracle GoldenGate processes
 * If an empty object is specified, the stored Golden Gate Settings details will be removed.
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
    builder = UpdateGoldenGateSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateGoldenGateSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("extract")
        private UpdateExtract extract;

        public Builder extract(UpdateExtract extract) {
            this.extract = extract;
            this.__explicitlySet__.add("extract");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicat")
        private UpdateReplicat replicat;

        public Builder replicat(UpdateReplicat replicat) {
            this.replicat = replicat;
            this.__explicitlySet__.add("replicat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
        private Integer acceptableLag;

        public Builder acceptableLag(Integer acceptableLag) {
            this.acceptableLag = acceptableLag;
            this.__explicitlySet__.add("acceptableLag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateGoldenGateSettings build() {
            UpdateGoldenGateSettings __instance__ =
                    new UpdateGoldenGateSettings(extract, replicat, acceptableLag);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGoldenGateSettings o) {
            Builder copiedBuilder =
                    extract(o.getExtract())
                            .replicat(o.getReplicat())
                            .acceptableLag(o.getAcceptableLag());

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

    @com.fasterxml.jackson.annotation.JsonProperty("extract")
    UpdateExtract extract;

    @com.fasterxml.jackson.annotation.JsonProperty("replicat")
    UpdateReplicat replicat;

    /**
     * ODMS will monitor GoldenGate end-to-end latency until the lag time is lower than the specified value in seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("acceptableLag")
    Integer acceptableLag;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
