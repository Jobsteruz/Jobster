package com.smartbox.jobster.view.notification;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.Supply;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "notifications", layout = MainView.class)
@ViewController("jb_Notification.list")
@ViewDescriptor("notification-list-view.xml")
public class NotificationListView extends AbstractListView<Notification> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.message", subject = "renderer")
    private Renderer<Notification> entityDataGridMessageRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}