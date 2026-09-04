package com.smartbox.jobster.view.ref.refgroup;

import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.entity.ref.RefGroup;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;

@Route(value = "refGroups", layout = MainView.class)
@ViewController("jb_RefGroup.list")
@ViewDescriptor("ref-group-list-view.xml")
@LookupComponent("refGroupsDataGrid")
@DialogMode(width = "64em")
public class RefGroupListView extends AbstractNavigationListView<RefGroup> {
    private String query;

    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<RefGroup> refGroupsDc;
    @ViewComponent
    private InstanceContainer<RefGroup> refGroupDc;
    @ViewComponent
    private InstanceLoader<RefGroup> refGroupDl;
    @ViewComponent
    private VerticalLayout listLayout;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private VerticalLayout references;
    @ViewComponent
    private CollectionLoader<RefGroup> refGroupsDl;
    @ViewComponent
    private CodeField codeField;

    @Override
    public CollectionLoader<RefGroup> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("refGroupsDataGrid.create")
    public void onRefGroupsDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("refGroupsDataGrid.edit")
    public void onRefGroupsDataGridEdit(final ActionPerformedEvent event) {
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

    @Subscribe(id = "refGroupsDc", target = Target.DATA_CONTAINER)
    public void onRefGroupsDcItemChange(final InstanceContainer.ItemChangeEvent<RefGroup> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(RefGroup entity) {
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
}