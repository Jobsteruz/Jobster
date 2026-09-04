package com.smartbox.jobster.view.country;

import com.smartbox.jobster.entity.ref.Country;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "countries/:id", layout = MainView.class)
@ViewController("jb_Country.detail")
@ViewDescriptor("country-detail-view.xml")
@EditedEntityContainer("countryDc")
@DialogMode(width = "40em", height = "AUTO")
public class CountryDetailView extends AbstractDetailView<Country> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}