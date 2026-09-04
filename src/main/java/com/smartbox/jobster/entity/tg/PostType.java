package com.smartbox.jobster.entity.tg;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum PostType implements EnumClass<String> {

    POST("POST"),
    BACK("BACK"),
    MAIN("MAIN"),
    LANGUAGE("LANGUAGE"),
    QUESTIONNAIRE("QUESTIONNAIRE"),
    NEAREST_BRANCH("NEAREST_BRANCH"),
    BRANCH_LIST("BRANCH_LIST"),
    FEEDBACK("FEEDBACK"),
    LOGIN("LOGIN"),
    ZP_CAST("ZP_CAST"),
    ATTENDANCE("ATTENDANCE"),
    SHARE("SHARE"),
    MANAGER("MANAGER"),
    REQUESTS("REQUESTS");

    private final String id;

    PostType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static PostType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}