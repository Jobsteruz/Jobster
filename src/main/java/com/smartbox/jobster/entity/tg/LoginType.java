package com.smartbox.jobster.entity.tg;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum LoginType implements EnumClass<String> {

    PHONE("PHONE"),
    EMAIL("EMAIL"),
    PERSONNEL_NUMBER("PERSONNEL_NUMBER"),
    PINFL("PINFL"),
    BIRTH_DATE("BIRTH_DATE");

    private final String id;

    LoginType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static LoginType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}