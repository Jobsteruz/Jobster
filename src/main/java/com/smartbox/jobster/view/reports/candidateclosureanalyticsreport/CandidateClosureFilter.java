package com.smartbox.jobster.view.reports.candidateclosureanalyticsreport;

import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.ref.RefSource;

import java.time.OffsetDateTime;

public record CandidateClosureFilter(OffsetDateTime from, OffsetDateTime to, Employee recruiter, Department branch,
                                     Position position, RefSource source, DepartmentCategory category,
                                     BranchType branchType) {
}
