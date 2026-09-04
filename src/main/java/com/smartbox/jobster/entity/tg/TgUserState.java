package com.smartbox.jobster.entity.tg;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum TgUserState implements EnumClass<String> {

    MENU("MENU"),
    QUESTION("QUESTION"),
    SURVEY("SURVEY"),
    FEEDBACK("FEEDBACK"),
    LOGIN_TYPE("LOGIN_TYPE"),
    LOGIN("LOGIN"),
    VERIFY("VERIFY"),
    ZP_CAST("ZP CAST"),
    ATTENDANCE("ATTENDANCE"),
    BRANCH_LIST("BRANCH_LIST"),
    NEAREST_BRANCH("NEAREST_BRANCH"),
    MANAGER("MANAGER"),
    MANAGER_COMMENT("MANAGER_COMMENT"),
    CHECK_UP("CHECK_UP"),
    PHOTO_VALIDATION("PHOTO_VALIDATION");

    private final String id;

    TgUserState(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static TgUserState fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}