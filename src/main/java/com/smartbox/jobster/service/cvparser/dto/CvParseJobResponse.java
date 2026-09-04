package com.smartbox.jobster.service.cvparser.dto;

public record CvParseJobResponse(
        String jobId,
        CvParseJobStatus status,
        String error,
        boolean hasParsedData,
        boolean done
) {
    public static CvParseJobResponse from(CvParseJob job) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
