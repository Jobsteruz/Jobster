package com.smartbox.jobster.view.questionnaire.questionname;

import com.smartbox.jobster.component.translation.TranslateRichTextEditor;
import com.smartbox.jobster.entity.questionnaire.QuestionName;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "questionNames/:id", layout = MainView.class)
@ViewController(id = "jb_QuestionName.detail")
@ViewDescriptor(path = "question-name-detail-view.xml")
@EditedEntityContainer("questionNameDc")
@DialogMode(width = "40em", height = "AUTO")
public class QuestionNameDetailView extends AbstractDetailView<QuestionName> {
    @Setter
    private Integer index;

    @Autowired
    private Messages messages;

    @ViewComponent
    private TranslateRichTextEditor nameField;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}