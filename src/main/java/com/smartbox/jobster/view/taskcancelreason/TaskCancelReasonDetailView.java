package com.smartbox.jobster.view.taskcancelreason;

import com.smartbox.jobster.entity.checklist.TaskCancelReason;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "task-cancel-reasons/:id", layout = MainView.class)
@ViewController("jb_TaskCancelReason.detail")
@ViewDescriptor("task-cancel-reason-detail-view.xml")
@EditedEntityContainer("taskCancelReasonDc")
@DialogMode(width = "40em", height = "AUTO")
public class TaskCancelReasonDetailView extends AbstractDetailView<TaskCancelReason> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}