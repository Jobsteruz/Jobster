package com.smartbox.jobster.view.interview;

import com.smartbox.jobster.entity.core.Passport;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnairePerson;
import com.smartbox.jobster.service.CompanyService;
import io.jmix.core.DataManager;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.view.DialogWindow;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.View;
import io.jmix.multitenancy.core.TenantProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * The single place that decides <em>how</em> an additional questionnaire is filled in: the
 * step-by-step {@link InterviewView} wizard, or — for a company whose {@code additionalQuestionsJ3}
 * setting is on — the Jobster 3 style {@link AdditionalQuestionsFormView} with every question on one
 * screen. Callers only say who is being interviewed and what to do with the result.
 */
@Slf4j
@Component
public class AdditionalQuestionnaireDialogs {

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private DataManager dataManager;

    /** Whether this company fills in and shows additional questions the way Jobster 3 did. */
    public boolean j3Mode() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Opens a fill-in screen for a fresh questionnaire.
     *
     * @param questionnaire the questionnaire to start with, or null to let the user pick one
     * @param onSaved       handed the filled row once the user finishes; not called when they leave
     */
    public void open(View<?> origin, Passport person, @Nullable TempQuestionnaire questionnaire,
                     Consumer<TempQuestionnairePerson> onSaved) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Opens a fill-in screen on an already filled questionnaire so its answers can be corrected. */
    public void openForUpdate(View<?> origin, TempQuestionnairePerson questionnairePerson,
                              Consumer<TempQuestionnairePerson> onSaved) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <V extends View<?> & AdditionalQuestionnaireFill> void open(
            View<?> origin, Class<V> viewClass, @Nullable Passport person,
            @Nullable TempQuestionnaire questionnaire, @Nullable TempQuestionnairePerson existing,
            Consumer<TempQuestionnairePerson> onSaved
    ) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The wizard creates its row as soon as a questionnaire is picked but writes the answers only on
     * finish, so an abandoned run would otherwise leave an empty row behind — one that the card and
     * the reports would have to keep filtering out.
     */
    public void discardUnfinished(@Nullable TempQuestionnairePerson filled) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
