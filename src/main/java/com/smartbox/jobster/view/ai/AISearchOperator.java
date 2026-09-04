package com.smartbox.jobster.view.ai;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.jetbrains.annotations.NotNull;
import org.springframework.lang.Nullable;

public enum AISearchOperator implements EnumClass<String> {
    EQUAL("="),
    NOT_EQUAL("!="),
    GREATER(">"),
    LESS("<"),
    GREATER_OR_EQUAL(">="),
    LESS_OR_EQUAL("<="),
    IN("in"),
    NOT_IN("not in");

    private final String id;

    AISearchOperator(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public @NotNull String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static AISearchOperator fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
