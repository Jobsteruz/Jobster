package com.smartbox.jobster.view.reports.pipelinecandidatesreport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.monitoring.v3.Monitoring3;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import io.jmix.core.FetchPlan;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Route(value = "pipeline-candidates-report", layout = MainView.class)
@ViewController(id = "jb_PipelineCandidatesReport")
@ViewDescriptor(path = "pipeline-candidates-report.xml")
public class PipelineCandidatesReport extends AbstractReportView {
    private long totalApplicants;

    @Autowired
    private EntityService entityService;
    @Autowired
    private TranslateService translateService;

    @ViewComponent
    private HorizontalLayout stages;
    @ViewComponent
    private MessageBundle messageBundle;
    @ViewComponent
    private Div allApplicantsCount;
    @ViewComponent
    private Span title;
    @Autowired
    private ViewNavigators viewNavigators;


    @Override
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

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

    private void addStage(KanbanStage stage, VerticalLayout vbox, int i) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void setTitleVisible() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}