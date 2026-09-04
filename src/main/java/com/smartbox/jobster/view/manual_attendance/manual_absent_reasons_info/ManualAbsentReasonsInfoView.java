package com.smartbox.jobster.view.manual_attendance.manual_absent_reasons_info;


import com.smartbox.jobster.component.B;
import com.smartbox.jobster.component.Italic;
import com.smartbox.jobster.entity.ref.ManualAbsentReason;
import com.smartbox.jobster.view.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.model.CollectionContainer;
import io.jmix.flowui.view.*;

@Route(value = "manual-absent-reasons-info-view", layout = MainView.class)
@ViewController("jb_ManualAbsentReasonsInfoView")
@ViewDescriptor("manual-absent-reasons-info-view.xml")
public class ManualAbsentReasonsInfoView extends StandardView {

    @ViewComponent
    private VerticalLayout infoView;
    @ViewComponent
    private CollectionContainer<ManualAbsentReason> entityDc;

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    private Component getComponent(ManualAbsentReason entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}