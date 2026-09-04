package com.smartbox.jobster.action.schema;

import java.util.List;

/**
 * Declarative description of ONE input field of a kanban action, so a non-Vaadin client (mobile)
 * can render the stage-action dialog dynamically. It mirrors a field the action draws as a Vaadin
 * component in {@code AbstractJbKanbanAction#build()} — and {@link #key} is the exact params key the
 * client must send back so the action reads it the same way the web does.
 *
 * <p>{@link #optParamKey} links the field to the per-stage configuration: the field is only shown at
 * execution when that flag is enabled in the stage action's {@code optParams} (same rule the web
 * applies via {@code if (optParams.get(key)) add(...)}). A {@code null} optParamKey = always shown.
 */
public record ActionFieldDto(
        String key,                    // params key written back to the action, e.g. "vacancyId"
        String optParamKey,            // optParams flag that enables this field (null = always shown)
        FieldType type,
        String label,                  // already localized
        boolean required,
        List<ActionOptionDto> options, // for ENUM
        String optionsEndpoint,        // for ENTITY_PICKER / TEMPLATE — where the client fetches options
        String showIf                  // conditional visibility, e.g. "requestStatus=REJECTED"
) {

    public static ActionFieldDto entity(String key, String optParamKey, String label, boolean required, String optionsEndpoint) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Multi-select entity picker (e.g. role types) — the client sends back a comma-joined list of values. */
    public static ActionFieldDto multiEntity(String key, String optParamKey, String label, boolean required, String optionsEndpoint) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ActionFieldDto enumField(String key, String optParamKey, String label, boolean required, List<ActionOptionDto> options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ActionFieldDto text(String key, String optParamKey, String label, boolean required) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Rich (HTML) text body — e.g. job description / relocation notes in the offer. */
    public static ActionFieldDto richText(String key, String optParamKey, String label, boolean required) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ActionFieldDto multiEnum(String key, String optParamKey, String label, boolean required, List<ActionOptionDto> options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Autofill-template picker: choosing a template fills the message/sms body the client then sends. */
    public static ActionFieldDto template(String key, String optParamKey, String label, boolean required) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ActionFieldDto number(String key, String optParamKey, String label, boolean required) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ActionFieldDto checkbox(String key, String optParamKey, String label) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static ActionFieldDto date(String key, String optParamKey, String label, boolean required) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Returns a copy of this field that is only visible when {@code condition} holds (e.g. another field's value). */
    public ActionFieldDto withShowIf(String condition) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
