package com.smartbox.jobster.view.request.mobile;

import com.smartbox.jobster.component.mobile.RequestCard;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.*;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.view.abstractview.AbstractMobileListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "mobile-vacancies", layout = MainView.class)
@ViewController("jb_Request-mobile.list")
@ViewDescriptor("mobile-request-list-view.xml")
@DialogMode(width = "64em")
public class RequestListView extends AbstractMobileListView<Vacancy> {
    @Autowired
    private UserService userService;
    @ViewComponent
    private TypedTextField<Object> codeField;
    @ViewComponent
    private EntityComboBox<Department> departmentField;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private JmixSelect<Object> priorityField;
    @ViewComponent
    private EntityComboBox<Region> regionField;
    @ViewComponent
    private EntityComboBox<RequestType> requestTypeField;
    @ViewComponent
    private EntityComboBox<User> responsibleField;
    @ViewComponent
    private JmixSelect<Object> statusField;


    /**
     * Hides components listed in the navigation JSON "hiddenFields" array.
     * Mirrors {@code RequestMobileDetailView.applyHiddenFields()} so a single navigation
     * config drives both the form (detail) and the list. Adding "createBtn" removes the
     * "Create request" button from a view-only navigation.
     */
    @Subscribe
    public void onBeforeShowApplyHiddenFields(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onTimerTimerAction(Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoad(final CollectionLoader.PostLoadEvent<Vacancy> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onCreateBtnClick(ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("codeField")
    public void onCodeFieldChange(AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentField")
    public void onDepartmentFieldChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<Department>, Department> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionField")
    public void onPositionFieldChange(
            AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("regionField")
    public void onRegionFieldChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<Region>, Region> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("priorityField")
    public void onPriorityFieldChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<Priority>, Priority> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("requestTypeField")
    public void onRequestTypeFieldChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<RequestType>, RequestType> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("responsibleField")
    public void onResponsibleFieldChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<Employee>, Employee> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("statusField")
    public void onStatusFieldChange(AbstractField.ComponentValueChangeEvent<EntityComboBox<RequestStatus>, RequestStatus> e) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}