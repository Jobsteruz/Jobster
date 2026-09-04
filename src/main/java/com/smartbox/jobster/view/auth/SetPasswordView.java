package com.smartbox.jobster.view.auth;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.user.UserConfirmationToken;
import com.smartbox.jobster.service.user.UserNotificationService;
import com.smartbox.jobster.view.auth.login_locale.LoginLocales;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.textfield.JmixPasswordField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.securityflowui.password.PasswordValidationContext;
import io.jmix.securityflowui.password.PasswordValidationException;
import io.jmix.securityflowui.password.PasswordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

@Route(value = "set-password")
@ViewController("jb_SetPasswordView")
@ViewDescriptor("set-password-view.xml")
@AnonymousAllowed
public class SetPasswordView extends StandardView implements BeforeEnterObserver {

    @ViewComponent
    private JmixPasswordField passwordField;
    @ViewComponent
    private JmixPasswordField confirmPasswordField;
    @ViewComponent
    private JmixComboBox<LoginLocales> locales;

    @Autowired
    private UserNotificationService userNotificationService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private Messages messages;
    @Autowired
    private Notifications notifications;
    @Autowired
    private PasswordValidator<User> passwordValidator;

    private UserConfirmationToken confirmationToken;

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("setPasswordBtn")
    public void onSetPasswordBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void savePassword() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
