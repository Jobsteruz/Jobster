package com.smartbox.jobster.view.navigation.role;

import com.smartbox.jobster.entity.ui.NavigationRole;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "navigationRoles/:id", layout = MainView.class)
@ViewController("jb_NavigationRole.detail")
@ViewDescriptor("navigation-role-detail-view.xml")
@EditedEntityContainer("navigationRoleDc")
@DialogMode(width = "25em", height = "AUTO")
public class NavigationRoleDetailView extends AbstractDetailView<NavigationRole> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}