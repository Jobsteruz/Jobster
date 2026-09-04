package com.smartbox.jobster.view.reports.requestauthorstatistics;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.ReportService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.smartbox.jobster.view.reports.lookup.applicant.ReportLookupApplicantListView;
import com.smartbox.jobster.view.reports.lookup.vacancy.ReportLookupVacancyListView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Locale;

@Route(value = "request-author-statistics", layout = MainView.class)
@ViewController(id = "jb_RequestAuthorStatistics")
@ViewDescriptor(path = "request-author-statistics.xml")
public class RequestAuthorStatistics extends AbstractHasPeriodReport {

    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private ReportService reportService;

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

    private RequestAuthorDTO dto() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.numOfActiveRequest", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridNumOfActiveRequestRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.numOfAllApplicant", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridNumOfAllApplicantRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.numOfClosedRequest", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridNumOfClosedRequestRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}