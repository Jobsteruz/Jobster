package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;

import lombok.Getter;
import org.springframework.lang.Nullable;

@Getter
public enum VacancyStatus implements EnumClass<String> {

    ACTIVE("ACTIVE", "#006AF5"),
    CLOSED("CLOSED", "#EE797F");

    private final String id;
    private final String color;

    VacancyStatus(String id, String color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Nullable
    public static VacancyStatus fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}