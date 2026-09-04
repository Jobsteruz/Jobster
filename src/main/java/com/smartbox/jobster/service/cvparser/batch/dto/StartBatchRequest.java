package com.smartbox.jobster.service.cvparser.batch.dto;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.view.survey.sendsurvey.PersonType;

import java.util.Objects;
import java.util.UUID;

/**
 * Immutable parameter object for {@code CvParseBatchService.startBatch(...)}.
 * The uploaded file body is kept as a byte array because batch input is bounded by
 * {@code jobster.cv-parser.batch.max-compressed-bytes} (50 MB default) and the dialog has
 * already buffered it. Streaming would add complexity without memory savings at this cap.
 * <p>
 * <b>Ownership:</b> this record is an internal, short-lived DTO passed from the Vaadin dialog
 * straight into the batch service. Callers must treat {@code fileContent} as read-only — no
 * mutation is expected and the record performs no defensive copy in the accessor to avoid
 * doubling peak memory on the batch hot path (up to 50 MB per request).
 *
 * @param fileContent       raw bytes of the upload (ZIP or single CV)
 * @param filename          original filename (used for extension sniffing + audit)
 * @param vacancyId         required when {@code personType == APPLICANT}; {@code null} for
 *                          {@code EMPLOYEE}
 * @param responsibleUserId optional — APPLICANT only (the recruiter owning the imports)
 * @param personType        target person type; drives validation and downstream auto-apply
 * @param departmentId      optional — EMPLOYEE only; when set, the created Employee is linked
 *                          to this department via a new {@code StaffingTable} row
 */
public record StartBatchRequest(
        byte[] fileContent,
        String filename,
        UUID vacancyId,
        UUID responsibleUserId,
        PersonType personType,
        UUID departmentId,
        Platform sourcePlatform,
        Boolean markCompleted
) {

    public StartBatchRequest {
        // Body + filename are structural requirements — null means the dialog wiring is broken.
        Objects.requireNonNull(fileContent, "fileContent");
        Objects.requireNonNull(filename, "filename");
        Objects.requireNonNull(personType, "personType");
        if (fileContent.length == 0) {
            throw new IllegalArgumentException("fileContent must be non-empty");
        }
        // vacancyId is an end-user input; the service raises ERR_VACANCY_REQUIRED for a clean UI
        // message when personType=APPLICANT. We therefore accept null here and let
        // CvParseBatchService reject it with the correct code.
    }

    /**
     * Build a request for the Applicant pipeline (existing flow). Keeps call sites readable
     * when the caller does not care about Employee-only fields.
     */
    public static StartBatchRequest forApplicant(byte[] fileContent,
                                                 String filename,
                                                 UUID vacancyId,
                                                 UUID responsibleUserId) {
        return new StartBatchRequest(
                fileContent, filename, vacancyId, responsibleUserId,
                PersonType.APPLICANT, null, null, null);
    }

    /**
     * Build a request for the Employee pipeline. Vacancy/responsible do not apply — each child
     * creates a new {@code Employee} optionally linked to the given department.
     */
    public static StartBatchRequest forEmployee(byte[] fileContent,
                                                String filename,
                                                UUID departmentId) {
        return new StartBatchRequest(
                fileContent, filename, null, null,
                PersonType.EMPLOYEE, departmentId, null, null);
    }

    /**
     * Outlook mail import: create the CV as an {@code OUTLOOK} Applicant, marked {@code completed=true}
     * so it lands in the normal applicant list/kanban like any other source. Per the agreed design,
     * Outlook imports are told apart by {@code platform=OUTLOOK} (not a separate review state); the
     * recruiter assigns a vacancy from the applicant view afterwards. Vacancy is null at import time,
     * which {@code CvParseBatchService} allows only for the OUTLOOK source.
     */
    public static StartBatchRequest forOutlook(byte[] fileContent,
                                               String filename,
                                               UUID responsibleUserId) {
        return new StartBatchRequest(
                fileContent, filename, null, responsibleUserId,
                PersonType.APPLICANT, null, Platform.OUTLOOK, Boolean.TRUE);
    }
}
