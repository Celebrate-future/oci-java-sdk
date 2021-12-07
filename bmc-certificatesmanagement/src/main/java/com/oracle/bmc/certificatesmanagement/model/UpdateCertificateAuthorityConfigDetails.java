/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The configuration details for updating a certificate authority (CA).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType",
    defaultImpl = UpdateCertificateAuthorityConfigDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateSubordinateCaIssuedByInternalCaConfigDetails.class,
        name = "SUBORDINATE_CA_ISSUED_BY_INTERNAL_CA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateRootCaByGeneratingInternallyConfigDetails.class,
        name = "ROOT_CA_GENERATED_INTERNALLY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateCertificateAuthorityConfigDetails {

    /**
     * The name of the CA version. When the value is not null, a name is unique across versions of a given CA.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    String versionName;
    /**
     * The rotation state of the CA. The default is {@code PENDING}, meaning that the CA is staged and available for use. A CA version
     * that you mark as {@code CURRENT} is currently in use, but you don't yet want to rotate it into current, active use. For example,
     * you might create or update a CA and mark its rotation state as {@code PENDING} if you haven't yet updated the certificate on the target system.
     *
     **/
    public enum Stage {
        Current("CURRENT"),
        Pending("PENDING"),
        ;

        private final String value;
        private static java.util.Map<String, Stage> map;

        static {
            map = new java.util.HashMap<>();
            for (Stage v : Stage.values()) {
                map.put(v.getValue(), v);
            }
        }

        Stage(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Stage create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Stage: " + key);
        }
    };
    /**
     * The rotation state of the CA. The default is {@code PENDING}, meaning that the CA is staged and available for use. A CA version
     * that you mark as {@code CURRENT} is currently in use, but you don't yet want to rotate it into current, active use. For example,
     * you might create or update a CA and mark its rotation state as {@code PENDING} if you haven't yet updated the certificate on the target system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stage")
    Stage stage;
}