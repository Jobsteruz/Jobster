package com.smartbox.jobster.view.tempanswer;

import com.smartbox.jobster.entity.questionnaire.temp.TempAnswer;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

import java.util.List;

@Route(value = "temp-answers/:id", layout = MainView.class)
@ViewController(id = "jb_TempAnswer.detail")
@ViewDescriptor(path = "temp-answer-detail-view.xml")
@EditedEntityContainer("tempAnswerDc")
public class TempAnswerDetailView extends AbstractDetailView<TempAnswer> {
    @Subscribe
    public void onInitEntity(final InitEntityEvent<TempAnswer> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}