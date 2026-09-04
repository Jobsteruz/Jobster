package com.smartbox.jobster.view.requestcancelreason;

import com.smartbox.jobster.entity.hrm.RequestCancelReason;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "requestCancelReasons/:id", layout = MainView.class)
@ViewController(id = "jb_RequestCancelReason.detail")
@ViewDescriptor(path = "request-cancel-reason-detail-view.xml")
@EditedEntityContainer("requestCancelReasonDc")
@DialogMode(width = "40em", height = "AUTO")
public class RequestCancelReasonDetailView extends AbstractDetailView<RequestCancelReason> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}