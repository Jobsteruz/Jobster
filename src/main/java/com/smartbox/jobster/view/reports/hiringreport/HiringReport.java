package com.smartbox.jobster.view.reports.hiringreport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.smartbox.jobster.view.reports.hiringreport.detailsrecruitervacanciesreport.DetailsRecruiterVacanciesReport;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.NumberFormat;
import java.util.List;

@Route(value = "hiring-report", layout = MainView.class)
@ViewController(id = "jb_HiringReport")
@ViewDescriptor(path = "hiring-report.xml")
public class HiringReport extends AbstractHasPeriodReport {
    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private DataGrid<KeyValueEntity> dataGrid;
    @ViewComponent
    private MessageBundle messageBundle;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private EntityService entityService;


    @Override
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("dataGrid")
    public void onDataGridItemDoubleClick(final ItemDoubleClickEvent<KeyValueEntity> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "dataGrid.avgClsVacancy", subject = "renderer")
    private Renderer<KeyValueEntity> dataGridAvgClsVacancyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

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
}