package com.smartbox.jobster.service.sms;

public record SMSErrorHandlerDto(String tenantId, String phoneNumber, String sendText,
                                 Object responseId, Object responseStatus, Object responseMessage) {
}
