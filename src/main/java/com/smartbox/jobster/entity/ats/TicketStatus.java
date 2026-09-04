package com.smartbox.jobster.entity.ats;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

public enum TicketStatus implements EnumClass<String> {

    NEW("NEW"),
    IN_PROGRESS("IN_PROGRESS"),
    FINISHED("FINISHED");

    private final String id;

    TicketStatus(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static TicketStatus fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
