package com.smartbox.jobster.view.company.sms;

import com.smartbox.jobster.entity.company.Company;
import com.smartbox.jobster.entity.company.CompanySms;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.Install;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import lombok.Setter;

@Route(value = "companySms", layout = MainView.class)
@ViewController("jb_CompanySms.list")
@ViewDescriptor("company-sms-list-view.xml")
@DialogMode(width = "48em", height = "40em", closeOnEsc = true)
public class CompanySmsListView extends AbstractListView<CompanySms> {


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
    private void entityDataGridCreateInitializer(final CompanySms companySms) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}