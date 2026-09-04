package com.smartbox.jobster.controller;

import java.util.List;

public record GeneralApplicantReportPageDto(
        List<GeneralApplicantReportDto> data,
        long total,
        List<GeneralApplicantReportStageDto> stages
) {
}
