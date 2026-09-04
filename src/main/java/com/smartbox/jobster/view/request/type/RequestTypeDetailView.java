package com.smartbox.jobster.view.request.type;

import com.smartbox.jobster.entity.hrm.RequestType;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "requestTypes/:id", layout = MainView.class)
@ViewController(id = "jb_RequestType.detail")
@ViewDescriptor(path = "request-type-detail-view.xml")
@EditedEntityContainer("requestTypeDc")
@DialogMode(width = "40em", height = "AUTO")
public class RequestTypeDetailView extends AbstractDetailView<RequestType> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}