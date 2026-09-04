package com.smartbox.jobster.entity.company;


import io.jmix.core.metamodel.datatype.EnumClass;

import javax.annotation.Nullable;


public enum CompanySize implements EnumClass<String> {

    ONE_AND_TEN("1-10"),
    TEN_AND_FIFTY("10-50"),
    FIFTY_AND_HUNDRED("50-100"),
    HUNDRED_AND_FIVE_HUNDRED("100-500"),
    FIVE_HUNDRED_AND_THOUSAND("500-1000"),
    THOUSAND_AND_FIVE_THOUSAND("1000-5000"),
    FIVE_THOUSAND_AND_MORE("5000-");

    private String id;

    CompanySize(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static CompanySize fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}