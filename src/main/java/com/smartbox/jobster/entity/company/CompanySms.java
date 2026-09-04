package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_COMPANY_SMS", indexes = {
        @Index(name = "IDX_JB_COMPANY_SMS_COMPANY", columnList = "COMPANY_ID")
})
@Entity(name = "jb_CompanySms")
@Getter
@Setter
public class CompanySms extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 2779838576393456338L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @Column(name = "GATEWAY")
    private String gateway;

    @Column(name = "PHONE_CODE")
    private String phoneCode;
}