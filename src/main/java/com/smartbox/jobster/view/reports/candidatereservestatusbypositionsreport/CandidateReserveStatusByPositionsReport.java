package com.smartbox.jobster.view.reports.candidatereservestatusbypositionsreport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.applicant.ApplicantReservedListView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.AbstractReportView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "candidate-reserve-status-by-positions-report", layout = MainView.class)
@ViewController(id = "jb_CandidateReserveStatusByPositionsReport")
@ViewDescriptor(path = "candidate-reserve-status-by-positions-report.xml")
@DialogMode(width = "75%", minHeight = "50%", resizable = true)
public class CandidateReserveStatusByPositionsReport extends AbstractReportView {
    @ViewComponent
    private VerticalLayout positions;
    @ViewComponent
    private Span title;
    @ViewComponent
    private JmixButton showAll;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private ViewNavigators viewNavigators;
    @Autowired
    private DialogWindows dialogWindows;

    @Setter
    private boolean showAllParam;


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

    @Subscribe(id = "showAll", subject = "clickListener")
    public void onShowAllClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
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