package com.smartbox.jobster.view.main;


import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.security.specific.UiTelegramNotificationsEnabled;
import com.smartbox.jobster.service.MessageHistoryService;
import com.smartbox.jobster.service.NotificationService;
import com.smartbox.jobster.view.notification.notificationcard.NotificationCardView;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.virtuallist.JmixVirtualList;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.settings.UserSettingsCache;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Optional;

@Route(value = "notifications-popup", layout = MainView.class)
@ViewController(id = "jb_NotificationsPopup")
@ViewDescriptor(path = "notifications-popup.xml")
@DialogMode(width = "386px", height = "AUTO", closeOnEsc = true, closeOnOutsideClick = true)
public class NotificationsPopup extends StandardView {
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UserSettingsCache userSettingsCache;

    @ViewComponent
    private VerticalLayout telegramNotifications;
    @ViewComponent
    private VerticalLayout systemNotifications;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private CollectionContainer<Bot> botsDc;
    @ViewComponent
    private JmixVirtualList<Bot> cards;
    @Autowired
    private MessageHistoryService messageHistoryService;
    @ViewComponent
    private VerticalLayout WANotifications;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildSystemNotifications() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}