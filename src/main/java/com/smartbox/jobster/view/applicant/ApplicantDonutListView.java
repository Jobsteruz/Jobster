package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.core.PersonStatus;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Route(value = "applicants/donut", layout = MainView.class)
@ViewController(id = "jb_ApplicantDonutListView")
@ViewDescriptor(path = "applicant-donut-list-view.xml")
public class ApplicantDonutListView extends AbstractApplicantListView {
    private String status;
    private UUID kanbanId;
    private OffsetDateTime fromDate;
    private OffsetDateTime toDate;

    @ViewComponent
    private H3 headerTitle;

    @Autowired
    private ApplicantService applicantService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;

    @Override
    public void onQueryParametersChange(QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onTimerTimerAction(io.jmix.flowui.facet.Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private String getHeaderByStatus(PersonStatus personStatus) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDepartmentHierarchyColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, CancelReason> rejectReasonCache = Collections.emptyMap();

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoadRejectReason(final CollectionLoader.PostLoadEvent<Applicant> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.rejectReason", subject = "renderer")
    private Renderer<Applicant> entityDataGridRejectReasonRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.edit")
    public void onEntityDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
