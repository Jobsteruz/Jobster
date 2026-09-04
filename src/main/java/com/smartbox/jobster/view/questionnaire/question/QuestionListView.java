package com.smartbox.jobster.view.questionnaire.question;

import com.smartbox.jobster.entity.questionnaire.Question;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "questions", layout = MainView.class)
@ViewController(id = "jb_Question.list")
@ViewDescriptor(path = "question-list-view.xml")
public class QuestionListView extends AbstractListView<Question> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}