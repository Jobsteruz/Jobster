package com.smartbox.jobster.entity.integration.hh;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum HHExperience implements EnumClass<String> {

    NO_EXPERIENCE("noExperience"),
    FROM1_TO3YEAR("between1And3"),
    FROM3_TO6YEAR("between3And6"),
    MORE_THAN6("moreThan6");

    private final String id;

    HHExperience(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static HHExperience fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}