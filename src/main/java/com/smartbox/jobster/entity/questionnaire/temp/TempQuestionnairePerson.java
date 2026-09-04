package com.smartbox.jobster.entity.questionnaire.temp;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
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
@Table(name = "JB_TEMP_QUESTIONNAIRE_PERSON", indexes = {
        @Index(name = "IDX_JB_TEMP_QUESTIONNAIRE_PERSON_QUESTIONNAIRE", columnList = "TEMP_QUESTIONNAIRE_ID"),
        @Index(name = "IDX_JB_TEMP_QUESTIONNAIRE_PERSON_INTERVIEWER", columnList = "INTERVIEWER_ID")
})
@Entity(name = "jb_TempQuestionnairePerson")
@Getter
@Setter
public class TempQuestionnairePerson extends StandardTenantEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -8231249119152572334L;

    @InstanceName
    @JoinColumn(name = "TEMP_QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestionnaire tempQuestionnaire;

    @Column(name = "PERSON_ENTITY")
    private String personEntity;

    @Column(name = "PERSON_ID")
    private UUID personId;

    @JoinColumn(name = "INTERVIEWER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee interviewer;

    @Column(name = "START_DATE")
    private OffsetDateTime startDate;

    @Column(name = "END_DATE")
    private OffsetDateTime endDate;

    @Column(name = "FINISHED")
    private Boolean finished;

    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "tempQuestionnairePerson")
    private List<TempQuestionnairePersonAnswer> personAnswer;
}