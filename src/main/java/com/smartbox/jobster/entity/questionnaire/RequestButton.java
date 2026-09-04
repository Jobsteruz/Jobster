package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.ref.SettingType;
import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum RequestButton implements EnumClass<String> {

    PHONE("PHONE"),
    LOCATION("LOCATION"),
    CONFIRMATION("CONFIRMATION");

    private final String id;

    RequestButton(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static RequestButton fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static SettingType type(RequestButton button) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}