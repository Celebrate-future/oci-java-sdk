/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/DeleteAcceptedAgreementExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteAcceptedAgreementRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class DeleteAcceptedAgreementRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The unique identifier for the accepted terms of use agreement.
     */
    private String acceptedAgreementId;

    /**
     * Previously, the signature generated for the listing package terms of use agreement, but now deprecated and ignored.
     */
    private String signature;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match` parameter to
     * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteAcceptedAgreementRequest, java.lang.Void> {
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
        public Builder copy(DeleteAcceptedAgreementRequest o) {
            acceptedAgreementId(o.getAcceptedAgreementId());
            signature(o.getSignature());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteAcceptedAgreementRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeleteAcceptedAgreementRequest
         */
        public DeleteAcceptedAgreementRequest build() {
            DeleteAcceptedAgreementRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
