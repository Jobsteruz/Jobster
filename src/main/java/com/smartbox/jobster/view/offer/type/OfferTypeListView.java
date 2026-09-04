package com.smartbox.jobster.view.offer.type;

import com.smartbox.jobster.entity.hrm.OfferType;
import com.smartbox.jobster.view.abstractview.AbstractListView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "offerTypes", layout = MainView.class)
@ViewController(id = "jb_OfferType.list")
@ViewDescriptor(path = "offer-type-list-view.xml")
public class OfferTypeListView extends AbstractListView<OfferType> {


    @Override
    public String title() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
