package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum DocumentType implements EnumClass<String> {

    CONTRACT("CONTRACT"),
    LICENSE("LICENSE"),
    CERTIFICATE("CERTIFICATE"),
    INN("INN"),
    PASSPORT("PASSPORT"),
    LETTER("LETTER"),
    INVOICE("INVOICE"),
    PHOTO("PHOTO"),
    RESUME("RESUME"),
    VACCINE_CERTIFICATE("VACCINE_CERTIFICATE"),
    RECOMMENDATION("RECOMMENDATION"),
    TESTING("TESTING"),
    OTHER("OTHER");

    private final String id;

    DocumentType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static DocumentType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}