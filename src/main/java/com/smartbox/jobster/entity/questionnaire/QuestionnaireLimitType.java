package com.smartbox.jobster.entity.questionnaire;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum QuestionnaireLimitType implements EnumClass<String> {

    BY_CANDIDATE_LIST("BY_CANDIDATE_LIST"),
    BY_MONITORING("BY_MONITORING");

    private final String id;

    QuestionnaireLimitType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static QuestionnaireLimitType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
