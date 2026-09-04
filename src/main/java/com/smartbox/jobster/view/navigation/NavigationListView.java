package com.smartbox.jobster.view.navigation;

import com.smartbox.jobster.component.code.CodeField;
import com.smartbox.jobster.entity.ui.Navigation;
import com.smartbox.jobster.service.ViewService;
import com.smartbox.jobster.view.abstractview.AbstractNavigationListView;
import com.smartbox.jobster.view.icon.IconView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import io.jmix.securityflowui.view.resourcepolicy.ResourcePolicyViewUtils;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "navigations", layout = MainView.class)
@ViewController("jb_Navigation.list")
@ViewDescriptor("navigation-list-view.xml")
@LookupComponent("navigationsDataGrid")
@DialogMode(width = "64em")
public class NavigationListView extends AbstractNavigationListView<Navigation> {
    private String query;

    @ViewComponent
    private CollectionLoader<Navigation> parentNavigationDl;
    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<Navigation> navigationsDc;
    @ViewComponent
    private CollectionLoader<Navigation> navigationsDl;
    @ViewComponent
    private InstanceContainer<Navigation> navigationDc;
    @ViewComponent
    private InstanceLoader<Navigation> navigationDl;
    @ViewComponent
    private VerticalLayout listLayout;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private JmixComboBox<String> viewField;
    @ViewComponent
    private JmixButton jsonHelpBtn;
    @ViewComponent
    private TypedTextField<String> iconField;
    @ViewComponent
    private VerticalLayout rolesLayout;
    @ViewComponent
    private CodeField codeField;

    @Autowired
    private ViewService viewService;
    @Autowired
    private ResourcePolicyViewUtils resourcePolicyViewUtils;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;

    @Override
    public CollectionLoader<Navigation> dataLoader() {
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

    @Subscribe("navigationsDataGrid.create")
    public void onNavigationsDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("navigationsDataGrid.edit")
    public void onNavigationsDataGridEdit(final ActionPerformedEvent event) {
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

    @Subscribe(id = "navigationsDc", target = Target.DATA_CONTAINER)
    public void onNavigationsDcItemChange(final InstanceContainer.ItemChangeEvent<Navigation> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "viewField", subject = "itemLabelGenerator")
    private Object viewFieldItemLabelGenerator(final String viewId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("viewField")
    public void onViewFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixComboBox<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "iconMoreBtn", subject = "clickListener")
    public void onIconMoreBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "iconClearBtn", subject = "clickListener")
    public void onIconClearBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "jsonHelpBtn", subject = "clickListener")
    public void onJsonHelpBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    /**
     * Reference help for the navigation JSON "hiddenFields" config, shown from the "?" button
     * next to the JSON editor. Lists the component ids (from the mobile request view) that can be
     * hidden, including "createBtn" which removes the "Create request" button. Field names are
     * pulled from the existing Vacancy.* message keys so the doc is localized automatically.
     */
    private String buildJsonHelpContent() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(Navigation entity) {
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