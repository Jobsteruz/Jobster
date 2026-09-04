package com.smartbox.jobster.view.answerformat;

import com.smartbox.jobster.entity.questionnaire.AnswerFormat;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "answerFormats", layout = MainView.class)
@ViewController("jb_AnswerFormat.list")
@ViewDescriptor("answer-format-list-view.xml")
public class AnswerFormatListView extends AbstractListView<AnswerFormat> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}