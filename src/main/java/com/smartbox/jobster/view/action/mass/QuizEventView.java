package com.smartbox.jobster.view.action.mass;


import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.quiz.Quiz;
import com.smartbox.jobster.service.QuizService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.UUID;

@Route(value = "quiz-event-view", layout = MainView.class)
@ViewController("jb_QuizEventView")
@ViewDescriptor("quiz-event-view.xml")
@DialogMode(width = "40em")
public class QuizEventView extends StandardView {
    @Setter
    private Map<JbEntity<UUID>, KanbanStage> entities;

    @Autowired
    private QuizService quizService;

    @ViewComponent
    private EntityComboBox<Quiz> quizBox;

    @Subscribe(id = "send", subject = "clickListener")
    public void onSendClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancel", subject = "clickListener")
    public void onCancelClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}