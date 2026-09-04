package com.smartbox.jobster.view.page;

import com.smartbox.jobster.entity.web.Page;
import com.smartbox.jobster.entity.web.Website;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.kit.action.Action;
import io.jmix.flowui.kit.component.KeyCombination;
import io.jmix.flowui.view.*;
import lombok.Setter;

@Route(value = "pages/:id", layout = MainView.class)
@ViewController("jb_Page.detail")
@ViewDescriptor("page-detail-view.xml")
@EditedEntityContainer("pageDc")
public class PageDetailView extends StandardDetailView<Page> {
    @Setter
    private Website website;

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}