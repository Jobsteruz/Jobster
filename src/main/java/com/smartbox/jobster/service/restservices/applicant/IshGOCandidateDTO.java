package com.smartbox.jobster.service.restservices.applicant;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public record IshGOCandidateDTO(
        String id,
        String fullName,
        String firstName,
        String lastName,
        String middleName,
        String pinfl,
        OffsetDateTime birthDate,
        String gender,
        String phone,
        String email,
        UUID region,
        UUID vacancy,
        List<IshGOCandidateEducationDTO> educations,
        Integer experience,
        List<IshGOCandidateExperienceDTO> experiences,
        List<IshGOLanguageDTO> languageLevels,
        Long salary,
        FileDTO image,
        FileDTO resume,
        FileDTO portfolio,
        String geoLocation,
        String resumeShareId,
        String locale
) implements Serializable {
    @Serial
    private static final long serialVersionUID = 460273556503741251L;
}