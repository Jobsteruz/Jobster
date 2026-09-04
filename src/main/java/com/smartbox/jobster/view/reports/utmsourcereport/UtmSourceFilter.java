package com.smartbox.jobster.view.reports.utmsourcereport;

import com.smartbox.jobster.entity.tg.Bot;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public record UtmSourceFilter(Bot bot, boolean returnees, boolean completedQuestionnaire, boolean hired,
                              OffsetDateTime from, OffsetDateTime to) {
}
