package com.smartbox.jobster.listener;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.event.MassTransferFinishedEvent;
import com.smartbox.jobster.event.NotificationEvent;
import com.smartbox.jobster.pojo.MassTransferResult;
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

/**
 * Delivers the result of a background mass stage transfer to the recruiter who started it: the run
 * outlives the click that launched it, so the outcome has to come back as a notification rather
 * than as a return value.
 */
@Slf4j
@Component
public class MassTransferFinishedListener {

    private static final int MAX_LISTED_NAMES = 50;

    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UiEventPublisher uiEventPublisher;
    @Autowired
    private Messages messages;

    @EventListener
    public void onFinish(MassTransferFinishedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String makeContent(MassTransferResult result) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
