package com.smartbox.jobster.view.requeststatusnotify;

import com.smartbox.jobster.entity.hrm.RequestStatusNotify;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "request-status-notifies", layout = MainView.class)
@ViewController(id = "jb_RequestStatusNotify.list")
@ViewDescriptor(path = "request-status-notify-list-view.xml")
public class RequestStatusNotifyListView extends AbstractListView<RequestStatusNotify> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}