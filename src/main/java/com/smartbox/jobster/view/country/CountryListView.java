package com.smartbox.jobster.view.country;

import com.smartbox.jobster.entity.ref.Country;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "countries", layout = MainView.class)
@ViewController("jb_Country.list")
@ViewDescriptor("country-list-view.xml")
public class CountryListView extends AbstractListView<Country> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}