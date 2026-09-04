package com.smartbox.jobster.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;


@Getter
public enum WeekDay implements EnumClass<String> {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 0);

    private final String id;

    private final int dow;

    WeekDay(String id, int dow) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static WeekDay fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}