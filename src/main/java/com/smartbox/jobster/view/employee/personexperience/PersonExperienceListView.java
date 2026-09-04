package com.smartbox.jobster.view.employee.personexperience;

import com.smartbox.jobster.entity.core.PersonExperience;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.employee.personhistory.PersonHistoryListView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "personExperiences", layout = MainView.class)
@ViewController("jb_PersonExperience.list")
@ViewDescriptor("person-experience-list-view.xml")
@DialogMode(width = "64em")
public class PersonExperienceListView extends PersonHistoryListView<PersonExperience> {
    @Override
    protected Class<PersonExperience> getPersonHistoryClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}