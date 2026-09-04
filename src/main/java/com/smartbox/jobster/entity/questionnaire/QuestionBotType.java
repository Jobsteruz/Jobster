package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.$;
import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum QuestionBotType implements EnumClass<String> {

    TEXT("TEXT"),
    DATE("DATE"),
    OPTIONS("OPTIONS"),
    ENTITY("ENTITY"),
    ENUM("ENUM"),
    FILE("FILE");

    private final String id;

    QuestionBotType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static QuestionBotType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean supportsMultiSelection(){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}