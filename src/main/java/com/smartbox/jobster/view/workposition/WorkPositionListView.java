package com.smartbox.jobster.view.workposition;

import com.smartbox.jobster.entity.hrm.WorkPosition;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "workPositions", layout = MainView.class)
@ViewController("jb_WorkPosition.list")
@ViewDescriptor("work-position-list-view.xml")
public class WorkPositionListView extends AbstractListView<WorkPosition> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}