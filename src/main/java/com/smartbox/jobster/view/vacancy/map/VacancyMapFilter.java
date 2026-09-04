package com.smartbox.jobster.view.vacancy.map;

import java.util.List;
import java.util.UUID;

/** Selected filter values; an empty/null list means the filter is off. */
public record VacancyMapFilter(List<UUID> departmentIds, List<String> tinyNames,
                               List<UUID> categoryIds, List<UUID> positionIds,
                               List<UUID> positionTypeIds) {
}
