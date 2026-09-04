package com.smartbox.jobster.view.reports.turnoverreport;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity(name = "jb_TurnoverMonthlyDTO")
@Getter
@Setter
public class TurnoverMonthlyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer year;
    private Integer month;
    private String monthLabel;
    private Double turnoverRate;
    private Integer leftCount;
    private Double avgHeadcount;

    public TurnoverMonthlyDTO() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TurnoverMonthlyDTO(int year, int month, String monthLabel,
                              double turnoverRate, int leftCount, double avgHeadcount) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
