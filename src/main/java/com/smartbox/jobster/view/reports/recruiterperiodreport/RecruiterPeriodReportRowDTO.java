package com.smartbox.jobster.view.reports.recruiterperiodreport;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;

@JmixEntity(name = "jb_RecruiterPeriodReportRowDTO")
@Getter
@Setter
public class RecruiterPeriodReportRowDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String recruiterName;
    private Map<UUID, Integer> endOfPeriodByStage;
    private Map<UUID, Integer> movementByStage;
    private Integer rejected;
    private Integer reserved;
    private Integer hired;

    public RecruiterPeriodReportRowDTO() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RecruiterPeriodReportRowDTO(String recruiterName,
                                       Map<UUID, Integer> endOfPeriodByStage,
                                       Map<UUID, Integer> movementByStage,
                                       int rejected, int reserved, int hired) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
