package com.smartbox.jobster.listener;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.event.MassRejectFinishedEvent;
import com.smartbox.jobster.event.NotificationEvent;
import com.smartbox.jobster.pojo.MassRejectResult;
import com.smartbox.jobster.service.NotificationService;
import com.smartbox.jobster.service.UserService;
import io.jmix.core.Messages;
import io.jmix.flowui.UiEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import org.springframework.web.util.HtmlUtils;

import java.util.List;

@Slf4j
@Component
public class MassRejectFinishedListener {

    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UiEventPublisher uiEventPublisher;
    @Autowired
    private Messages messages;

    @EventListener
    public void onFinish(MassRejectFinishedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String makeContent(MassRejectResult result) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
