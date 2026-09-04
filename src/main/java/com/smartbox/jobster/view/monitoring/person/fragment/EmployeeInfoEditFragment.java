package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.ref.*;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.person.EmployeeService;
import com.smartbox.jobster.view.abstractview.AbstractCustomDetailView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import io.jmix.core.Messages;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixBigDecimalField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.timepicker.TypedTimePicker;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.component.valuepicker.EntityPicker;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.Target;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewValidation;
import io.jmix.multitenancy.core.TenantProvider;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

@FragmentDescriptor("employee-info-edit-fragment.xml")
public class EmployeeInfoEditFragment extends Fragment<VerticalLayout> implements AbstractCustomDetailView {
    public Function<Person, Void> cancelHandler;
    public Function<Person, Void> saveHandler;
    private TreeComboBox<Region> region;

    @Autowired
    private Messages messages;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @Autowired
    private ViewValidation viewValidation;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;
    @Autowired
    private EntityService entityService;
    @Autowired
    private PersonHistoryBoxes personHistoryBoxes;

    @ViewComponent
    private InstanceContainer<Employee> employeeDc;
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
    private CollectionLoader<RoleType> roleTypeDl;
    @ViewComponent
    private TypedTextField<Object> location;
    @ViewComponent
    private Div staffingTables;
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
    private EntityComboBox<WorkSchedule> workSchedule;
    @ViewComponent
    private EntityComboBox<SalaryLevel> salaryLevel;
    @ViewComponent
    private EntityComboBox<PersonCategory> category;
    @ViewComponent
    private EntityComboBox<PersonGroup> group;
    @ViewComponent
    private JmixTextArea memo;
    @ViewComponent
    private EntityComboBox<Position> position;
    @ViewComponent
    private JmixBigDecimalField salary;
    @ViewComponent
    private JmixBigDecimalField salaryBonus;
    @ViewComponent
    private TypedTimePicker<OffsetTime> checkIn;
    @ViewComponent
    private JmixCheckbox autoCheckOut;
    @ViewComponent
    private EntityPicker<User> user;
    @ViewComponent
    private EntityComboBox<RoleType> roleType;
    @ViewComponent
    private TypedTimePicker<OffsetTime> checkOut;
    @ViewComponent
    private TypedTextField<String> staffNumber;
    @ViewComponent
    private TypedDatePicker<LocalDate> dateEmployment;
    @ViewComponent
    private TypedDatePicker<LocalDate> dateStartWork;
    @ViewComponent
    private Div regionBox;

    // Read-only rows the card shows and this form mirrors: they belong to the vacancy the employee
    // was hired against, or to its exit interview, so there is nothing here to edit.
    @ViewComponent
    private TypedTextField<String> vacancyCode;
    @ViewComponent
    private TypedTextField<String> requestCode;
    @ViewComponent
    private TypedTextField<String> department;
    @ViewComponent
    private TypedTextField<String> responsible;
    @ViewComponent
    private TypedTextField<String> offeredPosition;
    @ViewComponent
    private TypedTextField<String> exitDate;
    @ViewComponent
    private TypedTextField<String> exitReason;

    @ViewComponent
    private Div eduBoxBody;
    @ViewComponent
    private Div expBoxBody;
    @ViewComponent
    private Div lanEmptyBox;
    @ViewComponent
    private Div lanHistoryBox;


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

    @Subscribe(id = "employeeDc", target = Target.DATA_CONTAINER)
    public void onEmployeeDcItemChange(final InstanceContainer.ItemChangeEvent<Employee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Mirrors the card's "Вакансия" panel: the hiring context lives on the originating applicant and
     * its vacancy, not on the employee, so it is displayed and never edited here. Reloaded through
     * {@code applicant-vacancy-info} because the employee carries its applicant under an
     * instance-name plan only.
     */
    private void initApplicantVacancy(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * The two exit rows of "Информация о трудоустройстве". They live on {@code jb_ExitEmployee}, are
     * written by the exit interview, and stay read-only here.
     */
    private void initExitInfo(Employee employee) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String translate(JbEntity<UUID> entity, String shortName) {
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

    private Div makeStaffingTableBox(StaffingTable staffingTable) {
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