package com.smartbox.jobster.entity.ats;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum Currency implements EnumClass<String> {

    AZN("AZN"),
    BYR("BYR"),
    EUR("EUR"),
    GEL("GEL"),
    KGS("KGS"),
    KZT("KZT"),
    RUR("RUR"),
    UAH("UAH"),
    USD("USD"),
    UZS("UZS");

    private final String id;

    Currency(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static Currency fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}