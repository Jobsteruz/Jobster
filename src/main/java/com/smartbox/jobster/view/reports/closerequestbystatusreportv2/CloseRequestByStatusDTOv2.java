package com.smartbox.jobster.view.reports.closerequestbystatusreportv2;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.RequestStatus;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.ref.Region;

import java.time.OffsetDateTime;
import java.util.Set;

public record CloseRequestByStatusDTOv2(KanbanStage stage, OffsetDateTime from, OffsetDateTime to, String dateFilterField,
                                        Set<User> author, Set<User> responsible, Set<Priority> priority,
                                        Set<RequestStatus> status, Set<DepartmentCategory> category,
                                        Set<Position> position, Set<Department> department, Set<Region> region) {
}
