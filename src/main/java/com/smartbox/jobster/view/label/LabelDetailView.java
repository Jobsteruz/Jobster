package com.smartbox.jobster.view.label;

import com.smartbox.jobster.entity.ats.Label;
import com.smartbox.jobster.entity.questionnaire.QuestionnaireColor;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Stream;

@Route(value = "labels/:id", layout = MainView.class)
@ViewController("jb_Label.detail")
@ViewDescriptor("label-detail-view.xml")
@EditedEntityContainer("labelDc")
@DialogMode(width = "AUTO", height = "AUTO")
public class LabelDetailView extends AbstractDetailView<Label> {
    @Autowired
    private UiComponents uiComponents;
    @ViewComponent
    private Div colorsBox;
    @Autowired
    private Messages messages;
    @Autowired
    private Notifications notifications;

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

    private void buildColorBox() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}