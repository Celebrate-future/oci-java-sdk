/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Generic command descriptor defining all attributes common to all querylanguage commands for parse output.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name",
    defaultImpl = AbstractCommandDescriptor.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TopCommandDescriptor.class,
        name = "TOP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HighlightCommandDescriptor.class,
        name = "HIGHLIGHT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MultiSearchCommandDescriptor.class,
        name = "MULTI_SEARCH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StatsCommandDescriptor.class,
        name = "STATS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeCompareCommandDescriptor.class,
        name = "TIME_COMPARE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TailCommandDescriptor.class,
        name = "TAIL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RegexCommandDescriptor.class,
        name = "REGEX"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeltaCommandDescriptor.class,
        name = "DELTA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LookupCommandDescriptor.class,
        name = "LOOKUP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DemoModeCommandDescriptor.class,
        name = "DEMO_MODE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FieldSummaryCommandDescriptor.class,
        name = "FIELD_SUMMARY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EventStatsCommandDescriptor.class,
        name = "EVENT_STATS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WhereCommandDescriptor.class,
        name = "WHERE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterSplitCommandDescriptor.class,
        name = "CLUSTER_SPLIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeStatsCommandDescriptor.class,
        name = "TIME_STATS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterCommandDescriptor.class,
        name = "CLUSTER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterDetailsCommandDescriptor.class,
        name = "CLUSTER_DETAILS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeleteCommandDescriptor.class,
        name = "DELETE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterCompareCommandDescriptor.class,
        name = "CLUSTER_COMPARE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SearchCommandDescriptor.class,
        name = "SEARCH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BucketCommandDescriptor.class,
        name = "BUCKET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CommandDescriptor.class,
        name = "COMMAND"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DistinctCommandDescriptor.class,
        name = "DISTINCT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LinkCommandDescriptor.class,
        name = "LINK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SortCommandDescriptor.class,
        name = "SORT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExtractCommandDescriptor.class,
        name = "EXTRACT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BottomCommandDescriptor.class,
        name = "BOTTOM"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FieldsCommandDescriptor.class,
        name = "FIELDS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HighlightRowsCommandDescriptor.class,
        name = "HIGHLIGHT_ROWS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MacroCommandDescriptor.class,
        name = "MACRO"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClassifyCommandDescriptor.class,
        name = "CLASSIFY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LinkDetailsCommandDescriptor.class,
        name = "LINK_DETAILS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SearchLookupCommandDescriptor.class,
        name = "SEARCH_LOOKUP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HeadCommandDescriptor.class,
        name = "HEAD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AddFieldsCommandDescriptor.class,
        name = "ADD_FIELDS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EvalCommandDescriptor.class,
        name = "EVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RenameCommandDescriptor.class,
        name = "RENAME"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AbstractCommandDescriptor {

    /**
     * Command fragment display string from user specified query string formatted by query builder.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
    String displayQueryString;

    /**
     * Command fragment internal string from user specified query string formatted by query builder.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
    String internalQueryString;

    /**
     * querylanguage command designation for example; reporting vs filtering
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;

    /**
     * Fields referenced in command fragment from user specified query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
    java.util.List<AbstractField> referencedFields;

    /**
     * Fields declared in command fragment from user specified query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
    java.util.List<AbstractField> declaredFields;

    /**
     * Name of querylanguage command
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Name {
        Command("COMMAND"),
        Search("SEARCH"),
        Stats("STATS"),
        TimeStats("TIME_STATS"),
        Sort("SORT"),
        Fields("FIELDS"),
        AddFields("ADD_FIELDS"),
        Link("LINK"),
        LinkDetails("LINK_DETAILS"),
        Cluster("CLUSTER"),
        ClusterDetails("CLUSTER_DETAILS"),
        ClusterSplit("CLUSTER_SPLIT"),
        Eval("EVAL"),
        Extract("EXTRACT"),
        EventStats("EVENT_STATS"),
        Bucket("BUCKET"),
        Classify("CLASSIFY"),
        Top("TOP"),
        Bottom("BOTTOM"),
        Head("HEAD"),
        Tail("TAIL"),
        FieldSummary("FIELD_SUMMARY"),
        Regex("REGEX"),
        Rename("RENAME"),
        TimeCompare("TIME_COMPARE"),
        Where("WHERE"),
        ClusterCompare("CLUSTER_COMPARE"),
        Delete("DELETE"),
        Delta("DELTA"),
        Distinct("DISTINCT"),
        SearchLookup("SEARCH_LOOKUP"),
        Lookup("LOOKUP"),
        DemoMode("DEMO_MODE"),
        Macro("MACRO"),
        MultiSearch("MULTI_SEARCH"),
        Highlight("HIGHLIGHT"),
        HighlightRows("HIGHLIGHT_ROWS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Name', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
