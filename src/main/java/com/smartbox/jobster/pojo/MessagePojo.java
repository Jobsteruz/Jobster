package com.smartbox.jobster.pojo;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record MessagePojo(UUID messageId, String authenticationLogin) implements Serializable {
    @Serial
    private static final long serialVersionUID = -5233079374724746687L;
}
