package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum PersonUser implements EnumClass<String> {

    RESPONSIBLE("RESPONSIBLE"),
    MANAGER("MANAGER");

    private final String id;

    PersonUser(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static PersonUser fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
