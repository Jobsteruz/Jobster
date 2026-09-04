package com.smartbox.jobster.entity.ai;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;


@Getter
public enum AIFieldType implements EnumClass<String> {

    INTEGER("INTEGER"),
    LONG("LONG"),
    DOUBLE("DOUBLE"),
    STRING("STRING"),
    BOOL("BOOL"),
    ENTITY("ENTITY"),
    ENUM("ENUM");


    private final String id;

    AIFieldType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AIFieldType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}