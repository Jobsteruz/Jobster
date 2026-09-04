package com.smartbox.jobster.entity.core;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_SEQUENCE")
@Entity(name = "jb_Sequence")
@Getter
@Setter
public class Sequence implements JbEntity<UUID>, Serializable {
    private static final long serialVersionUID = 1154722941228768418L;

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DOMAIN_")
    private String domain;

    @Column(name = "TENANT_ID")
    private String tenantId;

    @Column(name = "CURRENT_")
    private Long current = 0L;

    @Column(name = "MIN_")
    private Long min = 0L;

    @Column(name = "MAX_")
    private Long max = Long.MAX_VALUE;

    @Column(name = "INCREMENT_")
    private Long increment = 1L;

    @Column(name = "PREFIX")
    private String prefix;

    @Column(name = "SUFFIX")
    private String suffix;

    @Column(name = "LENGTH")
    private Integer length = 7;

    @InstanceName
    @DependsOnProperties({"domain", "tenantId"})
    public String getInstanceName(MetadataTools metadataTools) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
