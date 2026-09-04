package com.smartbox.jobster.entity.vision;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_MANUAL_ATTEND_LOCK", indexes = {
        @Index(name = "IDX_JB_MANUAL_ATTEND_LOCK_BRANCH", columnList = "BRANCH_ID")
})
@Entity(name = "jb_ManualAttendLock")
@Getter
@Setter
public class ManualAttendLock extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 6082943498598825450L;

    @JoinColumn(name = "BRANCH_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department branch;

    @Column(name = "DAY_")
    private LocalDate day;

    @Column(name = "LOCKED")
    private Boolean locked = Boolean.TRUE;
}