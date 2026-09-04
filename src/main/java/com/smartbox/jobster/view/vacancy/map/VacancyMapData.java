package com.smartbox.jobster.view.vacancy.map;

import java.util.List;

/** Everything the map screen needs for one render pass. */
public record VacancyMapData(List<VacancyMapPoint> points, long totalVacancies,
                             List<VacancyMapNoCoordDept> noCoords, long noCoordVacancies) {
}
