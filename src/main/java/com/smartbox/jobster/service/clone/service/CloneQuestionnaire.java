package com.smartbox.jobster.service.clone.service;

import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.questionnaire.*;
import com.smartbox.jobster.service.clone.CloneBuilder;
import com.smartbox.jobster.service.clone.CloneContext;
import com.smartbox.jobster.service.questionnaire.QuestionService;
import io.jmix.core.SaveContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 7/7/2024 5:30 PM
 */
public class CloneQuestionnaire extends AbstractCloning implements CloneBuilder {
    QuestionService questionService;
    Map<UUID, Question> clonedQuestions;

    public CloneQuestionnaire(CloneContext cloneContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void cloning() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneQuestions(Questionnaire sourceQuestionnaire, Questionnaire questionnaire, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneConditions(Question sourceQuestion, Question question, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneOptions(Question sourceQuestion, Question question, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void cloneDefaults(Questionnaire sourceQuestionnaire, Questionnaire questionnaire, SaveContext saveContext) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
