package com.smartbox.jobster.service.restservices.partnerintegration;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApplicantResponseDTO(
        UUID id,
        String companyPlatformId,
        String StaffTablePlatformId,
        String firstName,
        String lastName,
        String middleName,
        String fullName,
        String photo,
        String phone,
        String pinflHash,
        String pinfl,
        OffsetDateTime birthDate) implements Serializable {
}
