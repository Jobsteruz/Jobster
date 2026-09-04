package com.smartbox.jobster.entity.ats;

import com.smartbox.jobster.entity.core.Passport;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.ref.RefSource;
import com.smartbox.jobster.entity.ref.SalaryLevel;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_APPLICANT", indexes = {
        @Index(name = "IDX_JB_APPLICANT_EDUCATION", columnList = "EDUCATION_ID"),
        @Index(name = "IDX_JB_APPLICANT_EXPERIENCE", columnList = "EXPERIENCE_ID"),
        @Index(name = "IDX_JB_APPLICANT_CANDIDATE", columnList = "CANDIDATE_ID"),
        @Index(name = "IDX_JB_APPLICANT_VACANCY", columnList = "VACANCY_ID"),
        @Index(name = "IDX_JB_APPLICANT_RESPONSIBLE", columnList = "RESPONSIBLE_ID"),
        @Index(name = "IDX_JB_APPLICANT_SALARY_LEVEL", columnList = "SALARY_LEVEL_ID"),
        @Index(name = "IDX_JB_APPLICANT_WORK_SCHEDULE", columnList = "WORK_SCHEDULE_ID"),
        @Index(name = "IDX_JB_APPLICANT_SOURCE", columnList = "SOURCE_ID"),
        @Index(name = "IDX_JB_APPLICANT_OFFERED_POSITION", columnList = "OFFERED_POSITION_ID"),
        @Index(name = "IDX_JB_APPLICANT_COMPLETED", columnList = "COMPLETED"),
        @Index(name = "IDX_JB_APPLICANT_FILL_DATE", columnList = "FILL_DATE"),
        @Index(name = "IDX_JB_APPLICANT_COMPLETED_FILL_DATE", columnList = "COMPLETED, FILL_DATE"),
        @Index(name = "IDX_JB_APPLICANT_TENANT_COMPLETED", columnList = "TENANT_ID, COMPLETED, CATEGORY_ID"),
        @Index(name = "IDX_JB_APPLICANT_TG_USER", columnList = "TG_USER_ID"),
        @Index(name = "IDX_JB_APPLICANT_PHONE", columnList = "PHONE"),
        @Index(name = "IDX_JB_APPLICANT_EMAIL", columnList = "EMAIL")
})
@Entity(name = "jb_Applicant")
@Getter
@Setter
public class Applicant extends Passport implements Serializable {
    private static final long serialVersionUID = -6667110930456072883L;

    @JoinColumn(name = "CANDIDATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Candidate candidate;

    @JoinColumn(name = "OFFERED_POSITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Position offeredPosition;

    @JoinColumn(name = "VACANCY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacancy vacancy;

    @JoinColumn(name = "RESPONSIBLE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee responsible;

    //current education level (ex: bachelor)
    @JoinColumn(name = "EDUCATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Education education;

    //current experience level (ex: 2-years)
    @JoinColumn(name = "EXPERIENCE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Experience experience;

    @JoinColumn(name = "SALARY_LEVEL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SalaryLevel salaryLevel;

    @Column(name = "SALARY")
    private String salary;

    @JoinColumn(name = "WORK_SCHEDULE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkSchedule workSchedule;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "PLATFORM_ID")
    private String platformId;

    @Column(name = "HH_RESUME_ID")
    private String hhResumeId;

    @JoinColumn(name = "SOURCE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RefSource source;

    @Column(name = "EMPLOYEE_OR_NOT")
    private Boolean employeeOrNot = Boolean.FALSE;

    @Column(name = "RESUME_SHARE_ID")
    private String resumeShareId;

    @Transient
    @JmixProperty
    private LocalDate dateEmployment;

    @Transient
    @JmixProperty
    private CancelReason cancelReason;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}