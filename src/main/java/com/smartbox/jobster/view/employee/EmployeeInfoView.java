package com.smartbox.jobster.view.employee;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.view.abstractview.AbstractPersonInfoView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "employee-info-view", layout = MainView.class)
@ViewController("jb_EmployeeInfoView")
@ViewDescriptor("employee-info-view.xml")
public class EmployeeInfoView extends AbstractPersonInfoView<Employee> {
    @Autowired
    private ViewNavigators viewNavigators;

    @ViewComponent
    private Span gender;
    @ViewComponent
    private Span user;
    @ViewComponent
    private Span maritalStatus;
    @ViewComponent
    private Span birthDate;
    @ViewComponent
    private Span department;
    @ViewComponent
    private Span employmentType;
    @ViewComponent
    private Span education;
    @ViewComponent
    private Span dateEmployment;
    @ViewComponent
    private Span experience;
    @ViewComponent
    private Span roleType;
    @ViewComponent
    private Span salaryLevel;
    @ViewComponent
    private Span salary;
    @ViewComponent
    private Span salaryBonus;
    @ViewComponent
    private Span workSchedule;
    @ViewComponent
    private Span rfid;
    @ViewComponent
    private Span position;

    @Subscribe(id = "edit", subject = "clickListener")
    public void onEditClick(final ClickEvent<JmixButton> event) {
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

    @Override
    protected void setUpAdditionalInformationAccordion() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected Class<Employee> getPersonClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}