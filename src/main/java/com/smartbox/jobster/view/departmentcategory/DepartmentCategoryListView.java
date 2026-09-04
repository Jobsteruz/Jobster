package com.smartbox.jobster.view.departmentcategory;

import com.smartbox.jobster.entity.company.DepartmentCategory;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "departmentCategories", layout = MainView.class)
@ViewController("jb_DepartmentCategory.list")
@ViewDescriptor("department-category-list-view.xml")
public class DepartmentCategoryListView extends AbstractListView<DepartmentCategory> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}