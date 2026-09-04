package com.smartbox.jobster.view.company.sms;

import com.smartbox.jobster.entity.company.CompanySms;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "companySms/:id", layout = MainView.class)
@ViewController("jb_CompanySms.detail")
@ViewDescriptor("company-sms-detail-view.xml")
@EditedEntityContainer("companySmsDc")
@DialogMode(width = "AUTO", height = "AUTO")
public class CompanySmsDetailView extends AbstractDetailView<CompanySms> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}