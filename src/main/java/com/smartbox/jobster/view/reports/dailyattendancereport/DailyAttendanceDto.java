package com.smartbox.jobster.view.reports.dailyattendancereport;

import com.smartbox.jobster.entity.Month;
import com.smartbox.jobster.entity.WeekDay;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.attendance.AttendanceService;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nullable;
import java.time.OffsetDateTime;

@JmixEntity(name = "jb_DailyAttendanceDto")
@Getter
@Setter
public class DailyAttendanceDto {

    private Employee employee;
    private OffsetDateTime checkIn;
    private OffsetDateTime checkOut;
    private Boolean overtime;
    private String overtimeTaskDescription;


    @JmixProperty
    @Nullable
    public Double getWorkingHours() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @JmixProperty
    public Month getMonth() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @JmixProperty
    public WeekDay getWeekDay() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


}
