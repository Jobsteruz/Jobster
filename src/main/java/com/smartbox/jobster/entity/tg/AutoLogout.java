package com.smartbox.jobster.entity.tg;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum AutoLogout implements EnumClass<Integer> {
    MONTH(1),
    THREE_MONTHS(3),
    SIX_MONTHS(6),
    YEAR(6),
    THREE_YEARS(36),
    UNLIM(-1);
    private final Integer id;

    AutoLogout(Integer id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AutoLogout fromId(Integer id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}