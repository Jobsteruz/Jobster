package com.smartbox.jobster.entity.questionnaire;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_QUESTION_CONDITION", indexes = {
        @Index(name = "IDX_JB_QUESTION_CONDITION_QUESTION", columnList = "QUESTION_ID"),
        @Index(name = "IDX_JB_QUESTION_CONDITION_CONDITION_QUESTION", columnList = "CONDITION_QUESTION_ID")
})
@Entity(name = "jb_QuestionCondition")
@Getter
@Setter
public class QuestionCondition extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 2829862468894211772L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

    @JoinColumn(name = "CONDITION_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Question conditionQuestion;

    @Column(name = "CONDITION_ENTITY_FIELD")
    private String conditionEntityField;

    @Column(name = "CONDITION_")
    @Lob
    private String condition;

    @Column(name = "SKIPPED")
    private Boolean skipped;

    @Column(name = "IS_OR")
    private Boolean isOr;

    public Boolean getOr() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}