package com.smartbox.jobster.entity.integration.hh;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum HHStage implements EnumClass<String> {

    THINK("CONSIDER"),
    TEL_INTERVIEW("PHONE_INTERVIEW"),
    GRADE("ASSESSMENT"),
    INTERVIEW("INTERVIEW"),
    OFFER("OFFER"),
    GO_WORK("HIRED"),
    REFUSAL("DISCARD_BY_EMPLOYER");

    private final String id;

    HHStage(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static HHStage fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}