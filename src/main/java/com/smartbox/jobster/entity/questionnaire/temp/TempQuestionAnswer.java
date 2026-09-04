package com.smartbox.jobster.entity.questionnaire.temp;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_TEMP_QUESTION_ANSWER", indexes = {
        @Index(name = "IDX_JB_TEMP_QUESTION_ANSWER_ENTITY_ID", columnList = "ENTITY_ID"),
        @Index(name = "IDX_JB_TEMP_QUESTION_ANSWER_QUESTION", columnList = "QUESTION_ID"),
        @Index(name = "IDX_JB_TEMP_QUESTION_ANSWER_ANSWER", columnList = "TEMP_ANSWER_ID")
})
@Entity(name = "jb_TempQuestionAnswer")
@Getter
@Setter
public class TempQuestionAnswer extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -5866418290736406361L;

    @Column(name = "ENTITY_NAME")
    private String entityName;

    @Column(name = "ENTITY_ID")
    private UUID entityId;

    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestion question;

    @JoinColumn(name = "TEMP_ANSWER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempAnswer selectedAnswer;

    @Column(name = "ANSWER")
    @Lob
    private String answer;

    @Column(name = "SCORE")
    private Integer score;
}