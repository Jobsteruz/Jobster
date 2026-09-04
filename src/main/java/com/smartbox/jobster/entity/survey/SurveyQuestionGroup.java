package com.smartbox.jobster.entity.survey;

import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
import com.smartbox.jobster.entity.ref.ParentRef;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@JmixEntity
@Table(name = "JB_SURVEY_QUESTION_GROUP")
@Entity(name = "jb_SurveyQuestionGroup")
@Getter
@Setter
public class SurveyQuestionGroup extends ParentRef implements Serializable {
    private static final long serialVersionUID = 2083615030348073413L;

    @Column(name = "COLOR")
    private String color;

    public QuestionnaireColor getColor() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setColor(QuestionnaireColor color) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}