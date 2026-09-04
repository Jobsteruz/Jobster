package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("duplicate-candidate-fragment.xml")
public class DuplicateCandidateFragment extends Fragment<VerticalLayout> {
    @ViewComponent
    private Span candidateDepartment;
    @ViewComponent
    private Span candidateFillDate;
    @ViewComponent
    private Span candidatePosition;
    @ViewComponent
    private Span candidateStatus;
    @ViewComponent
    private Span candidateUser;
    @ViewComponent
    private Span candidatePlatform;
    @ViewComponent
    private Avatar candidateUserAvatar;
    @ViewComponent
    private VerticalLayout candidateStatusBox;
    @ViewComponent
    private VerticalLayout candidatePlatformBox;
    @ViewComponent
    private HorizontalLayout candidatePositionBox;
    @ViewComponent
    private HorizontalLayout candidateDepartmentBox;
    @ViewComponent
    private HorizontalLayout candidateFillDateBox;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private Messages messages;
    @Autowired
    private EmployeeService employeeService;

    private String locale;


    public void setPersonData(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildFillDate(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildEmployeeCard(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildApplicantCard(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setVacancyDetails(Position position, Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildStatus(PersonStatus status) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}