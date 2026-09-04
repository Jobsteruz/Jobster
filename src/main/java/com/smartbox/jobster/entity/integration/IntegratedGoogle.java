package com.smartbox.jobster.entity.integration;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.mapping.EntityMapping;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_INTEGRATED_GOOGLE", indexes = {
        @Index(name = "IDX_JB_INTEGRATED_GOOGLE_USER", columnList = "USER_ID"),
        @Index(name = "IDX_JB_INTEGRATED_GOOGLE_SHEET_MAPPING", columnList = "SHEET_MAPPING_ID")
})
@Entity(name = "jb_IntegratedGoogle")
@Getter
@Setter
public class IntegratedGoogle extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 1644909425495549590L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private IntegratedUser user;

    @Column(name = "SHEET_ID")
    private String sheetId;

    @Column(name = "SHEET_RANGE")
    private String sheetRange;

    @JoinColumn(name = "SHEET_MAPPING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntityMapping sheetMapping;
}