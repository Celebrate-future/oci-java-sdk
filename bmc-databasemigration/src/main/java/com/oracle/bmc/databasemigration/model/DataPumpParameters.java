/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional parameters for Datapump Export and Import. Refer to https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/ODMS_DATAPUMP.html#GUID-62324358-2F26-4A94-B69F-1075D53FA96D__BABDECJE
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
    builder = DataPumpParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DataPumpParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimate")
        private DataPumpEstimate estimate;

        public Builder estimate(DataPumpEstimate estimate) {
            this.estimate = estimate;
            this.__explicitlySet__.add("estimate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableExistsAction")
        private DataPumpTableExistsAction tableExistsAction;

        public Builder tableExistsAction(DataPumpTableExistsAction tableExistsAction) {
            this.tableExistsAction = tableExistsAction;
            this.__explicitlySet__.add("tableExistsAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("excludeParameters")
        private java.util.List<DataPumpExcludeParameters> excludeParameters;

        public Builder excludeParameters(
                java.util.List<DataPumpExcludeParameters> excludeParameters) {
            this.excludeParameters = excludeParameters;
            this.__explicitlySet__.add("excludeParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importParallelismDegree")
        private Integer importParallelismDegree;

        public Builder importParallelismDegree(Integer importParallelismDegree) {
            this.importParallelismDegree = importParallelismDegree;
            this.__explicitlySet__.add("importParallelismDegree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportParallelismDegree")
        private Integer exportParallelismDegree;

        public Builder exportParallelismDegree(Integer exportParallelismDegree) {
            this.exportParallelismDegree = exportParallelismDegree;
            this.__explicitlySet__.add("exportParallelismDegree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataPumpParameters build() {
            DataPumpParameters __instance__ =
                    new DataPumpParameters(
                            isCluster,
                            estimate,
                            tableExistsAction,
                            excludeParameters,
                            importParallelismDegree,
                            exportParallelismDegree);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataPumpParameters o) {
            Builder copiedBuilder =
                    isCluster(o.getIsCluster())
                            .estimate(o.getEstimate())
                            .tableExistsAction(o.getTableExistsAction())
                            .excludeParameters(o.getExcludeParameters())
                            .importParallelismDegree(o.getImportParallelismDegree())
                            .exportParallelismDegree(o.getExportParallelismDegree());

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
     * False to force datapump worker process to run on one instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    Boolean isCluster;

    /**
     * Estimate size of dumps that will be generated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimate")
    DataPumpEstimate estimate;

    /**
     * IMPORT: Specifies the action to be performed when data is loaded into a preexisting table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableExistsAction")
    DataPumpTableExistsAction tableExistsAction;

    /**
     * Exclude paratemers for export and import.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("excludeParameters")
    java.util.List<DataPumpExcludeParameters> excludeParameters;

    /**
     * Maximum number of worker processes that can be used for a Datapump Import job.
     * For an Autonomous Database, ODMS will automatically query its CPU core count and set this property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importParallelismDegree")
    Integer importParallelismDegree;

    /**
     * Maximum number of worker processes that can be used for a Datapump Export job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportParallelismDegree")
    Integer exportParallelismDegree;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
