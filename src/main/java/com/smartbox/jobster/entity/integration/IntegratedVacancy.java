package com.smartbox.jobster.entity.integration;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_INTEGRATED_VACANCY", indexes = {
        @Index(name = "IDX_JB_INTEGRATED_VACANCY_VACANCY", columnList = "VACANCY_ID")
})
@Entity(name = "jb_IntegratedVacancy")
@Getter
@Setter
public class IntegratedVacancy extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -7464481332020674937L;

    @Column(name = "PLATFORM")
    private String platform;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "VACANCY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Vacancy vacancy;

    @InstanceName
    @Column(name = "INTEGRATION_ID", length = 512)
    private String integrationId;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}