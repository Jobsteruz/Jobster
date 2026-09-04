package com.smartbox.jobster.pojo;

import com.smartbox.jobster.entity.core.PersonStatus;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record ApplicantIshGoStatusPojo(List<String> entityId, PersonStatus action,String authenticationLogin) implements Serializable {

    @Serial
    private static final long serialVersionUID = -4264581900041639440L;
}
