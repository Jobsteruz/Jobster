package com.smartbox.jobster.view.reports.stage_entity_movement.applicant_movement;


import com.smartbox.jobster.entity.company.BranchType;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.entity.hrm.Employee;
import com.smartbox.jobster.entity.hrm.Position;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.kanban.KanbanStageHistoryService;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentDTO;
import com.smartbox.jobster.service.restservices.dashboard.DashboardComponentType;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.reports.stage_entity_movement.AbstractEntityMovement;
import com.smartbox.jobster.view.reports.stage_entity_movement.MonthlyInterval;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import io.jmix.core.entity.KeyValueEntity;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.text.NumberFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.*;

@Route(value = "applicant-movement-view", layout = MainView.class)
@ViewController("jb_ApplicantMovementView")
@ViewDescriptor("applicant-movement-view.xml")
public class ApplicantMovementView extends AbstractEntityMovement {

    private static final Logger log = LoggerFactory.getLogger(ApplicantMovementView.class);
    @Autowired
    private KanbanStageHistoryService kanbanStageHistoryService;
    private final Map<MonthlyInterval, Map<KanbanStage, Long>> stageEntityCount = new LinkedHashMap<>();
    @ViewComponent
    private JmixSelect<Position> positions;
    @ViewComponent
    private JmixSelect<BranchType> branchTypes;
    @ViewComponent
    private JmixSelect<Department> departments;
    @ViewComponent
    private JmixSelect<Employee> responsible;
    @ViewComponent
    private CollectionLoader<Position> positionsDl;
    @ViewComponent
    private CollectionLoader<BranchType> branchTypesDl;
    @ViewComponent
    private CollectionLoader<Department> departmentsDl;
    @ViewComponent
    private CollectionLoader<Employee> responsibleDl;
    @ViewComponent
    private JmixSelect<PersonStatus> personStatus;

    @Override
    public void onBeforeShow(BeforeShowEvent event) {
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

    @Subscribe("positions")
    public void onPositionsComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("branchTypes")
    public void onBranchTypesComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("departments")
    public void onDepartmentsComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("responsible")
    public void onResponsibleComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("personStatus")
    public void onPersonStatusComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected ValueProvider<KeyValueEntity, Serializable> getValueProvider(MonthlyInterval interval) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Serializable getValue(MonthlyInterval interval, KeyValueEntity keyValueEntity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private @NotNull ApplicantMovementDto getReportDto(MonthlyInterval interval) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Long getMaxEntitiesCount(MonthlyInterval interval) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void build(){
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public List<DashboardComponentDTO> getComponents(String locale) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}