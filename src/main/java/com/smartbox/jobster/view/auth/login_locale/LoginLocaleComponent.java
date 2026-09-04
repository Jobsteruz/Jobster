package com.smartbox.jobster.view.auth.login_locale;


import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.Messages;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Locale;

@Route(value = "login-locale-component", layout = MainView.class)
@ViewController("jb_LoginLocaleComponent")
@ViewDescriptor("login-locale-component.xml")
public class LoginLocaleComponent extends StandardView {

    @Autowired
    private Messages messages;
    @ViewComponent
    private JmixSelect<LoginLocales> locales;

    /**
     * True only after the user actively picked a flag on the login page (i.e. the change came
     * from the client, not from the initial seeding off the browser's {@code Accept-Language}).
     * Lets the caller distinguish "explicit user intent" from "we auto-selected a flag for them"
     * — without this flag a user with {@code jb_User.locale='ru'} accessing from an English
     * browser would have their stored locale silently overwritten with English on every login.
     */
    private boolean userPicked = false;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "locales", subject = "renderer")
    private ComponentRenderer<Component, LoginLocales> localesRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("locales")
    public void onLocalesComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<LoginLocales>, LoginLocales> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public Locale locale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void locale(Locale locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /** @see #userPicked */
    public boolean isUserPicked() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}