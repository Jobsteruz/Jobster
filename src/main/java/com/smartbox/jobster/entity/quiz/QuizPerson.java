package com.smartbox.jobster.entity.quiz;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "JB_QUIZ_PERSON", indexes = {
        @Index(name = "IDX_JB_QUIZ_PERSON_QUIZ", columnList = "QUIZ_ID")
})
@Entity(name = "jb_QuizPerson")
@Getter
@Setter
public class QuizPerson extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -3103937114353349194L;

    @InstanceName
    @JoinColumn(name = "QUIZ_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Quiz quiz;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @Column(name = "SEND_DATE")
    private OffsetDateTime sendDate;

    @Column(name = "START_DATE")
    private OffsetDateTime startDate;

    @Column(name = "END_DATE")
    private OffsetDateTime endDate;

    @Column(name = "TIME_LIMIT")
    private OffsetDateTime timeLimit;

    @Column(name = "FINISHED")
    private Boolean finished;

    @Column(name = "SCORE")
    private Double score;

    @Column(name = "PLATFORM")
    private String platform;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "quizPerson")
    @OrderBy("sort, createdDate")
    private List<QuizPersonQuestion> personQuestions;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}