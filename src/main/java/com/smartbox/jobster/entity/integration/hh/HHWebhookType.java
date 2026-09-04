package com.smartbox.jobster.entity.integration.hh;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum HHWebhookType implements EnumClass<String> {

    STATE_CHANGE("NEGOTIATION_EMPLOYER_STATE_CHANGE"),
    INVITATION("NEW_RESPONSE_OR_INVITATION_VACANCY");

    private final String id;

    HHWebhookType(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public static HHWebhookType fromId(String id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}