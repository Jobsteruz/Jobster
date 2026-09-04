package com.smartbox.jobster.service.restservices.dashboard;

import java.util.List;

public record ReportFilterDTO(String key, String value, List<String> values, String condition) {
}
