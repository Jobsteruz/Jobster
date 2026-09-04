package com.smartbox.jobster.entity.vision;

import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_MANUAL_ATTEND_CONFIG", indexes = {
        @Index(name = "IDX_JB_MANUAL_ATTEND_CONFIG_BRANCH_TYPE", columnList = "BRANCH_TYPE_ID")
})
@Entity(name = "jb_ManualAttendConfig")
@Getter
@Setter
public class ManualAttendConfig extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -7014500401136565004L;

    @InstanceName
    @JoinColumn(name = "BRANCH_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private BranchType branchType;

    @Column(name = "DEFAULT_HOURS")
    private Double defaultHours;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OrderBy("day")
    @OneToMany(mappedBy = "config")
    private List<ManualAttendRestDay> restDays;
}