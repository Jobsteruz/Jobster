package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;


@Getter
public enum PersonStatus implements EnumClass<String> {

    NEW("NEW", "#006AF5"),
    IN_PROGRESS("IN_PROGRESS", "#006AF5"),
    RESERVED("RESERVED", "#0D0D0D"),
    REJECTED("REJECTED", "#E21D12"),
    ACCEPTED("ACCEPTED", "#158444");

    private final String id;
    private final String color;

    PersonStatus(String id, String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static PersonStatus fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}