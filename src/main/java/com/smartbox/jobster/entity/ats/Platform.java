package com.smartbox.jobster.entity.ats;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

import java.util.Arrays;
import java.util.List;


public enum Platform implements EnumClass<String> {

    TELEGRAM("TELEGRAM", "images/platform/telegram.svg"),
    SMS("SMS", "images/platform/sms.svg"),
    EMAIL("EMAIL", "images/platform/email.svg"),
    WEBSITE("WEBSITE", "images/platform/website.svg"),
    JOBSTER("JOBSTER", "images/platform/jobster.svg"),
    JOBSTER_MOBILE("JOBSTER_MOBILE", "images/platform/jobster.svg"),
    HH("HH", "images/platform/HH.svg"),
    HH_EXT("HH_EXT", "images/platform/hh-ext.svg"),
    JSE("JSE", "images/platform/jse.svg"),
    WHATS_APP("WHATS_APP", "images/platform/whatsapp.svg"),
    LINKED_IN("LINKED_IN", "images/platform/linkedin.svg"),
    LINKED_IN_EXT("LINKED_IN_EXT", "images/platform/linkedin.svg"),
    GOOGLE_SHEET("GOOGLE_SHEET", "images/platform/google.svg"),
    GOOGLE_CALENDAR("GOOGLE_CALENDAR", "images/platform/google.svg"),
    OUTLOOK("OUTLOOK", "images/platform/outlook.svg"),
    ISH_GO("ISHGO", "images/platform/ishGO.svg"),
    TELEGRAM_CHANNEL("TELEGRAM_CHANNEL", "icons/telegram.svg"),
    ONE_C("1C", "icons/telegram.svg");

    private final String id;
    private final String source;

    Platform(String id, String source) {
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
    public static Platform fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<Platform> msgValues() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}