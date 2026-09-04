package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Locale;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_SECOND_QUESTIONNAIRE")
@Entity(name = "jb_SecondQuestionnaire")
@Getter
@Setter
public class SecondQuestionnaire extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -8827253590415058901L;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @Column(name = "STATUS")
    private Boolean status = Boolean.FALSE;

    @Column(name = "PLATFORM")
    private String platform;

    @JoinColumn(name = "FORM_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire form;

    @Column(name = "LOCALE")
    private String locale;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Boolean getStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}