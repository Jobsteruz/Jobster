package com.smartbox.jobster.view.auth;

import com.smartbox.jobster.service.sso.SsoProviderService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import io.jmix.flowui.kit.component.KeyCombination;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "sso-login")
@ViewController("jb_SsoLoginView")
@ViewDescriptor("sso-login-view.xml")
@AnonymousAllowed
@DialogMode(closeOnEsc = true, closeOnOutsideClick = true)
public class SsoLoginView extends StandardView {

    @Autowired
    private SsoProviderService ssoProviderService;

    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private Input ssoEmail;
    @ViewComponent
    private Div ssoErrorContainer;
    @ViewComponent
    private JmixButton ssoSignInBtn;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("ssoSignInBtn")
    public void onSignInClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void displayError(String msg) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
