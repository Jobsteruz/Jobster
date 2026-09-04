package com.smartbox.jobster.view.vacancy.ishgo;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.company.CompanyDetail;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import io.jmix.core.FileRef;
import io.jmix.core.FileStorage;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;

/**
 * Vakansiyani IshGO ga publish qilishda — kompaniyada bir nechta INN bo'lsa,
 * qaysi kompaniya (INN) ostida chiqarishni tanlash dialogi. Har INN logo + nom card bo'lib chiqadi.
 * Tanlangan INN {@link #getSelectedInn()} orqali qaytariladi (StandardOutcome.SELECT bilan yopiladi).
 */
@Route(value = "ishgo-select-company-view", layout = MainView.class)
@ViewController(id = "jb_IshgoSelectCompanyView")
@ViewDescriptor(path = "ishgo-select-company-view.xml")
@DialogMode(width = "30em", height = "AUTO")
public class IshgoSelectCompanyView extends StandardView {

    private CompanyDetail companyDetail;
    private String selectedInn;

    @ViewComponent
    private VerticalLayout cardsBox;
    @Autowired
    private FileStorage fileStorage;

    public void setData(CompanyDetail companyDetail) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getSelectedInn() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void addCard(String inn, String name, FileRef logo) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
