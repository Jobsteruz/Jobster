package com.smartbox.jobster.view.applicant.mobile;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.mobile.ApplicantCard;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractMobileListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.TimeSource;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.Target;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Route(value = "applicant-reserve-view", layout = MainView.class)
@ViewController("jb_ApplicantReserveView")
@ViewDescriptor("applicant-reserve-view.xml")
public class ApplicantReserveView extends AbstractMobileListView<Applicant> {
    private List<Department> empDepartments;

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private DepartmentService departmentService;

    @Override
    public void onTimerTimerAction(Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoad(final CollectionLoader.PostLoadEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build(List<Applicant> applicants) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<Applicant> nearestBranchApplicants(Double distance) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Integer reserveDays() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Double branchDist() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}