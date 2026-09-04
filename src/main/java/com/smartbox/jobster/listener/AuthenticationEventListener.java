package com.smartbox.jobster.listener;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.service.CompanyService;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.server.VaadinResponse;
import com.vaadin.flow.server.VaadinService;
import jakarta.servlet.http.Cookie;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("jb_AuthenticationEventListener")
@RequiredArgsConstructor
public class AuthenticationEventListener {
    private final CompanyService companyService;

    @EventListener
    public void onInteractiveAuthenticationSuccess(final InteractiveAuthenticationSuccessEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setDeviceVerificationCookieIfAbsent(Object principal) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}