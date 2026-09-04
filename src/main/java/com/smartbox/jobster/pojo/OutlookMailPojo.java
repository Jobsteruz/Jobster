package com.smartbox.jobster.pojo;

import java.io.Serializable;

/**
 * RabbitMQ payload published by {@code OutlookSubscriptionService.handleNotificationPayload} when
 * Graph reports new mail, and consumed by {@code OutlookMailQueueListener} which fetches the
 * message's attachments and feeds resume-like ones to the CV parser. Mirrors the record style of
 * {@code CvParserQueuePojo}. The consumer resolves the tenant admin principal from {@code tenantId}.
 */
public record OutlookMailPojo(String integratedUserId, String messageId, String tenantId) implements Serializable {
}
