package com.smartbox.jobster.entity.survey;

import com.smartbox.jobster.entity.core.HasSort;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SURVEY_ANSWER", indexes = {
        @Index(name = "IDX_JB_SURVEY_ANSWER_SURVEY", columnList = "SURVEY_ID"),
        @Index(name = "IDX_JB_SURVEY_ANSWER_QUESTION", columnList = "QUESTION_ID")
})
@Entity(name = "jb_SurveyAnswer")
@Getter
@Setter
public class SurveyAnswer extends StandardTenantEntity implements HasSort, Serializable {

    private static final long serialVersionUID = 6758870046741054084L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "SURVEY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Survey survey;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyQuestion question;

    @InstanceName
    @Column(name = "ANSWER")
    @Lob
    private String answer;

    @Column(name = "MANUAL")
    private Boolean manual;

    @Column(name = "SORT")
    private Integer sort;
}