package com.smartbox.jobster.view.cancelreason;

import com.flowingcode.vaadin.addons.twincolgrid.TwinColGrid;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.Messages;
import io.jmix.core.SaveContext;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Route(value = "cancel-reason-role-type-view", layout = MainView.class)
@ViewController(id = "jb_CancelReasonRoleTypeView")
@ViewDescriptor(path = "cancel-reason-role-type-view.xml")
@DialogMode(width = "50em", height = "45em")
public class CancelReasonRoleTypeView extends StandardView {

    @Autowired
    private DataManager dataManager;

    @Autowired
    private Messages messages;

    @ViewComponent
    private VerticalLayout twinColGridContainer;

    @ViewComponent
    private CollectionLoader<CancelReason> cancelReasonsDl;

    @ViewComponent
    private CollectionLoader<RoleType> roleTypesDl;

    private TwinColGrid<CancelReason> twinColGrid;
    private RoleType selectedRoleType;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("roleTypeField")
    public void onRoleTypeFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<EntityComboBox<RoleType>, RoleType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void loadRoleReasons() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean hasRole(CancelReason reason, UUID roleTypeId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private TwinColGrid<CancelReason> createTwinColGrid() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "cancelBtn", subject = "clickListener")
    public void onCancelBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveBtn", subject = "clickListener")
    public void onSaveBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "saveAndCloseBtn", subject = "clickListener")
    public void onSaveAndCloseBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private boolean saveChanges() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}