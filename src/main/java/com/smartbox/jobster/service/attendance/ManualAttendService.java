package com.smartbox.jobster.service.attendance;

import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import com.smartbox.jobster.entity.vision.ManualAttendConfig;
import com.smartbox.jobster.entity.vision.ManualAttendRestDay;
import com.smartbox.jobster.entity.vision.ManualAttendance;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.view.manual_attendance.EmployeeDto;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.SaveContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Jobster team
 * date: 03/08/24 14:27
 */

@Service
public class ManualAttendService {

    @Autowired
    private UserService userService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private DepartmentService departmentService;


    @Nullable
    public Set<EmployeeDto> getManualAttends(Department department, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public void makeEmpAttend(Department branch, LocalDate dayToLock, Double defaultHrs) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ManualAttendConfig getAttendConfig(BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public ManualAttendRestDay getRestDay(ManualAttendConfig config, LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public List<com.smartbox.jobster.entity.vision.ManualAttendConfig> getAttendConfigs() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Cacheable(cacheNames = RedisCacheNames.MANUAL_ATTENDANCE_CACHE, keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public ManualAbsentReason loadAbsentReasonByCode(String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    public Long loadEmpAbsentReasons(Employee employee, Department department, ManualAbsentReason absentReason, LocalDate from, LocalDate to) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Collection<Department> getBranchTypeDepartments(BranchType branchType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
