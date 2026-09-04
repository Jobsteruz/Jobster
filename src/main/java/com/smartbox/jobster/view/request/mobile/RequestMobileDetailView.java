package com.smartbox.jobster.view.request.mobile;

import com.google.common.base.Strings;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.translation.TranslateRichTextEditor;
import com.smartbox.jobster.entity.ats.Currency;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.DepartmentService;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.VacancyService;
import com.smartbox.jobster.view.abstractview.AbstractCustomDetailView;
import com.smartbox.jobster.view.abstractview.AbstractQuestionnaireEntityDetailView;
import com.smartbox.jobster.view.abstractview.HasParamView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.NativeLabel;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.component.textfield.JmixIntegerField;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.dropdownbutton.DropdownButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;

@Route(value = "mobileRequests/:id", layout = MainView.class)
@ViewController(id = "jb_RequestMobile.detail")
@ViewDescriptor(path = "request-mobile-detail-view.xml")
@EditedEntityContainer("vacancyDc")
public class RequestMobileDetailView extends AbstractQuestionnaireEntityDetailView<Vacancy> implements AbstractCustomDetailView, HasParamView {
    private Navigation navigation;
    private TreeComboBox<Department> departmentTreeComboBox;

    @ViewComponent
    private VerticalLayout positionContainer;
    @ViewComponent
    private NativeLabel vacancyCode;
    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private CollectionContainer<Position> positionDc;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private EntityComboBox<WorkSchedule> scheduleField;
    @ViewComponent
    private MessageBundle messageBundle;

    @Autowired
    private UserService userService;
    @Autowired
    private Messages messages;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private VacancyService vacancyService;
    @ViewComponent
    private DropdownButton menuBar;
    @ViewComponent
    private EntityComboBox<RequestType> requestTypeField;
    @ViewComponent
    private EntityComboBox<PersonGroup> personGroupField;
    @ViewComponent
    private TypedTextField<BigDecimal> salaryMinField;
    @ViewComponent
    private TypedTextField<BigDecimal> salaryMaxField;
    @ViewComponent
    private JmixComboBox<Currency> currencyField;
    @ViewComponent
    private JmixIntegerField workplaceQtyField;
    @ViewComponent
    private TypedDatePicker<OffsetDateTime> requiredDateField;
    @ViewComponent
    private JmixComboBox<RequestStatus> requestStatusField;
    @ViewComponent
    private JmixSelect<Priority> priority;
    @ViewComponent
    private EntityComboBox<Experience> experienceField;
    @ViewComponent
    private EntityComboBox<Education> educationField;
    @ViewComponent
    private TranslateRichTextEditor responsibilityField;
    @ViewComponent
    private JmixTextArea probation;


    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
    public void setNavigation(Navigation navigation) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public JSONObject params() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Vacancy> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionField")
    public void onPositionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void initDepartmentComponent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void updatePositionItems(Department department) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void setDepartment(Department department) {
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

    private void applyHiddenFields() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}