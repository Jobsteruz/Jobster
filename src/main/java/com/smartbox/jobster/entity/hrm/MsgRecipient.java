package com.smartbox.jobster.entity.hrm;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

/**
 * Who a scheduled stage message is addressed to. Deliberately NOT {@link PersonUser}: that one is
 * the "which company user" picker of {@code SendAutoFillTemp2PersonManager}, whose switch has no
 * candidate branch — adding CANDIDATE there would offer an option that silently does nothing.
 */
public enum MsgRecipient implements EnumClass<String> {

    /** The applicant's {@code responsible} employee. */
    /** The manager recorded on the entity's {@code KanbanStageHistory} — the one handling it at this stage. */
    CANDIDATE("CANDIDATE"),
    RESPONSIBLE("RESPONSIBLE"),
    MANAGER("MANAGER");

    private final String id;

    MsgRecipient(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static MsgRecipient fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
