package com.smartbox.jobster.entity.ai;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum AIServiceType implements EnumClass<String> {

    SPEECH_ASSESSMENT("SPEECH_ASSESSMENT"),
    CV_PARSER("CV_PARSER");

    private final String id;

    AIServiceType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AIServiceType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}