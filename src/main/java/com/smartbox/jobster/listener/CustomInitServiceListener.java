package com.smartbox.jobster.listener;

import com.vaadin.flow.server.*;
import org.springframework.stereotype.Component;

@Component
public class CustomInitServiceListener implements VaadinServiceInitListener {
    private static final String MANUAL_LOGOUT = "manualLogout";

    @Override
    public void serviceInit(ServiceInitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isManualLogout(VaadinSession session) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static void markAsManualLogout() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
