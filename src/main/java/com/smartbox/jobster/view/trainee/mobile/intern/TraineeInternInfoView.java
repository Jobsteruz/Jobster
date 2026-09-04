package com.smartbox.jobster.view.trainee.mobile.intern;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import com.smartbox.jobster.entity.trainee.TraineeInternMentor;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.NavigationService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.trainee.mobile.mentor.MentorLookupView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.TimeSource;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Locale;
import java.util.Map;
import java.util.Optional;

@Route(value = "trainee-intern-info-view/:view", layout = MainView.class)
@ViewController("jb_TraineeInternInfoView")
@ViewDescriptor("trainee-intern-info-view.xml")
public class TraineeInternInfoView extends StandardView {
    private final String EMPTY_VALUE = "--------";

    private String viewRoute;
    private Navigation navigation;
    private TraineeGroupIntern groupIntern;
    private int internGrade = 0;

    @Autowired
    private EntityService entityService;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private Notifications notifications;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private NavigationService navigationService;

    @ViewComponent
    private NativeLabel viewLabel;
    @ViewComponent
    private NativeLabel internNameLabel;
    @ViewComponent
    private Avatar avatar;
    @ViewComponent
    private H4 internName;
    @ViewComponent
    private VerticalLayout mentorBox;
    @ViewComponent
    private JmixButton setMentorBtn;
    @ViewComponent
    private VerticalLayout gradeBox;
    @ViewComponent
    private JmixTextArea commentField;
    @ViewComponent
    private JmixButton gradeBtn;
    @ViewComponent
    private Span staffNumber;
    @ViewComponent
    private Span positionName;
    @ViewComponent
    private Span interningDays;
    @ViewComponent
    private HorizontalLayout rateBox;
    @ViewComponent
    private Span managerComment;

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildReviewedIntern() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildInternGrade() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "setMentorBtn", subject = "clickListener")
    public void onSetMentorBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "gradeBtn", subject = "clickListener")
    public void onGradeBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean mentorDeadlineExpired() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Integer getMentorDeadline() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}