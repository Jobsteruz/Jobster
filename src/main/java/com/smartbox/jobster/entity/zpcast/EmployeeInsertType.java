package com.smartbox.jobster.entity.zpcast;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum EmployeeInsertType implements EnumClass<String> {

    DROP_AND_INSERT("DROP_AND_INSERT"),
    REFRESH("REFRESH");;

    private final String id;

    EmployeeInsertType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static EmployeeInsertType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}