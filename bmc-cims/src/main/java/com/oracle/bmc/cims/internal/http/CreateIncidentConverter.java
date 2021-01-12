/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.cims.model.*;
import com.oracle.bmc.cims.requests.*;
import com.oracle.bmc.cims.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.extern.slf4j.Slf4j
public class CreateIncidentConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.cims.requests.CreateIncidentRequest interceptRequest(
            com.oracle.bmc.cims.requests.CreateIncidentRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.cims.requests.CreateIncidentRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCreateIncidentDetails(), "createIncidentDetails is required");
        Validate.notNull(request.getOcid(), "ocid is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget().path("/20181231").path("v2").path("incidents");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        ib.header("ocid", request.getOcid());

        if (request.getHomeregion() != null) {
            ib.header("homeregion", request.getHomeregion());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response, com.oracle.bmc.cims.responses.CreateIncidentResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.cims.responses.CreateIncidentResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.cims.responses.CreateIncidentResponse>() {
                            @Override
                            public com.oracle.bmc.cims.responses.CreateIncidentResponse apply(
                                    javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.cims.responses.CreateIncidentResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<Incident>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(Incident.class);

                                com.oracle.bmc.http.internal.WithHeaders<Incident> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.cims.responses.CreateIncidentResponse.Builder
                                        builder =
                                                com.oracle.bmc.cims.responses.CreateIncidentResponse
                                                        .builder();

                                builder.incident(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.cims.responses.CreateIncidentResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
