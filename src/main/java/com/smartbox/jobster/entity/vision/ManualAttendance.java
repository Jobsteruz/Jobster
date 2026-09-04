package com.smartbox.jobster.entity.vision;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_MANUAL_ATTENDANCE", indexes = {
        @Index(name = "IDX_JB_MANUAL_ATTENDANCE_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_MANUAL_ATTENDANCE_MANAGER", columnList = "MANAGER_ID"),
        @Index(name = "IDX_JB_MANUAL_ATTENDANCE_BRANCH", columnList = "BRANCH_ID"),
        @Index(name = "IDX_JB_MANUAL_ATTENDANCE_ABSENT_REASON", columnList = "ABSENT_REASON_ID")
})
@Entity(name = "jb_ManualAttendance")
@Getter
@Setter
public class ManualAttendance extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 4203066031464310007L;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @JoinColumn(name = "MANAGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User manager;

    @JoinColumn(name = "BRANCH_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department branch;

    @Column(name = "DAY_")
    private LocalDate day;

    @Column(name = "HOURS")
    private Double hours;

    @JoinColumn(name = "ABSENT_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ManualAbsentReason absentReason;

    @Column(name = "MEMO")
    @Lob
    private String memo;
}