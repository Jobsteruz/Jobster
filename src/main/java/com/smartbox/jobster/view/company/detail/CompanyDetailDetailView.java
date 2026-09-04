package com.smartbox.jobster.view.company.detail;

import com.smartbox.jobster.entity.company.CompanyDetail;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "company-details/:id", layout = MainView.class)
@ViewController(id = "jb_CompanyDetail.detail")
@ViewDescriptor(path = "company-detail-detail-view.xml")
@EditedEntityContainer("companyDetailDc")
@DialogMode(width = "40em", height = "AUTO")
public class CompanyDetailDetailView extends AbstractDetailView<CompanyDetail> {

    @Autowired
    private DialogWindows dialogWindows;

    @Subscribe(id = "innDetailBtn", subject = "clickListener")
    public void onInnDetailBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "inn2DetailBtn", subject = "clickListener")
    public void onInn2DetailBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "inn3DetailBtn", subject = "clickListener")
    public void onInn3DetailBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private void openInnDialog(int slot) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
