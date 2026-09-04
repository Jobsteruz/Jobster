package com.smartbox.jobster.entity.hrm;

import com.smartbox.jobster.entity.ats.Currency;
import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_OFFER", indexes = {
        @Index(name = "IDX_JB_OFFER_OFFER_TYPE", columnList = "OFFER_TYPE_ID")
})
@Entity(name = "jb_Offer")
@Getter
@Setter
public class Offer extends StandardOfferEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1944494606883790755L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @InstanceName
    @Column(name = "REPORT", length = 1024)
    private FileRef report;

    @Column(name = "PERSON_NAME")
    private String personName;

    @Column(name = "CONTRACT_FORMAT")
    private String contractFormat;

    @JoinColumn(name = "OFFER_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private OfferType offerType;

    @Column(name = "ENTRY_DATE")
    private LocalDate entryDate;

    @Column(name = "PROBATION_PERIOD")
    private String probationPeriod;

    @Column(name = "PROBATION_SALARY", precision = 19, scale = 2)
    private BigDecimal probationSalary;

    @Column(name = "SALARY", precision = 19, scale = 2)
    private BigDecimal salary;

    @Column(name = "CURRENCY", length = 10)
    private String currency;

    @Column(name = "BONUS")
    private String bonus;

    @Column(name = "JOB_DESCRIPTION")
    @Lob
    private String jobDescription;

    @Column(name = "RELOCATION")
    @Lob
    private String relocation;

    // TRUE once the offer has been delivered to the candidate, so the approver-acceptance
    // trigger in OfferPersonController does not send it a second time (parallel-send flow).
    @Column(name = "SENT_TO_PERSON")
    private Boolean sentToPerson = Boolean.FALSE;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "offerPerson")
    private List<OfferUser> users;

    public ProbationPeriod getProbationPeriod() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setProbationPeriod(ProbationPeriod probationPeriod) {
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

    public Boolean getSentToPerson() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}