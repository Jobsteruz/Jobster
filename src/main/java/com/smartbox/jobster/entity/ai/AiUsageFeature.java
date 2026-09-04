package com.smartbox.jobster.entity.ai;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum AiUsageFeature implements EnumClass<String> {

    CHAT("CHAT"),
    JOB_DESCRIPTION("JOB_DESCRIPTION"),
    PERSON_ASSISTANT("PERSON_ASSISTANT"),
    ENTITY_ASSISTANT("ENTITY_ASSISTANT"),
    CUSTOM("CUSTOM");

    private final String id;

    AiUsageFeature(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AiUsageFeature fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
