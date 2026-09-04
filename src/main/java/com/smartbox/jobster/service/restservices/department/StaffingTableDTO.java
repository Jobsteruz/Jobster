package com.smartbox.jobster.service.restservices.department;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class StaffingTableDTO {
    private UUID position;
    private UUID employee;
    private UUID department;
    private String number;
    private String employmentType;
}
