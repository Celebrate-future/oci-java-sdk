/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging;

import com.oracle.bmc.logging.requests.*;
import com.oracle.bmc.logging.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of LoggingManagement where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@lombok.RequiredArgsConstructor
public class LoggingManagementPaginators {
    private final LoggingManagement client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listLogGroups operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogGroupsResponse> listLogGroupsResponseIterator(
            final ListLogGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogGroupsRequest.Builder, ListLogGroupsRequest, ListLogGroupsResponse>(
                new com.google.common.base.Supplier<ListLogGroupsRequest.Builder>() {
                    @Override
                    public ListLogGroupsRequest.Builder get() {
                        return ListLogGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogGroupsResponse, String>() {
                    @Override
                    public String apply(ListLogGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogGroupsRequest.Builder>,
                        ListLogGroupsRequest>() {
                    @Override
                    public ListLogGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogGroupsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListLogGroupsRequest, ListLogGroupsResponse>() {
                    @Override
                    public ListLogGroupsResponse apply(ListLogGroupsRequest request) {
                        return client.listLogGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.LogGroupSummary} objects
     * contained in responses from the listLogGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.LogGroupSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.LogGroupSummary> listLogGroupsRecordIterator(
            final ListLogGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogGroupsRequest.Builder, ListLogGroupsRequest, ListLogGroupsResponse,
                com.oracle.bmc.logging.model.LogGroupSummary>(
                new com.google.common.base.Supplier<ListLogGroupsRequest.Builder>() {
                    @Override
                    public ListLogGroupsRequest.Builder get() {
                        return ListLogGroupsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogGroupsResponse, String>() {
                    @Override
                    public String apply(ListLogGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogGroupsRequest.Builder>,
                        ListLogGroupsRequest>() {
                    @Override
                    public ListLogGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogGroupsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListLogGroupsRequest, ListLogGroupsResponse>() {
                    @Override
                    public ListLogGroupsResponse apply(ListLogGroupsRequest request) {
                        return client.listLogGroups(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLogGroupsResponse,
                        java.util.List<com.oracle.bmc.logging.model.LogGroupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.logging.model.LogGroupSummary> apply(
                            ListLogGroupsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLogIncludedSearches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogIncludedSearchesResponse> listLogIncludedSearchesResponseIterator(
            final ListLogIncludedSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogIncludedSearchesRequest.Builder, ListLogIncludedSearchesRequest,
                ListLogIncludedSearchesResponse>(
                new com.google.common.base.Supplier<ListLogIncludedSearchesRequest.Builder>() {
                    @Override
                    public ListLogIncludedSearchesRequest.Builder get() {
                        return ListLogIncludedSearchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogIncludedSearchesResponse, String>() {
                    @Override
                    public String apply(ListLogIncludedSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogIncludedSearchesRequest.Builder>,
                        ListLogIncludedSearchesRequest>() {
                    @Override
                    public ListLogIncludedSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogIncludedSearchesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListLogIncludedSearchesRequest, ListLogIncludedSearchesResponse>() {
                    @Override
                    public ListLogIncludedSearchesResponse apply(
                            ListLogIncludedSearchesRequest request) {
                        return client.listLogIncludedSearches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.LogIncludedSearchSummary} objects
     * contained in responses from the listLogIncludedSearches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.LogIncludedSearchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.LogIncludedSearchSummary>
            listLogIncludedSearchesRecordIterator(final ListLogIncludedSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogIncludedSearchesRequest.Builder, ListLogIncludedSearchesRequest,
                ListLogIncludedSearchesResponse,
                com.oracle.bmc.logging.model.LogIncludedSearchSummary>(
                new com.google.common.base.Supplier<ListLogIncludedSearchesRequest.Builder>() {
                    @Override
                    public ListLogIncludedSearchesRequest.Builder get() {
                        return ListLogIncludedSearchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogIncludedSearchesResponse, String>() {
                    @Override
                    public String apply(ListLogIncludedSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogIncludedSearchesRequest.Builder>,
                        ListLogIncludedSearchesRequest>() {
                    @Override
                    public ListLogIncludedSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogIncludedSearchesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListLogIncludedSearchesRequest, ListLogIncludedSearchesResponse>() {
                    @Override
                    public ListLogIncludedSearchesResponse apply(
                            ListLogIncludedSearchesRequest request) {
                        return client.listLogIncludedSearches(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLogIncludedSearchesResponse,
                        java.util.List<com.oracle.bmc.logging.model.LogIncludedSearchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.logging.model.LogIncludedSearchSummary>
                            apply(ListLogIncludedSearchesResponse response) {
                        return response.getLogIncludedSearchSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLogSavedSearches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogSavedSearchesResponse> listLogSavedSearchesResponseIterator(
            final ListLogSavedSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogSavedSearchesRequest.Builder, ListLogSavedSearchesRequest,
                ListLogSavedSearchesResponse>(
                new com.google.common.base.Supplier<ListLogSavedSearchesRequest.Builder>() {
                    @Override
                    public ListLogSavedSearchesRequest.Builder get() {
                        return ListLogSavedSearchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogSavedSearchesResponse, String>() {
                    @Override
                    public String apply(ListLogSavedSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogSavedSearchesRequest.Builder>,
                        ListLogSavedSearchesRequest>() {
                    @Override
                    public ListLogSavedSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogSavedSearchesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListLogSavedSearchesRequest, ListLogSavedSearchesResponse>() {
                    @Override
                    public ListLogSavedSearchesResponse apply(ListLogSavedSearchesRequest request) {
                        return client.listLogSavedSearches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.LogSavedSearchSummary} objects
     * contained in responses from the listLogSavedSearches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.LogSavedSearchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.LogSavedSearchSummary>
            listLogSavedSearchesRecordIterator(final ListLogSavedSearchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogSavedSearchesRequest.Builder, ListLogSavedSearchesRequest,
                ListLogSavedSearchesResponse, com.oracle.bmc.logging.model.LogSavedSearchSummary>(
                new com.google.common.base.Supplier<ListLogSavedSearchesRequest.Builder>() {
                    @Override
                    public ListLogSavedSearchesRequest.Builder get() {
                        return ListLogSavedSearchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogSavedSearchesResponse, String>() {
                    @Override
                    public String apply(ListLogSavedSearchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogSavedSearchesRequest.Builder>,
                        ListLogSavedSearchesRequest>() {
                    @Override
                    public ListLogSavedSearchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogSavedSearchesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListLogSavedSearchesRequest, ListLogSavedSearchesResponse>() {
                    @Override
                    public ListLogSavedSearchesResponse apply(ListLogSavedSearchesRequest request) {
                        return client.listLogSavedSearches(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLogSavedSearchesResponse,
                        java.util.List<com.oracle.bmc.logging.model.LogSavedSearchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.logging.model.LogSavedSearchSummary> apply(
                            ListLogSavedSearchesResponse response) {
                        return response.getLogSavedSearchSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLogsResponse> listLogsResponseIterator(final ListLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLogsRequest.Builder, ListLogsRequest, ListLogsResponse>(
                new com.google.common.base.Supplier<ListLogsRequest.Builder>() {
                    @Override
                    public ListLogsRequest.Builder get() {
                        return ListLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogsResponse, String>() {
                    @Override
                    public String apply(ListLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogsRequest.Builder>,
                        ListLogsRequest>() {
                    @Override
                    public ListLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListLogsRequest, ListLogsResponse>() {
                    @Override
                    public ListLogsResponse apply(ListLogsRequest request) {
                        return client.listLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.LogSummary} objects
     * contained in responses from the listLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.LogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.LogSummary> listLogsRecordIterator(
            final ListLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLogsRequest.Builder, ListLogsRequest, ListLogsResponse,
                com.oracle.bmc.logging.model.LogSummary>(
                new com.google.common.base.Supplier<ListLogsRequest.Builder>() {
                    @Override
                    public ListLogsRequest.Builder get() {
                        return ListLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLogsResponse, String>() {
                    @Override
                    public String apply(ListLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLogsRequest.Builder>,
                        ListLogsRequest>() {
                    @Override
                    public ListLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<ListLogsRequest, ListLogsResponse>() {
                    @Override
                    public ListLogsResponse apply(ListLogsRequest request) {
                        return client.listLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLogsResponse,
                        java.util.List<com.oracle.bmc.logging.model.LogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.logging.model.LogSummary> apply(
                            ListLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUnifiedAgentConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUnifiedAgentConfigurationsResponse>
            listUnifiedAgentConfigurationsResponseIterator(
                    final ListUnifiedAgentConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUnifiedAgentConfigurationsRequest.Builder,
                ListUnifiedAgentConfigurationsRequest, ListUnifiedAgentConfigurationsResponse>(
                new com.google.common.base.Supplier<
                        ListUnifiedAgentConfigurationsRequest.Builder>() {
                    @Override
                    public ListUnifiedAgentConfigurationsRequest.Builder get() {
                        return ListUnifiedAgentConfigurationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUnifiedAgentConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListUnifiedAgentConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUnifiedAgentConfigurationsRequest.Builder>,
                        ListUnifiedAgentConfigurationsRequest>() {
                    @Override
                    public ListUnifiedAgentConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUnifiedAgentConfigurationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListUnifiedAgentConfigurationsRequest,
                        ListUnifiedAgentConfigurationsResponse>() {
                    @Override
                    public ListUnifiedAgentConfigurationsResponse apply(
                            ListUnifiedAgentConfigurationsRequest request) {
                        return client.listUnifiedAgentConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.UnifiedAgentConfigurationSummary} objects
     * contained in responses from the listUnifiedAgentConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.UnifiedAgentConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.UnifiedAgentConfigurationSummary>
            listUnifiedAgentConfigurationsRecordIterator(
                    final ListUnifiedAgentConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUnifiedAgentConfigurationsRequest.Builder,
                ListUnifiedAgentConfigurationsRequest, ListUnifiedAgentConfigurationsResponse,
                com.oracle.bmc.logging.model.UnifiedAgentConfigurationSummary>(
                new com.google.common.base.Supplier<
                        ListUnifiedAgentConfigurationsRequest.Builder>() {
                    @Override
                    public ListUnifiedAgentConfigurationsRequest.Builder get() {
                        return ListUnifiedAgentConfigurationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUnifiedAgentConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListUnifiedAgentConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUnifiedAgentConfigurationsRequest.Builder>,
                        ListUnifiedAgentConfigurationsRequest>() {
                    @Override
                    public ListUnifiedAgentConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUnifiedAgentConfigurationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListUnifiedAgentConfigurationsRequest,
                        ListUnifiedAgentConfigurationsResponse>() {
                    @Override
                    public ListUnifiedAgentConfigurationsResponse apply(
                            ListUnifiedAgentConfigurationsRequest request) {
                        return client.listUnifiedAgentConfigurations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListUnifiedAgentConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.logging.model.UnifiedAgentConfigurationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.logging.model.UnifiedAgentConfigurationSummary>
                            apply(ListUnifiedAgentConfigurationsResponse response) {
                        return response.getUnifiedAgentConfigurationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.logging.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.logging.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.logging.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.WorkRequestLog} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.WorkRequestLog} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.WorkRequestLog> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.logging.model.WorkRequestLog>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.logging.model.WorkRequestLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.logging.model.WorkRequestLog> apply(
                            ListWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.logging.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.logging.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.logging.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.logging.model.WorkRequestSummary>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.logging.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.logging.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
