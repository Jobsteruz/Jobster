package com.smartbox.jobster.view.monitoring.person.fragment;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.FileSize;
import com.smartbox.jobster.entity.hrm.Offer;
import com.smartbox.jobster.entity.hrm.OfferUser;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import io.jmix.core.Messages;
import io.jmix.flowui.download.Downloader;
import io.jmix.flowui.fragment.Fragment;
import io.jmix.flowui.fragment.FragmentDescriptor;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.Subscribe;
import io.jmix.flowui.view.ViewComponent;
import org.springframework.beans.factory.annotation.Autowired;

@FragmentDescriptor("person-offer-fragment.xml")
public class PersonOfferFragment extends Fragment<VerticalLayout> {
    private Offer offer;

    @Autowired
    private Messages messages;

    @Autowired
    private Downloader downloader;

    @ViewComponent
    private CollectionLoader<OfferUser> offerUserDl;
    @ViewComponent
    private Span offerFile;
    @ViewComponent
    private Span offerDate;
    @ViewComponent
    private Div status;
    @ViewComponent
    private Span statusDate;
    @ViewComponent
    private CollectionContainer<OfferUser> offerUserDc;
    @ViewComponent
    private VerticalLayout usersBox;

    public void setOffer(Offer offer) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe("downloadBtn")
    public void onDownloadBtnClick(final ClickEvent<Icon> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void build() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void buildUsers() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private VerticalLayout createUserBox(OfferUser user) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}