package com.smartbox.jobster.view.user;

import com.smartbox.jobster.entity.User;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "employee-users", layout = MainView.class)
@ViewController("jb_EmployeeUser.list")
@ViewDescriptor("employee-user-list-view.xml")
public class EmployeeUserListView extends AbstractListView<User> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public void loadNotEmployeeUsers(User user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}