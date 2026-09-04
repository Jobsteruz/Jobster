package com.smartbox.jobster.view.interview;

import com.smartbox.jobster.entity.core.Passport;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import org.springframework.lang.Nullable;

/**
 * What every screen that fills in an additional questionnaire has to offer its caller, so the person
 * card, the stage-transfer action and the result view can open either of them without knowing which:
 * the step-by-step {@link InterviewView} or the one-screen {@link AdditionalQuestionsFormView} the
 * {@code additionalQuestionsJ3} company setting switches to.
 *
 * @see AdditionalQuestionnaireDialogs
 */
public interface AdditionalQuestionnaireFill {

    /**
     * Starts a fresh fill-in for {@code person}.
     *
     * @param questionnaire the questionnaire to use, or null to let the user pick one
     */
    void setInterviewData(Passport person, @Nullable TempQuestionnaire questionnaire);

    /** Reopens an already filled questionnaire so its answers can be corrected. */
    void setInterviewDataForUpdate(TempQuestionnairePerson questionnairePerson);

    /** The filled row, or null while nothing was filled in — an abandoned run leaves it null. */
    @Nullable
    TempQuestionnairePerson getTempQuestionnairePerson();
}
