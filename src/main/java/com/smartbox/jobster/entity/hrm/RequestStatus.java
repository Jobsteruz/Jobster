package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;

import lombok.Getter;
import org.springframework.lang.Nullable;


@Getter
public enum RequestStatus implements EnumClass<String> {

    PENDING("PENDING", "#FF8949"),
    APPROVED("APPROVED", "#006AF5"),
    IN_PROGRESS("IN_PROGRESS", "#158444"),
    CLOSED("CLOSED", "#E21D12"),
    REJECTED("REJECTED", "#0D0D0D");

    private final String id;
    private final String color;

    RequestStatus(String id, String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Nullable
    public static RequestStatus fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}