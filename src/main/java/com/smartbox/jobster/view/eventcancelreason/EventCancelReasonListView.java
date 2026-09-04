package com.smartbox.jobster.view.eventcancelreason;

import com.smartbox.jobster.entity.ats.EventCancelReason;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "event-cancel-reasons", layout = MainView.class)
@ViewController("jb_EventCancelReason.list")
@ViewDescriptor("event-cancel-reason-list-view.xml")
public class EventCancelReasonListView extends AbstractListView<EventCancelReason> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}