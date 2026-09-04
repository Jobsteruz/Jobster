package com.smartbox.jobster.view.website;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum WebSectionType implements EnumClass<String> {
    NAVIGATION_SECTION("NAVIGATION_SECTION", "MODAL"),
    INFO_LINE_SECTION("INFO_LINE_SECTION", "MARGIN_TOP"),
    ABOUT_SECTION("ABOUT_SECTION", "MODAL_LIST"),
    FOOTER_SECTION("FOOTER_SECTION", "MARGIN_BOTTOM"),
    VACANCY_SECTION("VACANCY_SECTION", "SUITCASE");

    private final String id;
    private final String src;


    WebSectionType(String id, String src) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static WebSectionType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getSrc() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}
