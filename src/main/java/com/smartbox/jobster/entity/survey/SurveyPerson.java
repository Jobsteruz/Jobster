package com.smartbox.jobster.entity.survey;

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
@Table(name = "JB_SURVEY_PERSON", indexes = {
        @Index(name = "IDX_JB_SURVEY_PERSON_SURVEY", columnList = "SURVEY_ID")
})
@Entity(name = "jb_SurveyPerson")
@Getter
@Setter
public class SurveyPerson extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -3103937114353349195L;

    @InstanceName
    @JoinColumn(name = "SURVEY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Survey survey;

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

    @Column(name = "MISSING_DAYS")
    private Integer missingDays;

    @Column(name = "COMPLETED")
    private Boolean completed;

    @Column(name = "PLATFORM")
    private String platform;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "surveyPerson")
    private List<SurveyPersonQuestion> personQuestions;

    public Platform getPlatform() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setPlatform(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

