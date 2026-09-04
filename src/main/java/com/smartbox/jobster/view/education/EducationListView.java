package com.smartbox.jobster.view.education;

import com.smartbox.jobster.entity.hrm.Education;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "educations", layout = MainView.class)
@ViewController("jb_Education.list")
@ViewDescriptor("education-list-view.xml")
public class EducationListView extends AbstractListView<Education> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}