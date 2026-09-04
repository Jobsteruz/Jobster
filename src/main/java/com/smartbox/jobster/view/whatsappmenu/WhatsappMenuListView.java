package com.smartbox.jobster.view.whatsappmenu;

import com.smartbox.jobster.entity.questionnaire.Questionnaire;
import com.smartbox.jobster.entity.tg.PostType;
import com.smartbox.jobster.entity.whatsapp.WhatsappBot;
import com.smartbox.jobster.entity.whatsapp.WhatsappMenu;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.Route;
import io.jmix.core.validation.group.UiCrossFieldChecks;
import io.jmix.flowui.component.formlayout.JmixFormLayout;
import io.jmix.flowui.component.grid.TreeDataGrid;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.component.validation.ValidationErrors;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.*;
import io.jmix.flowui.view.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "whatsappMenus", layout = MainView.class)
@ViewController("jb_WhatsappMenu.list")
@ViewDescriptor("whatsapp-menu-list-view.xml")
@LookupComponent("whatsappMenusDataGrid")
@DialogMode(width = "64em")
public class WhatsappMenuListView extends StandardListView<WhatsappMenu> {

    @Autowired
    private EntityService entityService;

    @Setter
    private WhatsappBot bot;

    @ViewComponent
    private CollectionLoader<WhatsappMenu> whatsappMenusDl;

    @ViewComponent
    private DataContext dataContext;

    @ViewComponent
    private CollectionContainer<WhatsappMenu> whatsappMenusDc;

    @ViewComponent
    private InstanceContainer<WhatsappMenu> whatsappMenuDc;

    @ViewComponent
    private InstanceLoader<WhatsappMenu> whatsappMenuDl;

    @ViewComponent
    private VerticalLayout listLayout;

    @ViewComponent
    private JmixFormLayout form;

    @ViewComponent
    private HorizontalLayout detailActions;
    @ViewComponent("detailsTab.postsLayoutTab")
    private Tab detailsTabPostsLayoutTab;
    @ViewComponent
    private VerticalLayout postsListLayout;
    @ViewComponent
    private TreeDataGrid<WhatsappMenu> whatsappMenusDataGrid;
    @ViewComponent
    private JmixSelect<Questionnaire> questionnaireField;


    @Subscribe
    public void onQueryParametersChange(final QueryParametersChangeEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("whatsappMenusDataGrid.create")
    public void onWhatsappMenusDataGridCreate(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("whatsappMenusDataGrid.edit")
    public void onWhatsappMenusDataGridEdit(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("saveBtn")
    public void onSaveButtonClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "whatsappMenusDc", target = Target.DATA_CONTAINER)
    public void onWhatsappMenusDcItemChange(final InstanceContainer.ItemChangeEvent<WhatsappMenu> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("postTypeField")
    public void onPostTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixSelect<PostType>, PostType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected ValidationErrors validateView(WhatsappMenu entity) {
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