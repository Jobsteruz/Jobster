package com.smartbox.jobster.entity.tg;

import com.pengrad.telegrambot.model.request.ParseMode;
import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum Format implements EnumClass<String> {

    HTML("HTML"),
    MARKDOWN("MARKDOWN"),
    MARKDOWN_V2("MARKDOWN_V2"),
    LOCATION("LOCATION");

    private String id;

    Format(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static Format fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ParseMode mode(Format format) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
