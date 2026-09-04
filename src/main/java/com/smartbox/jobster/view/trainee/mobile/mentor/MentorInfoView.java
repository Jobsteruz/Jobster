package com.smartbox.jobster.view.trainee.mobile.mentor;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Locale;
import java.util.UUID;

@Route(value = "mentor-info-view", layout = MainView.class)
@ViewController("jb_MentorInfoView")
@ViewDescriptor("mentor-info-view.xml")
public class MentorInfoView extends StandardView {
    private final String EMPTY_VALUE = "--------";

    private Employee mentor;

    @Autowired
    private EntityService entityService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private TranslateService translateService;

    @ViewComponent
    private NativeLabel mentorNameLabel;
    @ViewComponent
    private Avatar avatar;
    @ViewComponent
    private H4 mentorName;
    @ViewComponent
    private Span staffNumber;
    @ViewComponent
    private Span positionName;
    @ViewComponent
    private Span experienceYear;

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

    @Subscribe(id = "backBtn", subject = "clickListener")
    public void onBackBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}