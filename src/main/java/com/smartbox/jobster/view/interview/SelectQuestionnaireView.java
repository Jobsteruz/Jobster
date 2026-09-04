package com.smartbox.jobster.view.interview;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionnaire;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route("select-questionnaire-view")
@ViewController("jb_SelectQuestionnaireView")
@ViewDescriptor("select-questionnaire-view.xml")
@DialogMode(width = "30em", height = "auto")
public class SelectQuestionnaireView extends StandardView {
    @ViewComponent
    private EntityComboBox<TempQuestionnaire> questionnaireSelect;

    @Autowired
    private Notifications notifications;

    @Setter
    private Applicant applicant;
    @ViewComponent
    private CollectionLoader<TempQuestionnaire> tempQuestionnaireDl;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public TempQuestionnaire getSelectedQuestionnaire() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cancelBtn")
    public void onCancelBtnClick(ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("startBtn")
    public void onStartBtnClick(ClickEvent<Button> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
