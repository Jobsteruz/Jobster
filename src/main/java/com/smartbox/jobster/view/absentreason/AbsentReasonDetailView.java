package com.smartbox.jobster.view.absentreason;

import com.smartbox.jobster.entity.ref.AbsentReason;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "absentReasons/:id", layout = MainView.class)
@ViewController("jb_AbsentReason.detail")
@ViewDescriptor("absent-reason-detail-view.xml")
@EditedEntityContainer("absentReasonDc")
@DialogMode(width = "40em", height = "AUTO")
public class AbsentReasonDetailView extends AbstractDetailView<AbsentReason> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}