package com.smartbox.jobster.view.reports.hiringreport.detailsrecruitervacanciesreport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.renderers.SerializableRenderer;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.hrm.VacancyStatus;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.grid.DataGridColumn;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.NumberFormat;
import java.time.OffsetDateTime;
import java.util.List;

@Route(value = "details-recruiter-vacancies-report", layout = MainView.class)
@ViewController(id = "jb_DetailsRecruiterVacanciesReport")
@ViewDescriptor(path = "details-recruiter-vacancies-report.xml")
@DialogMode(width = "75%", height = "80%", resizable = true, closeOnEsc = true)
public class DetailsRecruiterVacanciesReport extends AbstractReportView {
    @Setter
    private OffsetDateTime from;
    @Setter
    private OffsetDateTime to;
    @Setter
    private User recruiter;

    private Kanban kanban;

    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private DataGrid<KeyValueEntity> dataGrid;

    @Autowired
    private EntityService entityService;
    @Autowired
    private Messages messages;


    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.verifiedDate", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridVerifiedDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.closedDate", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridClosedDateRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.status", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridStatusRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.avgDays", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridAvgDaysRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setKanban(Kanban kanban) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}