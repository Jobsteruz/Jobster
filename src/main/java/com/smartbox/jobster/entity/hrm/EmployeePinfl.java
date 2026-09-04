package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasCode;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.service.GenCodeService;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_EMPLOYEE_PINFL")
@Entity(name = "jb_EmployeePinfl")
@Getter
@Setter
public class EmployeePinfl extends StandardTenantEntity implements HasCode, Serializable {
    @Serial
    private static final long serialVersionUID = 948385134565593984L;

    @Column(name = "CODE")
    private String code;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "POSITION_")
    private String position;

    @Column(name = "DATE_EMPLOYMENT")
    private LocalDate dateEmployment;

    @Column(name = "DATE_DISMISSAL")
    private LocalDate dateDismissal;

    @Column(name = "CANCEL_REASON", length = 1024)
    private String cancelReason;

    @Column(name = "PINFL")
    private String pinfl;

    @Column(name = "PERSONNEL_NUMBER")
    private String personnelNumber;

    @Column(name = "LINK", length = 1024)
    private String link;

    @PostConstruct
    public void postConstruct() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @PrePersist
    public void prePersist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}