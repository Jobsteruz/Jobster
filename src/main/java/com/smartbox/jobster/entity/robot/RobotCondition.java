package com.smartbox.jobster.entity.robot;

import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.quiz.Quiz;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@JmixEntity
@Table(name = "JB_ROBOT_CONDITION", indexes = {
        @Index(name = "IDX_JB_ROBOT_CONDITION_ROBOT", columnList = "ROBOT_ID"),
        @Index(name = "IDX_JB_ROBOT_CONDITION_QUESTION", columnList = "QUESTION_ID"),
        @Index(name = "IDX_JB_ROBOT_CONDITION_QUIZ", columnList = "QUIZ_ID"),
        @Index(name = "IDX_JB_ROBOT_CONDITION_TEMP_QUESTIONNAIRE", columnList = "TEMP_QUESTIONNAIRE_ID")
})
@Entity(name = "jb_RobotCondition")
@Getter
@Setter
public class RobotCondition extends StandardTenantEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -1000209281045092290L;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "ROBOT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Robot robot;

    @Column(name = "FIELD")
    private String field;

    @Column(name = "ENTITY_FIELD")
    private String entityField;

    @JoinColumn(name = "QUESTION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Question question;

    @JoinColumn(name = "QUIZ_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Quiz quiz;

    @JoinColumn(name = "TEMP_QUESTIONNAIRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TempQuestionnaire tempQuestionnaire;

    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    @Column(name = "CONDITION_VALUE")
    private String conditionValue;

    @Column(name = "IS_OR")
    private Boolean isOr;

    public ConditionType getConditionType() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setConditionType(ConditionType conditionType) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}