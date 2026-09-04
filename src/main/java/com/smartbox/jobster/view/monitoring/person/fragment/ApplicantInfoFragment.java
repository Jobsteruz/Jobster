package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.EmployeePinfl;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.DeferredLoads;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.theme.lumo.LumoIcon;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

@FragmentDescriptor("applicant-info-fragment.xml")
public class ApplicantInfoFragment extends AbstractPersonInfoFragment<Applicant> {
    public Function<Applicant, Void> editHandler;

    private String locale;

    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;

    //personal-vacancy
    @ViewComponent
    private Span vacancyCode;
    @ViewComponent
    private Span requestCode;
    @ViewComponent
    private Span department;
    @ViewComponent
    private Span position;
    @ViewComponent
    private Span author;
    @ViewComponent
    private Span workSchedule;
    @ViewComponent
    private Span salary;
    @ViewComponent
    private Span salaryLevel;
    @ViewComponent
    private Span offeredPosition;

    //personal-additional-info
    @ViewComponent
    private Span category;
    @ViewComponent
    private Span group;
    @ViewComponent
    private Span responsible;
    @ViewComponent
    private Span memo;
    @ViewComponent
    private Span platform;
    @ViewComponent
    private Span source;
    @ViewComponent
    private Span utmSource;
    @ViewComponent
    private Span utmParam;
    @ViewComponent
    private Span status;
    @ViewComponent
    private Span score;
    @ViewComponent
    private Div infoBoxBody;
    @ViewComponent
    private Div contactBoxBody;
    @ViewComponent
    private Div addressBoxBody;
    @ViewComponent
    private Div pasBoxBody;
    @ViewComponent
    private Div eduBoxBody;
    @ViewComponent
    private Div expBoxBody;
    @ViewComponent
    private Div vacancyBoxBody;
    @ViewComponent
    private Div addInfoBoxBody;
    @ViewComponent
    private Div lanBoxBody;

    //personal-employment-info
    @ViewComponent
    private VerticalLayout employeeBox;
    @ViewComponent
    private Div employeeBoxBody;
    @ViewComponent
    private Span employeeUser;
    @ViewComponent
    private Span employeeRoleType;
    @ViewComponent
    private Span employeeStaffNumber;
    @ViewComponent
    private Span employeePosition;
    @ViewComponent
    private Span employeeDepartment;
    @ViewComponent
    private Span employeeDateEmployment;
    @ViewComponent
    private Span employeeDateStartWork;
    @ViewComponent
    private Span employeeExitDate;
    @ViewComponent
    private Span employeeExitReason;
    @ViewComponent
    private JmixButton dropEmployee;

    @ViewComponent
    private JmixButton dropInfo;
    @ViewComponent
    private JmixButton dropContact;
    @ViewComponent
    private JmixButton dropAddress;
    @ViewComponent
    private JmixButton dropPas;
    @ViewComponent
    private JmixButton dropEdu;
    @ViewComponent
    private JmixButton dropExp;
    @ViewComponent
    private JmixButton dropVacancy;
    @ViewComponent
    private JmixButton dropAddInfo;
    @ViewComponent
    private JmixButton dropLan;
    @ViewComponent
    private Anchor ispringLink;
    @ViewComponent
    private Image phoneTgIcon;
    @ViewComponent
    private Image phone2TgIcon;


    public void withEditHandler(Function<Applicant, Void> editHandler) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String locale() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editBtn", subject = "clickListener")
    public void onEditBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setApplicant(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initVacancy() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initAdditionInfo() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropInfo", subject = "clickListener")
    public void onDropInfoClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropContact", subject = "clickListener")
    public void onDropContactClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropAddress", subject = "clickListener")
    public void onDropAddressClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropPas", subject = "clickListener")
    public void onDropPasClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropEdu", subject = "clickListener")
    public void onDropEduClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropExp", subject = "clickListener")
    public void onDropExpClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropLan", subject = "clickListener")
    public void onDropLanClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropVacancy", subject = "clickListener")
    public void onDropVacancyClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropAddInfo", subject = "clickListener")
    public void onDropAddInfoClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initEmployee(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void applyEmployee(Employee employee, EmployeePinfl employeePinfl) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initTelegramLinks(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setupTgIcon(Image icon, String phoneNumber) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "dropEmployee", subject = "clickListener")
    public void onDropEmployeeClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String formatHhSalary(String salary) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void changeDisplay(Div box, JmixButton btn) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}