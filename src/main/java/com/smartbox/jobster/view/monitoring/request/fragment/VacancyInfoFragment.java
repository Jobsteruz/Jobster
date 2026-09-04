package com.smartbox.jobster.view.monitoring.request.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.request.RequestDetailView;
import com.smartbox.jobster.view.vacancy.VacancyDetailView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.StandardOutcome;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.View;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.builder.DetailWindowBuilder;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

@FragmentDescriptor("vacancy-info-fragment.xml")
public class VacancyInfoFragment extends Fragment<VerticalLayout> {
    private static final String EMPTY = "------";

    @Setter
    private Kanban kanban;
    private String locale;
    private Vacancy vacancy;
    private boolean isRequest;

    public Function<Vacancy, Void> saveHandler;

    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Messages messages;
    @Autowired
    private DepartmentService departmentService;

    @ViewComponent
    private Span position;
    @ViewComponent
    private Span department;
    @ViewComponent
    private Span salaryMin;
    @ViewComponent
    private Span salaryMax;
    @ViewComponent
    private Div condition;
    @ViewComponent
    private Div responsibility;
    @ViewComponent
    private Div requirement;
    @ViewComponent
    private Span education;
    @ViewComponent
    private Span experience;
    @ViewComponent
    private Span gender;
    @ViewComponent
    private Span workplaceQty;
    @ViewComponent
    private Span author;
    @ViewComponent
    private Span verifier;
    @ViewComponent
    private Span responsible;
    @ViewComponent
    private Span type;
    @ViewComponent
    private Span requestStatus;
    @ViewComponent
    private Span status;
    @ViewComponent
    private Span hot;

    public void withSaveHandler(Function<Vacancy, Void> saveHandler) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setVacancy(Vacancy vacancy, boolean isRequest) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDetails() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initJobDescription() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initRequest() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}