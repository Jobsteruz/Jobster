package com.smartbox.jobster.pojo;

import java.io.Serial;
import java.io.Serializable;

public record CvParserQueuePojo(String applicantId, String entityName, String tenantId) implements Serializable {
    @Serial
    private static final long serialVersionUID = 7293944570420044965L;
}
