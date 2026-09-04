package com.smartbox.jobster.view.personassistant;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ai.PersonAIAction;
import com.smartbox.jobster.entity.ai.PersonAssistant;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.virtuallist.JmixVirtualList;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Route(value = "person-assistant-view", layout = MainView.class)
@ViewController(id = "jb_PersonAssistantView")
@ViewDescriptor(path = "person-assistant-view.xml")
public class PersonAssistantView extends StandardView {
    private Person person;

    @Autowired
    private EntityService entityService;
    @Autowired
    private EmployeeService employeeService;

    @ViewComponent
    private Avatar photo;
    @ViewComponent
    private H4 personName;
    @ViewComponent
    private Span code;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private CollectionLoader<PersonAssistant> messagesDl;
    @ViewComponent
    private CollectionContainer<PersonAssistant> messagesDc;
    @Getter
    @ViewComponent
    private JmixVirtualList<PersonAssistant> chat;


    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "compare", subject = "clickListener")
    public void onCompareClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "summary", subject = "clickListener")
    public void onSummaryClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void initUI(UUID personId, String entityName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "back", subject = "clickListener")
    public void onBackClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private PersonAssistant createMessage(PersonAIAction action) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private PersonAssistant createHelloMessage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}