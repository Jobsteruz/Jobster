package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity
@Table(name = "JB_COMPANY_LIMIT", indexes = {
        @Index(name = "IDX_JB_COMPANY_LIMIT_COMPANY", columnList = "COMPANY_ID")
})
@Entity(name = "jb_CompanyLimit")
@Getter
@Setter
public class CompanyLimit extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -136501451472416332L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @NumberFormat(pattern = "#####")
    @Column(name = "EMAIL")
    private Integer email;

    @NumberFormat(pattern = "#####")
    @Column(name = "SMS")
    private Integer sms;

    @Column(name = "DATE_")
    private OffsetDateTime date;

    @Column(name = "MEMO", length = 1024)
    private String memo;

}