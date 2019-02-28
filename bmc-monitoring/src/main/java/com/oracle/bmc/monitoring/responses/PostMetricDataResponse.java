/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.responses;

import com.oracle.bmc.monitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class PostMetricDataResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned PostMetricDataResponseDetails instance.
     */
    private PostMetricDataResponseDetails postMetricDataResponseDetails;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PostMetricDataResponse o) {
            opcRequestId(o.getOpcRequestId());
            postMetricDataResponseDetails(o.getPostMetricDataResponseDetails());

            return this;
        }
    }
}
