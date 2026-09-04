package com.smartbox.jobster.view.userprofile;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.integration.IntegratedGoogle;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.entity.ui.Theme;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.entity.config.NotificationSetting;
import com.smartbox.jobster.service.notification.NotificationSettingService;
import com.smartbox.jobster.service.google.GoogleCalendarService;
import com.smartbox.jobster.service.google.GoogleService;
import com.smartbox.jobster.service.outlook.OutlookSubscriptionService;
import com.smartbox.jobster.service.hh.HHEmployerService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.auth.login_locale.LoginLocales;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.userprofile.integratedgoogle.IntegratedGoogleDetailView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.core.security.ClientDetails;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.core.security.SecurityContextHelper;
import io.jmix.core.security.SystemAuthenticationToken;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.action.ActionVariant;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.securityflowui.view.changepassword.ChangePasswordView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;

@Route(value = "user-profile-view", layout = MainView.class)
@ViewController("jb_UserProfileView")
@ViewDescriptor("user-profile-view.xml")
public class UserProfileView extends StandardView {
    private Employee employee;

    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Messages messages;
    @Autowired
    private GoogleService googleService;
    @Autowired
    private UserService userService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private HHEmployerService hHEmployerService;
    @Autowired
    private GoogleCalendarService googleCalendarService;
    @Autowired
    private OutlookSubscriptionService outlookSubscriptionService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private NotificationSettingService notificationSettingService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @ViewComponent
    private Span position;
    @ViewComponent
    private Span username;
    @ViewComponent
    private Span phone;
    @ViewComponent
    private Span timeZone;
    @ViewComponent
    private Span language;
    @ViewComponent
    private Span email;
    @ViewComponent
    private Span password;
    @ViewComponent
    private Span appearance;
    @ViewComponent
    private JmixImage<FileRef> photo;
    @ViewComponent
    private H4 fullName;
    @ViewComponent
    private HorizontalLayout lightBlue;
    @ViewComponent
    private HorizontalLayout pink;
    @ViewComponent
    private HorizontalLayout steelBlue;
    @ViewComponent
    private HorizontalLayout black;
    @ViewComponent
    private HorizontalLayout classic;
    @ViewComponent
    private Paragraph hhTitle;
    @ViewComponent
    private Paragraph hhStatus;
    @ViewComponent
    private JmixSelect<LoginLocales> languageSelect;
    @ViewComponent
    private Icon editLang;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private Checkbox emailEnabledCheckbox;
    @ViewComponent
    private Checkbox smsEnabledCheckbox;
    @ViewComponent
    private Checkbox telegramEnabledCheckbox;
    @ViewComponent
    private Checkbox pushEnabledCheckbox;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("languageSelect")
    public void onLanguageSelectComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<LoginLocales>, LoginLocales> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editLang", subject = "clickListener")
    public void onEditLangClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "changePassword", subject = "clickListener")
    public void onChangePasswordClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "edit", subject = "clickListener")
    public void onEditClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "lightBlue", subject = "clickListener")
    public void onLightBlueClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "steelBlue", subject = "clickListener")
    public void onSteelBlueClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "pink", subject = "clickListener")
    public void onPinkClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "black", subject = "clickListener")
    public void onBlackClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "classic", subject = "clickListener")
    public void onClassicClick(final ClickEvent<HorizontalLayout> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "syncGShBtn", subject = "clickListener")
    public void onSyncGShBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "syncGCalBtn", subject = "clickListener")
    public void onSyncGCalBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "syncOutlookBtn", subject = "clickListener")
    public void onSyncOutlookBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openAuthorizationPopup(String script) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void changeTheme(Theme theme) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpIntegrationStatus() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "integrationBtn", subject = "clickListener")
    public void onIntegrationBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpNotificationSettings() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void saveNotificationSetting(java.util.function.Consumer<NotificationSetting> updater) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}