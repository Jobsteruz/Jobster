package com.smartbox.jobster.listener;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ui.Notification;
import com.smartbox.jobster.event.CvBatchCreateFinishedEvent;
import com.smartbox.jobster.event.NotificationEvent;
import com.smartbox.jobster.pojo.ai.cv_parser.CreatePersonFromCVResult;
import com.smartbox.jobster.service.NotificationService;
import com.smartbox.jobster.service.UserService;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.security.SystemAuthenticator;
import io.jmix.flowui.UiEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class CvParsingCreatePersonListener {
    @Autowired
    protected DataManager dataManager;
    @Autowired
    private UserService userService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private UiEventPublisher uiEventPublisher;
    @Autowired
    private Messages messages;
    @Autowired
    private SystemAuthenticator systemAuthenticator;

    /**
     * Handle a finished CV batch import. Runs asynchronously so the event publisher (the
     * webhook-driven {@code CvBatchAggregator}) never waits for a DB write + UI push — a parser
     * webhook in particular has a short timeout on the caller side.
     * <p>
     * Because {@link Async} moves the work off the publisher's thread, the Jmix tenant context
     * is no longer attached. We re-establish it by wrapping the body in
     * {@code SystemAuthenticator.runWithUser(username, ...)} using the principal captured in the
     * event payload.
     */
    @Async
    @EventListener
    public void onFinish(CvBatchCreateFinishedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** Build + fire the dashboard notification for the recipient named on {@code result}. */
    private void deliverNotification(CreatePersonFromCVResult result) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String makeContent(CreatePersonFromCVResult result) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
