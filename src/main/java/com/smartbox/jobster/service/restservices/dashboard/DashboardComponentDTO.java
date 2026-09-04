package com.smartbox.jobster.service.restservices.dashboard;

public record DashboardComponentDTO(String label, String key, DashboardComponentType type, String valueClassName) {
}
