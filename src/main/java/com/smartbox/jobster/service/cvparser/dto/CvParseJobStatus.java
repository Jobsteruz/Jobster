package com.smartbox.jobster.service.cvparser.dto;

public enum CvParseJobStatus {
    QUEUED,
    UPLOADING,
    PARSING,
    COMPLETED,
    FAILED,
    APPLIED;

    /**
     * @return true if this status represents a terminal state where no further transitions are expected.
     * Terminal states are: {@link #COMPLETED}, {@link #FAILED}, {@link #APPLIED}.
     */
    public boolean isTerminal() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
