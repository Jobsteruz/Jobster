package com.smartbox.jobster.view.sequence;

import com.smartbox.jobster.entity.core.Sequence;
import com.smartbox.jobster.service.EntityService;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.select.JmixSelect;
import io.jmix.flowui.view.*;
import io.jmix.multitenancy.core.TenantProvider;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "sequences/:id", layout = MainView.class)
@ViewController("jb_Sequence.detail")
@ViewDescriptor("sequence-detail-view.xml")
@EditedEntityContainer("sequenceDc")
@DialogMode(width = "32em", height = "AUTO")
public class SequenceDetailView extends AbstractDetailView<Sequence> {
    @ViewComponent
    private JmixSelect<String> domainsSelect;
    @Autowired
    private EntityService entityService;
    @Autowired
    private TenantProvider tenantProvider;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public void onInit(InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeSave(final BeforeSaveEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}