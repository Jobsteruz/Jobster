package com.smartbox.jobster.entity.company;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.FileRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_COMPANY_DETAIL", indexes = {
        @Index(name = "IDX_JB_COMPANY_DETAIL_COMPANY", columnList = "COMPANY_ID")
})
@Entity(name = "jb_CompanyDetail")
@Getter
@Setter
public class CompanyDetail extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 4823409162635309747L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @InstanceName
    @Column(name = "INN")
    private String inn;

    @Column(name = "INN_2")
    private String inn2;

    @Column(name = "INN_3")
    private String inn3;

    @Column(name = "INN_NAME")
    private String innName;

    @Column(name = "INN_LOGO", length = 1024)
    private FileRef innLogo;

    @Column(name = "INN_2_NAME")
    private String inn2Name;

    @Column(name = "INN_2_LOGO", length = 1024)
    private FileRef inn2Logo;

    @Column(name = "INN_3_NAME")
    private String inn3Name;

    @Column(name = "INN_3_LOGO", length = 1024)
    private FileRef inn3Logo;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "INFO", length = 1024)
    private String info;

}
