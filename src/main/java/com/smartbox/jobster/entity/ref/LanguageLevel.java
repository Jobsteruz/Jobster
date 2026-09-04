package com.smartbox.jobster.entity.ref;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum LanguageLevel implements EnumClass<String> {

    BEGINNER("A1"),
    ELEMENTARY("A2"),
    INTERMEDIATE("B1"),
    UPPER_INTERMEDIATE("B2"),
    ADVANCED("C1"),
    PROFICIENT("C2"),
    NATIVE("L1");

    private final String id;

    LanguageLevel(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static LanguageLevel fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}