package com.smartbox.jobster.entity.company;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum CompanyStatus implements EnumClass<String> {

    ACTIVE("ACTIVE"),
    PENDING("PENDING"),
    INACTIVE("INACTIVE");

    private final String id;

    CompanyStatus(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static CompanyStatus fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
