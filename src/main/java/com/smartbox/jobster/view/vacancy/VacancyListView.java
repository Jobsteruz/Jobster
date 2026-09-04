package com.smartbox.jobster.view.vacancy;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ClosedApplicantsColumnHelper;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.UserIntegration;
import com.smartbox.jobster.entity.ats.Applicant;
import com.smartbox.jobster.entity.ats.Message;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.company.Department;
import com.smartbox.jobster.entity.core.HasName;
import com.smartbox.jobster.entity.core.JbEntity;
import com.smartbox.jobster.entity.hrm.Vacancy;
import com.smartbox.jobster.entity.hrm.VacancyState;
import com.smartbox.jobster.entity.hrm.VacancyStatus;
import com.smartbox.jobster.entity.integration.IntegratedUser;
import com.smartbox.jobster.entity.integration.IntegratedVacancy;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.tg.Bot;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.security.specific.*;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.service.hh.HHEmployerService;
import com.smartbox.jobster.service.hh.HHVacancyService;
import com.smartbox.jobster.service.person.ApplicantService;
import com.smartbox.jobster.service.whatsapp.WhatsappBotService;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.action.mass.vacancy.VacancyRejectActionView;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.message.MessageDetailView;
import com.smartbox.jobster.view.monitoring.v3.Monitoring3;
import com.smartbox.jobster.view.vacancy.hhsync.HHSyncView;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import com.vaadin.flow.server.VaadinSession;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.list.ItemTrackingAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

@Route(value = "vacancies", layout = MainView.class)
@ViewController("jb_Vacancy.list")
@ViewDescriptor("vacancy-list-view.xml")
public class VacancyListView extends AbstractListView<Vacancy> {


    @Setter
    private boolean isLookup;

    @Autowired
    private UserService userService;
    @Autowired
    private HHEmployerService hHEmployerService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Dialogs dialogs;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private HHVacancyService hHVacancyService;
    @Autowired
    private CurrentAuthentication currentAuthentication;
    @ViewComponent("entityDataGrid.urlWhatsApp")
    private ItemTrackingAction<Object> entityDataGridUrlWhatsApp;
    @ViewComponent("add")
    private JmixButton addBtn;
    @ViewComponent
    private JmixButton closeVacancyBtn;
    @Autowired
    private WhatsappBotService whatsappBotService;
    @Autowired
    private ClosedApplicantsColumnHelper closedApplicantsColumnHelper;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private ApplicantService applicantService;

    private Map<UUID, List<Applicant>> closedApplicantsCache = Collections.emptyMap();
    private Map<UUID, Long> openedWorkPositionsCache = Collections.emptyMap();
    private Map<UUID, List<IntegratedVacancy>> integratedVacanciesCache = Collections.emptyMap();
    private Map<UUID, Long> monitoringApplicantsCache = Collections.emptyMap();

    // department preselected by the vacancy map screen (jb_VacancyMapView popup link)
    private UUID mapDeptId;

    // the parent chain already owns onQueryParametersChange (AbstractNavigationListView), hence the distinct name
    @Subscribe
    public void onVacancyMapParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    protected VacancyState getDefaultVacancyState() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addClosedApplicantsColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "entityDl", target = Target.DATA_LOADER)
    public void onEntityDlPostLoadClosedApplicants(final CollectionLoader.PostLoadEvent<Vacancy> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * How many of the vacancy's candidates are currently on a monitoring board. The number is a
     * shortcut into monitoring — clicking it opens the board filtered to this vacancy, so it is
     * rendered as a badge; a zero keeps the same badge but disabled, since there would be nothing
     * to show there.
     */
    private void addCandidatesInMonitoringColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.openMonitoring")
    public void onEntityDataGridOpenMonitoring(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Opens the monitoring board holding this vacancy's candidates, pre-filtered to the vacancy.
     * The board is reached through its own menu entry when it has one, so the monitoring version
     * (v1/v2/v3) and the navigation id configured for the tenant are preserved.
     */
    private void openMonitoring(Vacancy vacancy) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDepartmentHierarchyColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addCurrentWorkplaceQtyColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addDaysOpenColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addPublishedPlatformsColumn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addIfPublished(HorizontalLayout layout, Set<Platform> addedPlatforms, Boolean published, Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Image addPlatformImage(Platform platform) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("sync")
    public void onSync(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.url")
    public void onEntityDataGridUrl(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.urlWhatsApp")
    public void onEntityDataGridUrlWhatsApp(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("entityDataGrid.utmUrl")
    public void onEntityDataGridUtmUrl(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.platform", subject = "renderer")
    private Renderer<Vacancy> entityDataGridPlatformRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.close")
    public void onEntityDataGridClose(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.massSending")
    public void onEntityDataGridMassSending(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.changeResponsible")
    public void onEntityDataGridChangeResponsible(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityDataGrid.close", subject = "enabledRule")
    private boolean entityDataGridCloseEnabledRule() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.status", subject = "renderer")
    private Renderer<Vacancy> entityDataGridStatusRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openAuthorizationPopup() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.condition", subject = "renderer")
    private Renderer<Vacancy> entityDataGridConditionRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.requirement", subject = "renderer")
    private Renderer<Vacancy> entityDataGridRequirementRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "entityDataGrid.responsibility", subject = "renderer")
    private Renderer<Vacancy> entityDataGridResponsibilityRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.archivedHH")
    public void onEntityDataGridArchivedHH(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid")
    public void onEntityDataGridSelection(final SelectionEvent<DataGrid<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}