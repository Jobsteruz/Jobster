package com.smartbox.jobster.view.reports.generalreportperson;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.VacancyState;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.GeneralReportScreenService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.person.ApplicantKanbanInfoView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.genericfilter.Configuration;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Route(value = "general-report-screen", layout = MainView.class)
@ViewController(id = "jb_GeneralReportScreen")
@ViewDescriptor(path = "general-report-screen.xml")
public class GeneralReportScreen extends AbstractReportView {
    @Autowired
    private TranslateService translateService;
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    @Autowired
    private Messages messages;
    @Autowired
    private KanbanService kanbanService;
    @Autowired
    private GeneralReportScreenService generalReportScreenService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @ViewComponent
    private DataGrid<Applicant> dataGrid;
    @ViewComponent
    private GenericFilter genericFilter;

    private boolean filterListenersRegistered;
    private Configuration lastAppliedConfig;
    private int lastAppliedComponentCount = -1;


    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpFilter() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void applyFilterComponentItems(Configuration configuration) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildBoardStage() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.rejectDate", subject = "renderer")
    private Renderer<Applicant> dataGridRejectDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.rejectReason", subject = "renderer")
    private Renderer<Applicant> dataGridRejectReasonRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("dataGrid")
    public void onDataGridItemDoubleClick(final ItemDoubleClickEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}