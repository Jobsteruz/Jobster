package com.smartbox.jobster.view.roletype;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.service.RoleService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.component.twincolumn.TwinColumn;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;
import io.jmix.security.model.ResourceRoleModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Route(value = "roleTypes/:id", layout = MainView.class)
@ViewController("jb_RoleType.detail")
@ViewDescriptor("role-type-detail-view.xml")
@EditedEntityContainer("roleTypeDc")
@DialogMode(width = "50%", height = "AUTO")
public class RoleTypeDetailView extends AbstractDetailView<RoleType> {
    @ViewComponent
    private TypedTextField<String> machineName;
    @ViewComponent
    private CollectionContainer<ResourceRoleModel> resourceRolesDc;
    @ViewComponent
    private TwinColumn<ResourceRoleModel> twin;
    @Autowired
    private RoleService roleService;


    @Subscribe
    public void onInitEntity(final InitEntityEvent<RoleType> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("nameField")
    public void onNameFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<TypedTextField<String>, String> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}