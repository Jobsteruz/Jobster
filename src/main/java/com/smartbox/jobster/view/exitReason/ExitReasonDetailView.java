package com.smartbox.jobster.view.exitReason;

import com.smartbox.jobster.entity.hrm.ExitReason;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "exitReasons/:id", layout = MainView.class)
@ViewController("jb_ExitReason.detail")
@ViewDescriptor("exit-reason-detail-view.xml")
@EditedEntityContainer("exitReasonDc")
@DialogMode(width = "40em", height = "AUTO")
public class ExitReasonDetailView extends AbstractDetailView<ExitReason> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}