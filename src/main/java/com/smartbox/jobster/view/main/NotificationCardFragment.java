package com.smartbox.jobster.view.main;

import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.service.MessageHistoryService;
import com.smartbox.jobster.view.chat.ChatView;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import io.jmix.core.DataManager;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.fragmentrenderer.FragmentRenderer;
import io.jmix.flowui.fragmentrenderer.RendererItemContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@FragmentDescriptor("notification-card-fragment.xml")
@RendererItemContainer("botDc")
public class NotificationCardFragment extends FragmentRenderer<HorizontalLayout, Bot> {
    @Autowired
    protected DataManager dataManager;
    @Autowired
    private MessageHistoryService messageHistoryService;
    @Autowired
    private ViewNavigators viewNavigators;

    @ViewComponent
    private VerticalLayout right;
    @ViewComponent
    private Span lastTime;
    @ViewComponent
    private Span notificationCount;


    @Subscribe
    public void onAttachEvent(final AttachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "notificationCard", subject = "clickListener")
    public void onNotificationCardClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}