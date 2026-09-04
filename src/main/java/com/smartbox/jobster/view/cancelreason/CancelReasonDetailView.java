package com.smartbox.jobster.view.cancelreason;

import com.smartbox.jobster.$;
import com.smartbox.jobster.entity.ats.CancelReason;
import com.smartbox.jobster.view.abstractview.AbstractDetailView;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;

@Route(value = "cancelReasons/:id", layout = MainView.class)
@ViewController("jb_CancelReason.detail")
@ViewDescriptor("cancel-reason-detail-view.xml")
@EditedEntityContainer("cancelReasonDc")
@DialogMode(width = "40em", height = "AUTO")
public class CancelReasonDetailView extends AbstractDetailView<CancelReason> {

    @ViewComponent
    private TypedTextField<String> machineNameField;

    @Override
    public String pageTitle() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}