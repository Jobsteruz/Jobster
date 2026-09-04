package com.smartbox.jobster.entity.checklist;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum AssignedDefault implements EnumClass<String> {

    CURRENT_USER("CURRENT_USER"),
    VACANCY_RESPONSIBLE("VACANCY_RESPONSIBLE"),
    DEPARTMENT_HEAD("DEPARTMENT_HEAD"),
    REQUEST_AUTHOR("REQUEST_AUTHOR");

    private final String id;

    AssignedDefault(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AssignedDefault fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
