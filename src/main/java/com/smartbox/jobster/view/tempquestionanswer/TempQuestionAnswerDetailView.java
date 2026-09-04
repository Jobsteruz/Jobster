package com.smartbox.jobster.view.tempquestionanswer;

import com.smartbox.jobster.entity.questionnaire.temp.TempQuestionAnswer;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "temp-question-answer/:id", layout = MainView.class)
@ViewController("jb_TempQuestionAnswer.detail")
@ViewDescriptor("temp-question-answer-detail-view.xml")
@EditedEntityContainer("tempQuestionAnswerDc")
@DialogMode(width = "500px")
public class TempQuestionAnswerDetailView extends AbstractDetailView<TempQuestionAnswer> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}

