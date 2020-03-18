/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A term workflow is a sequence of steps or tasks usually done by a data steward as part of the governance lifecycle.
 * Business terms cannot be used for tagging unless they are APPROVED by the busines term owner (usually a data steward).
 * By default, most terms, when created, are in the NEW status unless specified otherwise.
 * NEW           - This is the default workflow status when a term is newly created. The owner can override this status during the creation.
 * APPROVED      - This term is ready for use. It can be used to tag data assets, data entities, attributes, and other taggable resources.
 * UNDER_REVIEW  - The term is currently under review and cannot be used until it is in APPROVED status.
 * ESCALATED     - The review of this term is escalated to fast track for use in tagging.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public enum TermWorkflowStatus {
    New("NEW"),
    Approved("APPROVED"),
    UnderReview("UNDER_REVIEW"),
    Escalated("ESCALATED"),
    ;

    private final String value;
    private static java.util.Map<String, TermWorkflowStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (TermWorkflowStatus v : TermWorkflowStatus.values()) {
            map.put(v.getValue(), v);
        }
    }

    TermWorkflowStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TermWorkflowStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid TermWorkflowStatus: " + key);
    }
}
