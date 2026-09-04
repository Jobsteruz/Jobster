package com.smartbox.jobster.view.exitReason;

import com.smartbox.jobster.entity.hrm.ExitReason;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "exitReasons", layout = MainView.class)
@ViewController("jb_ExitReason.list")
@ViewDescriptor("exit-reason-list-view.xml")
public class ExitReasonListView extends AbstractListView<ExitReason> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}