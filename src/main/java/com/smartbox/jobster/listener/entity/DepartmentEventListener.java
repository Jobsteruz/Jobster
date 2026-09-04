package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.event.EntityChangedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DepartmentEventListener {

    private final DepartmentService departmentService;
    private final DataManager dataManager;
    private final EmployeeService employeeService;


    @EventListener
    void onDepartmentChangedAfterCommit(EntityChangedEvent<Department> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
