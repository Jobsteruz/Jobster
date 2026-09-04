package com.smartbox.jobster.view.workposition;

import com.smartbox.jobster.entity.hrm.WorkPosition;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "workPositions/:id", layout = MainView.class)
@ViewController("jb_WorkPosition.detail")
@ViewDescriptor("work-position-detail-view.xml")
@EditedEntityContainer("workPositionDc")
@DialogMode(width = "40em", height = "AUTO")
public class WorkPositionDetailView extends AbstractDetailView<WorkPosition> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}