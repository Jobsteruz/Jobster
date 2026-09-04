package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity(name = "jb_PersonHistory")
@MappedSuperclass
@Getter
@Setter
public abstract class PersonHistory extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -7579417539997887552L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @InstanceName
    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    @Lob
    private String description;

    @Column(name = "FROM_")
    private OffsetDateTime from;

    @Column(name = "TO_")
    private OffsetDateTime to;
}