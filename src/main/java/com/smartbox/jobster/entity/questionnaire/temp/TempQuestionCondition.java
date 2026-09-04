package com.smartbox.jobster.entity.questionnaire.temp;

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
@Table(name = "JB_TEMP_QUESTION_CONDITION", indexes = {
        @Index(name = "IDX_JB_TEMP_QUESTION_CONDITION_QUESTION", columnList = "TEMP_QUESTION_ID"),
        @Index(name = "IDX_JB_TEMP_QUESTION_CONDITION_CONDITION_QUESTION", columnList = "CONDITION_QUESTION_ID")
})
@Entity(name = "jb_TempQuestionCondition")
@Getter
@Setter
public class TempQuestionCondition extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 2708909926054190287L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "TEMP_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestion question;

    @JoinColumn(name = "CONDITION_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestion conditionQuestion;

    @Column(name = "CONDITION_")
    @Lob
    private String condition;

    @Column(name = "SKIPPED")
    private Boolean skipped;
}