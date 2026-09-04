package com.smartbox.jobster.view.employeepipelinereport;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public record EmployeePipelineDTO(List<String> recruiters, Map<String, List<Long>> series) implements Serializable {
    @Serial
    private static final long serialVersionUID = 3955184814784572065L;
}
