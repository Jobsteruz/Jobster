package com.smartbox.jobster.view.questionnaire.questionoption;

import com.smartbox.jobster.entity.questionnaire.QuestionOption;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;

@Route(value = "questionOptions/:id", layout = MainView.class)
@ViewController("jb_QuestionOption.detail")
@ViewDescriptor("question-option-detail-view.xml")
@EditedEntityContainer("questionOptionDc")
@DialogMode(width = "AUTO", height = "AUTO")
public class QuestionOptionDetailView extends AbstractDetailView<QuestionOption> {

    @ViewComponent
    private TypedTextField<String> innerIdField;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
