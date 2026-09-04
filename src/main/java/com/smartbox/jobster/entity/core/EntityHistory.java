package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.entity.hrm.Employee;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_ENTITY_HISTORY", indexes = {
        @Index(name = "IDX_JB_ENTITY_HISTORY_EMPLOYEE", columnList = "EMPLOYEE_ID")
})
@Entity(name = "jb_EntityHistory")
@Getter
@Setter
public class EntityHistory extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 944658189381573159L;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @Column(name = "ENTITY_FIELD")
    private String entityField;

    @Column(name = "OLD_VALUE")
    @Lob
    private String oldValue;

    @Column(name = "VALUE_")
    @Lob
    private String value;

    @JoinColumn(name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @Column(name = "DATE_")
    private OffsetDateTime date;
}