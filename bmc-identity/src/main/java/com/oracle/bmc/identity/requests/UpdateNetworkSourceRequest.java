/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateNetworkSourceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateNetworkSourceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UpdateNetworkSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<UpdateNetworkSourceDetails> {

    /**
     * The OCID of the network source.
     */
    private String networkSourceId;

    /**
     * Request object for updating a network source.
     */
    private UpdateNetworkSourceDetails updateNetworkSourceDetails;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match`
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public UpdateNetworkSourceDetails getBody$() {
        return updateNetworkSourceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNetworkSourceRequest, UpdateNetworkSourceDetails> {
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
        public Builder copy(UpdateNetworkSourceRequest o) {
            networkSourceId(o.getNetworkSourceId());
            updateNetworkSourceDetails(o.getUpdateNetworkSourceDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNetworkSourceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateNetworkSourceRequest
         */
        public UpdateNetworkSourceRequest build() {
            UpdateNetworkSourceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(UpdateNetworkSourceDetails body) {
            updateNetworkSourceDetails(body);
            return this;
        }
    }
}
