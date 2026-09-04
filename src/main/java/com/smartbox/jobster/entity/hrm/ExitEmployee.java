package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.entity.survey.Survey;
import com.smartbox.jobster.entity.survey.SurveyUser;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_EXIT_EMPLOYEE", indexes = {
        @Index(name = "IDX_JB_EXIT_EMPLOYEE_EMPLOYEE", columnList = "EMPLOYEE_ID"),
        @Index(name = "IDX_JB_EXIT_EMPLOYEE_INTERVIEWER", columnList = "INTERVIEWER_ID"),
        @Index(name = "IDX_JB_EXIT_EMPLOYEE_EXIT_REASON", columnList = "EXIT_REASON_ID"),
        @Index(name = "IDX_JB_EXIT_EMPLOYEE_MANAGER_SURVEY", columnList = "MANAGER_SURVEY_ID"),
        @Index(name = "IDX_JB_EXIT_EMPLOYEE_EMPLOYEE_SURVEY", columnList = "EMPLOYEE_SURVEY_ID"),
        @Index(name = "IDX_JB_EXIT_EMPLOYEE_SURVEY_USER", columnList = "SURVEY_USER_ID"),
        @Index(name = "IDX_EXITEMP_REJ_TMPL", columnList = "REJECT_TEMPLATE_ID")
})
@Entity(name = "jb_ExitEmployee")
@Getter
@Setter
public class ExitEmployee extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -7192505542650657275L;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @JoinColumn(name = "SURVEY_USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyUser surveyUser;

    @JoinColumn(name = "INTERVIEWER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee interviewer;

    @Column(name = "DATE_")
    private LocalDate date;

    @Column(name = "REFUSED")
    private Boolean refused;

    @JoinColumn(name = "EXIT_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ExitReason exitReason;

    @Column(name = "COMMENT_")
    @Lob
    private String comment;

    @JoinColumn(name = "MANAGER_SURVEY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Survey managerSurvey;

    @JoinColumn(name = "EMPLOYEE_SURVEY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Survey employeeSurvey;

    @JoinColumn(name = "REJECT_TEMPLATE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AutoFillTemplate rejectTemplate;
}