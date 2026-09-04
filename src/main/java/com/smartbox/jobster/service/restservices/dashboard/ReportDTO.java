package com.smartbox.jobster.service.restservices.dashboard;

import java.util.List;
import java.util.Map;

public record ReportDTO(Map<String, String> headers, List<Map<String, Object>> data,
                        List<Map<String, Object>> extraData) {
}
