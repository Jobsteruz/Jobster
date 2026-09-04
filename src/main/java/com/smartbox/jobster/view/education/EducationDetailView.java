package com.smartbox.jobster.view.education;

import com.smartbox.jobster.entity.hrm.Education;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "educations/:id", layout = MainView.class)
@ViewController("jb_Education.detail")
@ViewDescriptor("education-detail-view.xml")
@EditedEntityContainer("educationDc")
@DialogMode(width = "40em", height = "AUTO")
public class EducationDetailView extends AbstractDetailView<Education> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}