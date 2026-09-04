package com.smartbox.jobster.view.zpcast.salarydata;

import com.smartbox.jobster.entity.zpcast.SalaryData;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "salaryDatas/:id", layout = MainView.class)
@ViewController("jb_SalaryData.detail")
@ViewDescriptor("salary-data-detail-view.xml")
@EditedEntityContainer("salaryDataDc")
@DialogMode(width = "64em")
public class SalaryDataDetailView extends AbstractDetailView<SalaryData> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}