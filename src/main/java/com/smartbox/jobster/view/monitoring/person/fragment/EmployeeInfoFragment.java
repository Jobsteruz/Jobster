package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.ExitEmployee;
import com.smartbox.jobster.entity.hrm.StaffingTable;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

@FragmentDescriptor("employee-info-fragment.xml")
public class EmployeeInfoFragment extends AbstractPersonInfoFragment<Employee> {
    public Function<Employee, Void> editHandler;

    private String locale;

    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private EmployeeService employeeService;

    //personal-vacancy
    @ViewComponent
    private Div staffingTables;
    @ViewComponent
    private Span workSchedule;
    @ViewComponent
    private Span position;
    @ViewComponent
    private Span salaryLevel;
    @ViewComponent
    private Span salary;
    @ViewComponent
    private Span vacancyCode;
    @ViewComponent
    private Span requestCode;
    @ViewComponent
    private Span responsible;
    @ViewComponent
    private Span offeredPosition;
    @ViewComponent
    private Span department;
    @ViewComponent
    private Span salaryBonus;
    @ViewComponent
    private Div eduBoxBody;
    @ViewComponent
    private Div expBoxBody;

    //personal-employment-info
    @ViewComponent
    private Span user;
    @ViewComponent
    private Span roleType;
    @ViewComponent
    private Span staffNumber;
    @ViewComponent
    private Span dateEmployment;
    @ViewComponent
    private Span dateStartWork;
    @ViewComponent
    private Span exitDate;
    @ViewComponent
    private Span exitReason;

    //personal-additional-info
    @ViewComponent
    private Span category;
    @ViewComponent
    private Span group;
    @ViewComponent
    private Span memo;
    @ViewComponent
    private Span checkIn;
    @ViewComponent
    private Span checkOut;
    @ViewComponent
    private JmixCheckbox autoCheckOut;

    public void withEditHandler(Function<Employee, Void> editHandler) {
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

    public void setEmployee(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initVacancy() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Mirrors the applicant's "Вакансия" panel onto the employee, so the adaptation stage shows the
     * whole hiring context. Reloaded through {@code applicant-vacancy-info} because the employee
     * carries its applicant under an instance-name plan only.
     */
    private void initApplicantVacancy() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * "Информация о трудоустройстве" - who the employee is on the payroll and the four dates that
     * frame their employment. The exit date and reason live on {@code jb_ExitEmployee}, not on the
     * employee, so they cost one extra query; the employee simply has none until an exit interview
     * is filled in.
     */
    private void initEmploymentInfo() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initAdditionInfo() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Div makeStaffingTableBox(StaffingTable staffingTable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}