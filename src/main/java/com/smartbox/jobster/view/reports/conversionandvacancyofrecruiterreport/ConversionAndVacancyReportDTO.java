package com.smartbox.jobster.view.reports.conversionandvacancyofrecruiterreport;

import com.smartbox.jobster.config.caching.JbCacheKeyMaker;
import com.smartbox.jobster.config.caching.SupportsCaching;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.hrm.Employee;
import lombok.NonNull;

import java.time.OffsetDateTime;
import java.util.List;

public record ConversionAndVacancyReportDTO(@NonNull OffsetDateTime from, @NonNull OffsetDateTime to,
                                            List<RoleType> roleTypes,
                                            Employee employee,
                                            User user) implements SupportsCaching, JbCacheKeyMaker {
    @Override
    public Object key() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
