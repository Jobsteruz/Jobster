package com.smartbox.jobster.service;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancelReasonService {

    @Autowired
    private DataManager dataManager;
    @Autowired
    private EmployeeService employeeService;

    public List<CancelReason> getAllForCurrentUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<CancelReason> getAllForUser(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CancelReason getByMachineName(String machineName, String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public List<CancelReason> getCancelReasons(String tenantId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
