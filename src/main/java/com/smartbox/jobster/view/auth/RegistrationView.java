package com.smartbox.jobster.view.auth;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.ConfirmationToken;
import com.smartbox.jobster.entity.company.TemporaryCompany;
import com.smartbox.jobster.pojo.MailPojo;
import com.smartbox.jobster.service.AuthService;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.TemplatesService;
import com.smartbox.jobster.view.auth.login_locale.LoginLocalePills;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import io.jmix.core.SaveContext;
import io.jmix.core.UnconstrainedDataManager;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.textfield.JmixPasswordField;
import io.jmix.flowui.kit.component.KeyCombination;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.securityflowui.password.PasswordValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Route(value = "registration")
@ViewController("jb_RegistrationView")
@ViewDescriptor("registration-view.xml")
@JsModule("./themes/jobster/js/login-mascots.js")
//@AnonymousAllowed
public class RegistrationView extends StandardView {
    private static final Logger log = LoggerFactory.getLogger(RegistrationView.class);

    @Autowired
    private CompanyService companyService;
    @Autowired
    private TemplatesService templatesService;
    @Autowired
    private AuthService authService;

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${spring.rabbitmq.jb.template.exchange}")
    private String exchange;
    @Value("${spring.rabbitmq.jb.template.mail.routing-key}")
    private String mailRoutingKey;

    @Autowired
    private Environment environment;
    @Autowired
    private UnconstrainedDataManager dataManager;
    @Autowired
    private Notifications notifications;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private PasswordValidation passwordValidation;

    // ui components
    @ViewComponent
    private JmixButton signUpBtn;
    @ViewComponent
    private NativeLabel pswErrorMessage;
    @ViewComponent
    private NativeLabel companyNameErrorMessage;
    @ViewComponent
    private NativeLabel userNameErrorMessage;
    @ViewComponent
    private Input companyName;
    @ViewComponent
    private Input username;
    @ViewComponent
    private JmixPasswordField password;
    @ViewComponent
    private Div mascotScene;
    @ViewComponent
    private VerticalLayout regMain;
    @ViewComponent
    private VerticalLayout inputs;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("signUpBtn")
    public void onSignUpBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean validateInputsAndInformUser() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean companyExists() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void resendConfirmationToEmail(TemporaryCompany temporaryCompany) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void sendRegistrationConfirmationToEmail(String email, ConfirmationToken token) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private TemporaryCompany fillCompanyValues(TemporaryCompany company) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}