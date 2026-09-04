package com.smartbox.jobster.view.absentreason;

import com.smartbox.jobster.entity.ref.AbsentReason;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "absentReasons", layout = MainView.class)
@ViewController("jb_AbsentReason.list")
@ViewDescriptor("absent-reason-list-view.xml")
public class AbsentReasonListView extends AbstractListView<AbsentReason> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}