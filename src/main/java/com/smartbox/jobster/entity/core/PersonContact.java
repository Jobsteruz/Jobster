package com.smartbox.jobster.entity.core;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_PERSON_CONTACT")
@Entity(name = "jb_PersonContact")
@Getter
@Setter
public class PersonContact extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = -14481709494436215L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @Column(name = "TYPE_")
    private String type;

    @Column(name = "CONTACT")
    private String contact;

    public ContactType getType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setType(ContactType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}