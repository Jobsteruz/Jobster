package com.smartbox.jobster.entity.report;

import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_REPORT_ROLE", indexes = {
        @Index(name = "IDX_JB_REPORT_ROLE_REPORT_GROUP", columnList = "REPORT_GROUP_ID"),
        @Index(name = "IDX_JB_REPORT_ROLE_REPORT_VIEW", columnList = "REPORT_VIEW_ID"),
        @Index(name = "IDX_JB_REPORT_ROLE_ROLE_TYPE", columnList = "ROLE_TYPE_ID")
})
@Entity(name = "jb_ReportRole")
@Getter
@Setter
public class ReportRole extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 4723179084860294167L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "REPORT_GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ReportGroup reportGroup;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "REPORT_VIEW_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ReportView reportView;

    @JoinColumn(name = "ROLE_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoleType roleType;
}