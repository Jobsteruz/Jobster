package com.smartbox.jobster.pojo;

import java.io.Serializable;
import java.util.List;

public record MassRejectResult(
        String username,
        int total,
        int success,
        int failed,
        List<String> failedNames
) implements Serializable {
}
