package com.smartbox.jobster.entity.core;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity(name = "jb_CoreEntity")
@MappedSuperclass
@Getter
@Setter
public abstract class CoreEntity implements JbEntity<UUID>, Serializable {
    @Serial
    private static final long serialVersionUID = -635170755447690849L;

    @JmixGeneratedValue
    @Column(name = "ID")
    @Id
    protected UUID id;
}
