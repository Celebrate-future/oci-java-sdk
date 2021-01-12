/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListObjectVersionsResponse {

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Paginating a list of object versions.
     * In the GET request, set the limit to the number of object versions that you want returned in the response.
     * If the opc-next-page header appears in the response, then this is a partial list and there are
     * additional object versions to get. Include the header's value as the `page` parameter in the subsequent
     * GET request to get the next batch of object versions and prefixes . Repeat this process to retrieve the entire list of
     * object versions and prefixes.
     *
     */
    private String opcNextPage;

    /**
     * The returned ObjectVersionCollection instance.
     */
    private ObjectVersionCollection objectVersionCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListObjectVersionsResponse o) {
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            objectVersionCollection(o.getObjectVersionCollection());

            return this;
        }
    }
}
