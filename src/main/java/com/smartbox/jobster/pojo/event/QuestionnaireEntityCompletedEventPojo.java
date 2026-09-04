package com.smartbox.jobster.pojo.event;

import com.smartbox.jobster.entity.questionnaire.StandardQuestionnaireEntity;
import com.smartbox.jobster.event.QuestionnaireEntityCompletedEvent;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.Objects;

@Getter
@Setter

public class QuestionnaireEntityCompletedEventPojo extends AbstractEventPojo  {

    @Serial
    private static final long serialVersionUID = 2335542346733762100L;

    private final StandardQuestionnaireEntity entity;

    public QuestionnaireEntityCompletedEventPojo(StandardQuestionnaireEntity entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void fireEvent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
