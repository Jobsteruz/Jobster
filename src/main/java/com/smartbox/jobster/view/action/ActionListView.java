package com.smartbox.jobster.view.action;

import com.smartbox.jobster.$;
import com.smartbox.jobster.action.AbstractJbKanbanAction;
import com.smartbox.jobster.action.JbKanbanAction;
import com.smartbox.jobster.entity.kanban.AbstractActionEntity;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.function.Function;

import static org.reflections.scanners.Scanners.SubTypes;

@Route(value = "action-list-view", layout = MainView.class)
@ViewController("jb_ActionListView")
@ViewDescriptor("action-list-view.xml")
@DialogMode(width = "40em", height = "AUTO", closeOnEsc = true)
public class ActionListView extends StandardView {
    @Getter
    private AbstractActionEntity action;
    @Setter
    private Function<JbKanbanAction, AbstractActionEntity> saveAction;

    @ViewComponent
    private TypedTextField<Object> searchField;
    @ViewComponent
    private VerticalLayout layout;

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Messages messages;
    @Autowired
    private DialogWindows dialogWindows;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildActions(String className) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private HorizontalLayout buildAction(Class<?> aClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String className(Class<?> aClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String description(Class<?> aClass) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}