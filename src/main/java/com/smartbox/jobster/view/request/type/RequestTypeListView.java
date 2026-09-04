package com.smartbox.jobster.view.request.type;

import com.smartbox.jobster.entity.hrm.RequestType;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "requestTypes", layout = MainView.class)
@ViewController(id = "jb_RequestType.list")
@ViewDescriptor(path = "request-type-list-view.xml")
public class RequestTypeListView extends AbstractListView<RequestType> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}