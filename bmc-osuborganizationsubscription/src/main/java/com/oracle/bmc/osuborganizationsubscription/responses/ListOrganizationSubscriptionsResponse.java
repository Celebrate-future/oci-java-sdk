/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osuborganizationsubscription.responses;

import com.oracle.bmc.osuborganizationsubscription.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListOrganizationSubscriptionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A list of com.oracle.bmc.osuborganizationsubscription.model.SubscriptionSummary instances.
     */
    private java.util.List<com.oracle.bmc.osuborganizationsubscription.model.SubscriptionSummary>
            items;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcRequestId",
        "items"
    })
    private ListOrganizationSubscriptionsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            java.util.List<com.oracle.bmc.osuborganizationsubscription.model.SubscriptionSummary>
                    items) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.items = items;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListOrganizationSubscriptionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        public ListOrganizationSubscriptionsResponse build() {
            return new ListOrganizationSubscriptionsResponse(
                    __httpStatusCode__, opcNextPage, opcRequestId, items);
        }
    }
}