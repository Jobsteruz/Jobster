package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.core.SmartTenantEntity;
import com.smartbox.jobster.entity.tg.TgUser;
import com.smartbox.jobster.entity.whatsapp.WhatsappUser;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;

@JmixEntity(name = "jb_StandardQuestionnaireEntity")
@MappedSuperclass
@Getter
@Setter
public abstract class StandardQuestionnaireEntity extends SmartTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 7191237565258058266L;

    @JoinColumn(name = "QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questionnaire questionnaire;

    @Column(name = "UTM_SOURCE")
    private String utmSource;

    @Column(name = "UTM_PARAM")
    private String utmParam;

    @JoinColumn(name = "TG_USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TgUser tgUser;

    @JoinColumn(name = "WHATSAPP_USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private WhatsappUser whatsappUser;

    @Column(name = "COMPLETED")
    private Boolean completed;

    @Column(name = "FILL_DATE")
    private OffsetDateTime fillDate;
}