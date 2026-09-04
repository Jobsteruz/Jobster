package com.smartbox.jobster.service.restservices.request;

import java.util.UUID;

public record RequestAllDTO(Integer offset, Integer limit, String status, String search, UUID position, UUID department,
                            UUID category, Boolean manager, String locale) {
}
