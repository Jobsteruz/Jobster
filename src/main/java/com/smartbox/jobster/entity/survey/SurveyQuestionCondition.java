package com.smartbox.jobster.entity.survey;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SURVEY_QUESTION_CONDITION", indexes = {
        @Index(name = "IDX_JB_SURVEY_QUESTION_CONDITION_QUESTION", columnList = "QUESTION_ID"),
        @Index(name = "IDX_JB_SURVEY_QUESTION_CONDITION_CONDITION_QUESTION", columnList = "CONDITION_QUESTION_ID"),
        @Index(name = "IDX_JB_SURVEY_QUESTION_CONDITION_CONDITION_ANSWER", columnList = "CONDITION_ANSWER_ID")
})
@Entity(name = "jb_SurveyQuestionCondition")
@Getter
@Setter
public class SurveyQuestionCondition extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = -6724752057925207414L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyQuestion question;

    @JoinColumn(name = "CONDITION_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyQuestion conditionQuestion;

    @JoinColumn(name = "CONDITION_ANSWER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyAnswer conditionAnswer;
}