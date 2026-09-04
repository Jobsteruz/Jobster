package com.smartbox.jobster.entity.ai;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
@JmixEntity
@Table(name = "JB_AI_CALL_QUESTION")
@Entity(name = "jb_AiCallQuestion")
public class AiCallQuestion extends StandardTenantEntity implements Serializable {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AI_CALL_ID", nullable = false)
    private AiCall aiCall;

    @Column(name = "QUESTION_ID")
    private Integer questionId;

    @Column(name = "EXTERNAL_ID")
    private Integer externalId;

    @Lob
    @Column(name = "QUESTION_TEXT")
    private String question;

    @Lob
    @Column(name = "EXPECTED_ANSWERS_JSON")
    private String expectedAnswersJson;

    @Lob
    @Column(name = "CONDITIONS_JSON")
    private String conditionsJson;

    @Lob
    @Column(name = "ANSWER_TEXT")
    private String answer;

    public UUID getId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setId(UUID id) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}