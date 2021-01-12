/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Possible operation types.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.extern.slf4j.Slf4j
public enum OperationTypes {
    CreateBds("CREATE_BDS"),
    UpdateBds("UPDATE_BDS"),
    DeleteBds("DELETE_BDS"),
    AddBlockStorage("ADD_BLOCK_STORAGE"),
    AddWorkerNodes("ADD_WORKER_NODES"),
    AddCloudSql("ADD_CLOUD_SQL"),
    RemoveCloudSql("REMOVE_CLOUD_SQL"),
    ChangeCompartmentForBds("CHANGE_COMPARTMENT_FOR_BDS"),
    ChangeShape("CHANGE_SHAPE"),
    UpdateInfra("UPDATE_INFRA"),
    RestartNode("RESTART_NODE"),
    AutoscaleConfig("AUTOSCALE_CONFIG"),
    AutoscaleRun("AUTOSCALE_RUN"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, OperationTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OperationTypes v : OperationTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OperationTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OperationTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
