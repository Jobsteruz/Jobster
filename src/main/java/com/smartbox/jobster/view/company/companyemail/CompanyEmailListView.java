package com.smartbox.jobster.view.company.companyemail;

import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanyEmail;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import lombok.Setter;


@Route(value = "company-emails", layout = MainView.class)
@ViewController(id = "jb_CompanyEmail.list")
@ViewDescriptor(path = "company-email-list-view.xml")
@LookupComponent("entityDataGrid")
@DialogMode(width = "48em", height = "40em", closeOnEsc = true)
public class CompanyEmailListView extends AbstractListView<CompanyEmail> {


    @Setter
    private Company company;

    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Install(to = "entityDataGrid.create", subject = "initializer")
    private void entityDataGridCreateInitializer(final CompanyEmail companyEmail) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}