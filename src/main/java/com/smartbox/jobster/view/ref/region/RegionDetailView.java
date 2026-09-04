package com.smartbox.jobster.view.ref.region;

import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.integration.hh.HHArea;
import com.smartbox.jobster.entity.ref.Region;
import com.smartbox.jobster.service.UserService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.EntityComboBox;
import io.jmix.flowui.model.CollectionLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "regions/:id", layout = MainView.class)
@ViewController("jb_Region.detail")
@ViewDescriptor("region-detail-view.xml")
@EditedEntityContainer("regionDc")
public class RegionDetailView extends AbstractDetailView<Region> {
    @Autowired
    private UserService userService;
    @ViewComponent
    private EntityComboBox<HHArea> hhAreaField;
    @ViewComponent
    private CollectionLoader<Region> parentDl;

    @Subscribe
    public void onReady(final ReadyEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}