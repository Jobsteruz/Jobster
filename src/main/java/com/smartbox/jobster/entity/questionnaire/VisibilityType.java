package com.smartbox.jobster.entity.questionnaire;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum VisibilityType implements EnumClass<String> {

    SHOW_ALL("SHOW_ALL"),
    ONLY_FROM_VACANCY("ONLY_FROM_VACANCY"),
    ONLY_FROM_HOT_VACANCY("ONLY_FROM_HOT_VACANCY");

    private final String id;

    VisibilityType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static VisibilityType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}