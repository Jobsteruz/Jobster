package com.smartbox.jobster.service.restservices.messagehistory;

public record ApplicantUnreadCountReqDTO(String search, Boolean unread, Integer offset, Integer limit) {
}
