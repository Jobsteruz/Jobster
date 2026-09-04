package com.smartbox.jobster.view.reports.monitoringbyemployees;

import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.view.reports.averageprocessingtimereport.RoleTypeDTO;

import java.time.OffsetDateTime;

public record MonitoringByEmployeesFilter(KanbanStage stage, PersonStatus status, OffsetDateTime from, OffsetDateTime to,
                                          FilterItem<Position> positionFilter, FilterItem<BranchType> branchTypeFilter,
                                          FilterItem<Department> branchFilter, RoleTypeDTO roleTypeDTO) {
}
