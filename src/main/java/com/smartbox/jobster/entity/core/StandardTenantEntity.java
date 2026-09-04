package com.smartbox.jobster.entity.core;

import io.jmix.core.annotation.TenantId;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity(name = "jb_StandardTenantEntity")
@MappedSuperclass
@Getter
@Setter
public abstract class StandardTenantEntity extends StandardEntity implements JbTenantEntity<UUID>, Serializable {
    @Serial
    private static final long serialVersionUID = -2072330864654177431L;

    @TenantId
    @Column(name = "TENANT_ID")
    protected String tenantId;
}
