/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.applicationmigration.requests;

import com.oracle.bmc.applicationmigration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListSourcesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment OCID on which to filter.
     */
    private String compartmentId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The OCID on which to query for a source.
     *
     */
    private String id;

    /**
     * The number of items returned in a paginated `List` call. For information about pagination, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the preceding `List` call.
     * For information about pagination, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * The sort order, either `ASC` (ascending) or `DESC` (descending).
     *
     */
    private com.oracle.bmc.applicationmigration.model.SortOrders sortOrder;

    /**
     * Specifies the field on which to sort.
     * By default, `TIMECREATED` is ordered descending.
     * By default, `DISPLAYNAME` is ordered ascending. Note that you can sort only on one field.
     *
     */
    private SortBy sortBy;

    /**
     * Specifies the field on which to sort.
     * By default, `TIMECREATED` is ordered descending.
     * By default, `DISPLAYNAME` is ordered ascending. Note that you can sort only on one field.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * Display name on which to query.
     */
    private String displayName;

    /**
     * The lifecycle state on which to filter.
     */
    private SourceLifecycleStates lifecycleState;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSourcesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListSourcesRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            id(o.getId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSourcesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSourcesRequest
         */
        public ListSourcesRequest build() {
            ListSourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
