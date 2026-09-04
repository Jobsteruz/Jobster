package com.smartbox.jobster.service.restservices.applicant;

import io.jmix.core.FileRef;

/**
 * The generated "Анкета кандидата" document. {@code file} is serialized as a ready-to-download
 * URL (see {@code FileRefSerializer}), the same way applicant photos are.
 */
public record ApplicantAnketaResponseDTO(String fileName, FileRef file) {
}
