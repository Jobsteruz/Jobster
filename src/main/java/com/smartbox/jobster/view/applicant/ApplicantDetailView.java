package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.ref.*;
import com.smartbox.jobster.view.abstractview.AbstractCustomDetailView;
import com.smartbox.jobster.view.abstractview.AbstractPersonDetailView;
import com.smartbox.jobster.view.cvparser.CvParserV2Dialog;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.EntityStates;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.component.accordion.JmixAccordion;
import io.jmix.flowui.component.accordion.JmixAccordionPanel;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixBigDecimalField;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.JmixNumberField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.upload.FileStorageUploadField;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Map;

@Route(value = "applicants/:id", layout = MainView.class)
@ViewController("jb_Applicant.detail")
@ViewDescriptor("applicant-detail-view.xml")
@EditedEntityContainer("applicantDc")
@DialogMode(width = "80em", height = "100%")
public class ApplicantDetailView extends AbstractPersonDetailView<Applicant> implements AbstractCustomDetailView {

    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityStates entityStates;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    /**
     * Lazy/cached options for the heavy reference fields so opening an applicant no longer loads the
     * whole Position / Employee tables into the session. The fields keep their value binding
     * (dataContainer/property), so the applicant's saved position/responsible still renders.
     */
    @Subscribe
    public void onInitLazyOptions(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ViewComponent
    private JmixCheckbox employeeOrNot;
    @ViewComponent
    private JmixAccordion vacancyAccordion;
    @ViewComponent
    private SettingsFacet settings;
    @ViewComponent
    private DropdownButton menuBar;
    @ViewComponent
    private FileStorageUploadField photoField;
    @ViewComponent
    private TypedTextField<String> firstName;
    @ViewComponent
    private TypedTextField<String> lastName;
    @ViewComponent
    private TypedTextField<String> middleName;
    @ViewComponent
    private JmixRadioButtonGroup<Gender> gender;
    @ViewComponent
    private EntityComboBox<MaritalStatus> maritalStatus;
    @ViewComponent
    private JmixIntegerField numOfChildren;
    @ViewComponent
    private TypedDatePicker<OffsetDateTime> birthDate;
    @ViewComponent
    private EntityComboBox<RefSource> refSource;
    @ViewComponent
    private EntityComboBox<Position> offeredPosition;
    @ViewComponent
    private EntityComboBox<Country> resident;
    @ViewComponent
    private TypedTextField<String> passNumber;
    @ViewComponent
    private TypedTextField<String> pinfl;
    @ViewComponent
    private TypedTextField<String> passIssuedBy;
    @ViewComponent
    private TypedDatePicker<LocalDate> passDateIssue;
    @ViewComponent
    private TypedDatePicker<LocalDate> passExpiredDate;
    @ViewComponent
    private JmixTextArea memo;
    @ViewComponent
    private EntityComboBox<Country> country;
    @ViewComponent
    private EntityComboBox<Region> region;
    @ViewComponent
    private TypedTextField<String> postalCode;
    @ViewComponent
    private TypedTextField<String> address1;
    @ViewComponent
    private TypedTextField<String> address2;
    @ViewComponent
    private JmixBigDecimalField latitude;
    @ViewComponent
    private JmixBigDecimalField longitude;
    @ViewComponent
    private TypedTextField<String> phone;
    @ViewComponent
    private TypedTextField<String> email;
    @ViewComponent
    private TypedTextField<Position> position;
    @ViewComponent
    private TypedTextField<Department> department;
    @ViewComponent
    private TypedTextField<EmploymentType> employmentType;
    @ViewComponent
    private EntityComboBox<Education> education;
    @ViewComponent
    private EntityComboBox<Experience> experience;
    @ViewComponent
    private EntityComboBox<SalaryLevel> salaryLevel;
    @ViewComponent
    private EntityComboBox<WorkSchedule> workSchedule;
    @ViewComponent
    private JmixNumberField score;
    @ViewComponent
    private EntityComboBox<PersonCategory> category;
    @ViewComponent
    private JmixTextArea description;
    @ViewComponent
    private EntityPicker<Vacancy> vacancy;
    @ViewComponent
    private EntityComboBox<Employee> responsible;


    @Override
    public void onBeforeShow(BeforeShowEvent event) {
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
    public String getViewId() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public Map<Component, String> getCustomComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cvParserBtn", subject = "clickListener")
    public void onCvParserBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // After the dialog persists a new applicant, discard this edit view and navigate to the
    // read-only kanban info view so the user lands on the just-saved applicant.
    private void onApplicantSavedFromCvParser(Applicant saved) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}