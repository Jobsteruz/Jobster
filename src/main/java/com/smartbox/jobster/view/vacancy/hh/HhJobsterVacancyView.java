package com.smartbox.jobster.view.vacancy.hh;


import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.hrm.VacancyStatus;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.entity.integration.IntegratedVacancy;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.VacancyService;
import com.smartbox.jobster.service.hh.HHVacancyService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Route(value = "hh-jobster-vacancy-view", layout = MainView.class)
@ViewController(id = "jb_HhJobsterVacancyView")
@ViewDescriptor(path = "hh-jobster-vacancy-view.xml")
public class HhJobsterVacancyView extends AbstractNavigationView {
    @Autowired
    protected DataManager dataManager;
    @Autowired
    private HHVacancyService hHVacancyService;

    @Autowired
    private VacancyService vacancyService;

    @ViewComponent
    private KeyValueCollectionContainer integratedVacancyDc;
    @ViewComponent
    private EntityComboBox<Department> departmentField;
    @ViewComponent
    private TypedTextField<Object> codeField;
    @ViewComponent
    private EntityComboBox<Position> positionField;
    @ViewComponent
    private JmixSelect<Object> statusField;
    @ViewComponent
    private EntityComboBox<User> responsibleField;
    @Autowired
    private UserService userService;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentField")
    public void onDepartmentFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Department>, Department> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("positionField")
    public void onPositionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("responsibleField")
    public void onResponsibleFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<User>, User> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("statusField")
    public void onStatusFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("codeField")
    public void onCodeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}