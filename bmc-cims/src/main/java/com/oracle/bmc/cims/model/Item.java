/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the item object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = Item.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = LimitItem.class, name = "limit"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TechSupportItem.class,
        name = "tech"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ActivityItem.class,
        name = "activity"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Item {

    /**
     * Unique identifier for the item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("itemKey")
    String itemKey;

    /**
     * The display name of the item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    @com.fasterxml.jackson.annotation.JsonProperty("category")
    Category category;

    @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
    SubCategory subCategory;

    @com.fasterxml.jackson.annotation.JsonProperty("issueType")
    IssueType issueType;
}
