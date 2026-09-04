package com.smartbox.jobster.view.company.companyemail;

import com.smartbox.jobster.entity.company.CompanyEmail;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "company-emails/:id", layout = MainView.class)
@ViewController(id = "jb_CompanyEmail.detail")
@ViewDescriptor(path = "company-email-detail-view.xml")
@EditedEntityContainer("companyEmailDc")
public class CompanyEmailDetailView extends AbstractDetailView<CompanyEmail> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}