package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum EmploymentType implements EnumClass<String> {

    FULL_TIME("FULL"),
    PART_TIME("PART"),
    PROJECT_WORK("PROJECT"),
    VOLUNTEER("VOLUNTEER"),
    PROBATION("PROBATION");

    private final String id;

    EmploymentType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static EmploymentType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}