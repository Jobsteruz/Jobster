package com.smartbox.jobster.entity.ats;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

/**
 * Origin of an exception ticket.
 * <ul>
 *   <li>{@link #UI} — captured by {@code DefaultUiExceptionSniffer} from Vaadin UI layer.</li>
 *   <li>{@link #BACKEND} — captured by {@code BackendExceptionHandler} from REST/service layer.</li>
 * </ul>
 */
public enum TicketSource implements EnumClass<String> {

    UI("UI"),
    BACKEND("BACKEND");

    private final String id;

    TicketSource(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static TicketSource fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
