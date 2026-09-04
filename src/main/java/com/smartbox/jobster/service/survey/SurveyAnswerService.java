package com.smartbox.jobster.service.survey;

import com.smartbox.jobster.entity.survey.SurveyAnswer;
import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.entity.survey.SurveyUserAnswer;
import io.jmix.core.DataManager;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @author Jobster team
 * date: 26/07/24 12:21
 */

@Service
public class SurveyAnswerService {

    @Autowired
    private DataManager dataManager;

    public void addUserAnswer(SurveyUser surveyUser, SurveyAnswer surveyAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Transactional
    public void saveUserAnswer(SurveyUser surveyUser, SurveyAnswer surveyAnswer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void removeUserAnswers(SurveyUser user, SurveyAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Transactional(readOnly = true)
    public @Nullable SurveyUserAnswer getUserAnswer(SurveyUser surveyUser, SurveyQuestion question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public Boolean hasAnswer(SurveyUser user, SurveyAnswer answer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public boolean hasAnswer(SurveyUser user, SurveyQuestion question) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    public boolean hasCorrectAnswer(SurveyQuestion question, SurveyAnswer answer, SurveyUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}