package com.smartbox.jobster.view.requestcancelreason;

import com.smartbox.jobster.entity.hrm.RequestCancelReason;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "requestCancelReasons", layout = MainView.class)
@ViewController(id = "jb_RequestCancelReason.list")
@ViewDescriptor(path = "request-cancel-reason-list-view.xml")
public class RequestCancelReasonListView extends AbstractListView<RequestCancelReason> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}