package com.smartbox.jobster.view.reports.rejectionbystagesreport;


import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.abstracthasperiodreport.AbstractHasPeriodReport;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.multiselectcombobox.JmixMultiSelectComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.KeyValueCollectionContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route(value = "rejection-by-stages-report", layout = MainView.class)
@ViewController(id = "jb_RejectionByStagesReport")
@ViewDescriptor(path = "rejection-by-stages-report.xml")
public class RejectionByStagesReport extends AbstractHasPeriodReport {
    private static final Logger log = LoggerFactory.getLogger(RejectionByStagesReport.class);
    private List<KanbanStage> kanbanStages;

    @Autowired
    private TranslateService translateService;

    @ViewComponent
    private KeyValueCollectionContainer reportContainer;
    @ViewComponent
    private DataGrid<KeyValueEntity> dataGrid;
    @ViewComponent
    private CollectionLoader<User> userDl;
    @ViewComponent
    private CollectionLoader<Position> positionDl;
    @ViewComponent
    private CollectionLoader<Department> departmentDl;
    @ViewComponent
    private JmixMultiSelectComboBox<Position> positionField;
    @ViewComponent
    private JmixMultiSelectComboBox<Department> departmentField;
    @ViewComponent
    private JmixMultiSelectComboBox<User> responsibleField;

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

    @Subscribe("positionField")
    public void onPositionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<Position>, Position> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departmentField")
    public void onDepartmentFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<Department>, Department> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("responsibleField")
    public void onResponsibleFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixMultiSelectComboBox<User>, User> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "clearAll", subject = "clickListener")
    public void onClearAllClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected void load() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}