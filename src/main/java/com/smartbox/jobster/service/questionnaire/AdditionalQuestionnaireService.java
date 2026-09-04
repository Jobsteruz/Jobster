package com.smartbox.jobster.service.questionnaire;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePersonAnswer;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Jobster team
 * Since: 8/9/2025 16:34 PM
 */
@Service
public class AdditionalQuestionnaireService {
    @Autowired
    private DataManager dataManager;

    public TempQuestionnaire getQuestionnaireByCode(String code) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean interviewAlreadyCompleted(Applicant applicant, TempQuestionnaire questionnaire) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<TempQuestionnairePersonAnswer> loadAdditionalQuestionAnswers(TempQuestionnairePerson questionnairePerson) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
