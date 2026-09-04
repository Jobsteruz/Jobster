package com.smartbox.jobster.service.survey;

import com.smartbox.jobster.entity.survey.SurveyQuestion;
import com.smartbox.jobster.entity.survey.SurveyUser;
import com.smartbox.jobster.entity.survey.SurveyUserAnswer;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SurveyUserAnswerService {
    private final DataManager dataManager;


    public Map<SurveyQuestion, List<SurveyUserAnswer>> getSurveyUserAnswers(SurveyUser surveyUser) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<SurveyUserAnswer> loadSurveyUserAnswers(SurveyUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
