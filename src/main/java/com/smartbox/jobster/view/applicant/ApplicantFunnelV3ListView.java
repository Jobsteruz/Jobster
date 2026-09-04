package com.smartbox.jobster.view.applicant;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.service.*;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import io.jmix.core.InstanceNameProvider;
import io.jmix.core.Messages;
import io.jmix.core.MetadataTools;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Route(value = "applicants/funnel-v3", layout = MainView.class)
@ViewController(id = "jb_ApplicantFunnelV3ListView")
@ViewDescriptor(path = "applicant-funnel-v3-list-view.xml")
public class ApplicantFunnelV3ListView extends StandardView {

    private UUID stageId;
    private UUID kanbanId;
    private OffsetDateTime fromDate;
    private OffsetDateTime toDate;
    private List<UUID> lifecycleApplicantIds = List.of();
    private final Map<UUID, UUID> cloneToOriginalMap = new HashMap<>();

    @ViewComponent
    private CollectionContainer<Applicant> entityDc;
    @ViewComponent
    private CollectionLoader<Applicant> entityDl;
    @ViewComponent
    private DataGrid<Applicant> entityDataGrid;
    @ViewComponent
    private H3 headerTitle;

    @Autowired
    private FunnelV3ReportService funnelV3ReportService;
    @Autowired
    private EntityService entityService;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private ApplicantService applicantService;
    @Autowired
    private InstanceNameProvider instanceNameProvider;
    @Autowired
    private MetadataTools metadataTools;
    @Autowired
    private Messages messages;

    @Subscribe
    public void onQueryParametersChange(QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addClonesForDuplicates() {
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
}
