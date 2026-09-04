package com.smartbox.jobster.view.action.mass.vacancy;


import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.RequestCancelReason;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.RequestService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.UUID;

@Route(value = "Vacancy-Reject-Action-View", layout = MainView.class)
@ViewController(id = "jb_VacancyRejectActionView")
@ViewDescriptor(path = "Vacancy-Reject-Action-View.xml")
@DialogMode(width = "30em", height = "AUTO")
public class VacancyRejectActionView extends StandardView {

    @Setter
    private Map<JbEntity<UUID>, KanbanStage> entities;

    @Setter
    private boolean manualClose = false;

    @ViewComponent
    private EntityComboBox<RequestCancelReason> reasonInput;
    @ViewComponent
    private JmixTextArea rejectCom;

    @Autowired
    private Messages messages;
    @Autowired
    private RequestService requestService;

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