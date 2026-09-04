package com.smartbox.jobster.entity.zpcast;

import com.smartbox.jobster.entity.core.SmartTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@JmixEntity
@Table(name = "JB_SALARY_INFO")
@Entity(name = "jb_SalaryInfo")
@Getter
@Setter
public class SalaryInfo extends SmartTenantEntity implements Serializable {

    private static final long serialVersionUID = 2096146487486270357L;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TG_TEMPLATE_ID")
    private Template tgTemplate;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEMPLATE_SMS_ID")
    protected Template templateSms;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEMPLATE_EMAIL_ID")
    protected Template templateEmail;

    @NumberFormat(pattern = "###")
    @Column(name = "YEAR_")
    private Integer year;

    @NumberFormat(pattern = "###")
    @Column(name = "MONTH_")
    private Integer month;

    @Column(name = "ACTIVE")
    protected Boolean active = Boolean.TRUE;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "salaryInfo")
    protected List<SalaryData> salaries;

    @InstanceName
    @DependsOnProperties({"year", "month"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transient
    public String monthString() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}