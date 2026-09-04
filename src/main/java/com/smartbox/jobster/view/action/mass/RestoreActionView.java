package com.smartbox.jobster.view.action.mass;


import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.person.PersonActionService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.UUID;

@Route(value = "restore-action-view", layout = MainView.class)
@ViewController("jb_RestoreActionView")
@ViewDescriptor("restore-action-view.xml")
@DialogMode(width = "30em", height = "AUTO")
public class RestoreActionView extends StandardView {
    @Setter
    private Map<JbEntity<UUID>, KanbanStage> entities;

    @ViewComponent
    private JmixTextArea restoreCom;

    @Autowired
    private PersonActionService personActionService;

    @Subscribe(id = "save", subject = "clickListener")
    public void onSaveClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancel", subject = "clickListener")
    public void onCancelClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}