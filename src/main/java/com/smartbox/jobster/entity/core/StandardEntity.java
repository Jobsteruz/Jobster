package com.smartbox.jobster.entity.core;

import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity(name = "jb_StandardEntity")
@MappedSuperclass
@Getter
@Setter
public abstract class StandardEntity extends CoreEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 3119482596495269716L;

    @CreatedBy
    @Column(name = "CREATED_BY")
    protected String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    protected OffsetDateTime createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    protected String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    protected OffsetDateTime lastModifiedDate;

    @DeletedBy
    @Column(name = "DELETED_BY")
    protected String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    protected OffsetDateTime deletedDate;

}
