package com.smartbox.jobster.view.experience;

import com.smartbox.jobster.entity.hrm.Experience;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "experiences", layout = MainView.class)
@ViewController("jb_Experience.list")
@ViewDescriptor("experience-list-view.xml")
public class ExperienceListView extends AbstractListView<Experience> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}