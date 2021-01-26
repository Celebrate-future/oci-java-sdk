/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The cryptographic properties of a key.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeyShape.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class KeyShape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private Algorithm algorithm;

        public Builder algorithm(Algorithm algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("curveId")
        private CurveId curveId;

        public Builder curveId(CurveId curveId) {
            this.curveId = curveId;
            this.__explicitlySet__.add("curveId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyShape build() {
            KeyShape __instance__ = new KeyShape(algorithm, length, curveId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyShape o) {
            Builder copiedBuilder =
                    algorithm(o.getAlgorithm()).length(o.getLength()).curveId(o.getCurveId());

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

    /**
     * The algorithm used by a key's key versions to encrypt or decrypt.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Algorithm {
        Aes("AES"),
        Rsa("RSA"),
        Ecdsa("ECDSA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Algorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (Algorithm v : Algorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Algorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Algorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Algorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The algorithm used by a key's key versions to encrypt or decrypt.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    Algorithm algorithm;

    /**
     * The length of the key in bytes, expressed as an integer. Values supported:
     *   - AES: 16, 24 or 32
     *   - RSA: 256, 384 or 512
     *   - ECDSA: 32, 48, 66
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    Integer length;
    /**
     * Supported curve Ids for ECDSA keys
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CurveId {
        NistP256("NIST_P256"),
        NistP384("NIST_P384"),
        NistP521("NIST_P521"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CurveId> map;

        static {
            map = new java.util.HashMap<>();
            for (CurveId v : CurveId.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CurveId(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CurveId create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CurveId', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Supported curve Ids for ECDSA keys
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("curveId")
    CurveId curveId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
