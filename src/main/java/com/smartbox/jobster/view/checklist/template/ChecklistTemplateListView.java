package com.smartbox.jobster.view.checklist.template;

import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.entity.checklist.template.ChecklistTemplate;
import com.smartbox.jobster.entity.checklist.template.TaskTemplate;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.core.Person;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "checklistTemplates", layout = MainView.class)
@ViewController("jb_ChecklistTemplate.list")
@ViewDescriptor("checklist-template-list-view.xml")
@LookupComponent("checklistTemplatesDataGrid")
@DialogMode(width = "64em")
public class ChecklistTemplateListView extends AbstractNavigationListView<ChecklistTemplate> {
    private String query;

    @ViewComponent
    private DataContext dataContext;

    @ViewComponent
    private CollectionContainer<ChecklistTemplate> checklistTemplatesDc;

    @ViewComponent
    private CollectionLoader<ChecklistTemplate> checklistTemplatesDl;

    @ViewComponent
    private InstanceContainer<ChecklistTemplate> checklistTemplateDc;

    @ViewComponent
    private InstanceLoader<ChecklistTemplate> checklistTemplateDl;

    @ViewComponent
    private VerticalLayout listLayout;

    @ViewComponent
    private FormLayout form;

    @ViewComponent
    private VerticalLayout taskListLayout;

    @ViewComponent
    private HorizontalLayout detailActions;

    @ViewComponent
    protected DataGrid<TaskTemplate> tasksDataGrid;

    @ViewComponent
    private MessageBundle messageBundle;

    @ViewComponent
    private CodeField codeField;

    @Autowired
    private EntityService entityService;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("checklistTemplatesDataGrid.create")
    public void onChecklistTemplatesDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("checklistTemplatesDataGrid.edit")
    public void onChecklistTemplatesDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveBtn")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cancelBtn")
    public void onCancelButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "checklistTemplatesDc", target = Target.DATA_CONTAINER)
    public void onChecklistTemplatesDcItemChange(final InstanceContainer.ItemChangeEvent<ChecklistTemplate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(ChecklistTemplate entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ViewValidation getViewValidation() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<ChecklistTemplate> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addAssignedColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}