package com.smartbox.jobster.service.ai;

import lombok.Getter;

@Getter
public enum GeminiModel {
    // The best version

    // Fast and cheap

    // Stable versions
    GEMINI_3_PRO("gemini-3-pro-preview"),
    GEMINI_3_FLASH("gemini-3-flash-preview"),
    GEMINI_2_5_PRO("gemini-2.5-pro"),
    GEMINI_2_5_FLASH("gemini-2.5-flash");

    private final String id;

    GeminiModel(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
