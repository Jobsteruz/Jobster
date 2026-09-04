package com.smartbox.jobster.view.roletype;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.entity.RoleType;
import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.Dialogs;
import io.jmix.flowui.action.DialogAction;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "roleTypes", layout = MainView.class)
@ViewController("jb_RoleType.list")
@ViewDescriptor("role-type-list-view.xml")
public class RoleTypeListView extends AbstractListView<RoleType> {


    @Autowired
    private Dialogs dialogs;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("entityDataGrid.apply")
    public void onEntityDataGridApply(final ActionPerformedEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void apply() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}