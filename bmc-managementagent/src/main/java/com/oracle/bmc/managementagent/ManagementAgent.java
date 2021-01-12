/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent;

import com.oracle.bmc.managementagent.requests.*;
import com.oracle.bmc.managementagent.responses.*;

/**
 * API for Management Agent Cloud Service
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public interface ManagementAgent extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * User creates a new install key as part of this API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/CreateManagementAgentInstallKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateManagementAgentInstallKey API.
     */
    CreateManagementAgentInstallKeyResponse createManagementAgentInstallKey(
            CreateManagementAgentInstallKeyRequest request);

    /**
     * Deletes a Management Agent resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/DeleteManagementAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteManagementAgent API.
     */
    DeleteManagementAgentResponse deleteManagementAgent(DeleteManagementAgentRequest request);

    /**
     * Deletes a Management Agent install Key resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/DeleteManagementAgentInstallKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteManagementAgentInstallKey API.
     */
    DeleteManagementAgentInstallKeyResponse deleteManagementAgentInstallKey(
            DeleteManagementAgentInstallKeyRequest request);

    /**
     * Cancel the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/DeleteWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteWorkRequest API.
     */
    DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request);

    /**
     * Deploys Plugins to a given list of agentIds.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/DeployPluginsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeployPlugins API.
     */
    DeployPluginsResponse deployPlugins(DeployPluginsRequest request);

    /**
     * Gets complete details of the inventory of a given agent id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/GetManagementAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagementAgent API.
     */
    GetManagementAgentResponse getManagementAgent(GetManagementAgentRequest request);

    /**
     * Gets complete details of the Agent install Key for a given key id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/GetManagementAgentInstallKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagementAgentInstallKey API.
     */
    GetManagementAgentInstallKeyResponse getManagementAgentInstallKey(
            GetManagementAgentInstallKeyRequest request);

    /**
     * Returns a file with Management Agent install Key in it
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/GetManagementAgentInstallKeyContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagementAgentInstallKeyContent API.
     */
    GetManagementAgentInstallKeyContentResponse getManagementAgentInstallKeyContent(
            GetManagementAgentInstallKeyContentRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists the availability history records of Management Agent
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListAvailabilityHistoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAvailabilityHistories API.
     */
    ListAvailabilityHistoriesResponse listAvailabilityHistories(
            ListAvailabilityHistoriesRequest request);

    /**
     * Get supported agent image information
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListManagementAgentImagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagementAgentImages API.
     */
    ListManagementAgentImagesResponse listManagementAgentImages(
            ListManagementAgentImagesRequest request);

    /**
     * Returns a list of Management Agent installed Keys.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListManagementAgentInstallKeysExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagementAgentInstallKeys API.
     */
    ListManagementAgentInstallKeysResponse listManagementAgentInstallKeys(
            ListManagementAgentInstallKeysRequest request);

    /**
     * Returns a list of managementAgentPlugins.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListManagementAgentPluginsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagementAgentPlugins API.
     */
    ListManagementAgentPluginsResponse listManagementAgentPlugins(
            ListManagementAgentPluginsRequest request);

    /**
     * Returns a list of Management Agent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListManagementAgentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagementAgents API.
     */
    ListManagementAgentsResponse listManagementAgents(ListManagementAgentsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * API to update the console managed properties of the Management Agent.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/UpdateManagementAgentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagementAgent API.
     */
    UpdateManagementAgentResponse updateManagementAgent(UpdateManagementAgentRequest request);

    /**
     * API to update the modifiable properties of the Management Agent install key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/UpdateManagementAgentInstallKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagementAgentInstallKey API.
     */
    UpdateManagementAgentInstallKeyResponse updateManagementAgentInstallKey(
            UpdateManagementAgentInstallKeyRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ManagementAgentWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ManagementAgentPaginators getPaginators();
}
