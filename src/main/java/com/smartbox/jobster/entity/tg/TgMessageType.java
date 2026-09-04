package com.smartbox.jobster.entity.tg;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum TgMessageType implements EnumClass<String> {

    SEND_MESSAGE("SEND_MESSAGE"),
    DELETE_MESSAGE("DELETE_MESSAGE"),
    EDIT_MESSAGE_TEXT("EDIT_MESSAGE_TEXT"),
    EDIT_MESSAGE_REPLY("EDIT_MESSAGE_REPLY"),
    ANSWER_CALLBACK("ANSWER_CALLBACK");

    private final String id;

    TgMessageType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static TgMessageType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}