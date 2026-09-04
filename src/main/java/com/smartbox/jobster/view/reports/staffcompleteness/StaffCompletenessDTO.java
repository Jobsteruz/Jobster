package com.smartbox.jobster.view.reports.staffcompleteness;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity(name = "jb_StaffCompletenessDTO")
@Getter
@Setter
public class StaffCompletenessDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String departmentName;
    private Integer total;
    private Integer filled;
    private Integer vacant;
    private Double rate;

    public StaffCompletenessDTO() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public StaffCompletenessDTO(String departmentName, int total, int filled, int vacant, double rate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int totalAsInt() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int filledAsInt() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public int vacantAsInt() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public double rateAsDouble() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
