package com.smartbox.jobster.view.kanban;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.entity.kanban.Kanban;
import com.smartbox.jobster.entity.kanban.KanbanStage;
import com.smartbox.jobster.entity.kanban.KanbanTemplate;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.service.GenCodeService;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.service.kanban.KanbanService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.*;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.component.codeeditor.CodeEditor;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import io.jmix.securityflowui.view.resourcepolicy.ResourcePolicyViewUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "kanbans", layout = MainView.class)
@ViewController("jb_Kanban.list")
@ViewDescriptor("kanban-list-view.xml")
@LookupComponent("kanbansDataGrid")
@DialogMode(width = "64em")
public class KanbanListView extends AbstractNavigationListView<Kanban> {
    private String query;
    private SaveContext saveContext = new SaveContext();

    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<Kanban> kanbansDc;
    @ViewComponent
    private InstanceContainer<Kanban> kanbanDc;
    @ViewComponent
    private InstanceLoader<Kanban> kanbanDl;
    @ViewComponent
    private VerticalLayout listLayout;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private JmixComboBox<String> entityField;
    @ViewComponent
    private CollectionLoader<KanbanTemplate> templateDl;
    @ViewComponent
    private VerticalLayout stagesLayout;
    @ViewComponent
    private JmixComboBox<String> cardViewIdField;
    @ViewComponent
    private JmixComboBox<String> detailViewIdField;
    @ViewComponent
    private EntityComboBox<Navigation> listViewIdField;
    @ViewComponent
    private CodeEditor queryField;
    @ViewComponent
    private CollectionLoader<Kanban> kanbansDl;
    @ViewComponent
    private CodeField codeField;

    @Autowired
    private Metadata metadata;
    @Autowired
    private MessageTools messageTools;
    @Autowired
    private EntityService entityService;
    @Autowired
    private ResourcePolicyViewUtils resourcePolicyViewUtils;
    @Autowired
    private ViewService viewService;
    @ViewComponent
    private DataGrid<Kanban> kanbansDataGrid;
    @Autowired
    private MetadataTools metadataTools;
    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private GenCodeService genCodeService;
    @Autowired
    private DataManager dataManager;

    @Override
    public CollectionLoader<Kanban> dataLoader() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String query() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanbansDataGrid.create")
    public void onKanbansDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("kanbansDataGrid.copyKanban")
    public void onKanbansDataGridCopyKanban(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "singleClickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("kanbansDataGrid.edit")
    public void onKanbansDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityField", subject = "itemLabelGenerator")
    private Object entityFieldItemLabelGenerator(final String entityName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "cardViewIdField", subject = "itemLabelGenerator")
    private Object cardViewIdFieldItemLabelGenerator(final String viewId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "detailViewIdField", subject = "itemLabelGenerator")
    private Object detailViewIdFieldItemLabelGenerator(final String viewId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("listViewIdField")
    public void onListViewIdFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<Navigation>, Navigation> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityField")
    public void onEntityFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateQueryField() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveBtn")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("cancelBtn")
    public void onCancelButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "kanbansDc", target = Target.DATA_CONTAINER)
    public void onKanbansDcItemChange(final InstanceContainer.ItemChangeEvent<Kanban> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(Kanban entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void updateControls(boolean editing) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private ViewValidation getViewValidation() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}