package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

import java.util.List;


public enum VacancyType implements EnumClass<String> {

    FOR_ALL("FOR_ALL"),
    FOR_EMPLOYEE("FOR_EMPLOYEE"),
    FOR_NON_EMPLOYEE("FOR_NON_EMPLOYEE");

    private final String id;

    VacancyType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static VacancyType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static List<VacancyType> types(boolean isEmployee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}