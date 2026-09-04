package com.smartbox.jobster.entity.whatsapp;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum WAUserState implements EnumClass<String> {

    MENU("MENU"),
    QUESTION("QUESTION"),
    SURVEY("SURVEY"),
    FEEDBACK("FEEDBACK"),
    LOGIN_TYPE("LOGIN_TYPE"),
    LOGIN("LOGIN"),
    VERIFY("VERIFY"),
    ZP_CAST("ZP CAST"),
    LANGUAGE_SELECTION("LANGUAGE_SELECTION"),
    QUIZ("QUIZ"),
    ATTENDANCE("ATTENDANCE");

    private final String id;

    WAUserState(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static WAUserState fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}