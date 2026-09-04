package com.smartbox.jobster.view.employee.personeducation;

import com.smartbox.jobster.entity.core.PersonEducation;
import com.smartbox.jobster.view.main.MainView;
import com.smartbox.jobster.view.employee.personhistory.PersonHistoryListView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "personEducations", layout = MainView.class)
@ViewController("jb_PersonEducation.list")
@ViewDescriptor("person-education-list-view.xml")
@DialogMode(width = "64em")
public class PersonEducationListView extends PersonHistoryListView<PersonEducation> {
    @Override
    protected Class<PersonEducation> getPersonHistoryClass() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}