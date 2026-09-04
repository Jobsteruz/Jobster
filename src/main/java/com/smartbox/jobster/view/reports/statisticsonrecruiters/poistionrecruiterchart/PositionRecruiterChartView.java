package com.smartbox.jobster.view.reports.statisticsonrecruiters.poistionrecruiterchart;


import com.smartbox.jobster.service.ReportService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.chartsflowui.component.Chart;
import io.jmix.chartsflowui.kit.component.model.Title;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "position-recruiter-chart-view", layout = MainView.class)
@ViewController("jb_PositionRecruiterChartView")
@ViewDescriptor("position-recruiter-chart-view.xml")
public class PositionRecruiterChartView extends StandardView {
    @Setter
    private PositionRecruiterChartFilter filter;

    @Autowired
    private InstanceNameProvider instanceNameProvider;

    @ViewComponent
    private Chart chart;
    @ViewComponent
    private KeyValueCollectionContainer applicantRecruiterByPositionDc;
    @Autowired
    private ReportService reportService;


    public void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}