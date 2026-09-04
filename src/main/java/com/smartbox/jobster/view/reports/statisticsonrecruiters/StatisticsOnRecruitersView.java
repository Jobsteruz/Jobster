package com.smartbox.jobster.view.reports.statisticsonrecruiters;


import com.smartbox.jobster.$;
import com.smartbox.jobster.component.filter.FilterComboBoxSupport;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.smartbox.jobster.view.reports.statisticsonrecruiters.poistionrecruiterchart.PositionRecruiterChartFilter;
import com.smartbox.jobster.view.reports.statisticsonrecruiters.poistionrecruiterchart.PositionRecruiterChartView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.chartsflowui.component.Chart;
import io.jmix.chartsflowui.data.item.MapDataItem;
import io.jmix.chartsflowui.kit.component.model.DataSet;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.model.KeyValueCollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Route(value = "statistics-on-recruiters-view", layout = MainView.class)
@ViewController("jb_StatisticsOnRecruitersView")
@ViewDescriptor("statistics-on-recruiters-view.xml")
public class StatisticsOnRecruitersView extends AbstractHasPeriodReport {
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private FilterComboBoxSupport filterComboBoxSupport;

    @ViewComponent
    private KeyValueCollectionLoader applicantRecruiterDl;
    @ViewComponent
    private CollectionContainer<Position> positionsDc;
    @ViewComponent
    private VerticalLayout positionsCharts;
    @ViewComponent
    private KeyValueCollectionLoader applicantsCountDl;
    @ViewComponent
    private CollectionLoader<Position> positionsDl;
    @ViewComponent
    private EntityComboBox<Employee> employeesComboBox;
    @ViewComponent
    private Chart applicantRecruiterPercentageChart;
    @ViewComponent
    private KeyValueCollectionContainer applicantRecruiterDc;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("employeesComboBox")
    public void onEmployeesComboBoxComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Employee>, Employee> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    private void buildPositionCharts() {
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
}