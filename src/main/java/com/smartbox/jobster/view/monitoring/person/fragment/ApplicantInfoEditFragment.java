package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.*;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.ref.*;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractCustomDetailView;
import com.smartbox.jobster.view.abstractview.DeferredLoads;
import com.smartbox.jobster.view.vacancy.VacancyListView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@FragmentDescriptor("applicant-info-edit-fragment.xml")
public class ApplicantInfoEditFragment extends Fragment<VerticalLayout> implements AbstractCustomDetailView {
    public Function<Person, Void> cancelHandler;
    public Function<Person, Void> saveHandler;
    private TreeComboBox<Region> region;

    @Autowired
    private ViewValidation viewValidation;
    @Autowired
    private EmployeeService employeeService;

    @ViewComponent
    private InstanceContainer<Applicant> applicantDc;
    @ViewComponent
    private CollectionLoader<MaritalStatus> maritalStatusDl;
    @ViewComponent
    private CollectionLoader<Country> countryDl;
    @ViewComponent
    private CollectionLoader<Education> educationDl;
    @ViewComponent
    private CollectionLoader<Experience> experienceDl;
    @ViewComponent
    private CollectionLoader<WorkSchedule> workScheduleDl;
    @ViewComponent
    private CollectionLoader<SalaryLevel> salaryLevelDl;
    @ViewComponent
    private CollectionLoader<PersonCategory> personCategoryDl;
    @ViewComponent
    private CollectionLoader<PersonGroup> personGroupDl;
    @ViewComponent
    private CollectionLoader<RefSource> refSourceDl;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;
    @ViewComponent
    private TypedTextField<Object> location;
    @ViewComponent
    private TypedTextField<Department> department;
    @ViewComponent
    private TypedTextField<Position> position;
    @ViewComponent
    private TypedTextField<User> author;
    @ViewComponent
    private VerticalLayout root;
    @ViewComponent
    private TypedTextField<String> firstName;
    @ViewComponent
    private TypedTextField<String> lastName;
    @ViewComponent
    private TypedTextField<String> middleName;
    @ViewComponent
    private TypedTextField<String> fullName;
    @ViewComponent
    private EntityComboBox<Vacancy> vacancy;
    @Getter
    @ViewComponent
    private DropdownButton menuBar;
    @ViewComponent
    private TypedDatePicker<OffsetDateTime> birthDate;
    @ViewComponent
    private JmixSelect<Gender> gender;
    @ViewComponent
    private EntityComboBox<MaritalStatus> maritalStatus;
    @ViewComponent
    private TypedTextField<Integer> numOfChildren;
    @ViewComponent
    private TypedTextField<String> email;
    @ViewComponent
    private TypedTextField<String> phone;
    @ViewComponent
    private TypedTextField<String> phone2;
    @Autowired
    private Messages messages;
    @ViewComponent
    private EntityComboBox<Country> country;
    @ViewComponent
    private JmixTextArea address;
    @ViewComponent
    private TypedTextField<String> postalCode;
    @ViewComponent
    private JmixTextArea address2;
    @ViewComponent
    private EntityComboBox<Country> resident;
    @ViewComponent
    private TypedTextField<String> passportNumber;
    @ViewComponent
    private TypedTextField<String> pinfl;
    @ViewComponent
    private JmixTextArea passportMemo;
    @ViewComponent
    private TypedTextField<String> passportIssuedBy;
    @ViewComponent
    private TypedDatePicker<LocalDate> passportDateOfIssue;
    @ViewComponent
    private TypedDatePicker<LocalDate> passportExpiredDate;
    @ViewComponent
    private EntityComboBox<Education> education;
    @ViewComponent
    private EntityComboBox<Experience> experience;
    @ViewComponent
    private EntityPicker<Employee> responsible;
    @ViewComponent
    private EntityComboBox<WorkSchedule> workSchedule;
    @ViewComponent
    private EntityComboBox<SalaryLevel> salaryLevel;
    @ViewComponent
    private EntityComboBox<Position> offeredPosition;
    @ViewComponent
    private EntityComboBox<PersonCategory> category;
    @ViewComponent
    private EntityComboBox<PersonGroup> group;
    @ViewComponent
    private JmixTextArea memo;
    @ViewComponent
    private JmixSelect<Platform> platform;
    @ViewComponent
    private EntityComboBox<RefSource> source;
    @ViewComponent
    private JmixSelect<PersonStatus> status;
    @ViewComponent
    private TypedTextField<Double> score;
    @ViewComponent
    private Div regionBox;

    // Read-only rows the card shows and this form mirrors: the code of the vacancy the candidate
    // applied for, and everything about the employee they became.
    @ViewComponent
    private TypedTextField<String> vacancyCode;
    @ViewComponent
    private TypedTextField<String> requestCode;

    @ViewComponent
    private VerticalLayout employeeBox;
    @ViewComponent
    private TypedTextField<String> employeeUser;
    @ViewComponent
    private TypedTextField<String> employeeRoleType;
    @ViewComponent
    private TypedTextField<String> employeeStaffNumber;
    @ViewComponent
    private TypedTextField<String> employeePosition;
    @ViewComponent
    private TypedTextField<String> employeeDepartment;
    @ViewComponent
    private TypedTextField<String> employeeDateEmployment;
    @ViewComponent
    private TypedTextField<String> employeeDateStartWork;
    @ViewComponent
    private TypedTextField<String> employeeExitDate;
    @ViewComponent
    private TypedTextField<String> employeeExitReason;
    @ViewComponent
    private Anchor ispringLink;

    @ViewComponent
    private Div eduBoxBody;
    @ViewComponent
    private Div expBoxBody;
    @ViewComponent
    private Div lanEmptyBox;
    @ViewComponent
    private Div lanHistoryBox;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private PersonHistoryBoxes personHistoryBoxes;


    public void withSaveHandler(Function<Person, Void> saveHandler) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void withCancelHandler(Function<Person, Void> cancelHandler) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("firstName")
    public void onFirstNameComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("lastName")
    public void onLastNameComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("middleName")
    public void onMiddleNameComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("location")
    public void onLocationComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "vacancy.entityLookup", subject = "viewConfigurer")
    private void vacancyEntityLookupViewConfigurer(final VacancyListView view) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("vacancy")
    public void onVacancyComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Vacancy>, Vacancy> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "applicantDc", target = Target.DATA_CONTAINER)
    public void onApplicantDcItemChange(final InstanceContainer.ItemChangeEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The vacancy and request codes of the "Вакансия" panel. Read-only: they belong to the vacancy
     * the picker above them selects, so they follow it rather than being typed.
     */
    private void applyVacancyCodes(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * "Информация о трудоустройстве" - what the candidate became once hired. Matched by PINFL, the
     * same way the card does it, and fetched off the UI thread because both lookups are slow enough
     * to have shown up in prod thread dumps.
     */
    private void initEmployee(Applicant applicant) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void applyEmployee(Employee employee, EmployeePinfl employeePinfl) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initRegionComponent() {
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
}