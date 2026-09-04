package com.smartbox.jobster.entity.company;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum DepartmentEditableField implements EnumClass<String> {

    CATEGORY("CATEGORY"),
    HEAD("HEAD"),
    REGION("REGION"),
    PARENT("PARENT"),
    PERSON_CATEGORY("PERSON_CATEGORY"),
    BRANCH_TYPE("BRANCH_TYPE"),
    TYPE("TYPE");

    private final String id;

    DepartmentEditableField(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static DepartmentEditableField fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

