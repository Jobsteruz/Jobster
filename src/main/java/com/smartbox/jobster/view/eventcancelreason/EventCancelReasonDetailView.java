package com.smartbox.jobster.view.eventcancelreason;

import com.smartbox.jobster.entity.ats.EventCancelReason;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "event-cancel-reasons/:id", layout = MainView.class)
@ViewController("jb_EventCancelReason.detail")
@ViewDescriptor("event-cancel-reason-detail-view.xml")
@EditedEntityContainer("eventCancelReasonDc")
@DialogMode(width = "40em", height = "AUTO")
public class EventCancelReasonDetailView extends AbstractDetailView<EventCancelReason> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
