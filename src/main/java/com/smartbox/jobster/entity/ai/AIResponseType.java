package com.smartbox.jobster.entity.ai;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum AIResponseType implements EnumClass<String> {

    APPLICANT_SEARCH("APPLICANT_SEARCH"),
    MEHNAT_CODEX("MEHNAT_CODEX"),
    MASS_SENDING("MASS_SENDING");

    private final String id;

    AIResponseType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AIResponseType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

