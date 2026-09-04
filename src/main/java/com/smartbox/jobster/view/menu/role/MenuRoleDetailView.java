package com.smartbox.jobster.view.menu.role;

import com.smartbox.jobster.entity.tg.MenuRole;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "menuRoles/:id", layout = MainView.class)
@ViewController("jb_MenuRole.detail")
@ViewDescriptor("menu-role-detail-view.xml")
@EditedEntityContainer("menuRoleDc")
@DialogMode(width = "25em", height = "AUTO")
public class MenuRoleDetailView extends AbstractDetailView<MenuRole> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}