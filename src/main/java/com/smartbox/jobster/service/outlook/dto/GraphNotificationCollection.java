package com.smartbox.jobster.service.outlook.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Body of a Microsoft Graph change-notification POST to our webhook: {@code {"value":[ ... ]}}.
 * We use basic notifications (no resource data), so each entry carries the subscription id, the
 * {@code clientState} to authenticate the callback, and {@code resourceData.id} = the new message id
 * we then fetch from Graph.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record GraphNotificationCollection(List<Notification> value) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Notification(String subscriptionId,
                               String clientState,
                               String changeType,
                               String resource,
                               ResourceData resourceData) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record ResourceData(String id) {
    }
}
