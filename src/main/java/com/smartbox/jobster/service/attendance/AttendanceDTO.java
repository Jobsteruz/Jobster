package com.smartbox.jobster.service.attendance;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity(name = "jb_AttendanceDTO")
@Getter
@Setter
public class AttendanceDTO {
    @JmixGeneratedValue
    @JmixId
    private UUID id;

    private OffsetDateTime date;

    private String checkIn;

    private String checkOut;

    private Boolean overtime;

    private String comment;

    private String hoursFormat;

    private Double hours;
}