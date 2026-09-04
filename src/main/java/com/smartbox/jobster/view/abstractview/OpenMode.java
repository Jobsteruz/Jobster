package com.smartbox.jobster.view.abstractview;

import io.jmix.core.metamodel.datatype.EnumClass;


public enum OpenMode implements EnumClass<String> {

    NAVIGATION("NAVIGATION"),
    DIALOG("DIALOG"),
    TAB("TAB");

    private final String id;

    OpenMode(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OpenMode fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static OpenMode fromMode(io.jmix.flowui.view.OpenMode mode) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static io.jmix.flowui.view.OpenMode getMode(OpenMode mode) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}