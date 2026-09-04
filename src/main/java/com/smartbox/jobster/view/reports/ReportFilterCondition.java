package com.smartbox.jobster.view.reports;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;

@Getter
public enum ReportFilterCondition implements EnumClass<String> {
    EQUAL("EQUAL", "in"),
    NOT_EQUAL("NOT_EQUAL", "not in"),
    IN_LIST("IN_LIST", "in"),
    NOT_IN_LIST("NOT_IN_LIST", "not in"),;

    private final String id;
    private final String sqlCondition;

    ReportFilterCondition(String id, String sqlCondition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static ReportFilterCondition fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
