package com.smartbox.jobster.entity.quiz;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_QUIZ_ANSWER", indexes = {
        @Index(name = "IDX_JB_QUIZ_ANSWER_QUIZ", columnList = "QUIZ_ID"),
        @Index(name = "IDX_JB_QUIZ_ANSWER_QUESTION", columnList = "QUESTION_ID")
})
@Entity(name = "jb_QuizAnswer")
@Getter
@Setter
public class QuizAnswer extends StandardTenantEntity implements HasSort, Serializable {
    @Serial
    private static final long serialVersionUID = 3472283679572709327L;

    @JoinColumn(name = "QUIZ_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Quiz quiz;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QuizQuestion question;

    @InstanceName
    @Column(name = "ANSWER")
    @Lob
    private String answer;

    @Column(name = "SCORE")
    private Integer score = 0;

    @Column(name = "SORT")
    private Integer sort;
}