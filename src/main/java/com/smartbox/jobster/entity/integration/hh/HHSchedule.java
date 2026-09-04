package com.smartbox.jobster.entity.integration.hh;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum HHSchedule implements EnumClass<String> {

    FULL_DAY("fullDay"),
    SHIFT_WORK("shift"),
    FLEXIBLE("flexible"),
    DISTANT_WORK("remote"),
    SHIFT_METHOD("flyInFlyOut");

    private final String id;

    HHSchedule(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static HHSchedule fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}