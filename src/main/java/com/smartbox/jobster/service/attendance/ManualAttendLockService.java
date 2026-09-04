package com.smartbox.jobster.service.attendance;

import com.smartbox.jobster.$;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.vision.ManualAttendConfig;
import com.smartbox.jobster.entity.vision.ManualAttendLock;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Collection;

/**
 * @author Jobster team
 * date: 06/08/24 11:34
 */

@Service
public class ManualAttendLockService {


    @Autowired
    private DataManager dataManager;
    @Autowired
    private ManualAttendService manualAttendService;


    @Nullable
    @Transactional(readOnly = true)
    public ManualAttendLock getLock(Department department, LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    @Cacheable(value = RedisCacheNames.MANUAL_ATTENDANCE_CACHE, keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager", unless = "#result == null")
    public Boolean locked(Department branch, LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public void lockDay(Department department, LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public void lockAllDepartments(LocalDate dateToLock) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    @Nullable
    public void lockDepartmentAndMakeEmployeeAttend(Department department, LocalDate dateToLock, Double defaultWorkHrs) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @CacheEvict(value = RedisCacheNames.MANUAL_ATTENDANCE_CACHE, keyGenerator = "jb_KeyGenerator", cacheManager = "hazelcastCacheManager")
    public void cacheEvict(Department department, LocalDate day) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Transactional
    public void unlockAll(Collection<Department> deps, LocalDate lockDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
