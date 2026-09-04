package com.smartbox.jobster.entity.core;

import com.smartbox.jobster.entity.ref.Language;
import com.smartbox.jobster.entity.ref.LanguageLevel;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_PERSON_LANGUAGE", indexes = {
        @Index(name = "IDX_JB_PERSON_LANGUAGE_LANGUAGE", columnList = "LANGUAGE_ID")
})
@Entity(name = "jb_PersonLanguage")
@Getter
@Setter
public class PersonLanguage extends StandardTenantEntity implements Serializable {
    private static final long serialVersionUID = 5483545011184579775L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @JoinColumn(name = "LANGUAGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Language language;

    @Column(name = "LEVEL_")
    private String level;

    public LanguageLevel getLevel() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setLevel(LanguageLevel level) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}