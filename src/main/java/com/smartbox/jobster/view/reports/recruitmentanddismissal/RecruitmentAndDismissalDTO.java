package com.smartbox.jobster.view.reports.recruitmentanddismissal;

import com.smartbox.jobster.entity.RoleType;

import java.time.OffsetDateTime;
import java.util.List;

public record RecruitmentAndDismissalDTO(List<RoleType> roleTypes, List<RoleType> internRoleTypes,
                                         OffsetDateTime from, OffsetDateTime to) {
}
