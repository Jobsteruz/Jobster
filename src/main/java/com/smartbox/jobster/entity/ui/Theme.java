package com.smartbox.jobster.entity.ui;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Theme implements EnumClass<String> {

    DEFAULT("default-theme"),
    DARK("dark-theme"),
    PINK("pink-theme"),
    BLUE("blue-theme"),
    CLASSIC("classic-theme");

    private final String id;

    Theme(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static Theme fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}