package com.runsidekick.model;

import java.util.Arrays;

/**
 * @author yasin.kalafat
 */
public enum WebhookType {
    SLACK,
    LOGZIO,
    CUSTOM,
    SUMOLOGIC,
    LOGGLY,
    NEWRELIC,
    ELASTIC;

    public static String[] getAllWebhookTypes() {
        return Arrays.stream(WebhookType.values()).map(Enum::name).toArray(String[]::new);
    }

    public static WebhookType toWebhookType(String type) {
        for (WebhookType webhookType : WebhookType.values()) {
            if (webhookType.name().equalsIgnoreCase(type)) {
                return webhookType;
            }
        }
        return null;
    }
}
