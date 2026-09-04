package com.smartbox.jobster.entity.robot;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ConditionType implements EnumClass<String> {

    EQUAL("EQUAL"),
    NOT_EQUAL("NOT_EQUAL"),
    CONTAIN("CONTAIN"),
    NOT_CONTAIN("NOT_CONTAIN"),
    START_WITH("START_WITH"),
    END_WITH("END_WITH"),
    GREATER_THAN("GREATER_THAN"),
    LESS_THAN("LESS_THAN"),
    EXIST("EXIST"),
    NOT_EXIST("NOT_EXIST"),
    IN_LIST("IN_LIST"),
    NOT_IN_LIST("NOT_IN_LIST");

    private final String id;

    ConditionType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static ConditionType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}