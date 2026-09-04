package com.smartbox.jobster.view.employee.personeducation;

import com.smartbox.jobster.entity.core.PersonEducation;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import lombok.Getter;

@Getter
@Route(value = "personEducations/:id", layout = MainView.class)
@ViewController("jb_PersonEducation.detail")
@ViewDescriptor("person-education-detail-view.xml")
@EditedEntityContainer("personEducationDc")
public class PersonEducationDetailView extends AbstractDetailView<PersonEducation> {
    private boolean save;

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}