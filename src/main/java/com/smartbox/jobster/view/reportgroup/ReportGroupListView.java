package com.smartbox.jobster.view.reportgroup;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ReportAccordionPanel;
import com.smartbox.jobster.component.ReportDiv;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.report.ReportGroup;
import com.smartbox.jobster.entity.report.ReportKanbanStage;
import com.smartbox.jobster.entity.report.ReportView;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.service.ReportService;
import com.smartbox.jobster.service.ViewService;
import io.jmix.multitenancy.core.TenantProvider;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.UiComponents;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.app.inputdialog.DialogActions;
import io.jmix.flowui.app.inputdialog.DialogOutcome;
import io.jmix.flowui.app.inputdialog.InputParameter;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.accordion.JmixAccordion;
import io.jmix.flowui.component.checkboxgroup.JmixCheckboxGroup;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.radiobuttongroup.JmixRadioButtonGroup;
import io.jmix.flowui.component.tabsheet.JmixTabSheet;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.model.InstanceContainer;
import io.jmix.flowui.view.*;
import io.jmix.securityflowui.view.resourcepolicy.ResourcePolicyViewUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

@Route(value = "reportGroups", layout = MainView.class)
@ViewController("jb_ReportGroup.list")
@ViewDescriptor("report-group-list-view.xml")
@DialogMode(width = "64em")
public class ReportGroupListView extends AbstractNavigationListView<ReportGroup> {
    private ReportView reportView;
    private String query;
    private boolean save;
    private boolean change;

    @Autowired
    private DataManager dataManager;
    @Autowired
    private ViewService viewService;
    @Autowired
    private ResourcePolicyViewUtils resourcePolicyViewUtils;
    @ViewComponent
    private MessageBundle messageBundle;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Notifications notifications;
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private ReportService reportService;
    @Autowired
    private ViewValidation viewValidation;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TenantProvider tenantProvider;

    @ViewComponent
    private JmixButton createGroup;
    @ViewComponent
    private Tab reportTab;
    @ViewComponent
    private Tab addReportTab;
    @ViewComponent
    private Tab customReportTab;

    @ViewComponent
    private InstanceContainer<ReportView> reportDc;
    @ViewComponent
    private JmixComboBox<String> viewIdField;
    @ViewComponent
    private JmixRadioButtonGroup<String> kanbanStagesField;
    @ViewComponent
    private JmixCheckboxGroup<KanbanStage> stagesCheckboxGroup;
    @ViewComponent
    private VerticalLayout stagesLayout;
    @ViewComponent
    private EntityComboBox<ReportGroup> groupField;
    @ViewComponent
    private TypedTextField<String> shortNameField;
    @ViewComponent
    private JmixTabSheet tabSheet;
    @ViewComponent
    private VerticalLayout addReport;
    @ViewComponent
    private CollectionLoader<ReportGroup> reportGroupsDl;
    @ViewComponent
    private CollectionContainer<ReportGroup> reportGroupsDc;
    @ViewComponent
    private VerticalLayout reports;
    @ViewComponent
    private EntityComboBox<Kanban> kanbanField;
    @ViewComponent
    private VerticalLayout reportLeft;
    @ViewComponent
    private VerticalLayout reportRight;
    @ViewComponent
    private HorizontalLayout loader;
    @ViewComponent
    private HorizontalLayout favoriteReports;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("timer")
    public void onTimerTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void applyPaymentRestriction() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe(id = "createGroup", subject = "clickListener")
    public void onCreateGroupClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanbanField")
    public void onKanbanFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Kanban>,
            Kanban> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanbanStagesField")
    public void onKanbanStagesFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixRadioButtonGroup<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveReport", subject = "clickListener")
    public void onSaveReportClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelReport", subject = "clickListener")
    public void onCancelReportClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("tabSheet")
    public void onTabSheetSelectedChange(final JmixTabSheet.SelectedChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "viewIdField", subject = "itemLabelGenerator")
    private String viewIdFieldItemLabelGenerator(final String viewId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "groupField", subject = "itemLabelGenerator")
    private String groupFieldItemLabelGenerator(final ReportGroup reportGroup) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("ConstantConditions")
    private void setUpReportsTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // report builder
    private void saveReport() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setItemsToComponents() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setUpUIReportBuilderTab() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean isAll() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    // Boshqa tabga o'tib ketsa confirim so'raladigan joyi qo'lda qilingan
    private void confirmSaveDialog() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<ReportKanbanStage> transferKanbanStagesToReportKanbanStages(Set<KanbanStage> kanbanStages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private List<KanbanStage> transferReportKanbanStagesToKanbanStages(List<ReportKanbanStage> reportKanbanStages) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void setReport() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public CollectionLoader<ReportGroup> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}