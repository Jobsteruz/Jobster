package com.smartbox.jobster.view.vacancy.ishgo;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.company.CompanyDetail;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.ishgo.IshGOAuthService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "login-ishgo-view", layout = MainView.class)
@ViewController(id = "jb_LoginIshgoView")
@ViewDescriptor(path = "login-ishgo-view.xml")
@DialogMode(width = "30em", height = "AUTO")
public class LoginIshGOView extends StandardView {
    private CompanyDetail companyDetail;
    private int minutes = 2;
    private int seconds = 0;
    private byte limit = 3;

    @Autowired
    private CompanyService companyService;
    @Autowired
    private IshGOAuthService ishGOAuthService;
    @Autowired
    private TenantProvider tenantProvider;

    @ViewComponent
    private TypedTextField<String> phone;
    @ViewComponent
    private TypedTextField<String> code;
    @ViewComponent
    private JmixButton back;
    @ViewComponent
    private JmixButton next;
    @ViewComponent
    private JmixButton send;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private Span sentPhone;
    @ViewComponent
    private Span time;
    @ViewComponent
    private HorizontalLayout sendPhoneBox;
    @ViewComponent
    private Timer timer;
    @ViewComponent
    private Icon resend;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("phone")
    public void onPhoneComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "next", subject = "clickListener")
    public void onNextClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "back", subject = "clickListener")
    public void onBackClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "send", subject = "clickListener")
    public void onSendClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "resend", subject = "clickListener")
    public void onResendClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void startTimer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}