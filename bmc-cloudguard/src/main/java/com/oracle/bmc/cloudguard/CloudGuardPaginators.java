/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard;

import com.oracle.bmc.cloudguard.requests.*;
import com.oracle.bmc.cloudguard.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of CloudGuard where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.RequiredArgsConstructor
public class CloudGuardPaginators {
    private final CloudGuard client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listConditionMetadataTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConditionMetadataTypesResponse> listConditionMetadataTypesResponseIterator(
            final ListConditionMetadataTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConditionMetadataTypesRequest.Builder, ListConditionMetadataTypesRequest,
                ListConditionMetadataTypesResponse>(
                new com.google.common.base.Supplier<ListConditionMetadataTypesRequest.Builder>() {
                    @Override
                    public ListConditionMetadataTypesRequest.Builder get() {
                        return ListConditionMetadataTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConditionMetadataTypesResponse, String>() {
                    @Override
                    public String apply(ListConditionMetadataTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConditionMetadataTypesRequest.Builder>,
                        ListConditionMetadataTypesRequest>() {
                    @Override
                    public ListConditionMetadataTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConditionMetadataTypesRequest.Builder>
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
                        ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>() {
                    @Override
                    public ListConditionMetadataTypesResponse apply(
                            ListConditionMetadataTypesRequest request) {
                        return client.listConditionMetadataTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary} objects
     * contained in responses from the listConditionMetadataTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>
            listConditionMetadataTypesRecordIterator(
                    final ListConditionMetadataTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConditionMetadataTypesRequest.Builder, ListConditionMetadataTypesRequest,
                ListConditionMetadataTypesResponse,
                com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>(
                new com.google.common.base.Supplier<ListConditionMetadataTypesRequest.Builder>() {
                    @Override
                    public ListConditionMetadataTypesRequest.Builder get() {
                        return ListConditionMetadataTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConditionMetadataTypesResponse, String>() {
                    @Override
                    public String apply(ListConditionMetadataTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConditionMetadataTypesRequest.Builder>,
                        ListConditionMetadataTypesRequest>() {
                    @Override
                    public ListConditionMetadataTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConditionMetadataTypesRequest.Builder>
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
                        ListConditionMetadataTypesRequest, ListConditionMetadataTypesResponse>() {
                    @Override
                    public ListConditionMetadataTypesResponse apply(
                            ListConditionMetadataTypesRequest request) {
                        return client.listConditionMetadataTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListConditionMetadataTypesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.ConditionMetadataTypeSummary>
                            apply(ListConditionMetadataTypesResponse response) {
                        return response.getConditionMetadataTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectorRecipeDetectorRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorRecipeDetectorRulesResponse>
            listDetectorRecipeDetectorRulesResponseIterator(
                    final ListDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorRecipeDetectorRulesRequest.Builder,
                ListDetectorRecipeDetectorRulesRequest, ListDetectorRecipeDetectorRulesResponse>(
                new com.google.common.base.Supplier<
                        ListDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipeDetectorRulesRequest.Builder>,
                        ListDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListDetectorRecipeDetectorRulesRequest,
                        ListDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesResponse apply(
                            ListDetectorRecipeDetectorRulesRequest request) {
                        return client.listDetectorRecipeDetectorRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary} objects
     * contained in responses from the listDetectorRecipeDetectorRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary>
            listDetectorRecipeDetectorRulesRecordIterator(
                    final ListDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorRecipeDetectorRulesRequest.Builder,
                ListDetectorRecipeDetectorRulesRequest, ListDetectorRecipeDetectorRulesResponse,
                com.oracle.bmc.cloudguard.model.DetectorRecipeDetectorRuleSummary>(
                new com.google.common.base.Supplier<
                        ListDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipeDetectorRulesRequest.Builder>,
                        ListDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListDetectorRecipeDetectorRulesRequest,
                        ListDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRecipeDetectorRulesResponse apply(
                            ListDetectorRecipeDetectorRulesRequest request) {
                        return client.listDetectorRecipeDetectorRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDetectorRecipeDetectorRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .DetectorRecipeDetectorRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .DetectorRecipeDetectorRuleSummary>
                            apply(ListDetectorRecipeDetectorRulesResponse response) {
                        return response.getDetectorRecipeDetectorRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectorRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorRecipesResponse> listDetectorRecipesResponseIterator(
            final ListDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorRecipesRequest.Builder, ListDetectorRecipesRequest,
                ListDetectorRecipesResponse>(
                new com.google.common.base.Supplier<ListDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipesRequest.Builder get() {
                        return ListDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipesRequest.Builder>,
                        ListDetectorRecipesRequest>() {
                    @Override
                    public ListDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipesRequest.Builder>
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
                        ListDetectorRecipesRequest, ListDetectorRecipesResponse>() {
                    @Override
                    public ListDetectorRecipesResponse apply(ListDetectorRecipesRequest request) {
                        return client.listDetectorRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeSummary} objects
     * contained in responses from the listDetectorRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>
            listDetectorRecipesRecordIterator(final ListDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorRecipesRequest.Builder, ListDetectorRecipesRequest,
                ListDetectorRecipesResponse, com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>(
                new com.google.common.base.Supplier<ListDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListDetectorRecipesRequest.Builder get() {
                        return ListDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRecipesRequest.Builder>,
                        ListDetectorRecipesRequest>() {
                    @Override
                    public ListDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRecipesRequest.Builder>
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
                        ListDetectorRecipesRequest, ListDetectorRecipesResponse>() {
                    @Override
                    public ListDetectorRecipesResponse apply(ListDetectorRecipesRequest request) {
                        return client.listDetectorRecipes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDetectorRecipesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DetectorRecipeSummary>
                            apply(ListDetectorRecipesResponse response) {
                        return response.getDetectorRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectorRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorRulesResponse> listDetectorRulesResponseIterator(
            final ListDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorRulesRequest.Builder, ListDetectorRulesRequest,
                ListDetectorRulesResponse>(
                new com.google.common.base.Supplier<ListDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRulesRequest.Builder get() {
                        return ListDetectorRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRulesRequest.Builder>,
                        ListDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRulesRequest.Builder>
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
                        ListDetectorRulesRequest, ListDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRulesResponse apply(ListDetectorRulesRequest request) {
                        return client.listDetectorRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRuleSummary} objects
     * contained in responses from the listDetectorRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorRuleSummary>
            listDetectorRulesRecordIterator(final ListDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorRulesRequest.Builder, ListDetectorRulesRequest,
                ListDetectorRulesResponse, com.oracle.bmc.cloudguard.model.DetectorRuleSummary>(
                new com.google.common.base.Supplier<ListDetectorRulesRequest.Builder>() {
                    @Override
                    public ListDetectorRulesRequest.Builder get() {
                        return ListDetectorRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorRulesRequest.Builder>,
                        ListDetectorRulesRequest>() {
                    @Override
                    public ListDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorRulesRequest.Builder>
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
                        ListDetectorRulesRequest, ListDetectorRulesResponse>() {
                    @Override
                    public ListDetectorRulesResponse apply(ListDetectorRulesRequest request) {
                        return client.listDetectorRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDetectorRulesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DetectorRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DetectorRuleSummary>
                            apply(ListDetectorRulesResponse response) {
                        return response.getDetectorRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDetectors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDetectorsResponse> listDetectorsResponseIterator(
            final ListDetectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDetectorsRequest.Builder, ListDetectorsRequest, ListDetectorsResponse>(
                new com.google.common.base.Supplier<ListDetectorsRequest.Builder>() {
                    @Override
                    public ListDetectorsRequest.Builder get() {
                        return ListDetectorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDetectorsResponse, String>() {
                    @Override
                    public String apply(ListDetectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorsRequest.Builder>,
                        ListDetectorsRequest>() {
                    @Override
                    public ListDetectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorsRequest.Builder>
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
                new com.google.common.base.Function<ListDetectorsRequest, ListDetectorsResponse>() {
                    @Override
                    public ListDetectorsResponse apply(ListDetectorsRequest request) {
                        return client.listDetectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorSummary} objects
     * contained in responses from the listDetectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.DetectorSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.DetectorSummary> listDetectorsRecordIterator(
            final ListDetectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDetectorsRequest.Builder, ListDetectorsRequest, ListDetectorsResponse,
                com.oracle.bmc.cloudguard.model.DetectorSummary>(
                new com.google.common.base.Supplier<ListDetectorsRequest.Builder>() {
                    @Override
                    public ListDetectorsRequest.Builder get() {
                        return ListDetectorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDetectorsResponse, String>() {
                    @Override
                    public String apply(ListDetectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDetectorsRequest.Builder>,
                        ListDetectorsRequest>() {
                    @Override
                    public ListDetectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDetectorsRequest.Builder>
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
                new com.google.common.base.Function<ListDetectorsRequest, ListDetectorsResponse>() {
                    @Override
                    public ListDetectorsResponse apply(ListDetectorsRequest request) {
                        return client.listDetectors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDetectorsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.DetectorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.DetectorSummary> apply(
                            ListDetectorsResponse response) {
                        return response.getDetectorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImpactedResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImpactedResourcesResponse> listImpactedResourcesResponseIterator(
            final ListImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImpactedResourcesRequest.Builder, ListImpactedResourcesRequest,
                ListImpactedResourcesResponse>(
                new com.google.common.base.Supplier<ListImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListImpactedResourcesRequest.Builder get() {
                        return ListImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImpactedResourcesRequest.Builder>,
                        ListImpactedResourcesRequest>() {
                    @Override
                    public ListImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImpactedResourcesRequest.Builder>
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
                        ListImpactedResourcesRequest, ListImpactedResourcesResponse>() {
                    @Override
                    public ListImpactedResourcesResponse apply(
                            ListImpactedResourcesRequest request) {
                        return client.listImpactedResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ImpactedResourceSummary} objects
     * contained in responses from the listImpactedResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ImpactedResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>
            listImpactedResourcesRecordIterator(final ListImpactedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImpactedResourcesRequest.Builder, ListImpactedResourcesRequest,
                ListImpactedResourcesResponse,
                com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>(
                new com.google.common.base.Supplier<ListImpactedResourcesRequest.Builder>() {
                    @Override
                    public ListImpactedResourcesRequest.Builder get() {
                        return ListImpactedResourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListImpactedResourcesResponse, String>() {
                    @Override
                    public String apply(ListImpactedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImpactedResourcesRequest.Builder>,
                        ListImpactedResourcesRequest>() {
                    @Override
                    public ListImpactedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImpactedResourcesRequest.Builder>
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
                        ListImpactedResourcesRequest, ListImpactedResourcesResponse>() {
                    @Override
                    public ListImpactedResourcesResponse apply(
                            ListImpactedResourcesRequest request) {
                        return client.listImpactedResources(request);
                    }
                },
                new com.google.common.base.Function<
                        ListImpactedResourcesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ImpactedResourceSummary>
                            apply(ListImpactedResourcesResponse response) {
                        return response.getImpactedResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedListTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedListTypesResponse> listManagedListTypesResponseIterator(
            final ListManagedListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedListTypesRequest.Builder, ListManagedListTypesRequest,
                ListManagedListTypesResponse>(
                new com.google.common.base.Supplier<ListManagedListTypesRequest.Builder>() {
                    @Override
                    public ListManagedListTypesRequest.Builder get() {
                        return ListManagedListTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedListTypesResponse, String>() {
                    @Override
                    public String apply(ListManagedListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListTypesRequest.Builder>,
                        ListManagedListTypesRequest>() {
                    @Override
                    public ListManagedListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListTypesRequest.Builder>
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
                        ListManagedListTypesRequest, ListManagedListTypesResponse>() {
                    @Override
                    public ListManagedListTypesResponse apply(ListManagedListTypesRequest request) {
                        return client.listManagedListTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListTypeSummary} objects
     * contained in responses from the listManagedListTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>
            listManagedListTypesRecordIterator(final ListManagedListTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedListTypesRequest.Builder, ListManagedListTypesRequest,
                ListManagedListTypesResponse,
                com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>(
                new com.google.common.base.Supplier<ListManagedListTypesRequest.Builder>() {
                    @Override
                    public ListManagedListTypesRequest.Builder get() {
                        return ListManagedListTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedListTypesResponse, String>() {
                    @Override
                    public String apply(ListManagedListTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListTypesRequest.Builder>,
                        ListManagedListTypesRequest>() {
                    @Override
                    public ListManagedListTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListTypesRequest.Builder>
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
                        ListManagedListTypesRequest, ListManagedListTypesResponse>() {
                    @Override
                    public ListManagedListTypesResponse apply(ListManagedListTypesRequest request) {
                        return client.listManagedListTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagedListTypesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ManagedListTypeSummary>
                            apply(ListManagedListTypesResponse response) {
                        return response.getManagedListTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listManagedLists operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListManagedListsResponse> listManagedListsResponseIterator(
            final ListManagedListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedListsRequest.Builder, ListManagedListsRequest, ListManagedListsResponse>(
                new com.google.common.base.Supplier<ListManagedListsRequest.Builder>() {
                    @Override
                    public ListManagedListsRequest.Builder get() {
                        return ListManagedListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedListsResponse, String>() {
                    @Override
                    public String apply(ListManagedListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListsRequest.Builder>,
                        ListManagedListsRequest>() {
                    @Override
                    public ListManagedListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListsRequest.Builder>
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
                        ListManagedListsRequest, ListManagedListsResponse>() {
                    @Override
                    public ListManagedListsResponse apply(ListManagedListsRequest request) {
                        return client.listManagedLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListSummary} objects
     * contained in responses from the listManagedLists operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ManagedListSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ManagedListSummary>
            listManagedListsRecordIterator(final ListManagedListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedListsRequest.Builder, ListManagedListsRequest, ListManagedListsResponse,
                com.oracle.bmc.cloudguard.model.ManagedListSummary>(
                new com.google.common.base.Supplier<ListManagedListsRequest.Builder>() {
                    @Override
                    public ListManagedListsRequest.Builder get() {
                        return ListManagedListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListManagedListsResponse, String>() {
                    @Override
                    public String apply(ListManagedListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedListsRequest.Builder>,
                        ListManagedListsRequest>() {
                    @Override
                    public ListManagedListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedListsRequest.Builder>
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
                        ListManagedListsRequest, ListManagedListsResponse>() {
                    @Override
                    public ListManagedListsResponse apply(ListManagedListsRequest request) {
                        return client.listManagedLists(request);
                    }
                },
                new com.google.common.base.Function<
                        ListManagedListsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ManagedListSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ManagedListSummary> apply(
                            ListManagedListsResponse response) {
                        return response.getManagedListCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProblemHistories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProblemHistoriesResponse> listProblemHistoriesResponseIterator(
            final ListProblemHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProblemHistoriesRequest.Builder, ListProblemHistoriesRequest,
                ListProblemHistoriesResponse>(
                new com.google.common.base.Supplier<ListProblemHistoriesRequest.Builder>() {
                    @Override
                    public ListProblemHistoriesRequest.Builder get() {
                        return ListProblemHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProblemHistoriesResponse, String>() {
                    @Override
                    public String apply(ListProblemHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemHistoriesRequest.Builder>,
                        ListProblemHistoriesRequest>() {
                    @Override
                    public ListProblemHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemHistoriesRequest.Builder>
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
                        ListProblemHistoriesRequest, ListProblemHistoriesResponse>() {
                    @Override
                    public ListProblemHistoriesResponse apply(ListProblemHistoriesRequest request) {
                        return client.listProblemHistories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemHistorySummary} objects
     * contained in responses from the listProblemHistories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemHistorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ProblemHistorySummary>
            listProblemHistoriesRecordIterator(final ListProblemHistoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProblemHistoriesRequest.Builder, ListProblemHistoriesRequest,
                ListProblemHistoriesResponse,
                com.oracle.bmc.cloudguard.model.ProblemHistorySummary>(
                new com.google.common.base.Supplier<ListProblemHistoriesRequest.Builder>() {
                    @Override
                    public ListProblemHistoriesRequest.Builder get() {
                        return ListProblemHistoriesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProblemHistoriesResponse, String>() {
                    @Override
                    public String apply(ListProblemHistoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemHistoriesRequest.Builder>,
                        ListProblemHistoriesRequest>() {
                    @Override
                    public ListProblemHistoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemHistoriesRequest.Builder>
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
                        ListProblemHistoriesRequest, ListProblemHistoriesResponse>() {
                    @Override
                    public ListProblemHistoriesResponse apply(ListProblemHistoriesRequest request) {
                        return client.listProblemHistories(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProblemHistoriesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ProblemHistorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ProblemHistorySummary>
                            apply(ListProblemHistoriesResponse response) {
                        return response.getProblemHistoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProblems operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProblemsResponse> listProblemsResponseIterator(
            final ListProblemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProblemsRequest.Builder, ListProblemsRequest, ListProblemsResponse>(
                new com.google.common.base.Supplier<ListProblemsRequest.Builder>() {
                    @Override
                    public ListProblemsRequest.Builder get() {
                        return ListProblemsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProblemsResponse, String>() {
                    @Override
                    public String apply(ListProblemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemsRequest.Builder>,
                        ListProblemsRequest>() {
                    @Override
                    public ListProblemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemsRequest.Builder>
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
                new com.google.common.base.Function<ListProblemsRequest, ListProblemsResponse>() {
                    @Override
                    public ListProblemsResponse apply(ListProblemsRequest request) {
                        return client.listProblems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemSummary} objects
     * contained in responses from the listProblems operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ProblemSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ProblemSummary> listProblemsRecordIterator(
            final ListProblemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProblemsRequest.Builder, ListProblemsRequest, ListProblemsResponse,
                com.oracle.bmc.cloudguard.model.ProblemSummary>(
                new com.google.common.base.Supplier<ListProblemsRequest.Builder>() {
                    @Override
                    public ListProblemsRequest.Builder get() {
                        return ListProblemsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProblemsResponse, String>() {
                    @Override
                    public String apply(ListProblemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProblemsRequest.Builder>,
                        ListProblemsRequest>() {
                    @Override
                    public ListProblemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProblemsRequest.Builder>
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
                new com.google.common.base.Function<ListProblemsRequest, ListProblemsResponse>() {
                    @Override
                    public ListProblemsResponse apply(ListProblemsRequest request) {
                        return client.listProblems(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProblemsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ProblemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ProblemSummary> apply(
                            ListProblemsResponse response) {
                        return response.getProblemCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRecommendations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRecommendationsResponse> listRecommendationsResponseIterator(
            final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecommendationsRequest.Builder, ListRecommendationsRequest,
                ListRecommendationsResponse>(
                new com.google.common.base.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.RecommendationSummary} objects
     * contained in responses from the listRecommendations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.RecommendationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.RecommendationSummary>
            listRecommendationsRecordIterator(final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecommendationsRequest.Builder, ListRecommendationsRequest,
                ListRecommendationsResponse, com.oracle.bmc.cloudguard.model.RecommendationSummary>(
                new com.google.common.base.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRecommendationsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.RecommendationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.RecommendationSummary>
                            apply(ListRecommendationsResponse response) {
                        return response.getRecommendationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResourceTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResourceTypesResponse> listResourceTypesResponseIterator(
            final ListResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResourceTypesRequest.Builder, ListResourceTypesRequest,
                ListResourceTypesResponse>(
                new com.google.common.base.Supplier<ListResourceTypesRequest.Builder>() {
                    @Override
                    public ListResourceTypesRequest.Builder get() {
                        return ListResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceTypesRequest.Builder>,
                        ListResourceTypesRequest>() {
                    @Override
                    public ListResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceTypesRequest.Builder>
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
                        ListResourceTypesRequest, ListResourceTypesResponse>() {
                    @Override
                    public ListResourceTypesResponse apply(ListResourceTypesRequest request) {
                        return client.listResourceTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceTypeSummary} objects
     * contained in responses from the listResourceTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResourceTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResourceTypeSummary>
            listResourceTypesRecordIterator(final ListResourceTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResourceTypesRequest.Builder, ListResourceTypesRequest,
                ListResourceTypesResponse, com.oracle.bmc.cloudguard.model.ResourceTypeSummary>(
                new com.google.common.base.Supplier<ListResourceTypesRequest.Builder>() {
                    @Override
                    public ListResourceTypesRequest.Builder get() {
                        return ListResourceTypesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResourceTypesResponse, String>() {
                    @Override
                    public String apply(ListResourceTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResourceTypesRequest.Builder>,
                        ListResourceTypesRequest>() {
                    @Override
                    public ListResourceTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResourceTypesRequest.Builder>
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
                        ListResourceTypesRequest, ListResourceTypesResponse>() {
                    @Override
                    public ListResourceTypesResponse apply(ListResourceTypesRequest request) {
                        return client.listResourceTypes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResourceTypesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResourceTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResourceTypeSummary>
                            apply(ListResourceTypesResponse response) {
                        return response.getResourceTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderActivities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderActivitiesResponse> listResponderActivitiesResponseIterator(
            final ListResponderActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderActivitiesRequest.Builder, ListResponderActivitiesRequest,
                ListResponderActivitiesResponse>(
                new com.google.common.base.Supplier<ListResponderActivitiesRequest.Builder>() {
                    @Override
                    public ListResponderActivitiesRequest.Builder get() {
                        return ListResponderActivitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderActivitiesResponse, String>() {
                    @Override
                    public String apply(ListResponderActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderActivitiesRequest.Builder>,
                        ListResponderActivitiesRequest>() {
                    @Override
                    public ListResponderActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderActivitiesRequest.Builder>
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
                        ListResponderActivitiesRequest, ListResponderActivitiesResponse>() {
                    @Override
                    public ListResponderActivitiesResponse apply(
                            ListResponderActivitiesRequest request) {
                        return client.listResponderActivities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderActivitySummary} objects
     * contained in responses from the listResponderActivities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderActivitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderActivitySummary>
            listResponderActivitiesRecordIterator(final ListResponderActivitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderActivitiesRequest.Builder, ListResponderActivitiesRequest,
                ListResponderActivitiesResponse,
                com.oracle.bmc.cloudguard.model.ResponderActivitySummary>(
                new com.google.common.base.Supplier<ListResponderActivitiesRequest.Builder>() {
                    @Override
                    public ListResponderActivitiesRequest.Builder get() {
                        return ListResponderActivitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderActivitiesResponse, String>() {
                    @Override
                    public String apply(ListResponderActivitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderActivitiesRequest.Builder>,
                        ListResponderActivitiesRequest>() {
                    @Override
                    public ListResponderActivitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderActivitiesRequest.Builder>
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
                        ListResponderActivitiesRequest, ListResponderActivitiesResponse>() {
                    @Override
                    public ListResponderActivitiesResponse apply(
                            ListResponderActivitiesRequest request) {
                        return client.listResponderActivities(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResponderActivitiesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ResponderActivitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderActivitySummary>
                            apply(ListResponderActivitiesResponse response) {
                        return response.getResponderActivityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderExecutions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderExecutionsResponse> listResponderExecutionsResponseIterator(
            final ListResponderExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderExecutionsRequest.Builder, ListResponderExecutionsRequest,
                ListResponderExecutionsResponse>(
                new com.google.common.base.Supplier<ListResponderExecutionsRequest.Builder>() {
                    @Override
                    public ListResponderExecutionsRequest.Builder get() {
                        return ListResponderExecutionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderExecutionsResponse, String>() {
                    @Override
                    public String apply(ListResponderExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderExecutionsRequest.Builder>,
                        ListResponderExecutionsRequest>() {
                    @Override
                    public ListResponderExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderExecutionsRequest.Builder>
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
                        ListResponderExecutionsRequest, ListResponderExecutionsResponse>() {
                    @Override
                    public ListResponderExecutionsResponse apply(
                            ListResponderExecutionsRequest request) {
                        return client.listResponderExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderExecutionSummary} objects
     * contained in responses from the listResponderExecutions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderExecutionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>
            listResponderExecutionsRecordIterator(final ListResponderExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderExecutionsRequest.Builder, ListResponderExecutionsRequest,
                ListResponderExecutionsResponse,
                com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>(
                new com.google.common.base.Supplier<ListResponderExecutionsRequest.Builder>() {
                    @Override
                    public ListResponderExecutionsRequest.Builder get() {
                        return ListResponderExecutionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderExecutionsResponse, String>() {
                    @Override
                    public String apply(ListResponderExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderExecutionsRequest.Builder>,
                        ListResponderExecutionsRequest>() {
                    @Override
                    public ListResponderExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderExecutionsRequest.Builder>
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
                        ListResponderExecutionsRequest, ListResponderExecutionsResponse>() {
                    @Override
                    public ListResponderExecutionsResponse apply(
                            ListResponderExecutionsRequest request) {
                        return client.listResponderExecutions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResponderExecutionsResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderExecutionSummary>
                            apply(ListResponderExecutionsResponse response) {
                        return response.getResponderExecutionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderRecipeResponderRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderRecipeResponderRulesResponse>
            listResponderRecipeResponderRulesResponseIterator(
                    final ListResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderRecipeResponderRulesRequest.Builder,
                ListResponderRecipeResponderRulesRequest,
                ListResponderRecipeResponderRulesResponse>(
                new com.google.common.base.Supplier<
                        ListResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest.Builder get() {
                        return ListResponderRecipeResponderRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipeResponderRulesRequest.Builder>,
                        ListResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipeResponderRulesRequest.Builder>
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
                        ListResponderRecipeResponderRulesRequest,
                        ListResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListResponderRecipeResponderRulesResponse apply(
                            ListResponderRecipeResponderRulesRequest request) {
                        return client.listResponderRecipeResponderRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary} objects
     * contained in responses from the listResponderRecipeResponderRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary>
            listResponderRecipeResponderRulesRecordIterator(
                    final ListResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderRecipeResponderRulesRequest.Builder,
                ListResponderRecipeResponderRulesRequest, ListResponderRecipeResponderRulesResponse,
                com.oracle.bmc.cloudguard.model.ResponderRecipeResponderRuleSummary>(
                new com.google.common.base.Supplier<
                        ListResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest.Builder get() {
                        return ListResponderRecipeResponderRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipeResponderRulesRequest.Builder>,
                        ListResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipeResponderRulesRequest.Builder>
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
                        ListResponderRecipeResponderRulesRequest,
                        ListResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListResponderRecipeResponderRulesResponse apply(
                            ListResponderRecipeResponderRulesRequest request) {
                        return client.listResponderRecipeResponderRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResponderRecipeResponderRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .ResponderRecipeResponderRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .ResponderRecipeResponderRuleSummary>
                            apply(ListResponderRecipeResponderRulesResponse response) {
                        return response.getResponderRecipeResponderRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderRecipesResponse> listResponderRecipesResponseIterator(
            final ListResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderRecipesRequest.Builder, ListResponderRecipesRequest,
                ListResponderRecipesResponse>(
                new com.google.common.base.Supplier<ListResponderRecipesRequest.Builder>() {
                    @Override
                    public ListResponderRecipesRequest.Builder get() {
                        return ListResponderRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipesRequest.Builder>,
                        ListResponderRecipesRequest>() {
                    @Override
                    public ListResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipesRequest.Builder>
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
                        ListResponderRecipesRequest, ListResponderRecipesResponse>() {
                    @Override
                    public ListResponderRecipesResponse apply(ListResponderRecipesRequest request) {
                        return client.listResponderRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeSummary} objects
     * contained in responses from the listResponderRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>
            listResponderRecipesRecordIterator(final ListResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderRecipesRequest.Builder, ListResponderRecipesRequest,
                ListResponderRecipesResponse,
                com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>(
                new com.google.common.base.Supplier<ListResponderRecipesRequest.Builder>() {
                    @Override
                    public ListResponderRecipesRequest.Builder get() {
                        return ListResponderRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRecipesRequest.Builder>,
                        ListResponderRecipesRequest>() {
                    @Override
                    public ListResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRecipesRequest.Builder>
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
                        ListResponderRecipesRequest, ListResponderRecipesResponse>() {
                    @Override
                    public ListResponderRecipesResponse apply(ListResponderRecipesRequest request) {
                        return client.listResponderRecipes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResponderRecipesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderRecipeSummary>
                            apply(ListResponderRecipesResponse response) {
                        return response.getResponderRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listResponderRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListResponderRulesResponse> listResponderRulesResponseIterator(
            final ListResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListResponderRulesRequest.Builder, ListResponderRulesRequest,
                ListResponderRulesResponse>(
                new com.google.common.base.Supplier<ListResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRulesRequest.Builder get() {
                        return ListResponderRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRulesRequest.Builder>,
                        ListResponderRulesRequest>() {
                    @Override
                    public ListResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRulesRequest.Builder>
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
                        ListResponderRulesRequest, ListResponderRulesResponse>() {
                    @Override
                    public ListResponderRulesResponse apply(ListResponderRulesRequest request) {
                        return client.listResponderRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRuleSummary} objects
     * contained in responses from the listResponderRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.ResponderRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.ResponderRuleSummary>
            listResponderRulesRecordIterator(final ListResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListResponderRulesRequest.Builder, ListResponderRulesRequest,
                ListResponderRulesResponse, com.oracle.bmc.cloudguard.model.ResponderRuleSummary>(
                new com.google.common.base.Supplier<ListResponderRulesRequest.Builder>() {
                    @Override
                    public ListResponderRulesRequest.Builder get() {
                        return ListResponderRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListResponderRulesRequest.Builder>,
                        ListResponderRulesRequest>() {
                    @Override
                    public ListResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListResponderRulesRequest.Builder>
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
                        ListResponderRulesRequest, ListResponderRulesResponse>() {
                    @Override
                    public ListResponderRulesResponse apply(ListResponderRulesRequest request) {
                        return client.listResponderRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListResponderRulesResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.ResponderRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.ResponderRuleSummary>
                            apply(ListResponderRulesResponse response) {
                        return response.getResponderRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetDetectorRecipeDetectorRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetDetectorRecipeDetectorRulesResponse>
            listTargetDetectorRecipeDetectorRulesResponseIterator(
                    final ListTargetDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetDetectorRecipeDetectorRulesRequest.Builder,
                ListTargetDetectorRecipeDetectorRulesRequest,
                ListTargetDetectorRecipeDetectorRulesResponse>(
                new com.google.common.base.Supplier<
                        ListTargetDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListTargetDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipeDetectorRulesRequest.Builder>,
                        ListTargetDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListTargetDetectorRecipeDetectorRulesRequest,
                        ListTargetDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesResponse apply(
                            ListTargetDetectorRecipeDetectorRulesRequest request) {
                        return client.listTargetDetectorRecipeDetectorRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary} objects
     * contained in responses from the listTargetDetectorRecipeDetectorRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary>
            listTargetDetectorRecipeDetectorRulesRecordIterator(
                    final ListTargetDetectorRecipeDetectorRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetDetectorRecipeDetectorRulesRequest.Builder,
                ListTargetDetectorRecipeDetectorRulesRequest,
                ListTargetDetectorRecipeDetectorRulesResponse,
                com.oracle.bmc.cloudguard.model.TargetDetectorRecipeDetectorRuleSummary>(
                new com.google.common.base.Supplier<
                        ListTargetDetectorRecipeDetectorRulesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest.Builder get() {
                        return ListTargetDetectorRecipeDetectorRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetDetectorRecipeDetectorRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipeDetectorRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipeDetectorRulesRequest.Builder>,
                        ListTargetDetectorRecipeDetectorRulesRequest>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipeDetectorRulesRequest.Builder>
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
                        ListTargetDetectorRecipeDetectorRulesRequest,
                        ListTargetDetectorRecipeDetectorRulesResponse>() {
                    @Override
                    public ListTargetDetectorRecipeDetectorRulesResponse apply(
                            ListTargetDetectorRecipeDetectorRulesRequest request) {
                        return client.listTargetDetectorRecipeDetectorRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetDetectorRecipeDetectorRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .TargetDetectorRecipeDetectorRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .TargetDetectorRecipeDetectorRuleSummary>
                            apply(ListTargetDetectorRecipeDetectorRulesResponse response) {
                        return response.getTargetDetectorRecipeDetectorRuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetDetectorRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetDetectorRecipesResponse> listTargetDetectorRecipesResponseIterator(
            final ListTargetDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetDetectorRecipesRequest.Builder, ListTargetDetectorRecipesRequest,
                ListTargetDetectorRecipesResponse>(
                new com.google.common.base.Supplier<ListTargetDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipesRequest.Builder get() {
                        return ListTargetDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipesRequest.Builder>,
                        ListTargetDetectorRecipesRequest>() {
                    @Override
                    public ListTargetDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipesRequest.Builder>
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
                        ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>() {
                    @Override
                    public ListTargetDetectorRecipesResponse apply(
                            ListTargetDetectorRecipesRequest request) {
                        return client.listTargetDetectorRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary} objects
     * contained in responses from the listTargetDetectorRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>
            listTargetDetectorRecipesRecordIterator(
                    final ListTargetDetectorRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetDetectorRecipesRequest.Builder, ListTargetDetectorRecipesRequest,
                ListTargetDetectorRecipesResponse,
                com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>(
                new com.google.common.base.Supplier<ListTargetDetectorRecipesRequest.Builder>() {
                    @Override
                    public ListTargetDetectorRecipesRequest.Builder get() {
                        return ListTargetDetectorRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetDetectorRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetDetectorRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetDetectorRecipesRequest.Builder>,
                        ListTargetDetectorRecipesRequest>() {
                    @Override
                    public ListTargetDetectorRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetDetectorRecipesRequest.Builder>
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
                        ListTargetDetectorRecipesRequest, ListTargetDetectorRecipesResponse>() {
                    @Override
                    public ListTargetDetectorRecipesResponse apply(
                            ListTargetDetectorRecipesRequest request) {
                        return client.listTargetDetectorRecipes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetDetectorRecipesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.TargetDetectorRecipeSummary>
                            apply(ListTargetDetectorRecipesResponse response) {
                        return response.getTargetDetectorRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetResponderRecipeResponderRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetResponderRecipeResponderRulesResponse>
            listTargetResponderRecipeResponderRulesResponseIterator(
                    final ListTargetResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetResponderRecipeResponderRulesRequest.Builder,
                ListTargetResponderRecipeResponderRulesRequest,
                ListTargetResponderRecipeResponderRulesResponse>(
                new com.google.common.base.Supplier<
                        ListTargetResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest.Builder get() {
                        return ListTargetResponderRecipeResponderRulesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipeResponderRulesRequest.Builder>,
                        ListTargetResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipeResponderRulesRequest.Builder>
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
                        ListTargetResponderRecipeResponderRulesRequest,
                        ListTargetResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesResponse apply(
                            ListTargetResponderRecipeResponderRulesRequest request) {
                        return client.listTargetResponderRecipeResponderRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary} objects
     * contained in responses from the listTargetResponderRecipeResponderRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary>
            listTargetResponderRecipeResponderRulesRecordIterator(
                    final ListTargetResponderRecipeResponderRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetResponderRecipeResponderRulesRequest.Builder,
                ListTargetResponderRecipeResponderRulesRequest,
                ListTargetResponderRecipeResponderRulesResponse,
                com.oracle.bmc.cloudguard.model.TargetResponderRecipeResponderRuleSummary>(
                new com.google.common.base.Supplier<
                        ListTargetResponderRecipeResponderRulesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest.Builder get() {
                        return ListTargetResponderRecipeResponderRulesRequest.builder()
                                .copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetResponderRecipeResponderRulesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipeResponderRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipeResponderRulesRequest.Builder>,
                        ListTargetResponderRecipeResponderRulesRequest>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipeResponderRulesRequest.Builder>
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
                        ListTargetResponderRecipeResponderRulesRequest,
                        ListTargetResponderRecipeResponderRulesResponse>() {
                    @Override
                    public ListTargetResponderRecipeResponderRulesResponse apply(
                            ListTargetResponderRecipeResponderRulesRequest request) {
                        return client.listTargetResponderRecipeResponderRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetResponderRecipeResponderRulesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model
                                        .TargetResponderRecipeResponderRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model
                                            .TargetResponderRecipeResponderRuleSummary>
                            apply(ListTargetResponderRecipeResponderRulesResponse response) {
                        return response.getTargetResponderRecipeResponderRuleCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargetResponderRecipes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetResponderRecipesResponse> listTargetResponderRecipesResponseIterator(
            final ListTargetResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetResponderRecipesRequest.Builder, ListTargetResponderRecipesRequest,
                ListTargetResponderRecipesResponse>(
                new com.google.common.base.Supplier<ListTargetResponderRecipesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipesRequest.Builder get() {
                        return ListTargetResponderRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipesRequest.Builder>,
                        ListTargetResponderRecipesRequest>() {
                    @Override
                    public ListTargetResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipesRequest.Builder>
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
                        ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>() {
                    @Override
                    public ListTargetResponderRecipesResponse apply(
                            ListTargetResponderRecipesRequest request) {
                        return client.listTargetResponderRecipes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary} objects
     * contained in responses from the listTargetResponderRecipes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>
            listTargetResponderRecipesRecordIterator(
                    final ListTargetResponderRecipesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetResponderRecipesRequest.Builder, ListTargetResponderRecipesRequest,
                ListTargetResponderRecipesResponse,
                com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>(
                new com.google.common.base.Supplier<ListTargetResponderRecipesRequest.Builder>() {
                    @Override
                    public ListTargetResponderRecipesRequest.Builder get() {
                        return ListTargetResponderRecipesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetResponderRecipesResponse, String>() {
                    @Override
                    public String apply(ListTargetResponderRecipesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetResponderRecipesRequest.Builder>,
                        ListTargetResponderRecipesRequest>() {
                    @Override
                    public ListTargetResponderRecipesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetResponderRecipesRequest.Builder>
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
                        ListTargetResponderRecipesRequest, ListTargetResponderRecipesResponse>() {
                    @Override
                    public ListTargetResponderRecipesResponse apply(
                            ListTargetResponderRecipesRequest request) {
                        return client.listTargetResponderRecipes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetResponderRecipesResponse,
                        java.util.List<
                                com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.cloudguard.model.TargetResponderRecipeSummary>
                            apply(ListTargetResponderRecipesResponse response) {
                        return response.getTargetResponderRecipeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTargetsResponse> listTargetsResponseIterator(
            final ListTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetsRequest.Builder, ListTargetsRequest, ListTargetsResponse>(
                new com.google.common.base.Supplier<ListTargetsRequest.Builder>() {
                    @Override
                    public ListTargetsRequest.Builder get() {
                        return ListTargetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetsResponse, String>() {
                    @Override
                    public String apply(ListTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetsRequest.Builder>,
                        ListTargetsRequest>() {
                    @Override
                    public ListTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetsRequest.Builder>
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
                new com.google.common.base.Function<ListTargetsRequest, ListTargetsResponse>() {
                    @Override
                    public ListTargetsResponse apply(ListTargetsRequest request) {
                        return client.listTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.cloudguard.model.TargetSummary} objects
     * contained in responses from the listTargets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.cloudguard.model.TargetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.cloudguard.model.TargetSummary> listTargetsRecordIterator(
            final ListTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetsRequest.Builder, ListTargetsRequest, ListTargetsResponse,
                com.oracle.bmc.cloudguard.model.TargetSummary>(
                new com.google.common.base.Supplier<ListTargetsRequest.Builder>() {
                    @Override
                    public ListTargetsRequest.Builder get() {
                        return ListTargetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTargetsResponse, String>() {
                    @Override
                    public String apply(ListTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetsRequest.Builder>,
                        ListTargetsRequest>() {
                    @Override
                    public ListTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetsRequest.Builder>
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
                new com.google.common.base.Function<ListTargetsRequest, ListTargetsResponse>() {
                    @Override
                    public ListTargetsResponse apply(ListTargetsRequest request) {
                        return client.listTargets(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTargetsResponse,
                        java.util.List<com.oracle.bmc.cloudguard.model.TargetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudguard.model.TargetSummary> apply(
                            ListTargetsResponse response) {
                        return response.getTargetCollection().getItems();
                    }
                });
    }
}
