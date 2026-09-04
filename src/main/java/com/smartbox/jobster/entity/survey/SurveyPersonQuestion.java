package com.smartbox.jobster.entity.survey;

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
@Table(name = "JB_SURVEY_PERSON_QUESTION", indexes = {
        @Index(name = "IDX_JB_SPQ_SURVEY_PERSON", columnList = "SURVEY_PERSON_ID"),
        @Index(name = "IDX_JB_SPQ_QUESTION", columnList = "QUESTION_ID")
})
@Entity(name = "jb_SurveyPersonQuestion")
@Getter
@Setter
public class SurveyPersonQuestion extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 8688170062810047362L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "SURVEY_PERSON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyPerson surveyPerson;

    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyQuestion question;

    @Column(name = "RESPONSE_TIME")
    private OffsetDateTime responseTime;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "surveyPersonQuestion")
    private List<SurveyPersonAnswer> personAnswers;
}
