package com.smartbox.jobster.view.abstractview;

import io.jmix.core.metamodel.datatype.EnumClass;


public enum GridTheme implements EnumClass<String> {

    LUMO_NO_BORDER("no-border"),
    LUMO_NO_ROW_BORDERS("no-row-borders"),
    LUMO_COLUMN_BORDERS("column-borders"),
    LUMO_ROW_STRIPES("row-stripes"),
    LUMO_COMPACT("compact"),
    LUMO_WRAP_CELL_CONTENT("wrap-cell-content"),
    MATERIAL_COLUMN_DIVIDERS("column-dividers");

    private final String id;

    GridTheme(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static GridTheme fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}