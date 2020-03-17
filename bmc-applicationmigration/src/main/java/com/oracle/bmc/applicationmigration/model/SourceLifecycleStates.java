/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Resource lifecycle state
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public enum SourceLifecycleStates {
    Creating("CREATING"),
    Deleting("DELETING"),
    Updating("UPDATING"),
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Deleted("DELETED"),
    ;

    private final String value;
    private static java.util.Map<String, SourceLifecycleStates> map;

    static {
        map = new java.util.HashMap<>();
        for (SourceLifecycleStates v : SourceLifecycleStates.values()) {
            map.put(v.getValue(), v);
        }
    }

    SourceLifecycleStates(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SourceLifecycleStates create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SourceLifecycleStates: " + key);
    }
}
