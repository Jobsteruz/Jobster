package com.smartbox.jobster.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Report role", code = ReportRole.CODE)
public interface ReportRole extends ReadEntityRole {
    String CODE = "report-role";

    @SpecificPolicy(resources = "reports.rest.enabled")
    void reportSpecific();

    @ViewPolicy(viewIds = {"jb_CancelReasonDashboard", "jb_HiredByPositionDashboard", "jb_KanbanFunnelDashboard", "jb_KanbanResponsibleDashboard", "jb_ManualAttendanceView", "jb_ManualAbsentReason.detail", "jb_ManualAbsentReason.list", "jb_ManualAbsentReasonsInfoView", "jb_ManualAttendConfig.detail", "jb_ManualAttendConfig.list", "jb_ManualAttendLock.detail", "jb_ManualAttendLock.list", "jb_ManualAttendRestDay.detail", "jb_ManualAttendRestDay.list", "report_Report.list", "report_ReportGroup.list", "report_ReportRunView", "report_ReportTableView", "report_ReportWizardCreatorView", "jb_AbstractHasPeriodReport", "jb_AverageAgeView", "jb_AverageProcessingTimeReportView", "jb_CandidateProcessingReportView", "jb_BranchProcessingReportView", "jb_ConversionAndVacancyOfRecruiterReport", "jb_FinishedWithUnfinishedView", "jb_FlowOfApplicantsView", "jb_GeneralApplicantReportView", "jb_AbstractExcelReportView", "jb_AbstractReportView", "jb_MonitoringByEmployeesView", "jb_QuestionTgUserView", "jb_QuestionTgUserView2", "jb_RecruitmentAndDismissalView", "jb_ReviewedApplicantsView", "jb_ApplicantMovementView", "jb_AbstractEntityMovement", "jb_StatisticsOnRecruitersView", "jb_PositionRecruiterChartView", "jb_AttendanceReportView", "jb_ReportGroup.list", "jb_StaffCompletenessByDeptView", "jb_TurnoverReportView", "jb_SupersetView", "jb_SupersetReportGroup.list", "jb_VacancyMapView", "jb_ManagerPerformanceReportView"})
    void reports();
}