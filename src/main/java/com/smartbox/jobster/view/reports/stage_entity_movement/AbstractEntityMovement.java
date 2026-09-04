package com.smartbox.jobster.view.reports.stage_entity_movement;


import com.smartbox.jobster.bean.JbUserZonedDateTime;
import com.smartbox.jobster.component.renderers.SerializableRenderer;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.gridexportflowui.action.ExcelExportAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Route(value = "abstract-entity-movement", layout = MainView.class)
@ViewController("jb_AbstractEntityMovement")
@ViewDescriptor("abstract-entity-movement.xml")
public abstract class AbstractEntityMovement extends AbstractReportView {

    private static final String INTERVAL_CLN_PREFIX = "interval-cln-prefix-";
    @Autowired
    protected DataManager dataManager;
    @Autowired
    private Messages messages;

    @ViewComponent
    private JmixCheckbox percentage;
    @ViewComponent
    private KeyValueCollectionContainer keyValueCollectionDc;

    private List<KanbanStage> kanbanStages;
    @ViewComponent
    private JmixSelect<String> yearsList;
    @ViewComponent
    private DataGrid<KeyValueEntity> kvEntityGrid;

    @ViewComponent("kvEntityGrid.excelExportAction")
    private ExcelExportAction exportAction;
    @Autowired
    private JbUserZonedDateTime jbUserZonedDateTime;


    @Subscribe(id = "excelExportBtn", subject = "clickListener")
    public void onExcelExportBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "percentage", subject = "clickListener")
    public void onPercentageClick(final ClickEvent<JmixCheckbox> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("yearsList")
    public void onYearsListComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setupYearsList() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Integer year() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Boolean percentage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected String getReportFileName() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected abstract ValueProvider<KeyValueEntity, Serializable> getValueProvider(MonthlyInterval interval);
}