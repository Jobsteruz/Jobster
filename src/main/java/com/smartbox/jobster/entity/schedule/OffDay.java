package com.smartbox.jobster.entity.schedule;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_OFF_DAY", indexes = {
        @Index(name = "IDX_JB_OFF_DAY_SCHEDULE", columnList = "SCHEDULE_ID")
})
@Entity(name = "jb_OffDay")
@Getter
@Setter
public class OffDay extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -2966677575064252463L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "SCHEDULE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Schedule schedule;

    @InstanceName
    @Column(name = "DAY_")
    private LocalDate day;
}