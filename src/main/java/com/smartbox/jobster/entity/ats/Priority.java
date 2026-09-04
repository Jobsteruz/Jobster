package com.smartbox.jobster.entity.ats;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Priority implements EnumClass<String> {

    CRITICAL("CRITICAL", "#FD3435"),
    HIGH("HIGH", "#006AF5"),
    MEDIUM("MEDIUM", "#FDC202"),
    LOW("LOW", "#239432");

    private final String id;
    private final String color;

    Priority(String id, String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getColor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static Priority fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}