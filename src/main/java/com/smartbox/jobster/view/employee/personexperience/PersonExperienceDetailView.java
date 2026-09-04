package com.smartbox.jobster.view.employee.personexperience;

import com.smartbox.jobster.entity.core.PersonExperience;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import lombok.Getter;
import lombok.Setter;

@Route(value = "personExperiences/:id", layout = MainView.class)
@ViewController("jb_PersonExperience.detail")
@ViewDescriptor("person-experience-detail-view.xml")
@EditedEntityContainer("personExperienceDc")
@Setter
@Getter
public class PersonExperienceDetailView extends AbstractDetailView<PersonExperience> {
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