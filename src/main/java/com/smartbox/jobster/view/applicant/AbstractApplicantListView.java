package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.abstractview.OpenMode;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.EntityStates;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public abstract class AbstractApplicantListView extends AbstractListView<Applicant> {


    @Value("${app.url}")
    private String appUrl;

    @ViewComponent
    protected MessageBundle messageBundle;

    @Autowired
    protected DataManager dataManager;
    @Autowired
    protected EntityStates entityStates;
    @Autowired
    protected DialogWindows dialogWindows;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void addAgeColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.birthDate", subject = "renderer")
    private Renderer<Applicant> entityDataGridBirthDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.edit")
    public void onEntityDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.create")
    public void onEntityDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.status", subject = "renderer")
    private Renderer<Applicant> entityDataGridStatusRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void navigationApplicantInfoView(Applicant applicant, boolean editable) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onEntityDataGridSelection(final SelectionEvent<DataGrid<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}