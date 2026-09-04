package com.smartbox.jobster.view.workschedule;

import com.smartbox.jobster.entity.hrm.WorkSchedule;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "workSchedules/:id", layout = MainView.class)
@ViewController("jb_WorkSchedule.detail")
@ViewDescriptor("work-schedule-detail-view.xml")
@EditedEntityContainer("workScheduleDc")
@DialogMode(width = "40em", height = "AUTO")
public class WorkScheduleDetailView extends AbstractDetailView<WorkSchedule> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}