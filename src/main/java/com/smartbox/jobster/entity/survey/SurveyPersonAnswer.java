package com.smartbox.jobster.entity.survey;

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
@Table(name = "JB_SURVEY_PERSON_ANSWER", indexes = {
        @Index(name = "IDX_JB_SPA_PERSON_QUESTION", columnList = "SURVEY_PERSON_QUESTION_ID"),
        @Index(name = "IDX_JB_SPA_SURVEY_ANSWER", columnList = "SURVEY_ANSWER_ID")
})
@Entity(name = "jb_SurveyPersonAnswer")
@Getter
@Setter
public class SurveyPersonAnswer extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -1711212889235824995L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "SURVEY_PERSON_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyPersonQuestion surveyPersonQuestion;

    @JoinColumn(name = "SURVEY_ANSWER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyAnswer answer;

    @Column(name = "TYPED_ANSWER")
    @Lob
    private String typedAnswer;
}

