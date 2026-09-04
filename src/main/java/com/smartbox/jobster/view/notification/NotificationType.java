package com.smartbox.jobster.view.notification;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;

/**
 * @author Jobster team
 * Since: 8/24/2024 4:18 PM
 */
public enum NotificationType implements EnumClass<String> {
    ALL("ALL"),
    SPECIAL("SPECIAL"),
    USER("USER"),
    ROLE("ROLE"),
    COMPANY("COMPANY");

    private final String id;

    NotificationType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static NotificationType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
