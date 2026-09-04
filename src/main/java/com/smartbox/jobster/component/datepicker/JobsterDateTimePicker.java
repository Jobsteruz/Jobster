package com.smartbox.jobster.component.datepicker;

import com.vaadin.flow.component.datepicker.DatePicker;
import io.jmix.flowui.component.datetimepicker.TypedDateTimePicker;

/**
 * Application-wide {@link TypedDateTimePicker} whose embedded calendar always starts the week on
 * Monday, mirroring {@link JobsterDatePicker}.
 *
 * <p>The date part of a date-time picker carries its own {@link DatePicker.DatePickerI18n}, which the
 * base component fills from the locale (Sunday-first for English). This subclass re-applies Monday.
 * Registered as the replacement for {@code TypedDateTimePicker} in
 * {@link com.smartbox.jobster.config.WebConfiguration}.
 *
 * @see WeekStart
 */
public class JobsterDateTimePicker<V extends Comparable> extends TypedDateTimePicker<V> {

    @Override
    protected void initComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
