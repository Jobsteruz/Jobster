package com.smartbox.jobster.view.persongroup;

import com.smartbox.jobster.entity.core.PersonGroup;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "person-groups/:id", layout = MainView.class)
@ViewController(id = "jb_PersonGroup.detail")
@ViewDescriptor(path = "person-group-detail-view.xml")
@EditedEntityContainer("personGroupDc")
@DialogMode(width = "40em", height = "AUTO")
public class PersonGroupDetailView extends AbstractDetailView<PersonGroup> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
