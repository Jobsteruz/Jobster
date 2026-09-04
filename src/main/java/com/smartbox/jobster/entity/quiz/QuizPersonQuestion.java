package com.smartbox.jobster.entity.quiz;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

@JmixEntity
@Table(name = "JB_QUIZ_PERSON_QUESTION", indexes = {
        @Index(name = "IDX_JB_QUIZ_PERSON_QUESTION_QUIZ_PERSON", columnList = "QUIZ_PERSON_ID"),
        @Index(name = "IDX_JB_QUIZ_PERSON_QUESTION_QUESTION", columnList = "QUESTION_ID")
})
@Entity(name = "jb_QuizPersonQuestion")
@Getter
@Setter
public class QuizPersonQuestion extends StandardTenantEntity implements HasSort, Serializable {
    @Serial
    private static final long serialVersionUID = 8688170062810047361L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUIZ_PERSON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QuizPerson quizPerson;

    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private QuizQuestion question;

    @Column(name = "SCORE")
    private Integer score;

    // Question position within the attempt (1..N). Navigation must not rely on createdDate:
    // the whole batch is persisted in one flush, so audit timestamps collide at ms precision.
    @Column(name = "SORT")
    private Integer sort;

    @Column(name = "RESPONSE_TIME")
    private OffsetDateTime responseTime;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "personQuestion")
    private List<QuizPersonAnswer> personAnswers;

    public Integer getScore() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}