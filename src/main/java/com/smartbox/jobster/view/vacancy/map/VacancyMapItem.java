package com.smartbox.jobster.view.vacancy.map;

/** Filter combo item; id is a UUID for entity filters or the raw String for the SAP-code filter. */
public record VacancyMapItem(Object id, String name) {
}
