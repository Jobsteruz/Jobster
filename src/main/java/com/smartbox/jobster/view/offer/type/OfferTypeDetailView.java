package com.smartbox.jobster.view.offer.type;

import com.smartbox.jobster.entity.hrm.OfferType;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "offerTypes/:id", layout = MainView.class)
@ViewController(id = "jb_OfferType.detail")
@ViewDescriptor(path = "offer-type-detail-view.xml")
@EditedEntityContainer("offerTypeDc")
@DialogMode(width = "50em", height = "AUTO")
public class OfferTypeDetailView extends AbstractDetailView<OfferType> {

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
