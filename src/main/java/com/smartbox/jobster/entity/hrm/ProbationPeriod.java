package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ProbationPeriod implements EnumClass<String> {

    ONE_MONTH("ONE_MONTH"),
    TWO_MONTHS("TWO_MONTHS"),
    THREE_MONTHS("THREE_MONTHS"),
    SIX_MONTHS("SIX_MONTHS");

    private final String id;

    ProbationPeriod(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static ProbationPeriod fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}