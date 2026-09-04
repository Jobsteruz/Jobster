package com.smartbox.jobster.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "Minimal views", code = MinimalViewRole.CODE, scope = "UI")
public interface MinimalViewRole extends ReadEntityRole {
    String CODE = "minimal-view-role";

    @SpecificPolicy(resources = "ui.loginToUi")
    void minimalSpecific();

    @ViewPolicy(viewIds = {"jb_AbsentReason.list", "jb_AbstractListView", "jb_AbstractMobileListView", "jb_ActionListView", "jb_AnswerFormat.list", "jb_AutoFillTemplate.list", "jb_TgBot.list", "jb_BranchType.list", "jb_CancelReason.list", "jb_Country.list", "jb_Department.list", "jb_DepartmentCategory.list", "jb_Education.list", "jb_Experience.list", "jb_FilterView", "jb_FilterConditionView", "jb_IconView", "jb_LabelView", "jb_Language.list", "jb_MainView", "jb_MaritalStatus.list", "jb_Position.list", "jb_RefGroup.list", "jb_Region.list", "jb_Setting.list", "jb_RefSource.list", "jb_Region_And_jb_Department.list", "jb_SalaryLevel.list", "jb_Sequence.list", "jb_IntegratedGoogle.detail", "jb_UserProfileView", "jb_UserProfile.detail", "jb_WorkPosition.list", "jb_WorkSchedule.list", "jb_PositionType.list"})
    void minimalViews();
}