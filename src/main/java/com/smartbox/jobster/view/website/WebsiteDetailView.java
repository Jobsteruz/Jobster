package com.smartbox.jobster.view.website;

import com.smartbox.jobster.entity.web.Website;
import com.smartbox.jobster.service.CompanyService;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteParam;
import com.vaadin.flow.router.RouteParameters;
import io.jmix.flowui.ViewNavigators;
import io.jmix.flowui.kit.action.Action;
import io.jmix.flowui.kit.component.KeyCombination;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "websites/:id", layout = MainView.class)
@ViewController("jb_Website.detail")
@ViewDescriptor("website-detail-view.xml")
@EditedEntityContainer("websiteDc")
public class WebsiteDetailView extends StandardDetailView<Website> {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private ViewNavigators viewNavigators;

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "addPages", subject = "clickListener")
    public void onAddPagesClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

}