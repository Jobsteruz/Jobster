package com.smartbox.jobster.view.reports.closerequestreport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.JbUserZonedDateTime;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.FilterEnterPressHandler;
import com.smartbox.jobster.component.renderers.SerializableRenderer;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.hrm.RequestStatus;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.service.FilterService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.component.datepicker.TypedDatePicker;
import io.jmix.flowui.component.genericfilter.Configuration;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.grid.DataGridColumn;
import io.jmix.flowui.component.gridcolumnvisibility.JmixGridColumnVisibility;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import io.jmix.gridexportflowui.action.ExcelExportAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@Route(value = "close-request-report-view", layout = MainView.class)
@ViewController(id = "jb_CloseRequestReportView")
@ViewDescriptor(path = "close-request-report-view.xml")
public class CloseRequestReport extends AbstractHasPeriodReport implements FilterEnterPressHandler {

    private boolean loaderLoaded = false;

    @Autowired
    private FilterService filterService;
    @Autowired
    private JbUserZonedDateTime jbUserZonedDateTime;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private InstanceNameProvider instanceNameProvider;

    @ViewComponent
    private DataGrid<Vacancy> dataGrid;
    @ViewComponent
    private CollectionContainer<Vacancy> requestContainer;

    @ViewComponent
    private GenericFilter genericFilter;
    @ViewComponent
    private JmixMultiSelectComboBox<Object> filter;
    @ViewComponent
    private Icon filterBtn;
    @ViewComponent
    private SettingsFacet settings;

    @ViewComponent
    private JmixGridColumnVisibility columnVisibility;
    @ViewComponent
    private CollectionLoader<Vacancy> reportDl;
    @ViewComponent("dataGrid.printExcel")
    private ExcelExportAction dataGridPrintExcel;


    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onFromComponentValueChange(AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>, LocalDate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onToComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedDatePicker<LocalDate>,
            LocalDate> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.priority", subject = "renderer")
    private Renderer<Vacancy> dataGridPriorityRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.requestStatus", subject = "renderer")
    private Renderer<Vacancy> dataGridRequestStatusRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.fillDate", subject = "renderer")
    private Renderer<Vacancy> dataGridFillDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.verifiedDate", subject = "renderer")
    private Renderer<Vacancy> dataGridVerifiedDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpDepartmentColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpWorkPlaceQtyColumns() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public CollectionLoader<Vacancy> getFilterDataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public GenericFilter getGenericFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @ClientCallable
    public void handleFilterEnterPress(String text) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}