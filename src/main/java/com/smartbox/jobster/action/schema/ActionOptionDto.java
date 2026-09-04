package com.smartbox.jobster.action.schema;

/**
 * One selectable option of an {@link FieldType#ENUM} field: the stored {@code value} (what goes
 * into the action's params) and its already-localized {@code label} for display.
 */
public record ActionOptionDto(String value, String label) {
}
