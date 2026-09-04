package com.smartbox.jobster.view.personcategory;

import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "person-categories/:id", layout = MainView.class)
@ViewController(id = "jb_PersonCategory.detail")
@ViewDescriptor(path = "person-category-detail-view.xml")
@EditedEntityContainer("personCategoryDc")
@DialogMode(width = "40em", height = "AUTO")
public class PersonCategoryDetailView extends AbstractDetailView<PersonCategory> {
    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}