package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.ats.Label;
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
@Table(name = "JB_QUESTIONNAIRE_ENTITY_LABEL", indexes = {
        @Index(name = "IDX_JB_QUESTIONNAIRE_ENTITY_LABEL_ENTITY_ID", columnList = "ENTITY_ID"),
        @Index(name = "IDX_JB_QUESTIONNAIRE_ENTITY_LABEL_LABEL", columnList = "LABEL_ID")
})
@Entity(name = "jb_QuestionnaireEntityLabel")
@Getter
@Setter
public class QuestionnaireEntityLabel extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 112275359812869259L;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @JoinColumn(name = "LABEL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Label label;

    @InstanceName
    public String getInstanceName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}