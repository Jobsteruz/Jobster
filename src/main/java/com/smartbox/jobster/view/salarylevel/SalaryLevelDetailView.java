package com.smartbox.jobster.view.salarylevel;

import com.smartbox.jobster.entity.ref.SalaryLevel;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "salaryLevels/:id", layout = MainView.class)
@ViewController("jb_SalaryLevel.detail")
@ViewDescriptor("salary-level-detail-view.xml")
@EditedEntityContainer("salaryLevelDc")
@DialogMode(width = "40em", height = "AUTO")
public class SalaryLevelDetailView extends AbstractDetailView<SalaryLevel> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}