package com.smartbox.jobster.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Monitoring role", code = MonitoringRole.CODE, scope = "UI")
public interface MonitoringRole extends StandardViewRole {
    String CODE = "monitoring-role";

    @ViewPolicy(viewIds = {"jb_AbstractPersonInfoView", "jb_AdmitActionView", "jb_BannedActionView", "jb_InviteEventView", "jb_MassDivisionView", "jb_RejectActionView", "jb_ReserveActionView", "jb_RestoreActionView", "jb_Applicant.detail", "jb_Applicant.list", "jb_Applicant.quickAdd", "jb_ApplicantInfoView", "jb_ApplicantChangeStatusView", "jb_ApplicantHistoryView", "jb_ApplicantInfoMobileView", "jb_ApplicantPendingView", "jb_ApplicantReserveView", "jb_ApplicantReviewedView", "jb_PersonDocumentView", "jb_Employee.detail", "jb_Employee.list", "jb_Employee.quickAdd", "jb_EmployeeInfoView", "jb_PersonContact.detail", "jb_PersonDocument.detail", "jb_PersonDocument.list", "jb_PersonEducation.detail", "jb_PersonEducation.list", "jb_PersonExperience.detail", "jb_PersonExperience.list", "jb_PersonHistory.list", "jb_Event.detail", "jb_Event.list", "jb_ActionMonitoring", "jb_Monitoring3", "AbstractPersonInfoFragment", "ApplicantEventFragment", "ApplicantInfoEditFragment", "ApplicantInfoFragment", "EmployeeAccessFragment", "EmployeeInfoEditFragment", "EmployeeInfoFragment", "PersonDocumentFragment", "PersonStageHistoryFragment", "PersonVacancyFragment", "jb_ApplicantKanbanInfoView", "jb_EmployeeKanbanInfoView", "jb_PersonComparisonView", "jb_PersonKanbanInfoView", "jb_StaffingTable.detail", "jb_StaffingTable.list", "jb_TraineeGroupMaster.list", "jb_TrainerLookup.list", "jb_TraineeGroupView", "jb_MasterTraineeGroupConfig.list", "jb_AbstractTraineeInternView", "jb_GradedTraineeInternView", "jb_PendingTraineeInternView", "jb_ReviewedTraineeInternView", "jb_TraineeInternInfoView", "jb_MentorInfoView", "jb_MentorListView", "jb_MentorLookupView", "jb_SpeechAssessmentInfoView", "jb_SpeechAssessmentDetailedInfoView", "jb_RequestKanbanInfoView", "jb_AbstractVacancyKanbanInfoView", "applicantQuestionnaire.list", "jb_VacancyMapView"})
    void screens();
}