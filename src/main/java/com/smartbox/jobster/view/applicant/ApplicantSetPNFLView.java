package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.ExitEmployee;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.router.Route;
import io.jmix.core.FetchPlan;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "applicantSetPNFL/:id", layout = MainView.class)
@ViewController(id = "jb_Applicant_Set_PNFL.detail")
@ViewDescriptor(path = "applicant-set-pnfl-view.xml")
@EditedEntityContainer("applicantDc")
public class ApplicantSetPNFLView extends AbstractDetailView<Applicant> {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private InstanceNameProvider instanceNameProvider;

    @ViewComponent
    private TypedTextField<String> pinfl;


    @Subscribe(id = "check", subject = "clickListener")
    public void onCheckClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void showEmployeeDialog(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}