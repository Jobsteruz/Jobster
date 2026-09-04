package com.smartbox.jobster.view.experience;

import com.smartbox.jobster.entity.hrm.Experience;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.view.*;

@Route(value = "experiences/:id", layout = MainView.class)
@ViewController("jb_Experience.detail")
@ViewDescriptor("experience-detail-view.xml")
@EditedEntityContainer("experienceDc")
@DialogMode(width = "40em", height = "AUTO")
public class ExperienceDetailView extends AbstractDetailView<Experience> {
    @ViewComponent
    private JmixSelect<ISHGOExperience> ishgoId;


    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

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