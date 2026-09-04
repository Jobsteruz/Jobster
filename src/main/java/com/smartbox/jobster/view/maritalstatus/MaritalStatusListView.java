package com.smartbox.jobster.view.maritalstatus;

import com.smartbox.jobster.entity.ref.MaritalStatus;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "maritalStatuses", layout = MainView.class)
@ViewController("jb_MaritalStatus.list")
@ViewDescriptor("marital-status-list-view.xml")
public class MaritalStatusListView extends AbstractListView<MaritalStatus> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}