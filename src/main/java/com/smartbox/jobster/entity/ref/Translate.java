package com.smartbox.jobster.entity.ref;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_TRANSLATE", indexes = {
        @Index(name = "IDX_JB_TRANSLATE_ENTITY_ID", columnList = "ENTITY_ID"),
        @Index(name = "IDX_JB_TRANSLATE_ENTITY_FIELD", columnList = "ENTITY_FIELD"),
        @Index(name = "IDX_JB_TRANSLATE_LOOKUP", columnList = "ENTITY_ID, ENTITY_FIELD, LOCALE, TENANT_ID")
})
@Entity(name = "jb_Translate")
@Getter
@Setter
public class Translate extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -7384326425067755244L;

    @Column(name = "ENTITY_CLASS")
    private String entityClass;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @Column(name = "ENTITY_FIELD", length = 1024)
    private String entityField;

    @Column(name = "SOURCE")
    @Lob
    private String source;

    @InstanceName
    @Column(name = "TRANSLATED")
    @Lob
    private String translated;

    @Column(name = "LOCALE")
    private String locale;
}