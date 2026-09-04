package com.smartbox.jobster.entity.survey;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.tg.TgUser;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_SURVEY_USER", indexes = {
        @Index(name = "IDX_JB_SURVEY_USER_TG_USER", columnList = "TG_USER_ID"),
        @Index(name = "IDX_JB_SURVEY_USER_SURVEY", columnList = "SURVEY_ID"),
        @Index(name = "IDX_JB_SURVEY_USER_CURRENT_QUESTION", columnList = "CURRENT_QUESTION_ID")
})
@Entity(name = "jb_SurveyUser")
@Getter
@Setter
public class SurveyUser extends StandardTenantEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -4541832653420576565L;

    @InstanceName
    @JoinColumn(name = "TG_USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TgUser tgUser;

    @JoinColumn(name = "SURVEY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Survey survey;

    @JoinColumn(name = "CURRENT_QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private SurveyQuestion currentQuestion;

    @Column(name = "MISSING_DAYS")
    private Integer missingDays;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "COMPLETED")
    private Boolean completed;
}