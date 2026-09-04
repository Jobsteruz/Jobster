package com.smartbox.jobster.entity.hrm;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_OFFER_USER", indexes = {
        @Index(name = "IDX_JB_OFFER_USER_OFFER_PERSON", columnList = "OFFER_PERSON_ID"),
        @Index(name = "IDX_JB_OFFER_USER_USER", columnList = "USER_ID")
})
@Entity(name = "jb_OfferUser")
@Getter
@Setter
public class OfferUser extends StandardOfferEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -9012512677083493300L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "OFFER_PERSON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Offer offerPerson;

    @InstanceName
    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee user;
}