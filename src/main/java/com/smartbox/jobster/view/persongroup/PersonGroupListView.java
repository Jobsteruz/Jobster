package com.smartbox.jobster.view.persongroup;

import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "person-groups", layout = MainView.class)
@ViewController(id = "jb_PersonGroup.list")
@ViewDescriptor(path = "person-group-list-view.xml")
@DialogMode(width = "64em")
public class PersonGroupListView extends AbstractListView<PersonGroup> {


    @ViewComponent
    private MessageBundle messageBundle;


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}