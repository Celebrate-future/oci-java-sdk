/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsPatternFilter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsPatternFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsPatternFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private LogAnalyticsSourcePattern pattern;

        public Builder pattern(LogAnalyticsSourcePattern pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
        private Boolean isInUse;

        public Builder isInUse(Boolean isInUse) {
            this.isInUse = isInUse;
            this.__explicitlySet__.add("isInUse");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternId")
        private Long patternId;

        public Builder patternId(Long patternId) {
            this.patternId = patternId;
            this.__explicitlySet__.add("patternId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private LogAnalyticsSource source;

        public Builder source(LogAnalyticsSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsPatternFilter build() {
            LogAnalyticsPatternFilter __instance__ =
                    new LogAnalyticsPatternFilter(
                            pattern,
                            agentVersion,
                            isInUse,
                            operatingSystem,
                            patternId,
                            sourceId,
                            version,
                            source);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsPatternFilter o) {
            Builder copiedBuilder =
                    pattern(o.getPattern())
                            .agentVersion(o.getAgentVersion())
                            .isInUse(o.getIsInUse())
                            .operatingSystem(o.getOperatingSystem())
                            .patternId(o.getPatternId())
                            .sourceId(o.getSourceId())
                            .version(o.getVersion())
                            .source(o.getSource());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    LogAnalyticsSourcePattern pattern;

    /**
     * The agent version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    String agentVersion;

    /**
     * A flag indicating whether or not the pattern filter is currently
     * in use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
    Boolean isInUse;

    /**
     * The operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    String operatingSystem;

    /**
     * The pattern unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternId")
    Long patternId;

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;

    /**
     * The pattern filter version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    LogAnalyticsSource source;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
