package com.smartbox.jobster.view.checklist.template;

import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.checklist.AssignedDefault;
import com.smartbox.jobster.entity.checklist.template.TaskTemplate;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.ref.AutoFillTemplate;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.view.*;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "taskTemplates/:id", layout = MainView.class)
@ViewController("jb_TaskTemplate.detail")
@ViewDescriptor("task-template-detail-view.xml")
@EditedEntityContainer("taskTemplateDc")
@DialogMode(width = "40em", height = "AUTO")
public class TaskTemplateDetailView extends AbstractDetailView<TaskTemplate> {

    @Autowired
    private EntityService entityService;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @ViewComponent
    private EntityComboBox<Employee> assignedField;
    @ViewComponent
    private Select<AssignedDefault> assignedDefaultField;
    @ViewComponent
    private EntityComboBox<AutoFillTemplate> assignedNotificationField;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInitLazyOptions(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("assignedField")
    public void onAssignedFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Employee>, Employee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("assignedDefaultField")
    public void onAssignedDefaultFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<Select<AssignedDefault>, AssignedDefault> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
