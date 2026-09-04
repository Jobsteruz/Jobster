package com.smartbox.jobster.view.reports.monitoringbyemployees;

import com.smartbox.jobster.view.reports.ReportFilterCondition;

import java.util.Set;

public record FilterItem<T>(ReportFilterCondition condition, Set<T> items) {
}
