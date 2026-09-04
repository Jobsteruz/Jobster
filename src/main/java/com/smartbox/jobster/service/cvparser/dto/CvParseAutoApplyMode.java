package com.smartbox.jobster.service.cvparser.dto;

/**
 * Controls whether {@link com.smartbox.jobster.service.cvparser.ResumeParserService} applies
 * parsed fields to the target person automatically after the external parser webhook arrives.
 *
 * <ul>
 *   <li>{@link #NONE} — the dialog-driven V2 flow. The user reviews parsed fields and picks
 *       which ones to apply.
 *   <li>{@link #EMPTY_ONLY} — headless bot flow. The webhook handler computes the set of
 *       Applicant fields that are still empty and applies only those, preserving any values
 *       the user already supplied through the questionnaire.
 * </ul>
 */
public enum CvParseAutoApplyMode {

    NONE,
    EMPTY_ONLY
}