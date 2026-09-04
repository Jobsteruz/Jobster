package com.smartbox.jobster.view.abstractview;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.core.Passport;
import com.smartbox.jobster.entity.core.PersonContact;
import com.smartbox.jobster.entity.core.StandardTenantEntity;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.employee.AbstractPersonComponentListView;
import com.smartbox.jobster.view.employee.personcontact.PersonContactDetailView;
import com.smartbox.jobster.view.employee.persondocument.PersonDocumentListView;
import com.smartbox.jobster.view.employee.personeducation.PersonEducationListView;
import com.smartbox.jobster.view.employee.personexperience.PersonExperienceListView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.*;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.accordion.JmixAccordion;
import io.jmix.flowui.component.accordion.JmixAccordionPanel;
import io.jmix.flowui.component.image.JmixImage;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewValidation;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractPersonDetailView<T extends Passport> extends AbstractQuestionnaireEntityDetailView<T> {
    private final SaveContext saveContext = new SaveContext();

    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private ViewValidation viewValidation;
    @Autowired
    private DataManager dataManager;
    @Autowired
    protected Messages messages;
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TenantProvider tenantProvider;

    @ViewComponent
    private JmixAccordion informationAccordion;
    @ViewComponent
    private JmixImage<FileRef> photo;
    @ViewComponent
    private JmixAccordion passportAccordion;
    @ViewComponent
    private JmixAccordion addressAccordion;
    @ViewComponent
    private JmixAccordion contactAccordion;
    @ViewComponent
    private JmixAccordion informationWorkAccordion;
    @ViewComponent
    private JmixAccordion educationsAccordion;
    @ViewComponent
    private JmixAccordion experienceAccordion;
    @ViewComponent
    private JmixAccordion documentsAccordion;
    @ViewComponent
    private JmixAccordion additionalInformationAccordion;
    @ViewComponent
    private CollectionContainer<PersonContact> personContactDc;
    @ViewComponent
    private H3 pageTitle;
    @ViewComponent
    private Span codeValue;
    @ViewComponent
    private VerticalLayout contacts;
    @ViewComponent
    private CollectionLoader<PersonContact> personContactDl;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addContact", subject = "clickListener")
    public void onAddContactClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("saveAction")
    public void onSaveAction(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "editCode", subject = "clickListener")
    public void onEditCodeClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("ConstantConditions")
    protected void setUpComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private <E extends StandardTenantEntity> AbstractPersonComponentListView<E> createListView(
            Class<? extends AbstractPersonComponentListView<E>> listView) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected HorizontalLayout getAccordionHeader(String title, VaadinIcon icon) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
