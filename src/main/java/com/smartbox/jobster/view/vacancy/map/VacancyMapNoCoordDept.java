package com.smartbox.jobster.view.vacancy.map;

import java.util.UUID;

/** Department with open vacancies but a missing/invalid location — listed in the warning dialog. */
public record VacancyMapNoCoordDept(UUID id, String name, long count) {
}
