package com.smartbox.jobster.view.vacancy.map;

import java.util.UUID;

/**
 * One map marker: a department with its open-vacancy count.
 * Field names are the JSON contract with vacancy-map.ts — keep them in sync.
 */
public record VacancyMapPoint(UUID id, String name, String tiny, String cat,
                              double lat, double lng, long count) {
}
