package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.User;
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
@Table(name = "JB_VACANCY_APPROVAL", indexes = {
        @Index(name = "IDX_JB_VACANCY_APPROVAL_VACANCY", columnList = "VACANCY_ID"),
        @Index(name = "IDX_JB_VACANCY_APPROVAL_APPROVER1", columnList = "APPROVER1_ID"),
        @Index(name = "IDX_JB_VACANCY_APPROVAL_CANCEL_REASON1", columnList = "CANCEL_REASON1_ID"),
        @Index(name = "IDX_JB_VACANCY_APPROVAL_APPROVER2", columnList = "APPROVER2_ID"),
        @Index(name = "IDX_JB_VACANCY_APPROVAL_CANCEL_REASON2", columnList = "CANCEL_REASON2_ID")
})
@Entity(name = "jb_VacancyApproval")
@Getter
@Setter
public class VacancyApproval extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -8720217686751985140L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "VACANCY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacancy vacancy;

    @JoinColumn(name = "APPROVER1_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User approver1;

    @Column(name = "STATUS1")
    private String status1;

    @JoinColumn(name = "CANCEL_REASON1_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RequestCancelReason cancelReason1;

    @Column(name = "DATE1")
    private OffsetDateTime date1;

    @JoinColumn(name = "APPROVER2_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User approver2;

    @Column(name = "STATUS2")
    private String status2;

    @JoinColumn(name = "CANCEL_REASON2_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RequestCancelReason cancelReason2;

    @Column(name = "DATE2")
    private OffsetDateTime date2;

    public RequestStatus getStatus2() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus2(RequestStatus status2) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public RequestStatus getStatus1() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus1(RequestStatus status1) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}