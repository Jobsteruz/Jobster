package com.smartbox.jobster.view.manual_attendance;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.OneTimeCache;
import com.smartbox.jobster.config.caching.JbKeyGenerator;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentType;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import com.smartbox.jobster.entity.vision.ManualAttendConfig;
import com.smartbox.jobster.entity.vision.ManualAttendRestDay;
import com.smartbox.jobster.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

/**
 * @author Jobster team
 * date: 16/08/24 15:19
 */
public abstract class AbstractCachingSupport extends AbstractAttendSupport {

    private static final Logger log = LoggerFactory.getLogger(AbstractCachingSupport.class);


    @Autowired
    protected DepartmentService departmentService;

    @Autowired
    protected JbKeyGenerator keyGenerator;

    @Autowired
    protected OneTimeCache<String, Object> oneTimeCache;

    @Autowired
    protected OneTimeCache<String, Object> employeeAttendanceCache;


    @Override
    protected ManualAttendConfig getAttendConfig(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // returns attendances of its child departments, including own department if any
    @SuppressWarnings("unchecked")
    protected Collection<EmployeeDto> loadCachedAttendances(Department branch) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Nullable
    @Override
    protected ManualAttendRestDay getRestDay(ManualAttendConfig attendConfig, LocalDate localDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected ManualAbsentReason getAbsentReason(String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected List<Department> getEmpBranches(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @NonNull
    @Override
    protected Collection<EmployeeDto> loadAttendances(Department parent) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // make sure staffingDc is loaded beforehand
    private Collection<EmployeeDto> loadAttendances(Department department, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
