package com.smartbox.jobster.view.answerformat;

import com.smartbox.jobster.entity.questionnaire.AnswerFormat;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "answerFormats/:id", layout = MainView.class)
@ViewController("jb_AnswerFormat.detail")
@ViewDescriptor("answer-format-detail-view.xml")
@EditedEntityContainer("answerFormatDc")
@DialogMode(width = "40em", height = "AUTO")
public class AnswerFormatDetailView extends AbstractDetailView<AnswerFormat> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}