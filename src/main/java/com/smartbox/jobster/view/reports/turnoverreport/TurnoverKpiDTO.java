package com.smartbox.jobster.view.reports.turnoverreport;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity(name = "jb_TurnoverKpiDTO")
@Getter
@Setter
public class TurnoverKpiDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer headcountStart;
    private Integer headcountEnd;
    private Double avgHeadcount;
    private Integer leftCount;
    private Double turnoverRate;

    public TurnoverKpiDTO() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TurnoverKpiDTO(int headcountStart, int headcountEnd, double avgHeadcount,
                          int leftCount, double turnoverRate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
