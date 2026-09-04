package com.smartbox.jobster.service.outlook.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Subset of the Microsoft Graph {@code subscription} resource we care about, returned by
 * create / renew ({@code POST|PATCH /subscriptions}). {@code expirationDateTime} is the value Graph
 * actually granted (it may clamp the one we asked for), so we persist Graph's echo, not our request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record GraphSubscription(String id, String resource, String expirationDateTime) {
}
