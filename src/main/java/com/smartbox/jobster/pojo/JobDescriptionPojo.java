package com.smartbox.jobster.pojo;

import com.smartbox.jobster.entity.hrm.Vacancy;
import io.jmix.core.Id;

import java.io.Serial;
import java.io.Serializable;

public record JobDescriptionPojo(Id<Vacancy> vacancyId, String authenticationLogin) implements Serializable {
    @Serial
    private static final long serialVersionUID = -7170075492199694992L;
}
