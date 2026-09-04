package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum EmployeeState implements EnumClass<String> {

    SICK_LEAVE("SICK_LEAVE"),
    UNPAID_LEAVE("UNPAID_LEAVE"),
    MAIN_LEAVE("MAIN_LEAVE"),
    MATERNITY_LEAVE("MATERNITY_LEAVE"),
    CHILDCARE_LEAVE("CHILDCARE_LEAVE"),
    STUDY_LEAVE("STUDY_LEAVE"),
    WORKING("WORKING"),
    FIRED("FIRED"),
    ;

    private final String id;

    EmployeeState(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static EmployeeState fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}