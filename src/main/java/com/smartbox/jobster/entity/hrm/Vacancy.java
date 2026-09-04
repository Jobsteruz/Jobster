package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Currency;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.entity.integration.hh.HHExperience;
import com.smartbox.jobster.entity.integration.hh.HHSchedule;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.entity.ref.Gender;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@JmixEntity
@Table(name = "JB_VACANCY", indexes = {
        @Index(name = "IDX_JB_VACANCY_REQUEST", columnList = "REQUEST_ID"),
        @Index(name = "IDX_JB_VACANCY_POSITION", columnList = "POSITION_ID"),
        @Index(name = "IDX_JB_VACANCY_DEPARTMENT", columnList = "DEPARTMENT_ID"),
        @Index(name = "IDX_JB_VACANCY_EDUCATION", columnList = "EDUCATION_ID"),
        @Index(name = "IDX_JB_VACANCY_EXPERIENCE", columnList = "EXPERIENCE_ID"),
        @Index(name = "IDX_JB_VACANCY_AUTHOR", columnList = "AUTHOR_ID"),
        @Index(name = "IDX_JB_VACANCY_VERIFIER", columnList = "VERIFIER_ID"),
        @Index(name = "IDX_JB_VACANCY_CONFIRMER", columnList = "CONFIRMER_ID"),
        @Index(name = "IDX_JB_VACANCY_RESPONSIBLE", columnList = "RESPONSIBLE_ID"),
        @Index(name = "IDX_JB_VACANCY_CLOSED_BY", columnList = "CLOSED_BY_ID"),
        @Index(name = "IDX_JB_VACANCY_FORM", columnList = "FORM_ID"),
        @Index(name = "IDX_JB_VACANCY_CANCEL_REASON", columnList = "CANCEL_REASON_ID"),
        @Index(name = "IDX_JB_VACANCY_REQUEST_TYPE", columnList = "REQUEST_TYPE_ID"),
        @Index(name = "IDX_JB_VACANCY_PERSON_GROUP", columnList = "PERSON_GROUP_ID"),
        @Index(name = "IDX_JB_VACANCY_SCHEDULE", columnList = "SCHEDULE_ID"),
        @Index(name = "IDX_JB_VACANCY_TENANT_STATE", columnList = "TENANT_ID, STATE, COMPLETED")
})
@Entity(name = "jb_Vacancy")
@Getter
@Setter
public class Vacancy extends StandardQuestionnaireEntity implements Serializable {
    private static final long serialVersionUID = -4301214456847534759L;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "REQUEST_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacancy request;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "POSITION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Position position;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "DEPARTMENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "EDUCATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Education education;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "EXPERIENCE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Experience experience;

    // Unlink on delete: a vacancy/request left pointing at a soft-deleted WorkSchedule cannot be
    // saved at all — the row is invisible to the soft-delete filter, so EclipseLink's existence
    // check calls it a new object and aborts the flush ("a new object was found through a
    // relationship that was not marked cascade PERSIST").
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "SCHEDULE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkSchedule schedule;

    @NumberFormat(pattern = "###,###,###,##0.00")
    @Column(name = "SALARY_MIN", precision = 19, scale = 2)
    private BigDecimal salaryMin;

    @NumberFormat(pattern = "###,###,###,##0.00")
    @Column(name = "SALARY_MAX", precision = 19, scale = 2)
    private BigDecimal salaryMax;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "CONDITION")
    @Lob
    private String condition;

    @Column(name = "REQUIREMENT")
    @Lob
    private String requirement;

    @Column(name = "SKILLS")
    @Lob
    private String skills;

    @Column(name = "RESPONSIBILITY")
    @Lob
    private String responsibility;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "AUTHOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User author;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "VERIFIER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User verifier;

    @Column(name = "VERIFIED_DATE")
    private OffsetDateTime verifiedDate;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "CONFIRMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User confirmer;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "RESPONSIBLE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User responsible;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "CLOSED_BY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User closedBy;

    @Column(name = "CLOSE_DATE")
    private OffsetDateTime closedDate;

    @Column(name = "WORKPLACE_QTY")
    private Integer workplaceQty = 1;

    @Column(name = "PRIORITY")
    private String priority = Priority.MEDIUM.getId();

    @Column(name = "HOT")
    private Boolean hot;

    @Column(name = "STATE")
    private String state;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "REQUIRED_DATE")
    private OffsetDateTime requiredDate;

    @Column(name = "EMPLOYMENT_TYPE")
    private String employmentType;

    @Column(name = "REQUEST_STATUS")
    private String requestStatus;

    @Column(name = "STATUS")
    private String status;

    @JoinColumn(name = "CANCEL_REASON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RequestCancelReason cancelReason;

    @Column(name = "CANCEL_COMMENT")
    @Lob
    private String cancelComment;

    @Column(name = "MANUAL_CLOSED")
    private Boolean manualClosed = Boolean.FALSE;

    @JoinColumn(name = "REQUEST_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RequestType requestType;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "PERSON_GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonGroup personGroup;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "MEMO")
    @Lob
    private String memo;

    @Column(name = "PROBATION")
    @Lob
    private String probation;

    @JoinColumn(name = "FORM_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire form;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "WHATS_APP")
    private Boolean whatsApp;

    @Column(name = "WEB")
    private Boolean web;

    @Column(name = "ISH_GO")
    private Boolean ishGO;

    @Column(name = "TELEGRAM_CHANNELS")
    private Boolean telegramChannels;

    @Column(name = "HH_EXPERIENCE")
    private String hhExperience;

    @Column(name = "HH_SCHEDULE")
    private String hhSchedule;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "vacancy")
    private List<VacancyLanguage> languages;

    public Boolean getManualClosed() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Priority getPriority() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPriority(Priority priority) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Currency getCurrency() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setCurrency(Currency currency) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public VacancyState getState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setState(VacancyState state) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Gender getGender() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setGender(Gender gender) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public EmploymentType getEmploymentType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setEmploymentType(EmploymentType employmentType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RequestStatus getRequestStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public VacancyStatus getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus(VacancyStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public VacancyType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(VacancyType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public HHSchedule getHhSchedule() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setHhSchedule(HHSchedule hhSchedule) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public HHExperience getHhExperience() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setHhExperience(HHExperience hhExperience) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"position", "code", "department"})
    public String getDisplayName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}