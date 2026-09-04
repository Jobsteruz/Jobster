package com.smartbox.jobster.entity.security;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum SessionAction implements EnumClass<Integer> {

    LOGIN(1),
    LOGOUT(2),
    EXPIRATION(3),
    TERMINATION(4),
    SUBSTITUTION(5);

    private final Integer id;

    SessionAction(Integer id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static SessionAction fromId(Integer id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}