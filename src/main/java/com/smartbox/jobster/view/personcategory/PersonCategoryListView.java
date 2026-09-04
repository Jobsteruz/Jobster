package com.smartbox.jobster.view.personcategory;

import com.smartbox.jobster.entity.core.PersonCategory;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "person-categories", layout = MainView.class)
@ViewController(id = "jb_PersonCategory.list")
@ViewDescriptor(path = "person-category-list-view.xml")
@DialogMode(width = "64em")
public class PersonCategoryListView extends AbstractListView<PersonCategory> {


    @ViewComponent
    private MessageBundle messageBundle;


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}