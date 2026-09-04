package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum PersonDuplicate implements EnumClass<String> {

    PHONE("PHONE"),
    PINFL("PINFL"),
    EMAIL("EMAIL"),
    TG_USER("TG_USER"),
    WHATSAPP_USER("WHATSAPP_USER");

    private final String id;

    PersonDuplicate(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static PersonDuplicate fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}