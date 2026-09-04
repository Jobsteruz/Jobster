package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_STAFFING_TABLE", indexes = {
        @Index(name = "IDX_JB_STAFFING_TABLE_DEPARTMENT", columnList = "DEPARTMENT_ID"),
        @Index(name = "IDX_JB_STAFFING_TABLE_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_STAFFING_TABLE_POSITION", columnList = "POSITION_ID")
})
@Entity(name = "jb_StaffingTable")
@Getter
@Setter
public class StaffingTable extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 8697281075706386920L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @InstanceName
    @Column(name = "NUMBER_")
    private String number;

    @JoinColumn(name = "POSITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Position position;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "PLATFORM_ID")
    private String platformId;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EmploymentType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(EmploymentType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}