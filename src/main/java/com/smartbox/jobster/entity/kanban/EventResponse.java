package com.smartbox.jobster.entity.kanban;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import org.springframework.lang.Nullable;
@Getter
public enum EventResponse implements EnumClass<String> {
    ACCEPT("ACCEPT"),
    DECLINE("DECLINE");

    private final String id;

    EventResponse(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    @Nullable
    public static EventResponse fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}


