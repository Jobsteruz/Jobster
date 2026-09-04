package com.smartbox.jobster.service.cvparser.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.Set;

public record ApplyFieldsRequest(@NotEmpty Set<String> fields) {

    public boolean contains(String field) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
