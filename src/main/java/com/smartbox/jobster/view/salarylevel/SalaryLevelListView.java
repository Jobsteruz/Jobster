package com.smartbox.jobster.view.salarylevel;

import com.smartbox.jobster.entity.ref.SalaryLevel;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "salaryLevels", layout = MainView.class)
@ViewController("jb_SalaryLevel.list")
@ViewDescriptor("salary-level-list-view.xml")
public class SalaryLevelListView extends AbstractListView<SalaryLevel> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}