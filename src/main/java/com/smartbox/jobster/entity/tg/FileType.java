package com.smartbox.jobster.entity.tg;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum FileType implements EnumClass<String> {

    PHOTO("PHOTO"),
    DOCUMENT("DOCUMENT"),
    AUDIO("AUDIO"),
    ANIMATION("ANIMATION"),
    VIDEO("VIDEO");

    private String id;

    FileType(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static FileType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
