package com.smartbox.jobster.security;

import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

/**
 * Grants visibility of the "Match" button on the Department list view, which lets an admin upload
 * the 1C↔Jobster matched Excel and back-fill each department's {@code platformId}.
 */
@ResourceRole(name = "PartnerIntegration match button role", code = PartnerIntegrationMatchBtnRole.CODE)
public interface PartnerIntegrationMatchBtnRole {
    String CODE = "partnerintegration-match-btn-role";

    @SpecificPolicy(resources = "ui.partnerintegrationMatchBtn.enabled")
    void partnerintegrationMatchBtn();

    @ViewPolicy(viewIds = {"jb_DepartmentMatchImportView", "jb_PositionMatchImportView"})
    void views();
}
