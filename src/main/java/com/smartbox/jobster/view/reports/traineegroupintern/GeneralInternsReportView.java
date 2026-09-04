package com.smartbox.jobster.view.reports.traineegroupintern;

import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.trainee.TraineeGroupIntern;
import com.smartbox.jobster.service.TraineeService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Route(value = "general-interns-report", layout = MainView.class)
@ViewController(id = "jb_GeneralInternsReportView")
@ViewDescriptor(path = "general-interns-report-view.xml")
@LookupComponent("dataGrid")
@DialogMode(width = "64em")
public class GeneralInternsReportView extends AbstractHasPeriodReport {

    @Autowired
    private TraineeService traineeService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @ViewComponent
    private CollectionLoader<TraineeGroupIntern> traineeGroupInternsDl;

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

    private Map<UUID, Employee> mentorCache = Collections.emptyMap();

    @Subscribe(id = "traineeGroupInternsDl", target = Target.DATA_LOADER)
    public void onTraineeGroupInternsDlPostLoadMentors(final CollectionLoader.PostLoadEvent<TraineeGroupIntern> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.mentor", subject = "renderer")
    private Renderer<TraineeGroupIntern> traineeGroupInternsDataGridMentorRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}