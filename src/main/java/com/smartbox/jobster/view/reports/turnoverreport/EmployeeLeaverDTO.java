package com.smartbox.jobster.view.reports.turnoverreport;

import io.jmix.core.metamodel.annotation.JmixEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity(name = "jb_EmployeeLeaverDTO")
@Getter
@Setter
public class EmployeeLeaverDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fullName;
    private String departmentName;
    private String positionName;
    private String exitReasonName;
    private LocalDate exitDate;

    public EmployeeLeaverDTO() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EmployeeLeaverDTO(String fullName, String departmentName, String positionName,
                             String exitReasonName, LocalDate exitDate) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
