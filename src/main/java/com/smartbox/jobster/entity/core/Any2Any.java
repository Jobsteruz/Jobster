package com.smartbox.jobster.entity.core;

import io.jmix.core.annotation.TenantId;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_ANY2_ANY", indexes = {
        @Index(name = "IDX_JB_ANY2_ANY_LEFT", columnList = "LEFT_ENTITY_CLASS, LEFT_ENTITY_ID, TENANT_ID"),
        @Index(name = "IDX_JB_ANY2_ANY_RIGHT", columnList = "RIGHT_ENTITY_CLASS, RIGHT_ENTITY_ID, TENANT_ID"),
        @Index(name = "IDX_JB_ANY2_ANY_TENANT", columnList = "TENANT_ID")
})
@Entity(name = "jb_Any2Any")
@Getter
@Setter
public class Any2Any implements Serializable {
    private static final long serialVersionUID = 6379326758811122799L;

    @InstanceName
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @TenantId
    @Column(name = "TENANT_ID")
    private String tenantId;

    @Column(name = "LEFT_ENTITY_CLASS")
    private String leftEntityClass;

    @Column(name = "LEFT_ENTITY_ID")
    private UUID leftEntityId;

    @Column(name = "RIGHT_ENTITY_CLASS")
    private String rightEntityClass;

    @Column(name = "RIGHT_ENTITY_ID")
    private UUID rightEntityId;

}
