package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.WorkSchedule;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.person.EmployeeService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.DataManager;
import io.jmix.core.FileRef;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import jakarta.persistence.Entity;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@FragmentDescriptor("person-vacancy-fragment.xml")
public class PersonVacancyFragment extends Fragment<VerticalLayout> {
    private String locale;
    private PersonDocument document;

    @ViewComponent
    private HorizontalLayout responsibleBox;
    @ViewComponent
    private Avatar responsibleAvatar;
    @ViewComponent
    private Span responsibleField;
    @ViewComponent
    private Span departmentField;
    @ViewComponent
    private Span positionField;
    @ViewComponent
    private Span platformField;
    //    @ViewComponent
//    private Anchor hhResumeUrlAnchor;
    @ViewComponent
    private VerticalLayout hhResumeWrapper;
    @ViewComponent
    private Span fillDateField;

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private Messages messages;
    @Autowired
    private Downloader downloader;
    @Autowired
    private DocumentService documentService;
    @ViewComponent
    private Span scheduleField;
    @ViewComponent
    private VerticalLayout scheduleBox;
    @Autowired
    private FileService fileService;
    @Autowired
    private UserService userService;
    @Autowired
    private DataManager dataManager;

    public void setPerson(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildCommons(Person person) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildEmployeeVacancy(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildApplicantVacancy(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "hhDocLink", subject = "clickListener")
    public void onHhDocLinkClick(final ClickEvent<Paragraph> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void setVacancyDetails(Position position, Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}