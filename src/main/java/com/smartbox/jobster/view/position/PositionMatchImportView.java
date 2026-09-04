package com.smartbox.jobster.view.position;

import com.smartbox.jobster.component.ComponentUtils;
import com.smartbox.jobster.service.PartnerIntegrationService;
import com.smartbox.jobster.service.restservices.partnerintegration.DepartmentMatchResult;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import io.jmix.flowui.component.upload.JmixUpload;
import io.jmix.flowui.kit.component.button.JmixButton;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;

@ViewController("jb_PositionMatchImportView")
@ViewDescriptor("position-match-import-view.xml")
@DialogMode(modal = true, width = "30em", height = "AUTO")
public class PositionMatchImportView extends StandardView {

    @Autowired
    private PartnerIntegrationService partnerintegrationService;
    @ViewComponent
    private MessageBundle messageBundle;

    @ViewComponent
    private JmixUpload upload;

    private InputStream inputStream;

    @Subscribe
    public void onInit(final InitEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "importBtn", subject = "clickListener")
    public void onImportBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe(id = "closeBtn", subject = "clickListener")
    public void onCloseBtnClick(final ClickEvent<JmixButton> event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
