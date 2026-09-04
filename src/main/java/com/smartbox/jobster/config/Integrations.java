package com.smartbox.jobster.config;

import javax.annotation.Nullable;

/**
 * @author Jobster team
 * date: 23/05/24 16:11
 */
public enum Integrations {


    SPEECH_ASSESSMENT("SPEECH_ASSESSMENT");

    private String id;

    Integrations(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static Integrations fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
