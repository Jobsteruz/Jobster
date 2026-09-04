package com.smartbox.jobster.config;

import com.smartbox.jobster.entity.ats.TicketSource;
import com.smartbox.jobster.service.TicketService;
import com.vaadin.flow.component.UI;
import io.jmix.flowui.exception.UiExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Captures Vaadin UI layer exceptions and forwards them to
 * {@link TicketService} as {@link TicketSource#UI} tickets.
 * <p>
 * Normally returns {@code false} so Jmix continues its default error handling
 * (showing the error dialog to the user). The one exception is a UI whose session
 * is already gone — see {@link #handle(Throwable)}.
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DefaultUiExceptionSniffer implements UiExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(DefaultUiExceptionSniffer.class);

    @Autowired
    private TicketService ticketService;

    /**
     * @return {@code true} only to stop the handler chain for a detached UI (see below),
     *         {@code false} otherwise so Jmix shows its usual error dialog
     */
    @Override
    public boolean handle(Throwable exception) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
