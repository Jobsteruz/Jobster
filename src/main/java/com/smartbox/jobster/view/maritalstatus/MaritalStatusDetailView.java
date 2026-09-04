package com.smartbox.jobster.view.maritalstatus;

import com.smartbox.jobster.entity.ref.MaritalStatus;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "maritalStatuses/:id", layout = MainView.class)
@ViewController("jb_MaritalStatus.detail")
@ViewDescriptor("marital-status-detail-view.xml")
@EditedEntityContainer("maritalStatusDc")
@DialogMode(width = "40em", height = "AUTO")
public class MaritalStatusDetailView extends AbstractDetailView<MaritalStatus> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}