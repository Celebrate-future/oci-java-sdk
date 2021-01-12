/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateSteeringPolicyAttachmentResponse {

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    /**
     * The full URI of the resource related to the request.
     *
     */
    private String location;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned SteeringPolicyAttachment instance.
     */
    private SteeringPolicyAttachment steeringPolicyAttachment;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateSteeringPolicyAttachmentResponse o) {
            eTag(o.getETag());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            steeringPolicyAttachment(o.getSteeringPolicyAttachment());

            return this;
        }
    }
}
