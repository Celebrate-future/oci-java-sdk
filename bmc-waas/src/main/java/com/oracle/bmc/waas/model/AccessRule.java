/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A content access rule. An access rule specifies an action to take if a set of criteria is matched by a request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AccessRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private java.util.List<AccessRuleCriteria> criteria;

        public Builder criteria(java.util.List<AccessRuleCriteria> criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
        private BlockAction blockAction;

        public Builder blockAction(BlockAction blockAction) {
            this.blockAction = blockAction;
            this.__explicitlySet__.add("blockAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
        private String blockErrorPageMessage;

        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            this.blockErrorPageMessage = blockErrorPageMessage;
            this.__explicitlySet__.add("blockErrorPageMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
        private String blockErrorPageCode;

        public Builder blockErrorPageCode(String blockErrorPageCode) {
            this.blockErrorPageCode = blockErrorPageCode;
            this.__explicitlySet__.add("blockErrorPageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
        private String blockErrorPageDescription;

        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            this.blockErrorPageDescription = blockErrorPageDescription;
            this.__explicitlySet__.add("blockErrorPageDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bypassChallenges")
        private java.util.List<BypassChallenges> bypassChallenges;

        public Builder bypassChallenges(java.util.List<BypassChallenges> bypassChallenges) {
            this.bypassChallenges = bypassChallenges;
            this.__explicitlySet__.add("bypassChallenges");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectResponseCode")
        private RedirectResponseCode redirectResponseCode;

        public Builder redirectResponseCode(RedirectResponseCode redirectResponseCode) {
            this.redirectResponseCode = redirectResponseCode;
            this.__explicitlySet__.add("redirectResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
        private String captchaTitle;

        public Builder captchaTitle(String captchaTitle) {
            this.captchaTitle = captchaTitle;
            this.__explicitlySet__.add("captchaTitle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
        private String captchaHeader;

        public Builder captchaHeader(String captchaHeader) {
            this.captchaHeader = captchaHeader;
            this.__explicitlySet__.add("captchaHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
        private String captchaFooter;

        public Builder captchaFooter(String captchaFooter) {
            this.captchaFooter = captchaFooter;
            this.__explicitlySet__.add("captchaFooter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
        private String captchaSubmitLabel;

        public Builder captchaSubmitLabel(String captchaSubmitLabel) {
            this.captchaSubmitLabel = captchaSubmitLabel;
            this.__explicitlySet__.add("captchaSubmitLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseHeaderManipulation")
        private java.util.List<HeaderManipulationAction> responseHeaderManipulation;

        public Builder responseHeaderManipulation(
                java.util.List<HeaderManipulationAction> responseHeaderManipulation) {
            this.responseHeaderManipulation = responseHeaderManipulation;
            this.__explicitlySet__.add("responseHeaderManipulation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRule build() {
            AccessRule __instance__ =
                    new AccessRule(
                            name,
                            criteria,
                            action,
                            blockAction,
                            blockResponseCode,
                            blockErrorPageMessage,
                            blockErrorPageCode,
                            blockErrorPageDescription,
                            bypassChallenges,
                            redirectUrl,
                            redirectResponseCode,
                            captchaTitle,
                            captchaHeader,
                            captchaFooter,
                            captchaSubmitLabel,
                            responseHeaderManipulation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRule o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .criteria(o.getCriteria())
                            .action(o.getAction())
                            .blockAction(o.getBlockAction())
                            .blockResponseCode(o.getBlockResponseCode())
                            .blockErrorPageMessage(o.getBlockErrorPageMessage())
                            .blockErrorPageCode(o.getBlockErrorPageCode())
                            .blockErrorPageDescription(o.getBlockErrorPageDescription())
                            .bypassChallenges(o.getBypassChallenges())
                            .redirectUrl(o.getRedirectUrl())
                            .redirectResponseCode(o.getRedirectResponseCode())
                            .captchaTitle(o.getCaptchaTitle())
                            .captchaHeader(o.getCaptchaHeader())
                            .captchaFooter(o.getCaptchaFooter())
                            .captchaSubmitLabel(o.getCaptchaSubmitLabel())
                            .responseHeaderManipulation(o.getResponseHeaderManipulation());

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
     * The unique name of the access rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The list of access rule criteria. The rule would be applied only for the requests that matched all the listed conditions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    java.util.List<AccessRuleCriteria> criteria;
    /**
     * The action to take when the access criteria are met for a rule. If unspecified, defaults to `ALLOW`.
     * <p>
     * - **ALLOW:** Takes no action, just logs the request.
     * <p>
     * - **DETECT:** Takes no action, but creates an alert for the request.
     * <p>
     * - **BLOCK:** Blocks the request by returning specified response code or showing error page.
     * <p>
     * - **BYPASS:** Bypasses some or all challenges.
     * <p>
     * - **REDIRECT:** Redirects the request to the specified URL. These fields are required when `REDIRECT` is selected: `redirectUrl`, `redirectResponseCode`.
     * <p>
     * - **SHOW_CAPTCHA:** Show a CAPTCHA Challenge page instead of the requested page.
     * <p>
     * Regardless of action, no further rules are processed once a rule is matched.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Action {
        Allow("ALLOW"),
        Detect("DETECT"),
        Block("BLOCK"),
        Bypass("BYPASS"),
        Redirect("REDIRECT"),
        ShowCaptcha("SHOW_CAPTCHA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action to take when the access criteria are met for a rule. If unspecified, defaults to `ALLOW`.
     * <p>
     * - **ALLOW:** Takes no action, just logs the request.
     * <p>
     * - **DETECT:** Takes no action, but creates an alert for the request.
     * <p>
     * - **BLOCK:** Blocks the request by returning specified response code or showing error page.
     * <p>
     * - **BYPASS:** Bypasses some or all challenges.
     * <p>
     * - **REDIRECT:** Redirects the request to the specified URL. These fields are required when `REDIRECT` is selected: `redirectUrl`, `redirectResponseCode`.
     * <p>
     * - **SHOW_CAPTCHA:** Show a CAPTCHA Challenge page instead of the requested page.
     * <p>
     * Regardless of action, no further rules are processed once a rule is matched.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;
    /**
     * The method used to block requests if `action` is set to `BLOCK` and the access criteria are met. If unspecified, defaults to `SET_RESPONSE_CODE`.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BlockAction {
        SetResponseCode("SET_RESPONSE_CODE"),
        ShowErrorPage("SHOW_ERROR_PAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BlockAction> map;

        static {
            map = new java.util.HashMap<>();
            for (BlockAction v : BlockAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BlockAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BlockAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BlockAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The method used to block requests if `action` is set to `BLOCK` and the access criteria are met. If unspecified, defaults to `SET_RESPONSE_CODE`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
    BlockAction blockAction;

    /**
     * The response status code to return when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the access criteria are met. If unspecified, defaults to `403`. The list of available response codes: `200`, `201`, `202`, `204`, `206`, `300`, `301`, `302`, `303`, `304`, `307`, `400`, `401`, `403`, `404`, `405`, `408`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `422`, `444`, `494`, `495`, `496`, `497`, `499`, `500`, `501`, `502`, `503`, `504`, `507`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    Integer blockResponseCode;

    /**
     * The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the access criteria are met. If unspecified, defaults to 'Access to the website is blocked.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
    String blockErrorPageMessage;

    /**
     * The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the access criteria are met. If unspecified, defaults to 'Access rules'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
    String blockErrorPageCode;

    /**
     * The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the access criteria are met. If unspecified, defaults to 'Access blocked by website owner. Please contact support.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
    String blockErrorPageDescription;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BypassChallenges {
        JsChallenge("JS_CHALLENGE"),
        DeviceFingerprintChallenge("DEVICE_FINGERPRINT_CHALLENGE"),
        HumanInteractionChallenge("HUMAN_INTERACTION_CHALLENGE"),
        Captcha("CAPTCHA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BypassChallenges> map;

        static {
            map = new java.util.HashMap<>();
            for (BypassChallenges v : BypassChallenges.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BypassChallenges(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BypassChallenges create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BypassChallenges', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of challenges to bypass when `action` is set to `BYPASS`. If unspecified or empty, all challenges are bypassed.
     * <p>
     * - **JS_CHALLENGE:** Bypasses JavaScript Challenge.
     * <p>
     * - **DEVICE_FINGERPRINT_CHALLENGE:** Bypasses Device Fingerprint Challenge.
     * <p>
     * - **HUMAN_INTERACTION_CHALLENGE:** Bypasses Human Interaction Challenge.
     * <p>
     * - **CAPTCHA:** Bypasses CAPTCHA Challenge.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bypassChallenges")
    java.util.List<BypassChallenges> bypassChallenges;

    /**
     * The target to which the request should be redirected, represented as a URI reference. Required when `action` is `REDIRECT`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    String redirectUrl;
    /**
     * The response status code to return when `action` is set to `REDIRECT`.
     * <p>
     * - **MOVED_PERMANENTLY:** Used for designating the permanent movement of a page (numerical code - 301).
     * <p>
     * - **FOUND:** Used for designating the temporary movement of a page (numerical code - 302).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RedirectResponseCode {
        MovedPermanently("MOVED_PERMANENTLY"),
        Found("FOUND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RedirectResponseCode> map;

        static {
            map = new java.util.HashMap<>();
            for (RedirectResponseCode v : RedirectResponseCode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RedirectResponseCode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RedirectResponseCode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RedirectResponseCode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The response status code to return when `action` is set to `REDIRECT`.
     * <p>
     * - **MOVED_PERMANENTLY:** Used for designating the permanent movement of a page (numerical code - 301).
     * <p>
     * - **FOUND:** Used for designating the temporary movement of a page (numerical code - 302).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectResponseCode")
    RedirectResponseCode redirectResponseCode;

    /**
     * The title used when showing a CAPTCHA challenge when `action` is set to `SHOW_CAPTCHA` and the request is challenged.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaTitle")
    String captchaTitle;

    /**
     * The text to show in the header when showing a CAPTCHA challenge when `action` is set to `SHOW_CAPTCHA` and the request is challenged.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaHeader")
    String captchaHeader;

    /**
     * The text to show in the footer when showing a CAPTCHA challenge when `action` is set to `SHOW_CAPTCHA` and the request is challenged.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaFooter")
    String captchaFooter;

    /**
     * The text to show on the label of the CAPTCHA challenge submit button when `action` is set to `SHOW_CAPTCHA` and the request is challenged.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaSubmitLabel")
    String captchaSubmitLabel;

    /**
     * An object that represents an action to apply to an HTTP response headers if all rule criteria will be matched regardless of `action` value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseHeaderManipulation")
    java.util.List<HeaderManipulationAction> responseHeaderManipulation;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
