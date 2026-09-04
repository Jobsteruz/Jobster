package com.smartbox.jobster.pojo;

import java.io.Serial;
import java.io.Serializable;

public record PhotoValidationPojo(String entityId, String entityName) implements Serializable {
    @Serial
    private static final long serialVersionUID = 5993944570420044965L;
}
