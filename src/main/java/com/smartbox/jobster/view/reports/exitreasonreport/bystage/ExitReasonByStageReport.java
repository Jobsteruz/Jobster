package com.smartbox.jobster.view.reports.exitreasonreport.bystage;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "exit-reason-by-stage-report", layout = MainView.class)
@ViewController(id = "jb_ExitReasonByStageReport")
@ViewDescriptor(path = "exit-reason-by-stage-report.xml")
public class ExitReasonByStageReport extends AbstractHasPeriodReport {
    private static final Logger log = LoggerFactory.getLogger(ExitReasonByStageReport.class);
    private List<KanbanStage> kanbanStages;

    @Autowired
    private TranslateService translateService;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private DataGrid<KeyValueEntity> reportGrid;

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
}