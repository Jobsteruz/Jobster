package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.EmailProvider;
import com.smartbox.jobster.entity.core.StandardEntity;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_COMPANY_EMAIL")
@Entity(name = "jb_CompanyEmail")
@Setter
@Getter
public class CompanyEmail extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -4973469902591930898L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @Column(name = "GATEWAY")
    private EmailProvider provider;
}