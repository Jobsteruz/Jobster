package com.smartbox.jobster.entity.vision;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@JmixEntity
@Table(name = "JB_MANUAL_ATTEND_REST_DAY", indexes = {
        @Index(name = "IDX_JB_MANUAL_ATTEND_REST_DAY_CONFIG", columnList = "CONFIG_ID")
})
@Entity(name = "jb_ManualAttendRestDay")
@Getter
@Setter
public class ManualAttendRestDay extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 8382861309475967328L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "CONFIG_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ManualAttendConfig config;

    @Column(name = "DAY_")
    private LocalDate day;

    @Column(name = "MEMO")
    @Lob
    private String memo;
}