package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_EMPLOYEE_STATE_HISTORY", indexes = {
        @Index(name = "IDX_JB_EMPLOYEE_STATE_HISTORY_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_STATE_HISTORY_USER", columnList = "USER_ID")
})
@Entity(name = "jb_EmployeeStateHistory")
@Getter
@Setter
public class EmployeeStateHistory extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -4808958471448357294L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @InstanceName
    @Column(name = "STATE")
    private String state;

    @Column(name = "START_")
    private LocalDate start;

    @Column(name = "FINISH")
    private LocalDate finish;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee user;

    public EmployeeState getState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setState(EmployeeState state) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}