package com.smartbox.jobster.view.survey.sendsurvey;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.jetbrains.annotations.NotNull;
import org.springframework.lang.Nullable;

public enum PersonType implements EnumClass<String> {
    EMPLOYEE("employee"),
    APPLICANT("applicant");

    private final String id;

    PersonType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public @NotNull String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static PersonType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
