package com.smartbox.jobster.view.substitution;

import com.smartbox.jobster.$;
import com.smartbox.jobster.bean.JbLoginViewSupport;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.security.specific.UiEditGenericFilterEnabled;
import com.smartbox.jobster.service.FilterService;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.grid.ItemDoubleClickEvent;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.component.grid.DataGrid;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.component.genericfilter.GenericFilter;
import io.jmix.flowui.facet.SettingsFacet;
import io.jmix.flowui.facet.Timer;
import io.jmix.flowui.view.*;
import com.vaadin.flow.component.DetachEvent;
//import io.jmix.groupgridflowui.component.GroupDataGrid;
//import io.jmix.groupgridflowui.data.BaseGroupPropertyDescriptor;
//import io.jmix.groupgridflowui.kit.vaadin.grid.ItemDoubleClickEvent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;


@Route(value = "substitution", layout = MainView.class)
@ViewController(id = "user_Substitution.list")
@ViewDescriptor(path = "user-substitution-view.xml")
@LookupComponent("companiesDataGrid")
@DialogMode(width = "64em")
public class UserSubstitutionView extends StandardListView<Company> {

    @ViewComponent
    private DataGrid<Company> companiesDataGrid;
    @ViewComponent
    private CollectionLoader<User> usersDl;
    @Autowired
    private Dialogs dialogs;
    @Autowired
    private Messages messages;
    @ViewComponent
    private DataGrid<User> usersDataGrid;
    @Autowired
    private JbLoginViewSupport jbLoginViewSupport;
    @ViewComponent
    private TypedTextField<String> tenantField;
    @ViewComponent
    private CollectionLoader<Company> companiesDl;
    @Autowired
    private RoleService roleService;
    @Autowired
    private FilterService filterService;
    @ViewComponent
    private GenericFilter genericFilter;
    @ViewComponent
    private SettingsFacet settings;

    @Subscribe("timer")
    public void onTimerAction(final Timer.TimerActionEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onDetachEvent(final DetachEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Map<UUID, String> roleTypeCache = Collections.emptyMap();

    @Subscribe(id = "usersDl", target = Target.DATA_LOADER)
    public void onUsersDlPostLoadRoleTypes(final CollectionLoader.PostLoadEvent<User> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Supply(to = "usersDataGrid.roleType", subject = "renderer")
    private Renderer<User> usersDataGridRoleTypeRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("companiesDataGrid")
    public void onCompaniesDataGridSelection(final SelectionEvent<DataGrid<Company>, Company> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("usersDataGrid")
    public void onUsersDataGridItemDoubleClick(final ItemDoubleClickEvent<User> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("usersDataGrid.substitute")
    public void onUsersDataGridSubstitute(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void substitute() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void substituteUser(User user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}