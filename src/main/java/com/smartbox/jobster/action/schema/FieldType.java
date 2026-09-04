package com.smartbox.jobster.action.schema;

/**
 * Type of an action input field, so a non-Vaadin client (mobile) knows which native control to
 * render for it. Mirrors the Vaadin components the actions build in {@code AbstractJbKanbanAction}.
 */
public enum FieldType {

    ENTITY_PICKER,         // lookup of another entity (vacancy, employee, cancel reason ...) — see optionsEndpoint
    MULTI_ENTITY_PICKER,   // multi-select lookup of another entity (e.g. role types) — see optionsEndpoint
    ENUM,            // single value from a fixed set — see options
    MULTI_ENUM,      // multiple values from a fixed set (e.g. send-to platforms) — see options
    TEXT,            // single/multi-line plain text
    RICH_TEXT,       // HTML message body (autofill templates)
    TEMPLATE,        // autofill-template picker (selecting one fills the message/sms body)
    CHECKBOX,        // boolean
    NUMBER,          // integer / long
    DATE             // date / date-time
}