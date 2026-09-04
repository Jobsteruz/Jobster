package com.smartbox.jobster.entity.questionnaire;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum QuestionnaireColor implements EnumClass<String> {

    GREEN("#40DA6D"),
    YELLOW("#FDC202"),
    RED("#FD3435"),
    ORANGE("#FD823A"),
    PURPLE("#E5B8F6"),
    BLUE("#006AF5");

    private final String id;

    QuestionnaireColor(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static QuestionnaireColor fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}