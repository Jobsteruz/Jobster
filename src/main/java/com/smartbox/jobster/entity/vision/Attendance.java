package com.smartbox.jobster.entity.vision;

import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_ATTENDANCE", indexes = {
        @Index(name = "IDX_JB_ATTENDANCE_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_ATTENDANCE_DEPARTMENT", columnList = "DEPARTMENT_ID")
})
@Entity(name = "jb_Attendance")
@Getter
@Setter
public class Attendance extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -602560793569437634L;

    @Column(name = "TYPE_")
    private Integer type;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @Column(name = "TIME_")
    private OffsetDateTime time;

    @Column(name = "SIMILARITY_SCORE")
    private Float similarityScore;

    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @Column(name = "BY_RFID")
    private Boolean byRfid;

    @Column(name = "OVERTIME")
    private Boolean overtime;

    @Column(name = "AUTO")
    private Boolean auto = Boolean.FALSE;

    @Column(name = "OVERTIME_REASON")
    @Lob
    private String overtimeReason;
}