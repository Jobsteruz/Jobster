package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbTenantEntity;
import io.jmix.core.FileRef;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.ReplaceEntity;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;
import io.jmix.multitenancy.entity.Tenant;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

@ReplaceEntity(Tenant.class)
@DiscriminatorValue("C")
@JmixEntity
@Entity(name = "jb_Company")
@Getter
@Setter
public class Company extends Tenant implements JbTenantEntity<UUID>, HasName, HasName.HasShortName, Serializable {
    private static final long serialVersionUID = -5021395172517219300L;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "LOGO_LIGHT", length = 1024)
    private FileRef logoLight;

    @Column(name = "LOGO_DARK", length = 1024)
    private FileRef logoDark;

    @Column(name = "LOGO_USER", length = 1024)
    private FileRef logoUser;

    @JoinColumn(name = "ADMIN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User admin;

    @JoinColumn(name = "ROBOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User robot;

    @NumberFormat(pattern = "#####")
    @Column(name = "PAID_EMAIL")
    private Integer paidEmail;

    @NumberFormat(pattern = "#####")
    @Column(name = "PAID_SMS")
    private Integer paidSms;

    @Column(name = "MONTHLY_SMS_LIMIT")
    private Integer monthlySmsLimit;

    @Column(name = "MONTHLY_EMAIL_LIMIT")
    private Integer monthlyEmailLimit;

    @Column(name = "description")
    @Lob
    private String description;

    @Column(name = "UNPAID_MONTHS")
    private String unpaidMonths;

    public Set<Month> getUnpaidMonths() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setUnpaidMonths(Set<Month> months) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CompanyStatus getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setStatus(CompanyStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Integer getPaidEmail() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public Integer getPaidSms() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @InstanceName
    @DependsOnProperties({"name"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
