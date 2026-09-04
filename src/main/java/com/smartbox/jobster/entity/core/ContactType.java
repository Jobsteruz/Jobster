package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum ContactType implements EnumClass<String> {

    WORK_PHONE("WORK_PHONE", "images/work-phone.svg"),
    HOME_PHONE("HOME_PHONE", "images/home-phone.svg"),
    WORK_EMAIL("WORK_EMAIL", "images/work-email.svg"),
    HOME_EMAIL("HOME_EMAIL", "images/home-email.svg"),
    TELEGRAM("TELEGRAM", "images/platform/telegram.svg"),
    LINKED_IN("LINKED_IN", "images/platform/linkedin.svg"),
    WHATS_APP("WHATS_APP", "images/platform/whatsapp.svg"),
    INSTAGRAM("INSTAGRAM", "images/platform/instagram.svg");

    private final String id;
    private final String source;

    ContactType(String id, String source) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public String getSource() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Nullable
    public static ContactType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}