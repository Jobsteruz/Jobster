package com.smartbox.jobster.entity.ai;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum PersonAIAction implements EnumClass<String> {

    HELLO("HELLO"),
    COMPARE("COMPARE"),
    SUMMARY("SUMMARY"),
    ;

    private final String id;

    PersonAIAction(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static PersonAIAction fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}