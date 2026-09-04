package com.smartbox.jobster.entity.questionnaire.temp;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_TEMP_QUESTIONNAIRE_PERSON_ANSWER", indexes = {
        @Index(name = "IDX_JB_TEMP_QUESTIONNAIRE_PERSON_ANSWER_QUESTIONNAIRE_PERSON", columnList = "TEMP_QUESTIONNAIRE_PERSON_ID"),
        @Index(name = "IDX_JB_TEMP_QUESTIONNAIRE_PERSON_ANSWER_QUESTION", columnList = "QUESTION_ID"),
        @Index(name = "IDX_JB_TEMP_QUESTIONNAIRE_PERSON_ANSWER_ANSWER", columnList = "ANSWER_ID")
})
@Entity(name = "jb_TempQuestionnairePersonAnswer")
@Getter
@Setter
public class TempQuestionnairePersonAnswer extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 6262800281143178633L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEMP_QUESTIONNAIRE_PERSON_ID")
    private TempQuestionnairePerson tempQuestionnairePerson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QUESTION_ID")
    private TempQuestion question;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANSWER_ID")
    private TempAnswer answer;

    @Column(name = "TEXT_ANSWER", columnDefinition = "TEXT")
    private String textAnswer;

    @Column(name = "SCORE")
    private Integer score;
}