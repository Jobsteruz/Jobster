package com.smartbox.jobster.service.restservices.dashboard;

import java.util.List;

public record DashboardDTO(String name, String view, ReportType type, List<DashboardComponentDTO> components) {
}
