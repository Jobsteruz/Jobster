package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum VacancyUser implements EnumClass<String> {

    AUTHOR("AUTHOR"),
    VERIFIER("VERIFIER"),
    RESPONSIBLE("RESPONSIBLE"),
    CLOSED_BY("CLOSED_BY"),
    USER("USER");

    private final String id;

    VacancyUser(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static VacancyUser fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}