/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CleanExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CleanRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class CleanRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * Unique scheduledTask id returned from task create.
     * If invalid will lead to a 404 not found.
     *
     */
    private String scheduledTaskId;

    /**
     * Optional parameter to specify start of time range, in the format defined by RFC3339.
     * Default value is beginning of time.
     *
     */
    private java.util.Date timeStart;

    /**
     * Optional parameter to specify end of time range, in the format defined by RFC3339.
     * Default value is end of time.
     *
     */
    private java.util.Date timeEnd;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<CleanRequest, java.lang.Void> {
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
        public Builder copy(CleanRequest o) {
            namespaceName(o.getNamespaceName());
            scheduledTaskId(o.getScheduledTaskId());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CleanRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CleanRequest
         */
        public CleanRequest build() {
            CleanRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
