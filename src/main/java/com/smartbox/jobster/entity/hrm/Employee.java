package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.Passport;
import com.smartbox.jobster.entity.ref.SalaryLevel;
import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.Secret;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import com.smartbox.jobster.$;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.*;
import java.util.stream.Collectors;

@JmixEntity
@Table(name = "JB_EMPLOYEE", indexes = {
        @Index(name = "IDX_JB_EMPLOYEE_USER", columnList = "USER_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_POSITION", columnList = "POSITION_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_ROLE_TYPE", columnList = "ROLE_TYPE_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_EXPERIENCE", columnList = "EXPERIENCE_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_EDUCATION", columnList = "EDUCATION_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_SALARY_LEVEL", columnList = "SALARY_LEVEL_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_WORK_SCHEDULE", columnList = "WORK_SCHEDULE_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_APPLICANT", columnList = "APPLICANT_ID"),
        @Index(name = "IDX_JB_EMPLOYEE_COMPLETED", columnList = "COMPLETED"),
        @Index(name = "IDX_JB_EMPLOYEE_FILL_DATE", columnList = "FILL_DATE"),
        @Index(name = "IDX_JB_EMPLOYEE_PHONE", columnList = "PHONE"),
        @Index(name = "IDX_JB_EMPLOYEE_EMAIL", columnList = "EMAIL")
})
@Entity(name = "jb_Employee")
@Getter
@Setter
public class Employee extends Passport implements Serializable {
    @Serial
    private static final long serialVersionUID = 4863502206113572386L;

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "ACTIVE")
    private Boolean active = true;

    @JoinColumn(name = "POSITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Position position;

    @JoinColumn(name = "EXPERIENCE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Experience experience;

    @JoinColumn(name = "EDUCATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Education education;

    // Unlink on delete, same reason as Vacancy.schedule. Deliberately NOT applied to
    // Applicant.workSchedule: Jmix's UNLINK loads every referencing row into the persistence
    // context one by one, and a single schedule is referenced by up to ~54k applicants.
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "WORK_SCHEDULE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkSchedule workSchedule;

    @JoinColumn(name = "SALARY_LEVEL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SalaryLevel salaryLevel;

    @NumberFormat(pattern = "###,###,###,##0.00")
    @Column(name = "SALARY", precision = 19, scale = 2)
    private BigDecimal salary;

    @NumberFormat(pattern = "###,###,###,##0.00")
    @Column(name = "SALARY_BONUS", precision = 19, scale = 2)
    private BigDecimal salaryBonus;

    @Secret
    @Column(name = "RFID")
    private String rfid;

    @JoinColumn(name = "ROLE_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleType roleType;

    @Column(name = "DEFAULT2STEP")
    private String default2step;

    @Column(name = "STATE")
    private String state;

    @Secret
    @Column(name = "STAFF_NUMBER")
    private String staffNumber;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("department")
    @OneToMany(mappedBy = "employee")
    private List<StaffingTable> staffingTables;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("date")
    @OneToMany(mappedBy = "employee")
    private List<ExitEmployee> exits;

    @JoinColumn(name = "APPLICANT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Applicant applicant;

    @Column(name = "DATE_EMPLOYMENT")
    private LocalDate dateEmployment;

    /**
     * The day the hire is actually expected on the floor, as opposed to {@link #dateEmployment},
     * the day the hire was recorded. Filled from the hire dialog when the hiring stage asks for it
     * (see {@code KanbanStage.enableStartWorkDate}); left null everywhere else.
     */
    @Column(name = "DATE_START_WORK")
    private LocalDate dateStartWork;

    @Column(name = "CHECK_IN")
    private OffsetTime checkIn;

    @Column(name = "CHECK_OUT")
    private OffsetTime checkOut;

    @Column(name = "AUTO_CHECK_OUT")
    private Boolean autoCheckOut = false;

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

    public Set<Platform> getDefault2step() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDefault2step(Set<Platform> platforms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EmployeeState getState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setState(EmployeeState state) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
