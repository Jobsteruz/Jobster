package com.smartbox.jobster.service.survey;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.survey.*;
import com.smartbox.jobster.service.EntityService;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Jobster team
 * date: 26/07/24 12:20
 */

@Service
@Transactional
public class SurveyQuestionService {
    @PersistenceContext
    private EntityManager em;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private SurveyAnswerService answerService;
    @Autowired
    private EntityService entityService;


    public List<SurveyQuestion> getSurveyQuestionsBySurvey(Survey survey, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional
    public SurveyQuestion nextQuestion(SurveyUser user, @Nullable SurveyQuestion currentQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public SurveyQuestion nextQuestion(@Nullable SurveyQuestion currentQuestion, String fetchPlan) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean conditionMatched(SurveyUser user, SurveyQuestion nextQuestion) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}
