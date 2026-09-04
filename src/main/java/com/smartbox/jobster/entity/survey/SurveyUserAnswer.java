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
@Table(name = "JB_SURVEY_USER_ANSWER", indexes = {
        @Index(name = "IDX_JB_SURVEY_USER_ANSWER_SURVEY", columnList = "SURVEY_ID"),
        @Index(name = "IDX_JB_SURVEY_USER_ANSWER_USER", columnList = "USER_ID"),
        @Index(name = "IDX_JB_SURVEY_USER_ANSWER_QUESTION", columnList = "QUESTION_ID"),
        @Index(name = "IDX_JB_SURVEY_USER_ANSWER_ANSWER", columnList = "ANSWER_ID")
})
@Entity(name = "jb_SurveyUserAnswer")
@Getter
@Setter
public class SurveyUserAnswer extends StandardTenantEntity implements Serializable {

    private static final long serialVersionUID = 8067971468264799185L;

    @JoinColumn(name = "SURVEY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Survey survey;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyUser user;

    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyQuestion question;

    @JoinColumn(name = "ANSWER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyAnswer answer;

    @Column(name = "TYPED_ANSWER")
    @Lob
    private String typedAnswer;
}