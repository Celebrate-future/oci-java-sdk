/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Specifies the details of the MSET model during the create call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModelTrainingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ModelTrainingDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetFap")
        private Float targetFap;

        public Builder targetFap(Float targetFap) {
            this.targetFap = targetFap;
            this.__explicitlySet__.add("targetFap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingFraction")
        private Float trainingFraction;

        public Builder trainingFraction(Float trainingFraction) {
            this.trainingFraction = trainingFraction;
            this.__explicitlySet__.add("trainingFraction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetIds")
        private java.util.List<String> dataAssetIds;

        public Builder dataAssetIds(java.util.List<String> dataAssetIds) {
            this.dataAssetIds = dataAssetIds;
            this.__explicitlySet__.add("dataAssetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelTrainingDetails build() {
            ModelTrainingDetails __instance__ =
                    new ModelTrainingDetails(targetFap, trainingFraction, dataAssetIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelTrainingDetails o) {
            Builder copiedBuilder =
                    targetFap(o.getTargetFap())
                            .trainingFraction(o.getTrainingFraction())
                            .dataAssetIds(o.getDataAssetIds());

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
     * A target model accuracy metric user provides as their requirement
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetFap")
    Float targetFap;

    /**
     * Fraction of total data that is used for training the model. The remaining is used for validation of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainingFraction")
    Float trainingFraction;

    /**
     * The list of OCIDs of the data assets to train the model. The dataAssets have to be in the same project where the ai model would reside.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetIds")
    java.util.List<String> dataAssetIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
