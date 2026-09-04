package com.smartbox.jobster.listener.entity;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.service.person.EmployeeService;
import io.jmix.core.DataManager;
import io.jmix.core.Id;
import io.jmix.core.event.EntityChangedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StaffingTableEventListener {

    private final DataManager dataManager;
    private final EmployeeService employeeService;

    @EventListener
    public void onStaffingTableChangedBeforeCommit(final EntityChangedEvent<StaffingTable> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @EventListener
    void onStaffingTableChangedAfterCommit(EntityChangedEvent<StaffingTable> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void clearCaches(Id<StaffingTable> id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
