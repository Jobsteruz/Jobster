package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_WORK_POSITION", indexes = {
        @Index(name = "IDX_JB_WORK_POSITION_VACANCY", columnList = "VACANCY_ID"),
        @Index(name = "IDX_JB_WORK_POSITION_APPLICANT", columnList = "APPLICANT_ID"),
        @Index(name = "IDX_JB_WORK_POSITION_APPLIED_BY", columnList = "APPLIED_BY_ID")
})
@Entity(name = "jb_WorkPosition")
@Getter
@Setter
public class WorkPosition extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -6683875434491990828L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "VACANCY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacancy vacancy;

    @JoinColumn(name = "APPLICANT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Applicant applicant;

    @Column(name = "APPLIED_DATE")
    private OffsetDateTime appliedDate;

    @JoinColumn(name = "APPLIED_BY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User appliedBy;
}