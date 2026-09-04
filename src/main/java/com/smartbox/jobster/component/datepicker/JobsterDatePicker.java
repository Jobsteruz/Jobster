package com.smartbox.jobster.component.datepicker;

import com.vaadin.flow.component.datepicker.DatePicker;
import io.jmix.flowui.component.datepicker.TypedDatePicker;

/**
 * Application-wide {@link TypedDatePicker} that always renders its calendar with Monday as the first
 * day of the week.
 *
 * <p>The base component computes the first day of week from the current locale, so English users see
 * Sunday first. This subclass re-applies Monday after the locale-based i18n is built. Registered as the
 * replacement for {@code TypedDatePicker} in
 * {@link com.smartbox.jobster.config.WebConfiguration}, so every {@code <datePicker>} descriptor and
 * {@code uiComponents.create(TypedDatePicker.class)} call produces this variant.
 *
 * @see WeekStart
 */
public class JobsterDatePicker<V extends Comparable> extends TypedDatePicker<V> {

    @Override
    protected void initComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
