package com.smartbox.jobster.view.taskcancelreason;

import com.smartbox.jobster.entity.checklist.TaskCancelReason;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "task-cancel-reasons", layout = MainView.class)
@ViewController("jb_TaskCancelReason.list")
@ViewDescriptor("task-cancel-reason-list-view.xml")
public class TaskCancelReasonListView extends AbstractListView<TaskCancelReason> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}