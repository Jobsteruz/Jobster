package com.smartbox.jobster.entity.quiz;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_QUIZ_PERSON_ANSWER", indexes = {
        @Index(name = "IDX_JB_QUIZ_PERSON_ANSWER_QUIZ_PERSON_QUESTION", columnList = "QUIZ_PERSON_QUESTION_ID"),
        @Index(name = "IDX_JB_QUIZ_PERSON_ANSWER_QUIZ_QUESTION", columnList = "QUIZ_QUESTION_ID"),
        @Index(name = "IDX_JB_QUIZ_PERSON_ANSWER_QUIZ_ANSWER", columnList = "QUIZ_ANSWER_ID")
})
@Entity(name = "jb_QuizPersonAnswer")
@Getter
@Setter
public class QuizPersonAnswer extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -1711212889235824994L;

    @JoinColumn(name = "QUIZ_PERSON_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QuizPersonQuestion personQuestion;

    @JoinColumn(name = "QUIZ_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QuizQuestion question;

    @JoinColumn(name = "QUIZ_ANSWER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QuizAnswer answer;
}