package com.smartbox.jobster.entity.questionnaire;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum QuestionWebType implements EnumClass<String> {

    RADIO_BUTTON("RADIO_BUTTON", "DOT_CIRCLE"),
    SELECT_LIST("SELECT_LIST", "FILE_TREE_SUB"),
    TEXT("TEXT", "ALIGN_LEFT"),
    DATE("DATE", "DATE_INPUT"),
    CHECKBOX("CHECKBOX", "CHECK_CIRCLE"),
    FILE("FILE", "CLOUD_DOWNLOAD"),
    TEXT_AREA("TEXT_AREA", "ALIGN_JUSTIFY");

    private final String id;
    private final String src;


    QuestionWebType(String id, String src) {
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

    @Nullable
    public static QuestionWebType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}