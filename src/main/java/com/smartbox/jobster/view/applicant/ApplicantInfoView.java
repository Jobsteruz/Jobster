package com.smartbox.jobster.view.applicant;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.view.abstractview.AbstractPersonInfoView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.accordion.JmixAccordion;
import io.jmix.flowui.component.accordion.JmixAccordionPanel;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "applicant-info-view", layout = MainView.class)
@ViewController("jb_ApplicantInfoView")
@ViewDescriptor("applicant-info-view.xml")
public class ApplicantInfoView extends AbstractPersonInfoView<Applicant> {
    @Autowired
    private ViewNavigators viewNavigators;

    @ViewComponent
    private Span gender;
    @ViewComponent
    private Span maritalStatus;
    @ViewComponent
    private Span birthDate;
    @ViewComponent
    private Span source;
    @ViewComponent
    private Span offeredPosition;
    @ViewComponent
    private Span employeeOrNot;
    @ViewComponent
    private Span department;
    @ViewComponent
    private Span employmentType;
    @ViewComponent
    private Span education;
    @ViewComponent
    private Span experience;
    @ViewComponent
    private Span salary;
    @ViewComponent
    private Span salaryLevel;
    @ViewComponent
    private Span workSchedule;
    @ViewComponent
    private Span position;
    @ViewComponent
    private Span latitude;
    @ViewComponent
    private Span longitude;
    @ViewComponent
    private JmixAccordion vacancyAccordion;
    @ViewComponent
    private Span vacancy;
    @ViewComponent
    private Span responsible;

    @Subscribe(id = "edit", subject = "clickListener")
    public void onEditClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Class<Applicant> getPersonClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void setUpInformationAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void setUpInformationWorkAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}