package com.smartbox.jobster.view.reports.mix_report_by_source;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.ref.RefSource;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.RefSourceService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.componentfactory.TreeComboBox;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.grid.FooterRow;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@Route(value = "Mix-report-by-source", layout = MainView.class)
@ViewController(id = "jb_MixReportBySource")
@ViewDescriptor(path = "Mix-report-by-source.xml")
public class MixReportBySource extends AbstractHasPeriodReport {
    private List<CancelReason> cancelReasons = new ArrayList<>();

    @ViewComponent
    private DataGrid<KeyValueEntity> sourceTable;
    @Autowired
    private RefSourceService refSourceService;
    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private CollectionLoader<Kanban> kanbanDl;
    @ViewComponent
    private JmixSelect<Kanban> kanban;
    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private JmixSelect<Position> position;
    @ViewComponent
    private HorizontalLayout deptLayout;
    private TreeComboBox<Department> departmentFilter;
    @Autowired
    private Messages messages;
    @Autowired
    private EntityService entityService;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanban")
    public void onKanbanComponentValueChange(
            final AbstractField.ComponentValueChangeEvent<JmixSelect<Kanban>, Kanban> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("position")
    public void onPositionComponentValueChange(
            final AbstractField.ComponentValueChangeEvent<JmixSelect<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "refresh", subject = "clickListener")
    public void onRefreshClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}