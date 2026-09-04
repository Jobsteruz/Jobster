package com.smartbox.jobster.pojo;

import com.smartbox.jobster.entity.core.PersonStatus;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record ApplicantIshGOPojo(String id, PersonStatus action, String authenticationLogin) implements Serializable {
    @Serial
    private static final long serialVersionUID = 4179272963724239552L;
}
