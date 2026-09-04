package com.smartbox.jobster.view.reports.vacancyanalytics;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;

import java.time.OffsetDateTime;

public record VacancyAnalyticsDTO(
        OffsetDateTime from,
        OffsetDateTime to,
        OffsetDateTime closedDateFrom,
        OffsetDateTime closedDateTo,
        Boolean hireDateExists,
        User responsible,
        String workplaceStatus,
        Boolean cancelReasonExists,
        Position position,
        Department department,
        String code
) {
}
