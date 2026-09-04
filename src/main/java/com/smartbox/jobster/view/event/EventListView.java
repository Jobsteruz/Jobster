package com.smartbox.jobster.view.event;

import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "events", layout = MainView.class)
@ViewController("jb_Event.list")
@ViewDescriptor("event-list-view.xml")
public class EventListView extends AbstractListView<Position> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}