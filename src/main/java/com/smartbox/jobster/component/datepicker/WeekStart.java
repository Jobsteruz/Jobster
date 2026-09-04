package com.smartbox.jobster.component.datepicker;

import com.vaadin.flow.component.datepicker.DatePicker;

/**
 * Forces the calendar of date / date-time pickers to start the week on Monday, regardless of the
 * user's UI locale.
 *
 * <p>Jmix derives the first day of week from the current locale
 * ({@code Calendar.getInstance(locale).getFirstDayOfWeek()}), which yields Sunday for locales such as
 * English. The product is used in the Asia/Tashkent region where the week always starts on Monday, so
 * every picker must render Monday first in all three languages (EN/RU/UZ). Used by
 * {@link JobsterDatePicker}, {@link JobsterDateTimePicker} and any place that builds a
 * {@link DatePicker.DatePickerI18n} by hand.
 */
public final class WeekStart {

    /** Vaadin first-day-of-week index for Monday (0 = Sunday … 6 = Saturday). */
    public static final int MONDAY = 1;

    private WeekStart() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Sets Monday as the first day of week on the given i18n and returns it for chaining.
     * A {@code null} argument is returned unchanged.
     */
    public static DatePicker.DatePickerI18n applyMonday(DatePicker.DatePickerI18n i18n) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
