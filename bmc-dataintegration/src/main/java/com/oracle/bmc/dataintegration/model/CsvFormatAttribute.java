/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The CSV format attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CsvFormatAttribute.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CsvFormatAttribute extends AbstractFormatAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("encoding")
        private String encoding;

        public Builder encoding(String encoding) {
            this.encoding = encoding;
            this.__explicitlySet__.add("encoding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
        private String escapeCharacter;

        public Builder escapeCharacter(String escapeCharacter) {
            this.escapeCharacter = escapeCharacter;
            this.__explicitlySet__.add("escapeCharacter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
        private String delimiter;

        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            this.__explicitlySet__.add("delimiter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quoteCharacter")
        private String quoteCharacter;

        public Builder quoteCharacter(String quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
            this.__explicitlySet__.add("quoteCharacter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hasHeader")
        private Boolean hasHeader;

        public Builder hasHeader(Boolean hasHeader) {
            this.hasHeader = hasHeader;
            this.__explicitlySet__.add("hasHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFilePattern")
        private Boolean isFilePattern;

        public Builder isFilePattern(Boolean isFilePattern) {
            this.isFilePattern = isFilePattern;
            this.__explicitlySet__.add("isFilePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestampFormat")
        private String timestampFormat;

        public Builder timestampFormat(String timestampFormat) {
            this.timestampFormat = timestampFormat;
            this.__explicitlySet__.add("timestampFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CsvFormatAttribute build() {
            CsvFormatAttribute __instance__ =
                    new CsvFormatAttribute(
                            encoding,
                            escapeCharacter,
                            delimiter,
                            quoteCharacter,
                            hasHeader,
                            isFilePattern,
                            timestampFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CsvFormatAttribute o) {
            Builder copiedBuilder =
                    encoding(o.getEncoding())
                            .escapeCharacter(o.getEscapeCharacter())
                            .delimiter(o.getDelimiter())
                            .quoteCharacter(o.getQuoteCharacter())
                            .hasHeader(o.getHasHeader())
                            .isFilePattern(o.getIsFilePattern())
                            .timestampFormat(o.getTimestampFormat());

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

    @Deprecated
    public CsvFormatAttribute(
            String encoding,
            String escapeCharacter,
            String delimiter,
            String quoteCharacter,
            Boolean hasHeader,
            Boolean isFilePattern,
            String timestampFormat) {
        super();
        this.encoding = encoding;
        this.escapeCharacter = escapeCharacter;
        this.delimiter = delimiter;
        this.quoteCharacter = quoteCharacter;
        this.hasHeader = hasHeader;
        this.isFilePattern = isFilePattern;
        this.timestampFormat = timestampFormat;
    }

    /**
     * The encoding for the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    String encoding;

    /**
     * The escape character for the CSV format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
    String escapeCharacter;

    /**
     * The delimiter for the CSV format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
    String delimiter;

    /**
     * The quote character for the CSV format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quoteCharacter")
    String quoteCharacter;

    /**
     * Defines whether the file has a header row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasHeader")
    Boolean hasHeader;

    /**
     * Defines whether a file pattern is supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFilePattern")
    Boolean isFilePattern;

    /**
     * Format for timestamp information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestampFormat")
    String timestampFormat;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
