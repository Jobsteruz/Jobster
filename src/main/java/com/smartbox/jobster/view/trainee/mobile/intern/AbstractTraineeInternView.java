package com.smartbox.jobster.view.trainee.mobile.intern;


import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import com.smartbox.jobster.entity.trainee.TraineeInternMentor;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractMobileListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.TimeSource;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Route(value = "abstract-trainee-intern-view", layout = MainView.class)
@ViewController("jb_AbstractTraineeInternView")
@ViewDescriptor("abstract-trainee-intern-view.xml")
public abstract class AbstractTraineeInternView extends AbstractMobileListView<TraineeGroupIntern> {
    private final String EMPTY_VALUE = "--------";

    @Autowired
    protected UiComponents uiComponents;
    @Autowired
    protected InstanceNameProvider instanceNameProvider;
    @ViewComponent
    protected MessageBundle messageBundle;
    @Autowired
    protected TranslateService translateService;
    @Autowired
    protected EmployeeService employeeService;
    @Autowired
    protected ViewNavigators viewNavigators;
    @Autowired
    private DepartmentService departmentService;

    protected abstract String getViewRoute();

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoad(final CollectionLoader.PostLoadEvent<?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected VerticalLayout buildCard(TraineeGroupIntern groupIntern) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Div mentorBody(TraineeGroupIntern groupIntern) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Div gradeBody(TraineeGroupIntern groupIntern) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Div body(String label, String value) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Avatar mentorAvatar(TraineeInternMentor internMentor) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public static Integer interningDays(TraineeGroupIntern groupIntern) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}