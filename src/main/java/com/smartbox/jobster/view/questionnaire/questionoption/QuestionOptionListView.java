package com.smartbox.jobster.view.questionnaire.questionoption;

import com.smartbox.jobster.entity.questionnaire.QuestionOption;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "question-options", layout = MainView.class)
@ViewController(id = "jb_QuestionOption.list")
@ViewDescriptor(path = "question-option-list-view.xml")
public class QuestionOptionListView extends AbstractListView<QuestionOption> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}