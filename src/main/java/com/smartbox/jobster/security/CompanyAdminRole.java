package com.smartbox.jobster.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "Company Admin", code = CompanyAdminRole.CODE)
public interface CompanyAdminRole extends MonitoringRole {
    String CODE = "company-admin-role";
}