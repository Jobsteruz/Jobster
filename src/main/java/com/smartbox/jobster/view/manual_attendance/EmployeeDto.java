package com.smartbox.jobster.view.manual_attendance;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.vision.ManualAttendance;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Jobster team
 * date: 03/08/24 09:46
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JmixEntity
public class EmployeeDto {

    private Employee employee;

    private Department department;

    private Map<LocalDate, ManualAttendance> attendanceMap;


    public Double getTotalWorkingHours() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Long getTotalWorkingDays() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @NonNull
    public Map<LocalDate, ManualAttendance> getAttendanceMap() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public String key() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public boolean equals(Object obj) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public int hashCode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    public String key(JbEntity<?> entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
