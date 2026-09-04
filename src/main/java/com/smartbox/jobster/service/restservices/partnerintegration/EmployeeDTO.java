package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record EmployeeDTO(
        String platformId,
        String staffingTablePlatformId,
        String staffNum,
        String fullName,
        String lastName,
        String firstName,
        String middleName,
        int gender,
        String birthDate,
        String pinflHash,
        String address,
        String address2,
        String email,
        String phone,
        int blacklist,
        boolean status,
        int employeeState) implements Serializable {
}
