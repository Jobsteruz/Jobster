package com.smartbox.jobster.view.menu;

import com.smartbox.jobster.$;
import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.component.translation.TranslateAreaField;
import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.tg.*;
import com.smartbox.jobster.service.TranslateService;
import com.smartbox.jobster.service.tg.BotService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.Renderer;
import com.vaadin.flow.data.selection.SelectionEvent;
import com.vaadin.flow.router.Route;
import io.jmix.core.Messages;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.component.HasRequired;
import io.jmix.flowui.component.UiComponentUtils;
import io.jmix.flowui.component.checkbox.JmixCheckbox;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.component.grid.TreeDataGrid;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Route(value = "menus", layout = MainView.class)
@ViewController("jb_Menu.list")
@ViewDescriptor("menu-list-view.xml")
@LookupComponent("menusDataGrid")
@DialogMode(width = "64em")
public class MenuListView extends StandardListView<Menu> {
    private static final Logger log = LoggerFactory.getLogger(MenuListView.class);

    @Getter
    @Setter
    private Bot bot;
    private String copyButtonText = null;

    @Autowired
    private BotService botService;
    @Autowired
    private Notifications notifications;
    @Autowired
    private TranslateService translateService;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private Messages messages;

    @ViewComponent
    private DataContext dataContext;
    @ViewComponent
    private CollectionContainer<Menu> menusDc;
    @ViewComponent
    private InstanceContainer<Menu> menuDc;
    @ViewComponent
    private InstanceLoader<Menu> menuDl;
    @ViewComponent
    private VerticalLayout listLayout;
    @ViewComponent
    private FormLayout form;
    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent
    private VerticalLayout postListLayout;
    @ViewComponent
    private VerticalLayout rolesLayout;
    @ViewComponent
    private CollectionLoader<Menu> menusDl;
    @ViewComponent
    private CollectionLoader<Menu> parentMenusDl;
    @ViewComponent
    private JmixSelect<PostType> postTypeField;
    @ViewComponent
    private EntityComboBox<Questionnaire> questionnaireField;
    @ViewComponent
    private CollectionLoader<Questionnaire> questionnairesDl;
    @ViewComponent
    private JmixSelect<LoginType> loginTypeField;
    @ViewComponent
    private TreeDataGrid<Menu> menusDataGrid;
    @ViewComponent
    private JmixButton menuBranchBtn;
    @ViewComponent
    private JmixCheckbox checkUpField;
    @ViewComponent
    private JmixButton copyQrCodeBtn;
    @ViewComponent
    private JmixCheckbox hotField;
    @ViewComponent
    private TranslateAreaField shareTextField;

    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("menusDataGrid.create")
    public void onMenusDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("menusDataGrid.edit")
    public void onMenusDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "clearCache", subject = "clickListener")
    public void onClearCacheClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("menusDataGrid")
    public void onMenusDataGridSelection(final SelectionEvent<TreeDataGrid<Menu>, Menu> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "copyQrCodeBtn", subject = "clickListener")
    public void onCopyQrCodeBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    @Subscribe("postTypeField")
    public void onPostTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<?>, ?> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void displayComponent(Component component, boolean visible) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "menuBranchBtn", subject = "clickListener")
    public void onMenuBranchBtnClick(final ClickEvent<JmixButton> event) {
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

    @Subscribe(id = "menusDc", target = Target.DATA_CONTAINER)
    public void onMenusDcItemChange(final InstanceContainer.ItemChangeEvent<Menu> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(Menu entity) {
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

    @Supply(to = "postsDataGrid.body", subject = "renderer")
    private Renderer<Post> postsDataGridBodyRenderer() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}